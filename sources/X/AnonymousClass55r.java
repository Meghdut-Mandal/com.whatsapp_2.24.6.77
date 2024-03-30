package X;

/* renamed from: X.55r  reason: invalid class name */
public final class AnonymousClass55r extends C1266865b {
    public final C125385zp A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55r) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass55r) obj).A00));
    }

    public AnonymousClass55r(C125385zp r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, 746629566);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerMaker(id=");
        C1266865b.A01(A0u, "id-sticker-maker");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
