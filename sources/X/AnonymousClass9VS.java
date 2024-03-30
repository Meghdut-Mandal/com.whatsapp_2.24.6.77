package X;

/* renamed from: X.9VS  reason: invalid class name */
public final class AnonymousClass9VS {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VS) {
                AnonymousClass9VS r5 = (AnonymousClass9VS) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A01 ? 1 : 0) * 31) + C36341k9.A09(this.A00);
    }

    public AnonymousClass9VS(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogPageInfo(hasNextPage=");
        A0u.append(this.A01);
        A0u.append(", endCursor=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
