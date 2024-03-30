package X;

/* renamed from: X.1c9  reason: invalid class name and case insensitive filesystem */
public final class C31641c9 {
    public long A00;
    public boolean A01;
    public final C31621c7 A02;
    public final C19970wo A03;
    public final C21010yW A04;

    public C31641c9(C31621c7 r2, C19970wo r3, C21010yW r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }

    public final void A00(int i) {
        String str;
        AnonymousClass3PV A002 = this.A02.A00();
        String str2 = null;
        if (A002 != null) {
            str = A002.A02;
            str2 = A002.A01;
        } else {
            str = null;
        }
        A01(i, str, str2);
    }

    public final void A02(Integer num, String str, int i) {
        AnonymousClass2Q5 r2 = new AnonymousClass2Q5();
        r2.A00 = Integer.valueOf(i);
        r2.A03 = str;
        r2.A01 = num;
        if (!(i == 1 || i == 10 || i == 12)) {
            int i2 = 2;
            if (this.A01) {
                i2 = 1;
            }
            r2.A02 = Integer.valueOf(i2);
        }
        this.A04.Bly(r2);
    }

    public final void A01(int i, String str, String str2) {
        A02(AnonymousClass3OO.A00(str2), str, i);
    }
}
