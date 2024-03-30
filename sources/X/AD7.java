package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

public final class AD7 implements B2T {
    public final JSONObject A00;
    public final JSONObject A01;

    public final boolean A00() {
        String str;
        JSONObject jSONObject = this.A00;
        if (jSONObject != null) {
            str = jSONObject.optString("severity");
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("critical");
    }

    public int B9n() {
        JSONObject jSONObject = this.A00;
        if (jSONObject != null) {
            return jSONObject.optInt("error_code");
        }
        return 417;
    }

    public String BB3() {
        String optString = this.A01.optString("message");
        if (optString == null) {
            return "";
        }
        return optString;
    }

    public AD7(JSONObject jSONObject) {
        this.A01 = jSONObject;
        this.A00 = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public String B9T() {
        return "EXTENSION";
    }
}
