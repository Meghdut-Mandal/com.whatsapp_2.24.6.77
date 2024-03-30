package X;

/* renamed from: X.6Ca  reason: invalid class name and case insensitive filesystem */
public final class C128376Ca {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128376Ca) {
                C128376Ca r5 = (C128376Ca) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01;
    }

    public C128376Ca(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BadgeIconSize(extraSmall=");
        A0u.append(this.A00);
        A0u.append(", small=");
        A0u.append(this.A03);
        A0u.append(", medium=");
        A0u.append(this.A02);
        A0u.append(", large=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
