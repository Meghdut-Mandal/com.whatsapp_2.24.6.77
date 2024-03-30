package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.9ZU  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass9ZU {
    public static boolean A03(JSONObject jSONObject, Object[] objArr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, objArr);
        return A02(hashSet, jSONObject);
    }

    public static String A00(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
            return null;
        }
        return optString;
    }

    public static boolean A01(String str, JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, new String[]{str});
        return A02(hashSet, jSONObject);
    }

    public static boolean A02(Set set, JSONObject jSONObject) {
        HashSet A16 = C36441kJ.A16();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!jSONObject.has(A0C)) {
                A16.add(A0C);
            }
        }
        return A16.isEmpty();
    }
}
