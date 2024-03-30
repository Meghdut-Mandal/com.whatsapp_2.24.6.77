package X;

import android.content.Context;

/* renamed from: X.5Mq  reason: invalid class name and case insensitive filesystem */
public class C107125Mq extends C132446Tt {
    public final int A00;
    public final long A01;
    public final Context A02;
    public final C24331Ca A03;
    public final AnonymousClass1G5 A04;
    public final C21060yb A05;
    public final C144596sV A06;
    public final AnonymousClass5FU A07;
    public final AnonymousClass1Q9 A08;
    public final C24391Cg A09;
    public final C21380z9 A0A;
    public final AnonymousClass005 A0B;
    public final C19970wo A0C;

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            X.6sV r5 = r13.A06
            int r4 = r13.A00
            X.0yC r2 = r5.A0E
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 2997(0xbb5, float:4.2E-42)
            boolean r0 = r2.A0E(r0)
            r3 = 1
            if (r0 == 0) goto L_0x00f7
            if (r4 == 0) goto L_0x00f7
            X.1Ck r7 = r5.A05
            X.0v0 r0 = r7.A03
            boolean r0 = r0.A2I()
            if (r0 == 0) goto L_0x0045
            X.5U6 r8 = X.AnonymousClass5U6.CRYPT15
        L_0x0021:
            X.1Q9 r10 = r5.A0D
            java.util.List r6 = r10.A0O(r3)
            boolean r1 = r6.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x00f7
            java.lang.Object r6 = r6.get(r0)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r0 = r6.getName()
            X.5U6 r0 = X.C110565as.A00(r0)
            if (r0 == 0) goto L_0x00f7
            int r0 = r0.version
            int r1 = r8.version
            if (r0 != r1) goto L_0x00f7
            goto L_0x0048
        L_0x0045:
            X.5U6 r8 = X.AnonymousClass5U6.CRYPT14
            goto L_0x0021
        L_0x0048:
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT14     // Catch:{ SecurityException -> 0x00f7 }
            int r0 = r0.version     // Catch:{ SecurityException -> 0x00f7 }
            if (r1 > r0) goto L_0x0067
            X.0wG r0 = r5.A09     // Catch:{ SecurityException -> 0x00f7 }
            java.io.File r1 = X.C90514aH.A0j(r0)     // Catch:{ SecurityException -> 0x00f7 }
            java.lang.String r0 = "key"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)     // Catch:{ SecurityException -> 0x00f7 }
            long r8 = r0.lastModified()     // Catch:{ SecurityException -> 0x00f7 }
        L_0x005e:
            long r6 = r6.lastModified()     // Catch:{ SecurityException -> 0x00f7 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00f7
            goto L_0x007a
        L_0x0067:
            X.1Ci r0 = r7.A01     // Catch:{ SecurityException -> 0x00f7 }
            X.0wG r0 = r0.A00     // Catch:{ SecurityException -> 0x00f7 }
            java.io.File r1 = X.C90514aH.A0j(r0)     // Catch:{ SecurityException -> 0x00f7 }
            java.lang.String r0 = "encrypted_backup.key"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)     // Catch:{ SecurityException -> 0x00f7 }
            long r8 = r0.lastModified()     // Catch:{ SecurityException -> 0x00f7 }
            goto L_0x005e
        L_0x007a:
            r0 = 3190(0xc76, float:4.47E-42)
            long r8 = X.C36441kJ.A0B(r2, r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 * r0
            r0 = 5005(0x138d, float:7.013E-42)
            long r6 = X.C36441kJ.A0B(r2, r0)
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 * r0
            long r8 = r8 + r6
            java.util.List r1 = r10.A0O(r3)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f7
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            java.io.File r0 = (java.io.File) r0
            long r0 = r0.lastModified()
            long r6 = r6 - r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00f7
            r0 = 3189(0xc75, float:4.469E-42)
            int r8 = r2.A07(r0)
            X.3Sy r0 = r5.A06
            X.12P r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ff }
            X.1M0 r9 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ff }
            X.14e r6 = r9.A02     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "SELECT count(*) as count FROM backup_changes"
            r1 = 0
            java.lang.String r0 = "BackupChangesStore/COUNT_MODIFICATIONS"
            android.database.Cursor r2 = r6.A09(r2, r0, r1)     // Catch:{ all -> 0x00ed }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "count"
            long r6 = X.C36351kA.A07(r2, r0)     // Catch:{ all -> 0x00e1 }
            r2.close()     // Catch:{ all -> 0x00ed }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ff }
            goto L_0x0106
        L_0x00d8:
            r2.close()     // Catch:{ all -> 0x00ed }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ff }
            r6 = -1
            goto L_0x0106
        L_0x00e1:
            r1 = move-exception
            if (r2 == 0) goto L_0x00ec
            r2.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ff }
        L_0x00f6:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ff }
        L_0x00f7:
            r5.A0S = r3
            goto L_0x00fd
        L_0x00fa:
            r0 = 3
            r5.A0S = r0
        L_0x00fd:
            r8 = 1
            goto L_0x0117
        L_0x00ff:
            java.lang.String r0 = "BackupChangesStore/corrupt db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = -1
        L_0x0106:
            long r1 = (long) r8
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fa
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00fa
            r8 = 0
            if (r0 == 0) goto L_0x0117
            r8 = 2
            r5.A0S = r8
        L_0x0117:
            if (r8 != 0) goto L_0x011e
            java.lang.Integer r0 = X.C36371kC.A0p()
            return r0
        L_0x011e:
            X.0yb r0 = r13.A05
            android.os.PowerManager r1 = r0.A0G()
            r6 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0134
            java.lang.String r0 = "BackupAsyncTask/backup PowerManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x012d:
            java.lang.String r12 = "BackupAsyncTask/backup/local/wl/release"
            java.lang.String r7 = "BackupAsyncTask/backup/local/wl/releasing "
            if (r6 == 0) goto L_0x013e
            goto L_0x013b
        L_0x0134:
            java.lang.String r0 = "backupdb"
            android.os.PowerManager$WakeLock r6 = X.C111765co.A00(r1, r0, r3)
            goto L_0x012d
        L_0x013b:
            r6.acquire()     // Catch:{ Exception -> 0x01bb }
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r0 = "BackupAsyncTask/backup/local/wl/acquire "
            X.C36321k7.A1K(r6, r0, r1)     // Catch:{ Exception -> 0x01bb }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01bb }
            android.content.Context r2 = r13.A02     // Catch:{ Exception -> 0x01bb }
            X.1Ca r1 = r13.A03     // Catch:{ Exception -> 0x01bb }
            X.1Cg r0 = r13.A09     // Catch:{ Exception -> 0x01bb }
            X.AnonymousClass6YO.A0A(r2, r1, r0)     // Catch:{ Exception -> 0x01bb }
            X.005 r0 = r13.A0B     // Catch:{ Exception -> 0x01bb }
            java.util.Iterator r9 = X.C90474aD.A0q(r0)     // Catch:{ Exception -> 0x01bb }
        L_0x015a:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x0187
            java.lang.Object r3 = r9.next()     // Catch:{ Exception -> 0x01bb }
            X.1CP r3 = (X.AnonymousClass1CP) r3     // Catch:{ Exception -> 0x01bb }
            java.lang.String r2 = r3.A0J()     // Catch:{ Exception -> 0x01bb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r0 = "BackupAsyncTask/backup/local/"
            X.C36321k7.A1Q(r0, r2, r1)     // Catch:{ Exception -> 0x01bb }
            X.6PN r0 = r3.A0D()     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x015a
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x015a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r0 = "BackupAsyncTask/backup/local/failed-to-generate-backup "
            X.C36321k7.A1P(r0, r2, r1)     // Catch:{ Exception -> 0x01bb }
            goto L_0x015a
        L_0x0187:
            X.1Q9 r3 = r13.A08     // Catch:{ Exception -> 0x01bb }
            r0 = 0
            X.5Zc r2 = new X.5Zc     // Catch:{ Exception -> 0x01bb }
            r2.<init>(r13, r0)     // Catch:{ Exception -> 0x01bb }
            r1 = 26
            X.3wU r0 = new X.3wU     // Catch:{ Exception -> 0x01bb }
            r0.<init>((java.lang.Object) r13, (int) r1)     // Catch:{ Exception -> 0x01bb }
            int r5 = r3.A0D(r2, r0, r8, r4)     // Catch:{ Exception -> 0x01bb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r0 = "BackupAsyncTask/backup/local/msgstore/result/"
            X.C36321k7.A1T(r0, r1, r5)     // Catch:{ Exception -> 0x01bb }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01bb }
            long r3 = r13.A01     // Catch:{ Exception -> 0x01bb }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c1
            long r8 = r8 - r10
            long r3 = r3 - r8
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c1
            if (r5 != 0) goto L_0x01c1
            android.os.SystemClock.sleep(r3)     // Catch:{ Exception -> 0x01bb }
            goto L_0x01c1
        L_0x01bb:
            r1 = move-exception
            java.lang.String r0 = "BackupAsyncTask/backup/local/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01de }
        L_0x01c1:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C36321k7.A1K(r6, r7, r0)
            if (r6 == 0) goto L_0x01d0
            r6.release()
            com.whatsapp.util.Log.i((java.lang.String) r12)
        L_0x01d0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupAsyncTask/backup/local/result = "
            X.C36321k7.A1T(r0, r1, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        L_0x01de:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C36321k7.A1K(r6, r7, r0)
            if (r6 == 0) goto L_0x01ee
            r6.release()
            com.whatsapp.util.Log.i((java.lang.String) r12)
        L_0x01ee:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107125Mq.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r1.isFinishing() == false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[LOOP:0: B:8:0x0028->B:10:0x002e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupAsyncTask/backup/done "
            X.C36321k7.A1K(r4, r0, r1)
            X.1G5 r0 = r3.A04
            X.1G6 r1 = r0.A00()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x003a
            X.4Uf r1 = r1.A00()
        L_0x0019:
            r1.BVD()
        L_0x001c:
            X.5FU r0 = r3.A07
            if (r4 == 0) goto L_0x0038
            int r2 = r4.intValue()
        L_0x0024:
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.next()
            X.7ky r0 = (X.C160417ky) r0
            r0.BQw(r2)
            goto L_0x0028
        L_0x0038:
            r2 = 1
            goto L_0x0024
        L_0x003a:
            X.4Uf r1 = r1.A00
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x001c
            goto L_0x0019
        L_0x0045:
            X.0z9 r2 = r3.A0A
            r1 = 0
            java.lang.String r0 = "db_backup"
            r2.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107125Mq.A0C(java.lang.Object):void");
    }

    public C107125Mq(Context context, C24331Ca r2, AnonymousClass1G5 r3, C21060yb r4, C19970wo r5, C144596sV r6, AnonymousClass5FU r7, AnonymousClass1Q9 r8, C24391Cg r9, C21380z9 r10, AnonymousClass005 r11, int i, long j) {
        this.A06 = r6;
        this.A00 = i;
        this.A0C = r5;
        this.A02 = context;
        this.A01 = j;
        this.A0B = r11;
        this.A05 = r4;
        this.A03 = r2;
        this.A08 = r8;
        this.A07 = r7;
        this.A0A = r10;
        this.A09 = r9;
        this.A04 = r3;
    }
}
