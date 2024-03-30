package X;

import android.widget.CompoundButton;

/* renamed from: X.4XY  reason: invalid class name */
public class AnonymousClass4XY implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new AnonymousClass4XY(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        r1.A04(!r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0206, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0211, code lost:
        X.C36331k8.A0w(r1, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0214, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x025e, code lost:
        r1 = ((X.AnonymousClass01I) X.C24801Dv.A01(r2.A1D(), X.AnonymousClass01L.class)).getSupportFragmentManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026e, code lost:
        r3.A1f(r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0272, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0278, code lost:
        r3 = new X.C81173wa((java.lang.Object) r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027d, code lost:
        r4.Boy(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0280, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x029f, code lost:
        if (X.AnonymousClass00C.A0J(java.lang.Boolean.valueOf(r11), r1) == false) goto L_0x02a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            r7 = r11
            switch(r0) {
                case 0: goto L_0x0046;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0119;
                case 3: goto L_0x006b;
                case 4: goto L_0x0080;
                case 5: goto L_0x0159;
                case 6: goto L_0x0161;
                case 7: goto L_0x0094;
                case 8: goto L_0x00a8;
                case 9: goto L_0x016d;
                case 10: goto L_0x0006;
                case 11: goto L_0x0006;
                case 12: goto L_0x0006;
                case 13: goto L_0x0006;
                case 14: goto L_0x0006;
                case 15: goto L_0x0194;
                case 16: goto L_0x01a2;
                case 17: goto L_0x01cc;
                case 18: goto L_0x01fb;
                case 19: goto L_0x0207;
                case 20: goto L_0x0215;
                case 21: goto L_0x0222;
                case 22: goto L_0x022c;
                case 23: goto L_0x024c;
                case 24: goto L_0x0286;
                case 25: goto L_0x02c7;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r9.A00
            com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet r3 = (com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet) r3
            com.whatsapp.wds.components.button.WDSButton r2 = r3.A09
            if (r2 == 0) goto L_0x0045
            android.widget.CheckBox r0 = r3.A02
            r1 = 0
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0041
        L_0x0019:
            android.widget.CheckBox r0 = r3.A01
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0041
        L_0x0023:
            android.widget.CheckBox r0 = r3.A04
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0041
        L_0x002d:
            android.widget.CheckBox r0 = r3.A00
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0041
        L_0x0037:
            android.widget.CheckBox r0 = r3.A03
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r1 = 1
        L_0x0042:
            r2.setEnabled(r1)
        L_0x0045:
            return
        L_0x0046:
            java.lang.Object r6 = r9.A00
            com.whatsapp.bonsai.chatinfo.BonsaiChatInfoViewModel r6 = (com.whatsapp.bonsai.chatinfo.BonsaiChatInfoViewModel) r6
            X.2LZ r4 = r6.A00
            if (r4 == 0) goto L_0x0045
            X.00s r5 = r6.A02
            java.lang.Object r0 = r5.A04()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)
            if (r0 != 0) goto L_0x0045
            X.66D r1 = r6.A05
            com.whatsapp.jid.UserJid r0 = r6.A01
            if (r0 != 0) goto L_0x02e9
            java.lang.String r0 = "userJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x006b:
            java.lang.Object r2 = r9.A00
            com.whatsapp.contact.contactform.ContactFormActivity r2 = (com.whatsapp.contact.contactform.ContactFormActivity) r2
            if (r11 == 0) goto L_0x0045
            X.0yE r1 = r2.A0E
            X.16m r0 = r2.A06
            boolean r0 = X.AnonymousClass3T6.A04(r0, r1)
            if (r0 != 0) goto L_0x0045
            r0 = 0
            com.whatsapp.RequestPermissionActivity.A0G(r2, r0)
            return
        L_0x0080:
            java.lang.Object r2 = r9.A00
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r2 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r2
            if (r11 == 0) goto L_0x0045
            X.0yE r1 = r2.A0H
            X.16m r0 = r2.A07
            boolean r0 = X.AnonymousClass3T6.A04(r0, r1)
            if (r0 != 0) goto L_0x0045
            r2.requestPermission()
            return
        L_0x0094:
            java.lang.Object r0 = r9.A00
            X.1yM r0 = (X.C42151yM) r0
            X.36n r1 = r0.A00
            boolean r0 = r1.A00
            if (r0 == r11) goto L_0x0045
            r1.A00 = r11
            if (r11 == 0) goto L_0x0045
            X.00s r0 = r1.A01
            r0.A0C(r1)
            return
        L_0x00a8:
            java.lang.Object r4 = r9.A00
            com.whatsapp.events.EventCreateOrEditFragment r4 = (com.whatsapp.events.EventCreateOrEditFragment) r4
            r2 = 0
            java.lang.String r0 = "eventCreateOrEditViewModel"
            X.1us r1 = r4.A0H
            if (r11 == 0) goto L_0x00cf
            if (r1 != 0) goto L_0x00ba
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ba:
            X.05K r0 = r1.A0F
            java.lang.Object r0 = r0.getValue()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.2nU r0 = r0.A01
            r1.A0S(r0)
            X.1RJ r0 = r4.A0O
            if (r0 == 0) goto L_0x0045
            r0.A03(r2)
            return
        L_0x00cf:
            if (r1 != 0) goto L_0x00d6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00d6:
            X.05L r3 = r1.A0D
        L_0x00d8:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.2oU r0 = X.C51852oU.NONE
            boolean r0 = X.AnonymousClass3Q2.A00(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x00d8
            X.1RJ r1 = r4.A0O
            if (r1 == 0) goto L_0x0045
            r0 = 8
            r1.A03(r0)
            return
        L_0x00f1:
            java.lang.Object r2 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            if (r11 == 0) goto L_0x010c
            X.141 r0 = r2.A0z
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0k(r0)
            X.C18740tg.A06(r1)
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r3 = X.AnonymousClass3RD.A01(r1, r0)
            X.01z r1 = r2.getSupportFragmentManager()
            goto L_0x026e
        L_0x010c:
            X.2EI r1 = r2.A0h
            X.0wU r4 = r1.A0G
            r0 = 21
            X.3wp r3 = new X.3wp
            r3.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x027d
        L_0x0119:
            java.lang.Object r2 = r9.A00
            X.237 r2 = (X.AnonymousClass237) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.2Sc r1 = r2.A05
            if (r1 != 0) goto L_0x012c
            java.lang.String r0 = "wamGroupInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012c:
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A07 = r0
            if (r11 == 0) goto L_0x014c
            X.14u r3 = r2.A0B
            X.147 r2 = r2.A06
            r1 = 0
            if (r2 != 0) goto L_0x0142
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0142:
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r0 = X.AnonymousClass3RD.A01(r2, r0)
            r3.Btl(r0, r1)
            return
        L_0x014c:
            X.0wU r4 = r2.getWaWorkers$app_product_community_community_non_modified()
            r0 = 24
            X.3wS r3 = new X.3wS
            r3.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x027d
        L_0x0159:
            java.lang.Object r0 = r9.A00
            com.whatsapp.conversationslist.ArchiveNotificationSettingActivity r0 = (com.whatsapp.conversationslist.ArchiveNotificationSettingActivity) r0
            X.1DH r1 = r0.A00
            goto L_0x0201
        L_0x0161:
            java.lang.Object r0 = r9.A00
            X.14u r0 = (X.C225314u) r0
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r0)
            java.lang.String r0 = "auto_archive_inactive_chats"
            goto L_0x0211
        L_0x016d:
            java.lang.Object r2 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.2Sc r1 = r2.A1A
            if (r1 == 0) goto L_0x017b
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A07 = r0
        L_0x017b:
            if (r11 == 0) goto L_0x018a
            X.147 r1 = r2.A1Y
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r1 = X.AnonymousClass3RD.A01(r1, r0)
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x018a:
            X.0wU r4 = r2.A04
            r0 = 49
            X.3v5 r3 = X.C80243v5.A00(r9, r0)
            goto L_0x027d
        L_0x0194:
            java.lang.Object r0 = r9.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            if (r11 == 0) goto L_0x019e
            com.whatsapp.newsletter.NewsletterInfoActivity.A0y(r0)
            return
        L_0x019e:
            com.whatsapp.newsletter.NewsletterInfoActivity.A12(r0)
            return
        L_0x01a2:
            java.lang.Object r0 = r9.A00
            com.whatsapp.payments.ui.BrazilPaymentDPOActivity r0 = (com.whatsapp.payments.ui.BrazilPaymentDPOActivity) r0
            X.2a0 r2 = r0.A00
            java.lang.String r1 = X.C36371kC.A0u(r10)
            X.6Ps r3 = X.C203049nB.A00()
            java.lang.String r0 = "checkbox_text"
            r3.A03(r0, r1)
            X.B3f r2 = r2.A07
            java.lang.Integer r4 = X.C36361kB.A0i()
            r0 = 123(0x7b, float:1.72E-43)
            if (r11 == 0) goto L_0x01c1
            r0 = 122(0x7a, float:1.71E-43)
        L_0x01c1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "restore_payment"
            r7 = 0
            r2.BOp(r3, r4, r5, r6, r7)
            return
        L_0x01cc:
            java.lang.Object r2 = r9.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r2 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r2
            if (r11 == 0) goto L_0x01e4
            X.16m r0 = r2.A09
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x01f4
            r1 = 2131892821(0x7f121a55, float:1.9420401E38)
            r0 = 2131892820(0x7f121a54, float:1.94204E38)
            com.whatsapp.RequestPermissionActivity.A01(r2, r1, r0)
            return
        L_0x01e4:
            r0 = 0
            r2.A01 = r0
            android.view.View r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r2.A0C
            r0.clear()
            goto L_0x01f7
        L_0x01f4:
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.A01(r2)
        L_0x01f7:
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.A07(r2)
            return
        L_0x01fb:
            java.lang.Object r0 = r9.A00
            com.whatsapp.settings.SettingsChat r0 = (com.whatsapp.settings.SettingsChat) r0
            X.1DH r1 = r0.A04
        L_0x0201:
            r0 = r11 ^ 1
            r1.A04(r0)
            return
        L_0x0207:
            java.lang.Object r0 = r9.A00
            X.14u r0 = (X.C225314u) r0
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r0)
            java.lang.String r0 = "security_notifications"
        L_0x0211:
            X.C36331k8.A0w(r1, r0, r11)
            return
        L_0x0215:
            java.lang.Object r1 = r9.A00
            X.14p r1 = (X.C224914p) r1
            X.0wU r4 = r1.A04
            r0 = 3
            X.3vD r3 = new X.3vD
            r3.<init>(r0, r1, r11)
            goto L_0x027d
        L_0x0222:
            java.lang.Object r0 = r9.A00
            X.2eC r0 = (X.C47262eC) r0
            r0.A00 = r11
            r0.A09()
            return
        L_0x022c:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r2 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r2
            if (r11 == 0) goto L_0x0241
            X.11F r1 = r2.A04
            X.C18740tg.A06(r1)
            X.AnonymousClass00C.A08(r1)
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r3 = X.AnonymousClass3RD.A01(r1, r0)
            goto L_0x025e
        L_0x0241:
            X.0wU r4 = r2.A09
            if (r4 == 0) goto L_0x0247
            r0 = 1
            goto L_0x0278
        L_0x0247:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x024c:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r2 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r2
            if (r11 == 0) goto L_0x0273
            X.11F r0 = r2.A04
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            com.whatsapp.mute.ui.MuteDialogFragment r3 = X.AnonymousClass3RD.A00(r0)
        L_0x025e:
            android.content.Context r1 = r2.A1D()
            java.lang.Class<X.01L> r0 = X.AnonymousClass01L.class
            android.app.Activity r0 = X.C24801Dv.A01(r1, r0)
            X.01I r0 = (X.AnonymousClass01I) r0
            X.01z r1 = r0.getSupportFragmentManager()
        L_0x026e:
            r0 = 0
            r3.A1f(r1, r0)
            return
        L_0x0273:
            X.0wU r4 = r2.A09
            if (r4 == 0) goto L_0x0281
            r0 = 2
        L_0x0278:
            X.3wa r3 = new X.3wa
            r3.<init>((java.lang.Object) r2, (int) r0)
        L_0x027d:
            r4.Boy(r3)
            return
        L_0x0281:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x0286:
            java.lang.Object r2 = r9.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            X.1UM r1 = r2.A0C
            if (r1 == 0) goto L_0x02c0
            X.1US r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0J
            java.lang.Boolean r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x02a1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            boolean r1 = X.AnonymousClass00C.A0J(r0, r1)
            r0 = 0
            if (r1 != 0) goto L_0x02a2
        L_0x02a1:
            r0 = 1
        L_0x02a2:
            r2.A0F = r0
            r2.A0G = r0
            X.3XT r1 = r2.A03
            java.lang.String r0 = "statusDistributionInfo"
            if (r1 != 0) goto L_0x02b1
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02b1:
            int r6 = r1.A00
            java.util.List r4 = r1.A01
            java.util.List r5 = r1.A02
            r8 = 0
            X.3XT r3 = new X.3XT
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A03 = r3
            return
        L_0x02c0:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c7:
            java.lang.Object r2 = r9.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r2 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r2
            X.005 r0 = r2.A05
            if (r0 == 0) goto L_0x02e2
            X.1UM r1 = X.C36431kI.A10(r0)
            X.1US r0 = com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity.A07
            r1.A05(r0, r11)
            X.1UZ r1 = r2.A3i()
            java.lang.String r0 = "TAP_AUTO_CROSSPOST_TOGGLE"
            r1.A04(r0)
            return
        L_0x02e2:
            java.lang.String r0 = "fbAccountManagerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e9:
            java.lang.String r0 = r1.A00(r0)
            X.0yW r2 = r1.A00
            X.2O8 r1 = new X.2O8
            r1.<init>()
            r1.A01 = r0
            int r0 = X.C36391kE.A00(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r2.Bly(r1)
            r5.A0D(r3)
            r4.A00 = r11
            X.1KD r3 = r6.A04
            X.0wU r2 = r3.A05
            r0 = 6
            X.1j2 r1 = new X.1j2
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "BonsaiChatManagerImpl"
            r2.Bp6(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XY.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
