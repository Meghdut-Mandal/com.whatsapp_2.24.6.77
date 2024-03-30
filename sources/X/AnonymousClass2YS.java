package X;

/* renamed from: X.2YS  reason: invalid class name */
public final class AnonymousClass2YS extends C54842te {
    public final AnonymousClass141 A00;

    public AnonymousClass2YS(AnonymousClass141 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2YS) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2YS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InvitedAdmin(waContact=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
