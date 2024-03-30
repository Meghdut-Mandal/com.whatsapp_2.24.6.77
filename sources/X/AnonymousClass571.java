package X;

/* renamed from: X.571  reason: invalid class name */
public final class AnonymousClass571 extends C110855bL {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass571) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass571) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass571(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(errorMessage=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
