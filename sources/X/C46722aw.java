package X;

/* renamed from: X.2aw  reason: invalid class name and case insensitive filesystem */
public final class C46722aw extends C55122u6 {
    public final AnonymousClass2Z0 A00;

    public C46722aw(AnonymousClass2Z0 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46722aw) && AnonymousClass00C.A0J(this.A00, ((C46722aw) obj).A00));
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
