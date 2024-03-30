package X;

/* renamed from: X.3hL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71793hL implements AnonymousClass4QH {
    public final /* synthetic */ AnonymousClass3T1 A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C71793hL(AnonymousClass3T1 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void BwV(AnonymousClass3T1 r8) {
        AnonymousClass3T1 r3 = this.A00;
        boolean z = this.A01;
        if (r8.A10 && r8.A0I == r3.A0I) {
            C64933Qa r1 = r8.A1J;
            if (r1.A02 && r1.A01.equals(r3.A1J.A01)) {
                r8.A0n(r3.A0D);
                if (AnonymousClass000.A1R(r8.A05) && z) {
                    r8.A0g = Long.valueOf(r3.A0H + C36371kC.A07(r8.A05));
                }
            }
        }
    }
}
