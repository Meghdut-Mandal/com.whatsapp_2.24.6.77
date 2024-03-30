package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9kh  reason: invalid class name and case insensitive filesystem */
public final class C201909kh {
    public static long A00;
    public static C200069gY A01;
    public static final C201909kh A02 = new C201909kh();

    public static final void A01(C200069gY r7) {
        if (r7.A02 != null || r7.A03 != null) {
            throw AnonymousClass001.A08("Failed requirement.");
        } else if (!r7.A05) {
            synchronized (A02) {
                long j = A00 + ((long) DefaultCrypto.BUFFER_SIZE);
                if (j <= 65536) {
                    A00 = j;
                    r7.A02 = A01;
                    r7.A00 = 0;
                    r7.A01 = 0;
                    A01 = r7;
                }
            }
        }
    }

    public static final C200069gY A00() {
        synchronized (A02) {
            C200069gY r4 = A01;
            if (r4 == null) {
                return new C200069gY();
            }
            A01 = r4.A02;
            r4.A02 = null;
            A00 -= (long) DefaultCrypto.BUFFER_SIZE;
            return r4;
        }
    }
}
