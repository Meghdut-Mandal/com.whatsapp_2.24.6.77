package X;

import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFG implements C23067B2w {
    public final C202269lR A00;
    public final C24611Dc A01 = C165587tf.A0X("IndiaUpiPinManagerClLatest");
    public final C194949Rw A02;
    public final String A03;
    public final Map A04;
    public final C19700wN A05;
    public final C19730wQ A06;
    public final C18820ts A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final AE0 A0A;
    public final C24601Db A0B;
    public final AF7 A0C;
    public final C29131Vl A0D;
    public final C21430zE A0E;

    public AFG(C19700wN r18, C19730wQ r19, C18820ts r20, C20810yC r21, C21010yW r22, C202269lR r23, AE0 ae0, C24601Db r25, AF7 af7, C194949Rw r27, C29131Vl r28, C21430zE r29) {
        C20810yC r13 = r21;
        AnonymousClass00C.A0D(r13, 1);
        C194949Rw r0 = r27;
        C19730wQ r15 = r19;
        C36341k9.A1E(r0, 2, r15);
        C21010yW r12 = r22;
        C19700wN r16 = r18;
        C36421kH.A1J(r16, 4, r12);
        C29131Vl r7 = r28;
        C18820ts r14 = r20;
        C36321k7.A10(r14, r7);
        C24601Db r9 = r25;
        AnonymousClass00C.A0D(r9, 8);
        C21430zE r6 = r29;
        C202269lR r11 = r23;
        C36391kE.A1U(r11, r6);
        AF7 af72 = af7;
        AE0 ae02 = ae0;
        C36341k9.A1G(af72, ae02);
        this.A08 = r13;
        this.A02 = r0;
        this.A06 = r15;
        this.A05 = r16;
        this.A09 = r12;
        this.A07 = r14;
        this.A0D = r7;
        this.A0B = r9;
        this.A00 = r11;
        this.A0E = r6;
        this.A0C = af72;
        this.A0A = ae02;
        this.A03 = r7.A01();
        AnonymousClass011[] r4 = new AnonymousClass011[2];
        C90464aC.A1E("karur vysya bank", 8, r4);
        C36341k9.A1J("dena bank", 4, r4, 1);
        this.A04 = C000400e.A08(r4);
    }

    public static final String A00(int i) {
        switch (i) {
            case 1:
                return "setMpin";
            case 2:
                return "changeMpin";
            case 3:
            case 6:
                return "pay";
            case 4:
                return "reqBalChk";
            case 5:
                return "collect";
            default:
                return "mandate";
        }
    }

    public void Bud(C225314u r16, C135086c7 r17, C22971AzN azN, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9 = str8;
        this.A02.A00(new AGN(r16, r17, azN, this, str2, str3, str9, str4, str6, str7, str, str5, i));
    }

    public static final void A03(C225314u r11, C22971AzN azN, AFG afg, String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        int i2;
        if (C36371kC.A1U(afg.A0B.A03(), "payment_account_recovered")) {
            AE0 ae0 = afg.A0A;
            String A0B2 = ae0.A0B();
            if (TextUtils.isEmpty(A0B2) || !AE0.A05(ae0, A0B2)) {
                r11.A33(C165597tg.A0G(r11), true);
                C202269lR r3 = afg.A00;
                r3.A04.A07.add("done");
                C24611Dc r2 = afg.A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("clearStates: ");
                C165567td.A17(r2, r3.A04, A0u);
                r3.A09();
                return;
            }
        }
        if (AnonymousClass6HC.A00(afg.A08, afg.A09, afg.A0E, "pinEntry")) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
        } else if (AnonymousClass970.A00()) {
            afg.A0C.BOm(0, (Integer) null, "upi_payments_unavailable_on_legacy_android_dialog", "new_payment");
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
        } else {
            C165657tu r32 = new C165657tu(new C166167vD(new Handler(), azN, afg));
            String valueOf = String.valueOf(jSONObject);
            String A0y = C36381kD.A0y(jSONObject2);
            String A0y2 = C36381kD.A0y(jSONArray);
            String A0y3 = C36381kD.A0y(C36401kF.A0x(afg.A07));
            C197959cf r22 = afg.A02.A00;
            if (r22 != null) {
                Log.d(C197959cf.class.getName(), "Get Credential called");
                try {
                    r22.A01.BAS("NPCI", str, str2, valueOf, A0y, A0y2, str3, A0y3, C166017ut.A01(r32.A00));
                    return;
                } catch (RemoteException unused) {
                    Log.e("CLServices", "Remote Exception in getCredential");
                    return;
                }
            } else {
                return;
            }
        }
        r11.BO9(new Object[0], i, i2);
    }

    public void Bue(C225314u r23, AnonymousClass16X r24, C135086c7 r25, AnonymousClass8gJ r26, C22971AzN azN, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, boolean z) {
        String str13 = str3;
        String str14 = str2;
        C22971AzN azN2 = azN;
        String str15 = str12;
        AnonymousClass8gJ r5 = r26;
        String str16 = str11;
        C135086c7 r4 = r25;
        String str17 = str10;
        AnonymousClass16X r3 = r24;
        String str18 = str9;
        C225314u r2 = r23;
        String str19 = str8;
        this.A02.A00(new AGO(r2, r3, r4, r5, azN2, this, str14, str5, str13, str4, str18, str7, str6, str19, str16, str15, str, str17, i, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (X.AnonymousClass000.A1R(r13.length()) != true) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (X.AnonymousClass000.A1R(r12.length()) != true) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        if (X.AnonymousClass000.A1R(r11.length()) != true) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (X.AnonymousClass000.A1R(r10.length()) != true) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (X.AnonymousClass000.A1R(r9.length()) != true) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        if (X.AnonymousClass000.A1R(r8.length()) != true) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f8, code lost:
        if (X.AnonymousClass000.A1R(r7.length()) != true) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005c, code lost:
        if (X.AnonymousClass000.A1R(r14.length()) != true) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.C135086c7 r16, java.lang.String r17) {
        /*
            org.json.JSONObject r1 = X.C36441kJ.A1C(r17)
            java.lang.String r0 = "txnId"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            X.AnonymousClass00C.A08(r0)
            r2 = 0
            java.lang.String r13 = r0.optString(r2)
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r1.getJSONArray(r0)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r14 = r0.optString(r2)
            java.lang.String r0 = "txnAmount"
            java.lang.String r7 = r1.optString(r0)
            java.lang.String r0 = "appId"
            java.lang.String r12 = r1.optString(r0)
            java.lang.String r0 = "deviceId"
            java.lang.String r10 = r1.optString(r0)
            java.lang.String r0 = "mobileNumber"
            java.lang.String r11 = r1.optString(r0)
            java.lang.String r0 = "payerAddr"
            java.lang.String r9 = r1.optString(r0)
            java.lang.String r0 = "payeeAddr"
            java.lang.String r8 = r1.optString(r0)
            java.lang.String r0 = "random"
            java.lang.String r3 = X.C36411kG.A10(r0, r1)
            r15 = 0
            r0 = 150(0x96, float:2.1E-43)
            java.lang.StringBuilder r4 = X.C90524aI.A0h(r0)     // Catch:{ Exception -> 0x0136 }
            r5 = 1
            if (r14 == 0) goto L_0x005e
            int r0 = r14.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            java.lang.String r6 = "|"
            if (r0 == 0) goto L_0x0069
            r4.append(r14)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x0069:
            if (r13 == 0) goto L_0x0076
            int r0 = r13.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 == 0) goto L_0x007f
            r4.append(r13)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x007f:
            if (r12 == 0) goto L_0x008c
            int r0 = r12.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x0095
            r4.append(r12)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x0095:
            if (r11 == 0) goto L_0x00a2
            int r0 = r11.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 == 0) goto L_0x00ab
            r4.append(r11)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x00ab:
            if (r10 == 0) goto L_0x00b8
            int r0 = r10.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            if (r0 == 0) goto L_0x00c1
            r4.append(r10)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x00c1:
            if (r9 == 0) goto L_0x00ce
            int r0 = r9.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            if (r0 == 0) goto L_0x00d7
            r4.append(r9)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x00d7:
            if (r8 == 0) goto L_0x00e4
            int r0 = r8.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x00ed
            r4.append(r8)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x00ed:
            if (r7 == 0) goto L_0x00fa
            int r0 = r7.length()     // Catch:{ Exception -> 0x0136 }
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = 1
            if (r1 == r5) goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            if (r0 == 0) goto L_0x0103
            r4.append(r7)     // Catch:{ Exception -> 0x0136 }
            r4.append(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x0103:
            int r1 = r4.lastIndexOf(r6)     // Catch:{ Exception -> 0x0136 }
            r0 = -1
            if (r1 == r0) goto L_0x0114
            int r0 = r4.length()     // Catch:{ Exception -> 0x0136 }
            int r0 = r0 - r5
            if (r1 != r0) goto L_0x0114
            r4.deleteCharAt(r1)     // Catch:{ Exception -> 0x0136 }
        L_0x0114:
            r0 = r16
            java.lang.Object r1 = r0.A00     // Catch:{ Exception -> 0x012f }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x012f }
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = X.C36381kD.A0y(r4)     // Catch:{ Exception -> 0x012f }
            byte[] r0 = X.AnonymousClass6HE.A00(r0, r3)     // Catch:{ Exception -> 0x012f }
            byte[] r0 = X.AnonymousClass6HE.A01(r3, r0, r1)     // Catch:{ Exception -> 0x012f }
        L_0x0128:
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ Exception -> 0x012f }
            return r0
        L_0x012d:
            r0 = r15
            goto L_0x0128
        L_0x012f:
            r1 = move-exception
            java.lang.String r0 = "CryptoUtils exception on CreateTrust Base64.encodeToString"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0136 }
            throw r1     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            java.lang.String r0 = "CryptoUtils exception on CreateTrust"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFG.A01(X.6c7, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r12.length() == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r11.length() == 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r13.length() == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r9.length() == 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONArray A02(android.content.Context r7, X.AnonymousClass16X r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            org.json.JSONArray r3 = X.C90524aI.A0u()
            r6 = 0
            if (r9 == 0) goto L_0x000e
            int r1 = r9.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            java.lang.String r4 = "value"
            java.lang.String r5 = "name"
            if (r0 != 0) goto L_0x0026
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "payeeName"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r9)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0026:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x00ed }
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 == 0) goto L_0x0041
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "account"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r10)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0041:
            if (r12 == 0) goto L_0x004a
            int r1 = r12.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            if (r0 != 0) goto L_0x005e
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "refId"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r12)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x005e:
            if (r8 == 0) goto L_0x0075
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "txnAmount"
            org.json.JSONObject r1 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = r8.toString()     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r1.putOpt(r4, r0)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0075:
            if (r11 == 0) goto L_0x007e
            int r1 = r11.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            if (r0 != 0) goto L_0x0097
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            r0 = 2131896907(0x7f122a4b, float:1.9428689E38)
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r11)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x0097:
            if (r13 == 0) goto L_0x00a0
            int r1 = r13.length()     // Catch:{ JSONException -> 0x00ed }
            r0 = 0
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = 1
        L_0x00a1:
            if (r0 != 0) goto L_0x00b9
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            r0 = 2131892145(0x7f1217b1, float:1.941903E38)
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r13)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x00b9:
            switch(r14) {
                case 7: goto L_0x00c0;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00c9;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00cf;
                default: goto L_0x00bc;
            }     // Catch:{ JSONException -> 0x00ed }
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            if (r2 == 0) goto L_0x00d8
            goto L_0x00d2
        L_0x00c0:
            java.lang.String r2 = "register"
            goto L_0x00bd
        L_0x00c3:
            java.lang.String r2 = "create"
            goto L_0x00bd
        L_0x00c6:
            java.lang.String r2 = "modify"
            goto L_0x00bd
        L_0x00c9:
            java.lang.String r2 = "revoke"
            goto L_0x00bd
        L_0x00cc:
            java.lang.String r2 = "pause"
            goto L_0x00bd
        L_0x00cf:
            java.lang.String r2 = "unpause"
            goto L_0x00bd
        L_0x00d2:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x00ed }
            if (r0 != 0) goto L_0x00d9
        L_0x00d8:
            r6 = 1
        L_0x00d9:
            if (r6 != 0) goto L_0x00ec
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x00ed }
            java.lang.String r0 = "mandateSubType"
            org.json.JSONObject r0 = r1.putOpt(r5, r0)     // Catch:{ JSONException -> 0x00ed }
            org.json.JSONObject r0 = r0.putOpt(r4, r2)     // Catch:{ JSONException -> 0x00ed }
            r3.put(r0)     // Catch:{ JSONException -> 0x00ed }
        L_0x00ec:
            return r3
        L_0x00ed:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFG.A02(android.content.Context, X.16X, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):org.json.JSONArray");
    }

    public String B4Q(int i) {
        try {
            JSONObject A1B = C36441kJ.A1B();
            JSONArray A0u = C90524aI.A0u();
            if (i <= 0) {
                i = 4;
            }
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
            A1B2.put("subtype", "MPIN");
            A1B2.put("dType", "NUM");
            A1B2.put("dLength", i);
            A0u.put(A1B2);
            A1B.put("CredAllowed", A0u);
            return A1B.toString();
        } catch (JSONException e) {
            this.A01.A0A("createCredRequired threw: ", e);
            return null;
        }
    }

    public String BAR(C175818b6 r14, int i, boolean z) {
        Number number;
        int i2;
        Number A0m = C36381kD.A0m();
        switch (i) {
            case 1:
                C135086c7 r4 = r14.A06;
                C135086c7 r11 = r14.A07;
                C135086c7 r2 = r14.A03;
                try {
                    JSONObject A1B = C36441kJ.A1B();
                    JSONArray A0u = C90524aI.A0u();
                    Number number2 = (Number) r14.A06.A00;
                    if (number2 != null && number2.intValue() == 0) {
                        String optString = C36441kJ.A1C(C165577te.A0k(r14.A05)).optString("bank_name");
                        if (optString != null) {
                            number = C90524aI.A0b(C36431kI.A1D(Locale.ROOT, optString), this.A04);
                        } else {
                            number = null;
                        }
                        C146356vT A002 = C146356vT.A00();
                        Class cls = Integer.TYPE;
                        if (number != null) {
                            i2 = number.intValue();
                        } else {
                            i2 = 6;
                        }
                        r4 = C165617ti.A0P(A002, cls, Integer.valueOf(i2), "otpLength");
                        C165567td.A16(this.A01, r4, "createCredRequired otpLength override: ", AnonymousClass000.A0u());
                    }
                    C18740tg.A06(r4);
                    Object obj = r4.A00;
                    C18740tg.A06(obj);
                    AnonymousClass00C.A08(obj);
                    if (AnonymousClass000.A0I(obj) > 0) {
                        JSONObject A1B2 = C36441kJ.A1B();
                        A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "OTP");
                        A1B2.put("subtype", "SMS");
                        A1B2.put("dType", "NUM");
                        A1B2.put("dLength", obj);
                        A0u.put(A1B2);
                        if (z) {
                            JSONObject A1B3 = C36441kJ.A1B();
                            A1B3.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "OTP");
                            A1B3.put("subtype", "AADHAAR");
                            A1B3.put("dType", "NUM");
                            A1B3.put("dLength", obj);
                            A0u.put(A1B3);
                        }
                    }
                    C18740tg.A06(r11);
                    Object obj2 = r11.A00;
                    C18740tg.A06(obj2);
                    AnonymousClass00C.A08(obj2);
                    if (AnonymousClass000.A0I(obj2) <= 0) {
                        obj2 = C36371kC.A0o();
                    }
                    C18740tg.A06(obj2);
                    AnonymousClass00C.A08(obj2);
                    if (AnonymousClass000.A0I(obj2) > 0) {
                        JSONObject A1B4 = C36441kJ.A1B();
                        A1B4.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                        A1B4.put("subtype", "MPIN");
                        A1B4.put("dType", "NUM");
                        A1B4.put("dLength", obj2);
                        A0u.put(A1B4);
                    }
                    if (r14.A01 == 2) {
                        Object obj3 = r2.A00;
                        C18740tg.A06(obj3);
                        AnonymousClass00C.A08(obj3);
                        if (AnonymousClass000.A0I(obj3) > 0) {
                            JSONObject A1B5 = C36441kJ.A1B();
                            A1B5.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                            A1B5.put("subtype", "ATMPIN");
                            A1B5.put("dType", "NUM");
                            A1B5.put("dLength", obj3);
                            A0u.put(A1B5);
                        }
                    }
                    A1B.put("CredAllowed", A0u);
                    return A1B.toString();
                } catch (JSONException e) {
                    this.A01.A0A("createCredRequired threw: ", e);
                    return null;
                }
            case 2:
                Number number3 = (Number) r14.A07.A00;
                if (number3 != null) {
                    A0m = number3;
                }
                int intValue = A0m.intValue();
                JSONObject A1B6 = C36441kJ.A1B();
                JSONArray A0u2 = C90524aI.A0u();
                if (intValue <= 0) {
                    intValue = 4;
                }
                JSONObject A1B7 = C36441kJ.A1B();
                A1B7.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                A1B7.put("subtype", "MPIN");
                A1B7.put("dType", "NUM");
                A1B7.put("dLength", intValue);
                A0u2.put(A1B7);
                JSONObject A1B8 = C36441kJ.A1B();
                A1B8.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                A1B8.put("subtype", "NMPIN");
                A1B8.put("dType", "NUM");
                A1B8.put("dLength", intValue);
                A0u2.put(A1B8);
                A1B6.put("CredAllowed", A0u2);
                return A1B6.toString();
            default:
                Number number4 = (Number) r14.A07.A00;
                if (number4 != null) {
                    A0m = number4;
                }
                return B4Q(A0m.intValue());
        }
        this.A01.A0A("createCredRequired threw: ", e);
        return null;
    }
}
