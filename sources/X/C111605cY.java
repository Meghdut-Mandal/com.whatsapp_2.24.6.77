package X;

import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* renamed from: X.5cY  reason: invalid class name and case insensitive filesystem */
public abstract class C111605cY {
    public static SSLContext A00() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            C36351kA.A1P(" algorithm not available for SSLContext: ", AnonymousClass000.A0v("TLS"), e);
            throw AnonymousClass001.A0B(e);
        }
    }
}
