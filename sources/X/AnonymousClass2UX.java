package X;

import org.json.JSONObject;

/* renamed from: X.2UX  reason: invalid class name */
public final class AnonymousClass2UX extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        C594433y r4;
        String optString;
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("fx_foa_to_waffle_data");
        String str = "";
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("password_certificate");
            if (optJSONObject2 == null) {
                r4 = new C594433y(0, str);
            } else {
                int optInt = optJSONObject2.optInt("key_id");
                String A10 = C36411kG.A10("public_key_pem", optJSONObject2);
                optJSONObject2.optInt("ttl");
                r4 = new C594433y(optInt, A10);
            }
            String A102 = C36411kG.A10("account_id", optJSONObject);
            String A103 = C36411kG.A10("auth_blob", optJSONObject);
            String A104 = C36411kG.A10("phone_number", optJSONObject);
            if ("null".equals(optJSONObject.optString("profile_pic_url"))) {
                optString = str;
            } else {
                optString = optJSONObject.optString("profile_pic_url");
            }
            AnonymousClass00C.A0B(optString);
            if (!"null".equals(optJSONObject.optString("foa_profile_name"))) {
                str = optJSONObject.optString("foa_profile_name");
            }
            AnonymousClass00C.A0B(str);
            this.A00 = new C608039k(r4, A102, A103, A104, optString, str);
            return;
        }
        this.A00 = new C608039k(new C594433y(0, str), str, str, str, str, str);
    }
}
