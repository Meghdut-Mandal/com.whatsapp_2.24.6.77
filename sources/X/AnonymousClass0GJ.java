package X;

/* renamed from: X.0GJ  reason: invalid class name */
public abstract class AnonymousClass0GJ extends AnonymousClass0GK {
    public AnonymousClass0BH A00 = null;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public AnonymousClass0B1 A09 = new AnonymousClass0B1();
    public boolean A0A = false;

    public void A0K(C02500Aq r4, Integer num, Integer num2, int i, int i2) {
        AnonymousClass0BH r2;
        C02500Aq r0;
        while (true) {
            r2 = this.A00;
            if (r2 != null || (r0 = this.A0Z) == null) {
                AnonymousClass0B1 r1 = this.A09;
                r1.A05 = num;
                r1.A06 = num2;
                r1.A00 = i;
                r1.A04 = i2;
                r2.BPg(r4, r1);
                r4.A09(r1.A03);
                r4.A08(r1.A02);
                r4.A0h = r1.A07;
                int i3 = r1.A01;
                r4.A07 = i3;
                r4.A0h = AnonymousClass000.A1R(i3);
            } else {
                this.A00 = ((C02520As) r0).A05;
            }
        }
        AnonymousClass0B1 r12 = this.A09;
        r12.A05 = num;
        r12.A06 = num2;
        r12.A00 = i;
        r12.A04 = i2;
        r2.BPg(r4, r12);
        r4.A09(r12.A03);
        r4.A08(r12.A02);
        r4.A0h = r12.A07;
        int i32 = r12.A01;
        r4.A07 = i32;
        r4.A0h = AnonymousClass000.A1R(i32);
    }
}
