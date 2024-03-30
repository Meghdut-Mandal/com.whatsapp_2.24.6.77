package X;

/* renamed from: X.3si  reason: invalid class name and case insensitive filesystem */
public final class C78813si implements AnonymousClass4S5 {
    public final AnonymousClass005 A00;

    public C78813si(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmK(AnonymousClass3T1 r9, C52942qQ r10, int i) {
        AnonymousClass00C.A0D(r9, 0);
        if (i == 6) {
            C29611Xh.A00(r9);
            AnonymousClass1M0 A05 = ((C29611Xh) this.A00.get()).A00.A05();
            try {
                C224114e r6 = A05.A02;
                String[] A1R = C36441kJ.A1R();
                C36351kA.A1V(A1R, 0, r9.A1N);
                r6.A03("message_future", "message_row_id = ?", "DELETE_MESSAGE_FUTURE_SQL", A1R);
                A05.close();
                if (r10 != null) {
                    throw C36321k7.A04(C78813si.class);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }
}
