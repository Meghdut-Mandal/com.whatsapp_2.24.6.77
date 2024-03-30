package X;

import android.view.View;

/* renamed from: X.3YD  reason: invalid class name */
public class AnonymousClass3YD implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass3YD(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public static void A00(View view, Object obj, int i, boolean z) {
        view.setOnClickListener(new AnonymousClass3YD(i, obj, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r3 != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        r2 = r3.A02.getCurrentLogicalItem();
        r1 = r3.A02.findViewWithTag(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016d, code lost:
        if (r2 == 0) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0170, code lost:
        if (r2 != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        r3.A0A.performAccessibilityAction(128, (android.os.Bundle) null);
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017c, code lost:
        r0.sendAccessibilityEvent(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0186, code lost:
        if (X.AnonymousClass3RI.A02(r3.A06) == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0188, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018d, code lost:
        r0 = r1.findViewById(com.whatsapp.R.id.green_alert_education_title);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        if (r1 != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b3, code lost:
        r1 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b5, code lost:
        X.AnonymousClass3SJ.A01(X.C70803fk.A0B(r2), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bd, code lost:
        r1 = 28;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A02
            r6 = r16
            switch(r0) {
                case 0: goto L_0x02f0;
                case 1: goto L_0x01f1;
                case 2: goto L_0x0282;
                case 3: goto L_0x01da;
                case 4: goto L_0x01c0;
                case 5: goto L_0x01a1;
                case 6: goto L_0x0215;
                case 7: goto L_0x0134;
                case 8: goto L_0x0099;
                case 9: goto L_0x0056;
                case 10: goto L_0x001b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.widget.PaymentView r0 = (com.whatsapp.payments.ui.widget.PaymentView) r0
            boolean r2 = r15.A01
            X.17Y r1 = r0.A0O
            r0 = 2131892342(0x7f121876, float:1.941943E38)
            if (r2 == 0) goto L_0x0017
            r0 = 2131892341(0x7f121875, float:1.9419428E38)
        L_0x0017:
            r1.A03(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r0 = r15.A00
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r0 = (com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet) r0
            boolean r3 = r15.A01
            X.4Qo r1 = r0.A02
            if (r1 == 0) goto L_0x001a
            X.4Wp r1 = (X.C89454Wp) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x001a
            r0 = 1
            if (r3 == 0) goto L_0x003a
            r0 = 8
        L_0x003a:
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x003e:
            java.lang.Object r2 = r1.A00
            X.3fk r2 = (X.C70803fk) r2
            X.4V6 r0 = r2.A2l
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x001a
            X.141 r0 = r2.A3Y
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x001a
            if (r3 == 0) goto L_0x01bd
            goto L_0x01b3
        L_0x0056:
            java.lang.Object r1 = r15.A00
            com.whatsapp.group.newgroup.NewGroup r1 = (com.whatsapp.group.newgroup.NewGroup) r1
            boolean r7 = r15.A01
            android.os.Bundle r6 = r1.A03
            if (r6 == 0) goto L_0x001a
            X.04e r5 = r1.A0q
            com.whatsapp.WaEditText r0 = r1.A09
            java.lang.String r4 = X.C36361kB.A0n(r0)
            X.147 r3 = r1.A0W
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPermissionsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "setting_values"
            r2.putExtra(r0, r6)
            r1 = 0
            if (r7 == 0) goto L_0x0080
            r1 = 7
        L_0x0080:
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "group_subject"
            r2.putExtra(r0, r4)
            if (r3 == 0) goto L_0x0095
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_gid"
            r2.putExtra(r0, r1)
        L_0x0095:
            r5.A02(r2)
            return
        L_0x0099:
            java.lang.Object r3 = r15.A00
            com.whatsapp.greenalert.GreenAlertActivity r3 = (com.whatsapp.greenalert.GreenAlertActivity) r3
            boolean r4 = r15.A01
            com.whatsapp.WaViewPager r0 = r3.A02
            int r0 = r0.getCurrentLogicalItem()
            int r1 = r0 + 1
            r0 = 2
            int r2 = java.lang.Math.min(r1, r0)
            if (r2 != r0) goto L_0x011f
            X.0wo r7 = r3.A07
            X.1Wj r2 = r3.A05
            X.1Wg r1 = r3.A06
            X.1E9 r6 = r3.A08
            X.1Wi r0 = r1.A03
            X.3Su r8 = r0.A01()
            if (r8 == 0) goto L_0x00f6
            int r0 = r8.A01
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "202102"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x00f6
            r1.A08()
        L_0x00cf:
            java.lang.String r5 = "20210210"
            X.1EB r1 = r6.A06
            r0 = 1
            r1.A01(r5, r0)
            X.1EA r0 = r6.A05
            java.lang.Iterable r0 = X.C36421kH.A0X(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00e1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r5.next()
            X.3NC r0 = (X.AnonymousClass3NC) r0
            com.whatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r0.A00
            X.00s r1 = r0.A01
            r0 = 0
            r1.A0D(r0)
            goto L_0x00e1
        L_0x00f6:
            long r12 = X.C19970wo.A00(r7)
            r9 = 20210210(0x1346222, float:3.3131185E-38)
            r10 = 1
            r14 = 0
            X.3Su r8 = new X.3Su
            r11 = 1
            r8.<init>(r9, r10, r11, r12, r14)
            java.lang.String r0 = "UserNoticeManager/agreePhonyUserNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 5
            X.C29341Wg.A04(r1, r9, r0, r10)
            goto L_0x00cf
        L_0x010f:
            r0 = 9
            if (r4 == 0) goto L_0x0114
            r0 = 6
        L_0x0114:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C29371Wj.A00(r2, r8, r0)
            r3.finish()
            goto L_0x015b
        L_0x011f:
            X.1Wj r1 = r3.A05
            java.lang.Integer r0 = X.C36421kH.A0V()
            X.C29371Wj.A01(r1, r0)
            com.whatsapp.WaViewPager r0 = r3.A02
            r0.setCurrentLogicalItem(r2)
            com.whatsapp.greenalert.GreenAlertActivity.A07(r3, r2)
            com.whatsapp.greenalert.GreenAlertActivity.A0F(r3, r2)
            goto L_0x015b
        L_0x0134:
            java.lang.Object r3 = r15.A00
            com.whatsapp.greenalert.GreenAlertActivity r3 = (com.whatsapp.greenalert.GreenAlertActivity) r3
            boolean r2 = r15.A01
            X.1Wj r1 = r3.A05
            r0 = 15
            if (r2 == 0) goto L_0x0142
            r0 = 14
        L_0x0142:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C29371Wj.A01(r1, r0)
            com.whatsapp.WaViewPager r0 = r3.A02
            int r0 = r0.getCurrentLogicalItem()
            int r1 = r0 + -1
            r0 = -1
            int r1 = java.lang.Math.max(r0, r1)
            if (r1 >= 0) goto L_0x0195
            com.whatsapp.greenalert.GreenAlertActivity.A01(r3)
        L_0x015b:
            com.whatsapp.WaViewPager r0 = r3.A02
            int r2 = r0.getCurrentLogicalItem()
            com.whatsapp.WaViewPager r1 = r3.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.view.View r1 = r1.findViewWithTag(r0)
            r4 = 8
            if (r2 == 0) goto L_0x0180
            r0 = 1
            if (r2 != r0) goto L_0x001a
            com.whatsapp.wds.components.button.WDSButton r2 = r3.A0A
            r1 = 128(0x80, float:1.794E-43)
            r0 = 0
            r2.performAccessibilityAction(r1, r0)
            com.whatsapp.WaImageButton r0 = r3.A00
        L_0x017c:
            r0.sendAccessibilityEvent(r4)
            return
        L_0x0180:
            X.1Wg r0 = r3.A06
            boolean r0 = X.AnonymousClass3RI.A02(r0)
            if (r0 == 0) goto L_0x018b
            com.whatsapp.WaImageButton r0 = r3.A01
            goto L_0x017c
        L_0x018b:
            if (r1 == 0) goto L_0x001a
            r0 = 2131430588(0x7f0b0cbc, float:1.8482881E38)
            android.view.View r0 = r1.findViewById(r0)
            goto L_0x017c
        L_0x0195:
            com.whatsapp.WaViewPager r0 = r3.A02
            r0.setCurrentLogicalItem(r1)
            com.whatsapp.greenalert.GreenAlertActivity.A07(r3, r1)
            com.whatsapp.greenalert.GreenAlertActivity.A0F(r3, r1)
            goto L_0x015b
        L_0x01a1:
            java.lang.Object r2 = r15.A00
            X.3fk r2 = (X.C70803fk) r2
            boolean r0 = r15.A01
            r1 = r0 ^ 1
            X.141 r0 = r2.A3Y
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x01bd
        L_0x01b3:
            r1 = 29
        L_0x01b5:
            X.155 r0 = X.C70803fk.A0B(r2)
            X.AnonymousClass3SJ.A01(r0, r1)
            return
        L_0x01bd:
            r1 = 28
            goto L_0x01b5
        L_0x01c0:
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r15.A01
            android.app.Activity r2 = X.C36361kB.A05(r1)
            if (r2 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x001a
            r1 = 2
            android.content.Intent r0 = X.C36431kI.A0D()
            X.AnonymousClass190.A1T(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x01da:
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r15.A01
            android.app.Activity r2 = X.C36361kB.A05(r1)
            X.14u r2 = (X.C225314u) r2
            if (r2 == 0) goto L_0x001a
            com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment r1 = com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment.A03(r0)
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x01f1:
            java.lang.Object r4 = r15.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            boolean r3 = r15.A01
            X.3TX r2 = r4.A0a
            java.lang.String r1 = "backup_found"
            java.lang.String r0 = "restore"
            r2.A08(r1, r0)
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0o(r4)
            if (r0 != 0) goto L_0x001a
            if (r3 == 0) goto L_0x0328
            r0 = 2
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0L(r4, r0)
            android.content.Intent r1 = X.AnonymousClass190.A0G(r4, r0)
            r0 = 0
            r4.startActivityForResult(r1, r0)
            return
        L_0x0215:
            java.lang.Object r3 = r15.A00
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog r3 = (com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog) r3
            boolean r7 = r15.A01
            r0 = 2
            X.AnonymousClass00C.A0D(r6, r0)
            X.1Rf r5 = r3.A0G
            if (r5 == 0) goto L_0x027b
            X.11F r4 = r3.A0I
            X.1A6 r2 = r3.A0D
            if (r2 == 0) goto L_0x0274
            int r1 = r3.A00
            r0 = 3
            r5.A00(r2, r4, r0, r1)
            if (r7 == 0) goto L_0x0251
            X.3Fy r0 = r3.A0H
            if (r0 == 0) goto L_0x0266
            X.0xT r1 = r0.A01
            java.lang.String r0 = "728928448599090"
            android.content.Intent r2 = X.C36341k9.A0D(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.1Dv r1 = r3.A02
            if (r1 == 0) goto L_0x025f
            android.content.Context r0 = r6.getContext()
            r1.A06(r0, r2)
        L_0x024d:
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A05(r3)
            return
        L_0x0251:
            X.1fs r2 = r3.A0C
            if (r2 == 0) goto L_0x026d
            X.01I r1 = r3.A0i()
            java.lang.String r0 = "about-disappearing-messages"
            r2.A01(r1, r0)
            goto L_0x024d
        L_0x025f:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0266:
            java.lang.String r0 = "userExperienceEphemeralMessageUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x026d:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0274:
            java.lang.String r0 = "conversationsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x027b:
            java.lang.String r0 = "keepInChatLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0282:
            java.lang.Object r5 = r15.A00
            com.whatsapp.companionmode.registration.CompanionPostLogoutActivity r5 = (com.whatsapp.companionmode.registration.CompanionPostLogoutActivity) r5
            boolean r2 = r15.A01
            X.1Pd r1 = r5.A01
            r0 = 0
            r1.A02(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CompanionPostLogoutActivity/init/onClick/areInactiveAccountsPresent : "
            X.C36321k7.A1X(r0, r1, r2)
            if (r2 == 0) goto L_0x02ec
            android.content.SharedPreferences r0 = X.C36331k8.A06(r5)
            java.lang.String r1 = "account_switching_logged_out_lid"
            r4 = 0
            java.lang.String r0 = r0.getString(r1, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02d3
            java.lang.String r0 = "CompanionPostLogoutActivity/init/onClick/logged out lid found, calling remove account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Dv r3 = r5.A01
            android.content.SharedPreferences r0 = X.C36331k8.A06(r5)
            java.lang.String r6 = r0.getString(r1, r4)
            X.0v0 r0 = r5.A09
            int r8 = r0.A0I()
            r9 = 19
            long r10 = android.os.SystemClock.elapsedRealtime()
            X.0wh r0 = r5.A0A
            java.lang.String r7 = r0.A01()
            android.content.Intent r0 = X.AnonymousClass190.A1G(r5, r6, r7, r8, r9, r10)
        L_0x02cf:
            r3.A06(r5, r0)
            return
        L_0x02d3:
            java.lang.String r0 = "CompanionPostLogoutActivity/init/onClick/logged out lid not found, calling abandon add new account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Dv r3 = r5.A01
            X.0v0 r0 = r5.A09
            int r2 = r0.A0I()
            X.0wh r0 = r5.A0A
            java.lang.String r1 = r0.A01()
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1H(r5, r4, r1, r2, r0)
            goto L_0x02cf
        L_0x02ec:
            X.C36351kA.A12(r5)
            return
        L_0x02f0:
            java.lang.Object r5 = r15.A00
            com.whatsapp.accountswitching.ui.AddAccountBottomSheet r5 = (com.whatsapp.accountswitching.ui.AddAccountBottomSheet) r5
            boolean r4 = r15.A01
            X.005 r0 = r5.A02
            if (r0 == 0) goto L_0x0321
            java.lang.Object r3 = r0.get()
            X.6PU r3 = (X.AnonymousClass6PU) r3
            android.content.Context r2 = X.C36371kC.A0B(r6)
            int r1 = r5.A00
            java.lang.String r0 = r5.A03
            r3.A01(r2, r0, r1, r4)
            X.6TO r3 = r5.A01
            if (r3 == 0) goto L_0x031a
            int r2 = r5.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0 = 3
            r3.A02(r1, r2, r0)
            return
        L_0x031a:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0321:
            java.lang.String r0 = "addAccountNavigator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0328:
            r1 = 27
            r0 = 0
            r4.A3r(r0, r1)
            r4.A3n()
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0Q(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YD.onClick(android.view.View):void");
    }
}
