package X;

/* renamed from: X.8rA  reason: invalid class name and case insensitive filesystem */
public class C183668rA extends C132446Tt {
    public final B2W A00;
    public final AFC A01;
    public final C29131Vl A02;
    public final String A03;
    public final String A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Boolean.valueOf(this.A01.BnB("com.whatsapp", this.A04, this.A02.A01(), this.A03));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        B2W b2w = this.A00;
        if (b2w != null) {
            C36321k7.A1K(bool, "PAY: IndiaUpiSetupCoordinator/registered: ", AnonymousClass000.A0u());
            b2w.BeN(bool.booleanValue());
        }
        C195049Sg.A0A = null;
    }

    public C183668rA(B2W b2w, AFC afc, C29131Vl r3, String str, String str2) {
        this.A02 = r3;
        this.A03 = str;
        this.A01 = afc;
        this.A04 = str2;
        this.A00 = b2w;
    }
}
