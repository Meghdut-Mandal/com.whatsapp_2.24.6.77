package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3oP  reason: invalid class name and case insensitive filesystem */
public final class C76153oP implements AnonymousClass1I9 {
    public /* bridge */ /* synthetic */ Object B7h(String str) {
        AnonymousClass00C.A0D(str, 0);
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            C222813r r0 = UserJid.Companion;
            UserJid A01 = C222813r.A01(A1C.getString("KEY_JID"));
            JSONObject jSONObject = A1C.getJSONObject("KEY_DATA");
            AnonymousClass00C.A0B(jSONObject);
            return new AnonymousClass3II(A01, jSONObject);
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: CtwaTrustSignalStoreStore/fromData/JSONException", e);
        } catch (C19740wR e2) {
            throw new AnonymousClass1ID("CTWA: CtwaTrustSignalStoreStore/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String Bvg(Object obj) {
        AnonymousClass3II r4 = (AnonymousClass3II) obj;
        AnonymousClass00C.A0D(r4, 0);
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("KEY_JID", r4.A00.getRawString());
            A1B.put("KEY_DATA", r4.A01);
            String obj2 = A1B.toString();
            AnonymousClass00C.A0B(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: CtwaTrustSignalStoreStore/toData/JSONException", e);
        }
    }
}
