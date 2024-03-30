package X;

/* renamed from: X.5IR  reason: invalid class name */
public final class AnonymousClass5IR extends C111405cE {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IR) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IR) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass5IR(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarEditorEvent(event=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
