package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.16q  reason: invalid class name and case insensitive filesystem */
public abstract class C229616q extends SQLiteOpenHelper implements AnonymousClass004, AnonymousClass12e {
    public static volatile C229916t A06;
    public C224114e A00;
    public final C219512b A01;
    public final ReentrantReadWriteLock A02;
    public final Context A03;
    public final C229916t A04;
    public final C19700wN A05;

    public abstract C224114e A07();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized X.C224114e BJK() {
        /*
            r11 = this;
            r10 = r11
            boolean r0 = r11 instanceof X.C229716r
            if (r0 == 0) goto L_0x0135
            r5 = r11
            X.16r r5 = (X.C229716r) r5
            monitor-enter(r10)
            X.14e r0 = r5.A00     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0019
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x014c }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0019
            X.14e r0 = r5.A00     // Catch:{ all -> 0x014c }
            goto L_0x014a
        L_0x0019:
            X.C224714l.A02()     // Catch:{ all -> 0x014c }
            X.14e r0 = r5.A07()     // Catch:{ all -> 0x0130 }
            r5.A00 = r0     // Catch:{ all -> 0x0130 }
            java.lang.String r6 = "WaDatabaseHelper"
            java.lang.String r0 = "creating contacts database version 95"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0130 }
            X.14e r8 = r5.A00     // Catch:{ all -> 0x0130 }
            r1 = 0
            if (r8 == 0) goto L_0x002f
            r1 = 1
        L_0x002f:
            java.lang.String r0 = "WaDatabaseHelperprepareWritableDatabase/database is not initialized"
            X.C18740tg.A0F(r1, r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r9 = "wa_db_schema_version"
            X.0wh r0 = r5.A01     // Catch:{ all -> 0x0130 }
            android.content.SharedPreferences r4 = r0.A01     // Catch:{ all -> 0x0130 }
            java.lang.String r3 = "force_wadb_check"
            r0 = 0
            boolean r0 = r4.getBoolean(r3, r0)     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x0081
            java.lang.String r1 = "wa_props"
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C224614k.A00(r8, r0, r1)     // Catch:{ all -> 0x0130 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x0119
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0130 }
            r0 = 0
            r2[r0] = r9     // Catch:{ all -> 0x0130 }
            java.lang.String r1 = "SELECT prop_value FROM wa_props WHERE prop_name = ?"
            java.lang.String r0 = "WADB_SELECT_PROPS_VALUE_BY_NAME"
            android.database.Cursor r2 = r8.A09(r1, r0, r2)     // Catch:{ all -> 0x0130 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "prop_value"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r7 = r2.getString(r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0116
        L_0x0073:
            r1 = move-exception
            if (r2 == 0) goto L_0x012f
            r2.close()     // Catch:{ all -> 0x007b }
            goto L_0x012f
        L_0x007b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x012f
        L_0x0081:
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0130 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0130 }
            r0.beginTransaction()     // Catch:{ all -> 0x0130 }
            X.38G r0 = new X.38G     // Catch:{ all -> 0x0127 }
            r0.<init>()     // Catch:{ all -> 0x0127 }
            X.38H r8 = new X.38H     // Catch:{ all -> 0x0127 }
            r8.<init>(r0)     // Catch:{ all -> 0x0127 }
            X.3Qo r7 = new X.3Qo     // Catch:{ all -> 0x0127 }
            r7.<init>()     // Catch:{ all -> 0x0127 }
            X.12X r0 = r5.A04     // Catch:{ all -> 0x0127 }
            X.005 r0 = r0.A00     // Catch:{ all -> 0x0127 }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x0127 }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x0127 }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x0127 }
        L_0x00a5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0127 }
            X.15z r0 = (X.AnonymousClass15z) r0     // Catch:{ all -> 0x0127 }
            r0.B7q(r8, r7)     // Catch:{ all -> 0x0127 }
            goto L_0x00a5
        L_0x00b5:
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            r7.A02(r0, r8)     // Catch:{ all -> 0x0127 }
            X.14e r1 = r5.A00     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "member_suggested_groups"
            X.C224614k.A03(r1, r6, r0)     // Catch:{ all -> 0x0127 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0127 }
        L_0x00c5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0127 }
            X.15z r1 = (X.AnonymousClass15z) r1     // Catch:{ all -> 0x0127 }
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            r1.B7n(r0, r8, r7)     // Catch:{ all -> 0x0127 }
            goto L_0x00c5
        L_0x00d7:
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            r7.A03(r0, r6)     // Catch:{ all -> 0x0127 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0127 }
        L_0x00e0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0127 }
            X.15z r1 = (X.AnonymousClass15z) r1     // Catch:{ all -> 0x0127 }
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            r1.B7s(r0, r8, r7)     // Catch:{ all -> 0x0127 }
            goto L_0x00e0
        L_0x00f2:
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            r7.A04(r0, r6)     // Catch:{ all -> 0x0127 }
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            X.C73893kj.A00(r0)     // Catch:{ all -> 0x0127 }
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0127 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0127 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0127 }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x0127 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch:{ all -> 0x0127 }
            r0.apply()     // Catch:{ all -> 0x0127 }
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0130 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0130 }
            r0.endTransaction()     // Catch:{ all -> 0x0130 }
            goto L_0x0121
        L_0x0116:
            r2.close()     // Catch:{ all -> 0x0130 }
        L_0x0119:
            java.lang.String r0 = "ConsumerRelease-560baf20bde5471a5862167d0085134f"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x0081
        L_0x0121:
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0130 }
            X.C224714l.A02()     // Catch:{ all -> 0x014c }
            goto L_0x014a
        L_0x0127:
            r1 = move-exception
            X.14e r0 = r5.A00     // Catch:{ all -> 0x0130 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0130 }
            r0.endTransaction()     // Catch:{ all -> 0x0130 }
        L_0x012f:
            throw r1     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            X.C224714l.A02()     // Catch:{ all -> 0x014c }
            throw r0     // Catch:{ all -> 0x014c }
        L_0x0135:
            monitor-enter(r10)
            X.14e r0 = r11.A00     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0142
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x014c }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x014c }
            if (r0 != 0) goto L_0x0148
        L_0x0142:
            X.14e r0 = r11.A07()     // Catch:{ all -> 0x014c }
            r11.A00 = r0     // Catch:{ all -> 0x014c }
        L_0x0148:
            X.14e r0 = r11.A00     // Catch:{ all -> 0x014c }
        L_0x014a:
            monitor-exit(r10)
            return r0
        L_0x014c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229616q.BJK():X.14e");
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        C18740tg.A0D(false, "Use getReadableLoggableDatabase instead");
        return BJK().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        C18740tg.A0D(false, "Use getWritableLoggableDatabase instead");
        return BJK().A00;
    }

    public C229616q(Context context, C19700wN r10, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i, new C229816s(r10, str));
        this.A03 = context;
        this.A05 = r10;
        if (A06 == null) {
            synchronized (C229616q.class) {
                if (A06 == null) {
                    Boolean bool = C18750th.A03;
                    A06 = new C229916t(r10);
                }
            }
        }
        this.A04 = A06;
        this.A02 = new ReentrantReadWriteLock();
        this.A01 = new C219512b(str);
        setWriteAheadLoggingEnabled(true);
    }

    /* renamed from: A03 */
    public AnonymousClass1M0 get() {
        return new AnonymousClass1M0(this, this.A02.readLock(), false);
    }

    public AnonymousClass1M0 A04() {
        return new AnonymousClass1M0(this, this.A02.readLock(), true);
    }

    public void A05() {
        ReentrantReadWriteLock.WriteLock writeLock = this.A02.writeLock();
        try {
            writeLock.lock();
            close();
            String databaseName = getDatabaseName();
            StringBuilder sb = new StringBuilder();
            sb.append("BaseSQLiteOpenHelper/deleteDatabaseFiles for ");
            sb.append(databaseName);
            Log.i(sb.toString());
            if (databaseName != null) {
                File databasePath = this.A03.getDatabasePath(databaseName);
                if (!databasePath.delete()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("BaseSQLiteOpenHelper/failed to delete ");
                    sb2.append(databaseName);
                    sb2.append(" db");
                    Log.w(sb2.toString());
                }
                C224014d.A04(databasePath, "BaseSQLiteOpenHelper");
            }
        } finally {
            writeLock.unlock();
        }
    }

    public boolean A06() {
        Cursor rawQuery;
        AnonymousClass1M0 A042 = A04();
        try {
            SQLiteDatabase sQLiteDatabase = A042.A02.A00;
            boolean z = true;
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                rawQuery = sQLiteDatabase.rawQuery("PRAGMA wal_checkpoint(FULL);", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        int i = rawQuery.getInt(0);
                        StringBuilder sb = new StringBuilder();
                        sb.append("BaseSQLiteOpenHelper/wal_checkpoint: ");
                        sb.append(i);
                        sb.append(" ");
                        sb.append(rawQuery.getInt(1));
                        sb.append(" ");
                        sb.append(rawQuery.getInt(2));
                        Log.i(sb.toString());
                        if (i != 0) {
                            z = false;
                        }
                        rawQuery.close();
                    } else {
                        rawQuery.close();
                    }
                }
                A042.close();
                return false;
            }
            A042.close();
            return z;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        ConditionVariable conditionVariable = C18740tg.A00;
        super.onOpen(sQLiteDatabase);
        C229916t r1 = this.A04;
        String databaseName = getDatabaseName();
        if (!r1.A01.add(databaseName)) {
            r1.A00.A0D("db-already-created", databaseName, new Throwable());
        }
    }

    public SQLiteDatabase A02() {
        return super.getWritableDatabase();
    }

    public C219512b BEj() {
        return this.A01;
    }

    public C224114e BGW() {
        return BJK();
    }

    public void close() {
        super.close();
        C229916t r0 = this.A04;
        r0.A01.remove(getDatabaseName());
    }
}
