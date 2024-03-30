package X;

/* renamed from: X.55q  reason: invalid class name and case insensitive filesystem */
public final class C1034955q extends C1266865b {
    public final C125385zp A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1034955q) && AnonymousClass00C.A0J(this.A00, ((C1034955q) obj).A00));
    }

    public C1034955q(C125385zp r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, 1144530083);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FunStickerUpsell(id=");
        C1266865b.A01(A0u, "id-fun-sticker-upsell");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
