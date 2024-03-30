package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2V5  reason: invalid class name */
public class AnonymousClass2V5 extends C146036uv {
    public String A00;
    public String A01;

    public void A08(JSONObject jSONObject) {
        JSONObject A1B = C36441kJ.A1B();
        String str = this.A01;
        if (str != null) {
            A1B.put("fbid", str);
            A1B.put("stitch_images", C36371kC.A0m().toString());
            String str2 = this.A00;
            if (str2 != null) {
                A1B.put("ent_type", str2);
            }
            jSONObject.put("variables", A1B);
            return;
        }
        throw AnonymousClass001.A09("GraphqlRequest: fbId is required");
    }

    public AnonymousClass2V5(C20050ww r13, C19420v0 r14, C20810yC r15, AnonymousClass1WF r16, AnonymousClass005 r17, AnonymousClass004 r18, AnonymousClass004 r19) {
        super(r13, r14, r15, r16, r17, (String) null, (Map) null, r19, r18, 4181979348560216L);
    }
}
