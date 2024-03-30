package X;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog$Builder;

/* renamed from: X.4XQ  reason: invalid class name */
public class AnonymousClass4XQ implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AlertDialog$Builder alertDialog$Builder, Object obj, int i, int i2) {
        alertDialog$Builder.setPositiveButton(i2, new AnonymousClass4XQ(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x018a, code lost:
        r4 = r1.A01.A0r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018e, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0190, code lost:
        r4.A1E.execute(new X.AnonymousClass752(r4, r1.A00, 14, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x019e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a5, code lost:
        r2.Boy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x039f, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03cd, code lost:
        r3.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0420, code lost:
        r1.BeD(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0423, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r12, int r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x019f;
                case 2: goto L_0x01ee;
                case 3: goto L_0x0038;
                case 4: goto L_0x00e0;
                case 5: goto L_0x020d;
                case 6: goto L_0x0258;
                case 7: goto L_0x025e;
                case 8: goto L_0x026e;
                case 9: goto L_0x02a9;
                case 10: goto L_0x02a9;
                case 11: goto L_0x02b1;
                case 12: goto L_0x02cf;
                case 13: goto L_0x00f0;
                case 14: goto L_0x02d6;
                case 15: goto L_0x02fb;
                case 16: goto L_0x034f;
                case 17: goto L_0x034f;
                case 18: goto L_0x0110;
                case 19: goto L_0x0359;
                case 20: goto L_0x0359;
                case 21: goto L_0x0005;
                case 22: goto L_0x0122;
                case 23: goto L_0x0005;
                case 24: goto L_0x014e;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x017b;
                case 29: goto L_0x0183;
                case 30: goto L_0x0363;
                case 31: goto L_0x0392;
                case 32: goto L_0x0399;
                case 33: goto L_0x03a3;
                case 34: goto L_0x03d1;
                case 35: goto L_0x03eb;
                case 36: goto L_0x0424;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x0012
            r1.A1c()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r4 = r11.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.DiscardChangesConfirmationDialogFragment) r4
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0012
            X.3XT r0 = r4.A01
            boolean r0 = r0.A03
            X.1UZ r3 = r4.A03
            java.lang.Boolean r2 = X.C36441kJ.A0x(r0)
            java.lang.String r0 = "initial_auto_setting"
            r3.A02(r2, r0)
            r1 = 1
            java.lang.String r0 = "final_auto_setting"
            r3.A02(r2, r0)
            java.lang.String r0 = "TAP_CHANGES_DISCARD"
            r3.A03(r0)
            r4.A00 = r1
            return
        L_0x0038:
            java.lang.Object r3 = r11.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r3 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r3
            X.3QU r0 = r3.A0M
            if (r0 == 0) goto L_0x0012
            X.6c4 r0 = r3.A0I
            if (r0 == 0) goto L_0x0012
            X.0wQ r0 = r3.A07
            boolean r0 = r0.A0L()
            r2 = 28
            if (r0 != 0) goto L_0x0064
            X.0yC r1 = r3.A02
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0064
            X.3QU r1 = r3.A0M
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0064
            boolean r0 = r1.A0C
            com.whatsapp.stickers.info.StickerInfoDialogFragment.A06(r3, r2, r0)
            return
        L_0x0064:
            boolean r0 = X.AnonymousClass3H7.A00(r3)
            if (r0 != 0) goto L_0x007e
            X.3Kn r1 = r3.A08
            X.3QU r0 = r3.A0M
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x007e
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x007e
            X.1YD r0 = r3.A0N
            r0.A00()
            return
        L_0x007e:
            boolean r0 = X.AnonymousClass3H7.A00(r3)
            if (r0 != 0) goto L_0x00a6
            X.3QU r0 = r3.A0M
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "Giphy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a6
            X.0yC r1 = r3.A02
            r0 = 6471(0x1947, float:9.068E-42)
            boolean r0 = X.AnonymousClass1Ax.A03(r1, r0)
            if (r0 == 0) goto L_0x00a6
            X.3QU r0 = r3.A0M
            java.lang.String r1 = r0.A01
            X.1YD r0 = r3.A0N
            r0.A01(r1)
            return
        L_0x00a6:
            X.3QU r1 = r3.A0M
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x00c8
            X.01I r0 = r3.A0i()
            boolean r0 = r0 instanceof X.AnonymousClass4V7
            if (r0 == 0) goto L_0x049e
            boolean r0 = X.AnonymousClass3H7.A00(r3)
            if (r0 != 0) goto L_0x049e
            X.1YD r1 = r3.A0N
            X.3QU r0 = r3.A0M
            java.lang.String r0 = r0.A00
            r1.A03(r0, r2)
            return
        L_0x00c8:
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x00ce
            goto L_0x0483
        L_0x00ce:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x00d8
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x0012
            goto L_0x04a2
        L_0x00d8:
            X.6c4 r0 = r3.A0I
            if (r0 == 0) goto L_0x0012
            com.whatsapp.stickers.info.StickerInfoDialogFragment.A05(r0, r1, r3)
            return
        L_0x00e0:
            java.lang.Object r2 = r11.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r2 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r2
            X.3QU r1 = r2.A0M
            if (r1 == 0) goto L_0x0012
            X.6c4 r0 = r2.A0I
            if (r0 == 0) goto L_0x0012
            com.whatsapp.stickers.info.StickerInfoDialogFragment.A05(r0, r1, r2)
            return
        L_0x00f0:
            java.lang.Object r1 = r11.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            r0 = 1
            X.02E r1 = X.AnonymousClass02E.A02(r1, r0)
            com.whatsapp.twofactor.SetEmailFragment r1 = (com.whatsapp.twofactor.SetEmailFragment) r1
            java.lang.String r0 = "setemailfragment/do-skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.widget.EditText r0 = r1.A01
            if (r0 == 0) goto L_0x0107
            X.C36391kE.A1K(r0)
        L_0x0107:
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r1.A05
            if (r1 == 0) goto L_0x0012
            r0 = 0
            r1.A3k(r0)
            return
        L_0x0110:
            java.lang.Object r0 = r11.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r1 = r0.A0i()
            boolean r0 = r1 instanceof X.C160737lV
            if (r0 == 0) goto L_0x0012
            X.7lV r1 = (X.C160737lV) r1
            r1.finish()
            return
        L_0x0122:
            java.lang.Object r4 = r11.A00
            com.whatsapp.voipcalling.WASecuredDialogFragment r4 = (com.whatsapp.voipcalling.WASecuredDialogFragment) r4
            X.0xT r1 = r4.A01
            java.lang.String r0 = "26000103"
            android.net.Uri r3 = r1.A02(r0)
            android.content.Context r0 = r4.A1D()
            if (r0 == 0) goto L_0x0148
            X.1Du r2 = r4.A00
            android.content.Context r1 = r4.A1D()
            r0 = 0
            r2.Bp7(r1, r3, r0)
        L_0x013e:
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x0012
            r4.A1c()
            return
        L_0x0148:
            java.lang.String r0 = "Dialog detached from activity, null context"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x013e
        L_0x014e:
            java.lang.Object r3 = r11.A00
            com.whatsapp.voipcalling.dialogs.E2EEInfoDialogFragment r3 = (com.whatsapp.voipcalling.dialogs.E2EEInfoDialogFragment) r3
            X.1eC r2 = r3.A02
            if (r2 == 0) goto L_0x04be
            int r1 = r3.A00
            r0 = 2
            r2.A00(r1, r0)
            X.0xT r1 = r3.A03
            if (r1 == 0) goto L_0x04b7
            java.lang.String r0 = "28030015"
            android.content.Intent r2 = X.C36341k9.A0D(r1, r0)
            X.1Dv r1 = r3.A01
            if (r1 == 0) goto L_0x04b0
            android.content.Context r0 = r3.A0a()
            r1.A06(r0, r2)
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0012
            r3.A1c()
            return
        L_0x017b:
            java.lang.Object r1 = r11.A00
            X.3XA r1 = (X.AnonymousClass3XA) r1
            if (r1 == 0) goto L_0x0012
            r5 = 1
            goto L_0x018a
        L_0x0183:
            java.lang.Object r1 = r11.A00
            X.3XA r1 = (X.AnonymousClass3XA) r1
            if (r1 == 0) goto L_0x0012
            r5 = 0
        L_0x018a:
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r1.A01
            X.6YM r4 = r0.A0r
            if (r4 == 0) goto L_0x0012
            com.whatsapp.jid.UserJid r3 = r1.A00
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r4.A1E
            r1 = 14
            X.752 r0 = new X.752
            r0.<init>(r4, r3, r1, r5)
            r2.execute(r0)
            return
        L_0x019f:
            java.lang.Object r3 = r11.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment$DiscardChangesConfirmationDialogFragment r3 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.DiscardChangesConfirmationDialogFragment) r3
            java.lang.ref.WeakReference r0 = r3.A04
            java.lang.Object r1 = r0.get()
            X.4Rs r1 = (X.C88184Rs) r1
            if (r1 == 0) goto L_0x01b2
            X.3XT r0 = r3.A01
            r1.BhY(r0)
        L_0x01b2:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x03cd
            X.3XT r0 = r3.A01
            boolean r4 = r0.A03
            X.1UZ r2 = r3.A03
            java.lang.Boolean r1 = X.C36441kJ.A0x(r4)
            java.lang.String r0 = "initial_auto_setting"
            r2.A02(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "final_auto_setting"
            r2.A02(r1, r0)
            java.lang.String r0 = "TAP_CHANGES_SAVE"
            r2.A04(r0)
            r2.A01()
            X.0yC r2 = r3.A02
            X.0yV r1 = X.C21000yV.A01
            r0 = 5584(0x15d0, float:7.825E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x01e9
            X.1UM r1 = r3.A02
            X.1US r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0J
            r1.A05(r0, r4)
        L_0x01e9:
            r0 = 1
            r3.A00 = r0
            goto L_0x03cd
        L_0x01ee:
            java.lang.Object r0 = r11.A00
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r0 = (com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment) r0
            X.1AP r4 = r0.A01
            if (r4 == 0) goto L_0x0206
            X.6c4 r0 = r0.A00
            java.util.Set r3 = X.C36411kG.A15(r0)
            X.0wU r2 = r4.A0N
            r0 = 7
            X.1jE r1 = new X.1jE
            r1.<init>(r4, r3, r0)
            goto L_0x02a5
        L_0x0206:
            java.lang.String r0 = "stickerRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x020d:
            java.lang.Object r3 = r11.A00
            X.02E r3 = (X.AnonymousClass02E) r3
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x024e
            java.lang.String r2 = "com.samsung.android.lool"
            android.content.Context r0 = r3.A1D()     // Catch:{ NameNotFoundException -> 0x024e }
            if (r0 == 0) goto L_0x024e
            android.content.Context r0 = r3.A1D()     // Catch:{ NameNotFoundException -> 0x024e }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x024e }
            if (r0 == 0) goto L_0x024e
            android.content.Context r0 = r3.A1D()     // Catch:{ NameNotFoundException -> 0x024e }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x024e }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x024e }
            if (r0 == 0) goto L_0x024e
            android.content.Intent r0 = X.C36431kI.A0C()     // Catch:{ ActivityNotFoundException -> 0x0249 }
            android.content.Intent r0 = r0.setPackage(r2)     // Catch:{ ActivityNotFoundException -> 0x0249 }
            r3.A1C(r0)     // Catch:{ ActivityNotFoundException -> 0x0249 }
            return
        L_0x0249:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch com.samsung.android.lool"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x024e:
            java.lang.String r0 = "android.intent.action.POWER_USAGE_SUMMARY"
            android.content.Intent r0 = X.C36441kJ.A0I(r0)     // Catch:{ ActivityNotFoundException -> 0x0498 }
            r3.A1C(r0)     // Catch:{ ActivityNotFoundException -> 0x0498 }
            return
        L_0x0258:
            java.lang.Object r0 = r11.A00
            X.C36431kI.A1N(r0)
            return
        L_0x025e:
            java.lang.Object r0 = r11.A00
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r0 = (com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment) r0
            X.6O1 r3 = r0.A00
            r2 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            r3.A02(r1, r0, r2)
            return
        L_0x026e:
            java.lang.Object r4 = r11.A00
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r4 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r4
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0296
            java.util.Collection r1 = r4.A03
        L_0x0278:
            java.util.LinkedHashSet r3 = X.C36441kJ.A17()
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0299
            java.util.Iterator r2 = r1.iterator()
        L_0x0284:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x029c
            X.3T1 r1 = X.C36391kE.A0l(r2)
            boolean r0 = r1.A15
            if (r0 != 0) goto L_0x0284
            r3.add(r1)
            goto L_0x0284
        L_0x0296:
            java.util.Collection r1 = r4.A04
            goto L_0x0278
        L_0x0299:
            r3.addAll(r1)
        L_0x029c:
            X.0wU r2 = r4.A02
            r0 = 30
            X.3wd r1 = new X.3wd
            r1.<init>(r4, r3, r0)
        L_0x02a5:
            r2.Boy(r1)
            return
        L_0x02a9:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x02b1:
            java.lang.Object r0 = r11.A00
            com.whatsapp.twofactor.AddEmailActivity r0 = (com.whatsapp.twofactor.AddEmailActivity) r0
            X.9Pi r1 = r0.A03
            if (r1 == 0) goto L_0x02c8
            java.lang.String r2 = r0.A06
            int r4 = r0.A00
            r5 = 1
            r6 = 3
            r3 = 0
            r7 = 3
            r1.A00(r2, r3, r4, r5, r6, r7)
            r0.finish()
            return
        L_0x02c8:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02cf:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            goto L_0x039f
        L_0x02d6:
            java.lang.Object r0 = r11.A00
            X.01I r4 = X.C36441kJ.A0X(r0)
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            r0 = 2131895111(0x7f122347, float:1.9425046E38)
            r4.Bu1(r0)
            android.os.Handler r3 = r4.A0D
            java.lang.Runnable r2 = r4.A0E
            long r0 = X.C29011Uz.A0F
            r3.postDelayed(r2, r0)
            X.1Uz r2 = r4.A0A
            java.lang.String r0 = "TwoFactorAuthManager/disableTwoFactorAuth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = ""
            r0 = 0
            r2.A04(r1, r0)
            return
        L_0x02fb:
            java.lang.Object r3 = r11.A00
            com.whatsapp.userban.ui.fragment.BanAppealBaseFragment r3 = (com.whatsapp.userban.ui.fragment.BanAppealBaseFragment) r3
            java.lang.String r0 = "BanAppealBaseFragment/showRemoveAccountDialog/remove current account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Dv r2 = r3.A00
            if (r2 == 0) goto L_0x0348
            X.01I r1 = r3.A0i()
            r5 = 0
            X.01I r4 = r3.A0i()
            X.0v0 r0 = r3.A03
            if (r0 == 0) goto L_0x0341
            int r7 = r0.A0I()
            X.0wo r0 = r3.A02
            if (r0 == 0) goto L_0x033a
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.0wh r0 = r3.A04
            if (r0 == 0) goto L_0x0333
            java.lang.String r6 = r0.A01()
            r8 = 16
            android.content.Intent r0 = X.AnonymousClass190.A1G(r4, r5, r6, r7, r8, r9)
            r2.A06(r1, r0)
            return
        L_0x0333:
            java.lang.String r0 = "waStartupSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x033a:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0341:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0348:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x034f:
            java.lang.Object r0 = r11.A00
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = (com.whatsapp.voipcalling.VoipErrorDialogFragment) r0
            X.3FU r0 = r0.A02
            r0.A01(r12)
            return
        L_0x0359:
            java.lang.Object r0 = r11.A00
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = (com.whatsapp.voipcalling.VoipErrorDialogFragment) r0
            X.3FU r0 = r0.A02
            r0.A00()
            return
        L_0x0363:
            java.lang.Object r3 = r11.A00
            com.whatsapp.voipcalling.dialogs.SwitchConfirmationFragment r3 = (com.whatsapp.voipcalling.dialogs.SwitchConfirmationFragment) r3
            X.0v0 r0 = r3.A00
            if (r0 == 0) goto L_0x038b
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r2 = "switch_to_video_call_confirmation_dialog_count"
            int r0 = X.C36371kC.A01(r0, r2)
            X.0v0 r1 = r3.A00
            if (r1 == 0) goto L_0x0384
            int r0 = r0 + 1
            X.C36321k7.A0q(r1, r2, r0)
            X.4SU r0 = r3.A01
            r0.BxA()
            return
        L_0x0384:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x038b:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0392:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            goto L_0x039f
        L_0x0399:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 27
        L_0x039f:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x03a3:
            java.lang.Object r3 = r11.A00
            com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment r3 = (com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment) r3
            X.37e r0 = r3.A00
            X.3Oy r1 = r0.A01
            X.005 r0 = r1.A04
            java.lang.Object r2 = r0.get()
            X.1UZ r2 = (X.AnonymousClass1UZ) r2
            X.005 r0 = r1.A01
            X.1UM r1 = X.C36431kI.A10(r0)
            X.1US r0 = X.C64663Oy.A05
            boolean r0 = r1.A06(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_account_linked"
            r2.A02(r1, r0)
            java.lang.String r0 = "TAP_NOT_NOW"
            r2.A03(r0)
        L_0x03cd:
            r3.A1b()
            return
        L_0x03d1:
            java.lang.Object r0 = r11.A00
            com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment) r0
            X.37e r2 = r0.A00
            X.3Oy r0 = r2.A01
            X.005 r0 = r0.A04
            java.lang.Object r1 = r0.get()
            X.1UZ r1 = (X.AnonymousClass1UZ) r1
            java.lang.String r0 = "TAP_SHARE_NOW"
            r1.A04(r0)
            X.4Tp r1 = r2.A00
            java.util.List r0 = r2.A02
            goto L_0x0420
        L_0x03eb:
            java.lang.Object r0 = r11.A00
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            X.38w r5 = r0.A02
            boolean r4 = r0.A01
            X.3Oy r2 = r5.A01
            X.005 r0 = r2.A01
            X.1UM r1 = X.C36431kI.A10(r0)
            X.1US r0 = X.C64663Oy.A05
            r1.A05(r0, r4)
            X.005 r3 = r2.A04
            java.lang.Object r2 = r3.get()
            X.1UZ r2 = (X.AnonymousClass1UZ) r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_auto_crosspost"
            r2.A02(r1, r0)
            java.lang.Object r1 = r3.get()
            X.1UZ r1 = (X.AnonymousClass1UZ) r1
            java.lang.String r0 = "TAP_SHARE_NOW"
            r1.A04(r0)
            X.4Tp r1 = r5.A00
            java.util.List r0 = r5.A03
        L_0x0420:
            r1.BeD(r0)
            return
        L_0x0424:
            java.lang.Object r0 = r11.A00
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            X.38w r1 = r0.A02
            X.3Oy r2 = r1.A01
            X.005 r0 = r2.A00
            java.lang.Object r4 = r0.get()
            X.6Uv r4 = (X.C132686Uv) r4
            java.lang.String r5 = r1.A02
            r7 = 0
            r6 = 2131888563(0x7f1209b3, float:1.9411765E38)
            r3 = 0
            r8 = 0
            X.C132686Uv.A01(r3, r4, r5, r6, r7, r8)
            X.005 r4 = r2.A04
            java.lang.Object r3 = r4.get()
            X.1UZ r3 = (X.AnonymousClass1UZ) r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_auto_crosspost"
            r3.A02(r1, r0)
            java.lang.Object r3 = r4.get()
            X.1UZ r3 = (X.AnonymousClass1UZ) r3
            X.005 r0 = r2.A01
            X.1UM r1 = X.C36431kI.A10(r0)
            X.1US r0 = X.C64663Oy.A05
            boolean r0 = r1.A06(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_account_linked"
            r3.A02(r1, r0)
            java.lang.Object r1 = r4.get()
            X.1UZ r1 = (X.AnonymousClass1UZ) r1
            java.lang.String r0 = "TAP_NOT_NOW"
            r1.A03(r0)
            X.005 r0 = r2.A02
            java.lang.Object r1 = r0.get()
            X.3Kt r1 = (X.C63623Kt) r1
            r0 = 1
            r1.A02(r0)
            return
        L_0x0483:
            X.1Dv r2 = r3.A05     // Catch:{ ActivityNotFoundException -> 0x0495 }
            android.content.Context r1 = r3.A0a()     // Catch:{ ActivityNotFoundException -> 0x0495 }
            X.3QU r0 = r3.A0M     // Catch:{ ActivityNotFoundException -> 0x0495 }
            java.lang.String r0 = r0.A03     // Catch:{ ActivityNotFoundException -> 0x0495 }
            android.content.Intent r0 = X.C36331k8.A04(r0)     // Catch:{ ActivityNotFoundException -> 0x0495 }
            r2.A06(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0495 }
            return
        L_0x0495:
            java.lang.String r0 = "StickerInfoDialogFragment/onClickListener failed to open plays tore link"
            goto L_0x049a
        L_0x0498:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch power usage"
        L_0x049a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x049e:
            X.3QU r0 = r3.A0M
            java.lang.String r2 = r0.A00
        L_0x04a2:
            android.content.Context r1 = r3.A0a()
            java.lang.String r0 = "info_dialog"
            android.content.Intent r0 = X.AnonymousClass190.A1D(r1, r2, r0)
            r3.A1C(r0)
            return
        L_0x04b0:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04b7:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04be:
            java.lang.String r0 = "privacyHighlightDailyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XQ.onClick(android.content.DialogInterface, int):void");
    }
}
