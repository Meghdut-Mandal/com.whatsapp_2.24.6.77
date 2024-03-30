package X;

/* renamed from: X.69p  reason: invalid class name and case insensitive filesystem */
public final class C1277769p {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277769p) {
                C1277769p r5 = (C1277769p) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36421kH.A04(this.A00));
    }

    public C1277769p(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PopularBusinessData(jid=");
        A0u.append(this.A00);
        A0u.append(", verifiedName=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
