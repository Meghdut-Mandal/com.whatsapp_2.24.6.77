package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3gP  reason: invalid class name and case insensitive filesystem */
public class C71213gP implements C30631aW {
    public C19970wo A00;
    public final AnonymousClass1CL A01;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        SharedPreferences sharedPreferences;
        AnonymousClass1CL r9 = this.A01;
        long A002 = C19970wo.A00(this.A00);
        synchronized (r9) {
            sharedPreferences = r9.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r9.A02.A00("triggered_block_prefs_purge_ts");
                r9.A00 = sharedPreferences;
            }
            C18740tg.A06(sharedPreferences);
        }
        if (A002 >= C36341k9.A0B(sharedPreferences, "tb_purge_last_ts") + 86400000) {
            if (!sharedPreferences.edit().putLong("tb_purge_last_ts", A002).commit()) {
                Log.w("triggered-block/purgeIfNeeded unable to commit last purge ts.");
            }
            try {
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator A0y = AnonymousClass000.A0y(AnonymousClass1CL.A00(r9).getAll());
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    Object key = A11.getKey();
                    String str = (String) A11.getValue();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject A1C = C36441kJ.A1C(str);
                        if (!A1C.has("tb_expired_ts") || A002 >= A1C.getLong("tb_expired_ts")) {
                            if (A1C.has("tb_last_action_ts")) {
                                if (A1C.has("tb_cooldown") && A002 < A1C.getLong("tb_last_action_ts") + A1C.getLong("tb_cooldown")) {
                                }
                            }
                            if (A1C.has("tb_last_action_ts") && !A1C.has("tb_cooldown") && A002 < A1C.getLong("tb_last_action_ts") + 31536000000L) {
                            }
                        }
                    }
                    A0I.add(key);
                }
                SharedPreferences.Editor edit = AnonymousClass1CL.A00(r9).edit();
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    edit.remove(AnonymousClass001.A0C(it));
                }
                if (!edit.commit()) {
                    Log.w("triggered-block/purge unable to commit after purge.");
                }
                A0I.size();
            } catch (JSONException unused) {
            }
        }
    }

    public C71213gP(AnonymousClass1CL r1) {
        this.A01 = r1;
    }
}
