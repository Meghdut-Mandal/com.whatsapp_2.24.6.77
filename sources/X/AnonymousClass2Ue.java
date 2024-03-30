package X;

import org.json.JSONObject;

/* renamed from: X.2Ue  reason: invalid class name */
public final class AnonymousClass2Ue extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        String string;
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("whatsapp_support_ban_appeal_status");
        if (optJSONObject == null || (string = optJSONObject.getString("status")) == null) {
            AnonymousClass3TI.A00("BanStatusResponseDataProcessor/processResponse unexpected graphql response");
        } else {
            this.A00 = new C62703He(C55972vU.A00(string));
        }
    }
}
