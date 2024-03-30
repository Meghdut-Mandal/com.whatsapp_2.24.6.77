package X;

/* renamed from: X.1dB  reason: invalid class name and case insensitive filesystem */
public final class C32221dB implements C226715i, C32211dA {
    public final C20810yC A00;
    public final AnonymousClass11e A01;
    public final C29731Xt A02;
    public final AnonymousClass00T A03 = new AnonymousClass00U(new C32231dC(this));

    public C32221dB(C20810yC r3, AnonymousClass11e r4, C29731Xt r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }

    public final void A00() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A09("StatusesFragment_onCreate");
        }
        C21690ze r3 = this.A02.A09;
        r3.markerStart(453128091, 1);
        r3.markerPoint(453128091, 1, "CREATE_START");
    }

    public boolean BQx() {
        if (!((Boolean) this.A03.getValue()).booleanValue()) {
            return false;
        }
        this.A01.A08("StatusesFragment_onDraw");
        return false;
    }

    public boolean BQy() {
        if (!((Boolean) this.A03.getValue()).booleanValue()) {
            return false;
        }
        this.A01.A08("StatusesFragment_onLayout");
        return false;
    }

    public void BS8() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A09("StatusesFragment_onDraw");
        }
    }

    public void BS9() {
        if (((Boolean) this.A03.getValue()).booleanValue()) {
            this.A01.A09("StatusesFragment_onLayout");
        }
    }
}
