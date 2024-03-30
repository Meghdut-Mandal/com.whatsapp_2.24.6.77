package X;

/* renamed from: X.6z4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148566z4 implements C158517hd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass65M A01;
    public final /* synthetic */ C006302t A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C148566z4(AnonymousClass65M r1, C006302t r2, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = z;
    }

    public final void Bhc(C111615cZ r10) {
        AnonymousClass65M r4 = this.A01;
        int i = this.A00;
        C006302t r6 = this.A02;
        boolean z = this.A03;
        AnonymousClass00C.A0D(r10, 4);
        if (r10 instanceof AnonymousClass5KY) {
            r4.A0E.Bp1(new C80513vW(r4, ((AnonymousClass5KY) r10).A00, r6, i, 2));
        } else if (r10 instanceof AnonymousClass5KX) {
            boolean z2 = r4.A0F.get();
            AnonymousClass1HC r1 = r4.A07;
            if (z2) {
                r1.A01(i, "download_stickerpack_canceled");
                r1.A02(C52322pF.CANCEL, i);
            } else {
                r1.A01(i, "download_stickerpack_failed");
                r1.A02(C52322pF.FAIL, i);
                if (z) {
                    r4.A02.A00("retry", 6, false);
                }
            }
            r6.invoke(C36381kD.A0j());
        }
        r4.A00.set((Object) null);
    }
}
