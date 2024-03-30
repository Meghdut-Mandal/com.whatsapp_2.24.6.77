package X;

/* renamed from: X.6sa  reason: invalid class name and case insensitive filesystem */
public class C144646sa implements C30631aW {
    public final C133116Wv A00;
    public final C20690y0 A01;

    public /* synthetic */ void BV3() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV2() {
        /*
            r23 = this;
            r4 = r23
            X.0y0 r3 = r4.A01
            java.io.File r0 = r3.A0B()
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            X.AnonymousClass6YY.A0E(r0, r1)
            java.io.File r0 = r3.A0A()
            X.AnonymousClass6YY.A0E(r0, r1)
            java.io.File r0 = r3.A0D()
            X.AnonymousClass6YY.A0E(r0, r1)
            X.3BP r0 = r3.A08()
            java.io.File r0 = r0.A06
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            X.AnonymousClass6YY.A0E(r0, r1)
            X.3BP r0 = r3.A08()
            java.io.File r0 = r0.A07
            X.AnonymousClass6YY.A0E(r0, r1)
            X.6Wv r2 = r4.A00
            X.12U r0 = r2.A07
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01b0
            X.179 r0 = r2.A02
            r18 = r0
            java.io.File r0 = r18.A05()
            if (r0 == 0) goto L_0x01b0
            int r0 = X.C133116Wv.A01(r2)
            r5 = 5
            if (r0 == r5) goto L_0x01b0
            r7 = 1
            r6 = 0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp"
            java.io.File r12 = X.C36441kJ.A0w(r1, r0)
            java.io.File r8 = r18.A05()
            X.C18740tg.A06(r8)
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.A08
            boolean r0 = r11.compareAndSet(r6, r7)
            if (r0 == 0) goto L_0x01b0
            boolean r10 = r18.A0A()     // Catch:{ all -> 0x01ab }
            int r1 = X.C133116Wv.A01(r2)     // Catch:{ all -> 0x01ab }
            if (r1 == r5) goto L_0x019f
            X.0zA r0 = r2.A00     // Catch:{ all -> 0x01ab }
            boolean r0 = r0.A00     // Catch:{ all -> 0x01ab }
            r4 = 0
            if (r0 == 0) goto L_0x007e
            X.C133116Wv.A03(r4, r2, r5)     // Catch:{ all -> 0x01ab }
            goto L_0x008a
        L_0x007e:
            X.0yE r0 = r2.A04     // Catch:{ all -> 0x01ab }
            boolean r0 = r0.A0D()     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x008d
            r0 = 7
            X.C133116Wv.A03(r4, r2, r0)     // Catch:{ all -> 0x01ab }
        L_0x008a:
            r0 = 0
            goto L_0x01a0
        L_0x008d:
            boolean r0 = r12.exists()     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x00a2
            if (r1 != 0) goto L_0x00a2
            X.0v0 r0 = r2.A05     // Catch:{ all -> 0x01ab }
            r0.A17(r5)     // Catch:{ all -> 0x01ab }
            X.C133116Wv.A03(r4, r2, r7)     // Catch:{ all -> 0x01ab }
            r0.A1q(r10)     // Catch:{ all -> 0x01ab }
            goto L_0x019f
        L_0x00a2:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01ab }
            r14 = 3
            if (r1 == 0) goto L_0x00b6
            r0 = 9
            if (r1 >= r14) goto L_0x00af
            r0 = 8
        L_0x00af:
            X.C133116Wv.A03(r4, r2, r0)     // Catch:{ all -> 0x01ab }
            r0 = 2
            if (r1 <= r0) goto L_0x00d7
            goto L_0x00cd
        L_0x00b6:
            X.0v0 r3 = r2.A05     // Catch:{ all -> 0x01ab }
            r3.A1q(r6)     // Catch:{ all -> 0x01ab }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ab }
            android.content.SharedPreferences$Editor r15 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x01ab }
            java.lang.String r13 = "ext_dir_migration_start_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ab }
            r0.commit()     // Catch:{ all -> 0x01ab }
            goto L_0x00f7
        L_0x00cd:
            java.util.HashSet r0 = X.C36441kJ.A16()     // Catch:{ all -> 0x01ab }
            r0.add(r8)     // Catch:{ all -> 0x01ab }
            X.C133116Wv.A04(r2, r8, r9, r0)     // Catch:{ all -> 0x01ab }
        L_0x00d7:
            X.0v0 r3 = r2.A05     // Catch:{ all -> 0x01ab }
            r0 = -1
            android.content.SharedPreferences$Editor r15 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x01ab }
            java.lang.String r13 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ab }
            r0.commit()     // Catch:{ all -> 0x01ab }
            r0 = -1
            android.content.SharedPreferences$Editor r15 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x01ab }
            java.lang.String r13 = "ext_dir_migration_rescan_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01ab }
            r0.commit()     // Catch:{ all -> 0x01ab }
        L_0x00f7:
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r3)     // Catch:{ all -> 0x01ab }
            java.lang.String r15 = "external_dir_migration_attempt_n"
            long r0 = X.C36371kC.A08(r0, r15)     // Catch:{ all -> 0x01ab }
            r16 = 1
            long r0 = r0 + r16
            android.content.SharedPreferences$Editor r13 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x01ab }
            android.content.SharedPreferences$Editor r0 = r13.putLong(r15, r0)     // Catch:{ all -> 0x01ab }
            r0.commit()     // Catch:{ all -> 0x01ab }
            r3.A17(r7)     // Catch:{ all -> 0x01ab }
            r0 = r18
            X.005 r0 = r0.A01     // Catch:{ all -> 0x01ab }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ab }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x01ab }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x01ab }
            r1 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x01ab }
            r13.<init>(r6)     // Catch:{ all -> 0x01ab }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ab }
            android.util.SparseIntArray r17 = new android.util.SparseIntArray     // Catch:{ all -> 0x01ab }
            r17.<init>()     // Catch:{ all -> 0x01ab }
            r22 = r10 ^ 1
            X.5uX r0 = new X.5uX     // Catch:{ all -> 0x01ab }
            r0.<init>(r2, r9, r13, r1)     // Catch:{ all -> 0x01ab }
            r20 = r12
            r21 = r8
            r18 = r0
            r19 = r2
            X.C133116Wv.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01ab }
            r3.A17(r14)     // Catch:{ all -> 0x01ab }
            long r0 = X.C90514aH.A0J(r15)     // Catch:{ all -> 0x01ab }
            android.content.SharedPreferences$Editor r14 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x01ab }
            java.lang.String r8 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r8, r0)     // Catch:{ all -> 0x01ab }
            r0.commit()     // Catch:{ all -> 0x01ab }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x0189
            boolean r17 = r13.get()     // Catch:{ all -> 0x01ab }
            r0 = 4
            r3.A17(r0)     // Catch:{ all -> 0x01ab }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ab }
            X.0yb r1 = r2.A03     // Catch:{ all -> 0x01ab }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ab }
            X.C133116Wv.A02(r0, r1, r12)     // Catch:{ all -> 0x01ab }
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ab }
            X.C133116Wv.A02(r0, r1, r12)     // Catch:{ all -> 0x01ab }
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ab }
            X.C133116Wv.A02(r0, r1, r12)     // Catch:{ all -> 0x01ab }
            X.738 r1 = new X.738     // Catch:{ all -> 0x01ab }
            r12 = r1
            r13 = r2
            r16 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x01ab }
            X.0y0 r0 = r2.A01     // Catch:{ all -> 0x01ab }
            r0.A0g(r1, r9)     // Catch:{ all -> 0x01ab }
            goto L_0x019f
        L_0x0189:
            r3.A17(r5)     // Catch:{ all -> 0x01ab }
            X.C133116Wv.A03(r4, r2, r7)     // Catch:{ all -> 0x01ab }
            r3.A1q(r10)     // Catch:{ all -> 0x01ab }
            boolean r0 = r13.get()     // Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x019f
            X.0z4 r1 = r2.A06     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "ExternalDirMigration"
            r1.A03(r0)     // Catch:{ all -> 0x01ab }
        L_0x019f:
            r0 = 1
        L_0x01a0:
            r11.set(r6)
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = "MessageIODailyCron/onDailyCronNoMessageStore: storage successfully migrated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01ab:
            r0 = move-exception
            r11.set(r6)
            throw r0
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144646sa.BV2():void");
    }

    public C144646sa(C133116Wv r1, C20690y0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
