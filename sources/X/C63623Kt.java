package X;

/* renamed from: X.3Kt  reason: invalid class name and case insensitive filesystem */
public final class C63623Kt {
    public C88664To A00;
    public C63023Il A01;
    public C63023Il A02;
    public boolean A03;
    public final AnonymousClass3EM A04;
    public final C592633g A05 = new C592633g(this);
    public final C35051i4 A06;
    public final C35031i2 A07;
    public final C107625Qf A08;
    public final C107635Qg A09;

    public final void A00() {
        C63023Il r0 = this.A01;
        if (r0 != null && r0.A00) {
            C107625Qf r1 = this.A08;
            r1.A04("SEE_F_ICON_DISAPPEAR");
            r1.A01();
            C63023Il r12 = this.A01;
            if (r12 == null) {
                throw C36331k8.A0d("currentShareViewState");
            }
            r12.A00 = false;
            r12.A01 = false;
            C88664To r02 = this.A00;
            if (r02 != null) {
                r02.BgY(r12);
            }
        }
    }

    public final void A01() {
        if (this.A01 == null) {
            this.A01 = new C63023Il(false, false);
        }
        if (this.A02 == null) {
            this.A02 = new C63023Il(false, false);
        }
        if (!this.A03) {
            this.A03 = true;
            this.A07.registerObserver(this.A05);
        }
    }

    public final void A02(boolean z) {
        C63023Il r1 = this.A02;
        if (r1 != null && r1.A00) {
            r1.A00 = false;
            r1.A01 = z;
            C88664To r0 = this.A00;
            if (r0 != null) {
                r0.Bjz(r1);
            }
        }
    }

    public C63623Kt(AnonymousClass3EM r2, C35051i4 r3, C35031i2 r4, C107625Qf r5, C107635Qg r6) {
        C36321k7.A1B(r3, r4, r2, r5, r6);
        this.A06 = r3;
        this.A07 = r4;
        this.A04 = r2;
        this.A08 = r5;
        this.A09 = r6;
    }
}
