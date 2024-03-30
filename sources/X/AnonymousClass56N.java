package X;

/* renamed from: X.56N  reason: invalid class name */
public final class AnonymousClass56N extends C110715b7 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass56N) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass56N) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass56N(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MoveToStickerPage(page=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
