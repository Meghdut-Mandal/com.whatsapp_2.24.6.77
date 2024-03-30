package X;

/* renamed from: X.5IL  reason: invalid class name */
public final class AnonymousClass5IL extends C111385cC {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IL) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5IL(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Loading(stableId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
