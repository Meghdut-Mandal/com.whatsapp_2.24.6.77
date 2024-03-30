package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9jE  reason: invalid class name and case insensitive filesystem */
public class C201269jE {
    public final C19630wG A00;

    public C201269jE(C19630wG r1) {
        this.A00 = r1;
    }

    public static JSONArray A00(List list) {
        String str;
        try {
            JSONArray A0u = C90524aI.A0u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C175808b5 r3 = (C175808b5) it.next();
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("bank_code", r3.A01);
                A1B.put("bank_name", r3.A01);
                A1B.put("short_name", r3.A02);
                if (r3.A03) {
                    str = "1";
                } else {
                    str = "0";
                }
                A1B.put("accept_savings", str);
                A0u.put(A1B);
            }
            return A0u;
        } catch (JSONException e) {
            Log.e(AnonymousClass000.A0l(e, "PAY: BrazilPayBloksActivity payoutBanksToJsonArrayException: ", AnonymousClass000.A0u()), e);
            return null;
        }
    }

    public static boolean A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C21669AUm) it.next()).A0C) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        r5 = X.C36391kE.A0v(r7, r9.A04, new java.lang.Object[1], 0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONArray A02(java.util.List r17) {
        /*
            r16 = this;
            org.json.JSONArray r4 = X.C90524aI.A0u()     // Catch:{ JSONException -> 0x01c2 }
            java.util.Iterator r15 = r17.iterator()     // Catch:{ JSONException -> 0x01c2 }
        L_0x0008:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r9 = r15.next()     // Catch:{ JSONException -> 0x01c2 }
            X.AUm r9 = (X.C21669AUm) r9     // Catch:{ JSONException -> 0x01c2 }
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r1 = "card_verify_identifier"
            java.lang.String r0 = r9.A03     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "card_verify_type"
            java.lang.String r5 = r9.A0B     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x01c2 }
            X.C18740tg.A06(r5)     // Catch:{ JSONException -> 0x01c2 }
            r6 = -1
            int r2 = r5.hashCode()     // Catch:{ JSONException -> 0x01c2 }
            r0 = -1302107194(0xffffffffb2636bc6, float:-1.3237644E-8)
            r1 = 2
            r10 = 0
            r11 = 1
            if (r2 == r0) goto L_0x0053
            r0 = -119226117(0xfffffffff8e4c0fb, float:-3.711743E34)
            if (r2 == r0) goto L_0x004a
            r0 = 110379(0x1af2b, float:1.54674E-40)
            if (r2 != r0) goto L_0x005e
            java.lang.String r0 = "otp"
            boolean r0 = r5.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x005e
            r6 = 0
            goto L_0x005e
        L_0x004a:
            java.lang.String r0 = "app-to-app"
            boolean r0 = r5.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x005e
            goto L_0x005d
        L_0x0053:
            java.lang.String r0 = "customer-service"
            boolean r0 = r5.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x005e
            r6 = 1
            goto L_0x005e
        L_0x005d:
            r6 = 2
        L_0x005e:
            java.lang.String r2 = "card_verify_method_disabled_state"
            java.lang.String r5 = ""
            r0 = r16
            if (r6 == 0) goto L_0x008e
            if (r6 == r11) goto L_0x006d
            if (r6 == r1) goto L_0x0148
            r8 = r5
            goto L_0x0199
        L_0x006d:
            X.0wG r7 = r0.A00     // Catch:{ JSONException -> 0x01c2 }
            r0 = 2131887142(0x7f120426, float:1.9408883E38)
            java.lang.String r5 = r7.A01(r0)     // Catch:{ JSONException -> 0x01c2 }
            r6 = 2131887141(0x7f120425, float:1.940888E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r1 = r9.A0A     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = X.AnonymousClass97L.A00(r1)     // Catch:{ JSONException -> 0x01c2 }
            r2[r10] = r0     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r8 = r7.A02(r6, r2)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "support_phone_number"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x0199
        L_0x008e:
            X.0wG r0 = r0.A00     // Catch:{ JSONException -> 0x01c2 }
            android.content.Context r7 = r0.A00     // Catch:{ JSONException -> 0x01c2 }
            r8 = r5
            java.lang.String r6 = r9.A05     // Catch:{ JSONException -> 0x01c2 }
            int r0 = r6.hashCode()     // Catch:{ JSONException -> 0x01c2 }
            switch(r0) {
                case 82233: goto L_0x00d6;
                case 2467610: goto L_0x00e9;
                case 66081660: goto L_0x0100;
                case 81425707: goto L_0x011b;
                default: goto L_0x009c;
            }     // Catch:{ JSONException -> 0x01c2 }
        L_0x009c:
            X.00I r0 = new X.00I     // Catch:{ JSONException -> 0x01c2 }
            r0.<init>(r8, r5)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.Object r5 = r0.A00     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x01c2 }
            java.lang.Object r8 = r0.A01     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "card_verify_otp_type"
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r1 = r9.A04     // Catch:{ JSONException -> 0x01c2 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "card_verify_otp_receiver_info"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x01c2 }
        L_0x00b9:
            java.lang.String r1 = "card_verify_otp_resend_interval_sec"
            int r0 = r9.A01     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r1 = "otp_length"
            int r10 = r9.A00     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r7 = "otp_mask"
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x012c
        L_0x00d6:
            java.lang.String r0 = "SMS"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x009c
            r0 = 2131887148(0x7f12042c, float:1.9408895E38)
            java.lang.String r8 = r7.getString(r0)     // Catch:{ JSONException -> 0x01c2 }
            r5 = 2131887147(0x7f12042b, float:1.9408893E38)
            goto L_0x0112
        L_0x00e9:
            java.lang.String r0 = "PUSH"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x009c
            r0 = 2131887144(0x7f120428, float:1.9408887E38)
            java.lang.String r8 = r7.getString(r0)     // Catch:{ JSONException -> 0x01c2 }
            r0 = 2131887143(0x7f120427, float:1.9408885E38)
            java.lang.String r5 = r7.getString(r0)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x009c
        L_0x0100:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x009c
            r0 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.String r8 = r7.getString(r0)     // Catch:{ JSONException -> 0x01c2 }
            r5 = 2131887145(0x7f120429, float:1.9408889E38)
        L_0x0112:
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = r9.A04     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r5 = X.C36391kE.A0v(r7, r0, r1, r10, r5)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x009c
        L_0x011b:
            java.lang.String r0 = "VACAT"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x009c
            r0 = 2131887148(0x7f12042c, float:1.9408895E38)
            java.lang.String r8 = r7.getString(r0)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x009c
        L_0x012c:
            r1 = 0
        L_0x012d:
            if (r1 >= r10) goto L_0x0137
            java.lang.String r0 = "#  "
            r6.append(r0)     // Catch:{ JSONException -> 0x01c2 }
            int r1 = r1 + 1
            goto L_0x012d
        L_0x0137:
            java.lang.String r0 = r6.toString()     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r7, r0)     // Catch:{ JSONException -> 0x01c2 }
            boolean r0 = r9.A0C     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x0199
        L_0x0148:
            java.lang.String r7 = r9.A07     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r6 = r9.A08     // Catch:{ JSONException -> 0x01c2 }
            X.00I r1 = X.AnonymousClass3RH.A00(r7, r6)     // Catch:{ JSONException -> 0x01c2 }
            X.0wG r8 = r0.A00     // Catch:{ JSONException -> 0x01c2 }
            r0 = 2131887140(0x7f120424, float:1.9408879E38)
            java.lang.String r5 = r8.A01(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r1 == 0) goto L_0x01ae
            java.lang.Object r14 = r1.A00     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x01c2 }
            java.lang.Object r13 = r1.A01     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r12 = r9.A09     // Catch:{ JSONException -> 0x01c2 }
            android.content.Intent r1 = X.C36431kI.A0D()     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "android.intent.extra.TEXT"
            r1.putExtra(r0, r12)     // Catch:{ JSONException -> 0x01c2 }
            r1.setPackage(r14)     // Catch:{ JSONException -> 0x01c2 }
            r1.setAction(r13)     // Catch:{ JSONException -> 0x01c2 }
            android.content.Context r0 = r8.A00     // Catch:{ JSONException -> 0x01c2 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ JSONException -> 0x01c2 }
            android.content.ComponentName r0 = r1.resolveActivity(r0)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 == 0) goto L_0x01ae
            java.lang.String r8 = r9.A06     // Catch:{ JSONException -> 0x01c2 }
            r2 = r8
        L_0x0183:
            java.lang.String r1 = "app_to_app_request_payload"
            java.lang.String r0 = r9.A09     // Catch:{ JSONException -> 0x01c2 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "app_to_app_partner_app_package"
            r3.put(r0, r7)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "app_to_app_partner_app_name"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "app_to_app_partner_intent_action"
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x01c2 }
        L_0x0199:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x01c2 }
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = "card_verify_method_title"
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r0 = "card_verify_method_description"
            r3.put(r0, r8)     // Catch:{ JSONException -> 0x01c2 }
        L_0x01a9:
            r4.put(r3)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x0008
        L_0x01ae:
            r3.put(r2, r11)     // Catch:{ JSONException -> 0x01c2 }
            r9.A0C = r11     // Catch:{ JSONException -> 0x01c2 }
            r1 = 2131887139(0x7f120423, float:1.9408877E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r2 = r9.A06     // Catch:{ JSONException -> 0x01c2 }
            r0[r10] = r2     // Catch:{ JSONException -> 0x01c2 }
            java.lang.String r8 = r8.A02(r1, r0)     // Catch:{ JSONException -> 0x01c2 }
            goto L_0x0183
        L_0x01c1:
            return r4
        L_0x01c2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: BrazilPayBloksActivity cardVerifyMethodsToJsonArray: "
            X.C36321k7.A1J(r2, r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201269jE.A02(java.util.List):org.json.JSONArray");
    }

    public JSONObject A03(List list) {
        try {
            JSONObject A1B = C36441kJ.A1B();
            JSONArray A0u = C90524aI.A0u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C175858bB r5 = (C175858bB) it.next();
                C175798b4 r6 = (C175798b4) r5.A07();
                JSONObject A1B2 = C36441kJ.A1B();
                A1B2.put("credential_id", r5.A0H);
                if (r6 != null) {
                    A1B2.put("network_name", C175798b4.A02(r6.A01));
                }
                if (!TextUtils.isEmpty(r5.A0E)) {
                    A1B2.put("card_image_url", r5.A0E);
                }
                A1B2.put("last4", r5.A0J);
                A1B2.put("readable_name", C203449o2.A02(this.A00.A00, r6));
                A1B2.put("verified_state", r5.A0a);
                A0u.put(A1B2);
            }
            A1B.put("card_list", A0u);
            return A1B;
        } catch (JSONException e) {
            Log.e("PAY: BrazilPayBloksActivity BrazilCardsToJsonArrayException: ", e);
            return null;
        }
    }
}
