package X;

/* renamed from: X.70I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70I implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C79593ty A01;
    public final /* synthetic */ C26501Kk A02;

    public /* synthetic */ AnonymousClass70I(C79593ty r1, C26501Kk r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void accept(Object obj) {
        boolean z;
        C26501Kk r0 = this.A02;
        int i = this.A00;
        C79593ty r3 = this.A01;
        AnonymousClass011 r7 = (AnonymousClass011) obj;
        C36321k7.A16(r0, r3, r7, 0);
        C26551Kp r2 = r0.A00;
        r2.A04(i, "psl_cache_hit", AnonymousClass000.A1X(r7.first));
        r2.A08(Integer.valueOf(i), "psl_cache_fetch_end");
        String str = null;
        if (AnonymousClass000.A1X(r7.first)) {
            byte[] bArr = (byte[]) r7.second;
            if (bArr != null) {
                str = new String(bArr, AnonymousClass0S4.A05);
            }
            z = C36371kC.A0m();
        } else {
            z = false;
        }
        r3.A0C(C36441kJ.A19(z, str));
    }
}
