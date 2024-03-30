package X;

/* renamed from: X.9fS  reason: invalid class name and case insensitive filesystem */
public final class C199519fS {
    public static final C199519fS A05 = new C199519fS(1.0f, 1.0f, false, false);
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C199519fS r5 = (C199519fS) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C165617ti.A01(Float.floatToRawIntBits(this.A01)) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0);
    }

    public C199519fS(float f, float f2, boolean z, boolean z2) {
        boolean z3 = true;
        C200319h9.A01(AnonymousClass000.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        C200319h9.A01(f2 <= 0.0f ? false : z3);
        this.A01 = f;
        this.A00 = f2;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = C90514aH.A06(f, 1000.0f);
    }
}
