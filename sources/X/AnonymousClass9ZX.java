package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ZX  reason: invalid class name */
public abstract class AnonymousClass9ZX {
    public static final C206359tF A00(C203399nx r9) {
        C206269sz r4;
        try {
            String A0h = r9.A0h("step_up_id");
            String A0h2 = r9.A0h("service");
            boolean A1S = AnonymousClass000.A1S(r9.A0S("sticky_service_hub_cta", 1), 1);
            String A0x = C36391kE.A0x(r9, "step_up_reason");
            C203399nx A0d = r9.A0d("step_up_challenge");
            String A0h3 = A0d.A0h("challenge_id");
            C203399nx A0a = A0d.A0a();
            String str = A0a.A00;
            if (str.equals("webview")) {
                boolean z = true;
                try {
                    if (A0a.A0S("auth_required", 1) != 1) {
                        z = false;
                    }
                    r4 = new C178748hC(A0h3, z);
                } catch (C235919b e) {
                    Log.e("PAY: Can't build WebViewChallenge ", e);
                }
            } else {
                if (str.equals("document_upload")) {
                    r4 = new C178738hB(A0h3);
                }
                r4 = null;
            }
            return new C206359tF(r4, A0h2, A0h, A0x, A1S);
        } catch (C235919b e2) {
            Log.e("PAY: PaymentStepUpInfo/fromProtocolTreeNode ", e2);
            return null;
        }
    }

    public static final C206359tF A01(String str) {
        C206269sz r4;
        if (!AnonymousClass098.A06(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                String string = A1C.getString("service");
                String string2 = A1C.getString("step_up_id");
                boolean optBoolean = A1C.optBoolean("sticky_service_hub_cta", true);
                JSONObject jSONObject = A1C.getJSONObject("step_up_challenge");
                try {
                    String string3 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (string3.equals("WEBVIEW")) {
                        try {
                            r4 = new C178748hC(jSONObject.getString("challenge_id"), jSONObject.getBoolean("auth_required"));
                        } catch (JSONException e) {
                            Log.e("PAY: WebViewChallenge fromJsonObject threw exception ", e);
                        }
                        String optString = A1C.optString("step_up_reason", (String) null);
                        AnonymousClass00C.A0B(string);
                        AnonymousClass00C.A0B(string2);
                        return new C206359tF(r4, string, string2, optString, optBoolean);
                    }
                    if (string3.equals("DOC_UPLOAD")) {
                        try {
                            r4 = new C178738hB(jSONObject.getString("challenge_id"));
                        } catch (JSONException e2) {
                            Log.e("PAY: DocumentUploadChallenge fromJsonObject threw exception ", e2);
                        }
                        String optString2 = A1C.optString("step_up_reason", (String) null);
                        AnonymousClass00C.A0B(string);
                        AnonymousClass00C.A0B(string2);
                        return new C206359tF(r4, string, string2, optString2, optBoolean);
                    }
                    r4 = null;
                    String optString22 = A1C.optString("step_up_reason", (String) null);
                    AnonymousClass00C.A0B(string);
                    AnonymousClass00C.A0B(string2);
                    return new C206359tF(r4, string, string2, optString22, optBoolean);
                } catch (JSONException e3) {
                    Log.e("PAY: PaymentStepUpChallenge fromJsonObject threw exception ", e3);
                }
            } catch (JSONException e4) {
                Log.e("PAY: PaymentStepUpInfo fromJsonString threw exception ", e4);
            }
        }
        return null;
    }
}
