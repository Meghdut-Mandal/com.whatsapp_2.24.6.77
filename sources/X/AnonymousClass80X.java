package X;

import java.util.Set;

/* renamed from: X.80X  reason: invalid class name */
public final class AnonymousClass80X extends AnonymousClass80Z {
    public final Set A00;
    public final boolean A01;

    public AnonymousClass80X(Set set, int i, int i2) {
        super(i, i2);
        if (i < 0) {
            throw AnonymousClass001.A08("minWidth must be non-negative");
        } else if (i2 >= 0) {
            double d = (double) 0.4f;
            boolean z = false;
            if (0.0d <= d && d <= 1.0d) {
                z = true;
            }
            AnonymousClass0YM.A03(z, "splitRatio must be in 0.0..1.0 range");
            this.A00 = C007103b.A0f(set);
            this.A01 = true;
        } else {
            throw AnonymousClass001.A08("minSmallestWidth must be non-negative");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof AnonymousClass80X) && super.equals(obj)) {
                AnonymousClass80X r5 = (AnonymousClass80X) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36351kA.A05(this.A00, super.hashCode() * 31) * 31) + 1) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }
}
