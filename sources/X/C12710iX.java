package X;

/* renamed from: X.0iX  reason: invalid class name and case insensitive filesystem */
public final class C12710iX implements C17940sK {
    public final float A00;
    public final float A01;

    public /* bridge */ /* synthetic */ Comparable BBY() {
        return Float.valueOf(this.A00);
    }

    public /* bridge */ /* synthetic */ Comparable BHr() {
        return Float.valueOf(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12710iX)) {
            return false;
        }
        float f = this.A01;
        float f2 = this.A00;
        if (f > f2) {
            C12710iX r0 = (C12710iX) obj;
            if (r0.A01 > r0.A00) {
                return true;
            }
        }
        C12710iX r6 = (C12710iX) obj;
        if (f == r6.A01 && f2 == r6.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float f = this.A01;
        float f2 = this.A00;
        if (f > f2) {
            return -1;
        }
        return (Float.floatToIntBits(f) * 31) + Float.floatToIntBits(f2);
    }

    public C12710iX(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append("..");
        A0u.append(this.A00);
        return A0u.toString();
    }
}
