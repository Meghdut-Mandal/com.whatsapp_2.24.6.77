package X;

/* renamed from: X.3Hw  reason: invalid class name and case insensitive filesystem */
public final class C62873Hw {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62873Hw) {
                C62873Hw r5 = (C62873Hw) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, this.A00 * 31);
    }

    public C62873Hw(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Item(type=");
        A0u.append(this.A00);
        A0u.append(", data=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}