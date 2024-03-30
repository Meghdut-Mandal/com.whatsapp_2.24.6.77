package X;

/* renamed from: X.1El  reason: invalid class name and case insensitive filesystem */
public final class C24961El {
    public final C25041Et A00;
    public final C20810yC A01;
    public final C19730wQ A02;
    public final C19970wo A03;
    public final C25031Es A04;

    public C24961El(C19730wQ r2, C19970wo r3, C25041Et r4, C20810yC r5, C25031Es r6) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A03 = r3;
        this.A01 = r5;
        this.A02 = r2;
        this.A04 = r6;
        this.A00 = r4;
    }

    public C181148n0 A00(AnonymousClass9VC r8, AnonymousClass11F r9, AnonymousClass3T1 r10) {
        boolean z = true;
        AnonymousClass00C.A0D(r9, 1);
        if (r8.A00 != 1) {
            z = false;
        }
        C181148n0 r5 = null;
        if (z) {
            if (C20800yB.A01(C21000yV.A02, this.A01, 4873)) {
                if (this.A00.A00(r9) < 0) {
                    r5 = A01(r9, false);
                }
                r10.A0j(8388608);
            }
        }
        return r5;
    }

    public C181148n0 A01(AnonymousClass11F r6, boolean z) {
        AnonymousClass00C.A0D(r6, 0);
        C19970wo r2 = this.A03;
        C64933Qa r4 = new C64933Qa(r6, C237919w.A00(this.A02, r2), true);
        long A002 = C19970wo.A00(r2);
        int i = 147;
        if (z) {
            i = 155;
        }
        return new C181148n0(r4, i, A002);
    }

    public boolean A02() {
        C20810yC r1 = this.A01;
        C21000yV r3 = C21000yV.A02;
        if (!C20800yB.A01(r3, r1, 4873)) {
            return false;
        }
        C25031Es r2 = this.A04;
        if (!C20800yB.A01(r3, r2.A01, 5747) || AnonymousClass00C.A0J(r2.A01(), "yes")) {
            return true;
        }
        return false;
    }
}
