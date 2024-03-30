package X;

/* renamed from: X.6eE  reason: invalid class name and case insensitive filesystem */
public final class C136346eE implements AnonymousClass7dY {
    public final float A00;
    public final float A01;

    public C136346eE(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            A0u.append(f);
            A0u.append(", ");
            A0u.append(0.0f);
            A0u.append(", ");
            A0u.append(f2);
            A0u.append(", ");
            A0u.append(1.0f);
            A0u.append('.');
            throw AnonymousClass000.A0b(A0u);
        }
    }

    public float Bvz(float f) {
        float f2 = 0.0f;
        if (f <= 0.0f) {
            return f;
        }
        float f3 = 1.0f;
        if (f >= 1.0f) {
            return f;
        }
        while (true) {
            float f4 = (f2 + f3) / ((float) 2);
            float f5 = (float) 3;
            float f6 = ((float) 1) - f4;
            float f7 = f4 * f4 * f4;
            float f8 = (this.A00 * f5 * f6 * f6 * f4) + (f5 * this.A01 * f6 * f4 * f4) + f7;
            if (C90494aF.A01(f, f8) < 0.001f) {
                return (0.0f * f5 * f6 * f6 * f4) + (f5 * 1.0f * f6 * f4 * f4) + f7;
            }
            if (f8 < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C136346eE)) {
            return false;
        }
        C136346eE r4 = (C136346eE) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A00), 0.0f), this.A01), 1.0f);
    }
}
