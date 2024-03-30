package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2V3  reason: invalid class name */
public class AnonymousClass2V3 extends C146036uv {
    public final String A00;

    public void A08(JSONObject jSONObject) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("app_id", "dev.app.id");
        A1B.put("request_token", this.A00);
        jSONObject.put("variables", A1B.toString());
    }

    public AnonymousClass2V3(C20050ww r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, String str, AnonymousClass004 r20, AnonymousClass004 r21) {
        super(r14, r15, r16, r17, r18, (String) null, (Map) null, r20, r21, 4276154569100535L);
        this.A00 = str;
    }
}
