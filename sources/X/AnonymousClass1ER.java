package X;

/* renamed from: X.1ER  reason: invalid class name */
public final class AnonymousClass1ER {
    public final AnonymousClass00T A00 = new AnonymousClass00U(new AnonymousClass1ET(this));
    public final AnonymousClass00S A01;

    public final synchronized C52152oy A00(AnonymousClass11F r2) {
        C52152oy r0;
        AnonymousClass00C.A0D(r2, 0);
        if (r2 instanceof C223313w) {
            r0 = (C52152oy) ((C002000v) this.A00.getValue()).A04(r2);
            if (r0 == null) {
                r0 = C52152oy.CTWA;
            }
        } else {
            r0 = null;
        }
        return r0;
    }

    public final void A01(AnonymousClass11F r4, boolean z) {
        C52152oy r2;
        AnonymousClass00C.A0D(r4, 0);
        if (AnonymousClass143.A0I(r4)) {
            if (z) {
                r2 = C52152oy.CTWA;
            } else {
                r2 = C52152oy.USERNAME;
            }
            synchronized (this) {
                ((C002000v) this.A00.getValue()).A08(r4, r2);
            }
        }
    }

    public AnonymousClass1ER() {
        AnonymousClass1ES r1 = AnonymousClass1ES.A00;
        AnonymousClass00C.A0D(r1, 1);
        this.A01 = r1;
    }
}
