package X;

import org.json.JSONObject;

/* renamed from: X.2V2  reason: invalid class name */
public final class AnonymousClass2V2 extends C146036uv {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2V2(X.C20050ww r14, X.C19420v0 r15, X.C20810yC r16, X.AnonymousClass1WF r17, X.AnonymousClass005 r18, java.lang.String r19, X.AnonymousClass004 r20, X.AnonymousClass004 r21) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r9 = r20
            X.C36321k7.A1B(r4, r14, r15, r6, r9)
            r0 = r19
            r10 = r21
            X.C36321k7.A10(r10, r0)
            r11 = 5803265299734043(0x149e09feba5e1b, double:2.867194018301195E-308)
            r7 = 0
            r1 = r13
            r5 = r17
            r8 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2V2.<init>(X.0ww, X.0v0, X.0yC, X.1WF, X.005, java.lang.String, X.004, X.004):void");
    }

    public void A08(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("app_id", "dev.app.id");
        A1B.put("client_pub_key", this.A00);
        jSONObject.put("variables", A1B.toString());
    }
}
