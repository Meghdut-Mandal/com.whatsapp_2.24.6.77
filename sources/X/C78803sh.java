package X;

/* renamed from: X.3sh  reason: invalid class name and case insensitive filesystem */
public final class C78803sh implements AnonymousClass4S5 {
    public final AnonymousClass005 A00;

    public C78803sh(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmK(AnonymousClass3T1 r4, C52942qQ r5, int i) {
        boolean z;
        AnonymousClass00C.A0D(r4, 0);
        C63683Kz A0V = r4.A0V();
        if (A0V != null) {
            synchronized (A0V) {
                z = A0V.A02;
            }
            if (z) {
                byte[] A02 = A0V.A02();
                AnonymousClass1EH r0 = (AnonymousClass1EH) this.A00.get();
                if (A02 != null) {
                    r0.A03(r4, A02);
                } else {
                    r0.A02(r4);
                }
                synchronized (A0V) {
                    A0V.A02 = false;
                }
                if (r5 != null) {
                    throw C36321k7.A04(C78803sh.class);
                }
            }
        }
    }
}
