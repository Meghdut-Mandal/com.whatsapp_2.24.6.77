package X;

/* renamed from: X.6P3  reason: invalid class name */
public final class AnonymousClass6P3 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6P3) {
                AnonymousClass6P3 r5 = (AnonymousClass6P3) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass6P3(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WDSIconDimension(size=");
        A0u.append(this.A01);
        A0u.append(", iconSize=");
        return C36321k7.A0G(A0u, this.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6P3() {
        /*
            r2 = this;
            X.5Tn r0 = X.C108445Tn.A04
            int r1 = r0.size
            int r0 = r0.iconSize
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6P3.<init>():void");
    }
}
