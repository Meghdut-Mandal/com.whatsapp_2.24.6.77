package X;

/* renamed from: X.6BV  reason: invalid class name */
public final class AnonymousClass6BV {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BV) {
                AnonymousClass6BV r5 = (AnonymousClass6BV) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public AnonymousClass6BV(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("{videoLimitMb=");
        A0u.append(this.A00);
        A0u.append(", videoMaxEdge=");
        A0u.append(this.A02);
        A0u.append(", videoMaxBitrate=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }
}
