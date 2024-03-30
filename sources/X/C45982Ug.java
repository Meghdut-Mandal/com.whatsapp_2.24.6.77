package X;

import org.json.JSONObject;

/* renamed from: X.2Ug  reason: invalid class name and case insensitive filesystem */
public abstract class C45982Ug extends C1257160z {
    public AnonymousClass37Y A04(JSONObject jSONObject) {
        String str;
        String string;
        if (jSONObject != null) {
            String string2 = jSONObject.getString("status");
            String A00 = C55682v1.A00(string2);
            if (!A00.equals("UNKNOWN_IN_CLIENT")) {
                String str2 = null;
                if (jSONObject.isNull("reason") || (string = jSONObject.getString("reason")) == null) {
                    str = null;
                } else {
                    str = "OOPS";
                    if (!str.equals(string)) {
                        str = "OTHER";
                    }
                }
                if (!jSONObject.isNull("reason_url")) {
                    str2 = jSONObject.getString("reason_url");
                }
                return new AnonymousClass37Y(A00, str, str2);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("State is invalid in ban appeal status: ");
            A0u.append(string2);
            A0u.append(", ");
            throw new Exception(AnonymousClass000.A0q(A05(), A0u));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Value of ");
        A0u2.append(A05());
        throw new Exception(AnonymousClass000.A0q(" is null while submitting ban appeal", A0u2));
    }

    public String A05() {
        if (this instanceof C48642he) {
            return "whatsapp_support_process_ban_appeal_request_encrypted";
        }
        if (this instanceof C48632hd) {
            return "whatsapp_support_process_ban_appeal_request";
        }
        if (this instanceof C48622hc) {
            return "purpose_public_keys";
        }
        return "whatsapp_support_ban_appeal_status";
    }

    public void A03(JSONObject jSONObject, long j) {
        this.A00 = jSONObject.getJSONObject(A05());
    }
}
