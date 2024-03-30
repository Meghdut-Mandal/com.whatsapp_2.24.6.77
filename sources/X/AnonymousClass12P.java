package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.12P  reason: invalid class name */
public class AnonymousClass12P implements AnonymousClass004 {
    public final C19730wQ A00;
    public final C20000wr A01;
    public final AnonymousClass12f A02;
    public final File A03;
    public final ReentrantReadWriteLock.WriteLock A04;
    public final ReentrantReadWriteLock A05;
    public final AnonymousClass12W A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public AnonymousClass12P(C19700wN r21, C19730wQ r22, C19630wG r23, C19900wh r24, AnonymousClass12W r25, AnonymousClass12T r26, AnonymousClass11g r27, AnonymousClass12S r28, AnonymousClass12X r29, C20810yC r30, AnonymousClass12U r31, AnonymousClass005 r32) {
        Context context = r23.A00;
        File databasePath = context.getDatabasePath("msgstore.db");
        this.A03 = databasePath;
        AnonymousClass12Y r3 = new AnonymousClass12Y();
        C19900wh r15 = r24;
        r3.A04 = r15.A01.getBoolean("force_db_check", false);
        r3.A05 = true;
        C21000yV r4 = C21000yV.A02;
        C20810yC r5 = r30;
        r3.A06 = C20800yB.A01(r4, r5, 6482);
        r3.A00 = C20800yB.A01(r4, r5, 6136);
        r5.A0E(5472);
        r3.A03 = C20800yB.A01(r4, r5, 6992);
        r3.A01 = C20800yB.A01(r4, r5, 7142);
        r3.A02 = C20800yB.A01(r4, r5, 7283);
        C19700wN r7 = r21;
        AnonymousClass11g r10 = r27;
        AnonymousClass12S r11 = r28;
        AnonymousClass12X r12 = r29;
        this.A02 = new AnonymousClass12f(context, r7, new C219512b("msgstore.db"), new AnonymousClass12Z(r3), r10, r11, r12, databasePath, Collections.singleton(new AnonymousClass12a(r15, r26, this, r31, r32)));
        this.A00 = r22;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A05 = reentrantReadWriteLock;
        this.A04 = reentrantReadWriteLock.writeLock();
        this.A06 = r25;
        this.A01 = new C20000wr();
    }

    public static void A00(AnonymousClass12P r2) {
        AnonymousClass12f r0 = r2.A02;
        r0.close();
        File file = r0.A0B;
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore-manager/deletedb/result/");
        sb.append(file.delete() & C224014d.A04(file, "databasehelper"));
        Log.i(sb.toString());
    }

    public static void A01(AnonymousClass12P r6) {
        Log.i("msgstore-manager/setup");
        C18740tg.A0C(r6.A04.isHeldByCurrentThread());
        synchronized (r6) {
            AnonymousClass12f r5 = r6.A02;
            try {
                File file = r5.A0B;
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.delete();
                C224014d.A04(file, "databasehelper");
                AnonymousClass6YY.A0G(file, "msgstore/create-db/list ");
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 805306384);
                C18740tg.A06(openDatabase);
                r5.onCreate(openDatabase);
                AnonymousClass6YY.A0G(file, "msgstore/create-db/done/list ");
                r5.BJK();
                r6.A08 = true;
            } catch (Throwable th) {
                AnonymousClass6YY.A0G(r5.A0B, "msgstore/create-db/done/list ");
                throw th;
            }
        }
    }

    public void A06() {
        C20000wr r2 = this.A01;
        if (r2.A06()) {
            r2.A04(new AnonymousClass4YJ(this, 2));
            if (r2.A05()) {
                A0A((AnonymousClass13P) null, true);
            }
            r2.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
        return r5.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(X.AnonymousClass13P r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "msgstore-manager/checkhealth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r5.A04
            r3.lock()
            monitor-enter(r5)
            if (r7 == 0) goto L_0x0030
            X.0wr r4 = r5.A01     // Catch:{ all -> 0x00dc }
            monitor-enter(r4)     // Catch:{ all -> 0x00dc }
            int r2 = r4.A00     // Catch:{ all -> 0x002d }
            r1 = 3
            r0 = 0
            if (r2 <= r1) goto L_0x0017
            r0 = 1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0030
            boolean r1 = r5.A08     // Catch:{ all -> 0x00dc }
            r3.unlock()     // Catch:{ all -> 0x00ef }
            r4.A01()     // Catch:{ all -> 0x00ef }
            boolean r0 = r5.A08     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x002b
            if (r6 == 0) goto L_0x002b
            r6.BmP()     // Catch:{ all -> 0x00ef }
        L_0x002b:
            monitor-exit(r5)     // Catch:{ all -> 0x00ef }
            return r1
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x0030:
            boolean r0 = r5.A08     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00c4
            android.os.ConditionVariable r0 = X.C18740tg.A00     // Catch:{ all -> 0x00dc }
            X.0wr r0 = r5.A01     // Catch:{ all -> 0x00dc }
            r0.A03()     // Catch:{ all -> 0x00dc }
            java.io.File r4 = r5.A03     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00dc }
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "-journal"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dc }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00dc }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00dc }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "msgstore-manager/checkhealth/journal/delete "
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00dc }
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = ".back"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dc }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00dc }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00dc }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "msgstore-manager/checkhealth/back/delete "
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00dc }
            X.12f r0 = r5.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            r0.BJK()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            r0 = 1
            r5.A08 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            r5.A07 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth no db"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00c4
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00dc }
            A00(r5)     // Catch:{ all -> 0x00dc }
        L_0x00c4:
            r3.unlock()     // Catch:{ all -> 0x00ef }
            X.0wr r0 = r5.A01     // Catch:{ all -> 0x00ef }
            r0.A01()     // Catch:{ all -> 0x00ef }
            boolean r0 = r5.A08     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00d5
            r6.BmP()     // Catch:{ all -> 0x00ef }
        L_0x00d5:
            monitor-exit(r5)     // Catch:{ all -> 0x00ef }
            r5.A06()
            boolean r1 = r5.A08
            return r1
        L_0x00dc:
            r1 = move-exception
            r3.unlock()     // Catch:{ all -> 0x00ef }
            X.0wr r0 = r5.A01     // Catch:{ all -> 0x00ef }
            r0.A01()     // Catch:{ all -> 0x00ef }
            boolean r0 = r5.A08     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00ee
            if (r6 == 0) goto L_0x00ee
            r6.BmP()     // Catch:{ all -> 0x00ef }
        L_0x00ee:
            throw r1     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ef }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12P.A0A(X.13P, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r1.toString().contains("file is encrypted") != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ae, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/encrypted-file-error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/dbcorrupt", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5 A[Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }, ExcHandler: SQLiteDatabaseCorruptException (r1v5 'e' android.database.sqlite.SQLiteDatabaseCorruptException A[CUSTOM_DECLARE, Catch:{ all -> 0x00d8 }]), Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5 A[Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02() {
        /*
            r10 = this;
            r10.A06()
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x0009
            r0 = 0
            return r0
        L_0x0009:
            r10.A06()
            X.12f r4 = r10.A02
            X.1M0 r2 = r10.get()
            java.lang.Object r3 = r4.A0C     // Catch:{ all -> 0x00d8 }
            monitor-enter(r3)     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r1 = r4.A02     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x00cc
            X.14e r8 = r2.A02     // Catch:{ all -> 0x00d5 }
            java.lang.String r6 = "file is encrypted"
            java.lang.String r0 = "databasehelper/getInitialMessageCount"
            X.14g r7 = new X.14g     // Catch:{ all -> 0x00d5 }
            r7.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = "SELECT COUNT(*) as count FROM message"
            r1 = 0
            java.lang.String r0 = "GET_MESSAGES_COUNT"
            android.database.Cursor r9 = r8.A09(r5, r0, r1)     // Catch:{ SQLiteFullException -> 0x009e, SQLiteException -> 0x0075, SQLiteDatabaseCorruptException -> 0x00b5 }
            java.lang.String r0 = "count"
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0069 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0065
            int r8 = r9.getInt(r1)     // Catch:{ all -> 0x0069 }
            if (r8 <= 0) goto L_0x0041
            int r8 = r8 + -1
        L_0x0041:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r5.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "databasehelper/getInitialMessageCount "
            r5.append(r0)     // Catch:{ all -> 0x0069 }
            r5.append(r8)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = " | time spent:"
            r5.append(r0)     // Catch:{ all -> 0x0069 }
            long r0 = r7.A01()     // Catch:{ all -> 0x0069 }
            r5.append(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0069 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0069 }
            r9.close()     // Catch:{ SQLiteFullException -> 0x009e, SQLiteException -> 0x0075, SQLiteDatabaseCorruptException -> 0x00b5 }
            goto L_0x00bc
        L_0x0065:
            r9.close()     // Catch:{ SQLiteFullException -> 0x009e, SQLiteException -> 0x0075, SQLiteDatabaseCorruptException -> 0x00b5 }
            goto L_0x0085
        L_0x0069:
            r1 = move-exception
            if (r9 == 0) goto L_0x0074
            r9.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteFullException -> 0x009e, SQLiteException -> 0x0075, SQLiteDatabaseCorruptException -> 0x00b5 }
        L_0x0074:
            throw r1     // Catch:{ SQLiteFullException -> 0x009e, SQLiteException -> 0x0075, SQLiteDatabaseCorruptException -> 0x00b5 }
        L_0x0075:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            boolean r0 = r0.contains(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "databasehelper/getInitialMessageCount/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
        L_0x0085:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            r5.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            java.lang.String r0 = "databasehelper/getInitialMessageCount/nocursor | time spent:"
            r5.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            long r0 = r7.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            r5.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            java.lang.String r0 = r5.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
            goto L_0x00bb
        L_0x009e:
            r1 = move-exception
            X.AnonymousClass12f.A01(r1, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b5, SQLiteException -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d5 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "databasehelper/getInitialMessageCount/encrypted-file-error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00d5 }
            goto L_0x00bb
        L_0x00b4:
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/getInitialMessageCount/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00d5 }
        L_0x00bb:
            r8 = 0
        L_0x00bc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00d5 }
            r4.A02 = r1     // Catch:{ all -> 0x00d5 }
            r0 = 1
            if (r8 > r0) goto L_0x00c6
            r0 = 0
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d5 }
            r4.A01 = r0     // Catch:{ all -> 0x00d5 }
        L_0x00cc:
            int r0 = r1.intValue()     // Catch:{ all -> 0x00d5 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d5 }
            r2.close()
            return r0
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00dd }
            throw r1
        L_0x00dd:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12P.A02():int");
    }

    @Deprecated
    public int A03() {
        return A02();
    }

    /* renamed from: A04 */
    public AnonymousClass1M0 get() {
        A06();
        ReentrantReadWriteLock.ReadLock readLock = this.A05.readLock();
        A06();
        return new AnonymousClass1M0(this.A02, readLock, false);
    }

    public AnonymousClass1M0 A05() {
        A06();
        ReentrantReadWriteLock.ReadLock readLock = this.A05.readLock();
        A06();
        return new AnonymousClass1M0(this.A02, readLock, true);
    }

    public boolean A07() {
        return this.A07;
    }

    public boolean A08() {
        A06();
        return this.A08;
    }

    public boolean A09() {
        return this.A08;
    }
}
