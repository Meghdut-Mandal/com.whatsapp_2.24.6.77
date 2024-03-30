package X;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: X.0Vp  reason: invalid class name and case insensitive filesystem */
public abstract class C06920Vp {
    public static final SecureRandom A00 = new SecureRandom();

    public static String A00() {
        byte[] bArr = new byte[16];
        A00.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
