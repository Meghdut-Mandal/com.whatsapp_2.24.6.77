package X;

import com.whatsapp.util.Log;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6UB  reason: invalid class name */
public abstract class AnonymousClass6UB {
    public static void A01(C104565Ae r4, String str, boolean z) {
        String str2;
        int i = -1;
        if (!z) {
            List A0o = C90524aI.A0o("Retry-After", r4.A01.getHeaderFields());
            if (A0o == null || A0o.isEmpty()) {
                str2 = "drive-util/getRetryAfter/no retry after header";
            } else {
                if (A0o.size() != 1) {
                    C36321k7.A1J(A0o, "drive-util/getRetryAfter/too many retry after headers: ", AnonymousClass000.A0u());
                }
                String str3 = (String) C36391kE.A0t(A0o);
                i = AnonymousClass6R8.A00(str3, -1);
                if (i < 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("drive-util/getRetryAfter/invalid retry after (");
                    A0u.append(str3);
                    str2 = C90474aD.A0f(A0u);
                }
            }
            Log.e(str2);
        }
        String A0h = C90474aD.A0h(r4.A00);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("drive-util/");
        A0u2.append(str);
        A0u2.append("/too-many-requests (");
        A0u2.append(A0h);
        C36321k7.A1U(") retry-after=", A0u2, i);
        throw new C101894yS(A0h, i);
    }

    public static void A00(C104565Ae r4, String str, boolean z) {
        try {
            String A0h = C90474aD.A0h(r4.A00);
            if (A0h != null) {
                JSONObject jSONObject = C36441kJ.A1C(A0h).getJSONObject("error").getJSONArray("details").getJSONObject(0);
                AnonymousClass00C.A0D(jSONObject, 0);
                if ("ACCOUNT_OUT_OF_STORAGE_QUOTA".equals(AnonymousClass6HO.A01("reason", (String) null, jSONObject))) {
                    throw new C101794yI();
                }
            }
        } catch (JSONException e) {
            C36321k7.A1J(e, "gdrive-util/handleResourceExhaustedError/parsing error response failed: ", AnonymousClass000.A0u());
        }
        A01(r4, str, z);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static void A02(String str, HttpsURLConnection httpsURLConnection, boolean z) {
        A01(new C104565Ae(httpsURLConnection), str, z);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
