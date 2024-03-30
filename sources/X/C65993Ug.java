package X;

/* renamed from: X.3Ug  reason: invalid class name and case insensitive filesystem */
public class C65993Ug implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C65993Ug(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C65993Ug(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ab, code lost:
        r11.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0132, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0135, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 4: goto L_0x0089;
                case 5: goto L_0x000b;
                case 6: goto L_0x003e;
                case 7: goto L_0x003e;
                case 8: goto L_0x003e;
                case 10: goto L_0x003e;
                case 11: goto L_0x004c;
                case 19: goto L_0x0091;
                case 20: goto L_0x009c;
                case 21: goto L_0x00a7;
                case 22: goto L_0x00e4;
                case 23: goto L_0x006b;
                case 24: goto L_0x0136;
                case 25: goto L_0x021a;
                case 26: goto L_0x0265;
                case 27: goto L_0x0275;
                case 28: goto L_0x0378;
                case 29: goto L_0x007b;
                case 33: goto L_0x0388;
                case 49: goto L_0x03b9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.C36331k8.A1J(r0, r11)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r5 = r10.A00
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r5 = (com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog) r5
            boolean r0 = r5.A12()
            if (r0 == 0) goto L_0x000a
            X.00T r4 = r5.A01
            java.lang.Object r1 = r4.getValue()
            X.2oW r0 = X.C51872oW.NOT_SUPPORTED
            if (r1 == r0) goto L_0x003a
            X.4RH r3 = r5.A00
            if (r3 == 0) goto L_0x003a
            X.00T r0 = r5.A04
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r4.getValue()
            X.2oW r1 = (X.C51872oW) r1
            X.00T r0 = r5.A02
            java.lang.String r0 = X.C36431kI.A1E(r0)
            r3.Bji(r1, r0, r2)
        L_0x003a:
            r5.A1b()
            return
        L_0x003e:
            java.lang.Object r1 = r10.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x000a
            r1.A1b()
            return
        L_0x004c:
            java.lang.Object r2 = r10.A00
            com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment r2 = (com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment) r2
            boolean r0 = r2.A12()
            if (r0 == 0) goto L_0x000a
            X.00T r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0067
            X.4RK r0 = r2.A00
            if (r0 == 0) goto L_0x0067
            r0.Bfa(r1)
        L_0x0067:
            r2.A1b()
            return
        L_0x006b:
            java.lang.Object r1 = r10.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x000a
            android.content.Intent r0 = X.C36331k8.A04(r11)
            r1.startActivity(r0)
            return
        L_0x007b:
            java.lang.Object r1 = r10.A00
            com.whatsapp.phonematching.CountryPicker r1 = (com.whatsapp.phonematching.CountryPicker) r1
            boolean r0 = com.whatsapp.phonematching.CountryPicker.A0v(r1)
            if (r0 == 0) goto L_0x000a
            com.whatsapp.phonematching.CountryPicker.A0u(r1)
            return
        L_0x0089:
            java.lang.Object r1 = r10.A00
            X.351 r1 = (X.AnonymousClass351) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x0091:
            java.lang.Object r0 = r10.A00
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity r0 = (com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity) r0
            android.content.DialogInterface r11 = (android.content.DialogInterface) r11
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity.A01(r0)
            goto L_0x03ab
        L_0x009c:
            java.lang.Object r0 = r10.A00
            com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity r0 = (com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity) r0
            android.content.DialogInterface r11 = (android.content.DialogInterface) r11
            com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity.A07(r0)
            goto L_0x03ab
        L_0x00a7:
            java.lang.Object r2 = r10.A00
            X.24a r2 = (X.AnonymousClass24a) r2
            android.content.DialogInterface r11 = (android.content.DialogInterface) r11
            X.1tt r1 = r2.A05
            X.B3f r3 = r1.A07
            java.lang.Integer r5 = X.C36361kB.A0i()
            r0 = 115(0x73, float:1.61E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = r1.A0S()
            X.6Ps r4 = X.C203049nB.A00()
            r8 = 0
            r3.BOp(r4, r5, r6, r7, r8)
            r11.dismiss()
            X.1tt r0 = r2.A05
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x00e0
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity.class
            android.content.Intent r1 = X.C36441kJ.A0H(r2, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r0 = r1.addFlags(r0)
            r2.startActivity(r0)
            return
        L_0x00e0:
            r2.finish()
            return
        L_0x00e4:
            java.lang.Object r3 = r10.A00
            X.24a r3 = (X.AnonymousClass24a) r3
            X.35B r11 = (X.AnonymousClass35B) r11
            int r1 = r11.A01
            r0 = 1
            if (r1 == r0) goto L_0x01f1
            r0 = 2
            if (r1 == r0) goto L_0x01e5
            r0 = 3
            if (r1 == r0) goto L_0x0204
            r0 = 4
            if (r1 == r0) goto L_0x0185
            X.38d r6 = r11.A00
            android.view.View r1 = r3.A00
            if (r6 == 0) goto L_0x0140
            r0 = 2131431719(0x7f0b1127, float:1.8485175E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r1, r0)
            android.view.View r1 = r3.A00
            r0 = 2131434830(0x7f0b1d4e, float:1.8491485E38)
            android.widget.TextView r4 = X.C36391kE.A0O(r1, r0)
            android.view.View r1 = r3.A00
            r0 = 2131434869(0x7f0b1d75, float:1.8491564E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r1, r0)
            java.lang.String r0 = r6.A02
            r5.setText(r0)
            java.lang.String r0 = r6.A03
            r4.setText(r0)
            int r0 = r6.A00
            r2.setText(r0)
            android.content.res.Resources r1 = r3.getResources()
            int r0 = r6.A01
            X.C36351kA.A15(r1, r2, r0)
            android.view.View r1 = r3.A00
            r0 = 0
        L_0x0132:
            r1.setVisibility(r0)
            return
        L_0x0136:
            java.lang.Object r5 = r10.A00
            X.24a r5 = (X.AnonymousClass24a) r5
            X.35C r11 = (X.AnonymousClass35C) r11
            if (r11 != 0) goto L_0x0143
            android.widget.TextView r1 = r5.A03
        L_0x0140:
            r0 = 8
            goto L_0x0132
        L_0x0143:
            java.lang.String r6 = r11.A00
            java.lang.String r3 = r11.A01
            boolean r0 = X.C203419nz.A07(r3)
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x017d
            r1 = 2131888343(0x7f1208d7, float:1.9411319E38)
            java.lang.Object[] r0 = X.C36411kG.A1b(r6)
            r0[r2] = r3
        L_0x0158:
            java.lang.String r3 = r5.getString(r1, r0)
            android.text.SpannableString r2 = X.C36441kJ.A0O(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r6, r1)
            X.C36401kF.A15(r2, r0, r3, r6)
            android.widget.TextView r0 = r5.A03
            r0.setText(r2)
            android.widget.TextView r0 = r5.A03
            X.C36391kE.A1J(r0)
            android.widget.TextView r0 = r5.A03
            r0.setVisibility(r4)
            return
        L_0x017d:
            r1 = 2131888344(0x7f1208d8, float:1.941132E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r6
            goto L_0x0158
        L_0x0185:
            X.1qm r4 = X.AnonymousClass3LW.A00(r3)
            boolean r1 = r3 instanceof com.whatsapp.payments.ui.BrazilPaymentDPOActivity
            if (r1 == 0) goto L_0x0193
            r0 = 2131893715(0x7f121dd3, float:1.9422214E38)
            r4.A0d(r0)
        L_0x0193:
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity
            if (r0 == 0) goto L_0x01cf
            r2 = 2131893604(0x7f121d64, float:1.942199E38)
        L_0x019a:
            r4.A0c(r2)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 21
            X.C39001qm.A05(r3, r4, r0, r1)
            r4.A0b()
            android.content.res.Resources r0 = r3.getResources()
            java.lang.CharSequence r0 = r0.getText(r2)
            java.lang.String r2 = r0.toString()
            X.1tt r1 = r3.A05
            X.6Ps r3 = X.C203049nB.A00()
            java.lang.String r0 = "dialog_text"
            r3.A03(r0, r2)
            X.B3f r2 = r1.A07
            java.lang.Integer r4 = X.C36381kD.A0m()
            java.lang.String r6 = r1.A0S()
            r5 = 0
            r7 = r5
            r2.BOp(r3, r4, r5, r6, r7)
            return
        L_0x01cf:
            if (r1 == 0) goto L_0x01d5
            r2 = 2131893713(0x7f121dd1, float:1.942221E38)
            goto L_0x019a
        L_0x01d5:
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity
            if (r0 != 0) goto L_0x01e1
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity
            if (r0 != 0) goto L_0x01e1
            r2 = 2131888282(0x7f12089a, float:1.9411195E38)
            goto L_0x019a
        L_0x01e1:
            r2 = 2131888346(0x7f1208da, float:1.9411325E38)
            goto L_0x019a
        L_0x01e5:
            android.widget.EditText r1 = r3.A02
            r0 = 2131231411(0x7f0802b3, float:1.8078902E38)
            X.C36371kC.A13(r3, r1, r0)
            android.widget.TextView r1 = r3.A04
            r0 = 0
            goto L_0x0210
        L_0x01f1:
            android.widget.EditText r1 = r3.A02
            r0 = 2131231413(0x7f0802b5, float:1.8078906E38)
            X.C36371kC.A13(r3, r1, r0)
            android.widget.TextView r1 = r3.A04
            r0 = 8
            r1.setVisibility(r0)
            android.widget.Button r1 = r3.A01
            r0 = 0
            goto L_0x0216
        L_0x0204:
            android.widget.EditText r1 = r3.A02
            r0 = 2131231413(0x7f0802b5, float:1.8078906E38)
            X.C36371kC.A13(r3, r1, r0)
            android.widget.TextView r1 = r3.A04
            r0 = 8
        L_0x0210:
            r1.setVisibility(r0)
            android.widget.Button r1 = r3.A01
            r0 = 1
        L_0x0216:
            r1.setEnabled(r0)
            return
        L_0x021a:
            java.lang.Object r4 = r10.A00
            X.8ha r4 = (X.C178798ha) r4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = r4.A0O
            java.lang.String r5 = "personal"
            boolean r1 = r5.equals(r0)
            r0 = 2131888956(0x7f120b3c, float:1.9412562E38)
            if (r1 == 0) goto L_0x0230
            r0 = 2131888965(0x7f120b45, float:1.941258E38)
        L_0x0230:
            java.lang.String r3 = r4.getString(r0)
            android.content.Intent r2 = X.C36431kI.A0B()
            java.lang.String r0 = "application/zip"
            r2.setType(r0)
            java.lang.String r0 = r4.A0O
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0262
            java.lang.String r0 = "personal_dyi_report"
        L_0x0247:
            android.net.Uri r1 = com.whatsapp.contentprovider.MediaProvider.A04(r0, r11)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r2.putExtra(r0, r3)
            r0 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r0)
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r3)
            r4.startActivity(r0)
            return
        L_0x0262:
            java.lang.String r0 = "business_dyi_report"
            goto L_0x0247
        L_0x0265:
            java.lang.Object r1 = r10.A00
            com.whatsapp.payments.ui.PaymentContactPickerFragment r1 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r1
            X.5tn r11 = (X.C121835tn) r11
            java.lang.Object r0 = r11.A01
            X.6O3 r0 = (X.AnonymousClass6O3) r0
            r1.A04 = r0
            com.whatsapp.payments.ui.PaymentContactPickerFragment.A00(r1)
            return
        L_0x0275:
            java.lang.Object r2 = r10.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r2 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r2
            X.97J r11 = (X.AnonymousClass97J) r11
            r5 = 0
            boolean r0 = r11 instanceof X.C179288js
            java.lang.String r1 = "extra_referral_screen"
            r9 = 0
            if (r0 == 0) goto L_0x02e6
            X.1qm r6 = X.AnonymousClass3LW.A00(r2)
            r6.A0r(r5)
            X.8js r11 = (X.C179288js) r11
            java.lang.String r0 = r11.A02
            r4 = r0
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x0294
            r0 = r3
        L_0x0294:
            r6.A0q(r0)
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x029c
            r3 = r0
        L_0x029c:
            r6.A0p(r3)
            r3 = 2131896407(0x7f122857, float:1.9427674E38)
            r0 = 49
            X.C39001qm.A0G(r6, r2, r0, r3)
            X.C36341k9.A11(r6)
            X.6Ps[] r0 = new X.C131606Ps[r5]
            X.6Ps r5 = new X.6Ps
            r5.<init>(r0)
            int r0 = r11.A00
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "payments_error_code"
            r5.A03(r0, r3)
            java.lang.String r0 = "payments_error_text"
            r5.A03(r0, r4)
            X.AF7 r4 = r2.A3i()
            java.lang.Integer r6 = X.C36371kC.A0o()
            r0 = 51
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x02e3
            java.lang.String r8 = "alias_switch_in_progress"
        L_0x02d5:
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L_0x02df
            java.lang.String r9 = r0.getStringExtra(r1)
        L_0x02df:
            r4.BOp(r5, r6, r7, r8, r9)
            return
        L_0x02e3:
            java.lang.String r8 = "alias_in_progress"
            goto L_0x02d5
        L_0x02e6:
            boolean r0 = r11 instanceof X.C179298jt
            if (r0 == 0) goto L_0x032a
            X.1qm r4 = X.AnonymousClass3LW.A00(r2)
            r4.A0r(r5)
            r0 = 2131890902(0x7f1212d6, float:1.9416509E38)
            r4.A0d(r0)
            r0 = 2131890901(0x7f1212d5, float:1.9416507E38)
            r4.A0c(r0)
            r3 = 2131892832(0x7f121a60, float:1.9420423E38)
            r0 = 47
            X.C39001qm.A0B(r4, r2, r0, r3)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 48
            X.C39001qm.A0G(r4, r2, r0, r3)
            X.C36341k9.A11(r4)
            X.AF7 r4 = r2.A3i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L_0x0328
            java.lang.String r1 = r0.getStringExtra(r1)
        L_0x0322:
            java.lang.String r0 = "alias_switch_confirm_dialog"
            r4.BOm(r3, r9, r0, r1)
            return
        L_0x0328:
            r1 = r9
            goto L_0x0322
        L_0x032a:
            boolean r0 = r11 instanceof X.C179308ju
            r5 = 1
            r6 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x0357
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity.class
            android.content.Intent r4 = X.C36441kJ.A0H(r2, r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r3 = "extra_payment_name"
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)
            r4.putExtra(r3, r0)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0354
            java.lang.String r0 = "alias_switch_in_progress"
        L_0x034a:
            r4.putExtra(r1, r0)
            r4.addFlags(r6)
        L_0x0350:
            r2.A33(r4, r5)
            return
        L_0x0354:
            java.lang.String r0 = "alias_in_progress"
            goto L_0x034a
        L_0x0357:
            boolean r0 = r11 instanceof X.C179318jv
            if (r0 == 0) goto L_0x0371
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity.class
            android.content.Intent r4 = X.C36441kJ.A0H(r2, r0)
            r4.addFlags(r6)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x036e
            java.lang.String r0 = "alias_switch_in_progress"
        L_0x036a:
            r4.putExtra(r1, r0)
            goto L_0x0350
        L_0x036e:
            java.lang.String r0 = "alias_in_progress"
            goto L_0x036a
        L_0x0371:
            java.lang.String r0 = "Unexpected value for indiaUpiMapperLinkEvent"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0378:
            java.lang.Object r0 = r10.A00
            com.whatsapp.phonematching.CountryPicker r0 = (com.whatsapp.phonematching.CountryPicker) r0
            java.lang.String r11 = (java.lang.String) r11
            X.1nF r0 = r0.A04
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r11)
            return
        L_0x0388:
            java.lang.Object r0 = r10.A00
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r0 = (com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment) r0
            android.content.DialogInterface r11 = (android.content.DialogInterface) r11
            X.1uS r3 = r0.A01
            if (r3 != 0) goto L_0x0397
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0397:
            X.3T1 r5 = r3.A01
            if (r5 == 0) goto L_0x03af
            X.64b r4 = r3.A04
            X.2ps r3 = r3.A00
            X.0wU r2 = r4.A04
            r0 = 43
            X.736 r1 = new X.736
            r1.<init>(r5, r3, r4, r0)
        L_0x03a8:
            r2.Boy(r1)
        L_0x03ab:
            r11.dismiss()
            return
        L_0x03af:
            X.0wU r2 = r3.A07
            r0 = 20
            X.72o r1 = new X.72o
            r1.<init>(r3, r0)
            goto L_0x03a8
        L_0x03b9:
            java.lang.Object r3 = r10.A00
            com.whatsapp.profile.ProfileInfoActivity r3 = (com.whatsapp.profile.ProfileInfoActivity) r3
            X.3QF r11 = (X.AnonymousClass3QF) r11
            java.lang.String r0 = r11.A01
            boolean r2 = r0.isEmpty()
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0L
            if (r2 == 0) goto L_0x03d0
            r0 = 2131893262(0x7f121c0e, float:1.9421296E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x03d0:
            r1.setSubText(r0)
            X.0yC r1 = r3.A0D
            r0 = 4747(0x128b, float:6.652E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x03e9
            if (r2 == 0) goto L_0x0404
            X.0yC r1 = r3.A0D
            r0 = 4745(0x1289, float:6.649E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0404
        L_0x03e9:
            r0 = 1
        L_0x03ea:
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0L
            if (r0 == 0) goto L_0x03fc
            r0 = 30
            X.AnonymousClass3Y5.A00(r1, r3, r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0L
            r0 = 2131232711(0x7f0807c7, float:1.8081539E38)
        L_0x03f8:
            r1.setSecondaryIcon(r0)
            return
        L_0x03fc:
            r0 = 0
            r1.setOnClickListener(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0L
            r0 = 0
            goto L_0x03f8
        L_0x0404:
            r0 = 0
            goto L_0x03ea
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65993Ug.BTH(java.lang.Object):void");
    }
}
