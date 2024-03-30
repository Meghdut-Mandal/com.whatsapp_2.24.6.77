package X;

/* renamed from: X.5L5  reason: invalid class name */
public final class AnonymousClass5L5 extends C111665ce {
    public final C135066c4 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5L5) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5L5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5L5(C135066c4 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(sticker=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
