package X;

import android.util.Base64;

/* renamed from: X.5Zj  reason: invalid class name and case insensitive filesystem */
public abstract class C109855Zj {
    public static String A00(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AesKey=");
        A0u.append(Base64.encodeToString(bArr2, 2));
        A0u.append(";IV=");
        A0u.append(Base64.encodeToString(bArr3, 2));
        A0u.append(";Data=");
        return AnonymousClass000.A0q(Base64.encodeToString(bArr, 2), A0u);
    }
}
