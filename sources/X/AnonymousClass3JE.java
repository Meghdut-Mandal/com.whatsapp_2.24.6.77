package X;

/* renamed from: X.3JE  reason: invalid class name */
public final class AnonymousClass3JE {
    public final int A00;
    public final int A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JE) {
                AnonymousClass3JE r5 = (AnonymousClass3JE) obj;
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

    public AnonymousClass3JE(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = (long) (i * i2 * 3);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ImageUriInformation(width=");
        A0u.append(this.A01);
        A0u.append(", height=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
