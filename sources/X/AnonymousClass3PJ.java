package X;

/* renamed from: X.3PJ  reason: invalid class name */
public final class AnonymousClass3PJ {
    public final C21010yW A00;

    public AnonymousClass3PJ(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass2QP A00(Integer num, Integer num2, int i) {
        Integer valueOf;
        AnonymousClass2QP r2 = new AnonymousClass2QP();
        int i2 = 1;
        if (i != 4) {
            i2 = 2;
            if (i != 5) {
                i2 = 0;
                if (i != 6) {
                    i2 = 3;
                    if (i != 7) {
                        valueOf = null;
                        r2.A02 = valueOf;
                        r2.A03 = num;
                        r2.A01 = num2;
                        return r2;
                    }
                }
            }
        }
        valueOf = Integer.valueOf(i2);
        r2.A02 = valueOf;
        r2.A03 = num;
        r2.A01 = num2;
        return r2;
    }

    public final void A01(int i) {
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A01 = 49;
        r1.A00 = Integer.valueOf(i);
        this.A00.Bly(r1);
    }

    public final void A02(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Integer A0m = C36381kD.A0m();
        AnonymousClass2QP A002 = A00(valueOf, A0m, i);
        A002.A00 = A0m;
        this.A00.Blv(A002);
    }
}
