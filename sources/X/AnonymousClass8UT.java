package X;

/* renamed from: X.8UT  reason: invalid class name */
public final class AnonymousClass8UT extends C1898695x {
    public final Boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8UT) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass8UT) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass8UT(Boolean bool) {
        this.A00 = bool;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(consentResult=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
