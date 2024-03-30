package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Qy  reason: invalid class name and case insensitive filesystem */
public abstract class C131866Qy {
    public static ArrayList A00(JSONArray jSONArray) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            A0I.add(obj);
        }
        return A0I;
    }

    public static HashMap A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass001.A0J();
        }
        try {
            return A02(C36441kJ.A1C(str));
        } catch (JSONException unused) {
            return AnonymousClass001.A0J();
        }
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0C = AnonymousClass001.A0C(keys);
            Object obj = jSONObject.get(A0C);
            if (obj instanceof JSONArray) {
                obj = A00((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = A02((JSONObject) obj);
            }
            A0J.put(A0C, obj);
        }
        return A0J;
    }
}
