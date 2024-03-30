package X;

/* renamed from: X.5EB  reason: invalid class name */
public final class AnonymousClass5EB extends AnonymousClass5EQ {
    public final AnonymousClass00S A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EB(AnonymousClass00S r2) {
        super(45);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5EB) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5EB) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NearbyBusinessWidgetEmptyListItemData(onLocationClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
