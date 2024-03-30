package X;

/* renamed from: X.3gd  reason: invalid class name and case insensitive filesystem */
public final class C71353gd implements C159417jK {
    public final C31621c7 A00;
    public final C31651cA A01;

    public void BV1() {
        if (this.A01.A00()) {
            C31621c7 r7 = this.A00;
            synchronized (r7) {
                C19420v0 r6 = r7.A03;
                AnonymousClass3PV A002 = AnonymousClass3PV.A00(C36371kC.A0t(C36341k9.A0E(r6), "companion_reg_with_link_code_companion_hello_info_json"));
                if (A002 != null) {
                    long A003 = C19970wo.A00(r7.A02);
                    long j = A002.A00;
                    if (j < A003) {
                        r7.A01(j);
                    }
                }
                C36341k9.A0u(C19420v0.A00(r6), "companion_reg_with_link_code_companion_hello_info_json");
            }
        }
    }

    public C71353gd(C31621c7 r1, C31651cA r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
