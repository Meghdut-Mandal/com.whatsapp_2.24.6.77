package X;

/* renamed from: X.564  reason: invalid class name */
public final class AnonymousClass564 extends C125385zp {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass564) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass564) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass564(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoadingSection(id=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
