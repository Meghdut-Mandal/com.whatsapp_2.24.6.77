package X;

/* renamed from: X.6AS  reason: invalid class name */
public final class AnonymousClass6AS {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AS) {
                AnonymousClass6AS r5 = (AnonymousClass6AS) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + C36341k9.A09(this.A01);
    }

    public AnonymousClass6AS(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessApiResultsPage(pageSize=");
        A0u.append(this.A00);
        A0u.append(", pageId=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
