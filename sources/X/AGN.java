package X;

import com.whatsapp.util.Log;
import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AGN implements C22976AzS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ C135086c7 A02;
    public final /* synthetic */ C22971AzN A03;
    public final /* synthetic */ AFG A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public AGN(C225314u r1, C135086c7 r2, C22971AzN azN, AFG afg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.A01 = r1;
        this.A04 = afg;
        this.A07 = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = str4;
        this.A0C = str5;
        this.A0A = str6;
        this.A08 = str7;
        this.A06 = str8;
        this.A03 = azN;
    }

    public void BTY(C197959cf r26) {
        C225314u r11 = this.A01;
        if (!r11.BLh()) {
            AFG afg = this.A04;
            String str = this.A07;
            String str2 = this.A0B;
            String str3 = this.A09;
            int i = this.A00;
            C135086c7 r6 = this.A02;
            String str4 = this.A05;
            String str5 = this.A0C;
            String str6 = this.A0A;
            String str7 = this.A08;
            String str8 = this.A06;
            C22971AzN azN = this.A03;
            JSONObject A1B = C36441kJ.A1B();
            try {
                A1B.put("payerBankName", str);
                A1B.put("backgroundColor", "#FFFFFF");
                A1B.put("color", "#00FF00");
                A1B.put("resendOTPFeature", "true");
            } catch (JSONException e) {
                afg.A01.A0A("getKeyConfig threw: ", e);
            }
            JSONObject A1B2 = C36441kJ.A1B();
            try {
                JSONArray A0u = C90524aI.A0u();
                A0u.put(str2);
                A1B2.put("txnId", A0u);
                A1B2.put("appId", "com.whatsapp");
                JSONArray A0u2 = C90524aI.A0u();
                A0u2.put(AFG.A00(i));
                A1B2.put("credType", A0u2);
                A1B2.put("deviceId", afg.A03);
                A1B2.put("mobileNumber", str3);
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String A13 = C36441kJ.A13(bArr);
                AnonymousClass00C.A08(A13);
                A1B2.put("random", A13);
            } catch (Exception unused) {
                Log.e("exception thrown at getKeySaltForSetup");
            }
            String A012 = AFG.A01(r6, C36381kD.A0y(A1B2));
            JSONArray A022 = AFG.A02(r11, (AnonymousClass16X) null, (String) null, str4, (String) null, str5, str6, i);
            if (A012 != null) {
                AFG.A03(r11, azN, afg, str7, str8, A012, A022, A1B, A1B2);
            }
        }
    }
}
