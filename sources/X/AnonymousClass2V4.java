package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2V4  reason: invalid class name */
public abstract class AnonymousClass2V4 extends C146036uv {
    public final C20020wt A00;
    public final String A01;

    public AnonymousClass2V4(C20050ww r14, C19420v0 r15, C20810yC r16, C20020wt r17, AnonymousClass005 r18, String str, AnonymousClass004 r20, AnonymousClass004 r21, long j) {
        super(r14, r15, r16, (AnonymousClass1WF) null, r18, (String) null, (Map) null, r20, r21, j);
        this.A00 = r17;
        this.A01 = str;
    }

    public void A08(JSONObject jSONObject) {
        String str = this.A01;
        if (str == null || str.length() == 0) {
            throw AnonymousClass001.A08("GetBanReportRequest: auth_token cannot be null. ");
        }
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("auth_token", C36441kJ.A13(str.getBytes()));
        A1B.put("app_id", "com.whatsapp.w4b");
        A1B.put("user_agent", this.A00.A02());
        A1B.put("version", "1");
        jSONObject.put("variables", A1B);
    }
}
