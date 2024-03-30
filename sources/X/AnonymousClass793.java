package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.793  reason: invalid class name */
public class AnonymousClass793 extends HashMap<String, String> {
    public final /* synthetic */ C1510877z this$0;
    public final /* synthetic */ JSONObject val$profileObj;

    public AnonymousClass793(C1510877z r3, JSONObject jSONObject) {
        this.this$0 = r3;
        this.val$profileObj = jSONObject;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
        put("profile_pic_url", jSONObject.getString("pic_square"));
        put("resolver_type", "content_provider");
    }
}
