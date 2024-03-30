package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Lv  reason: invalid class name and case insensitive filesystem */
public abstract class C63893Lv {
    public static final C12320hr A01(JSONArray jSONArray) {
        return new C12320hr(new C12790if(new AnonymousClass4K2(jSONArray), new C18650tV(C15040mb.A05(0, jSONArray.length()), 0)));
    }

    public static final String A00(String str, JSONObject jSONObject, boolean z) {
        String str2;
        Object opt = jSONObject.opt(str);
        if (opt == null || opt.equals(JSONObject.NULL)) {
            str2 = null;
        } else {
            str2 = opt.toString();
        }
        if (!z || (str2 != null && str2.length() != 0)) {
            return str2;
        }
        return null;
    }
}
