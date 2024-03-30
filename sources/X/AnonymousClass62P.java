package X;

/* renamed from: X.62P  reason: invalid class name */
public final class AnonymousClass62P {
    public final AnonymousClass00S A00;
    public final AnonymousClass00S A01;
    public final boolean A02;

    public AnonymousClass62P(AnonymousClass00S r1, AnonymousClass00S r2, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScrollAxisRange(value=");
        A0u.append(C90464aC.A03(this.A01));
        A0u.append(", maxValue=");
        A0u.append(C90464aC.A03(this.A00));
        A0u.append(", reverseScrolling=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
