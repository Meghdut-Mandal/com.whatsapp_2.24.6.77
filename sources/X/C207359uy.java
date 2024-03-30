package X;

import android.view.View;

/* renamed from: X.9uy  reason: invalid class name and case insensitive filesystem */
public class C207359uy implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C207359uy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C207359uy(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.8jA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: X.8he} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v56, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0316, code lost:
        X.AnonymousClass3SJ.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0319, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ba, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x046a, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x046d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0511, code lost:
        com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment.A00(r3, (java.lang.String) null, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0515, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0540, code lost:
        r4.BOm(r3, r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0543, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0562, code lost:
        r2 = java.lang.Integer.valueOf(r0);
        r1 = "two_factor_nudge_prompt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0568, code lost:
        r4.BOm(r3, r2, r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x056c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029a, code lost:
        r2 = java.lang.Integer.valueOf(r0);
        r1 = null;
        r0 = "forgot_pin_prompt";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x0188;
                case 2: goto L_0x0175;
                case 3: goto L_0x0005;
                case 4: goto L_0x0197;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x01a2;
                case 8: goto L_0x01e9;
                case 9: goto L_0x01f1;
                case 10: goto L_0x01fb;
                case 11: goto L_0x020a;
                case 12: goto L_0x0242;
                case 13: goto L_0x0254;
                case 14: goto L_0x0010;
                case 15: goto L_0x00ab;
                case 16: goto L_0x025c;
                case 17: goto L_0x026f;
                case 18: goto L_0x0287;
                case 19: goto L_0x02a3;
                case 20: goto L_0x02ad;
                case 21: goto L_0x058f;
                case 22: goto L_0x02cb;
                case 23: goto L_0x02e1;
                case 24: goto L_0x031a;
                case 25: goto L_0x036e;
                case 26: goto L_0x0395;
                case 27: goto L_0x0395;
                case 28: goto L_0x039d;
                case 29: goto L_0x03a9;
                case 30: goto L_0x03be;
                case 31: goto L_0x00f6;
                case 32: goto L_0x03c4;
                case 33: goto L_0x03d4;
                case 34: goto L_0x0418;
                case 35: goto L_0x042d;
                case 36: goto L_0x048b;
                case 37: goto L_0x0494;
                case 38: goto L_0x04ae;
                case 39: goto L_0x011b;
                case 40: goto L_0x04e2;
                case 41: goto L_0x04f5;
                case 42: goto L_0x0504;
                case 43: goto L_0x0516;
                case 44: goto L_0x0544;
                case 45: goto L_0x0553;
                case 46: goto L_0x0158;
                case 47: goto L_0x056d;
                case 48: goto L_0x058f;
                case 49: goto L_0x015e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A47()
        L_0x000c:
            r0.finish()
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r5 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            X.B1m r0 = r5.A08
            r3 = 0
            if (r0 == 0) goto L_0x003f
            X.B8v r0 = (X.C23187B8v) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r1 == 0) goto L_0x003a
            X.AGT r0 = (X.AGT) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r0.A00
        L_0x0025:
            X.9Me r0 = r0.A0F
            if (r0 != 0) goto L_0x003f
            X.17Y r2 = r5.A00
            android.content.res.Resources r1 = X.C36341k9.A0G(r5)
            r0 = 2131892176(0x7f1217d0, float:1.9419093E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0E(r0, r3)
            return
        L_0x003a:
            X.AGV r0 = (X.AGV) r0
            X.8hw r0 = r0.A04
            goto L_0x0025
        L_0x003f:
            com.whatsapp.WaEditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00a2
            com.whatsapp.WaEditText r0 = r5.A01
            java.lang.String r0 = X.C36331k8.A0f(r0)
        L_0x004d:
            r5.A0B = r0
            X.6Ps[] r0 = new X.C131606Ps[r3]
            r11 = 0
            X.6Ps r7 = new X.6Ps
            r7.<init>(r11, r0)
            java.lang.String r0 = r5.A0B
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r0 = "has_description"
            r7.A04(r0, r1)
            X.AF7 r6 = r5.A07
            java.lang.Integer r8 = X.C36361kB.A0i()
            java.lang.Integer r9 = X.C36371kC.A0o()
            java.lang.String r10 = "payment_description"
            r6.BOp(r7, r8, r9, r10, r11)
            r0 = 1
            X.02E r4 = X.AnonymousClass02E.A02(r5, r0)
            X.02E r3 = r5.A0I
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            X.B1m r0 = r5.A08
            if (r0 == 0) goto L_0x0093
            java.lang.String r2 = r5.A0B
            X.B8v r0 = (X.C23187B8v) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r1 == 0) goto L_0x009d
            X.AGT r0 = (X.AGT) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r0.A00
        L_0x008c:
            r0.A0Q = r2
            com.whatsapp.payments.ui.widget.PaymentDescriptionRow r0 = r0.A0L
            r0.A01(r2)
        L_0x0093:
            boolean r0 = r4 instanceof X.C23041B1m
            if (r0 == 0) goto L_0x00a5
            if (r3 == 0) goto L_0x000f
            r3.A1n(r4)
            return
        L_0x009d:
            X.AGV r0 = (X.AGV) r0
            X.8hw r0 = r0.A04
            goto L_0x008c
        L_0x00a2:
            java.lang.String r0 = ""
            goto L_0x004d
        L_0x00a5:
            if (r3 == 0) goto L_0x000f
            r3.A1m()
            return
        L_0x00ab:
            java.lang.Object r5 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            X.02E r4 = r5.A0I
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            if (r4 == 0) goto L_0x000f
            com.whatsapp.WaEditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00f3
            com.whatsapp.WaEditText r0 = r5.A01
            java.lang.String r1 = X.C36361kB.A0n(r0)
        L_0x00c3:
            r0 = 0
            X.6Ps[] r0 = new X.C131606Ps[r0]
            r10 = 0
            X.6Ps r6 = new X.6Ps
            r6.<init>(r10, r0)
            java.lang.String r0 = r5.A0B
            boolean r0 = r1.equals(r0)
            r3 = 1
            r2 = r0 ^ 1
            boolean r1 = X.C36421kH.A1a(r1)
            java.lang.String r0 = "has_description"
            r6.A04(r0, r1)
            java.lang.String r0 = "is_description_modified"
            r6.A04(r0, r2)
            X.AF7 r5 = r5.A07
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.String r9 = "payment_description"
            r8 = r7
            r5.BOp(r6, r7, r8, r9, r10)
            r4.A1m()
            return
        L_0x00f3:
            java.lang.String r1 = ""
            goto L_0x00c3
        L_0x00f6:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity.A11(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r1.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000f
            com.google.android.material.textfield.TextInputLayout r0 = r1.A02
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000f
            X.8gR r0 = r1.A08
            r0.A02()
            return
        L_0x011b:
            java.lang.Object r2 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r2
            android.content.Context r1 = r2.A0a()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity.class
            android.content.Intent r0 = X.C36441kJ.A0H(r1, r0)
            r2.A1C(r0)
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r1 = r2.A0T
            X.6O3 r7 = r2.A0h
            X.B3f r6 = r1.A09
            boolean r0 = r6 instanceof X.AF7
            if (r0 == 0) goto L_0x000f
            X.AF7 r6 = (X.AF7) r6
            java.lang.Integer r5 = X.C36361kB.A0i()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3 = 0
            boolean r2 = r1.A0d()
            X.0wo r1 = r1.A05
            r0 = 0
            X.6Ps r1 = X.C203049nB.A01(r1, r3, r7, r3, r0)
            java.lang.String r0 = "payment_home"
            X.8cT r0 = r6.A04(r5, r4, r0, r3)
            X.C176658cT.A03(r0, r1, r6, r2)
            return
        L_0x0158:
            java.lang.Object r0 = r12.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x000c
        L_0x015e:
            java.lang.Object r0 = r12.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r0 = r0.A0h()
            if (r0 == 0) goto L_0x000f
            goto L_0x000c
        L_0x016a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A48()
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.A12(r0)
            return
        L_0x0175:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            X.AF7 r2 = r3.A0S
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.Integer r0 = X.C36371kC.A0p()
            X.C173858Tk.A0u(r2, r3, r1, r0)
            goto L_0x03ba
        L_0x0188:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            r3.A47()
            boolean r0 = r3.A0s
            if (r0 == 0) goto L_0x03ba
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.A13(r3)
            return
        L_0x0197:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A48()
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.A13(r0)
            return
        L_0x01a2:
            java.lang.Object r2 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
            X.8az r0 = r2.A00
            X.8bF r0 = r0.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x01b8
            boolean r0 = X.C175818b6.A00(r0)
            if (r0 != 0) goto L_0x01b8
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0316
        L_0x01b8:
            java.lang.String r1 = "upi_p2p_check_balance"
            r0 = 0
            X.6Be r6 = new X.6Be
            r6.<init>(r1, r0, r0)
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            X.8az r0 = r2.A00
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            r8.put(r0, r1)
            X.17Y r3 = r2.A00
            r1 = 0
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.A05(r1, r0)
            X.627 r3 = r2.A0F
            r0 = 4
            X.BAa r4 = new X.BAa
            r4.<init>(r2, r0)
            X.9oK r5 = new X.9oK
            r5.<init>(r2, r1)
            java.lang.String r7 = "payment_bank_account_details"
            r3.A00(r4, r5, r6, r7, r8)
            return
        L_0x01e9:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r0
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.A10(r0)
            return
        L_0x01f1:
            java.lang.Object r0 = r12.A00
            X.8jA r0 = (X.C179098jA) r0
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r0.A09
            r0.A1m()
            return
        L_0x01fb:
            java.lang.Object r2 = r12.A00
            X.8jA r2 = (X.C179098jA) r2
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = r2.A09
            java.lang.String r0 = "ConfirmPaymentFragment"
            r2.A4Q(r1, r0)
            r0 = 34
            goto L_0x0316
        L_0x020a:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiContactPickerFragment r1 = (com.whatsapp.payments.ui.IndiaUpiContactPickerFragment) r1
            X.01I r3 = r1.A0i()
            X.01I r4 = r1.A0i()
            X.14r r4 = (X.C225014r) r4
            X.3EU r6 = r1.A02
            X.A8P r5 = r1.A01
            java.lang.String r7 = "payment_contact_picker"
            r8 = 0
            X.9Se r2 = new X.9Se
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 0
            r2.A00(r0)
            X.AF7 r4 = r1.A04
            java.lang.Integer r3 = X.C36361kB.A0i()
            r0 = 132(0x84, float:1.85E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.os.Bundle r1 = r1.A1Z()
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r1.getString(r0)
            r4.BOm(r3, r2, r7, r0)
            return
        L_0x0242:
            java.lang.Object r2 = r12.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            android.content.Context r1 = r2.A1D()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity> r0 = com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity.class
            android.content.Intent r0 = X.C36441kJ.A0H(r1, r0)
            r2.A1C(r0)
            return
        L_0x0254:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity) r0
            com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.A11(r0)
            return
        L_0x025c:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.B2b r0 = r1.A07
            if (r0 == 0) goto L_0x0267
            r0.BUe()
        L_0x0267:
            X.AF7 r4 = r1.A06
            java.lang.Integer r3 = X.C36361kB.A0i()
            r0 = 5
            goto L_0x029a
        L_0x026f:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.B2b r0 = r1.A07
            if (r0 == 0) goto L_0x027a
            r0.BYL()
        L_0x027a:
            X.AF7 r3 = r1.A06
            java.lang.Integer r2 = X.C36361kB.A0i()
            r1 = 0
            java.lang.String r0 = "forgot_pin_prompt"
            r3.BOm(r2, r2, r0, r1)
            return
        L_0x0287:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.B2b r0 = r1.A07
            if (r0 == 0) goto L_0x0292
            r0.BYK()
        L_0x0292:
            X.AF7 r4 = r1.A06
            java.lang.Integer r3 = X.C36361kB.A0i()
            r0 = 34
        L_0x029a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "forgot_pin_prompt"
            goto L_0x0540
        L_0x02a3:
            java.lang.Object r0 = r12.A00
            X.9Kc r0 = (X.C193169Kc) r0
            X.8j0 r0 = r0.A00
            r0.A4M()
            return
        L_0x02ad:
            java.lang.Object r3 = r12.A00
            X.8he r3 = (X.C178818he) r3
            r0 = 0
            r3.A4C(r0)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.whatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r0)
            java.lang.String r0 = "incentive_value_prop"
            X.C165597tg.A0z(r2, r0)
            java.lang.String r1 = "for_payments"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            goto L_0x03ba
        L_0x02cb:
            java.lang.Object r2 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity r2 = (com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity) r2
            X.3EU r5 = r2.A01
            X.A8P r4 = r2.A00
            java.lang.String r6 = "chat"
            r7 = 0
            X.9Se r1 = new X.9Se
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 0
            r1.A00(r0)
            return
        L_0x02e1:
            java.lang.Object r2 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r2
            X.9tr r0 = r2.A0B
            if (r0 == 0) goto L_0x0314
            X.6Ps r4 = X.C165567td.A0F()
            X.9tr r0 = r2.A0B
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "alias_status"
            r4.A03(r0, r1)
            X.9tr r0 = r2.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "alias_type"
            r4.A03(r0, r1)
            X.AF7 r3 = r2.A0S
            java.lang.Integer r5 = X.C36361kB.A0i()
            r0 = 130(0x82, float:1.82E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = X.C165587tf.A0g(r2)
            java.lang.String r7 = "alias_info"
            r3.BOp(r4, r5, r6, r7, r8)
        L_0x0314:
            r0 = 38
        L_0x0316:
            X.AnonymousClass3SJ.A01(r2, r0)
            return
        L_0x031a:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r1 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r1
            X.9tr r0 = r1.A0B
            java.lang.String r2 = r0.A02
            java.lang.String r8 = "active"
            boolean r0 = r2.equals(r8)
            java.lang.String r9 = "inactive"
            if (r0 != 0) goto L_0x0353
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L_0x0338
            java.lang.String r0 = "Unexpected status"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0338:
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.A0z(r1, r8)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r2 = r1.A0F
            X.8gC r6 = r1.A0D
            X.9tr r5 = r1.A0B
            X.AE0 r0 = r1.A0M
            X.6c7 r3 = r0.A08()
            X.AE0 r0 = r1.A0M
            java.lang.String r7 = r0.A0E()
            X.6c7 r4 = r1.A0A
            r2.A0S(r3, r4, r5, r6, r7, r8)
            return
        L_0x0353:
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.A0z(r1, r9)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r3 = r1.A0F
            X.8gC r7 = r1.A0D
            X.9tr r6 = r1.A0B
            X.AE0 r0 = r1.A0M
            X.6c7 r4 = r0.A08()
            X.AE0 r0 = r1.A0M
            java.lang.String r8 = r0.A0E()
            X.6c7 r5 = r1.A0A
            r3.A0S(r4, r5, r6, r7, r8, r9)
            return
        L_0x036e:
            java.lang.Object r3 = r12.A00
            X.8jE r3 = (X.C179128jE) r3
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "extra_selected_bank"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x038f
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r0)
            r3.A42(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = "error"
            X.C165587tf.A0u(r2, r3, r1, r0)
            return
        L_0x038f:
            java.lang.String r0 = "User Selected bank object not found in intent bundle extras"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x03ba
        L_0x0395:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r0
            r0.onBackPressed()
            return
        L_0x039d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r1 = (com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r1
            r0 = 5
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.A10(r1, r0)
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity.A0z(r1)
            return
        L_0x03a9:
            java.lang.Object r3 = r12.A00
            X.8jE r3 = (X.C179128jE) r3
            r0 = 0
            r3.A0a = r0
            android.content.Intent r0 = X.AnonymousClass190.A08(r3)
            r3.A42(r0)
            r3.startActivity(r0)
        L_0x03ba:
            r3.finish()
            return
        L_0x03be:
            java.lang.Object r0 = r12.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            goto L_0x046a
        L_0x03c4:
            java.lang.Object r0 = r12.A00
            X.AGR r0 = (X.AGR) r0
            X.8hw r1 = r0.A06
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity> r0 = com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity.class
            android.content.Intent r0 = X.C36441kJ.A0H(r1, r0)
            r1.startActivity(r0)
            return
        L_0x03d4:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r1
            r1.A1b()
            X.4OT r0 = r1.A01
            if (r0 == 0) goto L_0x0409
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.8lb r3 = r0.A07
            boolean r0 = r3.A0z()
            if (r0 == 0) goto L_0x0409
            X.9Ml r0 = r3.A06
            X.9lY r4 = r0.A01
            X.8av r5 = r4.A0A
            X.1EU r0 = r3.A0Y
            X.AF8 r0 = X.C165587tf.A0W(r0)
            X.B3f r6 = r0.BBn()
            r0 = 1
            r3.A0p(r0)
            X.0wU r0 = r3.A0h
            r7 = 8
            X.73N r2 = new X.73N
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Boy(r2)
        L_0x0409:
            X.AF7 r4 = r1.A00
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0p()
            r1 = 0
            java.lang.String r0 = "raise_complaint_prompt"
            goto L_0x0540
        L_0x0418:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r0
            r0.A1b()
            X.AF7 r4 = r0.A00
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0n()
            java.lang.String r1 = "raise_complaint_prompt"
            goto L_0x0568
        L_0x042d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r1
            android.content.Context r3 = r1.A0a()
            java.util.List r0 = r1.A0v
            int r6 = r0.size()
            X.9FO r5 = new X.9FO
            r5.<init>(r1)
            r4 = 2131892277(0x7f121835, float:1.9419298E38)
            r0 = 2131892276(0x7f121834, float:1.9419296E38)
            r2 = 0
            r1 = 1
            X.1qm r3 = X.AnonymousClass3LW.A00(r3)
            if (r6 <= 0) goto L_0x046e
            r0 = 2131892280(0x7f121838, float:1.9419304E38)
            r3.A0d(r0)
            r0 = 2131892279(0x7f121837, float:1.9419302E38)
            r3.A0c(r0)
            r3.A0r(r1)
            r0 = 2131892278(0x7f121836, float:1.94193E38)
            r3.A0h(r2, r0)
        L_0x0463:
            X.0FM r0 = r3.create()
            X.AnonymousClass00C.A08(r0)
        L_0x046a:
            r0.show()
            return
        L_0x046e:
            r3.A0d(r4)
            r3.A0c(r0)
            r3.A0r(r1)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r3.A0f(r2, r0)
            r2 = 2131892275(0x7f121833, float:1.9419294E38)
            r1 = 10
            X.B85 r0 = new X.B85
            r0.<init>(r5, r1)
            r3.A0h(r0, r2)
            goto L_0x0463
        L_0x048b:
            java.lang.Object r1 = r12.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 0
            r1.A1r(r0)
            return
        L_0x0494:
            java.lang.Object r4 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r4 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r4
            X.7yY r1 = r4.A0m
            if (r1 == 0) goto L_0x04aa
            r0 = 97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.B3f r2 = r1.A09
            java.lang.String r1 = "payment_home"
            r0 = 0
            X.C165577te.A1C(r2, r3, r1, r0)
        L_0x04aa:
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A05(r4)
            return
        L_0x04ae:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r3
            android.content.Context r1 = r3.A1D()
            java.lang.Class<com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity> r0 = com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r1, r0)
            java.lang.String r0 = "referral_screen"
            java.lang.String r7 = "payment_home"
            r2.putExtra(r0, r7)
            r1 = 2131892448(0x7f1218e0, float:1.9419645E38)
            java.lang.String r0 = "extra_multi_invite_picker_title"
            r2.putExtra(r0, r1)
            X.AF7 r4 = r3.A0M
            java.lang.Integer r5 = X.C36361kB.A0i()
            r0 = 144(0x90, float:2.02E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9 = 1
            r4.BOn(r5, r6, r7, r8, r9)
            r0 = 501(0x1f5, float:7.02E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x04e2:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.B1a r1 = r3.A0A
            if (r1 == 0) goto L_0x04f1
            java.lang.String r0 = r3.A0E
            if (r0 == 0) goto L_0x04f1
            r1.BkQ(r0)
        L_0x04f1:
            r2 = 1
            r1 = 44
            goto L_0x0511
        L_0x04f5:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.B1a r0 = r3.A0A
            if (r0 == 0) goto L_0x0500
            r0.BW0()
        L_0x0500:
            r2 = 1
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x0511
        L_0x0504:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.B1a r0 = r3.A0A
            if (r0 == 0) goto L_0x050f
            r0.BW0()
        L_0x050f:
            r2 = 1
            r1 = 3
        L_0x0511:
            r0 = 0
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment.A00(r3, r0, r2, r1)
            return
        L_0x0516:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r3
            r3.A1b()
            X.Awb r2 = r3.A02
            if (r2 == 0) goto L_0x0533
            android.content.Context r2 = (android.content.Context) r2
            int[] r1 = X.C36441kJ.A1O()
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "CONTINUE"
            android.content.Intent r0 = X.AnonymousClass190.A1N(r2, r0, r1)
            r2.startActivity(r0)
        L_0x0533:
            X.AF7 r4 = r3.A01
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0p()
            r1 = 0
            java.lang.String r0 = "two_factor_nudge_prompt"
        L_0x0540:
            r4.BOm(r3, r2, r0, r1)
            return
        L_0x0544:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A1b()
            X.AF7 r4 = r0.A01
            java.lang.Integer r3 = X.C36361kB.A0i()
            r0 = 3
            goto L_0x0562
        L_0x0553:
            java.lang.Object r0 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A1b()
            X.AF7 r4 = r0.A01
            java.lang.Integer r3 = X.C36361kB.A0i()
            r0 = 96
        L_0x0562:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "two_factor_nudge_prompt"
        L_0x0568:
            r0 = 0
            r4.BOm(r3, r2, r1, r0)
            return
        L_0x056d:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r3
            X.1Dv r2 = r3.A01
            java.lang.String r0 = "https://faq.whatsapp.com/payments/security-and-privacy/about-payments-data/"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.Bp7(r3, r1, r0)
            X.8cT r1 = r3.A08
            java.lang.Integer r0 = X.C36401kF.A0i()
            r1.A07 = r0
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A08 = r0
            X.C173858Tk.A0r(r1, r3)
            return
        L_0x058f:
            java.lang.Object r0 = r12.A00
            X.8he r0 = (X.C178818he) r0
            r0.A48()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207359uy.onClick(android.view.View):void");
    }
}
