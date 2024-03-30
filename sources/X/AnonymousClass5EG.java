package X;

/* renamed from: X.5EG  reason: invalid class name */
public final class AnonymousClass5EG extends AnonymousClass5EQ {
    public final C116815lF A00;
    public final String A01;

    public AnonymousClass5EG(C116815lF r2, String str) {
        super(49);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass5EG) {
            AnonymousClass5EG r3 = (AnonymousClass5EG) obj;
            if (this.A00 != r3.A00 || !AnonymousClass00C.A0J(this.A01, r3.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36421kH.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchContextChipViewListItemData(category=");
        A0u.append(this.A01);
        A0u.append(", searchContextChipItemClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
