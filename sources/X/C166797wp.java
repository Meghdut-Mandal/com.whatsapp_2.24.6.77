package X;

/* renamed from: X.7wp  reason: invalid class name and case insensitive filesystem */
public final class C166797wp extends AnonymousClass9G3 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public C166797wp(float f, float f2, float f3, float f4) {
        super(true, false);
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = f4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166797wp) {
                C166797wp r5 = (C166797wp) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A00), this.A02), this.A01), this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReflectiveCurveTo(x1=");
        A0u.append(this.A00);
        A0u.append(", y1=");
        A0u.append(this.A02);
        A0u.append(", x2=");
        A0u.append(this.A01);
        A0u.append(", y2=");
        return C90464aC.A0g(A0u, this.A03);
    }
}
