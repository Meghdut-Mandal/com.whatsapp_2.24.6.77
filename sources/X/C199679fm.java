package X;

/* renamed from: X.9fm  reason: invalid class name and case insensitive filesystem */
public abstract class C199679fm {
    public final float A00;
    public final float A01;

    public static float A00(C199679fm r4, C199679fm r5) {
        float f = r4.A00;
        float f2 = r4.A01;
        float f3 = f - r5.A00;
        float f4 = f2 - r5.A01;
        return (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C199679fm) {
            C199679fm r4 = (C199679fm) obj;
            if (this.A00 == r4.A00 && this.A01 == r4.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A0i = C90524aI.A0i("(");
        A0i.append(this.A00);
        A0i.append(',');
        return C90464aC.A0g(A0i, this.A01);
    }

    public C199679fm(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
