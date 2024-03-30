package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Sy  reason: invalid class name and case insensitive filesystem */
public class C132286Sy {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public JSONObject A04;
    public final String A05;
    public final String A06;
    public final JSONArray A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C132286Sy(JSONObject jSONObject) {
        String str;
        try {
            this.A01 = jSONObject.getInt("code");
        } catch (JSONException unused) {
            this.A01 = 0;
        }
        try {
            this.A02 = jSONObject.getInt("error_subcode");
        } catch (JSONException unused2) {
            this.A02 = 0;
        }
        try {
            this.A00 = jSONObject.getInt("api_error_code");
        } catch (JSONException unused3) {
            this.A00 = 0;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        this.A07 = optJSONArray;
        String A012 = AnonymousClass6HO.A01("message", (String) null, jSONObject);
        this.A06 = A012;
        this.A09 = jSONObject.optBoolean("is_silent");
        this.A0A = jSONObject.optBoolean("is_transient");
        this.A05 = AnonymousClass6HO.A01("description", (String) null, jSONObject);
        this.A0B = jSONObject.optBoolean("requires_reauth");
        this.A08 = jSONObject.optBoolean("allow_user_retry");
        try {
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                str = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            } else if (jSONObject.has("exception")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("exception");
                AnonymousClass00C.A0D(jSONObject2, 0);
                str = AnonymousClass6HO.A01("class", (String) null, jSONObject2);
                if (jSONObject.getJSONObject("exception").has("message")) {
                    StringBuilder A0v = AnonymousClass000.A0v(str);
                    A0v.append("::");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("exception");
                    AnonymousClass00C.A0D(jSONObject3, 0);
                    str = AnonymousClass000.A0q(AnonymousClass6HO.A01("message", (String) null, jSONObject3), A0v);
                }
            } else {
                str = null;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            str = null;
        }
        this.A03 = str;
        this.A04 = C36441kJ.A1B();
        String A013 = AnonymousClass6HO.A01("www_request_id", (String) null, jSONObject);
        if (AnonymousClass6HO.A01("fbtrace_id", (String) null, jSONObject) != null) {
            this.A04.put("fbtrace_id", AnonymousClass6HO.A01("fbtrace_id", (String) null, jSONObject));
        }
        if (A013 != null) {
            this.A04.put("www_request_id", AnonymousClass6HO.A01("www_request_id", (String) null, jSONObject));
        }
        if (optJSONArray != null) {
            JSONObject jSONObject4 = this.A04;
            StringBuilder A0u = AnonymousClass000.A0u();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    A0u.append(optJSONArray.get(i));
                    if (i < optJSONArray.length() - 1) {
                        A0u.append(",");
                    }
                } catch (JSONException e2) {
                    Log.e(e2.getMessage());
                }
            }
            C90504aG.A1J(A0u, "path", jSONObject4);
        }
        if (this.A03 == null) {
            this.A03 = A012;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GraphqlError{code=");
        A0u.append(this.A01);
        A0u.append(", errorSubCode='");
        A0u.append(this.A02);
        A0u.append('\'');
        A0u.append(", message='");
        A0u.append(this.A06);
        A0u.append('\'');
        A0u.append(", isSilent=");
        A0u.append(this.A09);
        A0u.append(", description='");
        A0u.append(this.A05);
        A0u.append('\'');
        A0u.append(", isTransient=");
        A0u.append(this.A0A);
        A0u.append(", requiresReAuth=");
        A0u.append(this.A0B);
        A0u.append(", allowUserRetry=");
        A0u.append(this.A08);
        return AnonymousClass000.A0s(A0u);
    }

    public C132286Sy(String str, String str2) {
        this.A03 = str;
        this.A01 = -20;
        this.A07 = null;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A08 = false;
        this.A06 = null;
        this.A05 = null;
    }

    public C132286Sy(String str) {
        this.A01 = -1;
        this.A06 = str;
        this.A05 = str;
        this.A07 = null;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A08 = false;
    }
}
