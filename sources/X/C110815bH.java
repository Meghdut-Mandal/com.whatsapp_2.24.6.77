package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5bH  reason: invalid class name and case insensitive filesystem */
public abstract class C110815bH {
    public static final C128716Di A00(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        String[] strArr = null;
        if (optJSONObject == null || (jSONObject2 = optJSONObject.optJSONObject("metadata")) == null) {
            jSONObject2 = jSONObject;
        }
        String A10 = C36411kG.A10("flow_id", jSONObject);
        String A00 = C63893Lv.A00("data_api_version", jSONObject2, true);
        String A002 = C63893Lv.A00("state", jSONObject2, false);
        String A003 = C63893Lv.A00("flow_version_ids", jSONObject2, true);
        String A004 = C63893Lv.A00("psl_cdn_url", jSONObject2, true);
        String A005 = C63893Lv.A00("psl_signature", jSONObject2, true);
        JSONArray optJSONArray = jSONObject2.optJSONArray("categories");
        if (optJSONArray != null) {
            String[] A1b = C36431kI.A1b(C15060md.A00(new C12790if(new C154577Ss(optJSONArray), C90514aH.A0X(C15040mb.A05(0, optJSONArray.length())))));
            if (A1b != null) {
                strArr = A1b;
                return new C128716Di(A10, A00, A002, A003, A004, A005, strArr, jSONObject2.optInt("well_version", 0));
            }
        }
        String A006 = C63893Lv.A00("categories", jSONObject2, false);
        if (A006 != null) {
            strArr = C36431kI.A1b(C90504aG.A0v(A006, "\\s*,\\s*", 0));
        }
        return new C128716Di(A10, A00, A002, A003, A004, A005, strArr, jSONObject2.optInt("well_version", 0));
    }
}
