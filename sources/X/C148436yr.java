package X;

import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.6yr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148436yr implements C88104Rk {
    public final /* synthetic */ SettingsGoogleDrive A00;
    public final /* synthetic */ AnonymousClass2RM A01;

    public /* synthetic */ C148436yr(SettingsGoogleDrive settingsGoogleDrive, AnonymousClass2RM r2) {
        this.A00 = settingsGoogleDrive;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        if (r2 == 2) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        if (r1 == 1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0137, code lost:
        X.C36321k7.A1S("settings-gdrive/perform-backup/unknown-network-type/", X.AnonymousClass000.A0u(), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BaB(int r9) {
        /*
            r8 = this;
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = r8.A00
            X.2RM r3 = r8.A01
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0b
            r1 = 1
            X.00s r0 = r0.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.A0C(r1)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0b
            X.00s r0 = r0.A0B
            r0.A0C(r1)
            if (r9 != 0) goto L_0x0044
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0b
            r0.A0T()
            X.0v0 r0 = r4.A09
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x0044
            X.C18740tg.A01()
            X.0wG r0 = r4.A0f
            android.content.Context r0 = r0.A00
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = X.C90524aI.A0f(r4)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "settings-gdrive/perform-backup/account/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131886642(0x7f120232, float:1.9407869E38)
        L_0x0041:
            r4.BO5(r0)
        L_0x0044:
            r6 = 0
        L_0x0045:
            int r0 = X.AnonymousClass6YO.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            java.lang.Integer r0 = X.C36371kC.A0o()
            r3.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.A00 = r0
            X.0yW r0 = r4.A0j
            r0.Bly(r3)
            return
        L_0x0063:
            int r0 = X.C90514aH.A0G(r4)
            r5 = 1
            if (r0 != r5) goto L_0x0090
            java.lang.String r0 = "settings-gdrive/perform-backup/backup/pending"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r4.A0b
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0083
            X.0v0 r0 = r4.A09
            int r1 = r0.A0E()
            r0 = 10
            if (r1 == r0) goto L_0x008c
        L_0x0083:
            android.view.View$OnClickListener r1 = r4.A02
            if (r1 == 0) goto L_0x008c
            r0 = 0
            r1.onClick(r0)
            goto L_0x0044
        L_0x008c:
            r0 = 2131894138(0x7f121f7a, float:1.9423072E38)
            goto L_0x0041
        L_0x0090:
            X.0v0 r0 = r4.A09
            boolean r0 = X.AnonymousClass6Y6.A05(r0)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "settings-gdrive/perform-backup/restore-media/running"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131894183(0x7f121fa7, float:1.9423164E38)
            goto L_0x0041
        L_0x00a1:
            X.0v0 r0 = r4.A09
            int r1 = r0.A0D()
            X.0wD r0 = r4.A07
            r6 = 1
            int r2 = r0.A03(r5)
            if (r2 != 0) goto L_0x00c1
            r0 = 2131894165(0x7f121f95, float:1.9423127E38)
            if (r1 != 0) goto L_0x00b8
            r0 = 2131894166(0x7f121f96, float:1.942313E38)
        L_0x00b8:
            r4.BO5(r0)
            java.lang.String r0 = "settings-gdrive/perform-backup/no-data-connection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0044
        L_0x00c1:
            r0 = 3
            if (r2 != r0) goto L_0x00d6
            r0 = 2131889843(0x7f120eb3, float:1.941436E38)
            if (r1 != 0) goto L_0x00cc
            r0 = 2131889845(0x7f120eb5, float:1.9414365E38)
        L_0x00cc:
            r4.BO5(r0)
        L_0x00cf:
            X.6FS r0 = r4.A0Y
            X.C111795cr.A00(r4, r0)
            goto L_0x0045
        L_0x00d6:
            r0 = 2
            if (r2 != r0) goto L_0x010d
            if (r1 != 0) goto L_0x0111
            r6 = 13
            X.3L4 r7 = new X.3L4
            r7.<init>(r6)
            r0 = 2131896219(0x7f12279b, float:1.9427293E38)
            X.C90484aE.A10(r4, r7, r0)
            r0 = 2131889844(0x7f120eb4, float:1.9414363E38)
            X.C90484aE.A12(r4, r7, r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r2 = r4.getString(r0)
            android.os.Bundle r1 = r7.A00
            java.lang.String r0 = "negative_button"
            r1.putString(r0, r2)
            r0 = 2131886640(0x7f120230, float:1.9407865E38)
            X.C90484aE.A11(r4, r7, r0)
            com.whatsapp.dialogs.PromptDialogFragment r2 = r7.A00()
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r4)
            if (r0 != 0) goto L_0x0044
            goto L_0x0119
        L_0x010d:
            if (r2 == r5) goto L_0x0113
            if (r2 != r0) goto L_0x0137
        L_0x0111:
            if (r1 != r5) goto L_0x0137
        L_0x0113:
            java.lang.String r0 = "settings-gdrive/perform-backup/start-gdrive-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00cf
        L_0x0119:
            X.09Y r1 = X.C36341k9.A0O(r4)     // Catch:{ IllegalStateException -> 0x0129 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ IllegalStateException -> 0x0129 }
            r1.A0D(r2, r0)     // Catch:{ IllegalStateException -> 0x0129 }
            r1.A00(r5)     // Catch:{ IllegalStateException -> 0x0129 }
            goto L_0x0044
        L_0x0129:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/perform-backup"
            com.whatsapp.util.Log.e(r0, r1)
            X.6FS r0 = r4.A0Y
            X.C111795cr.A00(r4, r0)
            r6 = 1
            goto L_0x0045
        L_0x0137:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/perform-backup/unknown-network-type/"
            X.C36321k7.A1S(r0, r1, r2)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148436yr.BaB(int):void");
    }
}
