package X;

import java.security.PublicKey;

/* renamed from: X.6HB  reason: invalid class name */
public abstract class AnonymousClass6HB {
    public static String A00(PublicKey publicKey) {
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = C90504aG.A0o(C90504aG.A0s().digest(publicKey.getEncoded()));
        return String.format("fp:%s", A0L);
    }
}
