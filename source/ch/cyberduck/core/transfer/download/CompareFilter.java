package ch.cyberduck.core.transfer.download;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
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
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.Cache;
import ch.cyberduck.core.Local;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.Preferences;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.synchronization.Comparison;
import ch.cyberduck.core.synchronization.ComparisonServiceFilter;
import ch.cyberduck.core.transfer.TransferStatus;
import ch.cyberduck.core.transfer.symlink.SymlinkResolver;

import org.apache.log4j.Logger;

/**
 * @version $Id$
 */
public class CompareFilter extends AbstractDownloadFilter {
    private static final Logger log = Logger.getLogger(CompareFilter.class);

    private ComparisonServiceFilter comparisonService;

    protected Cache cache
            = new Cache(Preferences.instance().getInteger("transfer.cache.size"));

    public CompareFilter(final SymlinkResolver<Path> symlinkResolver, final Session<?> session) {
        super(symlinkResolver, session, new DownloadFilterOptions());
        this.comparisonService = new ComparisonServiceFilter(session, session.getHost().getTimezone());
    }

    public CompareFilter(final SymlinkResolver<Path> symlinkResolver, final Session<?> session,
                         final DownloadFilterOptions options,
                         final ComparisonServiceFilter comparisonService) {
        super(symlinkResolver, session, options);
        this.comparisonService = comparisonService;
    }

    @Override
    public AbstractDownloadFilter withCache(final Cache cache) {
        comparisonService.withCache(cache);
        return super.withCache(cache);
    }

    @Override
    public boolean accept(final Path file, final Local local, final TransferStatus parent) throws BackgroundException {
        if(super.accept(file, local, parent)) {
            final Comparison comparison = comparisonService.compare(file, local);
            switch(comparison) {
                case local:
                case equal:
                    if(log.isInfoEnabled()) {
                        log.info(String.format("Skip file %s with comparison %s", file, comparison));
                    }
                    return false;
                case remote:
                    return true;
            }
            log.warn(String.format("Invalid comparison result %s", comparison));
        }
        return false;
    }
}
