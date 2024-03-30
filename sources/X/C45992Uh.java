package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Uh  reason: invalid class name and case insensitive filesystem */
public class C45992Uh extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        String str;
        AnonymousClass3HW r2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("xwa_linked_business_account_posts");
        JSONObject optJSONObject = jSONObject2.optJSONObject("linked_ig_professional");
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("linked_fb_page");
        AnonymousClass3HW r3 = null;
        if (optJSONObject != null) {
            r2 = A00(optJSONObject);
            str = A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, optJSONObject);
        } else {
            str = null;
            r2 = null;
        }
        if (optJSONObject2 != null) {
            r3 = A00(optJSONObject2);
        }
        this.A00 = new AnonymousClass3JC(r3, r2, str);
    }

    private AnonymousClass3HW A00(JSONObject jSONObject) {
        ArrayList A0I = AnonymousClass001.A0I();
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.has("posts")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("posts");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String A01 = A01("title", jSONObject3);
                String string = jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String A012 = A01("post_url", jSONObject3);
                long parseLong = Long.parseLong(jSONObject3.getString("creation_time_ms"));
                ArrayList A0I2 = AnonymousClass001.A0I();
                if (jSONObject3.has("images")) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("images");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("original_dimensions");
                        A0I2.add(new C206759tv(jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject4.getString("original_image_url"), A01("request_image_url", jSONObject4), jSONObject5.getInt("height"), jSONObject5.getInt("width")));
                    }
                }
                A0I.add(new C63373Ju(string, A01, A012, A0I2, parseLong));
            }
        }
        return new AnonymousClass3HW(A0I);
    }

    public static String A01(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
            return null;
        }
        return optString;
    }
}
