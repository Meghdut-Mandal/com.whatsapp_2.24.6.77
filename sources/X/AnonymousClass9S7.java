package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9S7  reason: invalid class name */
public class AnonymousClass9S7 {
    public AnonymousClass16D A00;
    public C18820ts A01;
    public C202319lY A02;
    public AnonymousClass1FR A03;
    public String A04;

    public void A00(Context context) {
        AnonymousClass16D r0;
        try {
            C18740tg.A06(this.A04);
            C18740tg.A06(this.A01);
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("ref", this.A04);
            A1B.put("locale", this.A01.A07());
            C202319lY r02 = this.A02;
            if (r02 != null) {
                A1B.put("transaction_id", r02.A0K);
                C202319lY r03 = this.A02;
                AnonymousClass16X r5 = r03.A08;
                if (r5 != null) {
                    A1B.put("transaction_amount", AnonymousClass9Zb.A01(this.A01, r03.A03(), r5, 0, true));
                }
                AnonymousClass1FR r1 = this.A03;
                if (r1 != null) {
                    C18820ts r2 = this.A01;
                    A1B.put("transaction_status", C36401kF.A0o(r2.A00, r1.A0C(this.A02)));
                }
                C202319lY r04 = this.A02;
                A1B.put("transaction_status_enum", C203419nz.A03(r04.A03, r04.A02));
                Boolean A06 = this.A02.A06();
                if (A06 != null) {
                    A1B.put("is_transaction_sender", A06);
                }
                UserJid userJid = this.A02.A0D;
                if (!(userJid == null || (r0 = this.A00) == null)) {
                    A1B.put("receiver_name", r0.A0D(userJid).A0K());
                }
            }
            context.startActivity(WaBloksActivity.A07(context, "com.bloks.www.payments.whatsapp.f2care", C36441kJ.A1B().put("params", C36441kJ.A1B().put("server_params", A1B)).toString()));
        } catch (JSONException unused) {
        }
    }
}
