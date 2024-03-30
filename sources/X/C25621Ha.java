package X;

/* renamed from: X.1Ha  reason: invalid class name and case insensitive filesystem */
public final class C25621Ha {
    public final AnonymousClass1HY A00;
    public final C24981En A01;
    public final AnonymousClass00T A02 = new AnonymousClass00U(new C25631Hb(this));
    public final AnonymousClass00T A03 = new AnonymousClass00U(new C25641Hc(this));
    public final AnonymousClass00T A04 = new AnonymousClass00U(new C25651Hd(this));
    public final C24991Eo A05;
    public final C25001Ep A06;

    public C25621Ha(AnonymousClass1HY r3, C24991Eo r4, C25001Ep r5, C24981En r6) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
        this.A01 = r6;
        this.A05 = r4;
        this.A06 = r5;
    }

    public final void A01(C51412nm r4) {
        long j;
        AnonymousClass00C.A0D(r4, 0);
        int ordinal = r4.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 && A03() && ((C63473Ke) this.A04.getValue()).A01() != C188328zP.ACCEPTED) {
                    j = 20240216;
                } else {
                    return;
                }
            } else if (A03() && ((C63473Ke) this.A02.getValue()).A01() != C188328zP.ACCEPTED) {
                j = 20230901;
            } else {
                return;
            }
        } else if (A03() && !A02()) {
            j = 20230902;
        } else {
            return;
        }
        A00((C22923AyZ) null, this, j);
    }

    public final boolean A04(C51412nm r4) {
        AnonymousClass00T r0;
        AnonymousClass00C.A0D(r4, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            return A02();
        }
        if (ordinal == 1) {
            r0 = this.A02;
        } else if (ordinal == 2) {
            r0 = this.A04;
        } else {
            throw new C13180jS();
        }
        if (((C63473Ke) r0.getValue()).A01() == C188328zP.ACCEPTED) {
            return true;
        }
        return false;
    }

    public static final void A00(C22923AyZ ayZ, C25621Ha r3, long j) {
        r3.A05.A00(new C21119A9e(ayZ, r3, j), j);
    }

    public final boolean A02() {
        if (((C63473Ke) this.A03.getValue()).A01() == C188328zP.ACCEPTED) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        Object A012 = ((C63473Ke) this.A02.getValue()).A01();
        C188328zP r2 = C188328zP.ACCEPTED;
        if (A012 == r2 || A02() || ((C63473Ke) this.A04.getValue()).A01() == r2) {
            return true;
        }
        return false;
    }
}
