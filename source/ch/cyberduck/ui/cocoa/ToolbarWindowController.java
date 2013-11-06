package ch.cyberduck.ui.cocoa;

/*
 * Copyright (c) 2002-2010 David Kocher. All rights reserved.
 *
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Preferences;
import ch.cyberduck.ui.cocoa.application.NSImage;
import ch.cyberduck.ui.cocoa.application.NSTabView;
import ch.cyberduck.ui.cocoa.application.NSTabViewItem;
import ch.cyberduck.ui.cocoa.application.NSToolbar;
import ch.cyberduck.ui.cocoa.application.NSToolbarItem;
import ch.cyberduck.ui.cocoa.application.NSView;
import ch.cyberduck.ui.cocoa.application.NSWindow;
import ch.cyberduck.ui.cocoa.foundation.FoundationKitFunctionsLibrary;
import ch.cyberduck.ui.cocoa.foundation.NSArray;
import ch.cyberduck.ui.cocoa.foundation.NSEnumerator;
import ch.cyberduck.ui.cocoa.foundation.NSNotification;
import ch.cyberduck.ui.cocoa.foundation.NSObject;
import ch.cyberduck.ui.resources.IconCacheFactory;

import org.apache.log4j.Logger;
import org.rococoa.Foundation;
import org.rococoa.Rococoa;
import org.rococoa.cocoa.foundation.NSPoint;
import org.rococoa.cocoa.foundation.NSRect;
import org.rococoa.cocoa.foundation.NSSize;
import org.rococoa.cocoa.foundation.NSUInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * A window controller with a toolbar populated from a tabbed view.
 *
 * @version $Id$
 */
public abstract class ToolbarWindowController extends WindowController implements NSToolbar.Delegate, NSTabView.Delegate {
    private static Logger log = Logger.getLogger(ToolbarWindowController.class);

    protected NSTabView tabView;

    @Override
    public void windowDidBecomeKey(NSNotification notification) {
        this.resize();
        super.windowDidBecomeKey(notification);
    }

    /**
     * @return Content for the tabs.
     * @see #getPanelIdentifiers()
     */
    protected abstract List<NSView> getPanels();

    /**
     * @return String constants for tabs and toolbar items.
     * @see #getPanels()
     */
    protected abstract List<String> getPanelIdentifiers();

    private NSToolbar toolbar;

    private List<NSTabViewItem> tabs
            = new ArrayList<NSTabViewItem>();

    @Override
    public void awakeFromNib() {
        // Insert all panels into tab view
        Iterator<String> identifiers = this.getPanelIdentifiers().iterator();
        for(NSView panel : this.getPanels()) {
            int i = tabView.indexOfTabViewItemWithIdentifier(identifiers.next());
            tabView.tabViewItemAtIndex(i).setView(panel);
        }

        // Create toolbar item for every tab view
        toolbar = NSToolbar.toolbarWithIdentifier(this.getToolbarName());
        // Set up toolbar properties: Allow customization, give a default display mode, and remember state in user defaults
        toolbar.setAllowsUserCustomization(false);
        toolbar.setSizeMode(this.getToolbarSize());
        toolbar.setDisplayMode(this.getToolbarMode());
        toolbar.setDelegate(this.id());
        window.setToolbar(toolbar);

        // Change selection to last selected item in preferences
        this.setSelectedTab(Preferences.instance().getInteger(this.getToolbarName() + ".selected"));
        this.setTitle(this.getTitle(tabView.selectedTabViewItem()));

        super.awakeFromNib();
    }

    /**
     * Change the toolbar selection and display the tab index.
     *
     * @param tab The index of the tab to be selected
     */
    protected void setSelectedTab(int tab) {
        if(-1 == tab) {
            tab = 0;
        }
        tabView.selectTabViewItemAtIndex(tab);
        NSTabViewItem page = tabView.selectedTabViewItem();
        if(page == null) {
            page = tabView.tabViewItemAtIndex(0);
        }
        toolbar.setSelectedItemIdentifier(page.identifier());
    }

    /**
     * @return The item identifier of the tab selected.
     */
    protected String getSelectedTab() {
        return toolbar.selectedItemIdentifier();
    }

    @Override
    protected void invalidate() {
        toolbar.setDelegate(null);
        tabView.setDelegate(null);
        super.invalidate();
    }

    private String windowTitle;

    @Override
    public void setWindow(NSWindow window) {
        windowTitle = window.title();
        window.setShowsToolbarButton(false);
        super.setWindow(window);
    }

    protected NSUInteger getToolbarSize() {
        return NSToolbar.NSToolbarSizeModeRegular;
    }

    protected NSUInteger getToolbarMode() {
        return NSToolbar.NSToolbarDisplayModeIconAndLabel;
    }

    public void setTabView(NSTabView tabView) {
        this.tabView = tabView;
        this.tabView.setAutoresizingMask(new NSUInteger(NSView.NSViewWidthSizable | NSView.NSViewHeightSizable));
        this.tabView.setDelegate(this.id());
    }

    private String getToolbarName() {
        return String.format("%s.toolbar", this.getBundleName().toLowerCase(Locale.ROOT));
    }

    /**
     * Keep reference to weak toolbar items. A toolbar may ask again for a kind of toolbar
     * item already supplied to it, in which case this method may return the same toolbar
     * item it returned before
     */
    private Map<String, NSToolbarItem> cache
            = new HashMap<String, NSToolbarItem>();

    @Override
    public NSToolbarItem toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar(final NSToolbar toolbar,
                                                                                 final String itemIdentifier,
                                                                                 final boolean flag) {
        if(!cache.containsKey(itemIdentifier)) {
            cache.put(itemIdentifier, NSToolbarItem.itemWithIdentifier(itemIdentifier));
        }
        final NSToolbarItem toolbarItem = cache.get(itemIdentifier);
        final NSTabViewItem tab = tabView.tabViewItemAtIndex(tabView.indexOfTabViewItemWithIdentifier(itemIdentifier));
        if(null == tab) {
            log.warn(String.format("No tab for toolbar item %s", itemIdentifier));
            return null;
        }
        toolbarItem.setLabel(tab.label());
        toolbarItem.setPaletteLabel(tab.label());
        toolbarItem.setToolTip(tab.label());
        toolbarItem.setImage(IconCacheFactory.<NSImage>get().iconNamed(itemIdentifier, 32));
        toolbarItem.setTarget(this.id());
        toolbarItem.setAction(Foundation.selector("select:"));

        return toolbarItem;
    }

    @Override
    public NSArray toolbarAllowedItemIdentifiers(final NSToolbar toolbar) {
        List<String> identifiers = this.getPanelIdentifiers();
        return NSArray.arrayWithObjects(identifiers.toArray(new String[identifiers.size()]));
    }

    @Override
    public NSArray toolbarDefaultItemIdentifiers(final NSToolbar toolbar) {
        return this.toolbarAllowedItemIdentifiers(toolbar);
    }

    @Override
    public NSArray toolbarSelectableItemIdentifiers(final NSToolbar toolbar) {
        return this.toolbarAllowedItemIdentifiers(toolbar);
    }

    @Override
    public boolean validateToolbarItem(final NSToolbarItem item) {
        return this.validateTabWithIdentifier(item.itemIdentifier());
    }

    protected boolean validateTabWithIdentifier(final String itemIdentifier) {
        return true;
    }

    protected String getTitle(final NSTabViewItem item) {
        return item.label();
    }

    public void select(final NSToolbarItem sender) {
        this.setSelectedTab(tabView.indexOfTabViewItemWithIdentifier(sender.itemIdentifier()));
    }

    /**
     * Resize window frame to fit the content view of the currently selected tab.
     */
    private void resize() {
        final NSRect windowFrame = NSWindow.contentRectForFrameRect_styleMask(window.frame(), window.styleMask());
        final double height = this.getMinWindowHeight();
        final NSRect frameRect = new NSRect(
                new NSPoint(windowFrame.origin.x.doubleValue(), windowFrame.origin.y.doubleValue() + windowFrame.size.height.doubleValue() - height),
                new NSSize(windowFrame.size.width.doubleValue(), height)
        );
        window.setFrame_display_animate(NSWindow.frameRectForContentRect_styleMask(frameRect, window.styleMask()),
                true, window.isVisible());
    }

    public NSSize windowWillResize_toSize(NSWindow window, NSSize newSize) {
        // Only allow horizontal sizing
        return new NSSize(newSize.width.doubleValue(), window.frame().size.height.doubleValue());
    }

    private double toolbarHeightForWindow(NSWindow window) {
        NSRect windowFrame = NSWindow.contentRectForFrameRect_styleMask(window.frame(), window.styleMask());
        return windowFrame.size.height.doubleValue() - window.contentView().frame().size.height.doubleValue();
    }

    @Override
    public void tabView_didSelectTabViewItem(NSTabView view, NSTabViewItem item) {
        this.setTitle(this.getTitle(item));
        this.resize();
        Preferences.instance().setProperty(String.format("%s.selected", this.getToolbarName()), view.indexOfTabViewItem(item));
    }

    protected void setTitle(final String title) {
        window.setTitle(String.format("%s – %s", windowTitle, title));
    }

    protected double getMinWindowHeight() {
        NSRect contentRect = this.getContentRect();
        //Border top + toolbar
        return contentRect.size.height.doubleValue()
                + 40 + this.toolbarHeightForWindow(window);
    }

    protected double getMinWindowWidth() {
        NSRect contentRect = this.getContentRect();
        return contentRect.size.width.doubleValue();
    }

    /**
     * @return Minimum size to fit content view of currently selected tab.
     */
    private NSRect getContentRect() {
        NSRect contentRect = new NSRect(0, 0);
        final NSView view = tabView.selectedTabViewItem().view();
        final NSEnumerator enumerator = view.subviews().objectEnumerator();
        NSObject next;
        while(null != (next = enumerator.nextObject())) {
            final NSView subview = Rococoa.cast(next, NSView.class);
            contentRect = FoundationKitFunctionsLibrary.NSUnionRect(contentRect, subview.frame());
        }
        return contentRect;
    }
}
