package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9fM  reason: invalid class name and case insensitive filesystem */
public class C199469fM {
    public SharedPreferences A00;
    public final C24611Dc A01 = C165607th.A0c("PaymentProviderKeySharedPrefs", "infra");
    public final C19890wg A02;

    public static synchronized SharedPreferences A00(C199469fM r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("com.whatsapp_payment_provider_key_preferences");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C199469fM(C19890wg r3) {
        this.A02 = r3;
    }

    public AF3 A01(String str, String str2) {
        Long l;
        String str3 = str;
        String str4 = str2;
        String string = A00(this).getString(AnonymousClass000.A0p("::", str2, AnonymousClass000.A0v(str)), (String) null);
        if (TextUtils.isEmpty(string)) {
            this.A01.A04(AnonymousClass000.A0q(" is null", C36331k8.A0k("getProviderKey/provider=", str)));
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(string);
            String optString = A1C.optString("key_type");
            String optString2 = A1C.optString("key_version");
            String optString3 = A1C.optString("key_data");
            if (!TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(optString2) && ("none".equals(optString) || !TextUtils.isEmpty(optString3))) {
                    String optString4 = A1C.optString("key_expiry");
                    byte[] decode = Base64.decode(optString3, 2);
                    if (TextUtils.isEmpty(optString4)) {
                        l = null;
                    } else {
                        l = C165597tg.A0f(optString4);
                    }
                    return new AF3(l, str3, str4, optString, optString2, decode);
                }
            }
            StringBuilder A0i = C90524aI.A0i(C24611Dc.A01("PaymentProviderKeySharedPrefs", AnonymousClass000.A0q(" providerKey is null", C36331k8.A0k("getProviderKey/provider=", str))));
            if (TextUtils.isEmpty(optString)) {
                A0i.append(" keyType is null");
            }
            if (TextUtils.isEmpty(optString2)) {
                A0i.append(" keyVersion is null");
            }
            if (!"none".equals(optString) && TextUtils.isEmpty(optString3)) {
                A0i.append(" keyData is null");
            }
            C90504aG.A1G(A0i);
            return null;
        } catch (JSONException e) {
            this.A01.A0A(AnonymousClass000.A0q(" threw: ", C36331k8.A0k("getProviderKey/provider=", str)), e);
            return null;
        }
    }

    public void A02(String str, String str2) {
        C36341k9.A0u(A00(this).edit(), AnonymousClass000.A0p("::", str2, AnonymousClass000.A0v(str)));
    }
}
