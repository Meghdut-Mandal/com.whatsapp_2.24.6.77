package X;

/* renamed from: X.6Ae  reason: invalid class name and case insensitive filesystem */
public final class C127926Ae {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127926Ae) {
                C127926Ae r5 = (C127926Ae) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + this.A00;
    }

    public C127926Ae(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactInfo(jid=");
        A0u.append(this.A01);
        A0u.append(", rank=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
