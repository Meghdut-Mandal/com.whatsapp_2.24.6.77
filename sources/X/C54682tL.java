package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2tL  reason: invalid class name and case insensitive filesystem */
public abstract class C54682tL {
    public static final C63363Jt A00(JSONObject jSONObject) {
        String string = jSONObject.getString("session_id");
        String string2 = jSONObject.getString("business_jid");
        String string3 = jSONObject.getString("business_session_id");
        long j = jSONObject.getLong("survey_start_timestamp");
        JSONObject jSONObject2 = jSONObject.getJSONObject("conversion_info");
        AnonymousClass00C.A08(jSONObject2);
        C63493Kg A00 = C54672tK.A00(jSONObject2);
        AnonymousClass00C.A0B(string);
        C222813r r0 = UserJid.Companion;
        UserJid A01 = C222813r.A01(string2);
        AnonymousClass00C.A0B(string3);
        return new C63363Jt(A00, A01, string, string3, j);
    }
}
