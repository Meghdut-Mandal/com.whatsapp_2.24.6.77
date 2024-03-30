package X;

import android.content.Context;
import java.util.ArrayList;

public class B7L extends C178498gd {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7L(Context context, AnonymousClass17Y r11, C29221Vu r12, AnonymousClass9YX r13, AnonymousClass8gR r14, AF7 af7) {
        super(context, r11, r12, r13, af7, "upi-change-mpin", 7);
        this.A01 = 5;
        this.A00 = r14;
    }

    public void A05(C202059ky r3) {
        switch (this.A01) {
            case 0:
                super.A05(r3);
                B2W b2w = ((AnonymousClass8gH) this.A00).A04;
                if (b2w != null) {
                    b2w.BYc(r3, false);
                    return;
                }
                return;
            case 1:
                super.A05(r3);
                C22961AzD azD = ((AnonymousClass8gE) this.A00).A00;
                if (azD != null) {
                    azD.Bdq(r3);
                    return;
                }
                return;
            case 2:
                super.A05(r3);
                C36321k7.A1K(r3, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", AnonymousClass000.A0u());
                A08(r3);
                return;
            case 3:
                super.A05(r3);
                C36321k7.A1K(r3, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", AnonymousClass000.A0u());
                B1L b1l = ((C199129ek) this.A00).A01;
                if (b1l != null) {
                    b1l.BS2(r3, (ArrayList) null);
                    return;
                }
                return;
            default:
                super.A05(r3);
                B1N b1n = ((AnonymousClass8gR) this.A00).A00;
                if (b1n != null) {
                    b1n.BgO(r3);
                    return;
                }
                return;
        }
    }

    public void A06(C202059ky r3) {
        switch (this.A01) {
            case 0:
                super.A06(r3);
                B2W b2w = ((AnonymousClass8gH) this.A00).A04;
                if (b2w != null) {
                    b2w.BYc(r3, false);
                    return;
                }
                return;
            case 1:
                super.A06(r3);
                C22961AzD azD = ((AnonymousClass8gE) this.A00).A00;
                if (azD != null) {
                    azD.Bdq(r3);
                    return;
                }
                return;
            case 2:
                super.A06(r3);
                C36321k7.A1K(r3, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", AnonymousClass000.A0u());
                A08(r3);
                return;
            case 3:
                super.A06(r3);
                C36321k7.A1K(r3, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", AnonymousClass000.A0u());
                B1L b1l = ((C199129ek) this.A00).A01;
                if (b1l != null) {
                    b1l.BS2(r3, (ArrayList) null);
                    return;
                }
                return;
            default:
                super.A06(r3);
                B1N b1n = ((AnonymousClass8gR) this.A00).A00;
                if (b1n != null) {
                    b1n.BgO(r3);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        if (r2 == null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r14) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0057;
                case 2: goto L_0x010f;
                case 3: goto L_0x013b;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A07(r14)
            java.lang.Object r0 = r13.A00
            X.8gR r0 = (X.AnonymousClass8gR) r0
            X.B1N r1 = r0.A00
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.BgO(r0)
        L_0x0014:
            return
        L_0x0015:
            super.A07(r14)
            X.9nx r0 = X.C203399nx.A03(r14)
            r4 = 0
            r6 = 0
            if (r0 == 0) goto L_0x0046
            java.lang.String r11 = "token"
            java.lang.String r9 = r0.A0i(r11, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token stored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r5 = r13.A00
            X.8gH r5 = (X.AnonymousClass8gH) r5
            X.AE0 r1 = r5.A03
            monitor-enter(r1)
            goto L_0x014e
        L_0x003a:
            java.lang.Object r0 = r13.A00
            X.8gH r0 = (X.AnonymousClass8gH) r0
            X.B2W r0 = r0.A04
            if (r0 == 0) goto L_0x0014
            r0.BYc(r4, r6)
            return
        L_0x0046:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token missing account node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r13.A00
            X.8gH r0 = (X.AnonymousClass8gH) r0
            X.B2W r0 = r0.A04
            if (r0 == 0) goto L_0x0014
            r0.BYc(r4, r6)
            return
        L_0x0057:
            super.A07(r14)
            java.lang.Object r6 = r13.A00
            X.8gE r6 = (X.AnonymousClass8gE) r6
            X.1EU r0 = r6.A07
            X.AF8 r0 = X.C165587tf.A0W(r0)
            X.AzA r1 = r0.BFB()
            X.C18740tg.A06(r1)
            X.16T r0 = r6.A03
            java.util.ArrayList r0 = r1.BlE(r0, r14)
            X.9lR r1 = r6.A05
            X.9YX r4 = r6.A00
            X.9KU r0 = r1.A03(r4, r0)
            java.util.ArrayList r5 = r0.A02
            X.8aw r2 = r0.A00
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0086
            r0 = 1
            if (r2 != 0) goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            java.lang.String r3 = "upi-get-psp-routing-and-list-keys"
            if (r0 == 0) goto L_0x00f2
            r1.A07 = r5
            r1.A03 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: "
            X.C36321k7.A1K(r5, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: "
            X.C36321k7.A1K(r2, r0, r1)
            r4.A03(r3)
            X.AzD r7 = r6.A00
            if (r7 == 0) goto L_0x00c6
            X.8hf r7 = (X.C178828hf) r7
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00d4
            if (r2 == 0) goto L_0x00d4
            r6 = 0
            X.0wU r5 = r7.A04
            X.1EU r2 = r7.A0P
            X.9FJ r0 = new X.9FJ
            r0.<init>(r7)
            X.8qs r1 = new X.8qs
            r1.<init>(r7, r2, r0)
            X.012[] r0 = new X.AnonymousClass012[r6]
            r5.Box(r1, r0)
        L_0x00c6:
            java.util.ArrayList r0 = r4.A05
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0014
            r0 = 500(0x1f4, float:7.0E-43)
            r4.A04(r3, r0)
            return
        L_0x00d4:
            X.1Dc r2 = r7.A0p
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onPspRoutingAndListKeys error. showGenericError error: "
            r1.append(r0)
            X.9YX r0 = r7.A01
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C36441kJ.A10(r3, r0)
            int r0 = X.C90484aE.A0B(r0)
            X.C165577te.A1D(r2, r1, r0)
            r7.A47()
            goto L_0x00c6
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: received invalid data from upi-get-psp-routing-and-list-keys: psps: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " pspRouting: "
            X.C36321k7.A1L(r2, r0, r1)
            X.AzD r1 = r6.A00
            if (r1 == 0) goto L_0x00c6
            X.9ky r0 = X.C202059ky.A00()
            r1.Bdq(r0)
            goto L_0x00c6
        L_0x010f:
            super.A07(r14)
            java.lang.Object r5 = r13.A00
            X.9ek r5 = (X.C199129ek) r5
            X.9jn r0 = r5.A0G
            java.lang.String r4 = r0.A04()
            X.AE0 r0 = r5.A0A
            java.lang.String r3 = r5.A03
            java.lang.String r2 = r5.A04
            r0.A0K(r3, r2, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: "
            java.lang.String r0 = X.C178498gd.A01(r0, r3, r2, r4, r1)
            X.C36321k7.A1a(r1, r0)
            X.B1L r1 = r5.A01
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.BVU(r0)
            return
        L_0x013b:
            super.A07(r14)
            java.lang.Object r0 = r13.A00
            X.9ek r0 = (X.C199129ek) r0
            X.0wU r2 = r0.A0I
            r1 = 1
            X.B7W r0 = new X.B7W
            r0.<init>(r14, r13, r1)
            X.C36331k8.A1F(r0, r2)
            return
        L_0x014e:
            X.1Db r10 = r1.A01     // Catch:{ JSONException -> 0x017c }
            java.lang.String r7 = r10.A06()     // Catch:{ JSONException -> 0x017c }
            X.0wo r0 = r1.A00     // Catch:{ JSONException -> 0x017c }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ JSONException -> 0x017c }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x017c }
            if (r0 == 0) goto L_0x0177
            org.json.JSONObject r8 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x017c }
        L_0x0164:
            java.lang.String r7 = "v"
            java.lang.String r0 = "2"
            r8.put(r7, r0)     // Catch:{ JSONException -> 0x017c }
            r8.put(r11, r9)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = "tokenTs"
            r8.put(r0, r2)     // Catch:{ JSONException -> 0x017c }
            X.C165577te.A1B(r10, r8)     // Catch:{ JSONException -> 0x017c }
            goto L_0x0182
        L_0x0177:
            org.json.JSONObject r8 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x017c }
            goto L_0x0164
        L_0x017c:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs storeToken threw: "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x023b }
        L_0x0182:
            monitor-exit(r1)
            byte[] r6 = android.util.Base64.decode(r9, r6)
            X.B2W r8 = r5.A04
            if (r8 == 0) goto L_0x018f
            r0 = 1
            r8.BYc(r4, r0)
        L_0x018f:
            X.AFC r9 = r5.A07
            java.lang.String r12 = r5.A0A
            X.0wU r3 = r5.A09
            X.1Vl r10 = r5.A08
            java.lang.Class<X.9Sg> r1 = X.C195049Sg.class
            monitor-enter(r1)
            java.lang.String r4 = r10.A01()     // Catch:{ all -> 0x023b }
            java.lang.String r5 = "|"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r0 = "com.whatsapp"
            X.AnonymousClass000.A1D(r0, r5, r12, r2)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r5 = X.AnonymousClass000.A0p(r5, r4, r2)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r5.getBytes(r0)     // Catch:{ Exception -> 0x01e6 }
            r2.update(r0)     // Catch:{ Exception -> 0x01e6 }
            byte[] r7 = r2.digest()     // Catch:{ Exception -> 0x01e6 }
            javax.crypto.spec.SecretKeySpec r6 = X.C90494aF.A0m(r6)     // Catch:{ Exception -> 0x01ec }
            r0 = 16
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x01ec }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x01ec }
            r5.<init>(r0)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x01e0 }
            r0 = 1
            r2.init(r0, r6, r5)     // Catch:{ Exception -> 0x01e0 }
            byte[] r0 = r2.doFinal(r7)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r11 = X.C36441kJ.A13(r0)     // Catch:{ Exception -> 0x01ec }
            goto L_0x01f3
        L_0x01e0:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ Exception -> 0x01ec }
            goto L_0x01eb
        L_0x01e6:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ Exception -> 0x01ec }
        L_0x01eb:
            throw r0     // Catch:{ Exception -> 0x01ec }
        L_0x01ec:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp threw: "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x023b }
            r11 = 0
        L_0x01f3:
            r2 = 0
            if (r11 == 0) goto L_0x022f
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x023b }
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x023b }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x023b }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x023b }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x023b }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x023b }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x0221
            r2 = 0
        L_0x0221:
            X.C18740tg.A0C(r2)     // Catch:{ all -> 0x023b }
            X.8rA r7 = new X.8rA     // Catch:{ all -> 0x023b }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x023b }
            X.C195049Sg.A0A = r7     // Catch:{ all -> 0x023b }
            X.C36391kE.A1Q(r7, r3)     // Catch:{ all -> 0x023b }
            goto L_0x0239
        L_0x022f:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp got null intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x023b }
            if (r8 == 0) goto L_0x0239
            r8.BeN(r2)     // Catch:{ all -> 0x023b }
        L_0x0239:
            monitor-exit(r1)
            return
        L_0x023b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7L.A07(X.9nx):void");
    }

    public void A08(C202059ky r7) {
        C199129ek r5 = (C199129ek) this.A00;
        if (r5.A01 != null) {
            if (r7.A00 == 11453) {
                String A04 = r5.A0G.A04();
                AE0 ae0 = r5.A0A;
                String str = r5.A03;
                String str2 = r5.A04;
                ae0.A0K(str, str2, A04);
                StringBuilder A0u = AnonymousClass000.A0u();
                C36321k7.A1a(A0u, C178498gd.A01("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ", str, str2, A04, A0u));
            }
            r5.A01.BVU(r7);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public B7L(android.content.Context r13, X.AnonymousClass17Y r14, X.C29221Vu r15, X.AnonymousClass9YX r16, X.C199129ek r17, X.AF7 r18, X.AnonymousClass5GM r19, java.lang.String r20, int r21) {
        /*
            r12 = this;
            r2 = r12
            r0 = r21
            r12.A01 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r10 = r20
            r1 = r17
            int r21 = 2 - r21
            if (r21 == 0) goto L_0x0020
            java.lang.String r9 = "upi-get-accounts"
            r11 = 18
        L_0x001a:
            r12.A00 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0020:
            java.lang.String r9 = "upi-bind-device"
            r11 = 20
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7L.<init>(android.content.Context, X.17Y, X.1Vu, X.9YX, X.9ek, X.AF7, X.5GM, java.lang.String, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7L(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gE r12) {
        super(context, r9, r10, r11, "upi-get-psp-routing-and-list-keys");
        this.A01 = 1;
        this.A00 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7L(Context context, AnonymousClass17Y r9, AnonymousClass8gH r10, C29221Vu r11, AnonymousClass9YX r12) {
        super(context, r9, r11, r12, "upi-get-token");
        this.A01 = 0;
        this.A00 = r10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7L(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gR r12) {
        super(context, r9, r10, r11, "upi-set-mpin");
        this.A01 = 4;
        this.A00 = r12;
    }
}
