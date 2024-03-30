package com.whatsapp.registration.directmigration;

import X.AnonymousClass13I;
import X.AnonymousClass18U;
import X.AnonymousClass1QD;
import X.C19420v0;
import X.C19730wQ;
import X.C19770wU;
import X.C21100yf;
import X.C24331Ca;
import X.C24391Cg;
import X.C36441kJ;
import android.content.BroadcastReceiver;

public class MigrationProviderOrderedBroadcastReceiver extends BroadcastReceiver {
    public C19730wQ A00;
    public C21100yf A01;
    public AnonymousClass18U A02;
    public C24331Ca A03;
    public C19420v0 A04;
    public AnonymousClass13I A05;
    public AnonymousClass1QD A06;
    public C24391Cg A07;
    public C19770wU A08;
    public final Object A09;
    public volatile boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (X.AnonymousClass1L0.A00(r11, "com.whatsapp.w4b") <= 656) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018f, code lost:
        if (r2 != false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r10.A09
            monitor-enter(r1)
            boolean r0 = r10.A0A     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.0tt r0 = X.C56042vd.A00(r11)     // Catch:{ all -> 0x0017 }
            X.C18830tt.APo(r0, r10)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r10.A0A = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/on-receive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wQ r0 = r10.A00
            r0.A0G()
            com.whatsapp.Me r9 = r0.A00
            X.18U r0 = r10.A02
            boolean r4 = r0.A04()
            java.lang.String r1 = "com.whatsapp.w4b"
            long r6 = X.AnonymousClass1L0.A00(r11, r1)
            r5 = 1
            r2 = 231714000(0xdcfacd0, double:1.14481927E-315)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r0 = X.C36401kF.A1U(r0)
            if (r4 == 0) goto L_0x0041
            if (r0 != 0) goto L_0x0041
            r5 = 0
        L_0x0041:
            r3 = 0
            r4 = 1
            if (r5 == 0) goto L_0x0058
            X.0wQ r0 = r10.A00
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0058
            long r7 = X.AnonymousClass1L0.A00(r11, r1)
            r5 = 656(0x290, double:3.24E-321)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r6 = 1
            if (r0 > 0) goto L_0x0059
        L_0x0058:
            r6 = 0
        L_0x0059:
            android.os.Bundle r5 = X.AnonymousClass001.A07()
            if (r12 == 0) goto L_0x0143
            java.lang.String r0 = r12.getAction()
            if (r0 == 0) goto L_0x0143
            X.13I r0 = r10.A05
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0143
            if (r9 == 0) goto L_0x0143
            java.lang.String r2 = r12.getAction()
            java.lang.String r0 = "com.whatsapp.registration.directmigration.initialMigrationInfoAction"
            boolean r0 = r0.equals(r2)
            java.lang.String r8 = "phone_number"
            java.lang.String r7 = "me_country_code"
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-initial-migration-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r9.cc
            r5.putString(r7, r0)
            java.lang.String r0 = r9.number
            r5.putString(r8, r0)
            android.os.Bundle r1 = r10.getResultExtras(r4)
            java.lang.String r0 = "database_migration_is_enabled_on_requester_side"
            boolean r3 = r1.getBoolean(r0)
            java.lang.String r0 = "sister_app_content_provider_enabled"
            r5.putBoolean(r0, r6)
            X.18U r0 = r10.A02
            boolean r1 = r0.A04()
            java.lang.String r0 = "sister_app_is_auth_protected"
            r5.putBoolean(r0, r1)
            X.0v0 r0 = r10.A04
            long r1 = r0.A0P()
            java.lang.String r0 = "sister_app_privacy_auth_timeout"
            r5.putLong(r0, r1)
            if (r3 == 0) goto L_0x00da
            if (r6 == 0) goto L_0x00da
            X.0yf r1 = r10.A01
            X.0yh r0 = X.C21100yf.A20
            int r1 = r1.A04(r0)
            java.lang.String r0 = "direct_db_migration_timeout_in_secs"
            r5.putInt(r0, r1)
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-database-migration-action"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QD r2 = r10.A06
            X.0wU r1 = r2.A04
            X.2iV r0 = new X.2iV
            r0.<init>(r2)
            X.C36391kE.A1Q(r0, r1)
            X.0wU r1 = r10.A08
            r0 = 31
            X.C80313vC.A01(r1, r10, r11, r0)
        L_0x00da:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = -1
            r0 = 0
            r10.setResult(r1, r0, r5)
            return
        L_0x00e5:
            if (r6 == 0) goto L_0x0143
            java.lang.String r2 = r12.getAction()
            java.lang.String r0 = "com.whatsapp.registration.directmigration.recoveryTokenAction"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/request-token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r2 = r10.getResultExtras(r4)
            java.lang.String r7 = r2.getString(r7)
            java.lang.String r6 = r2.getString(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0143
            X.0v0 r0 = r10.A04
            java.lang.String r0 = r0.A0f()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0143
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0143
            X.0v0 r0 = r10.A04
            java.lang.String r0 = r0.A0h()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0143
            X.18U r0 = r10.A02
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "auth"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            if (r0 != 0) goto L_0x014c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/verifyRequester/invalid auth intent; data="
            X.C36321k7.A1J(r2, r0, r1)
        L_0x0143:
            java.lang.String r0 = "MigrationProviderOrderedBroadcastReceiver/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.setResultCode(r3)
            return
        L_0x014c:
            java.lang.String r2 = r0.getCreatorPackage()
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0143
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r0 = r11.getPackageName()
            int r0 = r1.checkSignatures(r2, r0)
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = X.C36321k7.A0D(r7, r6)
            java.lang.String r1 = X.C55212uG.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x018d
            byte[] r1 = X.C18750th.A0I(r11, r1)
            if (r1 == 0) goto L_0x018d
            java.lang.String r0 = "key_recovery_token"
            r5.putByteArray(r0, r1)
            r2 = 1
        L_0x017e:
            X.0v0 r0 = r10.A04
            byte[] r1 = X.C133306Xt.A06(r11, r0, r6, r4)
            if (r1 == 0) goto L_0x018f
            java.lang.String r0 = "key_backup_token"
            r5.putByteArray(r0, r1)
            goto L_0x00da
        L_0x018d:
            r2 = 0
            goto L_0x017e
        L_0x018f:
            if (r2 == 0) goto L_0x0143
            goto L_0x00da
        L_0x0193:
            java.lang.String r1 = r12.getAction()
            java.lang.String r0 = "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0143
            android.os.Bundle r0 = r10.getResultExtras(r4)
            X.0v0 r2 = r10.A04
            java.lang.String r1 = "migration_state_on_provider_side"
            int r0 = r0.getInt(r1, r3)
            X.C36321k7.A0q(r2, r1, r0)
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public MigrationProviderOrderedBroadcastReceiver(int i) {
        this.A0A = false;
        this.A09 = C36441kJ.A11();
    }

    public MigrationProviderOrderedBroadcastReceiver() {
        this(0);
    }
}
