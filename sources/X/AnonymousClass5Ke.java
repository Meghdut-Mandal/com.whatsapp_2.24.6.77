package X;

/* renamed from: X.5Ke  reason: invalid class name */
public final class AnonymousClass5Ke extends C1268665y {
    public final AnonymousClass68B A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Ke) {
                AnonymousClass5Ke r5 = (AnonymousClass5Ke) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public AnonymousClass5Ke(AnonymousClass68B r1, String str) {
        super(r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Loading(packId=");
        A0u.append(this.A01);
        A0u.append(", pack=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
