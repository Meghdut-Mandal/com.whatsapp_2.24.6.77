package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

public class AEW implements C23054B2a {
    public final /* synthetic */ C135086c7 A00;
    public final /* synthetic */ AnonymousClass8gR A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public /* synthetic */ void Bbl(AnonymousClass9XA r1) {
    }

    public AEW(C135086c7 r1, AnonymousClass8gR r2, String str, String str2, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A04 = hashMap;
        this.A03 = str2;
    }

    public void BUT(C175698au r8) {
        AnonymousClass8gR r2 = this.A01;
        C135086c7 r0 = r8.A01;
        C18740tg.A06(r0);
        String str = r8.A02;
        AnonymousClass8gR.A01(r0, this.A00, r2, str, this.A02, this.A03, this.A04);
    }

    public void BWg(C202059ky r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to change pin");
        B1N b1n = this.A01.A00;
        if (b1n != null) {
            b1n.BgO(r2);
        }
    }
}
