package X;

import android.view.View;

/* renamed from: X.3Y7  reason: invalid class name */
public class AnonymousClass3Y7 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y7(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03d8, code lost:
        r4.Btm(com.whatsapp.settings.MultiSelectionDialogFragment.A03(r6, r5, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03fe, code lost:
        r7 = r9.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0404, code lost:
        if (r7 == 0) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0406, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x040d, code lost:
        if (r7 == 1) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x040f, code lost:
        r5 = new X.AnonymousClass3JP(java.lang.Integer.valueOf(com.whatsapp.R.string.f12nameremoved), com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0421, code lost:
        r16 = X.AnonymousClass3PN.A00(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0425, code lost:
        if (r7 == 0) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0428, code lost:
        if (r7 == 1) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x042a, code lost:
        r1 = r8.A01;
        r14 = r1.A0Q(X.C56752wp.A01);
        r13 = r1.A0Q(X.C56752wp.A00);
        r2 = r4.getResources();
        r12 = new X.C37281m7(r2, X.C015006m.A00((android.content.res.Resources.Theme) null, r2, com.whatsapp.R.color.f6nameremoved));
        r10 = new android.text.style.AbsoluteSizeSpan(16, true);
        r9 = java.lang.Math.min(r14.length, r13.length);
        r8 = X.C36441kJ.A14(r9);
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045b, code lost:
        if (r7 >= r9) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x045d, code lost:
        r15 = r14[r7];
        r2 = r13[r7];
        X.AnonymousClass00C.A0B(r15);
        X.AnonymousClass00C.A0B(r2);
        r1 = X.AnonymousClass000.A0v(r15);
        r1.append(10);
        r0 = X.AnonymousClass000.A0q(r2, r1);
        r3 = X.C36441kJ.A0O(r0);
        r2 = r15.length();
        r3.setSpan(r12, r2 + 1, r0.length(), 33);
        r3.setSpan(r10, 0, r2, 17);
        r8.add(r3);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0492, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0498, code lost:
        r5 = new X.AnonymousClass3JP((java.lang.Integer) null, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x049e, code lost:
        r8 = X.AnonymousClass02R.A0D(r8.A01.A0Q(X.C56752wp.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04aa, code lost:
        r1 = (java.lang.CharSequence[]) r8.toArray(new java.lang.CharSequence[0]);
        X.AnonymousClass00C.A0D(r1, 3);
        r3 = r5.A01;
        r2 = com.whatsapp.SingleSelectionDialogFragment.A03(r1, r6, r16, r3);
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x04c0, code lost:
        if (r0 == null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04c2, code lost:
        r2.putInt("dialogPositiveButtonTextResId", r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04cb, code lost:
        r2.putInt("customTitleId", r3);
        r2.putInt("customSubTitleId", r5.A00);
        r0 = new com.whatsapp.settings.MediaQualityConfirmationDialogFragment();
        r0.A17(r2);
        r4.Btm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0548, code lost:
        r2.setClassName(r1, r0);
        r3.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x054e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05cc, code lost:
        r4.Btm(com.whatsapp.SingleSelectionDialogFragment.A06(r2, r1, r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05e7, code lost:
        r1 = new com.whatsapp.SingleSelectionDialogFragment();
        r1.A17(com.whatsapp.SingleSelectionDialogFragment.A05(r3, r2, r4, r0));
        r5.Btm(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04aa, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = X.C53222qy.A00(r1, r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r3.Btm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02ac, code lost:
        r3.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0348, code lost:
        r5.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x034b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x0174;
                case 2: goto L_0x0007;
                case 3: goto L_0x01a8;
                case 4: goto L_0x0007;
                case 5: goto L_0x01cf;
                case 6: goto L_0x001b;
                case 7: goto L_0x01df;
                case 8: goto L_0x01ef;
                case 9: goto L_0x01ff;
                case 10: goto L_0x020f;
                case 11: goto L_0x021f;
                case 12: goto L_0x022f;
                case 13: goto L_0x023c;
                case 14: goto L_0x0048;
                case 15: goto L_0x024c;
                case 16: goto L_0x0061;
                case 17: goto L_0x0258;
                case 18: goto L_0x0262;
                case 19: goto L_0x027a;
                case 20: goto L_0x0091;
                case 21: goto L_0x0284;
                case 22: goto L_0x0291;
                case 23: goto L_0x02a1;
                case 24: goto L_0x02b0;
                case 25: goto L_0x02cb;
                case 26: goto L_0x030b;
                case 27: goto L_0x00dc;
                case 28: goto L_0x031e;
                case 29: goto L_0x010f;
                case 30: goto L_0x032e;
                case 31: goto L_0x034c;
                case 32: goto L_0x0354;
                case 33: goto L_0x037b;
                case 34: goto L_0x039a;
                case 35: goto L_0x03b9;
                case 36: goto L_0x03e0;
                case 37: goto L_0x03ea;
                case 38: goto L_0x03f4;
                case 39: goto L_0x04e3;
                case 40: goto L_0x04fb;
                case 41: goto L_0x0536;
                case 42: goto L_0x0554;
                case 43: goto L_0x0564;
                case 44: goto L_0x0578;
                case 45: goto L_0x058f;
                case 46: goto L_0x05be;
                case 47: goto L_0x05d4;
                case 48: goto L_0x05f7;
                case 49: goto L_0x013d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A00
            X.14u r3 = (X.C225314u) r3
            r2 = 1
            java.lang.String r0 = "Settings/showAccountSwitcher"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "settings"
        L_0x0013:
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C53222qy.A00(r1, r2)
        L_0x0017:
            r3.Btm(r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsAccount r3 = (com.whatsapp.settings.SettingsAccount) r3
            X.0v5 r0 = r3.A01
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001a
            X.3Cv r2 = r3.A08
            r1 = 33
            java.lang.Integer r0 = X.C36381kD.A0m()
            r2.A00(r1, r0)
            X.0v5 r0 = r3.A01
            r0.A02()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.setting.InteropSettingsActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0048:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsAccount r3 = (com.whatsapp.settings.SettingsAccount) r3
            X.1RU r0 = r3.A03
            X.0yC r1 = r0.A0C
            r0 = 7582(0x1d9e, float:1.0625E-41)
            boolean r0 = r1.A0E(r0)
            r2 = 15
            java.lang.String r1 = "settings_account"
            if (r0 == 0) goto L_0x0013
            com.whatsapp.accountswitching.ui.AddAccountBottomSheet r0 = X.C53232qz.A00(r1, r2)
            goto L_0x0017
        L_0x0061:
            java.lang.Object r6 = r1.A00
            com.whatsapp.settings.SettingsCallingPrivacyActivity r6 = (com.whatsapp.settings.SettingsCallingPrivacyActivity) r6
            X.1Nv r0 = r6.A02
            if (r0 == 0) goto L_0x0626
            java.lang.String r5 = "calladd"
            int r0 = r0.A00(r5)
            r4 = 5
            r3 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0075
            r2 = 5
        L_0x0075:
            X.1Nv r1 = r6.A02
            if (r1 == 0) goto L_0x061f
            java.lang.String r0 = X.AnonymousClass3TL.A02(r5, r2)
            r1.A04(r5, r0)
            if (r2 != r4) goto L_0x001a
            boolean r0 = r6.A06
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r6.A06 = r0
            X.0xQ r0 = r6.A04
            if (r0 == 0) goto L_0x0618
            r0.A0U(r3, r3)
            return
        L_0x0091:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsChat r3 = (com.whatsapp.settings.SettingsChat) r3
            X.1Cb r0 = r3.A05
            X.15g r1 = r3.A0Q
            boolean r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x001a
            X.1Cb r0 = r3.A05
            boolean r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x001a
            X.2RM r2 = new X.2RM
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            java.lang.Integer r0 = X.C36381kD.A0m()
            r2.A04 = r0
            java.lang.Integer r0 = X.C36361kB.A0i()
            r2.A02 = r0
            X.6sV r9 = r3.A07
            X.0wx r8 = r3.A08
            X.0ts r7 = r3.A00
            X.1Ca r5 = r3.A03
            X.0yE r6 = r3.A06
            X.3ql r10 = new X.3ql
            r10.<init>(r2, r3)
            X.3hK r2 = new X.3hK
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r9.A02(r2, r0)
            return
        L_0x00dc:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsChat r5 = (com.whatsapp.settings.SettingsChat) r5
            androidx.appcompat.widget.SwitchCompat r0 = r5.A01
            r0.toggle()
            androidx.appcompat.widget.SwitchCompat r0 = r5.A01
            boolean r4 = r0.isChecked()
            X.1CR r3 = r5.A0D
            int r2 = X.C36371kC.A00(r4)
            java.lang.String r0 = "individual_chat_defaults"
            X.3LI r1 = X.AnonymousClass1CR.A02(r3, r0)
            int r0 = r1.A03
            if (r2 == r0) goto L_0x0100
            r1.A03 = r2
            X.AnonymousClass1CR.A06(r1, r3)
        L_0x0100:
            if (r4 == 0) goto L_0x001a
            X.0wU r2 = r5.A04
            X.0y0 r1 = r5.A04
            java.util.Objects.requireNonNull(r1)
            r0 = 20
            X.C81163wZ.A00(r2, r1, r0)
            return
        L_0x010f:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r3 = (com.whatsapp.settings.SettingsDataUsageActivity) r3
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0E
            r0.toggle()
            X.0v0 r1 = r3.A09
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0E
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r1)
            java.lang.String r0 = "voip_low_data_usage"
            X.C36331k8.A0w(r1, r0, r2)
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0E
            boolean r2 = r0.isChecked()
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            if (r1 == 0) goto L_0x001a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x001a
            com.whatsapp.voipcalling.Voip.setCallLowDataUsage(r2)
            return
        L_0x013d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0E
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0E
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r1.equals(r0)
            r2.A0L = r3
            X.1CR r2 = r2.A0F
            java.lang.String r0 = "individual_chat_defaults"
            X.3LI r1 = X.AnonymousClass1CR.A02(r2, r0)
            boolean r0 = r1.A0H
            if (r3 == r0) goto L_0x001a
            r1.A0H = r3
            X.AnonymousClass1CR.A06(r1, r2)
            return
        L_0x016a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            com.whatsapp.WaImageView r0 = r0.A0K
            r0.callOnClick()
            return
        L_0x0174:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.Settings r5 = (com.whatsapp.settings.Settings) r5
            r0 = 23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.whatsapp.settings.Settings.A0K(r5, r0)
            X.0v5 r1 = r5.A08
            r2 = 0
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0194
            r1.A02()
            java.lang.String r0 = "getMessageQRActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0194:
            android.content.Intent r4 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.contactqr.ContactQrActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "scan"
            r4.putExtra(r0, r2)
            goto L_0x0348
        L_0x01a8:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.Settings r3 = (com.whatsapp.settings.Settings) r3
            X.1eg r0 = r3.A0Y
            r2 = 1
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "one_of_create_group_tool_tip_activated"
            X.C36331k8.A0w(r1, r0, r2)
            X.1eg r0 = r3.A0Y
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "create_group_banner_dismissed"
            X.C36331k8.A0w(r1, r0, r2)
            r0 = -1
            r3.setResult(r0)
            r3.finish()
            return
        L_0x01cf:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountActivity"
            goto L_0x0548
        L_0x01df:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.remove.RemoveAccountActivity"
            goto L_0x0548
        L_0x01ef:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity"
            goto L_0x0548
        L_0x01ff:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity"
            goto L_0x0548
        L_0x020f:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsSecurity"
            goto L_0x0548
        L_0x021f:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPasskeys"
            goto L_0x0548
        L_0x022f:
            java.lang.Object r1 = r1.A00
            X.01I r1 = (X.AnonymousClass01I) r1
            com.whatsapp.settings.SettingsCompanionLogoutDialog r0 = new com.whatsapp.settings.SettingsCompanionLogoutDialog
            r0.<init>()
            X.C36331k8.A12(r0, r1)
            return
        L_0x023c:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            goto L_0x0548
        L_0x024c:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.AnonymousClass190.A01(r1)
            r1.startActivity(r0)
            return
        L_0x0258:
            java.lang.Object r0 = r1.A00
            com.whatsapp.components.WaSwitchView r0 = (com.whatsapp.components.WaSwitchView) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.toggle()
            return
        L_0x0262:
            java.lang.Object r5 = r1.A00
            android.content.Context r5 = (android.content.Context) r5
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            X.C36341k9.A0t(r4, r3)
            goto L_0x0348
        L_0x027a:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            X.3Q7 r0 = r1.A0A
            r0.A01(r1)
            return
        L_0x0284:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsChat r3 = (com.whatsapp.settings.SettingsChat) r3
            r2 = 0
            java.lang.String r1 = r3.A0J
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass190.A1E(r3, r2, r1, r0)
            goto L_0x02ac
        L_0x0291:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChatHistory"
            goto L_0x0548
        L_0x02a1:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1M(r3, r2, r1, r0)
        L_0x02ac:
            r3.startActivity(r0)
            return
        L_0x02b0:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsChat r2 = (com.whatsapp.settings.SettingsChat) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A00
            r0.toggle()
            X.0v0 r1 = r2.A09
            androidx.appcompat.widget.SwitchCompat r0 = r2.A00
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r1)
            java.lang.String r0 = "input_enter_send"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x02cb:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsChat r2 = (com.whatsapp.settings.SettingsChat) r2
            X.1JL r0 = r2.A09
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x02ee
            r5 = 0
            r6 = 2131896501(0x7f1228b5, float:1.9427865E38)
            r7 = 2131896502(0x7f1228b6, float:1.9427867E38)
            r8 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 8
            X.4Xi r3 = new X.4Xi
            r3.<init>(r2, r0)
            X.3cM r4 = X.C68723cM.A00
            r2.A39(r3, r4, r5, r6, r7, r8)
            return
        L_0x02ee:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A02
            r0.toggle()
            X.0wh r1 = r2.A0A
            androidx.appcompat.widget.SwitchCompat r0 = r2.A02
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences r0 = r1.A01
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "otp_split_mode_user_choice"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.commit()
            return
        L_0x030b:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsChat r4 = (com.whatsapp.settings.SettingsChat) r4
            java.lang.String[] r0 = r4.A0K
            int r3 = com.whatsapp.settings.SettingsChat.A01(r4, r0)
            r2 = 1
            r1 = 2131894134(0x7f121f76, float:1.9423064E38)
            r0 = 2130903056(0x7f030010, float:1.741292E38)
            goto L_0x05cc
        L_0x031e:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsUserProxyActivity"
            goto L_0x0548
        L_0x032e:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            java.lang.String r2 = r5.A0S
            android.content.Intent r4 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsNetworkUsage"
            r4.setClassName(r1, r0)
            if (r2 == 0) goto L_0x0348
            java.lang.String r0 = "search_result_key"
            r4.putExtra(r0, r2)
        L_0x0348:
            r5.startActivity(r4)
            return
        L_0x034c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r0 = (com.whatsapp.settings.SettingsDataUsageActivity) r0
            r0.A3i()
            return
        L_0x0354:
            java.lang.Object r4 = r1.A00
            X.14u r4 = (X.C225314u) r4
            android.content.SharedPreferences r1 = X.C36331k8.A06(r4)
            java.lang.String r0 = "newsletter_media_cache_purge_after"
            int r1 = X.C36371kC.A01(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x0379
            r0 = 7
            if (r1 == r0) goto L_0x0377
            r0 = 30
            r3 = 2
            if (r1 == r0) goto L_0x036e
            r3 = 3
        L_0x036e:
            r2 = 7
            r1 = 2131891438(0x7f1214ee, float:1.9417596E38)
            r0 = 2130903065(0x7f030019, float:1.7412937E38)
            goto L_0x05cc
        L_0x0377:
            r3 = 1
            goto L_0x036e
        L_0x0379:
            r3 = 0
            goto L_0x036e
        L_0x037b:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            r5 = 2
            r3 = 2131894097(0x7f121f51, float:1.942299E38)
            int r2 = r4.A00
            java.lang.String[] r0 = r4.A0U
            int r0 = r0.length
            boolean[] r6 = new boolean[r0]
            r1 = 0
        L_0x038b:
            if (r2 == 0) goto L_0x03d8
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6[r1] = r0
            int r2 = r2 >> 1
            int r1 = r1 + 1
            goto L_0x038b
        L_0x039a:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            r5 = 3
            r3 = 2131894101(0x7f121f55, float:1.9422997E38)
            int r2 = r4.A02
            java.lang.String[] r0 = r4.A0U
            int r0 = r0.length
            boolean[] r6 = new boolean[r0]
            r1 = 0
        L_0x03aa:
            if (r2 == 0) goto L_0x03d8
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6[r1] = r0
            int r2 = r2 >> 1
            int r1 = r1 + 1
            goto L_0x03aa
        L_0x03b9:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            r5 = 4
            r3 = 2131894099(0x7f121f53, float:1.9422993E38)
            int r2 = r4.A01
            java.lang.String[] r0 = r4.A0U
            int r0 = r0.length
            boolean[] r6 = new boolean[r0]
            r1 = 0
        L_0x03c9:
            if (r2 == 0) goto L_0x03d8
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6[r1] = r0
            int r2 = r2 >> 1
            int r1 = r1 + 1
            goto L_0x03c9
        L_0x03d8:
            com.whatsapp.settings.MultiSelectionDialogFragment r0 = com.whatsapp.settings.MultiSelectionDialogFragment.A03(r6, r5, r3)
            r4.Btm(r0)
            return
        L_0x03e0:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            X.3PN r8 = r4.A0G
            X.2o8 r9 = X.C51632o8.VIDEO
            r6 = 5
            goto L_0x03fe
        L_0x03ea:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            X.3PN r8 = r4.A0G
            X.2o8 r9 = X.C51632o8.PHOTO
            r6 = 6
            goto L_0x03fe
        L_0x03f4:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r4 = (com.whatsapp.settings.SettingsDataUsageActivity) r4
            X.3PN r8 = r4.A0G
            X.2o8 r9 = X.C51632o8.ORIGINAL
            r6 = 8
        L_0x03fe:
            r11 = 0
            int r7 = r9.ordinal()
            r3 = 0
            if (r7 == r11) goto L_0x0492
            r2 = 1
            r1 = 2131894307(0x7f122023, float:1.9423415E38)
            r0 = 2131894308(0x7f122024, float:1.9423417E38)
            if (r7 == r2) goto L_0x0498
            r2 = 2131894220(0x7f121fcc, float:1.9423239E38)
            r1 = 2131897005(0x7f122aad, float:1.9428887E38)
            r0 = 2131896986(0x7f122a9a, float:1.9428849E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.3JP r5 = new X.3JP
            r5.<init>(r0, r2, r1)
        L_0x0421:
            int r16 = X.AnonymousClass3PN.A00(r8, r9)
            if (r7 == r11) goto L_0x049e
            r0 = 1
            if (r7 == r0) goto L_0x049e
            X.0ts r1 = r8.A01
            int[] r0 = X.C56752wp.A01
            java.lang.String[] r14 = r1.A0Q(r0)
            int[] r0 = X.C56752wp.A00
            java.lang.String[] r13 = r1.A0Q(r0)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131102763(0x7f060c2b, float:1.7817973E38)
            int r0 = X.C015006m.A00(r3, r2, r1)
            X.1m7 r12 = new X.1m7
            r12.<init>(r2, r0)
            r1 = 16
            r0 = 1
            android.text.style.AbsoluteSizeSpan r10 = new android.text.style.AbsoluteSizeSpan
            r10.<init>(r1, r0)
            int r1 = r14.length
            int r0 = r13.length
            int r9 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r8 = X.C36441kJ.A14(r9)
            r7 = 0
        L_0x045b:
            if (r7 >= r9) goto L_0x04aa
            r15 = r14[r7]
            r2 = r13[r7]
            X.AnonymousClass00C.A0B(r15)
            X.AnonymousClass00C.A0B(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r15)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r2, r1)
            android.text.SpannableString r3 = X.C36441kJ.A0O(r0)
            int r2 = r15.length()
            int r15 = r2 + 1
            int r1 = r0.length()
            r0 = 33
            r3.setSpan(r12, r15, r1, r0)
            r0 = 17
            r3.setSpan(r10, r11, r2, r0)
            r8.add(r3)
            int r7 = r7 + 1
            goto L_0x045b
        L_0x0492:
            r1 = 2131894232(0x7f121fd8, float:1.9423263E38)
            r0 = 2131894233(0x7f121fd9, float:1.9423265E38)
        L_0x0498:
            X.3JP r5 = new X.3JP
            r5.<init>(r3, r1, r0)
            goto L_0x0421
        L_0x049e:
            X.0ts r1 = r8.A01
            int[] r0 = X.C56752wp.A02
            java.lang.String[] r0 = r1.A0Q(r0)
            java.util.List r8 = X.AnonymousClass02R.A0D(r0)
        L_0x04aa:
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r11]
            java.lang.Object[] r1 = r8.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            r0 = 3
            X.AnonymousClass00C.A0D(r1, r0)
            int r3 = r5.A01
            r0 = r16
            android.os.Bundle r2 = com.whatsapp.SingleSelectionDialogFragment.A03(r1, r6, r0, r3)
            java.lang.Integer r0 = r5.A02
            if (r0 == 0) goto L_0x04cb
            int r1 = r0.intValue()
            java.lang.String r0 = "dialogPositiveButtonTextResId"
            r2.putInt(r0, r1)
        L_0x04cb:
            java.lang.String r0 = "customTitleId"
            r2.putInt(r0, r3)
            int r1 = r5.A00
            java.lang.String r0 = "customSubTitleId"
            r2.putInt(r0, r1)
            com.whatsapp.settings.MediaQualityConfirmationDialogFragment r0 = new com.whatsapp.settings.MediaQualityConfirmationDialogFragment
            r0.<init>()
            r0.A17(r2)
            r4.Btm(r0)
            return
        L_0x04e3:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsHelpV2 r3 = (com.whatsapp.settings.SettingsHelpV2) r3
            X.190 r0 = r3.A06
            if (r0 == 0) goto L_0x04f6
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity"
            goto L_0x0548
        L_0x04f6:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x04fb:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsHelpV2 r3 = (com.whatsapp.settings.SettingsHelpV2) r3
            X.1ft r2 = r3.A05
            if (r2 == 0) goto L_0x052f
            r0 = 20
            X.2Rx r1 = new X.2Rx
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.0yW r0 = r2.A00
            r0.Blv(r1)
            X.190 r0 = r3.A06
            if (r0 == 0) goto L_0x052a
            java.lang.String r2 = "com.bloks.www.csf.whatsapp.gethelp.user"
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            X.C36421kH.A0l(r3, r1, r0, r2)
            X.1Dv r0 = r3.A01
            r0.A06(r3, r1)
            return
        L_0x052a:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x052f:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0536:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsHelpV2 r3 = (com.whatsapp.settings.SettingsHelpV2) r3
            X.190 r0 = r3.A06
            if (r0 == 0) goto L_0x054f
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.About"
        L_0x0548:
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x054f:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0554:
            java.lang.Object r2 = r1.A00
            X.155 r2 = (X.AnonymousClass155) r2
            X.1N3 r1 = r2.A04
            java.lang.String r0 = "https://www.whatsapp.com/legal/"
            android.net.Uri r0 = r1.A00(r0)
            X.C36371kC.A1A(r0, r2)
            return
        L_0x0564:
            java.lang.Object r2 = r1.A00
            X.14u r2 = (X.C225314u) r2
            com.whatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog r1 = new com.whatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            r1.A17(r0)
            r2.Btm(r1)
            return
        L_0x0578:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsNotifications r5 = (com.whatsapp.settings.SettingsNotifications) r5
            int r4 = r5.A06
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2130903073(0x7f030021, float:1.7412954E38)
            java.lang.String[] r3 = r1.getStringArray(r0)
            r2 = 9
            r0 = 2131897002(0x7f122aaa, float:1.9428881E38)
            goto L_0x05e7
        L_0x058f:
            java.lang.Object r5 = r1.A00
            X.14u r5 = (X.C225314u) r5
            java.lang.String r4 = "26000003"
            r3 = 0
            r2 = 2131893164(0x7f121bac, float:1.9421097E38)
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "message_string_res_id"
            r1.putInt(r0, r2)
            java.lang.String r0 = "faq_id"
            r1.putString(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x05b2
            java.lang.String r0 = "faq_section_name"
            r1.putString(r0, r3)
        L_0x05b2:
            com.whatsapp.dialogs.FAQLearnMoreDialogFragment r0 = new com.whatsapp.dialogs.FAQLearnMoreDialogFragment
            r0.<init>()
            r0.A17(r1)
            r5.Btm(r0)
            return
        L_0x05be:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A05
            r2 = 10
            r1 = 2131896995(0x7f122aa3, float:1.9428867E38)
            r0 = 2130903067(0x7f03001b, float:1.7412942E38)
        L_0x05cc:
            com.whatsapp.SingleSelectionDialogFragment r0 = com.whatsapp.SingleSelectionDialogFragment.A06(r2, r1, r3, r0)
            r4.Btm(r0)
            return
        L_0x05d4:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsNotifications r5 = (com.whatsapp.settings.SettingsNotifications) r5
            int r4 = r5.A04
            X.0ts r1 = r5.A00
            int[] r0 = com.whatsapp.settings.SettingsNotifications.A0r
            java.lang.String[] r3 = r1.A0Q(r0)
            r2 = 11
            r0 = 2131896993(0x7f122aa1, float:1.9428863E38)
        L_0x05e7:
            com.whatsapp.SingleSelectionDialogFragment r1 = new com.whatsapp.SingleSelectionDialogFragment
            r1.<init>()
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A05(r3, r2, r4, r0)
            r1.A17(r0)
            r5.Btm(r1)
            return
        L_0x05f7:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0D
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0D
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r1.equals(r0)
            r2.A0M = r1
            X.1CR r0 = r2.A0F
            r0.A0g(r1)
            return
        L_0x0618:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x061f:
            java.lang.String r0 = "privacySettingManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0626:
            java.lang.String r0 = "privacySettingManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y7.onClick(android.view.View):void");
    }
}
