package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.6qU  reason: invalid class name and case insensitive filesystem */
public final class C143406qU implements C159267j5 {
    public static final C143406qU A00 = new C143406qU();

    public /* bridge */ /* synthetic */ Object B7i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        UserJid A02 = UserJid.Companion.A02(jSONObject.optString("jid"));
        String optString = jSONObject.optString("persona_id");
        if (A02 != null) {
            return new C1277169j(A02, optString);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ JSONObject Bvo(Object obj) {
        C1277169j r4 = (C1277169j) obj;
        JSONObject A0q = C90464aC.A0q(r4);
        A0q.put("jid", r4.A00.getRawString());
        A0q.put("persona_id", r4.A01);
        return A0q;
    }
}
