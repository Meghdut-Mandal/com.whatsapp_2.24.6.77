package X;

/* renamed from: X.6As  reason: invalid class name and case insensitive filesystem */
public final class C128066As {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128066As) {
                C128066As r5 = (C128066As) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C128066As(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BidiRun(start=");
        A0u.append(this.A01);
        A0u.append(", end=");
        A0u.append(this.A00);
        A0u.append(", isRtl=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
