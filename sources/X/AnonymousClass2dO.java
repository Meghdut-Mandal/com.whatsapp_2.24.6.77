package X;

/* renamed from: X.2dO  reason: invalid class name */
public final class AnonymousClass2dO extends C132056Ry {
    public final AnonymousClass00S A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2dO(AnonymousClass00S r3) {
        super(C36381kD.A0m(), 36);
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2dO) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2dO) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LockedChatsEntrypointItem(onClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
