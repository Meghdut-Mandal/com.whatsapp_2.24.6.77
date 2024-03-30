package X;

/* renamed from: X.2HV  reason: invalid class name */
public final class AnonymousClass2HV extends AnonymousClass31B {
    public final AnonymousClass3T1 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2HV) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2HV) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2HV(AnonymousClass3T1 r2) {
        super(C51922ob.COMMENT);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommentItem(comment=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
