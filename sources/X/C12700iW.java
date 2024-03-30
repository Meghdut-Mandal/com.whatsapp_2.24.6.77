package X;

/* renamed from: X.0iW  reason: invalid class name and case insensitive filesystem */
public final class C12700iW implements C17940sK {
    public final double A00;
    public final double A01;

    public /* bridge */ /* synthetic */ Comparable BBY() {
        return Double.valueOf(this.A00);
    }

    public /* bridge */ /* synthetic */ Comparable BHr() {
        return Double.valueOf(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12700iW)) {
            return false;
        }
        double d = this.A01;
        double d2 = this.A00;
        if (d > d2) {
            C12700iW r0 = (C12700iW) obj;
            if (r0.A01 > r0.A00) {
                return true;
            }
        }
        C12700iW r11 = (C12700iW) obj;
        if (d == r11.A01 && d2 == r11.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        double d = this.A01;
        double d2 = this.A00;
        if (d > d2) {
            return -1;
        }
        return (AnonymousClass000.A08(Double.doubleToLongBits(d)) * 31) + AnonymousClass000.A08(Double.doubleToLongBits(d2));
    }

    public C12700iW(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append("..");
        A0u.append(this.A00);
        return A0u.toString();
    }
}
