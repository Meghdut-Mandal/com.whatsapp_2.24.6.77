package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Qf  reason: invalid class name and case insensitive filesystem */
public final class C194559Qf {
    public JSONObject A00;
    public final Map A01;

    public final C13540k2 A00(JSONObject jSONObject, JSONObject jSONObject2) {
        this.A00 = jSONObject2;
        String optString = jSONObject.optString("version");
        AnonymousClass00C.A0B(optString);
        Integer A03 = AnonymousClass097.A03(optString);
        if (A03 == null || A03.intValue() > 1) {
            throw C165617ti.A0S(C165597tg.A0d(), AnonymousClass000.A0p("Unsupported layout version: ", optString, AnonymousClass000.A0u()));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("layout");
        if (optJSONArray == null) {
            return null;
        }
        C13540k2 r5 = new C13540k2();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            C006302t r0 = (C006302t) this.A01.get(optJSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
            if (r0 != null) {
                r5.add(r0.invoke(optJSONObject));
            }
        }
        return AnonymousClass03S.A00(r5);
    }

    public C194559Qf() {
        LinkedHashMap A1G = C36431kI.A1G();
        this.A01 = A1G;
        A1G.put("Rating", AnonymousClass97B.A00(this, 29));
    }
}
