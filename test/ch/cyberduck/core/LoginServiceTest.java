package ch.cyberduck.core;

import ch.cyberduck.core.ftp.FTPSession;
import ch.cyberduck.core.threading.BackgroundException;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.*;

/**
 * @version $Id$
 */
public class LoginServiceTest extends AbstractTestCase {

    @Test(expected = LoginCanceledException.class)
    public void testCancel() throws Exception {
        LoginService l = new LoginService(new DisabledLoginController());
        l.login(new NullSession(new Host(Protocol.FTP, "h")));
    }

    @Test(expected = LoginCanceledException.class)
    public void testConnectionWarning() throws Exception {
        final Host host = new Host(Protocol.FTP, "test.cyberduck.ch", new Credentials(
                "u", "p"
        ));
        final AtomicBoolean warned = new AtomicBoolean(false);
        final FTPSession session = new FTPSession(host) {
            @Override
            protected void warn(final LoginController login) throws BackgroundException {
                warned.set(true);
                throw new LoginCanceledException();
            }
        };
        session.open();
        LoginService l = new LoginService(new DisabledLoginController());
        try {
            l.login(session);
            fail();
        }
        catch(LoginCanceledException e) {
            assertEquals("Unknown", e.getMessage());
        }
        assertTrue(warned.get());
    }
}
