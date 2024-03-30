package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1IK  reason: invalid class name */
public final class AnonymousClass1IK implements AnonymousClass1I9 {
    public /* bridge */ /* synthetic */ Object B7h(String str) {
        AnonymousClass00C.A0D(str, 0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("uj");
            String string2 = jSONObject.getString("s");
            long j = jSONObject.getLong("ct");
            String A01 = AnonymousClass6HO.A01("a", (String) null, jSONObject);
            long optLong = jSONObject.optLong("fmts", -1);
            boolean optBoolean = jSONObject.optBoolean("wdtb", false);
            C222813r r0 = UserJid.Companion;
            UserJid A012 = C222813r.A01(string);
            AnonymousClass00C.A0B(string2);
            return new C175408aR(A012, string2, A01, j, optLong, optBoolean);
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: OrganicEntryPointTransformer/fromData/JSONException", e);
        } catch (C19740wR e2) {
            throw new AnonymousClass1ID("CTWA: OrganicEntryPointTransformer/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String Bvg(Object obj) {
        C175408aR r7 = (C175408aR) obj;
        AnonymousClass00C.A0D(r7, 0);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uj", r7.A00.getRawString());
            jSONObject.put("s", r7.A03);
            String str = r7.A02;
            if (!(str == null || str.length() == 0)) {
                jSONObject.put("a", str);
            }
            jSONObject.put("ct", r7.A00);
            long j = r7.A01;
            if (j != -1) {
                jSONObject.put("fmts", j);
            }
            jSONObject.put("wdtb", r7.A04);
            String obj2 = jSONObject.toString();
            AnonymousClass00C.A08(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: OrganicEntryPointTransformer/toData/JSONException", e);
        }
    }
}
