package X;

/* renamed from: X.5IQ  reason: invalid class name */
public final class AnonymousClass5IQ extends C111405cE {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IQ) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5IQ(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarArtRevisionUpdate(newRevision=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
