package X;

/* renamed from: X.5EF  reason: invalid class name */
public final class AnonymousClass5EF extends AnonymousClass5EQ {
    public final C159377jG A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EF(C159377jG r2, String str) {
        super(50);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5EF) {
                AnonymousClass5EF r5 = (AnonymousClass5EF) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36341k9.A09(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LocationPermissionRequestFooterViewData(categoryId=");
        A0u.append(this.A01);
        A0u.append(", locationRequestClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
