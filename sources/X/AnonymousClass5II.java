package X;

/* renamed from: X.5II  reason: invalid class name */
public final class AnonymousClass5II extends AnonymousClass61F {
    public final C111375cB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5II(C111375cB r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5II) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5II) obj).A00));
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + 947962180;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NotAvailable(searchType=");
        A0u.append(this.A00);
        A0u.append(", reason=");
        return C36321k7.A0E("search not available", A0u);
    }
}
