package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8d7  reason: invalid class name and case insensitive filesystem */
public final class C177048d7 extends C146036uv {
    public final C199899gC A00;
    public final String A01;

    public String A03() {
        return "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C177048d7(X.C20050ww r16, X.C199899gC r17, X.C19420v0 r18, X.C20810yC r19, X.AnonymousClass1WF r20, X.AnonymousClass005 r21, java.lang.String r22, X.AnonymousClass004 r23, X.AnonymousClass004 r24) {
        /*
            r15 = this;
            r4 = r16
            r5 = r18
            r6 = r19
            r8 = r21
            r11 = r23
            X.C36321k7.A1B(r6, r4, r5, r8, r11)
            r0 = 6
            r12 = r24
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 8
            r2 = r17
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 9
            r1 = r22
            X.AnonymousClass00C.A0D(r1, r0)
            r13 = 8106971506042362(0x1ccd3f64d265fa, double:4.0053761129494027E-308)
            java.lang.String r9 = "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243"
            r10 = 0
            r3 = r15
            r7 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.A00 = r2
            r15.A01 = r1
            java.lang.String r0 = "catalog"
            r15.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177048d7.<init>(X.0ww, X.9gC, X.0v0, X.0yC, X.1WF, X.005, java.lang.String, X.004, X.004):void");
    }

    public void A08(JSONObject jSONObject) {
        JSONObject A0q = C90464aC.A0q(jSONObject);
        C199899gC r5 = this.A00;
        A0q.put("jid", r5.A01.getRawString());
        JSONArray A0u = C90524aI.A0u();
        for (Object next : r5.A04) {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("retailer_id", next);
            A0u.put(A1B);
        }
        JSONObject A1B2 = C36441kJ.A1B();
        A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01);
        A0q.put("catalog", A1B2);
        A0q.put("products", A0u);
        A0q.put("width", r5.A03);
        JSONObject A0x = C90484aE.A0x(r5.A02, "height", A0q);
        JSONObject A0x2 = C90484aE.A0x(A0q, "product_list", A0x);
        A0x2.put("request", A0x);
        jSONObject.put("variables", A0x2);
    }
}
