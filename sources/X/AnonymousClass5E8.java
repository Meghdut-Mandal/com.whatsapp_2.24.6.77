package X;

/* renamed from: X.5E8  reason: invalid class name */
public final class AnonymousClass5E8 extends AnonymousClass5EQ {
    public final C116765lA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5E8(C116765lA r2) {
        super(68);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5E8) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5E8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProminentSearchBarListItemData(searchBarClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
