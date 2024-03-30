package X;

/* renamed from: X.3ve  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80593ve implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1NW A02;
    public final /* synthetic */ AnonymousClass11F A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C80593ve(AnonymousClass1NW r1, AnonymousClass11F r2, String str, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        AnonymousClass1NW r2 = this.A02;
        AnonymousClass11F r7 = this.A03;
        String str = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        C45552Ru r1 = new C45552Ru();
        if (r7 != null) {
            r1.A07 = r2.A03.A03(r7.getRawString());
            if (r7 instanceof AnonymousClass147) {
                r1.A04 = C36441kJ.A0y(AnonymousClass3UK.A03(r2.A01.A0A((AnonymousClass144) r7)));
            }
            r1.A03 = Integer.valueOf(r2.A04.A02(r7));
        }
        r1.A05 = C36431kI.A1E(r2.A00.A00);
        r1.A06 = str;
        r1.A02 = C36401kF.A0j();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r2.A02.Bly(r1);
    }
}
