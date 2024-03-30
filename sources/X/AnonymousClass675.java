package X;

/* renamed from: X.675  reason: invalid class name */
public final class AnonymousClass675 {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;

    public final void A00(float f, float f2, float f3, float f4) {
        this.A01 = Math.max(f, this.A01);
        this.A03 = Math.max(f2, this.A03);
        this.A02 = Math.min(f3, this.A02);
        this.A00 = Math.min(f4, this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutableRect(");
        AnonymousClass5WR.A01(A0u, this.A01);
        A0u.append(", ");
        AnonymousClass5WR.A01(A0u, this.A03);
        A0u.append(", ");
        AnonymousClass5WR.A01(A0u, this.A02);
        A0u.append(", ");
        return C36321k7.A0E(AnonymousClass5WR.A00(this.A00), A0u);
    }
}
