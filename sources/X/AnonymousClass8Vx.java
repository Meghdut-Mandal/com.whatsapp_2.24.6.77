package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8Vx  reason: invalid class name */
public final class AnonymousClass8Vx extends C177038d6 {
    public final AnonymousClass1KK A00;
    public final AnonymousClass9NZ A01;
    public final String A02;

    public AnonymousClass8Vx(C20050ww r15, AnonymousClass1KK r16, C19420v0 r17, AnonymousClass9NZ r18, C20810yC r19, AnonymousClass1WF r20, AnonymousClass005 r21, String str, String str2, AnonymousClass004 r24, AnonymousClass004 r25, long j) {
        super(r15, r17, r19, r20, r21, str, r24, r25, j);
        this.A02 = str2;
        this.A01 = r18;
        this.A00 = r16;
        if (7205331739510454L == j) {
            A07("");
        }
    }

    public String A02() {
        String str = this.A02;
        if (str == null) {
            return null;
        }
        return str;
    }

    public void A08(JSONObject jSONObject) {
        JSONObject A0q = C90464aC.A0q(jSONObject);
        AnonymousClass9NZ r4 = this.A01;
        UserJid userJid = r4.A01;
        AnonymousClass00C.A07(userJid);
        A0q.put("jid", userJid.getRawString());
        A0q.put("product_id", r4.A04);
        A0q.put("width", String.valueOf(r4.A03));
        A0q.put("height", String.valueOf(r4.A02));
        A0q.put("catalog_session_id", r4.A05);
        if (r4.A06) {
            A0q.put("fetch_compliance_info", "true");
        }
        AnonymousClass9W6 r0 = r4.A00;
        if (r0 != null) {
            AnonymousClass9ZK.A00(r0, A0q);
        }
        AnonymousClass9ZK.A01("product", this.A00.A09(userJid), jSONObject, A0q, true);
    }
}
