package X;

import org.json.JSONObject;

/* renamed from: X.2UY  reason: invalid class name */
public final class AnonymousClass2UY extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("xfb_whatsapp_smb_order_education_video")) == null) {
            str = null;
        } else {
            str = jSONObject2.optString("video_uri");
        }
        this.A00 = str;
    }
}
