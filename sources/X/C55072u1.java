package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2u1  reason: invalid class name and case insensitive filesystem */
public abstract class C55072u1 {
    public static int A00(JSONObject jSONObject) {
        int i = C64683Pa.A06;
        int i2 = i;
        try {
            i = jSONObject.getInt("badgeExpirationInHours");
            if (i < 0) {
                return i2;
            }
            return i;
        } catch (JSONException e) {
            e.toString();
        }
    }
}
