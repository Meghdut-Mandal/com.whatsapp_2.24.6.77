package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0zM  reason: invalid class name and case insensitive filesystem */
public class C21510zM {
    public final SharedPreferences A00;
    public final C19970wo A01;
    public final C19630wG A02;
    public final C20790yA A03;
    public final C21530zO A04;
    public final C20800yB A05;
    public final C20920yN A06;
    public final C19890wg A07;
    public final AnonymousClass005 A08;
    public final C21520zN A09;

    public synchronized String A01() {
        String str;
        Set<String> stringSet = this.A00.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
        if (stringSet == null) {
            str = "";
        } else {
            str = TextUtils.join(",", stringSet);
        }
        return str;
    }

    public synchronized void A02() {
        C21520zN r0 = this.A09;
        r0.A0B();
        r0.A0F().edit().clear().apply();
    }

    public synchronized void A03(int i) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putInt("ab_props:sys:fetch_attemp_count", i);
        edit.apply();
    }

    public synchronized void A04(int i) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putInt("ab_props:sys:last_error_code", i);
        edit.apply();
    }

    public synchronized void A05(String str) {
        Log.i("CheckIfReinstalledTask/updatePreChatdABProps");
        A02();
        if (TextUtils.isEmpty(str)) {
            Log.i("CheckIfReinstalledTask/updatePreChatdABProps/empty expConfigs");
        } else {
            try {
                SharedPreferences.Editor edit = this.A09.A0F().edit();
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        A00(edit, this, jSONObject.getString("config_value"), Integer.parseInt(jSONObject.getString("config_code")));
                    }
                }
                edit.apply();
            } catch (JSONException e) {
                Log.e("ABPropsManager/updatePreChatdABProps/update abprop configs failed", e);
            }
        }
        return;
    }

    public C21510zM(C19970wo r2, C19630wG r3, C21520zN r4, C20790yA r5, C21530zO r6, C20800yB r7, C20920yN r8, C19890wg r9, AnonymousClass005 r10) {
        this.A01 = r2;
        this.A05 = r7;
        this.A09 = r4;
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A00 = r9.A00("ab-props");
        this.A07 = r9;
        this.A08 = r10;
    }

    public static boolean A00(SharedPreferences.Editor editor, C21510zM r8, String str, int i) {
        C20070wy r0;
        C20070wy r02;
        C20070wy r03;
        C20070wy r04;
        C20070wy r05;
        if (!TextUtils.isEmpty(str)) {
            String num = Integer.toString(i);
            try {
                C20800yB r4 = r8.A05;
                boolean z = r4 instanceof C20810yC;
                if (z) {
                    r0 = ((C20810yC) r4).A00;
                } else {
                    r0 = ((C21520zN) r4).A00.A00;
                }
                Integer valueOf = Integer.valueOf(i);
                if (r0.containsKey(valueOf)) {
                    boolean z2 = false;
                    if (Integer.parseInt(str) != 0) {
                        z2 = true;
                    }
                    editor.putBoolean(num, z2);
                    return true;
                }
                if (z) {
                    r02 = ((C20810yC) r4).A02;
                } else {
                    r02 = ((C21520zN) r4).A00.A02;
                }
                if (r02.containsKey(valueOf)) {
                    editor.putInt(num, Integer.parseInt(str));
                    return true;
                }
                if (z) {
                    r03 = ((C20810yC) r4).A01;
                } else {
                    r03 = ((C21520zN) r4).A00.A01;
                }
                if (r03.containsKey(valueOf)) {
                    editor.putFloat(num, Float.parseFloat(str));
                    return true;
                }
                if (z) {
                    r04 = ((C20810yC) r4).A04;
                } else {
                    r04 = ((C21520zN) r4).A00.A04;
                }
                if (!r04.containsKey(valueOf)) {
                    if (z) {
                        r05 = ((C20810yC) r4).A03;
                    } else {
                        r05 = ((C21520zN) r4).A00.A03;
                    }
                    if (r05.containsKey(valueOf)) {
                        new JSONObject(str);
                    }
                }
                editor.putString(num, str);
                return true;
            } catch (NumberFormatException | JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ABPropsManager/invalid format for config; configCode=");
                sb.append(i);
                sb.append("; value=");
                sb.append(str);
                Log.e(sb.toString(), e);
            }
        }
        return false;
    }
}
