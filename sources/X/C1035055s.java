package X;

/* renamed from: X.55s  reason: invalid class name and case insensitive filesystem */
public final class C1035055s extends C1266865b {
    public final C125385zp A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1035055s) && AnonymousClass00C.A0J(this.A00, ((C1035055s) obj).A00));
    }

    public C1035055s(C125385zp r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, -1196466968);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerMakerUpsell(id=");
        C1266865b.A01(A0u, "id-sticker-maker-upsell");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
