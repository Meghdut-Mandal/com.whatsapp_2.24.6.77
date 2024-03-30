package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.61C  reason: invalid class name */
public class AnonymousClass61C {
    public final AnonymousClass1AL[] A00;

    public String A00() {
        if (r6 <= 0) {
            return null;
        }
        try {
            MessageDigest A0s = C90504aG.A0s();
            StringBuilder A0u = AnonymousClass000.A0u();
            for (AnonymousClass1AL r1 : this.A00) {
                A0u.append(r1.A02);
                A0u.append(r1.A03);
            }
            return Base64.encodeToString(A0s.digest(A0u.toString().trim().getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public AnonymousClass61C(AnonymousClass1AL[] r1) {
        this.A00 = r1;
    }
}
