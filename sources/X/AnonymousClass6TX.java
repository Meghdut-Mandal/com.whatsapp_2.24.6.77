package X;

/* renamed from: X.6TX  reason: invalid class name */
public final class AnonymousClass6TX {
    public final C121845to A00;
    public final AnonymousClass00T A01;
    public final C19760wT A02;
    public final C123945xL A03;

    public final void A03(C122765vO r7, int i, int i2) {
        A01(this, new C81303wn(r7, this, i, i2, 4));
    }

    public final void A04(C122765vO r7, int i, int i2) {
        A01(this, new C81303wn(r7, this, i, i2, 5));
    }

    public static final void A01(AnonymousClass6TX r1, Runnable runnable) {
        if (((C117745ml) r1.A01.getValue()).A00.A0E(2003)) {
            runnable.run();
        }
    }

    public final int A02(int i) {
        if (!((C117745ml) this.A01.getValue()).A00.A0E(2003)) {
            return -1;
        }
        C121845to r2 = this.A00;
        int andIncrement = r2.A02.getAndIncrement();
        r2.A00.markerStart(i, andIncrement);
        return andIncrement;
    }

    public AnonymousClass6TX(C19760wT r2, C121845to r3, C123945xL r4, AnonymousClass00T r5) {
        C36321k7.A0y(r3, r5);
        AnonymousClass00C.A0D(r2, 4);
        this.A00 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = r2;
    }

    public static final void A00(C122765vO r10, AnonymousClass6TX r11, int i, int i2, int i3) {
        long currentTimeMillis = System.currentTimeMillis();
        C123945xL r2 = r11.A03;
        AnonymousClass736.A00(r2.A05, r10, r2, new C123455wW(r11, i3, i, i2, currentTimeMillis), 46);
    }
}
