package X;

import com.whatsapp.util.Log;

public class AEV implements C23054B2a {
    public final /* synthetic */ C135086c7 A00;
    public final /* synthetic */ C175818b6 A01;
    public final /* synthetic */ C22964AzG A02;
    public final /* synthetic */ AnonymousClass8gP A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ void Bbl(AnonymousClass9XA r1) {
    }

    public AEV(C135086c7 r1, C175818b6 r2, C22964AzG azG, AnonymousClass8gP r4, String str) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A00 = r1;
        this.A02 = azG;
    }

    public void BUT(C175698au r8) {
        AnonymousClass8gP r4 = this.A03;
        C135086c7 r0 = r8.A01;
        C18740tg.A06(r0);
        String str = r8.A02;
        AnonymousClass8gP.A00(r0, this.A00, this.A01, this.A02, r4, str, this.A04);
    }

    public void BWg(C202059ky r2) {
        Log.w("PAY: IndiaUpiOtpAction: could not fetch VPA information to request OTP");
        this.A02.Bc3(r2);
    }
}
