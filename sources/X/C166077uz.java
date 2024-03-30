package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7uz  reason: invalid class name and case insensitive filesystem */
public class C166077uz extends Handler {
    public final C175818b6 A00;
    public final C202269lR A01;
    public final AE0 A02;
    public final C29131Vl A03;
    public final String A04;
    public final /* synthetic */ C199129ek A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166077uz(Looper looper, C175818b6 r2, C202269lR r3, AE0 ae0, C199129ek r5, C29131Vl r6, String str) {
        super(looper);
        this.A05 = r5;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = ae0;
        this.A04 = str;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r26) {
        /*
            r25 = this;
            r6 = r25
            X.AE0 r3 = r6.A02
            java.lang.String r5 = r6.A04
            monitor-enter(r3)
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x0161 }
            r4 = 0
            X.1Db r0 = r3.A01     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0041 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0041 }
            if (r0 != 0) goto L_0x0049
            org.json.JSONObject r7 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch:{ JSONException -> 0x0041 }
            if (r0 == 0) goto L_0x0030
            org.json.JSONObject r1 = r0.optJSONObject(r5)     // Catch:{ JSONException -> 0x0041 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = "smsVerifData"
            java.lang.String r2 = r1.optString(r0, r4)     // Catch:{ JSONException -> 0x0041 }
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x003e }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "smsVerifData"
            java.lang.String r4 = r7.optString(r0, r4)     // Catch:{ JSONException -> 0x003e }
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
            r4 = r2
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0161 }
            goto L_0x0049
        L_0x0048:
            r4 = r2
        L_0x0049:
            monitor-exit(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0148
            X.1Vl r0 = r6.A03
            X.63d r1 = r0.A00
            if (r1 != 0) goto L_0x005e
            X.63d r1 = X.C29131Vl.A00(r0)
            r0.A00 = r1
            if (r1 == 0) goto L_0x008b
        L_0x005e:
            X.1Dc r8 = r1.A02
            java.lang.String r0 = "PaymentDeviceId: try to upgrade algorithm ..."
            r8.A04(r0)
            X.1Db r7 = r1.A01
            android.content.SharedPreferences r0 = r7.A03()
            java.lang.String r2 = "payments_device_id_algorithm"
            int r1 = X.C36371kC.A01(r0, r2)
            r0 = 2
            if (r1 >= r0) goto L_0x008b
            java.lang.String r0 = "PaymentDeviceId: algorithm upgraded!"
            r8.A04(r0)
            r1 = 2
            android.content.SharedPreferences$Editor r0 = X.C90494aF.A0E(r7)
            X.C36341k9.A0v(r0, r2, r1)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r7)
            java.lang.String r0 = "payments_device_id"
            X.C36341k9.A0x(r1, r0, r2)
        L_0x008b:
            monitor-enter(r3)
            r7 = 0
            X.1Db r0 = r3.A01     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x00a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00a4 }
            if (r0 != 0) goto L_0x00aa
            org.json.JSONObject r1 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r0 = "smsVerifDataGateway"
            java.lang.String r7 = r1.optString(r0, r7)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x00aa
        L_0x00a4:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsGateway threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0161 }
        L_0x00aa:
            monitor-exit(r3)
            if (r7 != 0) goto L_0x00b8
            X.9lR r3 = r6.A01
            X.8b6 r0 = r6.A00
            java.util.ArrayList r2 = X.C202269lR.A02(r0, r3)
            if (r2 != 0) goto L_0x014b
            r7 = 0
        L_0x00b8:
            X.9ek r13 = r6.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: sendDeviceBindingIq called with psp: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " verificationData: "
            r1.append(r0)
            java.lang.String r0 = X.C200449hQ.A00(r4)
            X.C36321k7.A1a(r1, r0)
            X.AF7 r14 = r13.A0E
            r0 = 20
            r15 = 0
            r1 = 0
            r14.A07(r15, r0, r1)
            X.9YX r12 = r13.A0C
            java.lang.String r0 = "upi-bind-device"
            r12.A02(r0)
            X.19A r3 = r13.A09
            java.lang.String r2 = r3.A09()
            long r0 = (long) r1
            java.util.ArrayList r6 = X.AnonymousClass5Pm.A00
            X.1Vl r6 = r13.A0H
            java.lang.String r20 = r6.A01()
            r10 = 0
            r8 = 0
            long[] r6 = X.C199129ek.A0K
            r8 = r6[r8]
            long r10 = r10 + r8
            java.lang.Long r17 = java.lang.Long.valueOf(r10)
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
            X.AE0 r0 = r13.A0A
            boolean r0 = r0.A0N()
            java.lang.String r24 = X.C165617ti.A0Y(r0)
            X.5Pm r6 = new X.5Pm
            r21 = r4
            r22 = r5
            r23 = r7
            r19 = r2
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            X.0yC r1 = r13.A08
            r0 = 2227(0x8b3, float:3.12E-42)
            boolean r5 = r1.A0E(r0)
            java.lang.String r4 = "in_upi_device_binding_tag"
            if (r5 == 0) goto L_0x012e
            X.5GM r1 = r13.A0F
            r0 = 185476608(0xb0e2600, float:2.7376793E-32)
            r1.A01(r0, r4)
        L_0x012e:
            X.9nx r1 = r6.A00
            X.0wG r0 = r13.A06
            android.content.Context r9 = r0.A00
            X.17Y r10 = r13.A05
            X.1Vu r11 = r13.A0B
            if (r5 == 0) goto L_0x0149
            X.5GM r15 = r13.A0F
        L_0x013c:
            r17 = 2
            X.B7L r8 = new X.B7L
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C165577te.A19(r3, r8, r1, r2)
        L_0x0148:
            return
        L_0x0149:
            r4 = r15
            goto L_0x013c
        L_0x014b:
            java.lang.String r0 = ""
            X.C18740tg.A09(r0, r2)
            int r1 = r2.size()
            r3.A00 = r1
            int r0 = r3.A02
            int r0 = r0 % r1
            java.lang.Object r7 = r2.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00b8
        L_0x0161:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166077uz.handleMessage(android.os.Message):void");
    }
}
