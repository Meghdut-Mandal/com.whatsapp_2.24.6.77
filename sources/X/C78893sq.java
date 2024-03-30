package X;

/* renamed from: X.3sq  reason: invalid class name and case insensitive filesystem */
public final class C78893sq implements AnonymousClass4S6 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmK(AnonymousClass3T1 r5, C52942qQ r6, int i) {
        boolean z;
        AnonymousClass00C.A0D(r5, 0);
        C202319lY r2 = r5.A0M;
        if (r2 != null) {
            synchronized (r2) {
                z = r2.A0O;
            }
            if (z) {
                AnonymousClass1EU r0 = (AnonymousClass1EU) this.A01.get();
                AnonymousClass1EU.A00(r0);
                C24881Ed r1 = r0.A05;
                AnonymousClass00C.A08(r1);
                r1.A0M(r5, true);
                r2.A0F(false);
                ((C25241Fn) this.A00.get()).A01(r5);
                if (r6 != null) {
                    throw C36321k7.A04(C78893sq.class);
                }
            }
        }
    }

    public C78893sq(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
