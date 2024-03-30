package X;

/* renamed from: X.52w  reason: invalid class name and case insensitive filesystem */
public final class C1029952w extends C1275168p {
    public final C61243Bc A00;

    public C1029952w(C61243Bc r2) {
        super(7);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1029952w) && AnonymousClass00C.A0J(this.A00, ((C1029952w) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParticipantsNotInContactsFooterViewState(text=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
