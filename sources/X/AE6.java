package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class AE6 implements B2X {
    public final AnonymousClass16S A00;
    public final AnonymousClass6VM A01;
    public final C192619Hx A02;
    public final AnonymousClass646 A03;

    public boolean BNR() {
        return true;
    }

    public AnonymousClass1AL B7r(String str) {
        C175898bF r2;
        C175798b4 r0 = (C175798b4) this.A00.A07(str);
        if (!(r0 == null || (r2 = r0.A08) == null)) {
            AnonymousClass8b7 r22 = (AnonymousClass8b7) r2;
            String A002 = this.A03.A00(r0.A01);
            if ("VISA".equals(r22.A02)) {
                AnonymousClass6VM r6 = this.A01;
                String str2 = r22.A05;
                try {
                    JSONObject A1B = C36441kJ.A1B();
                    A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "PS256");
                    A1B.put("typ", "JOSE");
                    A1B.put("kid", A002);
                    A1B.put("iat", C36371kC.A09(r6.A00));
                    String A012 = AnonymousClass6VM.A01(r6, A1B.toString(), AnonymousClass6VM.A02(A002, (String) null, str2));
                    if (A012 != null) {
                        return new AnonymousClass1AL("trusted-device-info", A012);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: generateTrustedDeviceInfoJwsToken threw creating json string: ", e);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r2 != 20923) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String BIY(android.content.res.Resources r5, X.C202319lY r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r1 = r6.A0J
            r3 = 0
            if (r1 == 0) goto L_0x0078
            r0 = -1
            int r2 = X.AnonymousClass6R8.A00(r1, r0)
            int r1 = r6.A02
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 407(0x197, float:5.7E-43)
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            r0 = 14
            if (r1 != r0) goto L_0x0078
        L_0x001c:
            X.9Hx r1 = r4.A02
            X.9Ru r0 = r1.A01
            java.lang.String r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0048
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 == r0) goto L_0x0055
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r2 == r0) goto L_0x004f
            r0 = 10242(0x2802, float:1.4352E-41)
            if (r2 == r0) goto L_0x005b
            r0 = 20884(0x5194, float:2.9265E-41)
            if (r2 == r0) goto L_0x0049
            r1 = 20923(0x51bb, float:2.932E-41)
            r0 = 2131892180(0x7f1217d4, float:1.94191E38)
            if (r2 == r1) goto L_0x0044
        L_0x003d:
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 != r0) goto L_0x0067
            r0 = 2131892179(0x7f1217d3, float:1.9419099E38)
        L_0x0044:
            java.lang.String r0 = r5.getString(r0)
        L_0x0048:
            return r0
        L_0x0049:
            X.0wG r1 = r1.A00
            r0 = 2131887561(0x7f1205c9, float:1.9409733E38)
            goto L_0x0060
        L_0x004f:
            X.0wG r1 = r1.A00
            r0 = 2131886282(0x7f1200ca, float:1.9407138E38)
            goto L_0x0060
        L_0x0055:
            X.0wG r1 = r1.A00
            r0 = 2131890519(0x7f121157, float:1.9415732E38)
            goto L_0x0060
        L_0x005b:
            X.0wG r1 = r1.A00
            r0 = 2131891666(0x7f1215d2, float:1.9418058E38)
        L_0x0060:
            java.lang.String r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x003d
            return r0
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BrazilTransactionHelper/getTransactionStatusDetail : unhandled error code ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            X.C36321k7.A1a(r1, r0)
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AE6.BIY(android.content.res.Resources, X.9lY, java.lang.String):java.lang.String");
    }

    public AE6(AnonymousClass16S r1, AnonymousClass6VM r2, C192619Hx r3, AnonymousClass646 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
