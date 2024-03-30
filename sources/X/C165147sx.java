package X;

/* renamed from: X.7sx  reason: invalid class name and case insensitive filesystem */
public class C165147sx implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public static String A00(C18820ts r9, long j) {
        C18740tg.A0C(C36401kF.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        long j2 = (j + 60000) - 1;
        long j3 = j2 / 3600000;
        if (j3 == 0) {
            return AnonymousClass3UY.A03(r9, (int) (j2 / 60000), 1);
        }
        return AnonymousClass3UY.A03(r9, (int) j3, 2);
    }

    public C165147sx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new C165147sx(r1, i));
    }

    public static void A02(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C165147sx(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0299, code lost:
        r2.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ce, code lost:
        r9 = null;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d4, code lost:
        if (com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r7) != false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d6, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("settings-gdrive/display-backup-error/");
        X.C36321k7.A1a(r1, X.C34191gb.A02(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e6, code lost:
        if (r6 == null) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e8, code lost:
        com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r7, r9, r6, 1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02eb, code lost:
        com.whatsapp.backup.google.SettingsGoogleDrive.A0K(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ee, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f5, code lost:
        if (r7.A09.A0C() == 0) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f7, code lost:
        com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r7, (java.lang.String) null, (java.lang.String) null, com.whatsapp.backup.google.SettingsGoogleDrive.A01(r7, false), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0347, code lost:
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034a, code lost:
        r2 = X.C36341k9.A0e(r7, new java.lang.Object[1], com.whatsapp.R.string.f12nameremoved, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0374, code lost:
        r0 = new X.C135426cg(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037d, code lost:
        r2 = r7.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0381, code lost:
        r0 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0383, code lost:
        r7.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0385, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0386, code lost:
        r9 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x038c, code lost:
        if (r3 == 10) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x038e, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("settings-gdrive/display-backup-error failed to display error ");
        r1.append(X.C34191gb.A02(r3));
        X.C36321k7.A1Z(r1, " since Activity is about to finish.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06d5, code lost:
        r0.setText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0753, code lost:
        r1.setChecked(X.C36361kB.A1a(r6, java.lang.Boolean.TRUE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x075c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x079d, code lost:
        X.C36321k7.A1S("settings-gdrive/get-backup-freq-index/", X.AnonymousClass000.A0u(), r3);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07a7, code lost:
        r0 = r5[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07a9, code lost:
        r4.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07b7, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07ba, code lost:
        r2.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07c0, code lost:
        r0.setText(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0103, code lost:
        r1.append(r0);
        X.C36321k7.A1Z(r1, X.C34191gb.A02(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0914, code lost:
        r0 = r3.A0n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0932, code lost:
        r3.A1c(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0935, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x093d, code lost:
        r3.A1c(r3.A0n(r0), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        if (com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r10) != false) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0944, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0948, code lost:
        r0 = r3.A0n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x094c, code lost:
        com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A05((android.content.DialogInterface.OnClickListener) null, r3, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x094f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0950, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("settings-gdrive/display-media-restore-error failed to display error ");
        r1.append(X.C34191gb.A02(r9));
        X.C36321k7.A1a(r1, " since Activity is about to finish.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0965, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
        X.C36321k7.A1a(X.AnonymousClass000.A0v("settings-gdrive/display-media-restore-error/"), X.C34191gb.A02(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0120, code lost:
        if (r3 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0122, code lost:
        com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r10, (java.lang.String) null, r3, 1, true);
        r0 = X.C36401kF.A0H(r10, com.whatsapp.R.id.banner_description);
        r0.setOnClickListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012f, code lost:
        if (r2 == null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0131, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r0.setClickable(r11);
        r0.setText(r3);
        X.C03570Gk.A0B(r10, com.whatsapp.R.id.close).setOnClickListener(r10.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0144, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01cc, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01cf, code lost:
        r3 = r10.getString(r0);
        r0 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01df, code lost:
        r2 = new X.C135426cg(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ec, code lost:
        if (r10.A09.A0C() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ee, code lost:
        com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r10, (java.lang.String) null, (java.lang.String) null, com.whatsapp.backup.google.SettingsGoogleDrive.A01(r10, false), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0261, code lost:
        r0.setClickable(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0264, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028e, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028f, code lost:
        if (r6 == r3) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0291, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0297, code lost:
        if (r2.getVisibility() == r1) goto L_?;
     */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x07eb  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0848  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x084c  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x085e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r17
            r1 = r16
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x0037;
                case 5: goto L_0x0524;
                case 6: goto L_0x063b;
                case 7: goto L_0x0656;
                case 8: goto L_0x0666;
                case 9: goto L_0x069a;
                case 10: goto L_0x052c;
                case 11: goto L_0x00d6;
                case 12: goto L_0x06ae;
                case 13: goto L_0x01f6;
                case 14: goto L_0x020b;
                case 15: goto L_0x023b;
                case 16: goto L_0x0244;
                case 17: goto L_0x0713;
                case 18: goto L_0x024d;
                case 19: goto L_0x0725;
                case 20: goto L_0x0739;
                case 21: goto L_0x0265;
                case 22: goto L_0x027d;
                case 23: goto L_0x0286;
                case 24: goto L_0x074d;
                case 25: goto L_0x029d;
                case 26: goto L_0x03a4;
                case 27: goto L_0x03b8;
                case 28: goto L_0x075d;
                case 29: goto L_0x0782;
                case 30: goto L_0x07ad;
                case 31: goto L_0x07c4;
                case 32: goto L_0x088a;
                case 33: goto L_0x0009;
                case 34: goto L_0x0009;
                case 35: goto L_0x0009;
                case 36: goto L_0x0009;
                case 37: goto L_0x0009;
                case 38: goto L_0x03ed;
                case 39: goto L_0x0416;
                case 40: goto L_0x04ac;
                case 41: goto L_0x0009;
                case 42: goto L_0x0009;
                case 43: goto L_0x04e3;
                case 44: goto L_0x089a;
                case 45: goto L_0x0009;
                case 46: goto L_0x0009;
                case 47: goto L_0x0009;
                case 48: goto L_0x0507;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36331k8.A1J(r0, r6)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r1.A00
            X.4vn r2 = (X.C100804vn) r2
            int r0 = X.AnonymousClass000.A0I(r6)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "VerifyMessageStoreActivity/messagestoreverified/missing-params bounce to regphone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.005 r0 = r2.A3i()
            java.lang.Object r1 = r0.get()
            X.1Ww r1 = (X.C29501Ww) r1
            r0 = 1
            X.C29501Ww.A02(r1, r0, r0)
            android.content.Intent r0 = X.AnonymousClass190.A0B(r2)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x0037:
            java.lang.Object r3 = r1.A00
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r3 = (com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r3
            int r4 = X.AnonymousClass000.A0I(r6)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A03
            X.00s r0 = r0.A08
            java.lang.Number r2 = X.C36441kJ.A0z(r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A03
            X.00s r0 = r0.A06
            java.lang.Object r0 = X.C90524aI.A0c(r0)
            int r9 = X.AnonymousClass000.A0I(r0)
            r10 = 0
            r1 = 2
            r8 = 0
            r7 = 0
            r6 = 1
            switch(r4) {
                case 4: goto L_0x0945;
                case 5: goto L_0x0079;
                case 6: goto L_0x0919;
                case 7: goto L_0x08fa;
                case 8: goto L_0x0060;
                default: goto L_0x005c;
            }
        L_0x005c:
            r3.A1a()
            return
        L_0x0060:
            r0 = 2131889164(0x7f120c0c, float:1.9412984E38)
            java.lang.String r0 = r3.A0n(r0)
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A05(r8, r3, r0, r6)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A03
            int r0 = r0.A0S()
            if (r0 != r1) goto L_0x000e
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A03
            r0 = 5
            r1.A0Y(r0)
            return
        L_0x0079:
            int r0 = r3.A00
            if (r0 != r1) goto L_0x00c0
            if (r9 != 0) goto L_0x0091
            r0 = 2131889180(0x7f120c1c, float:1.9413016E38)
            java.lang.String r2 = r3.A0n(r0)
            r1 = 12
            X.7py r0 = new X.7py
            r0.<init>(r3, r1)
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A05(r0, r3, r2, r7)
            return
        L_0x0091:
            if (r2 == 0) goto L_0x093a
            long r4 = r2.longValue()
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x093a
            r2 = 2131889168(0x7f120c10, float:1.9412992E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.0ts r0 = r3.A05
            java.lang.String r0 = A00(r0, r4)
            java.lang.String r0 = X.C36401kF.A0q(r3, r0, r1, r7, r2)
            r3.A1c(r0, r7)
            if (r9 != r6) goto L_0x000e
            r2 = 2131889169(0x7f120c11, float:1.9412994E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.0ts r0 = r3.A05
            java.lang.String r0 = A00(r0, r4)
            java.lang.String r0 = X.C36401kF.A0q(r3, r0, r1, r7, r2)
            goto L_0x094c
        L_0x00c0:
            r0 = 2131889195(0x7f120c2b, float:1.9413047E38)
            if (r9 == 0) goto L_0x0914
            r0 = 2131889167(0x7f120c0f, float:1.941299E38)
            java.lang.String r0 = r3.A0n(r0)
            r3.A1c(r0, r6)
            if (r9 != r6) goto L_0x000e
            r0 = 2131889196(0x7f120c2c, float:1.9413049E38)
            goto L_0x0948
        L_0x00d6:
            java.lang.Object r10 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r10 = (com.whatsapp.backup.google.SettingsGoogleDrive) r10
            X.5p6 r6 = (X.C119015p6) r6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/media-restore-error/"
            r1.append(r0)
            int r9 = r6.A00
            java.lang.String r0 = X.C34191gb.A02(r9)
            X.C36321k7.A1a(r1, r0)
            X.C18740tg.A01()
            java.lang.String r1 = X.C90524aI.A0f(r10)
            java.lang.String r12 = "settings-gdrive/display-media-restore-error/"
            r8 = 0
            r11 = 0
            r7 = 1
            switch(r9) {
                case 10: goto L_0x010d;
                case 11: goto L_0x014a;
                case 12: goto L_0x0155;
                case 13: goto L_0x0163;
                case 14: goto L_0x016a;
                case 15: goto L_0x016e;
                case 16: goto L_0x010d;
                case 17: goto L_0x010d;
                case 18: goto L_0x01cc;
                case 19: goto L_0x01cc;
                case 20: goto L_0x01c7;
                case 21: goto L_0x014a;
                case 22: goto L_0x0966;
                case 23: goto L_0x01d6;
                case 24: goto L_0x00fd;
                case 25: goto L_0x0145;
                case 26: goto L_0x00fd;
                case 27: goto L_0x00fd;
                case 28: goto L_0x014a;
                case 29: goto L_0x014a;
                case 30: goto L_0x014a;
                case 31: goto L_0x014a;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unhandled-error/"
        L_0x0103:
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r9)
            X.C36321k7.A1Z(r1, r0)
        L_0x010d:
            r3 = r8
            r2 = r8
        L_0x010f:
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r10)
            if (r0 != 0) goto L_0x0950
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r12)
            java.lang.String r0 = X.C34191gb.A02(r9)
            X.C36321k7.A1a(r1, r0)
            if (r3 == 0) goto L_0x01e6
            com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r10, r8, r3, r7, r7)
            r0 = 2131427928(0x7f0b0258, float:1.8477486E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r10, r0)
            r0.setOnClickListener(r2)
            if (r2 == 0) goto L_0x0132
            r11 = 1
        L_0x0132:
            r0.setClickable(r11)
            r0.setText(r3)
            r0 = 2131428856(0x7f0b05f8, float:1.8479368E38)
            android.view.View r1 = X.C03570Gk.A0B(r10, r0)
            android.view.View$OnClickListener r0 = r10.A01
            r1.setOnClickListener(r0)
            return
        L_0x0145:
            r0 = 2131889862(0x7f120ec6, float:1.94144E38)
            goto L_0x01cf
        L_0x014a:
            r0 = 2131889861(0x7f120ec5, float:1.9414398E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 24
            goto L_0x01df
        L_0x0155:
            r0 = 2131889860(0x7f120ec4, float:1.9414395E38)
            java.lang.String r3 = X.C36351kA.A0w(r10, r1, r7, r0)
            r0 = 3
            X.9v1 r2 = new X.9v1
            r2.<init>(r0, r1, r10)
            goto L_0x010f
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unexpected/"
            goto L_0x0103
        L_0x016a:
            r0 = 2131889866(0x7f120eca, float:1.9414408E38)
            goto L_0x01cf
        L_0x016e:
            android.os.Bundle r1 = r6.A01
            r4 = -1
            if (r1 == 0) goto L_0x01a4
            java.lang.String r0 = "total_bytes_to_be_downloaded"
            long r2 = r1.getLong(r0, r4)
            java.lang.String r0 = "total_bytes_downloaded"
            long r4 = r1.getLong(r0, r4)
            long r0 = r2 - r4
            r14 = 0
            int r13 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r13 < 0) goto L_0x01a6
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x01a6
            r4 = 2131889864(0x7f120ec8, float:1.9414404E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0ts r2 = r10.A00
            java.lang.String r0 = X.AnonymousClass3TF.A03(r2, r0)
            java.lang.String r3 = X.C36391kE.A0v(r10, r0, r3, r11, r4)
        L_0x019b:
            r0 = 10
            X.6co r2 = new X.6co
            r2.<init>(r10, r6, r0)
            goto L_0x010f
        L_0x01a4:
            r2 = -1
        L_0x01a6:
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r9, r12)
            java.lang.String r0 = " total: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " download: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " downloaded cannot be more than total."
            X.C36321k7.A1Z(r1, r0)
            r0 = 2131889865(0x7f120ec9, float:1.9414406E38)
            java.lang.String r3 = r10.getString(r0)
            goto L_0x019b
        L_0x01c7:
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unexpected-error/failed-to-authenticate-with-whatsapp-servers"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01cc:
            r0 = 2131889863(0x7f120ec7, float:1.9414402E38)
        L_0x01cf:
            java.lang.String r3 = r10.getString(r0)
            r0 = 26
            goto L_0x01df
        L_0x01d6:
            r0 = 2131889867(0x7f120ecb, float:1.941441E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 25
        L_0x01df:
            X.6cg r2 = new X.6cg
            r2.<init>(r10, r0)
            goto L_0x010f
        L_0x01e6:
            X.0v0 r0 = r10.A09
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x000e
            int r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A01(r10, r11)
            com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r10, r8, r8, r0, r7)
            return
        L_0x01f6:
            java.lang.Object r1 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = X.C36361kB.A1a(r6, r0)
            android.widget.Button r0 = r1.A0A
            boolean r0 = r0.isClickable()
            if (r2 == r0) goto L_0x000e
            android.widget.Button r0 = r1.A0A
            goto L_0x0261
        L_0x020b:
            java.lang.Object r4 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            android.widget.TextView r3 = r4.A0G
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r6)
            r2 = 0
            int r1 = X.C36351kA.A00(r0)
            int r0 = r3.getVisibility()
            if (r0 == r1) goto L_0x0225
            r3.setVisibility(r1)
        L_0x0225:
            com.whatsapp.TextEmojiLabel r1 = r4.A0P
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0231
            r2 = 8
        L_0x0231:
            int r0 = r1.getVisibility()
            if (r0 == r2) goto L_0x000e
            r1.setVisibility(r2)
            return
        L_0x023b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            android.widget.Button r2 = r0.A0A
            goto L_0x028e
        L_0x0244:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            android.widget.ImageView r2 = r0.A0B
            goto L_0x028e
        L_0x024d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = X.C36361kB.A1a(r6, r0)
            android.view.View r0 = r1.A06
            boolean r0 = r0.isClickable()
            if (r2 == r0) goto L_0x000e
            android.view.View r0 = r1.A06
        L_0x0261:
            r0.setClickable(r2)
            return
        L_0x0265:
            java.lang.Object r2 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = X.C36361kB.A1a(r6, r0)
            android.widget.ProgressBar r0 = r2.A0D
            boolean r0 = r0.isIndeterminate()
            if (r1 == r0) goto L_0x000e
            android.widget.ProgressBar r0 = r2.A0D
            r0.setIndeterminate(r1)
            return
        L_0x027d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            android.widget.ProgressBar r2 = r0.A0D
            goto L_0x028e
        L_0x0286:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            android.widget.ImageView r2 = r0.A0C
        L_0x028e:
            r1 = 0
            if (r6 == r3) goto L_0x0293
            r1 = 8
        L_0x0293:
            int r0 = r2.getVisibility()
            if (r0 == r1) goto L_0x000e
            r2.setVisibility(r1)
            return
        L_0x029d:
            java.lang.Object r7 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r7 = (com.whatsapp.backup.google.SettingsGoogleDrive) r7
            int r3 = X.AnonymousClass000.A0I(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/backup-error/"
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r3)
            X.C36321k7.A1a(r1, r0)
            X.C18740tg.A01()
            r6 = 0
            r5 = 0
            r4 = 1
            switch(r3) {
                case 10: goto L_0x02ce;
                case 11: goto L_0x0300;
                case 12: goto L_0x030a;
                case 13: goto L_0x0314;
                case 14: goto L_0x0347;
                case 15: goto L_0x0354;
                case 16: goto L_0x033e;
                case 17: goto L_0x0342;
                case 18: goto L_0x0347;
                case 19: goto L_0x0367;
                case 20: goto L_0x0347;
                case 21: goto L_0x0300;
                case 22: goto L_0x0342;
                case 23: goto L_0x036b;
                case 24: goto L_0x0971;
                case 25: goto L_0x037a;
                case 26: goto L_0x02be;
                case 27: goto L_0x033e;
                case 28: goto L_0x0300;
                case 29: goto L_0x0300;
                case 30: goto L_0x0300;
                case 31: goto L_0x0300;
                default: goto L_0x02be;
            }
        L_0x02be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/display-backup-error/unhandled-error/"
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r3)
            X.C36321k7.A1Z(r1, r0)
        L_0x02ce:
            r9 = r6
            r8 = 1
        L_0x02d0:
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r7)
            if (r0 != 0) goto L_0x038a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/display-backup-error/"
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r3)
            X.C36321k7.A1a(r1, r0)
            if (r6 == 0) goto L_0x02ef
            com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r7, r9, r6, r4, r8)
        L_0x02eb:
            com.whatsapp.backup.google.SettingsGoogleDrive.A0K(r7, r3)
            return
        L_0x02ef:
            X.0v0 r0 = r7.A09
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x02eb
            int r1 = com.whatsapp.backup.google.SettingsGoogleDrive.A01(r7, r5)
            r0 = 0
            com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r7, r0, r0, r1, r4)
            goto L_0x02eb
        L_0x0300:
            r0 = 2131889831(0x7f120ea7, float:1.9414337E38)
            java.lang.String r2 = r7.getString(r0)
            r1 = 21
            goto L_0x0374
        L_0x030a:
            r0 = 2131889830(0x7f120ea6, float:1.9414335E38)
            java.lang.String r2 = r7.getString(r0)
            r1 = 20
            goto L_0x0374
        L_0x0314:
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r1 = r7.A0b
            r0 = 53
            r1.A0U(r4, r0)
            r0 = 2131889841(0x7f120eb1, float:1.9414357E38)
            java.lang.String r6 = r7.getString(r0)
            int r0 = X.C36381kD.A01(r7)
            r2 = 2131886685(0x7f12025d, float:1.9407956E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = X.AnonymousClass14B.A03(r7, r0)
            java.lang.String r2 = X.C36391kE.A0v(r7, r0, r1, r5, r2)
            r1 = 22
            X.6cg r0 = new X.6cg
            r0.<init>(r7, r1)
            r7.A02 = r0
            r8 = 0
            goto L_0x0386
        L_0x033e:
            r2 = 2131889855(0x7f120ebf, float:1.9414385E38)
            goto L_0x034a
        L_0x0342:
            java.lang.String r0 = "settings-gdrive/display-backup-error/unexpected-error/file-not-found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0347:
            r2 = 2131889835(0x7f120eab, float:1.9414345E38)
        L_0x034a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131886640(0x7f120230, float:1.9407865E38)
            java.lang.String r2 = X.C36341k9.A0e(r7, r1, r0, r5, r2)
            goto L_0x0381
        L_0x0354:
            r9 = 2131889834(0x7f120eaa, float:1.9414343E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            X.0ts r2 = r7.A00
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.String r0 = X.AnonymousClass3TF.A03(r2, r0)
            java.lang.String r2 = X.C36391kE.A0v(r7, r0, r8, r5, r9)
            goto L_0x0385
        L_0x0367:
            r0 = 2131889833(0x7f120ea9, float:1.941434E38)
            goto L_0x037d
        L_0x036b:
            r0 = 2131889837(0x7f120ead, float:1.9414349E38)
            java.lang.String r2 = r7.getString(r0)
            r1 = 23
        L_0x0374:
            X.6cg r0 = new X.6cg
            r0.<init>(r7, r1)
            goto L_0x0383
        L_0x037a:
            r0 = 2131889832(0x7f120ea8, float:1.9414339E38)
        L_0x037d:
            java.lang.String r2 = r7.getString(r0)
        L_0x0381:
            android.view.View$OnClickListener r0 = r7.A03
        L_0x0383:
            r7.A02 = r0
        L_0x0385:
            r8 = 1
        L_0x0386:
            r9 = r6
            r6 = r2
            goto L_0x02d0
        L_0x038a:
            r0 = 10
            if (r3 == r0) goto L_0x000e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/display-backup-error failed to display error "
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r3)
            r1.append(r0)
            java.lang.String r0 = " since Activity is about to finish."
            X.C36321k7.A1Z(r1, r0)
            return
        L_0x03a4:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x000e
            int r1 = r6.intValue()
            if (r1 < 0) goto L_0x000e
            android.widget.ProgressBar r0 = r0.A0D
            r0.setProgress(r1)
            return
        L_0x03b8:
            java.lang.Object r2 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x000e
            int r1 = r6.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x000e
            X.01z r1 = r2.getSupportFragmentManager()
            r0 = 13
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.02E r1 = r1.A0N(r0)
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.A15()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "settings-gdrive-observer/wifi-connected user is waiting on \"backup on cellular\" prompt  and Wi-Fi is connected, start backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6FS r0 = r2.A0Y
            X.C111795cr.A00(r2, r0)
            r1.A1c()
            return
        L_0x03ed:
            java.lang.Object r4 = r1.A00
            X.8WH r4 = (X.AnonymousClass8WH) r4
            boolean r0 = X.AnonymousClass000.A1X(r6)
            if (r0 == 0) goto L_0x000e
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x000e
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131887631(0x7f12060f, float:1.9409875E38)
            java.lang.String r0 = r1.getString(r0)
            r2 = 0
            X.4t3 r0 = X.C99304t3.A02(r3, r0, r2)
            r0.A0P()
            X.3L6 r1 = r4.A0s
            java.lang.String r0 = "cart_add_tag"
            r1.A05(r0, r2)
            return
        L_0x0416:
            java.lang.Object r3 = r1.A00
            X.8WH r3 = (X.AnonymousClass8WH) r3
            boolean r0 = X.AnonymousClass000.A1X(r6)
            if (r0 == 0) goto L_0x000e
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x000e
            X.4t3 r4 = r3.A0B
            if (r4 != 0) goto L_0x0447
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131890611(0x7f1211b3, float:1.9415919E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            X.4t3 r4 = X.C99304t3.A02(r2, r1, r0)
            r2 = 2131895668(0x7f122574, float:1.9426176E38)
            r1 = 49
            X.2hx r0 = new X.2hx
            r0.<init>(r3, r1)
            r4.A0Y(r0, r2)
            r3.A0B = r4
        L_0x0447:
            boolean r0 = r4.A0W()
            if (r0 != 0) goto L_0x0452
            X.4t3 r0 = r3.A0B
            r0.A0P()
        L_0x0452:
            android.animation.ObjectAnimator r0 = r3.A02
            if (r0 != 0) goto L_0x0491
            r0 = 2131431573(0x7f0b1095, float:1.848488E38)
            android.view.View r8 = r3.findViewById(r0)
            r7 = 2
            android.animation.PropertyValuesHolder[] r6 = new android.animation.PropertyValuesHolder[r7]
            r5 = 1
            float[] r1 = new float[r5]
            r4 = 0
            r2 = 1069547520(0x3fc00000, float:1.5)
            r1[r4] = r2
            java.lang.String r0 = "scaleX"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            r6[r4] = r0
            float[] r1 = new float[r5]
            r1[r4] = r2
            java.lang.String r0 = "scaleY"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            r6[r5] = r0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r8, r6)
            r3.A02 = r2
            r0 = 180(0xb4, double:8.9E-322)
            r2.setDuration(r0)
            android.animation.ObjectAnimator r0 = r3.A02
            r0.setRepeatMode(r7)
            android.animation.ObjectAnimator r0 = r3.A02
            r0.setRepeatCount(r5)
        L_0x0491:
            android.animation.ObjectAnimator r0 = r3.A02
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x049e
            android.animation.ObjectAnimator r0 = r3.A02
            r0.start()
        L_0x049e:
            X.3L6 r2 = r3.A0s
            r1 = 1
            java.lang.String r0 = "cart_add_tag"
            r2.A05(r0, r1)
            X.8fo r0 = r3.A0K
            r0.A00()
            return
        L_0x04ac:
            java.lang.Object r4 = r1.A00
            X.8WH r4 = (X.AnonymousClass8WH) r4
            boolean r0 = X.AnonymousClass000.A1X(r6)
            if (r0 == 0) goto L_0x000e
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x000e
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131887547(0x7f1205bb, float:1.9409704E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -2
            X.4t3 r3 = X.C99304t3.A02(r2, r1, r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 13
            X.2i6 r0 = new X.2i6
            r0.<init>(r3, r4, r1)
            r3.A0Y(r0, r2)
            r3.A0P()
            X.3L6 r2 = r4.A0s
            r1 = 0
            java.lang.String r0 = "cart_add_tag"
            r2.A05(r0, r1)
            return
        L_0x04e3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity r1 = (com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity) r1
            boolean r0 = X.AnonymousClass000.A1X(r6)
            if (r0 != 0) goto L_0x000e
            X.190 r0 = r1.A02
            if (r0 == 0) goto L_0x097c
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Intent r0 = X.AnonymousClass190.A05(r0)
            X.AnonymousClass00C.A08(r0)
            r1.finish()
            r1.startActivity(r0)
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x0507:
            java.lang.Object r2 = r1.A00
            com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r2 = (com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity) r2
            int r1 = X.AnonymousClass000.A0I(r6)
            r0 = 1
            if (r1 != r0) goto L_0x000e
            com.whatsapp.businessapisearch.view.fragment.BusinessAPINUXBottomSheet r1 = new com.whatsapp.businessapisearch.view.fragment.BusinessAPINUXBottomSheet
            r1.<init>()
            java.lang.String r0 = "tag_business_api"
            r2.Btl(r1, r0)
            com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel r0 = r2.A05
            X.5sz r3 = r0.A00
            r2 = 0
            monitor-enter(r3)
            goto L_0x0981
        L_0x0524:
            java.lang.Object r0 = r1.A00
            X.4y9 r0 = (X.C101704y9) r0
            androidx.appcompat.widget.SwitchCompat r1 = r0.A09
            goto L_0x0753
        L_0x052c:
            java.lang.Object r10 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r10 = (com.whatsapp.backup.google.SettingsGoogleDrive) r10
            X.5Zf r6 = (X.C109815Zf) r6
            if (r6 != 0) goto L_0x053a
            android.widget.TextView r4 = r10.A0G
            java.lang.String r0 = ""
            goto L_0x07a9
        L_0x053a:
            boolean r0 = r6 instanceof X.C101944yX
            java.lang.String r1 = "Unexpected message "
            if (r0 == 0) goto L_0x0584
            X.4yX r6 = (X.C101944yX) r6
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0550;
                case 1: goto L_0x0554;
                case 2: goto L_0x0558;
                case 3: goto L_0x055c;
                case 4: goto L_0x0560;
                case 5: goto L_0x0564;
                case 6: goto L_0x0568;
                case 7: goto L_0x056c;
                case 8: goto L_0x0570;
                case 9: goto L_0x0574;
                case 10: goto L_0x0578;
                case 11: goto L_0x057c;
                case 12: goto L_0x0580;
                default: goto L_0x0547;
            }
        L_0x0547:
            r1 = 2131894178(0x7f121fa2, float:1.9423153E38)
        L_0x054a:
            android.widget.TextView r0 = r10.A0G
            r0.setText(r1)
            return
        L_0x0550:
            r1 = 2131894181(0x7f121fa5, float:1.942316E38)
            goto L_0x054a
        L_0x0554:
            r1 = 2131894176(0x7f121fa0, float:1.942315E38)
            goto L_0x054a
        L_0x0558:
            r1 = 2131894177(0x7f121fa1, float:1.9423151E38)
            goto L_0x054a
        L_0x055c:
            r1 = 2131889912(0x7f120ef8, float:1.94145E38)
            goto L_0x054a
        L_0x0560:
            r1 = 2131889911(0x7f120ef7, float:1.9414499E38)
            goto L_0x054a
        L_0x0564:
            r1 = 2131894161(0x7f121f91, float:1.9423119E38)
            goto L_0x054a
        L_0x0568:
            r1 = 2131894159(0x7f121f8f, float:1.9423115E38)
            goto L_0x054a
        L_0x056c:
            r1 = 2131894160(0x7f121f90, float:1.9423117E38)
            goto L_0x054a
        L_0x0570:
            r1 = 2131894165(0x7f121f95, float:1.9423127E38)
            goto L_0x054a
        L_0x0574:
            r1 = 2131894158(0x7f121f8e, float:1.9423113E38)
            goto L_0x054a
        L_0x0578:
            r1 = 2131891168(0x7f1213e0, float:1.9417048E38)
            goto L_0x054a
        L_0x057c:
            r1 = 2131889836(0x7f120eac, float:1.9414347E38)
            goto L_0x054a
        L_0x0580:
            r1 = 2131894146(0x7f121f82, float:1.9423089E38)
            goto L_0x054a
        L_0x0584:
            boolean r0 = r6 instanceof X.C101924yV
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            r11 = 0
            r3 = 1
            if (r0 == 0) goto L_0x05a9
            X.4yV r6 = (X.C101924yV) r6
            int r0 = r6.A00
            double r1 = (double) r0
            double r1 = r1 / r13
            android.widget.TextView r4 = r10.A0G
            r5 = 2131894162(0x7f121f92, float:1.942312E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0ts r0 = r10.A00
            java.text.NumberFormat r0 = r0.A0N()
            java.lang.String r0 = r0.format(r1)
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r3, r11, r5)
            goto L_0x07a9
        L_0x05a9:
            boolean r0 = r6 instanceof X.C101954yY
            r9 = 2
            r7 = 3
            if (r0 == 0) goto L_0x05e3
            X.4yY r6 = (X.C101954yY) r6
            X.0ts r2 = r10.A00
            long r0 = r6.A01
            java.lang.String r2 = X.AnonymousClass3TF.A03(r2, r0)
            r4 = 100
            long r0 = r0 * r4
            long r4 = r6.A00
            long r0 = r0 / r4
            int r12 = (int) r0
            r8 = 2131894163(0x7f121f93, float:1.9423123E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r11] = r2
            X.0ts r0 = r10.A00
            java.lang.String r0 = X.AnonymousClass3TF.A03(r0, r4)
            r6[r3] = r0
            X.0ts r0 = r10.A00
            java.text.NumberFormat r2 = r0.A0N()
            double r0 = (double) r12
            double r0 = r0 / r13
            java.lang.String r0 = r2.format(r0)
            java.lang.String r1 = X.C36391kE.A0v(r10, r0, r6, r9, r8)
        L_0x05df:
            android.widget.TextView r0 = r10.A0G
            goto L_0x06d5
        L_0x05e3:
            boolean r0 = r6 instanceof X.C101934yW
            if (r0 == 0) goto L_0x0601
            X.4yW r6 = (X.C101934yW) r6
            r4 = 2131894179(0x7f121fa3, float:1.9423155E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0ts r0 = r10.A00
            java.text.NumberFormat r2 = r0.A0N()
            int r0 = r6.A00
            double r0 = (double) r0
            double r0 = r0 / r13
            java.lang.String r0 = r2.format(r0)
            java.lang.String r1 = X.C36391kE.A0v(r10, r0, r3, r11, r4)
            goto L_0x05df
        L_0x0601:
            boolean r0 = r6 instanceof X.C101964yZ
            if (r0 == 0) goto L_0x0632
            X.4yZ r6 = (X.C101964yZ) r6
            X.0ts r2 = r10.A00
            long r0 = r6.A00
            java.lang.String r2 = X.AnonymousClass3TF.A03(r2, r0)
            r8 = 2131894182(0x7f121fa6, float:1.9423162E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r11] = r2
            X.0ts r2 = r10.A00
            long r5 = r6.A01
            java.lang.String r2 = X.AnonymousClass3TF.A03(r2, r5)
            r7[r3] = r2
            X.0ts r2 = r10.A00
            java.text.NumberFormat r4 = r2.A0N()
            double r2 = (double) r0
            double r0 = (double) r5
            double r2 = r2 / r0
            java.lang.String r0 = r4.format(r2)
            java.lang.String r1 = X.C36391kE.A0v(r10, r0, r7, r9, r8)
            goto L_0x05df
        L_0x0632:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r6, r1, r0)
            throw r0
        L_0x063b:
            java.lang.Object r0 = r1.A00
            X.4y9 r0 = (X.C101704y9) r0
            java.lang.Number r6 = (java.lang.Number) r6
            android.widget.TextView r4 = r0.A08
            java.lang.String[] r5 = r0.A0N
            int r3 = r6.intValue()
            r2 = 0
        L_0x064a:
            int[] r1 = com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel.A07
            r0 = 5
            if (r2 >= r0) goto L_0x079d
            r0 = r1[r2]
            if (r0 == r3) goto L_0x07a7
            int r2 = r2 + 1
            goto L_0x064a
        L_0x0656:
            java.lang.Object r0 = r1.A00
            X.4y9 r0 = (X.C101704y9) r0
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0662
            android.widget.TextView r2 = r0.A07
            goto L_0x07b7
        L_0x0662:
            android.widget.TextView r0 = r0.A07
            goto L_0x07c0
        L_0x0666:
            java.lang.Object r7 = r1.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r7 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r7
            long r2 = X.C36431kI.A09(r6)
            X.0ts r4 = r7.A00
            X.1Q9 r0 = r7.A0O
            long r0 = r0.A0E()
            java.lang.String r6 = X.AnonymousClass3UY.A0B(r4, r0)
            X.0ts r0 = r7.A00
            java.lang.String r5 = X.AnonymousClass3TF.A03(r0, r2)
            r0 = 2131430491(0x7f0b0c5b, float:1.8482684E38)
            android.widget.TextView r4 = X.C36401kF.A0H(r7, r0)
            r3 = 2131890831(0x7f12128f, float:1.9416365E38)
            java.lang.Object[] r2 = X.C36441kJ.A1Q()
            r1 = 0
            r0 = 0
            r2[r1] = r0
            r0 = 1
            X.C36411kG.A1Q(r6, r5, r2, r0)
            X.C36341k9.A0s(r7, r4, r2, r3)
            return
        L_0x069a:
            java.lang.Object r4 = r1.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            long r2 = X.C36431kI.A09(r6)
            android.widget.TextView r1 = r4.A03
            X.0ts r0 = r4.A00
            java.lang.String r0 = X.AnonymousClass3RQ.A02(r4, r0, r2)
            r1.setText(r0)
            return
        L_0x06ae:
            java.lang.Object r7 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r7 = (com.whatsapp.backup.google.SettingsGoogleDrive) r7
            X.5Zg r6 = (X.C109825Zg) r6
            android.widget.TextView r1 = r7.A0L
            if (r6 != 0) goto L_0x06be
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x06be:
            r8 = 0
            int r0 = r1.getVisibility()
            if (r0 == r8) goto L_0x06c8
            r1.setVisibility(r8)
        L_0x06c8:
            boolean r0 = r6 instanceof X.C101974ya
            if (r0 == 0) goto L_0x06d9
            r0 = 2131887305(0x7f1204c9, float:1.9409213E38)
            java.lang.String r1 = r7.getString(r0)
        L_0x06d3:
            android.widget.TextView r0 = r7.A0L
        L_0x06d5:
            r0.setText(r1)
            return
        L_0x06d9:
            boolean r0 = r6 instanceof X.C101994yc
            if (r0 == 0) goto L_0x06fa
            X.0ts r5 = r7.A00
            r4 = 2131755327(0x7f10013f, float:1.914153E38)
            X.4yc r6 = (X.C101994yc) r6
            long r2 = r6.A00
        L_0x06e6:
            r1 = 1
            android.util.Pair r0 = X.AnonymousClass3TF.A00(r5, r2, r8, r1)
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.first
            r1[r8] = r0
            java.lang.String r1 = r5.A0I(r2, r1, r4)
            goto L_0x06d3
        L_0x06fa:
            boolean r0 = r6 instanceof X.C101984yb
            if (r0 == 0) goto L_0x0708
            X.0ts r5 = r7.A00
            r4 = 2131755326(0x7f10013e, float:1.9141528E38)
            X.4yb r6 = (X.C101984yb) r6
            long r2 = r6.A00
            goto L_0x06e6
        L_0x0708:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected state "
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r6, r0, r1)
            throw r0
        L_0x0713:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.whatsapp.WaTextView r2 = r0.A0R
            r0 = 2131894142(0x7f121f7e, float:1.942308E38)
            if (r6 != r1) goto L_0x07ba
            r0 = 2131894143(0x7f121f7f, float:1.9423082E38)
            goto L_0x07ba
        L_0x0725:
            java.lang.Object r3 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r3 = (com.whatsapp.backup.google.SettingsGoogleDrive) r3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = X.C36361kB.A1a(r6, r0)
            int r2 = com.whatsapp.backup.google.SettingsGoogleDrive.A01(r3, r0)
            r1 = 0
            r0 = 1
            com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r3, r1, r1, r2, r0)
            return
        L_0x0739:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            X.1RJ r1 = r0.A0n
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r6)
            int r0 = X.C36351kA.A00(r0)
            r1.A03(r0)
            return
        L_0x074d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            androidx.appcompat.widget.SwitchCompat r1 = r0.A0M
        L_0x0753:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = X.C36361kB.A1a(r6, r0)
            r1.setChecked(r0)
            return
        L_0x075d:
            java.lang.Object r4 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.Number r6 = (java.lang.Number) r6
            r3 = 0
            if (r6 != 0) goto L_0x076a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L_0x076a:
            int r2 = r6.intValue()
            r0 = 1
            com.whatsapp.WaTextView r1 = r4.A0S
            if (r2 == r0) goto L_0x0779
            r3 = 8
        L_0x0775:
            r1.setVisibility(r3)
            return
        L_0x0779:
            r0 = 2131894164(0x7f121f94, float:1.9423125E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r4.A0S
            goto L_0x0775
        L_0x0782:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Number r6 = (java.lang.Number) r6
            android.widget.TextView r4 = r0.A0F
            java.lang.String[] r5 = r0.A0q
            int r3 = r6.intValue()
            r2 = 0
        L_0x0791:
            int[] r1 = com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel.A0f
            r0 = 5
            if (r2 >= r0) goto L_0x079d
            r0 = r1[r2]
            if (r0 == r3) goto L_0x07a7
            int r2 = r2 + 1
            goto L_0x0791
        L_0x079d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/get-backup-freq-index/"
            X.C36321k7.A1S(r0, r1, r3)
            r2 = 0
        L_0x07a7:
            r0 = r5[r2]
        L_0x07a9:
            r4.setText(r0)
            return
        L_0x07ad:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x07be
            android.widget.TextView r2 = r0.A0E
        L_0x07b7:
            r0 = 2131894137(0x7f121f79, float:1.942307E38)
        L_0x07ba:
            r2.setText(r0)
            return
        L_0x07be:
            android.widget.TextView r0 = r0.A0E
        L_0x07c0:
            r0.setText(r6)
            return
        L_0x07c4:
            java.lang.Object r5 = r1.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r5 = (com.whatsapp.backup.google.SettingsGoogleDrive) r5
            long r1 = X.C36431kI.A09(r6)
            X.0ts r0 = r5.A00
            java.lang.String r10 = X.AnonymousClass3RQ.A02(r5, r0, r1)
            java.lang.String r6 = X.C90524aI.A0f(r5)
            X.0v0 r0 = r5.A09
            long r3 = r0.A0T(r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0861
            r0 = 2131891269(0x7f121445, float:1.9417253E38)
        L_0x07e5:
            java.lang.String r9 = r5.getString(r0)
        L_0x07e9:
            if (r6 == 0) goto L_0x085e
            X.0v0 r0 = r5.A09
            long r1 = r0.A0U(r6)
        L_0x07f1:
            r12 = 0
            r8 = 8
            r11 = 1
            r7 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x084c
            X.0v0 r0 = r5.A09
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x084c
            android.widget.TextView r0 = r5.A0K
            r0.setVisibility(r8)
        L_0x0808:
            android.widget.TextView r4 = r5.A0J
            r3 = 2131890683(0x7f1211fb, float:1.9416065E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r7] = r9
            X.C36341k9.A0s(r5, r4, r0, r3)
            int r10 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            android.widget.TextView r0 = r5.A0H
            if (r10 <= 0) goto L_0x0848
            r0.setVisibility(r7)
            android.widget.TextView r9 = r5.A0H
            r4 = 2131889962(0x7f120f2a, float:1.9414602E38)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            X.0ts r0 = r5.A00
            java.lang.String r0 = X.AnonymousClass3TF.A03(r0, r1)
            r3[r7] = r0
            X.C36341k9.A0s(r5, r9, r3, r4)
        L_0x082f:
            X.0v0 r0 = r5.A09
            boolean r0 = r0.A2T(r6)
            if (r0 == 0) goto L_0x0884
            X.0v0 r0 = r5.A09
            int r1 = r0.A0N(r6)
            r0 = 2
            if (r1 != r0) goto L_0x0884
            if (r10 <= 0) goto L_0x0884
            com.whatsapp.WaLinearLayout r0 = r5.A0Q
            r0.setVisibility(r7)
            return
        L_0x0848:
            r0.setVisibility(r8)
            goto L_0x082f
        L_0x084c:
            android.widget.TextView r4 = r5.A0K
            r3 = 2131890830(0x7f12128e, float:1.9416363E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r7] = r10
            X.C36341k9.A0s(r5, r4, r0, r3)
            android.widget.TextView r0 = r5.A0K
            r0.setVisibility(r7)
            goto L_0x0808
        L_0x085e:
            r1 = -1
            goto L_0x07f1
        L_0x0861:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x086c
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            goto L_0x07e5
        L_0x086c:
            X.0ts r2 = r5.A00
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.AnonymousClass6XI.A00(r0, r3)
            if (r0 != 0) goto L_0x087e
            java.lang.String r9 = X.AnonymousClass3UM.A00(r2, r3)
            goto L_0x07e9
        L_0x087e:
            java.lang.String r9 = X.AnonymousClass3UY.A0B(r2, r3)
            goto L_0x07e9
        L_0x0884:
            com.whatsapp.WaLinearLayout r0 = r5.A0Q
            r0.setVisibility(r8)
            return
        L_0x088a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r0
            X.7yS r0 = r0.A0Q
            X.6Uh r2 = r0.A02
            X.0wU r1 = r2.A0B
            r0 = 44
            X.C1497072l.A00(r1, r2, r0)
            return
        L_0x089a:
            java.lang.Object r2 = r1.A00
            com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity r2 = (com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity) r2
            int r1 = X.AnonymousClass000.A0I(r6)
            if (r1 == 0) goto L_0x08db
            r0 = 2
            if (r1 == r0) goto L_0x08db
            r0 = 3
            if (r1 == r0) goto L_0x08b8
            r0 = 4
            if (r1 == r0) goto L_0x08b1
            r0 = 5
            if (r1 == r0) goto L_0x08db
            return
        L_0x08b1:
            r0 = 2131624034(0x7f0e0062, float:1.8875236E38)
            r2.setContentView((int) r0)
            return
        L_0x08b8:
            r0 = 2131624034(0x7f0e0062, float:1.8875236E38)
            r2.setContentView((int) r0)
            X.190 r0 = r2.A02
            if (r0 == 0) goto L_0x08d6
            r0 = 10485760(0xa00000, double:5.180654E-317)
            android.content.Intent r1 = X.AnonymousClass190.A0M(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            X.AnonymousClass00C.A08(r0)
            r2.startActivity(r0)
            return
        L_0x08d6:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x08db:
            X.190 r0 = r2.A02
            if (r0 == 0) goto L_0x08f5
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Intent r0 = X.AnonymousClass190.A05(r0)
            X.AnonymousClass00C.A08(r0)
            r2.finish()
            r2.startActivity(r0)
            r0 = 0
            r2.overridePendingTransition(r0, r0)
            return
        L_0x08f5:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x08fa:
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0911
            android.content.res.Resources r4 = X.C36341k9.A0G(r3)
            r2 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0 = 64
            X.AnonymousClass000.A1L(r1, r0, r7)
            java.lang.String r0 = r4.getQuantityString(r2, r0, r1)
            goto L_0x0932
        L_0x0911:
            r0 = 2131889197(0x7f120c2d, float:1.941305E38)
        L_0x0914:
            java.lang.String r0 = r3.A0n(r0)
            goto L_0x0932
        L_0x0919:
            if (r2 == 0) goto L_0x0936
            long r4 = r2.longValue()
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0936
            r2 = 2131889176(0x7f120c18, float:1.9413008E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.0ts r0 = r3.A05
            java.lang.String r0 = A00(r0, r4)
            java.lang.String r0 = X.C36401kF.A0q(r3, r0, r1, r7, r2)
        L_0x0932:
            r3.A1c(r0, r7)
            return
        L_0x0936:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            goto L_0x093d
        L_0x093a:
            r0 = 2131889167(0x7f120c0f, float:1.941299E38)
        L_0x093d:
            java.lang.String r0 = r3.A0n(r0)
            r3.A1c(r0, r6)
            return
        L_0x0945:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
        L_0x0948:
            java.lang.String r0 = r3.A0n(r0)
        L_0x094c:
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment.A05(r8, r3, r0, r6)
            return
        L_0x0950:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error failed to display error "
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A02(r9)
            r1.append(r0)
            java.lang.String r0 = " since Activity is about to finish."
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0966:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected error: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r9)
            throw r0
        L_0x0971:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected error during Google backup: "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r3)
            throw r0
        L_0x097c:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0981:
            android.content.SharedPreferences r0 = r3.A00     // Catch:{ all -> 0x099a }
            if (r0 != 0) goto L_0x098f
            X.0wg r1 = r3.A02     // Catch:{ all -> 0x099a }
            java.lang.String r0 = "com.whatsapp_business_api"
            android.content.SharedPreferences r0 = r1.A00(r0)     // Catch:{ all -> 0x099a }
            r3.A00 = r0     // Catch:{ all -> 0x099a }
        L_0x098f:
            monitor-exit(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "arg_should_show_nux"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x099a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165147sx.BTH(java.lang.Object):void");
    }
}
