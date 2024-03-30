package X;

/* renamed from: X.6EN  reason: invalid class name */
public final class AnonymousClass6EN {
    public final float A00;
    public final float A01;

    public final float[] A00() {
        float f = this.A00;
        float f2 = this.A01;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6EN) {
                AnonymousClass6EN r5 = (AnonymousClass6EN) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A00), this.A01);
    }

    public AnonymousClass6EN(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WhitePoint(x=");
        A0u.append(this.A00);
        A0u.append(", y=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
