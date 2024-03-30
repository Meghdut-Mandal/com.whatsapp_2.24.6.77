package X;

/* renamed from: X.3tu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79553tu implements C25711Hj {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ C43812Jx A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ AnonymousClass3T1 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass00S A05;

    public /* synthetic */ C79553tu(AnonymousClass155 r1, C43812Jx r2, AnonymousClass11F r3, AnonymousClass3T1 r4, String str, AnonymousClass00S r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = r6;
    }

    public final void accept(Object obj) {
        AnonymousClass155 r3 = this.A00;
        C43812Jx r7 = this.A01;
        AnonymousClass11F r6 = this.A02;
        String str = this.A04;
        AnonymousClass3T1 r5 = this.A03;
        AnonymousClass00S r4 = this.A05;
        Boolean bool = (Boolean) obj;
        AnonymousClass00C.A0D(bool, 6);
        if (!r3.BLh()) {
            C64743Pg A002 = C64743Pg.A00(r7.A02, r6, r5, str, bool.booleanValue());
            A002.A02 = r5.A1J;
            A002.A03 = new C89434Wn(r4, 1);
            if (r6 instanceof C28981Uw) {
                C65073Qp A0W = C36371kC.A0W(r7.A00, r6);
                AnonymousClass00C.A0E(A0W, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
                A002.A02((C44072La) A0W);
            }
            r3.Btm(A002.A01());
        }
    }
}
