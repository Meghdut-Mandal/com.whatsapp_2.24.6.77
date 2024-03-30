package X;

import org.json.JSONObject;

/* renamed from: X.1UW  reason: invalid class name */
public class AnonymousClass1UW {
    public static AnonymousClass6OQ A00(AnonymousClass6P0 r11, String str, JSONObject jSONObject) {
        Long l;
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
        long j = jSONObject2.getLong("fbid");
        String string = jSONObject2.getString("access_token");
        long j2 = jSONObject2.getLong("timestamp");
        String str2 = null;
        if (jSONObject2.has("ttl")) {
            l = Long.valueOf(jSONObject2.optLong("ttl"));
        } else {
            l = null;
        }
        if (jSONObject2.has("analytics_claim")) {
            str2 = jSONObject2.optString("analytics_claim");
        }
        return new AnonymousClass6OQ(r11, l, str, string, str2, j, j2);
    }
}
