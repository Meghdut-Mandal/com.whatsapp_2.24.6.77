package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

public class AEY implements C23054B2a {
    public final /* synthetic */ C135086c7 A00;
    public final /* synthetic */ AnonymousClass8gR A01;
    public final /* synthetic */ C185708uf A02;
    public final /* synthetic */ C185708uf A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public /* synthetic */ void Bbl(AnonymousClass9XA r1) {
    }

    public AEY(C135086c7 r1, AnonymousClass8gR r2, C185708uf r3, C185708uf r4, String str, String str2, String str3, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A07 = hashMap;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = r3;
        this.A02 = r4;
    }

    public void BUT(C175698au r11) {
        AnonymousClass8gR r2 = this.A01;
        C135086c7 r0 = r11.A01;
        C18740tg.A06(r0);
        String str = r11.A02;
        C135086c7 r1 = this.A00;
        String str2 = this.A04;
        HashMap hashMap = this.A07;
        AnonymousClass8gR.A00(r0, r1, r2, this.A03, this.A02, str, str2, this.A06, this.A05, hashMap);
    }

    public void BWg(C202059ky r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to set pin");
        B1N b1n = this.A01.A00;
        if (b1n != null) {
            b1n.BgO(r2);
        }
    }
}
