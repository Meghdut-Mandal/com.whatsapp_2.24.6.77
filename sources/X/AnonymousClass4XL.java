package X;

import android.content.DialogInterface;

/* renamed from: X.4XL  reason: invalid class name */
public class AnonymousClass4XL implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static AnonymousClass4XL A00(Object obj, int i) {
        return new AnonymousClass4XL(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0280, code lost:
        r3 = X.C36331k8.A0G(r4.A0Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0286, code lost:
        if (r5 == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r1 = r4.A0W.A03(r4.A0Q, r3, r5);
        r0 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0293, code lost:
        if (r5 == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0295, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0297, code lost:
        r4.startActivityForResult(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a5, code lost:
        if (r4.A0W.A00.A0E(913) == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a7, code lost:
        r4.A0W.A05(r4.getSupportFragmentManager(), r4.A0Q, r3);
        r4.getSupportFragmentManager().A0l(new X.AnonymousClass3RF(r4, 0), r4, "request_bottom_sheet_fragment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c1, code lost:
        r4.A0V.A03(r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c9, code lost:
        com.whatsapp.util.Log.w("calllog/opt system contact list could not found", r1);
        X.AnonymousClass3SJ.A01(r4, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033c, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03d9, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r1.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0263, code lost:
        r1.A1C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0266, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            r2 = r17
            r3 = r18
            switch(r0) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00b4;
                case 3: goto L_0x0032;
                case 4: goto L_0x00bc;
                case 5: goto L_0x0047;
                case 6: goto L_0x00c4;
                case 7: goto L_0x0013;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00d3;
                case 10: goto L_0x00da;
                case 11: goto L_0x00ed;
                case 12: goto L_0x00f8;
                case 13: goto L_0x0140;
                case 14: goto L_0x017a;
                case 15: goto L_0x01b4;
                case 16: goto L_0x01b4;
                case 17: goto L_0x01db;
                case 18: goto L_0x01f2;
                case 19: goto L_0x0200;
                case 20: goto L_0x0208;
                case 21: goto L_0x020f;
                case 22: goto L_0x00b4;
                case 23: goto L_0x0237;
                case 24: goto L_0x0241;
                case 25: goto L_0x00b4;
                case 26: goto L_0x0253;
                case 27: goto L_0x026e;
                case 28: goto L_0x0277;
                case 29: goto L_0x00cc;
                case 30: goto L_0x0055;
                case 31: goto L_0x02d3;
                case 32: goto L_0x02ec;
                case 33: goto L_0x02fd;
                case 34: goto L_0x0303;
                case 35: goto L_0x0337;
                case 36: goto L_0x0063;
                case 37: goto L_0x000b;
                case 38: goto L_0x0340;
                case 39: goto L_0x0353;
                case 40: goto L_0x036b;
                case 41: goto L_0x0383;
                case 42: goto L_0x039a;
                case 43: goto L_0x03b5;
                case 44: goto L_0x001f;
                case 45: goto L_0x0401;
                case 46: goto L_0x000b;
                case 47: goto L_0x007c;
                case 48: goto L_0x000b;
                case 49: goto L_0x0414;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.whatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.4Tf r0 = r1.A04
            if (r0 == 0) goto L_0x005f
            r0.BVf()
            goto L_0x005f
        L_0x001f:
            java.lang.Object r1 = r1.A00
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r1 = (com.whatsapp.community.CommunityConfirmLinkDialogFragment) r1
            X.4Sy r0 = r1.A00
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "onConfirmLinkSubgroupListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002e:
            r0.BT0()
            goto L_0x005f
        L_0x0032:
            java.lang.Object r1 = r1.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.String r0 = "invitelink/revoke/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r0 = r1.A0h()
            X.4P3 r0 = (X.AnonymousClass4P3) r0
            if (r0 == 0) goto L_0x0012
            r0.Bop()
            return
        L_0x0047:
            java.lang.Object r1 = r1.A00
            com.whatsapp.SingleSelectionDialogFragment r1 = (com.whatsapp.SingleSelectionDialogFragment) r1
            r1.A00 = r3
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0012
            com.whatsapp.SingleSelectionDialogFragment.A07(r1)
            return
        L_0x0055:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x0012
        L_0x005f:
            r1.A1b()
            return
        L_0x0063:
            java.lang.Object r1 = r1.A00
            com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r1 = (com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment) r1
            if (r18 == 0) goto L_0x0074
            r0 = 1
            if (r3 != r0) goto L_0x0012
            X.4Sv r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            r0.BkU()
            return
        L_0x0074:
            X.4Sv r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            r0.BkS()
            return
        L_0x007c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            android.content.Context r5 = r0.A1D()
            if (r5 == 0) goto L_0x0012
            X.1Dv r4 = r0.A00
            X.147 r3 = r0.A04
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid"
            r2.putExtra(r0, r1)
            r4.A06(r5, r2)
            return
        L_0x00a4:
            java.lang.Object r0 = r1.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.C36341k9.A15(r0)
            return
        L_0x00ac:
            java.lang.Object r0 = r1.A00
            X.4Se r0 = (X.C88304Se) r0
            r0.BeZ()
            return
        L_0x00b4:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x00bc:
            java.lang.Object r0 = r1.A00
            X.4P4 r0 = (X.AnonymousClass4P4) r0
            r0.BeZ()
            return
        L_0x00c4:
            java.lang.Object r0 = r1.A00
            com.whatsapp.SingleSelectionDialogFragment r0 = (com.whatsapp.SingleSelectionDialogFragment) r0
            com.whatsapp.SingleSelectionDialogFragment.A07(r0)
            return
        L_0x00cc:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            goto L_0x033c
        L_0x00d3:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            goto L_0x033c
        L_0x00da:
            java.lang.Object r1 = r1.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.String r0 = "delete-account-feedback/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r0 = r1.A0h()
            android.content.Intent r0 = X.AnonymousClass190.A01(r0)
            goto L_0x0263
        L_0x00ed:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r2.dismiss()
            r0.finish()
            return
        L_0x00f8:
            java.lang.Object r1 = r1.A00
            X.3BA r1 = (X.AnonymousClass3BA) r1
            X.0yW r10 = r1.A05
            X.1DW r9 = r1.A04
            X.17V r11 = r1.A06
            java.util.Set r14 = r1.A0C
            X.1AW r12 = r1.A09
            X.1EO r13 = r1.A0A
            X.3O0 r7 = r1.A08
            X.1X4 r8 = r1.A03
            X.4Ow r6 = r1.A02
            X.4Se r5 = r1.A01
            X.11F r4 = r1.A07
            boolean r0 = r1.A0D
            java.lang.Integer r3 = r1.A0B
            int r1 = r1.A00
            r15 = 1
            X.AnonymousClass3SH.A02(r9, r10, r11, r12, r13, r14, r15)
            r8.A0d(r14, r0)
            r8 = 4
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0132
            int r0 = r7.A00
            if (r0 != r8) goto L_0x0132
            r0 = 5
            r7.A00 = r0
            r0 = 2
            if (r1 < r15) goto L_0x012f
            r0 = 4
        L_0x012f:
            X.AnonymousClass3O0.A00(r7, r0)
        L_0x0132:
            r6.BVJ()
            if (r3 == 0) goto L_0x03d9
            int r0 = r3.intValue()
            r5.Bgh(r4, r0)
            goto L_0x03d9
        L_0x0140:
            java.lang.Object r5 = r1.A00
            com.whatsapp.audiopicker.AudioPickerActivity r5 = (com.whatsapp.audiopicker.AudioPickerActivity) r5
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.LinkedHashMap r0 = r5.A0L
            java.util.Iterator r3 = X.C36391kE.A10(r0)
        L_0x014e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r3.next()
            X.3Ac r0 = (X.C60983Ac) r0
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            int r0 = r0.A06
            long r0 = (long) r0
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)
            r4.add(r0)
            goto L_0x014e
        L_0x0167:
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "result_uris"
            r1.putParcelableArrayListExtra(r0, r4)
            X.C36331k8.A0o(r5, r1)
            X.3Qc r1 = r5.A09
            r0 = 7
            r1.A03(r0)
            return
        L_0x017a:
            java.lang.Object r6 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r6 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r6
            r0 = 4
            r6.A00 = r0
            X.1Uz r2 = r6.A06
            android.content.SharedPreferences r0 = X.C29011Uz.A00(r2)
            java.lang.String r5 = "two_factor_auth_nag_interval"
            int r1 = X.C36371kC.A01(r0, r5)
            r0 = 2
            int r4 = java.lang.Math.max(r1, r0)
            android.content.SharedPreferences r0 = X.C29011Uz.A00(r2)
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.0wo r0 = r2.A05
            long r1 = X.C19970wo.A00(r0)
            java.lang.String r0 = "two_factor_auth_nag_time"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.putInt(r5, r4)
            java.lang.String r1 = "two_factor_auth_last_code_correctness"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A03(r6)
            return
        L_0x01b4:
            java.lang.Object r4 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            r0 = 1
            r4.A00 = r0
            X.17Y r2 = r4.A04
            r1 = 2131895111(0x7f122347, float:1.9425046E38)
            r0 = 0
            r2.A05(r0, r1)
            X.17Y r3 = r4.A04
            java.lang.Runnable r2 = r4.A09
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.A0I(r2, r0)
            X.1Uz r2 = r4.A06
            java.lang.String r0 = "TwoFactorAuthManager/disableTwoFactorAuth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = ""
            r0 = 0
            r2.A04(r1, r0)
            return
        L_0x01db:
            java.lang.Object r0 = r1.A00
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog) r0
            r2.dismiss()
            X.00T r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.1Rs r1 = r0.A08
            X.5Rr r0 = X.AnonymousClass5Rr.CLOSE_SCREEN
            r1.A0D(r0)
            return
        L_0x01f2:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.C36441kJ.A0I(r0)
            r1.startActivity(r0)
            return
        L_0x0200:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r0.A0T()
            return
        L_0x0208:
            java.lang.Object r0 = r1.A00
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r0 = (com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment) r0
            r0.A00 = r3
            return
        L_0x020f:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r3 = (com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment) r3
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r2 = new com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment
            r2.<init>()
            X.4PH r0 = r3.A00
            r2.A02 = r0
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0233
            X.01z r0 = r3.A0l()
            X.09Y r1 = new X.09Y
            r1.<init>(r0)
            java.lang.String r0 = "ProductReportReasonDialogFragment"
            r1.A0D(r2, r0)
            r1.A01()
        L_0x0233:
            r3.A1c()
            return
        L_0x0237:
            java.lang.Object r0 = r1.A00
            com.whatsapp.blocklist.UnblockDialogFragment r0 = (com.whatsapp.blocklist.UnblockDialogFragment) r0
            X.4PJ r0 = r0.A00
            r0.BwH()
            return
        L_0x0241:
            java.lang.Object r0 = r1.A00
            com.whatsapp.blockui.BlockConfirmationDialogFragment r0 = (com.whatsapp.blockui.BlockConfirmationDialogFragment) r0
            X.3PR r3 = r0.A06
            java.lang.String r2 = r0.A0A
            com.whatsapp.jid.UserJid r1 = r0.A08
            X.C36321k7.A0w(r2, r1)
            r0 = 2
            X.AnonymousClass3PR.A00(r3, r1, r2, r0)
            return
        L_0x0253:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.backwardcompat.BackwardCompatDialog r1 = (com.whatsapp.calling.backwardcompat.BackwardCompatDialog) r1
            X.1fu r0 = r1.A00
            if (r0 == 0) goto L_0x0267
            android.net.Uri r0 = r0.A00()
            android.content.Intent r0 = X.C36391kE.A0G(r0)
        L_0x0263:
            r1.A1C(r0)
            return
        L_0x0267:
            java.lang.String r0 = "upgrade"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x026e:
            java.lang.Object r4 = r1.A00
            com.whatsapp.calling.callhistory.CallLogActivity r4 = (com.whatsapp.calling.callhistory.CallLogActivity) r4
            r5 = 1
            X.AnonymousClass3SJ.A00(r4, r5)
            goto L_0x0280
        L_0x0277:
            java.lang.Object r4 = r1.A00
            com.whatsapp.calling.callhistory.CallLogActivity r4 = (com.whatsapp.calling.callhistory.CallLogActivity) r4
            r0 = 1
            X.AnonymousClass3SJ.A00(r4, r0)
            r5 = 0
        L_0x0280:
            X.141 r0 = r4.A0Q
            X.11F r3 = X.C36331k8.A0G(r0)
            if (r5 == 0) goto L_0x0289
            goto L_0x029b
        L_0x0289:
            X.1eE r1 = r4.A0W     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            X.141 r0 = r4.A0Q     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            android.content.Intent r1 = r1.A03(r0, r3, r5)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            r0 = 11
            if (r5 == 0) goto L_0x0297
            r0 = 10
        L_0x0297:
            r4.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            goto L_0x02c1
        L_0x029b:
            X.1eE r0 = r4.A0W     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            X.0yC r1 = r0.A00     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            r0 = 913(0x391, float:1.28E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            if (r0 == 0) goto L_0x0289
            X.1eE r2 = r4.A0W     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            X.01z r1 = r4.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            X.141 r0 = r4.A0Q     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            r2.A05(r1, r0, r3)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            X.01z r3 = r4.getSupportFragmentManager()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            java.lang.String r2 = "request_bottom_sheet_fragment"
            r1 = 0
            X.3RF r0 = new X.3RF     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            r0.<init>(r4, r1)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            r3.A0l(r0, r4, r2)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
        L_0x02c1:
            X.1dz r1 = r4.A0V     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            r0 = 1
            r1.A03(r5, r0)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x02c8 }
            return
        L_0x02c8:
            r1 = move-exception
            java.lang.String r0 = "calllog/opt system contact list could not found"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2
            X.AnonymousClass3SJ.A01(r4, r0)
            return
        L_0x02d3:
            java.lang.Object r1 = r1.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r0 = r1.A0h()
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings activity is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x02e8:
            X.AnonymousClass3UJ.A06(r0)
            return
        L_0x02ec:
            java.lang.Object r2 = r1.A00
            com.whatsapp.chatinfo.ChatMediaVisibilityDialog r2 = (com.whatsapp.chatinfo.ChatMediaVisibilityDialog) r2
            r1 = 2
            r0 = 1
            if (r3 == r0) goto L_0x02f7
            if (r3 == r1) goto L_0x02fa
            r1 = 0
        L_0x02f7:
            r2.A01 = r1
            return
        L_0x02fa:
            r2.A01 = r0
            return
        L_0x02fd:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            goto L_0x033c
        L_0x0303:
            java.lang.Object r6 = r1.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r6 = (com.whatsapp.chatinfo.ListChatInfoActivity) r6
            r0 = 6
            X.AnonymousClass3SJ.A00(r6, r0)
            X.141 r5 = r6.A0L
            X.3Ty r4 = r6.A0Q
            X.8dx r3 = r6.A3t()
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = X.C36381kD.A0e(r5, r0)
            r1 = 0
            boolean r0 = X.C36341k9.A1a(r3, r2)
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r0[r1] = r2
            java.util.ArrayList r1 = X.AnonymousClass03T.A03(r0)
            X.0xQ r0 = r4.A0A
            r0.A0a(r3, r1)
            java.util.ArrayList r0 = r6.A0h
            r0.remove(r5)
            com.whatsapp.chatinfo.ListChatInfoActivity.A0y(r6)
            com.whatsapp.chatinfo.ListChatInfoActivity.A12(r6)
            return
        L_0x0337:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
        L_0x033c:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0340:
            java.lang.Object r4 = r1.A00
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r4 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r4
            r3 = 1
            X.3Kr r1 = r4.A3j()
            X.4Lr r0 = new X.4Lr
            r0.<init>(r4, r3)
            r1.A02(r0)
            goto L_0x03d9
        L_0x0353:
            java.lang.Object r4 = r1.A00
            com.whatsapp.chatlock.ChatLockPrivacySettingsActivity r4 = (com.whatsapp.chatlock.ChatLockPrivacySettingsActivity) r4
            X.18z r3 = r4.A01
            if (r3 == 0) goto L_0x0364
            X.2EP r2 = X.AnonymousClass2EP.A00
            X.3MH r1 = r4.A05
            r0 = 5
            r3.A0A(r4, r2, r1, r0)
            return
        L_0x0364:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x036b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.chatlock.ChatLockSettingsActivity r1 = (com.whatsapp.chatlock.ChatLockSettingsActivity) r1
            r0 = 0
            com.whatsapp.chatlock.ChatLockSettingsActivity.A07(r1, r0)
            r1.A3i()
            android.view.View r3 = r1.A00
            android.content.res.Resources r1 = X.C36391kE.A0I(r1, r3)
            r0 = 2131895095(0x7f122337, float:1.9425013E38)
            X.C235718z.A01(r1, r3, r0)
            goto L_0x03d9
        L_0x0383:
            java.lang.Object r4 = r1.A00
            com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog r4 = (com.whatsapp.chatlock.dialogs.ChatLockForgotSecretCodeUnlockClearDialog) r4
            int r1 = r4.A00
            android.content.DialogInterface$OnClickListener r0 = r4.A01
            com.whatsapp.chatlock.dialogs.ChatLockConfirmUnlockClearDialog r3 = new com.whatsapp.chatlock.dialogs.ChatLockConfirmUnlockClearDialog
            r3.<init>(r0, r1)
            X.01z r1 = r4.A0l()
            java.lang.String r0 = "continue"
            r3.A1i(r1, r0)
            goto L_0x03d9
        L_0x039a:
            java.lang.Object r3 = r1.A00
            com.whatsapp.community.CommunityAdminDialogFragment r3 = (com.whatsapp.community.CommunityAdminDialogFragment) r3
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            com.whatsapp.jid.UserJid r1 = r3.A02
            if (r1 == 0) goto L_0x03d9
            X.30m r0 = r3.A01
            if (r0 != 0) goto L_0x03b1
            java.lang.String r0 = "callback"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03b1:
            X.C586430m.A00(r3, r0, r1)
            goto L_0x03d9
        L_0x03b5:
            java.lang.Object r3 = r1.A00
            com.whatsapp.community.CommunityAdminDialogFragment r3 = (com.whatsapp.community.CommunityAdminDialogFragment) r3
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            com.whatsapp.jid.UserJid r4 = r3.A02
            if (r4 == 0) goto L_0x03d9
            X.30m r1 = r3.A01
            if (r1 != 0) goto L_0x03cc
            java.lang.String r0 = "callback"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03cc:
            int r3 = r3.A00
            if (r3 == r0) goto L_0x03ef
            r0 = 2
            if (r3 == r0) goto L_0x03ef
            r0 = 3
            if (r3 == r0) goto L_0x03dd
            r0 = 4
            if (r3 == r0) goto L_0x03dd
        L_0x03d9:
            r2.dismiss()
            return
        L_0x03dd:
            X.3Eh r0 = r1.A00
            X.00T r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.3KY r1 = (X.AnonymousClass3KY) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A01(r4, r0)
            goto L_0x03d9
        L_0x03ef:
            X.3Eh r0 = r1.A00
            X.00T r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            X.3KY r1 = (X.AnonymousClass3KY) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00(r4, r0)
            goto L_0x03d9
        L_0x0401:
            java.lang.Object r0 = r1.A00
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r0 = (com.whatsapp.community.CommunityConfirmLinkDialogFragment) r0
            X.4Sy r0 = r0.A00
            if (r0 != 0) goto L_0x0410
            java.lang.String r0 = "onConfirmLinkSubgroupListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0410:
            r0.BUG()
            return
        L_0x0414:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1O(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XL.onClick(android.content.DialogInterface, int):void");
    }
}
