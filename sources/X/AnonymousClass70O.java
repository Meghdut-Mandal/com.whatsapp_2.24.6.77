package X;

/* renamed from: X.70O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70O implements C25711Hj {
    public final /* synthetic */ AnonymousClass1ST A00;
    public final /* synthetic */ AnonymousClass68C A01;
    public final /* synthetic */ AnonymousClass2bU A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass70O(AnonymousClass1ST r1, AnonymousClass68C r2, AnonymousClass2bU r3, boolean z) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = z;
    }

    public final void accept(Object obj) {
        AnonymousClass1ST r2 = this.A00;
        AnonymousClass2bU r4 = this.A02;
        AnonymousClass68C r5 = this.A01;
        boolean z = this.A03;
        C129166Fp r3 = (C129166Fp) obj;
        r2.A0N.A0H(r4);
        AnonymousClass1ST.A01(r3, r2, r5, r4, false);
        AnonymousClass1TS r1 = r2.A0F;
        synchronized (r1) {
            r1.remove(r4.A1J);
        }
        AnonymousClass1ST.A03(r2);
        r2.A0T.execute(new C35411ie(r2, r3, r4, r5, 2, z));
    }
}
