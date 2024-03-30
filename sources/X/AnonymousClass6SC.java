package X;

/* renamed from: X.6SC  reason: invalid class name */
public final class AnonymousClass6SC {
    public Object A00;
    public boolean A01;
    public final C137116fc A02;
    public final C161507n1 A03;
    public final C161507n1 A04;

    public static final void A00(AnonymousClass6SC r2, int i, int i2) {
        if (((float) i) >= 0.0f) {
            r2.A03.Br4(i);
            r2.A02.A00(i);
            r2.A04.Br4(i2);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Index should be non-negative (");
        throw AnonymousClass001.A08(C36321k7.A0G(A0u, i));
    }

    public AnonymousClass6SC(int i, int i2) {
        AnonymousClass00T r0 = C113525fg.A01;
        this.A03 = new C94024hW(i);
        this.A04 = new C94024hW(i2);
        this.A02 = new C137116fc(i);
    }

    public AnonymousClass6SC() {
        this(0, 0);
    }
}
