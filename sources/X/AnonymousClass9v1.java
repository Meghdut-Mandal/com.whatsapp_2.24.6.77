package X;

import android.view.View;

/* renamed from: X.9v1  reason: invalid class name */
public class AnonymousClass9v1 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass9v1(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        r4 = new X.AnonymousClass751(r0, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d2, code lost:
        r5.Boy(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r3.startActivity(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A02
            r2 = r16
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x00a3;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00be;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ef;
                case 7: goto L_0x002c;
                case 8: goto L_0x010c;
                case 9: goto L_0x003a;
                case 10: goto L_0x012f;
                case 11: goto L_0x0144;
                case 12: goto L_0x014e;
                case 13: goto L_0x0158;
                case 14: goto L_0x016a;
                case 15: goto L_0x019b;
                case 16: goto L_0x01b9;
                case 17: goto L_0x01eb;
                case 18: goto L_0x021e;
                case 19: goto L_0x025a;
                case 20: goto L_0x0283;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r15.A00
            com.whatsapp.spamwarning.SpamWarningActivity r3 = (com.whatsapp.spamwarning.SpamWarningActivity) r3
            java.lang.String r1 = r15.A01
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0024
            android.net.Uri r1 = android.net.Uri.parse(r1)
        L_0x001b:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
        L_0x0020:
            r3.startActivity(r0)
        L_0x0023:
            return
        L_0x0024:
            X.0xT r1 = r3.A02
            r0 = 0
            android.net.Uri r1 = r1.A03(r0)
            goto L_0x001b
        L_0x002c:
            java.lang.Object r3 = r15.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = r15.A01
            r3.finish()
            android.content.Intent r0 = X.C36331k8.A04(r0)
            goto L_0x0020
        L_0x003a:
            java.lang.Object r4 = r15.A00
            X.2HO r4 = (X.AnonymousClass2HO) r4
            java.lang.String r2 = r15.A01
            X.0wQ r0 = r4.A05
            boolean r0 = r0.A0L()
            com.whatsapp.jid.UserJid r1 = r4.A08
            if (r0 != 0) goto L_0x0060
            X.C18740tg.A06(r1)
            com.whatsapp.jid.UserJid r0 = r4.A02
            X.C18740tg.A06(r0)
            com.whatsapp.conversation.ChangeNumberNotificationDialogFragment r1 = com.whatsapp.conversation.ChangeNumberNotificationDialogFragment.A03(r1, r0, r2)
            X.4V7 r0 = r4.A01
            X.155 r0 = r0.BoP()
            r0.Btm(r1)
            return
        L_0x0060:
            com.whatsapp.jid.UserJid r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            X.16D r1 = r4.A06
            com.whatsapp.jid.UserJid r0 = r4.A02
            X.141 r3 = r1.A0D(r0)
            X.190 r1 = new X.190
            r1.<init>()
            X.4V7 r2 = r4.A01
            X.155 r0 = r2.BoP()
            android.content.Intent r1 = r1.A1W(r0, r3)
            X.155 r0 = r2.BoP()
            r0.startActivity(r1)
            return
        L_0x0087:
            java.lang.Object r3 = r15.A00
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment r3 = (com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment) r3
            java.lang.String r2 = r15.A01
            X.0v0 r0 = r3.A08
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "account_switching_logged_out_phone_number"
            X.C36341k9.A0x(r1, r0, r2)
            X.01I r0 = r3.A0i()
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment.A03(r0, r3)
            X.AnonymousClass0XN.A00(r0)
            return
        L_0x00a3:
            java.lang.Object r2 = r15.A00
            X.14p r2 = (X.C224914p) r2
            java.lang.String r1 = r15.A01
            X.0wU r5 = r2.A04
            r0 = 15
            goto L_0x00b8
        L_0x00ae:
            java.lang.Object r2 = r15.A00
            X.14p r2 = (X.C224914p) r2
            java.lang.String r1 = r15.A01
            X.0wU r5 = r2.A04
            r0 = 14
        L_0x00b8:
            X.751 r4 = new X.751
            r4.<init>(r0, r1, r2)
            goto L_0x00d2
        L_0x00be:
            java.lang.Object r3 = r15.A00
            X.14p r3 = (X.C224914p) r3
            java.lang.String r2 = r15.A01
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r1 = new com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment
            r1.<init>()
            X.0wU r5 = r3.A04
            r0 = 13
            X.74l r4 = new X.74l
            r4.<init>(r3, r1, r2, r0)
        L_0x00d2:
            r5.Boy(r4)
            return
        L_0x00d6:
            java.lang.Object r1 = r15.A00
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r1 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r1
            java.lang.String r0 = r15.A01
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment.A03(r1, r0)
            return
        L_0x00e0:
            java.lang.Object r0 = r15.A00
            X.5EH r0 = (X.AnonymousClass5EH) r0
            java.lang.String r1 = r15.A01
            X.C36391kE.A1T(r1)
            X.02t r0 = r0.A01
            r0.invoke(r1)
            return
        L_0x00ef:
            java.lang.Object r5 = r15.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r5 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r5
            java.lang.String r4 = r15.A01
            int r3 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A01(r5, r4)
            r0 = 0
            r5.A02 = r0
            X.6pD r2 = r5.A0M
            X.6Eo r0 = r5.A0O
            java.lang.Integer r1 = r0.A03()
            r0 = 0
            r2.A09(r1, r0)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0F(r5, r4, r3)
            return
        L_0x010c:
            java.lang.Object r2 = r15.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            java.lang.String r1 = r15.A01
            android.view.View r0 = r2.A0d()
            android.content.Context r0 = r0.getContext()
            android.content.Intent r1 = X.AnonymousClass190.A12(r0, r1)
            r0 = 2131894318(0x7f12202e, float:1.9423437E38)
            java.lang.String r0 = r2.A0n(r0)
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r0)
            r0 = 106(0x6a, float:1.49E-43)
            r2.startActivityForResult(r1, r0)
            return
        L_0x012f:
            java.lang.String r1 = r15.A01
            java.lang.Object r0 = r15.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            android.net.Uri r3 = android.net.Uri.parse(r1)
            X.1Dv r2 = r0.A0P
            android.content.Context r1 = r0.getContext()
            r0 = 0
            r2.Bp7(r1, r3, r0)
            return
        L_0x0144:
            java.lang.Object r1 = r15.A00
            X.1q6 r1 = (X.C38791q6) r1
            java.lang.String r0 = r15.A01
            X.C38791q6.setUpCallLink$lambda$3$lambda$1(r1, r0, r2)
            return
        L_0x014e:
            java.lang.Object r1 = r15.A00
            X.1q6 r1 = (X.C38791q6) r1
            java.lang.String r0 = r15.A01
            X.C38791q6.setUpCallLink$lambda$3$lambda$2(r1, r0, r2)
            return
        L_0x0158:
            java.lang.Object r4 = r15.A00
            X.155 r4 = (X.AnonymousClass155) r4
            java.lang.String r3 = r15.A01
            X.1Dv r2 = r4.A01
            r1 = 0
            r0 = 6
            android.content.Intent r0 = X.AnonymousClass190.A1F(r4, r3, r1, r0)
            r2.A06(r4, r0)
            return
        L_0x016a:
            java.lang.Object r3 = r15.A00
            X.14u r3 = (X.C225314u) r3
            java.lang.String r2 = r15.A01
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L_0x0188
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "http://"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.net.Uri r1 = android.net.Uri.parse(r0)
        L_0x0188:
            android.content.Intent r0 = X.C36391kE.A0G(r1)
            r3.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0190 }
            goto L_0x019a
        L_0x0190:
            X.17Y r2 = r3.A05
            r1 = 2131886365(0x7f12011d, float:1.9407307E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x019a:
            return
        L_0x019b:
            java.lang.Object r1 = r15.A00
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r1 = (com.whatsapp.payments.ui.AddPaymentMethodBottomSheet) r1
            java.lang.String r5 = r15.A01
            X.Aza r0 = r1.A04
            if (r0 == 0) goto L_0x01a8
            r0.Bda(r1)
        L_0x01a8:
            X.B3f r0 = r1.A02
            java.lang.Integer r2 = X.C36361kB.A0i()
            java.lang.Integer r3 = X.C36371kC.A0p()
            r1 = 0
            java.lang.String r4 = "get_started"
            r0.BOp(r1, r2, r3, r4, r5)
            return
        L_0x01b9:
            java.lang.Object r3 = r15.A00
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r3 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r3
            java.lang.String r8 = r15.A01
            r0 = 2131892184(0x7f1217d8, float:1.941911E38)
            r3.Bu1(r0)
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A0G(r3, r8)
            X.9UG r4 = r3.A0E
            r0 = 2
            X.B8s r7 = new X.B8s
            r7.<init>(r3, r0)
            X.9oD r5 = new X.9oD
            r5.<init>(r3, r0)
            r0 = 3
            X.BAa r6 = new X.BAa
            r6.<init>(r3, r0)
            java.lang.String r9 = "payment_method_details"
            X.3ty r2 = r4.A01(r5, r6, r7, r8, r9)
            r1 = 6
            X.B9p r0 = new X.B9p
            r0.<init>(r3, r1)
            r2.A0A(r0)
            return
        L_0x01eb:
            java.lang.Object r2 = r15.A00
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r2
            java.lang.String r14 = r15.A01
            r0 = 2131892184(0x7f1217d8, float:1.941911E38)
            r2.Bu1(r0)
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A0G(r2, r14)
            X.0wo r5 = r2.A07
            X.17Y r3 = r2.A00
            X.0wQ r4 = r2.A02
            X.19A r7 = r2.A01
            X.1Vl r13 = r2.A0B
            X.1EU r11 = r2.A09
            X.1Vk r10 = r2.A04
            X.646 r12 = r2.A08
            X.16T r6 = r2.A00
            X.6VM r8 = r2.A05
            X.1Vu r9 = r2.A01
            X.9Ss r1 = new X.9Ss
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.AEQ r0 = new X.AEQ
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x021e:
            java.lang.Object r5 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r5 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r5
            java.lang.String r6 = r15.A01
            X.AF7 r3 = r5.A0M
            java.lang.Integer r2 = X.C36361kB.A0i()
            r0 = 129(0x81, float:1.81E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "payment_home"
            r0 = 0
            r3.BOm(r2, r1, r4, r0)
            X.01I r3 = r5.A0i()
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "accountHolderName"
            X.6c7 r2 = X.C165617ti.A0P(r2, r1, r6, r0)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r1 = X.C36441kJ.A0H(r3, r0)
            java.lang.String r0 = "extra_payment_name"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_referral_screen"
            r1.putExtra(r0, r4)
            r5.A1C(r1)
            return
        L_0x025a:
            java.lang.Object r0 = r15.A00
            com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment r0 = (com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment) r0
            java.lang.String r5 = r15.A01
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel r4 = r0.A00
            if (r4 != 0) goto L_0x0269
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0269:
            X.00T r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.040 r2 = X.C109325Xd.A00(r4)
            r1 = 0
            com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$submitAppeal$1 r0 = new com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$submitAppeal$1
            r0.<init>(r4, r3, r5, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x0283:
            java.lang.String r1 = r15.A01
            java.lang.Object r2 = r15.A00
            X.1kT r2 = (X.C36541kT) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.content.Intent r1 = X.C36331k8.A04(r1)
            android.app.Activity r0 = r2.A00
            r0.startActivity(r1)
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9v1.onClick(android.view.View):void");
    }
}
