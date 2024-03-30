package X;

/* renamed from: X.6AV  reason: invalid class name */
public final class AnonymousClass6AV {
    public final int A00;
    public final C108035Rx A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AV) {
                AnonymousClass6AV r5 = (AnonymousClass6AV) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass6AV(C108035Rx r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MetaData(position=");
        A0u.append(this.A01);
        A0u.append(", index=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
