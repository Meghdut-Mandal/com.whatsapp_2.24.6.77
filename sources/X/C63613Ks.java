package X;

/* renamed from: X.3Ks  reason: invalid class name and case insensitive filesystem */
public final class C63613Ks {
    public Boolean A00;
    public Long A01;
    public String A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public final int A06;
    public final int A07;
    public final /* synthetic */ AnonymousClass3O7 A08;

    public C63613Ks(AnonymousClass3O7 r1, int i, int i2) {
        this.A08 = r1;
        this.A07 = i;
        this.A06 = i2;
    }

    public final AnonymousClass2S8 A00() {
        AnonymousClass2S8 r1 = new AnonymousClass2S8();
        r1.A07 = C36431kI.A1E(this.A08.A02.A00);
        r1.A04 = Integer.valueOf(this.A07);
        r1.A02 = Integer.valueOf(this.A06);
        r1.A08 = this.A02;
        r1.A03 = this.A04;
        r1.A05 = this.A05;
        r1.A01 = this.A03;
        r1.A06 = this.A01;
        r1.A00 = this.A00;
        return r1;
    }

    public final void A01(AnonymousClass11F r2) {
        this.A04 = Integer.valueOf(this.A08.A06.A02(r2));
    }

    public final void A03(AnonymousClass3T1 r4) {
        AnonymousClass3O7 r0 = this.A08;
        this.A03 = Integer.valueOf(C55802vD.A00(r0.A03, r4, r0.A04, r0.A05));
    }

    public final void A02(AnonymousClass11F r3) {
        AnonymousClass147 A012 = C65533Sl.A01(r3);
        if (A012 != null) {
            this.A05 = Integer.valueOf(AnonymousClass000.A1P(this.A08.A07.A01.A0D(A012) ? 1 : 0) ? 1 : 0);
        }
    }
}
