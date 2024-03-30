package X;

/* renamed from: X.3Hr  reason: invalid class name and case insensitive filesystem */
public final class C62823Hr {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62823Hr) {
                C62823Hr r5 = (C62823Hr) obj;
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

    public C62823Hr(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunityMemberListItem(viewType=");
        A0u.append(this.A00);
        A0u.append(", data=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
