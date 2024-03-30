package X;

/* renamed from: X.69n  reason: invalid class name and case insensitive filesystem */
public final class C1277569n {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277569n) {
                C1277569n r5 = (C1277569n) obj;
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

    public C1277569n(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HighlightRange(start=");
        A0u.append(this.A01);
        A0u.append(", end=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
