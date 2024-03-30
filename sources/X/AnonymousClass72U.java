package X;

import java.util.Comparator;

/* renamed from: X.72U  reason: invalid class name */
public final class AnonymousClass72U implements Comparable {
    public double A00;
    public double A01;
    public C134976bv A02;
    public final AnonymousClass7eK A03;
    public final Comparator A04;

    public void A00(double[] dArr) {
        int i;
        C134976bv BG3 = this.A03.BG3();
        if (!BG3.equals(this.A02)) {
            this.A02 = BG3;
            double A012 = AnonymousClass6WY.A01(BG3.A01);
            if (A012 < 0.0d) {
                i = 1;
            } else {
                i = 0;
                if (A012 > 1.0d) {
                    i = -1;
                }
            }
            this.A00 = A012 + ((double) i);
            this.A01 = AnonymousClass6WY.A00(BG3.A00);
        }
        dArr[0] = this.A00;
        dArr[1] = this.A01;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A04.compare(this.A03, ((AnonymousClass72U) obj).A03);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass72U)) {
            return false;
        }
        return this.A03.equals(((AnonymousClass72U) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public AnonymousClass72U(AnonymousClass7eK r1, Comparator comparator) {
        this.A03 = r1;
        this.A04 = comparator;
    }
}
