package X;

/* renamed from: X.6fA  reason: invalid class name */
public final class AnonymousClass6fA implements C157557dj {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6fA) && Float.compare(this.A00, ((AnonymousClass6fA) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass6fA(float f) {
        this.A00 = f;
        if (f < 0.0f || f > 100.0f) {
            throw AnonymousClass001.A08("The percent should be in the range of [0, 100]");
        }
    }

    public float Bvr(C161937ni r4, long j) {
        return Math.min(Math.abs(AnonymousClass6X0.A01(j)), Math.abs(AnonymousClass6X0.A00(j))) * (this.A00 / 100.0f);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CornerSize(size = ");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("%)", A0u);
    }
}
