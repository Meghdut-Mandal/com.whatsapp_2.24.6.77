package X;

/* renamed from: X.2U1  reason: invalid class name */
public final class AnonymousClass2U1 extends C54362sp {
    public final C88924Uo A00;

    public AnonymousClass2U1(C88924Uo r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2U1) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2U1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CacheResult(mediaList=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
