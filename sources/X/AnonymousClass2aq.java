package X;

/* renamed from: X.2aq  reason: invalid class name */
public final class AnonymousClass2aq extends C55112u5 {
    public final AnonymousClass2Z1 A00;

    public AnonymousClass2aq(AnonymousClass2Z1 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2aq) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2aq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Response(response=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
