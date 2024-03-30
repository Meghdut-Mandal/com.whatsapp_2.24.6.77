package X;

import com.whatsapp.util.Log;

public class AEX implements C23054B2a {
    public final /* synthetic */ C135086c7 A00;
    public final /* synthetic */ AnonymousClass1XD A01;
    public final /* synthetic */ AnonymousClass8gQ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ void Bbl(AnonymousClass9XA r1) {
    }

    public AEX(C135086c7 r1, AnonymousClass1XD r2, AnonymousClass8gQ r3, String str, boolean z, boolean z2) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = z;
        this.A01 = r2;
        this.A05 = z2;
    }

    public void BUT(C175698au r9) {
        AnonymousClass8gQ r0 = this.A02;
        C135086c7 r1 = r9.A01;
        C18740tg.A06(r1);
        String str = r9.A02;
        r0.A01(r1, this.A00, this.A01, str, this.A03, this.A04, this.A05);
    }

    public void BWg(C202059ky r2) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to set default payment method");
        this.A01.Bes(r2);
    }
}
