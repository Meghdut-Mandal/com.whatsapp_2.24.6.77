package X;

/* renamed from: X.54N  reason: invalid class name */
public final class AnonymousClass54N extends C110555ar {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass54N) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass54N) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass54N(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VerificationError(message=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
