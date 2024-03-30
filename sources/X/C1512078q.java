package X;

import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: X.78q  reason: invalid class name and case insensitive filesystem */
public final class C1512078q extends DigestOutputStream {
    public boolean A00;

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            super.close();
        }
    }

    public C1512078q(OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
    }
}
