package X;

import android.util.Base64;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: X.2V7  reason: invalid class name */
public final class AnonymousClass2V7 extends C146036uv {
    public final AnonymousClass37Z A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final C599635y A04;

    public void A08(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("token", this.A02);
        A1B.put("debug_info", this.A03);
        A1B.put("description", this.A01);
        String A0y = C36381kD.A0y(A1B);
        AnonymousClass37Z r4 = this.A00;
        byte[] decode = Base64.decode(r4.A02, 8);
        byte[] decode2 = Base64.decode(r4.A01, 8);
        C599635y r0 = this.A04;
        byte[] bArr = r0.A01;
        byte[] bArr2 = r0.A00;
        Charset charset = AnonymousClass0S4.A05;
        byte[] A022 = C201929kj.A02(decode, decode2, bArr, bArr2, C36371kC.A1Z("WA_INAPP_BAN_APPEALS", charset), 1);
        String str = r4.A00;
        String encodeToString = Base64.encodeToString(C200419hN.A03(A022, Base64.decode(str, 8), C36371kC.A1Z(A0y, charset)), 10);
        JSONObject A1B2 = C36441kJ.A1B();
        A1B2.put("client_ephemeral_pub_key_base64", Base64.encodeToString(bArr, 3));
        A1B2.put("ciphertext_base64", encodeToString);
        A1B2.put("encryption_nonce_base64", str);
        JSONObject A1B3 = C36441kJ.A1B();
        A1B3.put("app_id", "dev.app.id");
        A1B3.put("user_request", A1B2);
        jSONObject.put("variables", A1B3.toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2V7(X.C20050ww r16, X.C19420v0 r17, X.C20810yC r18, X.AnonymousClass1WF r19, X.AnonymousClass37Z r20, X.AnonymousClass005 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.AnonymousClass004 r25, X.AnonymousClass004 r26, X.C599635y r27) {
        /*
            r15 = this;
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r21
            r11 = r25
            X.C36321k7.A1B(r6, r4, r5, r8, r11)
            r12 = r26
            r0 = r27
            X.C36321k7.A10(r12, r0)
            r2 = r23
            r1 = r24
            X.C36361kB.A1K(r2, r1)
            r13 = 5473316762755318(0x1371f3dd6320f6, double:2.704177781284427E-308)
            r9 = 0
            r3 = r15
            r7 = r19
            r10 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.A04 = r0
            r0 = r20
            r15.A00 = r0
            r0 = r22
            r15.A02 = r0
            r15.A01 = r2
            r15.A03 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2V7.<init>(X.0ww, X.0v0, X.0yC, X.1WF, X.37Z, X.005, java.lang.String, java.lang.String, java.lang.String, X.004, X.004, X.35y):void");
    }
}
