package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.791  reason: invalid class name */
public class AnonymousClass791 extends HashMap<String, String> {
    public final /* synthetic */ AnonymousClass6S0 this$0;
    public final /* synthetic */ JSONObject val$jsonProfile;

    public AnonymousClass791(AnonymousClass6S0 r3, JSONObject jSONObject) {
        this.this$0 = r3;
        this.val$jsonProfile = jSONObject;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
    }
}
