package X;

import org.json.JSONObject;

/* renamed from: X.8d4  reason: invalid class name and case insensitive filesystem */
public final class C177018d4 extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("fx_native_auth_secure_nonce");
        if (optJSONObject != null) {
            optJSONObject.optString("nonce");
            optJSONObject.optString("account_id");
        }
        this.A00 = new C1902197i();
    }
}
