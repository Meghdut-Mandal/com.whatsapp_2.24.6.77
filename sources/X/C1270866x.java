package X;

/* renamed from: X.66x  reason: invalid class name and case insensitive filesystem */
public final class C1270866x {
    public String A00;
    public final C20810yC A01;
    public final C21010yW A02;

    public final void A01(int i, int i2, int i3) {
        if (this.A01.A0E(7504)) {
            this.A00 = C36361kB.A0l();
            AnonymousClass581 r1 = new AnonymousClass581();
            r1.A04 = this.A00;
            r1.A01 = Integer.valueOf(i);
            r1.A00 = Integer.valueOf(i2);
            r1.A02 = Integer.valueOf(i3);
            r1.A03 = C36371kC.A0p();
            this.A02.Blw(r1);
        }
    }

    public final void A02(Integer num, int i, int i2) {
        if (this.A01.A0E(7504)) {
            AnonymousClass581 r1 = new AnonymousClass581();
            String str = this.A00;
            if (str != null) {
                r1.A04 = str;
            }
            r1.A03 = Integer.valueOf(i);
            r1.A02 = num;
            r1.A01 = Integer.valueOf(i2);
            this.A02.Blw(r1);
        }
    }

    public C1270866x(C20810yC r1, C21010yW r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }

    public static void A00(C1270866x r1, int i, int i2, int i3) {
        r1.A02(Integer.valueOf(i), i2, i3);
    }
}
