package X;

/* renamed from: X.5HS  reason: invalid class name */
public final class AnonymousClass5HS extends C111335c7 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5HS) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5HS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5HS(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(handle=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
