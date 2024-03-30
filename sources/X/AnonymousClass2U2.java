package X;

/* renamed from: X.2U2  reason: invalid class name */
public final class AnonymousClass2U2 extends C54362sp {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2U2) && this.A00 == ((AnonymousClass2U2) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass2U2(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaItemResult(position=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
