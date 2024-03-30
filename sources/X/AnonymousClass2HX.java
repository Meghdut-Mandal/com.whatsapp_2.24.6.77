package X;

/* renamed from: X.2HX  reason: invalid class name */
public final class AnonymousClass2HX extends AnonymousClass31B {
    public final AnonymousClass3T1 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2HX) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2HX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2HX(AnonymousClass3T1 r2) {
        super(C51922ob.REVOKED_COMMENT);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RevokedCommentItem(comment=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
