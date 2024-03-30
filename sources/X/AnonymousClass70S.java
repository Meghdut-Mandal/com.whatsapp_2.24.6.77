package X;

/* renamed from: X.70S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70S implements C25711Hj {
    public final /* synthetic */ C160107kT A00;
    public final /* synthetic */ AnonymousClass1ST A01;
    public final /* synthetic */ AnonymousClass68C A02;
    public final /* synthetic */ AnonymousClass2bU A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass70S(C160107kT r1, AnonymousClass1ST r2, AnonymousClass68C r3, AnonymousClass2bU r4, boolean z) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
    }

    public final void accept(Object obj) {
        AnonymousClass1ST r2 = this.A01;
        AnonymousClass2bU r4 = this.A03;
        AnonymousClass68C r5 = this.A02;
        C160107kT r6 = this.A00;
        boolean z = this.A04;
        C129166Fp r3 = (C129166Fp) obj;
        r2.A0N.A0H(r4);
        AnonymousClass1ST.A01(r3, r2, r5, r4, true);
        AnonymousClass1TS r1 = r2.A0F;
        synchronized (r1) {
            r1.remove(r4.A1J);
        }
        AnonymousClass1ST.A03(r2);
        r2.A0T.execute(new C35441ih(r2, r3, r4, r5, r6, 1, z));
    }
}
