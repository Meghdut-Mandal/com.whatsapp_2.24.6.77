package X;

/* renamed from: X.5Jl  reason: invalid class name and case insensitive filesystem */
public final class C106375Jl extends C132056Ry {
    public final AnonymousClass00S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106375Jl) && AnonymousClass00C.A0J(this.A00, ((C106375Jl) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106375Jl(AnonymousClass00S r3) {
        super(Integer.MAX_VALUE, 35);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GlobalSearchSeeMoreViewItem(onSeeMoreClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
