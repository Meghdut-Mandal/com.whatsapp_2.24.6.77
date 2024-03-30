package X;

/* renamed from: X.3HS  reason: invalid class name */
public final class AnonymousClass3HS {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HS) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3HS(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DialogUiState(descriptionInitialValue=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
