package X;

/* renamed from: X.2Ev  reason: invalid class name */
public final class AnonymousClass2Ev extends C53622rc {
    public final AnonymousClass00S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Ev) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2Ev) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2Ev(AnonymousClass00S r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowNoConnectionError(onConnectionErrorDisplayed=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
