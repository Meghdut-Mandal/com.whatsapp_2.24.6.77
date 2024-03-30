package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6HI  reason: invalid class name */
public abstract class AnonymousClass6HI {
    public static String A00(C19970wo r8, C124815yq r9) {
        if (r9 == null) {
            return null;
        }
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("auth_token", r9.A08);
            A1B.put("conn_ttl", r9.A05);
            A1B.put("auth_ttl", r9.A03);
            A1B.put("max_buckets", r9.A06);
            List<AnonymousClass65F> list = r9.A0A;
            JSONArray A0u = C90524aI.A0u();
            for (AnonymousClass65F r5 : list) {
                JSONObject A1B2 = C36441kJ.A1B();
                A1B2.put("hostname", r5.A04);
                A1B2.put("ip4", r5.A05);
                A1B2.put("ip6", r5.A06);
                A1B2.put("class", r5.A07);
                A1B2.put("fallback_hostname", r5.A00);
                A1B2.put("fallback_ip4", r5.A01);
                A1B2.put("fallback_ip6", r5.A02);
                A1B2.put("fallback_class", r5.A03);
                A1B2.put("upload", A01(r5.A0B));
                A1B2.put("download", A01(r5.A09));
                A1B2.put("download_buckets", A01(r5.A0A));
                A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A08);
                A1B2.put("force_ip", r5.A0C);
                A0u.put(A1B2);
            }
            A1B.put("hosts", A0u);
            A1B.put("send_time_abs_ms", (r9.A07 - SystemClock.elapsedRealtime()) + C19970wo.A00(r8));
            A1B.put("last_id", r9.A09);
            A1B.put("is_new", r9.A0B);
            A1B.put("max_autodownload_retry", r9.A00);
            A1B.put("max_manual_retry", r9.A01);
            return A1B.toString();
        } catch (JSONException e) {
            Log.e("routingresponse/can't serialize json", e);
            return null;
        }
    }

    public static JSONArray A01(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray A0u = C90524aI.A0u();
        for (Object put : set) {
            A0u.put(put);
        }
        return A0u;
    }
}
