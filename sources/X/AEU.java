package X;

import com.whatsapp.util.Log;

public class AEU implements C23054B2a {
    public final /* synthetic */ C135086c7 A00;
    public final /* synthetic */ AnonymousClass1XD A01;
    public final /* synthetic */ AnonymousClass8gQ A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ void Bbl(AnonymousClass9XA r1) {
    }

    public AEU(C135086c7 r1, AnonymousClass1XD r2, AnonymousClass8gQ r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public void BUT(C175698au r7) {
        AnonymousClass8gQ r3 = this.A02;
        C135086c7 r0 = r7.A01;
        C18740tg.A06(r0);
        String str = r7.A02;
        AnonymousClass8gQ.A00(r0, this.A00, this.A01, r3, str, this.A03);
    }

    public void BWg(C202059ky r2) {
        Log.w("PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to remove payment method");
        this.A01.Bes(r2);
    }
}
