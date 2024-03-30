package X;

/* renamed from: X.9y7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9y7 implements C22853Ax3 {
    public final /* synthetic */ C208409yC A00;

    public /* synthetic */ AnonymousClass9y7(C208409yC r1) {
        this.A00 = r1;
    }

    public final void BkC() {
        C208409yC r2 = this.A00;
        boolean A1Q = AnonymousClass000.A1Q((r2.A02.A0B() > 1.0f ? 1 : (r2.A02.A0B() == 1.0f ? 0 : -1)));
        if (A1Q != r2.A06) {
            r2.A06 = A1Q;
            r2.A0J.invalidateSelf();
        }
    }
}
