package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2V6  reason: invalid class name */
public class AnonymousClass2V6 extends C146036uv {
    public final String A00;
    public final String A01;
    public final String A02;

    public void A08(JSONObject jSONObject) {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("app_id", "dev.app.id");
        A1B.put("request_token", this.A02);
        JSONObject A1B2 = C36441kJ.A1B();
        A1B2.put("description", this.A01);
        A1B2.put("debug_info", this.A00);
        A1B.put("user_request", A1B2);
        jSONObject.put("variables", A1B.toString());
    }

    public AnonymousClass2V6(C20050ww r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, String str, String str2, String str3, AnonymousClass004 r22, AnonymousClass004 r23) {
        super(r14, r15, r16, r17, r18, (String) null, (Map) null, r22, r23, 6960707423955525L);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
