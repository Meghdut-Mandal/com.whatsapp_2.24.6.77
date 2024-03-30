package X;

/* renamed from: X.5L4  reason: invalid class name */
public final class AnonymousClass5L4 extends C111665ce {
    public final String A00;

    public AnonymousClass5L4(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5L4) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5L4) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(reason=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
