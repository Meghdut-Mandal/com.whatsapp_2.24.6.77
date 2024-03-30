package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.65O  reason: invalid class name */
public class AnonymousClass65O {
    public int A00;
    public Bundle A01;
    public Boolean A02;
    public String A03 = "en_US";
    public String A04;
    public String A05;
    public HashMap A06;
    public JSONArray A07 = null;
    public JSONArray A08 = null;
    public JSONArray A09;
    public JSONArray A0A;
    public JSONObject A0B = null;
    public JSONObject A0C = null;
    public JSONObject A0D;
    public AnonymousClass684 A0E;
    public C124765yl A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public Boolean A0K;
    public JSONObject A0L = null;

    /* JADX WARNING: Removed duplicated region for block: B:124:0x026a A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0278 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02d1 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec A[Catch:{ Exception -> 0x02e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass65O(android.os.Bundle r18) {
        /*
            r17 = this;
            java.lang.String r1 = "payerBankName"
            java.lang.String r2 = "forgotUpiPINEnabled"
            java.lang.String r7 = "captureCardDetails"
            java.lang.String r8 = "issuerResendOTPLimit"
            java.lang.String r9 = "aadhaarResendOTPLimit"
            java.lang.String r10 = "resendIssuerOTPFeature"
            java.lang.String r14 = "resendAadhaarOTPFeature"
            r3 = r17
            r3.<init>()
            r4 = 0
            r3.A0B = r4
            r3.A0L = r4
            r3.A07 = r4
            r3.A0C = r4
            r3.A08 = r4
            java.lang.String r0 = "en_US"
            r3.A03 = r0
            r6 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.A02 = r0
            r3.A0K = r4
            r0 = 2
            r3.A00 = r0
            r3.A0G = r6
            r3.A0H = r6
            r3.A0I = r6
            r3.A0J = r6
            java.lang.String r4 = ""
            r3.A04 = r4
            r3.A05 = r4
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            r3.A06 = r0
            org.json.JSONObject r0 = X.C36441kJ.A1B()
            r3.A0D = r0
            r5 = r18
            if (r18 == 0) goto L_0x02e7
            r3.A01 = r5
            java.lang.String r0 = "configuration"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x005c
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A0B = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x005c:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r14)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x0082
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.getBoolean(r14)     // Catch:{ Exception -> 0x02e7 }
        L_0x006a:
            r3.A0G = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x006c:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r9)     // Catch:{ Exception -> 0x02e7 }
            r11 = 3
            if (r0 == 0) goto L_0x0091
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ Exception -> 0x02e7 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A00 = r8     // Catch:{ Exception -> 0x02e7 }
            goto L_0x00a5
        L_0x0082:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r10)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x006c
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.getBoolean(r10)     // Catch:{ Exception -> 0x02e7 }
            goto L_0x006a
        L_0x0091:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r8)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x00ab
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = r0.getString(r8)     // Catch:{ Exception -> 0x02e7 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A00 = r8     // Catch:{ Exception -> 0x02e7 }
        L_0x00a5:
            if (r8 <= r11) goto L_0x00ac
            r3.A00 = r11     // Catch:{ Exception -> 0x02e7 }
            r8 = 3
            goto L_0x00ac
        L_0x00ab:
            r8 = 2
        L_0x00ac:
            boolean r0 = r3.A0G     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x00b4
            if (r8 > 0) goto L_0x00b4
            r3.A0G = r6     // Catch:{ Exception -> 0x02e7 }
        L_0x00b4:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r7)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x00c4
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.getBoolean(r7)     // Catch:{ Exception -> 0x02e7 }
            r3.A0H = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x00c4:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x00d4
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.getBoolean(r2)     // Catch:{ Exception -> 0x02e7 }
            r3.A0I = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x00d4:
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            boolean r0 = r0.has(r1)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x00e4
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x02e7 }
            r3.A04 = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x00e4:
            java.lang.String r0 = "controls"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x0262
            org.json.JSONObject r1 = X.C36441kJ.A1C(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A0L = r1     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = "CredAllowed"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r1 == 0) goto L_0x0262
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e7 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02e7 }
            r3.A07 = r0     // Catch:{ Exception -> 0x02e7 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x02e7 }
            r12 = 0
            r10 = r12
            r8 = r12
            r16 = r12
            r1 = r12
            r9 = r12
            r7 = r12
            r13 = 0
        L_0x010e:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r13 >= r0) goto L_0x0194
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            java.lang.Object r15 = r0.get(r13)     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = "subtype"
            java.lang.String r15 = r15.optString(r0, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = "ATM"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x0132
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r12 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
        L_0x0132:
            java.lang.String r0 = "ATMPIN"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x0140
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r16 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
        L_0x0140:
            java.lang.String r0 = "OTP|SMS|HOTP|TOTP"
            boolean r0 = r15.matches(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x014e
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r10 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
        L_0x014e:
            java.lang.String r0 = "MPIN"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x015c
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r8 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
        L_0x015c:
            java.lang.String r0 = "NMPIN"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x016a
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r9 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
        L_0x016a:
            java.lang.String r0 = "AADHAAR"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x0182
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r1 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r0 = r3.A0B     // Catch:{ Exception -> 0x0190 }
            boolean r0 = r0.has(r14)     // Catch:{ Exception -> 0x0190 }
            if (r0 != 0) goto L_0x0182
            r3.A0G = r6     // Catch:{ Exception -> 0x0190 }
        L_0x0182:
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r15.equals(r0)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x0190
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r7 = r0.getJSONObject(r13)     // Catch:{ Exception -> 0x0190 }
        L_0x0190:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0194:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r0 != r11) goto L_0x01ab
            if (r12 == 0) goto L_0x01ab
            if (r10 == 0) goto L_0x01ab
            if (r8 == 0) goto L_0x01ab
            r2.add(r10)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r12)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e7 }
        L_0x01ab:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r0 != r11) goto L_0x01c4
            if (r16 == 0) goto L_0x01c4
            if (r10 == 0) goto L_0x01c4
            if (r8 == 0) goto L_0x01c4
            r2.add(r10)     // Catch:{ Exception -> 0x02e7 }
            r0 = r16
            r2.add(r0)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e7 }
        L_0x01c4:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r0 != r11) goto L_0x01db
            if (r1 == 0) goto L_0x01db
            if (r10 == 0) goto L_0x01db
            if (r8 == 0) goto L_0x01db
            r2.add(r1)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r10)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e7 }
        L_0x01db:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            r1 = 2
            if (r0 != r1) goto L_0x01ee
            if (r10 == 0) goto L_0x01ee
            if (r8 == 0) goto L_0x01ee
            r2.add(r10)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r8)     // Catch:{ Exception -> 0x02e7 }
        L_0x01ee:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r0 != r1) goto L_0x0200
            if (r8 == 0) goto L_0x0200
            if (r9 == 0) goto L_0x0200
            r2.add(r8)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r9)     // Catch:{ Exception -> 0x02e7 }
        L_0x0200:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r0 != r1) goto L_0x0212
            if (r8 == 0) goto L_0x0212
            if (r7 == 0) goto L_0x0212
            r2.add(r8)     // Catch:{ Exception -> 0x02e7 }
            r2.add(r7)     // Catch:{ Exception -> 0x02e7 }
        L_0x0212:
            int r0 = r2.size()     // Catch:{ Exception -> 0x02e7 }
            if (r0 <= 0) goto L_0x021f
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e7 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e7 }
            r3.A07 = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x021f:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            org.json.JSONObject r0 = r0.optJSONObject(r6)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r7 = "subtype"
            r2 = 1
            if (r0 == 0) goto L_0x023c
            java.lang.String r1 = r0.optString(r7, r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = "MPIN"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x023c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x02e7 }
            r3.A02 = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x023c:
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r0 != r2) goto L_0x0262
            org.json.JSONArray r0 = r3.A07     // Catch:{ Exception -> 0x02e7 }
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = r0.getString(r7)     // Catch:{ Exception -> 0x02e7 }
            if (r1 == 0) goto L_0x0258
            java.lang.String r0 = "IDENTITY"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 != 0) goto L_0x0260
        L_0x0258:
            java.lang.String r0 = "SIGNATURE"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x0262
        L_0x0260:
            r3.A0J = r2     // Catch:{ Exception -> 0x02e7 }
        L_0x0262:
            java.lang.String r0 = "salt"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x0270
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A0C = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x0270:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r1 == 0) goto L_0x02c9
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e7 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02e7 }
            r3.A08 = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x027f:
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02e7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x02e7 }
            if (r6 >= r0) goto L_0x02c9
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02c6 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ Exception -> 0x02c6 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x02c6 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x02c6 }
            X.5T9 r0 = X.AnonymousClass5T9.account     // Catch:{ Exception -> 0x02c6 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02c6 }
            if (r0 == 0) goto L_0x02c6
            org.json.JSONArray r0 = r3.A08     // Catch:{ Exception -> 0x02c6 }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ Exception -> 0x02c6 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ Exception -> 0x02c6 }
            java.lang.String r0 = "value"
            java.lang.String r2 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x02c6 }
            r3.A05 = r2     // Catch:{ Exception -> 0x02c6 }
            int r1 = r2.length()     // Catch:{ Exception -> 0x02c6 }
            int r0 = r1 + -4
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ Exception -> 0x02c6 }
            r3.A05 = r2     // Catch:{ Exception -> 0x02c6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x02c6 }
            java.lang.String r0 = "XXXX"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ Exception -> 0x02c6 }
            r3.A05 = r0     // Catch:{ Exception -> 0x02c6 }
            goto L_0x02c9
        L_0x02c6:
            int r6 = r6 + 1
            goto L_0x027f
        L_0x02c9:
            java.lang.String r0 = "languagePref"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02e7 }
            if (r0 == 0) goto L_0x02d3
            r3.A03 = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x02d3:
            org.json.JSONObject r1 = r3.A0C     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A09 = r0     // Catch:{ Exception -> 0x02e7 }
            org.json.JSONObject r1 = r3.A0C     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r0 = "txnId"
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x02e7 }
            r3.A0A = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65O.<init>(android.os.Bundle):void");
    }

    public boolean A00() {
        Boolean bool = this.A0K;
        if (bool == null) {
            if (this.A07 != null) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (int i = 0; i < this.A07.length(); i++) {
                    try {
                        String string = this.A07.getJSONObject(i).getString("subtype");
                        if (string != null) {
                            A0I2.add(string);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (A0I2.contains("OTP") || A0I2.contains("SMS") || A0I2.contains("EMAIL") || A0I2.contains("HOTP") || A0I2.contains("AADHAAR") || (A0I2.contains("TOTP") && A0I2.contains("MPIN"))) {
                    bool = C36371kC.A0m();
                    this.A0K = bool;
                }
            }
            bool = false;
            this.A0K = bool;
        }
        return bool.booleanValue();
    }
}
