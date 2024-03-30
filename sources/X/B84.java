package X;

import android.content.DialogInterface;

public class B84 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public B84(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new B84(obj, i), i2);
    }

    public static void A01(C39001qm r1, Object obj, int i, int i2) {
        r1.A0f(new B84(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0243, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0246, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024d, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0250, code lost:
        r1.A3v();
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0256, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A01
            r3 = r16
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0088;
                case 2: goto L_0x0095;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00bb;
                case 5: goto L_0x0007;
                case 6: goto L_0x00e6;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00f6;
                case 9: goto L_0x0103;
                case 10: goto L_0x010d;
                case 11: goto L_0x0115;
                case 12: goto L_0x0120;
                case 13: goto L_0x012c;
                case 14: goto L_0x013b;
                case 15: goto L_0x0146;
                case 16: goto L_0x014e;
                case 17: goto L_0x0156;
                case 18: goto L_0x0164;
                case 19: goto L_0x0171;
                case 20: goto L_0x01c3;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x0007;
                case 25: goto L_0x01e1;
                case 26: goto L_0x0007;
                case 27: goto L_0x01eb;
                case 28: goto L_0x01f5;
                case 29: goto L_0x0007;
                case 30: goto L_0x0205;
                case 31: goto L_0x020f;
                case 32: goto L_0x021e;
                case 33: goto L_0x021e;
                case 34: goto L_0x0225;
                case 35: goto L_0x022f;
                case 36: goto L_0x0236;
                case 37: goto L_0x023d;
                case 38: goto L_0x0247;
                case 39: goto L_0x0257;
                case 40: goto L_0x0271;
                case 41: goto L_0x027a;
                case 42: goto L_0x02e9;
                case 43: goto L_0x0007;
                case 44: goto L_0x000f;
                case 45: goto L_0x0313;
                case 46: goto L_0x0007;
                case 47: goto L_0x031b;
                case 48: goto L_0x031b;
                case 49: goto L_0x031b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x000b:
            r0.finish()
            return
        L_0x000f:
            java.lang.Object r0 = r15.A00
            X.AGg r0 = (X.C21302AGg) r0
            X.155 r0 = r0.A01
            goto L_0x000b
        L_0x0016:
            java.lang.Object r3 = r15.A00
            X.8hw r3 = (X.C178848hw) r3
            r0 = 10
            X.AnonymousClass3SJ.A00(r3, r0)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.Bu1(r0)
            X.AE0 r0 = r3.A0M
            java.lang.String r6 = r0.A0D()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            X.8bI r1 = r3.A0O
            boolean r0 = X.AnonymousClass000.A1W(r1)
            if (r2 != 0) goto L_0x0082
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = X.C178848hw.A1C(r3)
            r1.A0S = r0
            X.9un r0 = r3.A0B
            X.8bF r2 = r0.A08
            X.8b6 r2 = (X.C175818b6) r2
            X.9YX r1 = r3.A04
            java.lang.String r0 = "upi-get-credential"
            r1.A01(r0)
            X.9un r0 = r3.A0B
            java.lang.String r7 = r0.A0B
            X.6c7 r5 = r2.A07
            X.8bI r1 = r3.A0O
            X.16X r4 = r3.A09
            java.lang.Object r11 = X.C207249un.A06(r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = X.C178848hw.A1B(r3)
            X.141 r0 = r3.A08
            if (r0 != 0) goto L_0x0079
            r13 = 0
        L_0x0065:
            java.lang.String r0 = r3.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r14 = 6
            if (r0 != 0) goto L_0x006f
            r14 = 5
        L_0x006f:
            java.lang.String r8 = r1.A0Q
            java.lang.String r9 = r1.A0O
            java.lang.String r10 = r1.A0S
            r3.A4G(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0079:
            java.lang.String r13 = X.AnonymousClass3U8.A03(r0)
            goto L_0x0065
        L_0x007e:
            r3.A4D()
            return
        L_0x0082:
            X.8gR r0 = r3.A08
            r0.A02()
            return
        L_0x0088:
            java.lang.Object r1 = r15.A00
            X.8hw r1 = (X.C178848hw) r1
            r0 = 11
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A4Q()
            return
        L_0x0095:
            java.lang.Object r2 = r15.A00
            X.8hw r2 = (X.C178848hw) r2
            r3.dismiss()
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r2.Bu1(r0)
            X.AE0 r0 = r2.A0M
            java.lang.String r1 = r0.A0D()
            r0 = 0
            r2.BZk(r0, r1)
            return
        L_0x00ad:
            java.lang.Object r0 = r15.A00
            X.8jE r0 = (X.C179128jE) r0
            r3.dismiss()
            r0.A3v()
            r0.finish()
            return
        L_0x00bb:
            java.lang.Object r3 = r15.A00
            X.8hw r3 = (X.C178848hw) r3
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.Bu1(r0)
            X.17Y r4 = r3.A05
            X.0wU r12 = r3.A04
            X.1Vl r11 = r3.A0D
            X.1EU r10 = r3.A0P
            X.0xM r5 = r3.A07
            X.1Db r7 = r3.A0P
            X.1Vk r8 = r3.A0M
            X.1XA r9 = r3.A0C
            X.1Vu r6 = r3.A0K
            X.9XR r2 = new X.9XR
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 4
            X.B8c r0 = new X.B8c
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x00e6:
            java.lang.Object r1 = r15.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 33
            goto L_0x024d
        L_0x00ee:
            java.lang.Object r1 = r15.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 11
            goto L_0x024d
        L_0x00f6:
            java.lang.Object r1 = r15.A00
            X.8hw r1 = (X.C178848hw) r1
            r0 = 12
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A4Q()
            return
        L_0x0103:
            java.lang.Object r1 = r15.A00
            X.155 r1 = (X.AnonymousClass155) r1
            r0 = 29
            X.C165577te.A13(r1, r0)
            return
        L_0x010d:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 29
            goto L_0x0243
        L_0x0115:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.ADz r1 = r0.A0k
            r0 = 1
            r1.A00(r0)
            return
        L_0x0120:
            java.lang.Object r0 = r15.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r1 = r0.A0i()
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0243
        L_0x012c:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.8lb r1 = r0.A07
            X.8lT r0 = new X.8lT
            r0.<init>()
            r1.A0d(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r3.dismiss()
            r0.finish()
            return
        L_0x0146:
            java.lang.Object r1 = r15.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 28
            goto L_0x024d
        L_0x014e:
            java.lang.Object r0 = r15.A00
            X.8jC r0 = (X.C179108jC) r0
            r0.A4C()
            return
        L_0x0156:
            java.lang.Object r1 = r15.A00
            X.8jC r1 = (X.C179108jC) r1
            r0 = 19
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 0
            r1.A0F = r0
            goto L_0x0250
        L_0x0164:
            java.lang.Object r1 = r15.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 28
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A3v()
            return
        L_0x0171:
            java.lang.Object r5 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            r6 = 38
            X.AF7 r4 = r5.A0S
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0p()
            java.lang.String r1 = "alias_remove_confirm_dialog"
            java.lang.String r0 = "payments_profile"
            r4.BOm(r3, r2, r1, r0)
            X.AnonymousClass3SJ.A00(r5, r6)
            r5.A3v()
            X.9gl r0 = r5.A05
            java.util.ArrayList r0 = r0.A02()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01be
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r4 = r5.A06
            X.8gD r3 = r5.A04
            X.9gl r0 = r5.A05
            java.util.ArrayList r0 = r0.A02()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            X.9tr r2 = (X.C206719tr) r2
            X.AE0 r0 = r5.A0M
            X.6c7 r1 = r0.A08()
            X.AE0 r0 = r5.A0M
            java.lang.String r0 = r0.A0E()
            r4.A0T(r1, r2, r3, r0)
            return
        L_0x01be:
            r0 = 0
            r5.A47(r0)
            return
        L_0x01c3:
            java.lang.Object r6 = r15.A00
            X.8jE r6 = (X.C179128jE) r6
            r5 = 38
            X.AF7 r4 = r6.A0S
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0n()
            java.lang.String r1 = "alias_remove_confirm_dialog"
            java.lang.String r0 = "payments_profile"
            r4.BOm(r3, r2, r1, r0)
            X.AnonymousClass3SJ.A00(r6, r5)
            r6.A3v()
            return
        L_0x01e1:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.7yl r0 = r0.A06
            X.C167757yl.A01(r0)
            return
        L_0x01eb:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.7yl r0 = r0.A06
            X.C167757yl.A03(r0)
            return
        L_0x01f5:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.7yl r1 = r0.A06
            r0 = 1
            r1.A02 = r0
            X.1Rs r1 = r1.A00
            r0 = 6
            X.C193699Mm.A00(r1, r0)
            return
        L_0x0205:
            java.lang.Object r1 = r15.A00
            X.155 r1 = (X.AnonymousClass155) r1
            r0 = 29
            X.C165577te.A13(r1, r0)
            return
        L_0x020f:
            java.lang.Object r1 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 29
            X.AnonymousClass3SJ.A00(r1, r0)
            X.7ny r0 = r1.A0M
            r0.BcN()
            return
        L_0x021e:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 35
            goto L_0x0243
        L_0x0225:
            java.lang.Object r1 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 0
            r1.A0J = r0
            r0 = 37
            goto L_0x0243
        L_0x022f:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 39
            goto L_0x0243
        L_0x0236:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 40
            goto L_0x0243
        L_0x023d:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 41
        L_0x0243:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0247:
            java.lang.Object r1 = r15.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 32
        L_0x024d:
            X.AnonymousClass3SJ.A00(r1, r0)
        L_0x0250:
            r1.A3v()
            r1.finish()
            return
        L_0x0257:
            java.lang.Object r2 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity r2 = (com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity) r2
            r6 = 1
            X.9Xv r1 = r2.A02
            X.1Vk r4 = r2.A04
            X.6c7 r0 = r2.A01
            java.lang.Object r5 = X.C165577te.A0g(r0)
            java.lang.String r5 = (java.lang.String) r5
            X.ADr r3 = new X.ADr
            r3.<init>(r2, r6)
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x0271:
            java.lang.Object r0 = r15.A00
            X.C36321k7.A0w(r0, r3)
            r3.dismiss()
            return
        L_0x027a:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            X.AF6 r3 = r0.A06
            if (r3 == 0) goto L_0x02e2
            java.lang.Integer r5 = X.C36371kC.A0o()
            X.6Ps r4 = X.C165567td.A0F()
            java.lang.String r2 = "p2m_type"
            java.lang.String r1 = "p2m_lite"
            r4.A03(r2, r1)
            r8 = 1
            java.lang.String r6 = "remove_payments_info_dialogue"
            java.lang.String r7 = "payment_home"
            r3.A00(r4, r5, r6, r7, r8)
            X.17Y r3 = r0.A0D
            r2 = 2131893491(0x7f121cf3, float:1.942176E38)
            r1 = 0
            r3.A05(r1, r2)
            android.content.Context r4 = r0.A1D()
            X.17Y r5 = r0.A0D
            X.0wU r13 = r0.A0t
            X.1Vl r12 = r0.A0A
            if (r12 == 0) goto L_0x02db
            X.1EU r11 = r0.A0e
            X.0xM r6 = r0.A04
            if (r6 == 0) goto L_0x02d4
            X.1Db r8 = r0.A0Z
            X.1Vk r9 = r0.A0b
            X.1XA r10 = r0.A05
            if (r10 == 0) goto L_0x02cd
            X.1Vu r7 = r0.A0W
            X.9XR r3 = new X.9XR
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = 5
            X.B8c r1 = new X.B8c
            r1.<init>(r0, r2)
            r3.A00(r1)
            return
        L_0x02cd:
            java.lang.String r0 = "paymentsLifecycleManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02d4:
            java.lang.String r0 = "coreMessageStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02db:
            java.lang.String r0 = "paymentDeviceId"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e2:
            java.lang.String r0 = "p2mLiteEventLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e9:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            X.AF6 r4 = r0.A06
            if (r4 == 0) goto L_0x030c
            java.lang.Integer r6 = X.C36371kC.A0n()
            X.6Ps r5 = X.C165567td.A0F()
            java.lang.String r1 = "p2m_type"
            java.lang.String r0 = "p2m_lite"
            r5.A03(r1, r0)
            r9 = 1
            java.lang.String r7 = "remove_payments_info_dialogue"
            java.lang.String r8 = "payment_home"
            r4.A00(r5, r6, r7, r8, r9)
            r3.cancel()
            return
        L_0x030c:
            java.lang.String r0 = "p2mLiteEventLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0313:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A3i()
            return
        L_0x031b:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B84.onClick(android.content.DialogInterface, int):void");
    }
}
