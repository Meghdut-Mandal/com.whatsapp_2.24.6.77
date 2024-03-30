package X;

/* renamed from: X.4gO  reason: invalid class name and case insensitive filesystem */
public final class C93334gO extends C129076Ev {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof C93334gO)) {
            return false;
        }
        C93334gO r4 = (C93334gO) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A03 == this.A03) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C90514aH.A0C(C90474aD.A02(C90474aD.A02(C90514aH.A05(this.A00), this.A01), this.A02), this.A03);
    }

    public C93334gO(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AnimationVector4D: v1 = ");
        A0u.append(this.A00);
        A0u.append(", v2 = ");
        A0u.append(this.A01);
        A0u.append(", v3 = ");
        A0u.append(this.A02);
        A0u.append(", v4 = ");
        A0u.append(this.A03);
        return A0u.toString();
    }
}
