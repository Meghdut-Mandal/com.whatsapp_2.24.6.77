package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wp  reason: invalid class name and case insensitive filesystem */
public class C19980wp {
    public SharedPreferences A00;
    public C19970wo A01;
    public final C19890wg A02;

    public static synchronized SharedPreferences A00(C19980wp r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("companion_mode_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C19980wp(C19970wo r1, C19890wg r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public JSONObject A01() {
        String string = A00(this).getString("history_sync_companion_state", (String) null);
        try {
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("syncd-shared-preferencecs/ Invalid JSON value:");
            sb.append(string);
            Log.e(sb.toString());
        }
        return null;
    }

    public byte[] A02() {
        String string = A00(this).getString("adv_signed_identity", (String) null);
        if (!TextUtils.isEmpty(string)) {
            return Base64.decode(string, 3);
        }
        return null;
    }
}
