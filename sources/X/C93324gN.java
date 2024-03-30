package X;

/* renamed from: X.4gN  reason: invalid class name and case insensitive filesystem */
public final class C93324gN extends C129076Ev {
    public float A00;
    public float A01;
    public float A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C93324gN)) {
            return false;
        }
        C93324gN r4 = (C93324gN) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90514aH.A05(this.A00), this.A01), this.A02);
    }

    public C93324gN(float f, float f2, float f3) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AnimationVector3D: v1 = ");
        A0u.append(this.A00);
        A0u.append(", v2 = ");
        A0u.append(this.A01);
        A0u.append(", v3 = ");
        A0u.append(this.A02);
        return A0u.toString();
    }
}
