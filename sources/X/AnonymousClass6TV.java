package X;

/* renamed from: X.6TV  reason: invalid class name */
public final class AnonymousClass6TV {
    public static final AnonymousClass6TV A02 = new AnonymousClass6TV(1.0f, 0.0f);
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6TV) {
                AnonymousClass6TV r5 = (AnonymousClass6TV) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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

    public AnonymousClass6TV(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextGeometricTransform(scaleX=");
        A0u.append(this.A00);
        A0u.append(", skewX=");
        return C90464aC.A0g(A0u, this.A01);
    }

    public AnonymousClass6TV() {
        this(1.0f, 0.0f);
    }
}
