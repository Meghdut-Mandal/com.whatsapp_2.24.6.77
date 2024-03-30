package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.74s  reason: invalid class name and case insensitive filesystem */
public class C1502974s implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public final int A09;

    public C1502974s(C122525uz r2, Jid jid, Integer num, Integer num2, String str, String str2, String str3, int i) {
        this.A09 = 0;
        this.A00 = 4;
        this.A01 = i;
        this.A06 = str;
        this.A02 = num;
        this.A03 = jid;
        this.A04 = r2;
        this.A05 = num2;
        this.A07 = str2;
        this.A08 = str3;
    }

    public final void run() {
        String str;
        C122545v1 r3;
        int i;
        if (this.A09 != 0) {
            C1265464l r4 = (C1265464l) this.A02;
            C1259461y r32 = (C1259461y) this.A03;
            int i2 = this.A00;
            JSONObject jSONObject = (JSONObject) this.A04;
            try {
                r32.A00(r4.A00((AnonymousClass6VU) this.A05, this.A06, this.A07, this.A08, jSONObject, i2, this.A01));
            } catch (Exception e) {
                AnonymousClass6VU r5 = r32.A00;
                r5.A0E(C90484aE.A0k(e));
                if (e instanceof JSONException) {
                    r5.A02.A0E("GraphApiACSNetworkRequest/createResponseCallback/onError: Error while parsing the JSON: ", e.getMessage(), true);
                    r3 = r32.A01;
                    i = 2;
                } else if (e instanceof IOException) {
                    Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError", e);
                    r3 = r32.A01;
                    r3.A00 = 1;
                    C36341k9.A0H().post(new C81193wc(r5, r3, 46));
                } else {
                    Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError: generic error - ", e);
                    r3 = r32.A01;
                    i = 3;
                }
                r3.A00 = i;
                C36341k9.A0H().post(new C81193wc(r5, r3, 46));
            }
        } else {
            int i3 = this.A01;
            String str2 = this.A06;
            Jid jid = (Jid) this.A03;
            C122525uz r6 = (C122525uz) this.A04;
            Integer num = (Integer) this.A05;
            String str3 = this.A07;
            String str4 = this.A08;
            AnonymousClass58T r2 = new AnonymousClass58T();
            r2.A02 = 4;
            r2.A03 = Integer.valueOf(i3);
            r2.A07 = str2;
            r2.A00 = (Integer) this.A02;
            if (jid != null) {
                str = r6.A02.A00(jid);
            } else {
                str = null;
            }
            r2.A04 = str;
            if (r6.A00.A0E(6381)) {
                if (num != null && num.intValue() == 2) {
                    num = C36381kD.A0m();
                }
                r2.A01 = num;
                r2.A06 = str3;
                r2.A05 = str4;
            }
            r6.A01.Blv(r2);
        }
    }

    public C1502974s(C1259461y r4, AnonymousClass6VU r5, C1265464l r6, String str, String str2, String str3, JSONObject jSONObject) {
        this.A09 = 1;
        this.A02 = r6;
        this.A03 = r4;
        this.A00 = 19;
        this.A04 = jSONObject;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = 19;
        this.A05 = r5;
    }
}
