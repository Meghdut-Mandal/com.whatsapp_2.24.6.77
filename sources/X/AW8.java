package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONObject;

public final /* synthetic */ class AW8 implements Runnable {
    public final /* synthetic */ C207119ua A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ B1M A02;
    public final /* synthetic */ AnonymousClass8gF A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ JSONObject A0B;

    public /* synthetic */ AW8(C207119ua r1, UserJid userJid, B1M b1m, AnonymousClass8gF r4, Long l, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        this.A03 = r4;
        this.A05 = str;
        this.A07 = str2;
        this.A01 = userJid;
        this.A00 = r1;
        this.A08 = str3;
        this.A09 = str4;
        this.A04 = l;
        this.A0A = str5;
        this.A06 = str6;
        this.A0B = jSONObject;
        this.A02 = b1m;
    }

    public final void run() {
        String str;
        AnonymousClass8gF r0 = this.A03;
        String str2 = this.A05;
        String str3 = this.A07;
        UserJid userJid = this.A01;
        C207119ua r5 = this.A00;
        String str4 = this.A08;
        String str5 = this.A09;
        Long l = this.A04;
        String str6 = this.A0A;
        String str7 = this.A06;
        JSONObject jSONObject = this.A0B;
        B1M b1m = this.A02;
        AnonymousClass19A r2 = r0.A04;
        String A092 = r2.A09();
        UserJid A002 = C111255bz.A00(r0.A02, r0.A03, userJid);
        if (A002 != null) {
            ArrayList arrayList = C185968vC.A00;
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = null;
            }
            C185968vC r6 = new C185968vC(A002, C185708uf.A02(r5), l, A092, str4, str2, str3, str6, str7, str, str5);
            AnonymousClass9YX r15 = r0.A00;
            if (r15 != null) {
                r15.A02("upi-get-p2m-checkout-session");
            }
            Integer A003 = r0.A06.A00("upi-get-p2m-checkout-session");
            C203399nx r4 = r6.A00;
            AnonymousClass00C.A08(r4);
            B1M b1m2 = b1m;
            r2.A0E(new B7N(r0.A01.A00, r0.A00, r0.A05, r15, b1m2, r0, r6, A003), r4, A092, 204, 0);
            return;
        }
        Log.e("PAY: IndiaUpiGetP2mCheckoutSessionAction/getCheckoutSession: lidCompatibleJid is null");
        b1m.BWg(C202059ky.A00());
    }
}
