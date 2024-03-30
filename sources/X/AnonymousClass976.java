package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.976  reason: invalid class name */
public abstract class AnonymousClass976 {
    public static final B4W A00(JSONObject jSONObject) {
        for (B1X b1x : C1905999o.A00) {
            if (jSONObject.has(b1x.BCX())) {
                try {
                    return b1x.B4t(jSONObject);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
