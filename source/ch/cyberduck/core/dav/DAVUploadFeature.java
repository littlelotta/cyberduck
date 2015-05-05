package ch.cyberduck.core.dav;

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

import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.http.AbstractHttpWriteFeature;
import ch.cyberduck.core.http.HttpUploadFeature;
import ch.cyberduck.core.io.Checksum;
import ch.cyberduck.core.preferences.PreferencesFactory;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @version $Id$
 */
public class DAVUploadFeature extends HttpUploadFeature<String, MessageDigest> {
    private static final Logger log = Logger.getLogger(DAVUploadFeature.class);

    private boolean checksum;

    public DAVUploadFeature(final DAVSession session) {
        super(new DAVWriteFeature(session));
        this.checksum = PreferencesFactory.get().getBoolean("webdav.upload.checksum");
    }

    public DAVUploadFeature(final AbstractHttpWriteFeature<String> writer) {
        super(writer);
        this.checksum = PreferencesFactory.get().getBoolean("webdav.upload.checksum");
    }

    public DAVUploadFeature(final AbstractHttpWriteFeature<String> writer, final boolean checksum) {
        super(writer);
        this.checksum = checksum;
    }

    @Override
    protected InputStream decorate(final InputStream in, final MessageDigest digest) throws IOException {
        if(null == digest) {
            log.warn("MD5 calculation disabled");
            return super.decorate(in, null);
        }
        else {
            return new DigestInputStream(super.decorate(in, digest), digest);
        }
    }

    @Override
    protected MessageDigest digest() throws IOException {
        MessageDigest digest = null;
        if(checksum) {
            try {
                digest = MessageDigest.getInstance("MD5");
            }
            catch(NoSuchAlgorithmException e) {
                throw new IOException(e.getMessage(), e);
            }
        }
        return digest;
    }

    @Override
    protected void post(final Path file, final MessageDigest digest, final String etag) throws BackgroundException {
        this.verify(file, digest, Checksum.parse(etag));
    }
}
