package X;

/* renamed from: X.5EC  reason: invalid class name */
public final class AnonymousClass5EC extends AnonymousClass5EQ {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5EC) && this.A00 == ((AnonymousClass5EC) obj).A00);
    }

    public AnonymousClass5EC(boolean z) {
        super(44);
        this.A00 = z;
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NearbyBusinessWidgetShimmerListItemData(showHeaderShimmer=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
