package X;

public final class AH9 implements C16340p0 {
    public final CharSequence A00;

    public AH9(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 1);
        this.A00 = charSequence;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AH9) && AnonymousClass00C.A0J(this.A00, ((AH9) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Text(text=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
