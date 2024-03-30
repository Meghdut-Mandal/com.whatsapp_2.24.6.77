package X;

import android.content.Context;

/* renamed from: X.9d9  reason: invalid class name and case insensitive filesystem */
public class C198249d9 {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass16T A02;
    public final C29221Vu A03;
    public final C29121Vk A04;
    public final AnonymousClass1EU A05;
    public final C200049gU A06;
    public final C24611Dc A07 = C24611Dc.A00("BrazilAddCredentialAction", "network", "BR");
    public final C201219j5 A08;
    public final C19730wQ A09;
    public final C19970wo A0A;
    public final AnonymousClass19A A0B;

    public C198249d9(Context context, AnonymousClass17Y r5, C19730wQ r6, C19970wo r7, AnonymousClass16T r8, AnonymousClass19A r9, C29221Vu r10, C29121Vk r11, AnonymousClass1EU r12, C200049gU r13, C201219j5 r14) {
        this.A0A = r7;
        this.A00 = context;
        this.A01 = r5;
        this.A09 = r6;
        this.A0B = r9;
        this.A05 = r12;
        this.A08 = r14;
        this.A04 = r11;
        this.A02 = r8;
        this.A03 = r10;
        this.A06 = r13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C198249d9 r21, X.AF3 r22, X.AnonymousClass9I8 r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            java.lang.String r0 = "pushAccountData"
            r1 = r25
            r2.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            java.lang.String r0 = "phone"
            r1 = r27
            r2.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            r3 = r26
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            java.lang.String r1 = "issuer"
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "MASTERCARD"
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "VISA"
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "V"
            r2.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r0 = "M"
            r2.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
        L_0x0037:
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            r3 = r22
            byte[] r13 = X.AF3.A00(r3, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0119 }
            r4 = r21
            X.0wo r1 = r4.A0A
            X.0wQ r0 = r4.A09
            java.lang.String r12 = X.C237919w.A00(r0, r1)
            X.19A r15 = r4.A0B
            java.lang.String r8 = r15.A09()
            java.util.ArrayList r0 = X.C185888ux.A00
            java.lang.String r9 = r3.A05
            java.lang.String r0 = r3.A04
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            if (r24 == 0) goto L_0x0115
            boolean r2 = r24.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.String r7 = "0"
        L_0x006f:
            java.lang.String r3 = r3.A03
            java.lang.String r14 = "CARD"
            java.util.ArrayList r2 = X.C185618uW.A00
            java.lang.String r2 = "credential"
            X.6QB r11 = X.C36441kJ.A0q(r2)
            r10 = 0
            r5 = 1
            boolean r2 = X.C203539oF.A0S(r3, r5, r10)
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = "key_type"
            X.C36331k8.A1D(r11, r2, r3)
        L_0x0089:
            r2 = 32786(0x8012, double:1.61984E-319)
            X.C203539oF.A0I(r13, r5, r2)
            r11.A01 = r13
            java.util.ArrayList r2 = X.C185618uW.A00
            java.lang.String r3 = "type"
            r11.A09(r14, r3, r2)
            X.9nx r11 = r11.A03()
            X.6QB r6 = X.C36421kH.A0T()
            X.C165567td.A1E(r6)
            java.lang.String r2 = "set"
            X.C36331k8.A1D(r6, r3, r2)
            X.C203539oF.A0E(r6, r8)
            X.6QB r5 = X.C165587tf.A0a()
            java.lang.String r3 = "action"
            java.lang.String r2 = "br-add-credential"
            X.C36331k8.A1D(r5, r3, r2)
            r2 = 1
            r14 = r28
            boolean r13 = X.C203539oF.A0T(r14, r2, r10)
            if (r13 == 0) goto L_0x00c5
            java.lang.String r13 = "device_id"
            X.C36331k8.A1D(r5, r13, r14)
        L_0x00c5:
            X.C203539oF.A0F(r5, r12)
            boolean r2 = X.C203539oF.A0S(r9, r2, r10)
            if (r2 == 0) goto L_0x00d3
            java.lang.String r2 = "provider"
            X.C36331k8.A1D(r5, r2, r9)
        L_0x00d3:
            r17 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            r19 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r21 = 0
            boolean r2 = X.C203539oF.A0L(r16, r17, r19, r21)
            if (r2 == 0) goto L_0x00ea
            java.lang.String r2 = "key_version"
            X.C36411kG.A1K(r5, r2, r0)
        L_0x00ea:
            java.util.ArrayList r1 = X.C185888ux.A00
            java.lang.String r0 = "is_first_card"
            r5.A09(r7, r0, r1)
            r5.A05(r11)
            X.9nx r5 = X.C165567td.A0I(r5, r6)
            android.content.Context r3 = r4.A00
            X.17Y r2 = r4.A01
            X.1Vu r1 = r4.A03
            r22 = 1
            X.B7J r0 = new X.B7J
            r21 = r23
            r17 = r3
            r18 = r1
            r19 = r2
            r20 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.C165577te.A1A(r15, r0, r5, r8)
            return
        L_0x0115:
            java.lang.String r7 = "1"
            goto L_0x006f
        L_0x0119:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198249d9.A00(X.9d9, X.AF3, X.9I8, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
