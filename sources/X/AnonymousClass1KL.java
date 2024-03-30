package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.1KL  reason: invalid class name */
public final class AnonymousClass1KL {
    public final C20810yC A00;
    public final C21100yf A01;

    public AnonymousClass1KL(C21100yf r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final int A00() {
        int A002 = C20800yB.A00(C21000yV.A02, this.A00, 471);
        if (A002 <= 0) {
            A002 = this.A01.A04(C21100yf.A1y);
        }
        return A002 & 12284;
    }

    public final boolean A01() {
        if (!C20800yB.A01(C21000yV.A02, this.A00, 3214) || (A00() & DefaultCrypto.BUFFER_SIZE) <= 0) {
            return false;
        }
        return true;
    }
}
