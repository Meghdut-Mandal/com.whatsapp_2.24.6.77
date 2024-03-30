package X;

/* renamed from: X.6B2  reason: invalid class name */
public final class AnonymousClass6B2 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B2) {
                AnonymousClass6B2 r5 = (AnonymousClass6B2) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass6B2(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Spec(resId=");
        A0u.append(this.A00);
        A0u.append(", start=");
        A0u.append(this.A02);
        A0u.append(", repeat=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
