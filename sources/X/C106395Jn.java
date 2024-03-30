package X;

/* renamed from: X.5Jn  reason: invalid class name and case insensitive filesystem */
public final class C106395Jn extends C132056Ry {
    public final AnonymousClass00S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106395Jn) && AnonymousClass00C.A0J(this.A00, ((C106395Jn) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106395Jn(AnonymousClass00S r3) {
        super(C36381kD.A0m(), 42);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecentSearchClearAllItem(onClearAllClicked=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
