package X;

import org.json.JSONObject;

public class AF5 implements C23075B3f {
    public String A00 = "BR";
    public final C19730wQ A01;
    public final C21010yW A02;
    public final AnonymousClass1EV A03;
    public final C24641Df A04;
    public final C1271267b A05;

    public void BOn(Integer num, Integer num2, String str, String str2, boolean z) {
        BOm(num, num2, str, (String) null);
    }

    public void Buu() {
    }

    public C176658cT B4W() {
        C176658cT r1 = new C176658cT();
        r1.A0V = this.A05.A00();
        String A002 = AnonymousClass1EV.A00(C36441kJ.A0n(this.A01));
        if (A002 != null) {
            this.A00 = A002;
        }
        r1.A0R = this.A00;
        return r1;
    }

    public void BOZ(C21667AUj aUj, Integer num, Integer num2, String str, String str2) {
        int i;
        C176488cC r1 = new C176488cC();
        r1.A01 = num;
        r1.A08 = str;
        if (num2 != null) {
            r1.A00 = num2;
        }
        r1.A06 = str2;
        if (aUj != null) {
            r1.A05 = aUj.A06;
            r1.A07 = aUj.A08;
            r1.A04 = aUj.A05;
            r1.A02 = Integer.valueOf(aUj.A01);
            i = 1;
        } else {
            i = 2;
        }
        r1.A03 = Integer.valueOf(i);
        this.A02.Bly(r1);
    }

    public void BOb(C202059ky r4, int i) {
        C21010yW r2 = this.A02;
        C176658cT B4W = B4W();
        B4W.A0C = Integer.valueOf(C176658cT.A00(B4W, r4, i));
        B4W.A08 = C36371kC.A0n();
        r2.Bly(B4W);
    }

    public void BOl(C176658cT r2) {
        r2.A0V = this.A05.A00();
        r2.A0R = this.A00;
        this.A02.Bly(r2);
    }

    public void BOq(C131606Ps r2, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        BOp(r2, num, num2, "payment_transaction_details", str2);
    }

    public void reset() {
        C165587tf.A1B(this.A05);
    }

    public AF5(C19730wQ r2, C21010yW r3, AnonymousClass1EV r4, C24641Df r5, C1271267b r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        C202159l8 r0 = C202159l8.A0E;
    }

    public void BOm(Integer num, Integer num2, String str, String str2) {
        C176658cT B4W = B4W();
        B4W.A0b = str;
        B4W.A08 = num;
        if (num2 != null) {
            B4W.A07 = num2;
        }
        if (str2 != null) {
            B4W.A0a = str2;
        }
        this.A02.Bly(B4W);
    }

    public void BOp(C131606Ps r5, Integer num, Integer num2, String str, String str2) {
        C176658cT B4W = B4W();
        B4W.A0b = str;
        B4W.A08 = num;
        if (num2 != null) {
            B4W.A07 = num2;
        }
        if (str2 != null) {
            B4W.A0a = str2;
        }
        if (r5 != null) {
            JSONObject jSONObject = r5.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                B4W.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            C165587tf.A18(B4W, r5, jSONObject);
        }
        this.A02.Bly(B4W);
    }
}
