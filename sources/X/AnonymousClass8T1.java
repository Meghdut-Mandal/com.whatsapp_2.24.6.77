package X;

/* renamed from: X.8T1  reason: invalid class name */
public class AnonymousClass8T1 extends C21077A7o {
    public final C188628zx A00;
    public final C200269h0 A01;
    public final C200269h0 A02;

    public boolean B1B(AnonymousClass9LX r5) {
        C200269h0 r3 = this.A01;
        C200269h0 r2 = this.A02;
        if (r3 instanceof AnonymousClass8T7) {
            r3 = ((AnonymousClass8T7) r3).A07(r5);
        }
        if (r2 instanceof AnonymousClass8T7) {
            r2 = ((AnonymousClass8T7) r2).A07(r5);
        }
        C22904AyG ayG = (C22904AyG) AnonymousClass99V.A00.get(this.A00);
        if (ayG != null) {
            return ayG.B6t(r3, r2, r5);
        }
        return false;
    }

    public String toString() {
        Object obj;
        C188628zx r2 = this.A00;
        if (r2 == C188628zx.EXISTS) {
            obj = this.A01;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36351kA.A1K(this.A01, A0u);
            C165567td.A1M(r2, " ", A0u);
            A0u.append(" ");
            C36351kA.A1K(this.A02, A0u);
            obj = A0u;
        }
        return obj.toString();
    }

    public AnonymousClass8T1(C188628zx r1, C200269h0 r2, C200269h0 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        toString();
    }
}
