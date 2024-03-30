package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.5AD  reason: invalid class name */
public final class AnonymousClass5AD extends C132286Sy {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AD(JSONObject jSONObject) {
        super(jSONObject);
        AnonymousClass00C.A0D(jSONObject, 1);
        JSONObject optJSONObject = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (optJSONObject != null) {
            this.A00 = optJSONObject.optInt("error_code", 417);
            optJSONObject.optBoolean("is_retryable");
        }
    }
}
