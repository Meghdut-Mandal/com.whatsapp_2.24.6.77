package X;

/* renamed from: X.570  reason: invalid class name */
public final class AnonymousClass570 extends C110845bK {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass570) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass570) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass570(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(publicKey=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
