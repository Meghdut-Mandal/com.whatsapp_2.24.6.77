package X;

/* renamed from: X.0Ug  reason: invalid class name and case insensitive filesystem */
public final class C06600Ug {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06600Ug) {
                C06600Ug r5 = (C06600Ug) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A0H(this.A01);
    }

    public C06600Ug(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndexedValue(index=");
        A0u.append(this.A00);
        A0u.append(", value=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
