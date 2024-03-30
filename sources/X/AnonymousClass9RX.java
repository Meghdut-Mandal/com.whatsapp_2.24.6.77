package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9RX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RX {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ Map A02;

    public /* synthetic */ AnonymousClass9RX(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity, Map map) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = map;
        this.A00 = r1;
    }

    public final void A00(C193879Ng r17) {
        String str;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        Map map = this.A02;
        AnonymousClass6C8 r2 = this.A00;
        C193879Ng r5 = r17;
        if (r17 != null) {
            map.put("network_name", C175798b4.A02(r5.A00));
        }
        r2.A01("on_success", map);
        C195219Sy r22 = brazilPayBloksActivity.A0F;
        r22.A00 = r5;
        if (r17 == null || r5.A00 != 5 || (str = r5.A04) == null || !str.equals("0")) {
            r22.A0A.A00(r5);
            r22.A03 = false;
            return;
        }
        String str2 = r5.A06;
        if (str2 != null) {
            C24601Db r52 = r22.A0D;
            String A0t = C36371kC.A0t(r52.A03(), "payment_trusted_device_elo_wallet_store");
            JSONObject jSONObject = null;
            if (A0t != null) {
                try {
                    jSONObject = C36441kJ.A1C(A0t);
                } catch (JSONException unused) {
                    r52.A02.A06("Failed to updated the wallet_id");
                }
            } else {
                jSONObject = C36441kJ.A1B();
            }
            jSONObject.put("wallet_id", str2);
            C36341k9.A0x(C90494aF.A0E(r52), "payment_trusted_device_elo_wallet_store", jSONObject.toString());
        }
        C19970wo r7 = r22.A06;
        C195129Sp r3 = new C195129Sp(r22.A07.A00, r22.A04, r22.A05, r7, r22.A09, r22.A0B, r22.A0C, r22.A0D, r22.A0E, r22.A0F, new C194399Pn(r22), r22.A0G);
        C200049gU r9 = r3.A05;
        AF3 A012 = r9.A01("ELO", "ADD-CARD");
        if (A012 == null) {
            new AnonymousClass9SR(r3.A00, r3.A01, r3.A03, r3.A04, r9, "ADD-CARD").A00(new C23196B9e(r3, 0), "ELO");
            return;
        }
        r3.A00((C202059ky) null, A012);
    }
}
