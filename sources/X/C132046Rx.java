package X;

import java.security.SecureRandom;

/* renamed from: X.6Rx  reason: invalid class name and case insensitive filesystem */
public class C132046Rx {
    public final long A00;
    public final byte[] A01;

    public static C132046Rx A00(C65013Qj r6, long j) {
        byte[] bArr = r6.A0a;
        long j2 = r6.A0D;
        if (bArr == null) {
            return null;
        }
        if (j2 <= 0) {
            j2 = j;
        }
        return new C132046Rx(bArr, j2);
    }

    public static boolean A01(C132046Rx r4, long j) {
        return C36431kI.A1P(((j - r4.A00) > (((long) new SecureRandom().nextInt(86400000)) + 172800000) ? 1 : ((j - r4.A00) == (((long) new SecureRandom().nextInt(86400000)) + 172800000) ? 0 : -1)));
    }

    public C132046Rx(byte[] bArr, long j) {
        C18740tg.A0C(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        this.A01 = bArr;
        this.A00 = j;
    }
}
