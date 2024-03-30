package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Wi  reason: invalid class name and case insensitive filesystem */
public class C29361Wi {
    public SharedPreferences A00;
    public final TreeMap A01 = new TreeMap();
    public final C19890wg A02;

    public static synchronized SharedPreferences A00(C29361Wi r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("user_notice_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public TreeMap A02() {
        String string;
        TreeMap treeMap = this.A01;
        if (treeMap.isEmpty() && (string = A00(this).getString("user_notices", (String) null)) != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    treeMap.put(Integer.valueOf(next), C65613Su.A00(new JSONObject(jSONObject.get(next).toString())));
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        return treeMap;
    }

    public void A03(int i) {
        TreeMap treeMap = this.A01;
        treeMap.remove(Integer.valueOf(i));
        C65613Su A012 = A01();
        if (A012 != null && A012.A01 == i) {
            A00(this).edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").apply();
        }
        A05(new ArrayList(treeMap.values()));
    }

    public void A05(List list) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = this.A01;
        treeMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65613Su r3 = (C65613Su) it.next();
            JSONObject A012 = C65613Su.A01(r3);
            if (A012 != null) {
                int i = r3.A01;
                hashMap.put(String.valueOf(i), A012.toString());
                treeMap.put(Integer.valueOf(i), r3);
            }
        }
        A00(this).edit().putString("user_notices", new JSONObject(hashMap).toString()).apply();
    }

    public C29361Wi(C19890wg r2) {
        this.A02 = r2;
    }

    public C65613Su A01() {
        SharedPreferences A002 = A00(this);
        int i = A002.getInt("current_user_notice_id", -1);
        if (i == -1) {
            return null;
        }
        return new C65613Su(i, A002.getInt("current_user_notice_stage", 0), A002.getInt("current_user_notice_version", 0), A002.getLong("current_user_notice_stage_timestamp", 0), 0);
    }

    public void A04(C65613Su r6) {
        SharedPreferences.Editor edit = A00(this).edit();
        int i = r6.A01;
        edit.putInt("current_user_notice_id", i).putInt("current_user_notice_stage", r6.A00).putLong("current_user_notice_stage_timestamp", r6.A04).putInt("current_user_notice_version", r6.A03).apply();
        TreeMap A022 = A02();
        A022.put(Integer.valueOf(i), r6);
        A05(new ArrayList(A022.values()));
    }
}
