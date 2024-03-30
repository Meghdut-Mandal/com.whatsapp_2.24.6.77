package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.9af  reason: invalid class name and case insensitive filesystem */
public abstract class C196869af {
    public static final B22 A00 = new C21796AaT();

    public static byte[] A00(byte[] bArr) {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            A00.B6S(byteArrayOutputStream, bArr, 0, length);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new AnonymousClass92P(C36331k8.A0i("exception encoding base64 string: ", AnonymousClass000.A0u(), e), e);
        }
    }
}
