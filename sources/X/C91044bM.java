package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4bM  reason: invalid class name and case insensitive filesystem */
public final class C91044bM extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final C114455hH A03;
    public final boolean A04;
    public final C130666Ly A05;
    public final AnonymousClass6KP A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91044bM(android.content.Context r9, X.C130666Ly r10, X.C114455hH r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r4 = r12
            r6 = 16
            X.6ZL r7 = new X.6ZL
            r7.<init>(r10, r11)
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A02 = r9
            r8.A03 = r11
            r8.A05 = r10
            r8.A04 = r13
            if (r12 != 0) goto L_0x001c
            java.lang.String r4 = X.C90464aC.A0V()
        L_0x001c:
            java.io.File r1 = r9.getCacheDir()
            X.AnonymousClass00C.A08(r1)
            X.6KP r0 = new X.6KP
            r0.<init>(r1, r4)
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91044bM.<init>(android.content.Context, X.6Ly, X.5hH, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|(1:4)|6|7|(4:9|10|(1:12)|13)|18|(2:22|(1:24))|25|26|27|28|29|30|31|32|56|57|(1:59)(1:60)|(3:61|62|(1:64))|65|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (getDatabaseName() == null) goto L_0x000f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C162177o9 A00() {
        /*
            r8 = this;
            r7 = 1
            X.6KP r4 = r8.A06     // Catch:{ all -> 0x00d9 }
            boolean r0 = r8.A01     // Catch:{ all -> 0x00d9 }
            r6 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = r8.getDatabaseName()     // Catch:{ all -> 0x00d9 }
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.util.concurrent.locks.Lock r3 = r4.A02     // Catch:{ all -> 0x00d9 }
            r3.lock()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x003b
            java.io.File r1 = r4.A01     // Catch:{ IOException -> 0x0030 }
            java.io.File r0 = r1.getParentFile()     // Catch:{ IOException -> 0x0030 }
            if (r0 == 0) goto L_0x0022
            r0.mkdirs()     // Catch:{ IOException -> 0x0030 }
        L_0x0022:
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r1)     // Catch:{ IOException -> 0x0030 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0030 }
            r0.lock()     // Catch:{ IOException -> 0x0030 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r2 = move-exception
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "SupportSQLiteLock"
            java.lang.String r0 = "Unable to grab file lock."
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x00d9 }
        L_0x003b:
            r8.A00 = r6     // Catch:{ all -> 0x00d9 }
            java.lang.String r5 = r8.getDatabaseName()     // Catch:{ all -> 0x00d9 }
            if (r5 == 0) goto L_0x0067
            android.content.Context r0 = r8.A02     // Catch:{ all -> 0x00d9 }
            java.io.File r0 = r0.getDatabasePath(r5)     // Catch:{ all -> 0x00d9 }
            java.io.File r2 = r0.getParentFile()     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x0067
            r2.mkdirs()     // Catch:{ all -> 0x00d9 }
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "Invalid database parent file, not a directory: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x00d9 }
        L_0x0067:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x006f }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x006f }
            goto L_0x00b7
        L_0x006f:
            super.close()     // Catch:{ all -> 0x00d9 }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0077 }
        L_0x0077:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x007f }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x007f }
            goto L_0x00b7
        L_0x007f:
            r1 = move-exception
            super.close()     // Catch:{ all -> 0x00d9 }
            boolean r0 = r1 instanceof X.AnonymousClass78Q     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00a1
            X.78Q r1 = (X.AnonymousClass78Q) r1     // Catch:{ all -> 0x00d9 }
            java.lang.Throwable r2 = r1.cause     // Catch:{ all -> 0x00d9 }
            X.5SX r0 = r1.callbackName     // Catch:{ all -> 0x00d9 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x00d9 }
            if (r1 == r6) goto L_0x00a0
            if (r1 == r7) goto L_0x00a0
            r0 = 2
            if (r1 == r0) goto L_0x00a0
            r0 = 3
            if (r1 == r0) goto L_0x00a0
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x00ab
        L_0x00a0:
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x00a1:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d8
            if (r5 == 0) goto L_0x00d8
            boolean r0 = r8.A04     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d8
        L_0x00ab:
            android.content.Context r0 = r8.A02     // Catch:{ all -> 0x00d9 }
            r0.deleteDatabase(r5)     // Catch:{ all -> 0x00d9 }
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ 78Q -> 0x00d4 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ 78Q -> 0x00d4 }
        L_0x00b7:
            boolean r0 = r8.A00     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00c3
            r8.close()     // Catch:{ all -> 0x00d9 }
            X.7o9 r1 = r8.A00()     // Catch:{ all -> 0x00d9 }
            goto L_0x00c9
        L_0x00c3:
            X.5hH r0 = r8.A03     // Catch:{ all -> 0x00d9 }
            X.6iP r1 = X.C109375Xi.A00(r1, r0)     // Catch:{ all -> 0x00d9 }
        L_0x00c9:
            java.nio.channels.FileChannel r0 = r4.A00     // Catch:{ IOException -> 0x00d0 }
            if (r0 == 0) goto L_0x00d0
            r0.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            r3.unlock()
            return r1
        L_0x00d4:
            r0 = move-exception
            java.lang.Throwable r0 = r0.cause     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r2 = move-exception
            X.6KP r1 = r8.A06
            java.nio.channels.FileChannel r0 = r1.A00     // Catch:{ IOException -> 0x00e3 }
            if (r0 == 0) goto L_0x00e3
            r0.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00e3:
            java.util.concurrent.locks.Lock r0 = r1.A02
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91044bM.A00():X.7o9");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        try {
            C109375Xi.A00(sQLiteDatabase, this.A03);
        } catch (Throwable th) {
            throw new AnonymousClass78Q(AnonymousClass5SX.ON_CONFIGURE, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.database.sqlite.SQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.6Ly r5 = r6.A05     // Catch:{ all -> 0x0066 }
            X.5hH r0 = r6.A03     // Catch:{ all -> 0x0066 }
            X.6iP r4 = X.C109375Xi.A00(r7, r0)     // Catch:{ all -> 0x0066 }
            X.4oj r5 = (X.C97264oj) r5     // Catch:{ all -> 0x0066 }
            r1 = 0
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r3 = X.C138616iP.A00(r4, r0)     // Catch:{ all -> 0x0066 }
            r2 = 1
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r3.close()     // Catch:{ all -> 0x0066 }
            X.6Nf r1 = r5.A01     // Catch:{ all -> 0x0066 }
            r1.A03(r4)     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0046
            X.5ns r2 = r1.A02(r4)     // Catch:{ all -> 0x0066 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0066 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x0066 }
            goto L_0x0065
        L_0x0046:
            X.C97264oj.A00(r4)     // Catch:{ all -> 0x0066 }
            androidx.work.impl.WorkDatabase_Impl r3 = r1.A00     // Catch:{ all -> 0x0066 }
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005e
            r2 = 0
            int r1 = r0.size()     // Catch:{ all -> 0x0066 }
        L_0x0054:
            if (r2 >= r1) goto L_0x005e
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x0066 }
            r0.get(r2)     // Catch:{ all -> 0x0066 }
            int r2 = r2 + 1
            goto L_0x0054
        L_0x005e:
            return
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r2 = move-exception
            X.5SX r1 = X.AnonymousClass5SX.ON_CREATE
            X.78Q r0 = new X.78Q
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91044bM.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            ((C97264oj) this.A05).A02(C109375Xi.A00(sQLiteDatabase, this.A03), i, i2);
        } catch (Throwable th) {
            throw new AnonymousClass78Q(AnonymousClass5SX.ON_DOWNGRADE, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0116, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x0124
            X.6Ly r8 = r11.A05     // Catch:{ all -> 0x011b }
            X.5hH r0 = r11.A03     // Catch:{ all -> 0x011b }
            X.6iP r10 = X.C109375Xi.A00(r12, r0)     // Catch:{ all -> 0x011b }
            X.4oj r8 = (X.C97264oj) r8     // Catch:{ all -> 0x011b }
            r4 = 0
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = X.C138616iP.A00(r10, r0)     // Catch:{ all -> 0x011b }
            r1 = 1
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0027
            int r0 = r2.getInt(r4)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            r2.close()     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            X.6iX r0 = new X.6iX     // Catch:{ all -> 0x011b }
            r0.<init>(r1)     // Catch:{ all -> 0x011b }
            android.database.Cursor r2 = r10.Bmd(r0)     // Catch:{ all -> 0x011b }
            r3 = 0
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r3 = r2.getString(r4)     // Catch:{ all -> 0x0114 }
        L_0x0043:
            r2.close()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "5181942b9ebc31ce68dacb56c16fd79f"
            boolean r0 = r2.equals(r3)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "ae2044fb577e65ee8bb576ca48a2f06e"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            r1.append(r2)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = ", found: "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0g(r3, r1)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x006d:
            X.6Nf r0 = r8.A01     // Catch:{ all -> 0x011b }
            X.5ns r2 = r0.A02(r10)     // Catch:{ all -> 0x011b }
            boolean r0 = r2.A01     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0104
            X.C97264oj.A00(r10)     // Catch:{ all -> 0x011b }
        L_0x007a:
            X.6Nf r0 = r8.A01     // Catch:{ all -> 0x011b }
            androidx.work.impl.WorkDatabase_Impl r9 = r0.A00     // Catch:{ all -> 0x011b }
            r9.A0B = r10     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "PRAGMA foreign_keys = ON"
            r10.B6z(r0)     // Catch:{ all -> 0x011b }
            X.65D r3 = r9.A06     // Catch:{ all -> 0x011b }
            java.lang.Object r2 = r3.A02     // Catch:{ all -> 0x011b }
            monitor-enter(r2)     // Catch:{ all -> 0x011b }
            boolean r0 = r3.A0C     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0096
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Invalidation tracker is initialized twice :/."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0101 }
            goto L_0x00bd
        L_0x0096:
            java.lang.String r0 = "PRAGMA temp_store = MEMORY;"
            r10.B6z(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "PRAGMA recursive_triggers='ON';"
            r10.B6z(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            r10.B6z(r0)     // Catch:{ all -> 0x0101 }
            r3.A00(r10)     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            android.database.sqlite.SQLiteDatabase r0 = r10.A00     // Catch:{ all -> 0x0101 }
            android.database.sqlite.SQLiteStatement r1 = r0.compileStatement(r1)     // Catch:{ all -> 0x0101 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0101 }
            X.4ok r0 = new X.4ok     // Catch:{ all -> 0x0101 }
            r0.<init>(r1)     // Catch:{ all -> 0x0101 }
            r3.A0B = r0     // Catch:{ all -> 0x0101 }
            r0 = 1
            r3.A0C = r0     // Catch:{ all -> 0x0101 }
        L_0x00bd:
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00fd
            r7 = 0
            int r6 = r0.size()     // Catch:{ all -> 0x011b }
        L_0x00c7:
            if (r7 >= r6) goto L_0x00fd
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x011b }
            r0.get(r7)     // Catch:{ all -> 0x011b }
            android.database.sqlite.SQLiteDatabase r5 = r10.A00     // Catch:{ all -> 0x011b }
            r5.beginTransaction()     // Catch:{ all -> 0x011b }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < "
            r4.append(r0)     // Catch:{ all -> 0x00f8 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f8 }
            long r0 = X.C112545e4.A00     // Catch:{ all -> 0x00f8 }
            long r2 = r2 - r0
            r4.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r4)     // Catch:{ all -> 0x00f8 }
            r10.B6z(r0)     // Catch:{ all -> 0x00f8 }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x00f8 }
            r5.endTransaction()     // Catch:{ all -> 0x011b }
            int r7 = r7 + 1
            goto L_0x00c7
        L_0x00f8:
            r1 = move-exception
            r5.endTransaction()     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x00fd:
            r0 = 0
            r8.A00 = r0     // Catch:{ all -> 0x011b }
            goto L_0x0124
        L_0x0101:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x0104:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x011b }
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x0114:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ all -> 0x011b }
        L_0x011a:
            throw r1     // Catch:{ all -> 0x011b }
        L_0x011b:
            r2 = move-exception
            X.5SX r1 = X.AnonymousClass5SX.ON_OPEN
            X.78Q r0 = new X.78Q
            r0.<init>(r1, r2)
            throw r0
        L_0x0124:
            r0 = 1
            r11.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91044bM.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            this.A05.A02(C109375Xi.A00(sQLiteDatabase, this.A03), i, i2);
        } catch (Throwable th) {
            throw new AnonymousClass78Q(AnonymousClass5SX.ON_UPGRADE, th);
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            AnonymousClass6KP r4 = this.A06;
            Lock lock = r4.A02;
            lock.lock();
            super.close();
            this.A03.A00 = null;
            this.A01 = false;
            try {
                FileChannel fileChannel = r4.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            AnonymousClass6KP r1 = this.A06;
            try {
                FileChannel fileChannel2 = r1.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            r1.A02.unlock();
            throw th;
        }
    }
}
