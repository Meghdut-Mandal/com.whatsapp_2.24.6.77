package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.96R  reason: invalid class name */
public abstract class AnonymousClass96R {
    public static final C175418aS A00(JSONObject jSONObject) {
        String string = jSONObject.getString("brj");
        String string2 = jSONObject.getString("ap");
        String string3 = jSONObject.getString("s");
        long j = jSONObject.getLong("ct");
        List list = null;
        String A01 = AnonymousClass6HO.A01("tb_t", (String) null, jSONObject);
        int optInt = jSONObject.optInt("tb_a", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("cf");
        boolean optBoolean = jSONObject.optBoolean("lrt");
        boolean optBoolean2 = jSONObject.optBoolean("cde");
        boolean optBoolean3 = jSONObject.optBoolean("aae");
        if (optJSONArray != null) {
            list = C54092sO.A00(optJSONArray);
        }
        C222813r r0 = UserJid.Companion;
        UserJid A012 = C222813r.A01(string);
        if (A01 == null) {
            A01 = "";
        }
        AnonymousClass00C.A0B(string2);
        AnonymousClass00C.A0B(string3);
        return new C175418aS(A012, string2, string3, A01, list, optInt, j, optBoolean, optBoolean2, optBoolean3);
    }
}
