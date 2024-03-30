package X;

import android.content.DialogInterface;

/* renamed from: X.4Xp  reason: invalid class name and case insensitive filesystem */
public class C89714Xp implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89714Xp(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e2, code lost:
        r3.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x030b, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x030e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        r5.Boy(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x011b;
                case 1: goto L_0x007f;
                case 2: goto L_0x0136;
                case 3: goto L_0x014e;
                case 4: goto L_0x018d;
                case 5: goto L_0x019d;
                case 6: goto L_0x008f;
                case 7: goto L_0x01b8;
                case 8: goto L_0x01d0;
                case 9: goto L_0x01e1;
                case 10: goto L_0x020f;
                case 11: goto L_0x006f;
                case 12: goto L_0x0238;
                case 13: goto L_0x0263;
                case 14: goto L_0x00a1;
                case 15: goto L_0x0296;
                case 16: goto L_0x02be;
                case 17: goto L_0x02cc;
                case 18: goto L_0x02e6;
                case 19: goto L_0x02ff;
                case 20: goto L_0x00b3;
                case 21: goto L_0x030f;
                case 22: goto L_0x00c6;
                case 23: goto L_0x00d9;
                case 24: goto L_0x0354;
                case 25: goto L_0x0360;
                case 26: goto L_0x036c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r8.A00
            com.whatsapp.voipcalling.ReplyWithMessageDialogFragment r6 = (com.whatsapp.voipcalling.ReplyWithMessageDialogFragment) r6
            java.lang.Object r1 = r8.A01
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.01I r4 = r6.A0i()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.AnonymousClass00C.A0E(r4, r0)
            X.155 r4 = (X.AnonymousClass155) r4
            int r0 = r1.length
            int r0 = r0 + -1
            if (r10 == r0) goto L_0x006d
            r2 = r1[r10]
        L_0x0023:
            X.190 r1 = X.C36441kJ.A0j()
            com.whatsapp.jid.UserJid r0 = r6.A02
            r5 = 0
            android.content.Intent r3 = r1.A1Z(r4, r0, r5)
            r1 = 1
            if (r2 == 0) goto L_0x0067
            java.lang.String r0 = "wa_type"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "share_msg"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "has_share"
            r3.putExtra(r0, r1)
            android.content.Context r0 = r6.A0a()
            X.AnonymousClass3M2.A00(r0, r3)
        L_0x0047:
            X.6Jm r2 = r6.A00
            if (r2 == 0) goto L_0x0114
            java.lang.String r1 = r6.A03
            X.AnonymousClass00C.A0D(r1, r5)
            r0 = 3
            X.C130046Jm.A00(r2, r1, r0, r0)
            X.0wo r0 = r6.A01
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = "ReplyWithMessageDialogFragment"
            X.AnonymousClass3M9.A01(r3, r0)
            r4.startActivity(r3)
            X.4SS r4 = (X.AnonymousClass4SS) r4
            r0 = 2
            r4.BnL(r0)
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = "show_keyboard"
            r3.putExtra(r0, r1)
            goto L_0x0047
        L_0x006d:
            r2 = 0
            goto L_0x0023
        L_0x006f:
            java.lang.Object r2 = r8.A00
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r2 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r2
            java.lang.Object r1 = r8.A01
            X.0wU r5 = r2.A06
            r0 = 12
            X.3v9 r4 = new X.3v9
            r4.<init>(r2, r1, r0)
            goto L_0x00f4
        L_0x007f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.blocklist.UnblockDialogFragment r0 = (com.whatsapp.blocklist.UnblockDialogFragment) r0
            java.lang.Object r1 = r8.A01
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0066
            r1.finish()
            return
        L_0x008f:
            java.lang.Object r0 = r8.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            java.lang.Object r1 = r8.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.02E r0 = r0.A0I
            if (r0 == 0) goto L_0x0066
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1v(r1)
            return
        L_0x00a1:
            java.lang.Object r2 = r8.A00
            java.lang.Object r1 = r8.A01
            X.2KO r1 = (X.AnonymousClass2KO) r1
            if (r2 == 0) goto L_0x0066
            X.0wU r5 = r1.A0G
            r0 = 29
            X.3v9 r4 = new X.3v9
            r4.<init>(r1, r2, r0)
            goto L_0x00f4
        L_0x00b3:
            java.lang.Object r2 = r8.A00
            com.whatsapp.invites.RevokeInviteDialogFragment r2 = (com.whatsapp.invites.RevokeInviteDialogFragment) r2
            java.lang.Object r1 = r8.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = -1
            if (r10 != r0) goto L_0x0066
            X.4Qt r0 = r2.A02
            if (r0 == 0) goto L_0x0066
            r0.BfZ(r1)
            return
        L_0x00c6:
            java.lang.Object r2 = r8.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r8.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 124(0x7c, float:1.74E-43)
            X.AnonymousClass3SJ.A00(r2, r0)
            if (r1 == 0) goto L_0x0066
            r1.run()
            return
        L_0x00d9:
            java.lang.Object r3 = r8.A00
            com.whatsapp.settings.SettingsUserProxyActivity r3 = (com.whatsapp.settings.SettingsUserProxyActivity) r3
            java.lang.Object r2 = r8.A01
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r0 = r2.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00f8
            X.0wU r5 = r3.A04
            r0 = 44
            X.3wZ r4 = new X.3wZ
            r4.<init>((java.lang.Object) r3, (int) r0)
        L_0x00f4:
            r5.Boy(r4)
            return
        L_0x00f8:
            X.0wU r1 = r3.A04
            r0 = 0
            X.C81203wd.A02(r1, r3, r2, r0)
            androidx.appcompat.widget.SwitchCompat r0 = r3.A05
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0066
            androidx.appcompat.widget.SwitchCompat r1 = r3.A05
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x010d:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0114:
            java.lang.String r0 = "incomingCallLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011b:
            java.lang.Object r3 = r8.A00
            com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment r3 = (com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment) r3
            java.lang.Object r2 = r8.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0xT r1 = r3.A01
            java.lang.String r0 = "30035737"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r1 = X.C36391kE.A0G(r0)
            X.1Dv r0 = r3.A00
            r0.A06(r2, r1)
            goto L_0x02e2
        L_0x0136:
            java.lang.Object r2 = r8.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            java.lang.Object r0 = r8.A01
            X.141 r0 = (X.AnonymousClass141) r0
            android.content.Context r1 = r2.A0a()
            java.lang.String r0 = X.C36351kA.A0y(r0)
            android.content.Intent r0 = X.AnonymousClass190.A15(r1, r0)
            r2.A1C(r0)
            return
        L_0x014e:
            java.lang.Object r3 = r8.A00
            com.whatsapp.community.CommunityDeleteDialogFragment r3 = (com.whatsapp.community.CommunityDeleteDialogFragment) r3
            java.lang.Object r5 = r8.A01
            java.util.List r5 = (java.util.List) r5
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            X.01I r0 = r3.A0i()
            X.14u r2 = X.C36401kF.A0L(r0)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r2.Bu1(r0)
            X.0wo r0 = r3.A04
            if (r0 == 0) goto L_0x0186
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.ref.WeakReference r4 = X.AnonymousClass001.A0F(r2)
            X.0wU r0 = r3.A07
            if (r0 == 0) goto L_0x0181
            X.2iy r1 = new X.2iy
            r1.<init>(r2, r3, r4, r5, r6)
            X.C36331k8.A1F(r1, r0)
            return
        L_0x0181:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x0186:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x018d:
            java.lang.Object r1 = r8.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.A01
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            android.content.Intent r0 = X.AnonymousClass190.A0c(r1, r0)
            r1.startActivity(r0)
            return
        L_0x019d:
            java.lang.Object r1 = r8.A00
            com.whatsapp.community.suspend.CommunitySuspendDialogFragment r1 = (com.whatsapp.community.suspend.CommunitySuspendDialogFragment) r1
            java.lang.Object r2 = r8.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.1fs r1 = r1.A00
            if (r1 == 0) goto L_0x01b1
            java.lang.String r0 = "community-no-longer-available"
            goto L_0x030b
        L_0x01b1:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01b8:
            java.lang.Object r3 = r8.A00
            X.02E r3 = (X.AnonymousClass02E) r3
            java.lang.Object r2 = r8.A01
            X.141 r2 = (X.AnonymousClass141) r2
            X.190 r1 = X.C36441kJ.A0j()
            X.01I r0 = r3.A0h()
            android.content.Intent r0 = r1.A1W(r0, r2)
            X.AnonymousClass3LQ.A00(r0, r3)
            return
        L_0x01d0:
            java.lang.Object r3 = r8.A00
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            java.lang.Object r2 = r8.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Integer r1 = X.C36371kC.A0n()
            r0 = 1
            r3.A0M(r2, r1, r0)
            return
        L_0x01e1:
            java.lang.Object r3 = r8.A00
            X.2iG r3 = (X.C48912iG) r3
            java.lang.Object r2 = r8.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r3.A00
            X.8Yz r1 = (X.C174928Yz) r1
            java.util.ArrayList r0 = r1.A0b
            int r0 = r0.size()
            java.lang.String r4 = X.C36401kF.A0s(r2, r10)
            if (r10 >= r0) goto L_0x020b
            X.3Rv r3 = r1.A07
            android.content.Context r2 = r1.getContext()
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A02(r2, r1, r4, r0)
            return
        L_0x020b:
            r3.A04(r4)
            return
        L_0x020f:
            java.lang.Object r3 = r8.A00
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = (com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r3
            java.lang.Object r2 = r8.A01
            android.net.Uri r2 = (android.net.Uri) r2
            r0 = 2
            X.2QH r1 = r3.A0A
            if (r1 == 0) goto L_0x0227
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r3.A09
            r0.Bly(r1)
        L_0x0227:
            android.content.Intent r2 = X.C36391kE.A0G(r2)
            X.1Dv r1 = r3.A00
            android.content.Context r0 = r3.A1D()
            r1.A06(r0, r2)
            r3.A1c()
            return
        L_0x0238:
            java.lang.Object r5 = r8.A00
            X.2KJ r5 = (X.AnonymousClass2KJ) r5
            java.lang.Object r0 = r8.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r4 = r0.A1J
            X.AnonymousClass00C.A07(r4)
            X.1VZ r0 = r5.A04
            X.3T1 r3 = r0.A02(r4)
            X.3CS r2 = r5.A00
            java.lang.String r1 = "cta_cancel_reminder"
            java.lang.String r0 = "cta_reminder"
            r2.A00(r3, r1, r0)
            X.11F r2 = r4.A00
            X.0wU r1 = r5.A07
            r0 = 18
            X.C80403vL.A01(r1, r2, r5, r3, r0)
            X.3Qi r0 = r5.A01
            r0.A02(r3)
            return
        L_0x0263:
            java.lang.Object r1 = r8.A00
            X.2KO r1 = (X.AnonymousClass2KO) r1
            java.lang.Object r3 = r8.A01
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = X.C19550w8.A09()
            if (r0 == 0) goto L_0x0288
            X.0v0 r2 = r1.A0A
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = r2.A2U(r1)
            if (r0 != 0) goto L_0x0288
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0 = 100
            X.AnonymousClass3US.A08(r2, r1)
            X.C03570Gk.A0C(r3, r1, r0)
            return
        L_0x0288:
            boolean r0 = X.C19550w8.A03()
            if (r0 == 0) goto L_0x0292
            X.AnonymousClass3UJ.A07(r3)
            return
        L_0x0292:
            X.AnonymousClass3UJ.A06(r3)
            return
        L_0x0296:
            java.lang.Object r6 = r8.A00
            com.whatsapp.dialogs.CreateOrAddToContactsDialog r6 = (com.whatsapp.dialogs.CreateOrAddToContactsDialog) r6
            java.lang.Object r1 = r8.A01
            java.util.List r1 = (java.util.List) r1
            X.15C r0 = r6.A01
            X.C18740tg.A06(r0)
            java.lang.Object r0 = r1.get(r10)
            X.3DB r0 = (X.AnonymousClass3DB) r0
            int r5 = r0.A00
            r4 = 2131431616(0x7f0b10c0, float:1.8484966E38)
            X.15C r3 = r6.A01
            long r1 = r6.A00
            boolean r0 = r6.A02
            if (r5 != r4) goto L_0x02ba
            r3.BUu(r1, r0)
            return
        L_0x02ba:
            r3.BQs(r1, r0)
            return
        L_0x02be:
            java.lang.Object r3 = r8.A00
            com.whatsapp.group.ExitGroupsDialogFragment r3 = (com.whatsapp.group.ExitGroupsDialogFragment) r3
            java.lang.Object r2 = r8.A01
            X.0wU r1 = r3.A0F
            r0 = 49
            X.C81193wc.A01(r1, r3, r2, r0)
            goto L_0x02e2
        L_0x02cc:
            java.lang.Object r3 = r8.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.Object r1 = r8.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.2oi r0 = X.C51992oi.LEAVE_GROUPS
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.AnonymousClass3RD.A02(r0, r1)
            X.01z r1 = r3.A0l()
            r0 = 0
            r2.A1f(r1, r0)
        L_0x02e2:
            r3.A1b()
            return
        L_0x02e6:
            java.lang.Object r3 = r8.A00
            com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog r3 = (com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog) r3
            java.lang.Object r2 = r8.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.3Dl r0 = r3.A00
            X.1fs r1 = r0.A00
            java.lang.String r0 = "group-no-longer-available"
            r1.A01(r2, r0)
            android.app.Dialog r0 = r3.A1Z()
            r0.dismiss()
            return
        L_0x02ff:
            java.lang.Object r0 = r8.A00
            com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment r0 = (com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment) r0
            java.lang.Object r2 = r8.A01
            X.01I r2 = (X.AnonymousClass01I) r2
            X.1fs r1 = r0.A00
            java.lang.String r0 = "invite-via-link-unavailable"
        L_0x030b:
            r1.A01(r2, r0)
            return
        L_0x030f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.BusinessHubActivity r0 = (com.whatsapp.payments.ui.BusinessHubActivity) r0
            java.lang.Object r3 = r8.A01
            X.54i r3 = (X.C1031954i) r3
            X.00T r0 = r0.A0E
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r4 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r4
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0338
            X.0wU r2 = r4.A04
            r0 = 19
            X.72v r1 = new X.72v
            r1.<init>(r3, r4, r0)
        L_0x0334:
            r2.Boy(r1)
            return
        L_0x0338:
            X.00T r0 = r4.A08
            java.lang.Object r3 = r0.getValue()
            X.00r r3 = (X.C001600r) r3
            r2 = 0
            r1 = 2
            X.5tn r0 = new X.5tn
            r0.<init>(r2, r2, r1)
            r3.A0D(r0)
            X.0wU r2 = r4.A04
            r0 = 9
            X.72o r1 = new X.72o
            r1.<init>(r4, r0)
            goto L_0x0334
        L_0x0354:
            java.lang.Object r1 = r8.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r8.A01
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = (com.whatsapp.status.StatusConfirmMuteDialogFragment) r0
            com.whatsapp.status.StatusConfirmMuteDialogFragment.A03(r1, r0)
            return
        L_0x0360:
            java.lang.Object r1 = r8.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r8.A01
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = (com.whatsapp.status.StatusConfirmUnmuteDialogFragment) r0
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment.A03(r1, r0)
            return
        L_0x036c:
            java.lang.Object r2 = r8.A00
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            java.lang.Object r0 = r8.A01
            X.141 r0 = (X.AnonymousClass141) r0
            X.1NG r1 = r2.A0J
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            r1.A0H(r2, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A00(r2, r0)
            com.whatsapp.mentions.MentionableEntry r1 = r2.A0o
            r0 = 1
            r1.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89714Xp.onClick(android.content.DialogInterface, int):void");
    }
}
