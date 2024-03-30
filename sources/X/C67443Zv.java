package X;

/* renamed from: X.3Zv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67443Zv implements C009604b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass155 A01;
    public final /* synthetic */ C235718z A02;

    public /* synthetic */ C67443Zv(AnonymousClass155 r1, C235718z r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void BQj(Object obj) {
        C235718z r5 = this.A02;
        int i = this.A00;
        AnonymousClass155 r3 = this.A01;
        if (((C009804d) obj).A00 == -1) {
            r5.A03 = true;
            ((AnonymousClass3L5) r5.A0A.get()).A01(i, 0);
        } else {
            r3.finish();
            if (!r5.A01) {
                r5.A02 = false;
            }
        }
        r5.A00 = false;
    }
}
