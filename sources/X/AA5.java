package X;

public final class AA5 implements C30631aW {
    public final AnonymousClass1TC A00;
    public final C21010yW A01;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        AnonymousClass1TC r3 = this.A00;
        long A012 = r3.A01("kic_notifications");
        long A013 = r3.A01("kic_group_notifications");
        if (A012 + A013 > 0) {
            C176318bv r2 = new C176318bv();
            r2.A03 = Long.valueOf(A012);
            r2.A02 = Long.valueOf(r3.A01("kic_notification_taps"));
            r2.A01 = Long.valueOf(A013);
            r2.A00 = Long.valueOf(r3.A01("kic_group_notification_taps"));
            this.A01.Blv(r2);
        }
        C90504aG.A12(AnonymousClass1TC.A00(r3));
    }

    public AA5(AnonymousClass1TC r1, C21010yW r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
