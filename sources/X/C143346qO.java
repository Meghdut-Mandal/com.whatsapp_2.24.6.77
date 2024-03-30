package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6qO  reason: invalid class name and case insensitive filesystem */
public final class C143346qO implements C158087fm {
    public final Map A00;

    public C143346qO(Map map) {
        AnonymousClass00C.A0D(map, 1);
        this.A00 = map;
    }

    public void Blq(AnonymousClass67W r12, C134906bn r13, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        Object obj;
        String str7 = str;
        AnonymousClass00C.A0D(str, 0);
        String str8 = "";
        String str9 = null;
        int i = -1;
        AnonymousClass67W r3 = r12;
        if (str2 != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str2);
                JSONObject optJSONObject = A1C.optJSONObject("server_params");
                JSONObject optJSONObject2 = A1C.optJSONObject("client_input_params");
                if (optJSONObject != null) {
                    str8 = optJSONObject.optString("flow");
                    if (((((str8 == null || str8.length() == 0) && (str8 = optJSONObject.optString("linking_entry_point")) == null) || str8.length() == 0) && (str8 = optJSONObject.optString("entryPoint")) == null) || str8.length() == 0) {
                        str8 = optJSONObject.optString("entry_point");
                    }
                    AnonymousClass00C.A0B(str8);
                    int optInt = optJSONObject.optInt("target_acct_type", -1);
                    if (-1 == optInt) {
                        optInt = optJSONObject.optInt("account_type", -1);
                    }
                    if (-1 == optInt) {
                        optInt = optJSONObject.optInt("target_account_type", -1);
                    }
                    i = optInt;
                    str6 = C36411kG.A10("access_token", optJSONObject);
                    str5 = optJSONObject.optString("logging_event");
                    if (str5 == null || str5.length() == 0) {
                        str5 = optJSONObject.optString("event");
                    }
                    AnonymousClass00C.A0B(str5);
                    if (str5.length() == 0) {
                        str5 = null;
                    }
                    str4 = optJSONObject.optString("opaque_target");
                    AnonymousClass00C.A0B(str4);
                    if (str4.length() == 0) {
                        str4 = null;
                    }
                } else {
                    str6 = str8;
                    str4 = null;
                    str5 = null;
                }
                if (optJSONObject2 != null) {
                    str9 = optJSONObject2.optString("web_auth_data");
                    AnonymousClass00C.A0B(str9);
                    if (str9.length() == 0) {
                        str9 = null;
                    }
                }
            } catch (JSONException e) {
                r12.A00(e);
                return;
            }
        } else {
            str6 = str8;
            str5 = null;
            str4 = null;
        }
        if (str.equals("com.bloks.www.fxcal.waffle.nta.reg.async") || C90494aF.A1Z(str, "nta")) {
            Log.i("AccountLinkingCustomBloksRequest/fetchV3/NTA");
            obj = this.A00.get("DI_KEY_NTA_BLOKS_FETCHER");
            if (obj == null) {
                throw AnonymousClass001.A09("Required value was null.");
            }
        } else {
            Log.i("AccountLinkingCustomBloksRequest/fetchV3/default");
            obj = this.A00.get("DI_KEY_PRE_CONSENT_BLOKS_FETCHER");
            if (obj == null) {
                throw AnonymousClass001.A09("Required value was null.");
            }
        }
        ((AnonymousClass7i2) obj).B7B(new C128726Dj(r3, str7, str8, str6, str5, str9, str4, i));
    }
}
