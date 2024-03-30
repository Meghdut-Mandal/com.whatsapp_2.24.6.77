package X;

import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3MQ  reason: invalid class name */
public abstract class AnonymousClass3MQ {
    public static final String A00(C20810yC r8, AnonymousClass11F r9, String str) {
        JSONArray optJSONArray;
        AnonymousClass00C.A0D(r9, 1);
        AnonymousClass00C.A0D(str, 2);
        if (r8.A0E(4603)) {
            String A19 = C36431kI.A19(r8, 4602);
            String str2 = r9.user;
            int i = 0;
            if (AnonymousClass000.A1R(A19.length())) {
                try {
                    JSONObject optJSONObject = C36441kJ.A1C(A19).optJSONObject("merchant_config");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(str2)) != null) {
                        int length = optJSONArray.length();
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            String optString = jSONObject.optString("url");
                            if (AnonymousClass14B.A0F(optString) || !C36361kB.A1Z(str, Pattern.compile(optString))) {
                                i++;
                            } else {
                                String optString2 = jSONObject.optString("experience");
                                if ("webview".equalsIgnoreCase(optString2) || "browser_tab".equalsIgnoreCase(optString2)) {
                                    AnonymousClass00C.A0B(optString2);
                                    return optString2;
                                }
                            }
                        }
                    }
                } catch (JSONException unused) {
                    Log.e("TemplateMessageUrlWebViewUtils/isExperienceEnabled json exception");
                }
            }
        }
        return "external_browser";
    }

    public static final boolean A01(C20810yC r9, AnonymousClass11F r10, String str) {
        AnonymousClass00C.A0D(str, 2);
        if (r9.A0E(3609)) {
            try {
                String A19 = C36431kI.A19(r9, 3606);
                if (A19.length() > 0) {
                    JSONObject A1C = C36441kJ.A1C(A19);
                    JSONArray jSONArray = A1C.getJSONArray("merchant_list");
                    JSONArray jSONArray2 = A1C.getJSONArray("url_regex_list");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (AnonymousClass00C.A0J(r10.user, jSONArray.getString(i))) {
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                if (C36361kB.A1Z(str, Pattern.compile(jSONArray2.getString(i2)))) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (JSONException unused) {
                Log.e("TemplateMessageUrlWebViewUtils/isButtonUrlOpenInWebviewEnabled JSONException");
            } catch (PatternSyntaxException unused2) {
                Log.e("TemplateMessageUrlWebViewUtils/isButtonUrlOpenInWebviewEnabled PatternSyntaxException");
                return false;
            }
        }
        return false;
    }
}
