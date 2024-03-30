package X;

/* renamed from: X.69C  reason: invalid class name */
public final class AnonymousClass69C {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69C) {
                AnonymousClass69C r5 = (AnonymousClass69C) obj;
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

    public AnonymousClass69C(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            throw AnonymousClass001.A08("negative start index");
        } else if (i2 < i) {
            throw AnonymousClass001.A08("end index greater than start");
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Interval(start=");
        A0u.append(this.A01);
        A0u.append(", end=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
