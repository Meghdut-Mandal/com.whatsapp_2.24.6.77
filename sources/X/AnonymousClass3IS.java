package X;

/* renamed from: X.3IS  reason: invalid class name */
public final class AnonymousClass3IS {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IS) {
                AnonymousClass3IS r5 = (AnonymousClass3IS) obj;
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

    public AnonymousClass3IS(int i, Object obj) {
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
