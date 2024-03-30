package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.1CL  reason: invalid class name */
public class AnonymousClass1CL {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C19890wg A02;

    public static synchronized SharedPreferences A00(AnonymousClass1CL r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("triggered_block_prefs");
                r2.A01 = sharedPreferences;
            }
            C18740tg.A06(sharedPreferences);
        }
        return sharedPreferences;
    }

    public AnonymousClass1CL(C19890wg r1) {
        this.A02 = r1;
    }

    public static JSONObject A01(AnonymousClass1CL r1, AnonymousClass11F r2) {
        String string = A00(r1).getString(r2.getRawString(), (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new JSONObject(string);
    }

    public static void A02(AnonymousClass1CL r2, AnonymousClass11F r3, JSONObject jSONObject) {
        A00(r2).edit().putString(r3.getRawString(), jSONObject.toString()).apply();
    }
}
