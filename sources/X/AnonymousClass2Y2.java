package X;

/* renamed from: X.2Y2  reason: invalid class name */
public final class AnonymousClass2Y2 extends C54792tY {
    public AnonymousClass378 A00;

    public AnonymousClass2Y2(AnonymousClass378 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Y2) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2Y2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Contact(newsletterMemberContact=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
