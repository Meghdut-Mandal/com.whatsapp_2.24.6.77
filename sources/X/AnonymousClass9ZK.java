package X;

import org.json.JSONObject;

/* renamed from: X.9ZK  reason: invalid class name */
public abstract class AnonymousClass9ZK {
    public static final void A01(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (!(!z || str2 == null || str2.length() == 0)) {
            jSONObject2.put("direct_connection_encrypted_info", str2);
        }
        JSONObject A1B = C36441kJ.A1B();
        JSONObject A0x = C90484aE.A0x(jSONObject2, str, A1B);
        A0x.put("request", A1B);
        jSONObject.put("variables", A0x);
    }

    public static final void A00(AnonymousClass9W6 r4, JSONObject jSONObject) {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (C188398zW r1 : r4.A02) {
            if (A0u.length() > 0) {
                A0u.append(",");
            }
            A0u.append(r1.variantInfoTypeString);
        }
        if (A0u.length() > 0) {
            jSONObject.put("variant_info_fields", A0u.toString());
            jSONObject.put("variant_thumbnail_width", String.valueOf(r4.A01));
            jSONObject.put("variant_thumbnail_height", String.valueOf(r4.A00));
        }
    }
}
