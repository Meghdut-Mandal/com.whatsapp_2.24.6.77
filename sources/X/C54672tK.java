package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2tK  reason: invalid class name and case insensitive filesystem */
public abstract class C54672tK {
    public static final C63493Kg A00(JSONObject jSONObject) {
        String string = jSONObject.getString("business_jid");
        String string2 = jSONObject.getString("business_type");
        String string3 = jSONObject.getString("conversion_event_type");
        long j = jSONObject.getLong("conversion_event_timestamp");
        C222813r r0 = UserJid.Companion;
        UserJid A01 = C222813r.A01(string);
        AnonymousClass00C.A0B(string2);
        C51272nY valueOf = C51272nY.valueOf(string2);
        AnonymousClass00C.A0B(string3);
        return new C63493Kg(valueOf, C51102nH.valueOf(string3), A01, j);
    }
}
