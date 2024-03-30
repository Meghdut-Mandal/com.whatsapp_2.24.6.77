package X;

import org.json.JSONObject;

/* renamed from: X.2Ud  reason: invalid class name */
public final class AnonymousClass2Ud extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        String str;
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("fx_waffle_unpause_nonce");
        if (optJSONObject != null) {
            str = C36411kG.A10("auth_blob", optJSONObject);
        } else {
            str = "";
        }
        this.A00 = new C62693Hd(str);
    }
}
