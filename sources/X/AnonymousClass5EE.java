package X;

/* renamed from: X.5EE  reason: invalid class name */
public final class AnonymousClass5EE extends AnonymousClass5EQ {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5EE) && this.A00 == ((AnonymousClass5EE) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass5EE(int i) {
        super(65);
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VerticalSpaceViewItemData(height=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
