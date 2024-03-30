package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.9Fv  reason: invalid class name and case insensitive filesystem */
public class C192139Fv {
    public SecureRandom A00;

    public C192139Fv() {
        try {
            this.A00 = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            throw C165567td.A0E("SHA1PRNGalgorithm not found.", (byte) 80);
        }
    }
}
