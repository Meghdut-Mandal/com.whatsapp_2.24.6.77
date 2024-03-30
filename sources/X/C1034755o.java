package X;

/* renamed from: X.55o  reason: invalid class name and case insensitive filesystem */
public final class C1034755o extends C1266865b {
    public final C125385zp A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1034755o) && AnonymousClass00C.A0J(this.A00, ((C1034755o) obj).A00));
    }

    public C1034755o(C125385zp r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, -1319790671);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarUpsell(id=");
        C1266865b.A01(A0u, "id-avatar-upsell");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
