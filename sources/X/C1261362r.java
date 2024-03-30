package X;

/* renamed from: X.62r  reason: invalid class name and case insensitive filesystem */
public final class C1261362r {
    public String A00;
    public final C19970wo A01;
    public final C21010yW A02;

    public final void A00(int i, int i2, int i3) {
        int i4;
        int i5;
        AnonymousClass588 r5 = new AnonymousClass588();
        r5.A05 = this.A00;
        r5.A04 = Long.valueOf(C19970wo.A00(this.A01));
        if (i == 0) {
            i4 = 1;
        } else if (i == 1) {
            i4 = 2;
        } else if (i != 2) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        r5.A01 = i4;
        if (i2 == 0) {
            i5 = 1;
        } else if (i2 == 1) {
            i5 = 2;
        } else if (i2 != 2) {
            i5 = 4;
        } else {
            i5 = 3;
        }
        r5.A00 = i5;
        r5.A02 = Integer.valueOf(i3);
        this.A02.Bly(r5);
    }

    public C1261362r(C19970wo r1, C21010yW r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }
}
