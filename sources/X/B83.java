package X;

import android.content.DialogInterface;

public class B83 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public B83(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C39001qm r1, Object obj, int i, int i2) {
        r1.A0f(new B83(obj, i), i2);
    }

    public static void A01(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new B83(obj, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x034d, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0350, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
        r1.A3v();
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018f, code lost:
        r2.A0m = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0192, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0287, code lost:
        X.AnonymousClass3SJ.A00(r2, r0);
        X.AnonymousClass1L0.A03(r2, false);
        com.whatsapp.util.Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
        r2.setResult(0);
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0299, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031d, code lost:
        X.AnonymousClass3SJ.A00(r6, r0);
        r6.A00.A00(r6, X.C165607th.A0H(r6), X.C36431kI.A13(), X.C36391kE.A0v(r6, "https://whatsapp.com/dl/", X.AnonymousClass001.A0L(), 0, com.whatsapp.R.string.f12nameremoved));
        r6.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x033e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r14, int r15) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x035f;
                case 1: goto L_0x0351;
                case 2: goto L_0x0347;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x033f;
                case 6: goto L_0x0318;
                case 7: goto L_0x0302;
                case 8: goto L_0x02e2;
                case 9: goto L_0x02dc;
                case 10: goto L_0x02bc;
                case 11: goto L_0x02b3;
                case 12: goto L_0x02aa;
                case 13: goto L_0x000d;
                case 14: goto L_0x02a2;
                case 15: goto L_0x029a;
                case 16: goto L_0x0281;
                case 17: goto L_0x027a;
                case 18: goto L_0x0005;
                case 19: goto L_0x0270;
                case 20: goto L_0x0218;
                case 21: goto L_0x01f7;
                case 22: goto L_0x01ef;
                case 23: goto L_0x01e7;
                case 24: goto L_0x01cb;
                case 25: goto L_0x01c3;
                case 26: goto L_0x01b9;
                case 27: goto L_0x01b1;
                case 28: goto L_0x01a9;
                case 29: goto L_0x019b;
                case 30: goto L_0x0193;
                case 31: goto L_0x0167;
                case 32: goto L_0x0104;
                case 33: goto L_0x00d9;
                case 34: goto L_0x0005;
                case 35: goto L_0x00c8;
                case 36: goto L_0x00b8;
                case 37: goto L_0x00a5;
                case 38: goto L_0x0005;
                case 39: goto L_0x0083;
                case 40: goto L_0x0076;
                case 41: goto L_0x006f;
                case 42: goto L_0x0062;
                case 43: goto L_0x0055;
                case 44: goto L_0x004e;
                case 45: goto L_0x0040;
                case 46: goto L_0x0039;
                case 47: goto L_0x002c;
                case 48: goto L_0x001f;
                case 49: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r13.A00
            X.B1D r0 = (X.B1D) r0
            if (r0 == 0) goto L_0x000c
            r0.Bfi()
            return
        L_0x0017:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 10
            goto L_0x00be
        L_0x001f:
            java.lang.Object r1 = r13.A00
            X.8hw r1 = (X.C178848hw) r1
            r0 = 10
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A4Q()
            return
        L_0x002c:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 34
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A3v()
            return
        L_0x0039:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 22
            goto L_0x00be
        L_0x0040:
            java.lang.Object r0 = r13.A00
            X.8jE r0 = (X.C179128jE) r0
            r14.dismiss()
            r0.A3v()
            r0.finish()
            return
        L_0x004e:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 13
            goto L_0x00be
        L_0x0055:
            java.lang.Object r1 = r13.A00
            X.8jC r1 = (X.C179108jC) r1
            r0 = 13
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A4A()
            return
        L_0x0062:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.finish()
            return
        L_0x006f:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 12
            goto L_0x00be
        L_0x0076:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 38
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A3v()
            return
        L_0x0083:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r5
            r0 = 38
            X.AnonymousClass3SJ.A00(r5, r0)
            r5.A3v()
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r4 = r5.A0F
            X.8gD r3 = r5.A0C
            X.9tr r2 = r5.A0B
            X.AE0 r0 = r5.A0M
            X.6c7 r1 = r0.A08()
            X.AE0 r0 = r5.A0M
            java.lang.String r0 = r0.A0E()
            r4.A0T(r1, r2, r3, r0)
            return
        L_0x00a5:
            java.lang.Object r1 = r13.A00
            X.8jC r1 = (X.C179108jC) r1
            r14.dismiss()
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r1.Bu1(r0)
            X.8gR r0 = r1.A08
            r0.A02()
            return
        L_0x00b8:
            java.lang.Object r1 = r13.A00
            X.8jE r1 = (X.C179128jE) r1
            r0 = 27
        L_0x00be:
            X.AnonymousClass3SJ.A00(r1, r0)
            r1.A3v()
            r1.finish()
            return
        L_0x00c8:
            java.lang.Object r3 = r13.A00
            X.155 r3 = (X.AnonymousClass155) r3
            X.1Dv r2 = r3.A01
            java.lang.String r0 = "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.Bp7(r3, r1, r0)
            return
        L_0x00d9:
            java.lang.Object r3 = r13.A00
            X.8jA r3 = (X.C179098jA) r3
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.Bu1(r0)
            X.17Y r4 = r3.A05
            X.0wU r12 = r3.A04
            X.1Vl r11 = r3.A0D
            X.1EU r10 = r3.A0P
            X.0xM r5 = r3.A07
            X.1Db r7 = r3.A0P
            X.1Vk r8 = r3.A0M
            X.1XA r9 = r3.A08
            X.1Vu r6 = r3.A0K
            X.9XR r2 = new X.9XR
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 2
            X.B8c r0 = new X.B8c
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0104:
            java.lang.Object r2 = r13.A00
            X.8jE r2 = (X.C179128jE) r2
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x012f
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.Integer r0 = X.C36371kC.A0n()
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A1D(r2, r1, r0)
            X.8kT r0 = r2.A0L
            r1 = 4
            X.0zf r0 = r0.A00
            r0.A0C(r1)
            X.8kS r0 = r2.A0K
            X.0zf r0 = r0.A00
            r0.A0C(r1)
            r0 = 0
            r2.A0m = r0
        L_0x012b:
            r2.finish()
            return
        L_0x012f:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity
            if (r0 == 0) goto L_0x0148
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r2
            r0 = 0
            r2.A0m = r0
            java.lang.Integer r0 = X.C36371kC.A0n()
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.A12(r2, r0)
            X.8kT r0 = r2.A0C
            r1 = 4
            X.0zf r0 = r0.A00
            r0.A0C(r1)
            goto L_0x012b
        L_0x0148:
            boolean r0 = r2 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x018f
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r2 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r2
            r0 = 0
            r2.A0m = r0
            r2.A3v()
            r2.finish()
            java.lang.Integer r0 = X.C36371kC.A0n()
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity.A10(r2, r0)
            X.8kT r0 = r2.A04
            r1 = 4
            X.0zf r0 = r0.A00
            r0.A0C(r1)
            return
        L_0x0167:
            java.lang.Object r2 = r13.A00
            X.8jE r2 = (X.C179128jE) r2
            boolean r0 = r2 instanceof X.C178838hl
            if (r0 == 0) goto L_0x0182
            X.8hl r2 = (X.C178838hl) r2
            r0 = 0
            r2.A0m = r0
            X.9ky r1 = r2.A02
            if (r1 == 0) goto L_0x017e
            boolean r0 = r2.A06
            X.C178838hl.A0z(r1, r2, r0)
            return
        L_0x017e:
            X.C178838hl.A11(r2)
            return
        L_0x0182:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x018f
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            r0 = 0
            r2.A0m = r0
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A19(r2)
            return
        L_0x018f:
            r0 = 0
            r2.A0m = r0
            return
        L_0x0193:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 100
            goto L_0x034d
        L_0x019b:
            java.lang.Object r1 = r13.A00
            X.8i4 r1 = (X.C178888i4) r1
            r0 = 200(0xc8, float:2.8E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 1
            r1.A3k(r0)
            return
        L_0x01a9:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x034d
        L_0x01b1:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x034d
        L_0x01b9:
            java.lang.Object r1 = r13.A00
            X.155 r1 = (X.AnonymousClass155) r1
            r0 = 101(0x65, float:1.42E-43)
            X.C165577te.A13(r1, r0)
            return
        L_0x01c3:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x034d
        L_0x01cb:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass3SJ.A00(r3, r0)
            java.lang.Class<com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity> r0 = com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r0)
            X.8az r1 = r3.A00
            java.lang.String r0 = "extra_bank_account"
            r2.putExtra(r0, r1)
            r0 = 1020(0x3fc, float:1.43E-42)
            r3.BuO(r2, r0)
            return
        L_0x01e7:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x034d
        L_0x01ef:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x034d
        L_0x01f7:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            r0 = 100
            X.AnonymousClass3SJ.A00(r3, r0)
            X.1Dc r1 = r3.A0L
            java.lang.String r0 = "unlinking the payment account."
            r1.A06(r0)
            java.lang.Class<com.whatsapp.payments.ui.PaymentDeleteAccountActivity> r0 = com.whatsapp.payments.ui.PaymentDeleteAccountActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r0)
            r1 = 1
            java.lang.String r0 = "extra_remove_payment_account"
            r2.putExtra(r0, r1)
            r0 = 0
            r3.startActivityForResult(r2, r0)
            return
        L_0x0218:
            java.lang.Object r0 = r13.A00
            X.2hz r0 = (X.C48752hz) r0
            java.lang.Object r0 = r0.A00
            X.8ha r0 = (X.C178798ha) r0
            java.lang.String r5 = X.C165607th.A0p(r0)
            X.8ld r1 = r0.A0L
            java.lang.String r0 = "DyiViewModel/delete-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            X.C180358ld.A02(r1, r0)
            X.9XR r7 = r1.A04
            r0 = 10
            X.B8c r8 = new X.B8c
            r8.<init>(r1, r0)
            java.lang.String r4 = r1.A08
            X.1Vk r2 = r7.A05
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = "action"
            java.lang.String r0 = "delete-payments-dyi-report"
            X.C36381kD.A1N(r1, r0, r3)
            java.lang.String r1 = "version"
            java.lang.String r0 = "1"
            X.C165587tf.A1L(r1, r0, r3)
            java.lang.String r0 = "nonce"
            X.C36351kA.A1N(r0, r5, r3)
            java.lang.String r0 = "type"
            X.C36361kB.A1Q(r0, r4, r3)
            java.lang.String r0 = "account"
            X.9nx r1 = X.C203399nx.A04(r0, r3)
            android.content.Context r4 = r7.A00
            X.17Y r6 = r7.A01
            X.1Vu r5 = r7.A03
            r9 = 11
            X.B7J r3 = new X.B7J
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "set"
            r2.A0F(r3, r1, r0)
            return
        L_0x0270:
            java.lang.Object r1 = r13.A00
            X.6C8 r1 = (X.AnonymousClass6C8) r1
            java.lang.String r0 = "on_failure"
            r1.A00(r0)
            return
        L_0x027a:
            java.lang.Object r2 = r13.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 10001(0x2711, float:1.4014E-41)
            goto L_0x0287
        L_0x0281:
            java.lang.Object r2 = r13.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 10000(0x2710, float:1.4013E-41)
        L_0x0287:
            X.AnonymousClass3SJ.A00(r2, r0)
            r1 = 0
            X.AnonymousClass1L0.A03(r2, r1)
            java.lang.String r0 = "PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.setResult(r1)
            r2.finish()
            return
        L_0x029a:
            java.lang.Object r0 = r13.A00
            X.A8e r0 = (X.C21093A8e) r0
            r0.A00()
            return
        L_0x02a2:
            java.lang.Object r0 = r13.A00
            X.A8f r0 = (X.C21094A8f) r0
            r0.A01()
            return
        L_0x02aa:
            java.lang.Object r1 = r13.A00
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment r1 = (com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment) r1
            r0 = 1
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment.A03(r1, r0)
            return
        L_0x02b3:
            java.lang.Object r1 = r13.A00
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment r1 = (com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment) r1
            r0 = 0
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment.A03(r1, r0)
            return
        L_0x02bc:
            java.lang.Object r4 = r13.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 1
            X.AnonymousClass3SJ.A00(r4, r0)
            X.1dt r3 = r4.A00
            android.net.Uri r2 = X.C165607th.A0H(r4)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x02dc:
            java.lang.Object r6 = r13.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r6 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r6
            r0 = 1
            goto L_0x031d
        L_0x02e2:
            java.lang.Object r4 = r13.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 0
            X.AnonymousClass3SJ.A00(r4, r0)
            X.1dt r3 = r4.A00
            android.net.Uri r2 = X.C165607th.A0H(r4)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x0302:
            java.lang.Object r2 = r13.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "smsdefaultappwarning/reset"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "com.whatsapp"
            r1.clearPackagePreferredActivities(r0)
            r2.finish()
            return
        L_0x0318:
            java.lang.Object r6 = r13.A00
            com.whatsapp.conversationslist.SmsDefaultAppWarning r6 = (com.whatsapp.conversationslist.SmsDefaultAppWarning) r6
            r0 = 0
        L_0x031d:
            X.AnonymousClass3SJ.A00(r6, r0)
            X.1dt r5 = r6.A00
            android.net.Uri r4 = X.C165607th.A0H(r6)
            r3 = 2131894905(0x7f122279, float:1.9424628E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            java.lang.String r0 = "https://whatsapp.com/dl/"
            java.lang.String r1 = X.C36391kE.A0v(r6, r0, r2, r1, r3)
            java.lang.Integer r0 = X.C36431kI.A13()
            r5.A00(r6, r4, r0, r1)
            r6.finish()
            return
        L_0x033f:
            java.lang.Object r0 = r13.A00
            X.A8W r0 = (X.A8W) r0
            android.app.Activity r1 = r0.A02
            r0 = 1
            goto L_0x034d
        L_0x0347:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
        L_0x034d:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0351:
            java.lang.Object r1 = r13.A00
            androidx.preference.ListPreferenceDialogFragmentCompat r1 = (androidx.preference.ListPreferenceDialogFragmentCompat) r1
            r1.A00 = r15
            r0 = -1
            r1.onClick(r14, r0)
            r14.dismiss()
            return
        L_0x035f:
            java.lang.Object r0 = r13.A00
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            X.7yg r1 = r0.A03
            r0 = 1
            r1.A0V(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B83.onClick(android.content.DialogInterface, int):void");
    }
}
