package X;

/* renamed from: X.55p  reason: invalid class name and case insensitive filesystem */
public final class C1034855p extends C1266865b {
    public final C125385zp A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1034855p) && AnonymousClass00C.A0J(this.A00, ((C1034855p) obj).A00));
    }

    public C1034855p(C125385zp r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, -1901416972);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FunStickerCreate(id=");
        C1266865b.A01(A0u, "id-fun-sticker-create");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
