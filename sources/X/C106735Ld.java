package X;

/* renamed from: X.5Ld  reason: invalid class name and case insensitive filesystem */
public final class C106735Ld extends AnonymousClass12N {
    public final AnonymousClass166 A00 = new AnonymousClass166(200);
    public final AnonymousClass166 A01 = new AnonymousClass166(10);
    public final C19700wN A02;

    public final void A09() {
        synchronized (this) {
            AnonymousClass166 r1 = this.A01;
            AnonymousClass166 r0 = this.A00;
            r1.clear();
            r0.clear();
        }
    }

    public String BHv() {
        String A0o;
        synchronized (this) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BusinessSearchQueryCache=");
            A0u.append(Integer.valueOf(this.A01.size()));
            A0u.append(',');
            A0o = AnonymousClass000.A0o(Integer.valueOf(this.A00.size()), A0u);
        }
        return A0o;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106735Ld(C19700wN r3, C220112n r4) {
        super(r4);
        C36321k7.A0x(r4, r3);
        this.A02 = r3;
        A08();
    }

    public void Bjh(AnonymousClass5SK r1, boolean z) {
        A09();
    }
}
