package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.9lp  reason: invalid class name and case insensitive filesystem */
public abstract class C202439lp {
    public static final C21795AaS A00 = new C21795AaS();

    public static String A00(byte[] bArr, int i) {
        return AnonymousClass11q.A02(A03(bArr, 0, i));
    }

    public static byte[] A02(String str, int i) {
        try {
            return A00.A00(str, 1, i);
        } catch (Exception e) {
            throw new AnonymousClass92O(C36331k8.A0i("exception decoding Hex string: ", AnonymousClass000.A0u(), e), e);
        }
    }

    public static byte[] A01(String str) {
        try {
            return A00.A00(str, 0, str.length());
        } catch (Exception e) {
            throw new AnonymousClass92O(C36331k8.A0i("exception decoding Hex string: ", AnonymousClass000.A0u(), e), e);
        }
    }

    public static byte[] A03(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        try {
            A00.B6S(A0Q, bArr, i, i2);
            return A0Q.toByteArray();
        } catch (Exception e) {
            throw new AnonymousClass92P(C36331k8.A0i("exception encoding Hex string: ", AnonymousClass000.A0u(), e), e);
        }
    }
}
