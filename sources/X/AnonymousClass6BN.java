package X;

/* renamed from: X.6BN  reason: invalid class name */
public final class AnonymousClass6BN {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BN) {
                AnonymousClass6BN r5 = (AnonymousClass6BN) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public AnonymousClass6BN(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RollingPromptModel(previousIndex=");
        A0u.append(this.A01);
        A0u.append(", newIndex=");
        A0u.append(this.A00);
        A0u.append(", prompt=");
        return C36321k7.A0G(A0u, this.A02);
    }
}
