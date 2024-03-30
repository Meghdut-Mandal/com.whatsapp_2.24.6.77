package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2uJ  reason: invalid class name and case insensitive filesystem */
public abstract class C55242uJ {
    public static C62963If A00(JSONArray jSONArray) {
        Object obj = jSONArray.get(1);
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type org.json.JSONObject");
        return A01((JSONObject) obj);
    }

    public static final C62963If A01(JSONObject jSONObject) {
        int i;
        String str;
        AnonymousClass00C.A0D(jSONObject, 0);
        Object obj = jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2.has("error_code")) {
            Object obj2 = jSONObject2.get("error_code");
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Int");
            i = AnonymousClass000.A0I(obj2);
        } else {
            i = 405;
        }
        if (jSONObject2.has("description")) {
            Object obj3 = jSONObject2.get("description");
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.String");
            str = (String) obj3;
        } else {
            str = "";
        }
        return new C62963If(i, str);
    }
}
