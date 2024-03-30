package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1Vp  reason: invalid class name and case insensitive filesystem */
public class C29171Vp {
    public final C21010yW A00;
    public final C29161Vo A01;

    public static JSONObject A00(String str, JSONArray jSONArray) {
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                break;
            } else if (!str.equals(((JSONObject) jSONArray.get(i)).optString("business_owner_jid"))) {
                i++;
            } else if (i != -1) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                jSONArray.remove(i);
                return jSONObject;
            }
        }
        return new JSONObject();
    }

    public C29171Vp(C21010yW r1, C29161Vo r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
