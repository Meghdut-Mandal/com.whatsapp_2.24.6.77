package X;

/* renamed from: X.3Gx  reason: invalid class name and case insensitive filesystem */
public final class C62633Gx {
    public final C19970wo A00;
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass2dB A03;
    public final AnonymousClass2dC A04;
    public final C19600wD A05;
    public final AnonymousClass3DN A06;

    public final void A00(C51622o7 r4) {
        C74173lB r0;
        if (this.A05.A09()) {
            if (r4 == C51622o7.ACCOUNT) {
                r0 = this.A03;
            } else if (r4 == C51622o7.NEWSLETTER) {
                r0 = this.A04;
            } else {
                return;
            }
            r0.A0A();
            this.A06.A00(new AnonymousClass3MN(this, r4, 0), r4);
        }
    }

    public C62633Gx(C19600wD r2, C19970wo r3, C19420v0 r4, C20810yC r5, AnonymousClass2dB r6, AnonymousClass3DN r7, AnonymousClass2dC r8) {
        C36321k7.A11(r3, r5, r6);
        AnonymousClass00C.A0D(r4, 5);
        C36321k7.A10(r8, r2);
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A01 = r4;
        this.A04 = r8;
        this.A05 = r2;
    }
}
