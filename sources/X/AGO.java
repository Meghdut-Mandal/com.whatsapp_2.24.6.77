package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AGO implements C22976AzS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ AnonymousClass16X A02;
    public final /* synthetic */ C135086c7 A03;
    public final /* synthetic */ AnonymousClass8gJ A04;
    public final /* synthetic */ C22971AzN A05;
    public final /* synthetic */ AFG A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ boolean A0J;

    public AGO(C225314u r2, AnonymousClass16X r3, C135086c7 r4, AnonymousClass8gJ r5, C22971AzN azN, AFG afg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, boolean z) {
        this.A01 = r2;
        this.A06 = afg;
        this.A09 = str;
        this.A0J = z;
        this.A0H = str2;
        this.A02 = r3;
        this.A0G = str3;
        this.A0E = str4;
        this.A0D = str5;
        this.A00 = i;
        this.A03 = r4;
        this.A04 = r5;
        this.A0B = str6;
        this.A07 = str7;
        this.A0C = str8;
        this.A0I = str9;
        this.A0F = str10;
        this.A0A = str11;
        this.A08 = str12;
        this.A05 = azN;
    }

    public void BTY(C197959cf r27) {
        C225314u r25 = this.A01;
        if (!r25.BLh()) {
            AFG afg = this.A06;
            String str = this.A09;
            boolean z = this.A0J;
            String str2 = this.A0H;
            AnonymousClass16X r16 = this.A02;
            String str3 = this.A0G;
            String str4 = this.A0E;
            String str5 = this.A0D;
            int i = this.A00;
            C135086c7 r7 = this.A03;
            AnonymousClass8gJ r6 = this.A04;
            String str6 = this.A0B;
            String str7 = this.A07;
            String str8 = this.A0C;
            String str9 = this.A0I;
            String str10 = this.A0F;
            String str11 = this.A0A;
            String str12 = this.A08;
            C22971AzN azN = this.A05;
            JSONObject A1B = C36441kJ.A1B();
            try {
                A1B.put("payerBankName", str);
                A1B.put("backgroundColor", "#FFFFFF");
                A1B.put("color", "#00FF00");
                if (z) {
                    A1B.put("verifiedMerchant", "true");
                }
            } catch (JSONException e) {
                afg.A01.A0A("getKeyConfig threw: ", e);
            }
            String A0y = C36381kD.A0y(r16);
            JSONObject A1B2 = C36441kJ.A1B();
            try {
                JSONArray A0u = C90524aI.A0u();
                A0u.put(str2);
                A1B2.put("txnId", A0u);
                A1B2.put("txnAmount", A0y);
                A1B2.put("deviceId", afg.A03);
                A1B2.put("appId", "com.whatsapp");
                A1B2.put("mobileNumber", str5);
                JSONArray A0u2 = C90524aI.A0u();
                A0u2.put(AFG.A00(i));
                A1B2.put("credType", A0u2);
                A1B2.put("payerAddr", str3);
                A1B2.put("payeeAddr", str4);
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String A13 = C36441kJ.A13(bArr);
                AnonymousClass00C.A08(A13);
                A1B2.put("random", A13);
                afg.A01.A04("getKeySaltWithTransactionDetails");
                String A012 = AFG.A01(r7, C36381kD.A0y(A1B2));
                r6.A01 = A1B2;
                C225314u r14 = r25;
                JSONArray A022 = AFG.A02(r14, r16, str6, str7, str8, str9, str10, i);
                if (A012 != null) {
                    AFG.A03(r14, azN, afg, str11, str12, A012, A022, A1B, A1B2);
                }
            } catch (JSONException e2) {
                throw AnonymousClass001.A0B(e2);
            } catch (NoSuchAlgorithmException e3) {
                throw AnonymousClass001.A0B(e3);
            }
        }
    }
}
