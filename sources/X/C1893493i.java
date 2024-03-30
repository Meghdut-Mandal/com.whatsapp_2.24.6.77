package X;

import android.util.Log;
import java.util.UUID;

/* renamed from: X.93i  reason: invalid class name and case insensitive filesystem */
public abstract class C1893493i {
    public static C192899Iz A00(byte[] bArr) {
        C202309lW r7 = new C202309lW(bArr);
        if (r7.A00 >= 32 && C202309lW.A02(r7, 0) == (r7.A00 - r7.A01) + 4 && r7.A03() == 1886614376) {
            int A03 = (r7.A03() >> 24) & 255;
            if (A03 > 1) {
                Log.w("PsshAtomUtil", AnonymousClass000.A0r("Unsupported pssh version: ", AnonymousClass000.A0u(), A03));
            } else {
                UUID uuid = new UUID(r7.A08(), r7.A08());
                if (A03 == 1) {
                    r7.A0J(r7.A05() * 16);
                }
                int A05 = r7.A05();
                if (A05 == r7.A00 - r7.A01) {
                    byte[] bArr2 = new byte[A05];
                    r7.A0K(bArr2, 0, A05);
                    return new C192899Iz(uuid, bArr2, A03);
                }
            }
        }
        return null;
    }
}
