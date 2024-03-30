package X;

/* renamed from: X.3tp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79503tp implements C25711Hj {
    public final /* synthetic */ C65053Qn A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C79503tp(C65053Qn r1, AnonymousClass11F r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        C65053Qn r1 = this.A00;
        AnonymousClass11F r5 = this.A01;
        String str = this.A02;
        Boolean bool = (Boolean) obj;
        C225014r r3 = r1.A03;
        if (!r3.BLh()) {
            C20810yC r2 = r1.A07;
            if (r1.A01) {
                str = "triggered_block";
            }
            r3.Btm(new C64743Pg(r2, r5, str, bool.booleanValue()).A01());
        }
    }
}
