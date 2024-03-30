package X;

/* renamed from: X.6AO  reason: invalid class name */
public final class AnonymousClass6AO {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AO) {
                AnonymousClass6AO r5 = (AnonymousClass6AO) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public AnonymousClass6AO(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OptionData(mediaQuality=");
        A0u.append(this.A00);
        A0u.append(", title=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
