package X;

/* renamed from: X.55F  reason: invalid class name */
public final class AnonymousClass55F extends C110625ay {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55F) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass55F) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass55F(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MoveToAvatarCategory(category=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
