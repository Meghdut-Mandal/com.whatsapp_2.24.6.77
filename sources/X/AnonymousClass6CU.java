package X;

/* renamed from: X.6CU  reason: invalid class name */
public final class AnonymousClass6CU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CU) {
                AnonymousClass6CU r5 = (AnonymousClass6CU) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public AnonymousClass6CU(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NavAndStatusColors(startStatusBarColor=");
        A0u.append(this.A03);
        A0u.append(", startNavBarColor=");
        A0u.append(this.A02);
        A0u.append(", returnStatusBarColor=");
        A0u.append(this.A01);
        A0u.append(", returnNavBarColor=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
