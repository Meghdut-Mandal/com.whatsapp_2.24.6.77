package X;

/* renamed from: X.5EA  reason: invalid class name */
public final class AnonymousClass5EA extends AnonymousClass5EQ {
    public final C116795lD A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EA(C116795lD r2) {
        super(48);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5EA) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5EA) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NearbyBusinessLocationRequestListItemData(nearbyLocationRequestClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
