package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.756  reason: invalid class name */
public class AnonymousClass756 implements Runnable {
    public static final String A04 = AnonymousClass6VD.A01("ForceStopRunnable");
    public static final long A05 = TimeUnit.DAYS.toMillis(3650);
    public int A00 = 0;
    public final Context A01;
    public final AnonymousClass6VR A02;
    public final C114485hK A03;

    public static void A01(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        }
        Intent A0D = C36431kI.A0D();
        A0D.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        A0D.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, A0D, i);
        long currentTimeMillis = System.currentTimeMillis() + A05;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a2, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r1 = r15.A00 + 1;
        r15.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02aa, code lost:
        if (r1 >= 3) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ad, code lost:
        r3 = X.AnonymousClass6VD.A00();
        r2 = X.C36381kD.A0z("Retrying after ", X.AnonymousClass000.A0u(), ((long) r1) * 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c2, code lost:
        if (r3.A00 <= 3) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c4, code lost:
        android.util.Log.d(r6, r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        java.lang.Thread.sleep(((long) r15.A00) * 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        X.AnonymousClass6VD.A00();
        android.util.Log.e(r6, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", r7);
        r2 = new java.lang.IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r3 == false) goto L_0x0032;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a2 A[ExcHandler: SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException (r7v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:38:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036 A[LOOP:0: B:8:0x0036->B:129:0x0036, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            X.6VR r9 = r15.A02     // Catch:{ all -> 0x02ed }
            X.0tv r8 = r9.A02     // Catch:{ all -> 0x02ed }
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02ed }
            if (r0 == 0) goto L_0x0017
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ed }
            java.lang.String r6 = A04     // Catch:{ all -> 0x02ed }
            java.lang.String r0 = "The default process name was not specified."
            r1.A04(r6, r0)     // Catch:{ all -> 0x02ed }
            goto L_0x0036
        L_0x0017:
            android.content.Context r0 = r15.A01     // Catch:{ all -> 0x02ed }
            boolean r3 = X.AnonymousClass6I1.A00(r0, r8)     // Catch:{ all -> 0x02ed }
            X.6VD r2 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ed }
            java.lang.String r6 = A04     // Catch:{ all -> 0x02ed }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ed }
            java.lang.String r0 = "Is default app process = "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r3)     // Catch:{ all -> 0x02ed }
            r2.A04(r6, r0)     // Catch:{ all -> 0x02ed }
            if (r3 != 0) goto L_0x0036
        L_0x0032:
            r9.A05()
            return
        L_0x0036:
            android.content.Context r4 = r15.A01     // Catch:{ SQLiteException -> 0x02de }
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r3 = "androidx.work.workdb"
            java.io.File r2 = r4.getDatabasePath(r3)     // Catch:{ SQLiteException -> 0x02de }
            X.AnonymousClass00C.A08(r2)     // Catch:{ SQLiteException -> 0x02de }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x02de }
            r0 = 23
            if (r1 < r0) goto L_0x0135
            boolean r0 = r2.exists()     // Catch:{ SQLiteException -> 0x02de }
            if (r0 == 0) goto L_0x0135
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r2 = X.C113635fr.A00     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = "Migrating WorkDatabase to the no-backup directory"
            r1.A04(r2, r0)     // Catch:{ SQLiteException -> 0x02de }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x02de }
            r0 = 23
            if (r1 < r0) goto L_0x00bb
            java.io.File r11 = r4.getDatabasePath(r3)     // Catch:{ SQLiteException -> 0x02de }
            X.AnonymousClass00C.A08(r11)     // Catch:{ SQLiteException -> 0x02de }
            java.io.File r10 = X.C109415Xm.A00(r4)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String[] r14 = X.C113635fr.A01     // Catch:{ SQLiteException -> 0x02de }
            r0 = 3
            r7 = 3
            int r1 = X.C000300d.A02(r0)     // Catch:{ SQLiteException -> 0x02de }
            r0 = 16
            if (r1 >= r0) goto L_0x007b
            r1 = 16
        L_0x007b:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch:{ SQLiteException -> 0x02de }
            r5.<init>(r1)     // Catch:{ SQLiteException -> 0x02de }
            r3 = 0
        L_0x0081:
            r13 = r14[r3]     // Catch:{ SQLiteException -> 0x02de }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = r11.getPath()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)     // Catch:{ SQLiteException -> 0x02de }
            java.io.File r12 = X.C90524aI.A0S(r0)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = r10.getPath()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)     // Catch:{ SQLiteException -> 0x02de }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ SQLiteException -> 0x02de }
            X.011 r0 = X.C36441kJ.A19(r12, r0)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.Object r1 = r0.first     // Catch:{ SQLiteException -> 0x02de }
            java.lang.Object r0 = r0.second     // Catch:{ SQLiteException -> 0x02de }
            r5.put(r1, r0)     // Catch:{ SQLiteException -> 0x02de }
            int r3 = r3 + 1
            if (r3 < r7) goto L_0x0081
            X.011 r0 = X.C36441kJ.A19(r11, r10)     // Catch:{ SQLiteException -> 0x02de }
            java.util.Map r0 = X.C000400e.A0C(r5, r0)     // Catch:{ SQLiteException -> 0x02de }
            goto L_0x00bf
        L_0x00bb:
            X.00f r0 = X.C000400e.A0D()     // Catch:{ SQLiteException -> 0x02de }
        L_0x00bf:
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r0)     // Catch:{ SQLiteException -> 0x02de }
        L_0x00c3:
            boolean r0 = r7.hasNext()     // Catch:{ SQLiteException -> 0x02de }
            if (r0 == 0) goto L_0x0135
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r7)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.Object r5 = r0.getKey()     // Catch:{ SQLiteException -> 0x02de }
            java.io.File r5 = (java.io.File) r5     // Catch:{ SQLiteException -> 0x02de }
            java.lang.Object r3 = r0.getValue()     // Catch:{ SQLiteException -> 0x02de }
            java.io.File r3 = (java.io.File) r3     // Catch:{ SQLiteException -> 0x02de }
            boolean r0 = r5.exists()     // Catch:{ SQLiteException -> 0x02de }
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r3.exists()     // Catch:{ SQLiteException -> 0x02de }
            if (r0 == 0) goto L_0x00f5
            X.AnonymousClass6VD.A00()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = "Over-writing contents of "
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)     // Catch:{ SQLiteException -> 0x02de }
            android.util.Log.w(r2, r0)     // Catch:{ SQLiteException -> 0x02de }
        L_0x00f5:
            boolean r0 = r5.renameTo(r3)     // Catch:{ SQLiteException -> 0x02de }
            if (r0 == 0) goto L_0x011b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = "Migrated "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02de }
            r1.append(r5)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = "to "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02de }
            r1.append(r3)     // Catch:{ SQLiteException -> 0x02de }
        L_0x010f:
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x02de }
            X.6VD r0 = X.AnonymousClass6VD.A00()     // Catch:{ SQLiteException -> 0x02de }
            r0.A04(r2, r1)     // Catch:{ SQLiteException -> 0x02de }
            goto L_0x00c3
        L_0x011b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = "Renaming "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02de }
            r1.append(r5)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02de }
            r1.append(r3)     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r0 = " failed"
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02de }
            goto L_0x010f
        L_0x0135:
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ed }
            java.lang.String r0 = "Performing cleanup operations."
            r1.A04(r6, r0)     // Catch:{ all -> 0x02ed }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r13 = 0
            r0 = 23
            if (r1 < r0) goto L_0x0157
            boolean r12 = X.C138856io.A04(r4, r9)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
        L_0x0149:
            androidx.work.impl.WorkDatabase r3 = r9.A04     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.7lt r11 = r3.A0D()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.7eA r10 = r3.A0C()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r3.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            goto L_0x0159
        L_0x0157:
            r12 = 0
            goto L_0x0149
        L_0x0159:
            java.util.ArrayList r1 = r11.BGu()     // Catch:{ all -> 0x029d }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x029d }
            r7 = 0
            if (r0 != 0) goto L_0x0182
            r7 = 1
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x029d }
        L_0x0169:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x029d }
            if (r0 == 0) goto L_0x0182
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x029d }
            X.6QA r1 = (X.AnonymousClass6QA) r1     // Catch:{ all -> 0x029d }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x029d }
            java.lang.String r2 = r1.A0J     // Catch:{ all -> 0x029d }
            r11.BsK(r0, r2)     // Catch:{ all -> 0x029d }
            r0 = -1
            r11.BP9(r2, r0)     // Catch:{ all -> 0x029d }
            goto L_0x0169
        L_0x0182:
            X.6iv r10 = (X.C138926iv) r10     // Catch:{ all -> 0x029d }
            X.6Q8 r5 = r10.A01     // Catch:{ all -> 0x029d }
            r5.A05()     // Catch:{ all -> 0x029d }
            X.6P9 r2 = r10.A02     // Catch:{ all -> 0x029d }
            X.7nk r1 = r2.A02()     // Catch:{ all -> 0x029d }
            r5.A06()     // Catch:{ all -> 0x029d }
            X.C97274ok.A00(r5, r1)     // Catch:{ all -> 0x0295 }
            X.AnonymousClass6Q8.A01(r5)     // Catch:{ all -> 0x029d }
            r2.A03(r1)     // Catch:{ all -> 0x029d }
            r3.A07()     // Catch:{ all -> 0x029d }
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            if (r7 != 0) goto L_0x01a5
            if (r12 == 0) goto L_0x01a6
        L_0x01a5:
            r13 = 1
        L_0x01a6:
            X.5hK r0 = r9.A05     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            androidx.work.impl.WorkDatabase r7 = r0.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.7iW r0 = r7.A09()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r5 = "reschedule_needed"
            java.lang.Long r0 = r0.BDh(r5)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            if (r0 == 0) goto L_0x01de
            long r10 = r0.longValue()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r1 = 1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01de
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "Rescheduling Workers."
            r1.A04(r6, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r9.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.Long r0 = X.C36411kG.A0t()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.69K r3 = new X.69K     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r3.<init>(r5, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
        L_0x01d5:
            X.7iW r0 = r7.A09()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0.BKj(r3)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            goto L_0x0032
        L_0x01de:
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0 = 31
            if (r5 < r0) goto L_0x01e8
            r7 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x01e8:
            android.content.Intent r2 = X.C36431kI.A0D()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r1 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0.<init>(r4, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r2.setComponent(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "ACTION_FORCE_STOP_RESCHEDULE"
            r2.setAction(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0 = -1
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r4, r0, r2, r7)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0 = 30
            r2 = 0
            if (r5 < r0) goto L_0x0257
            if (r1 == 0) goto L_0x020a
            r1.cancel()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
        L_0x020a:
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r4.getSystemService(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0 = 0
            java.util.List r5 = r1.getHistoricalProcessExitReasons(r0, r2, r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            if (r5 == 0) goto L_0x0283
            boolean r0 = r5.isEmpty()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            if (r0 != 0) goto L_0x0283
            X.5hK r0 = r15.A03     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            androidx.work.impl.WorkDatabase r0 = r0.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.7iW r1 = r0.A09()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "last_force_stop_ms"
            java.lang.Long r0 = r1.BDh(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            if (r0 == 0) goto L_0x0234
            long r10 = r0.longValue()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            goto L_0x0236
        L_0x0234:
            r10 = 0
        L_0x0236:
            r4 = 0
        L_0x0237:
            int r0 = r5.size()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            if (r4 >= r0) goto L_0x0283
            java.lang.Object r2 = r5.get(r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            android.app.ApplicationExitInfo r2 = (android.app.ApplicationExitInfo) r2     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            int r1 = r2.getReason()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r0 = 10
            if (r1 != r0) goto L_0x0254
            long r1 = r2.getTimestamp()     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0254
            goto L_0x0266
        L_0x0254:
            int r4 = r4 + 1
            goto L_0x0237
        L_0x0257:
            if (r1 != 0) goto L_0x0283
            A01(r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x025d, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            goto L_0x0266
        L_0x025d:
            r1 = move-exception
            X.AnonymousClass6VD.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "Ignoring exception"
            android.util.Log.w(r6, r0, r1)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
        L_0x0266:
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "Application was force-stopped, rescheduling."
            r1.A04(r6, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r9.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.5hK r2 = r15.A03     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.Long r1 = X.C90484aE.A0g()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "last_force_stop_ms"
            X.69K r3 = new X.69K     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            r3.<init>(r0, r1)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            androidx.work.impl.WorkDatabase r7 = r2.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            goto L_0x01d5
        L_0x0283:
            if (r13 == 0) goto L_0x0032
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.lang.String r0 = "Found unfinished work, scheduling it."
            r1.A04(r6, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            java.util.List r0 = r9.A07     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            X.AnonymousClass6RH.A01(r8, r3, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            goto L_0x0032
        L_0x0295:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r5)     // Catch:{ all -> 0x029d }
            r2.A03(r1)     // Catch:{ all -> 0x029d }
            throw r0     // Catch:{ all -> 0x029d }
        L_0x029d:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
            throw r0     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02a2 }
        L_0x02a2:
            r7 = move-exception
            int r0 = r15.A00     // Catch:{ all -> 0x02ed }
            int r1 = r0 + 1
            r15.A00 = r1     // Catch:{ all -> 0x02ed }
            r0 = 3
            if (r1 < r0) goto L_0x02ad
            goto L_0x02d0
        L_0x02ad:
            long r4 = (long) r1     // Catch:{ all -> 0x02ed }
            r10 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r10
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ed }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ed }
            java.lang.String r0 = "Retrying after "
            java.lang.String r2 = X.C36381kD.A0z(r0, r1, r4)     // Catch:{ all -> 0x02ed }
            int r1 = r3.A00     // Catch:{ all -> 0x02ed }
            r0 = 3
            if (r1 > r0) goto L_0x02c7
            android.util.Log.d(r6, r2, r7)     // Catch:{ all -> 0x02ed }
        L_0x02c7:
            int r0 = r15.A00     // Catch:{ all -> 0x02ed }
            long r0 = (long) r0     // Catch:{ all -> 0x02ed }
            long r0 = r0 * r10
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0036 }
            goto L_0x0036
        L_0x02d0:
            java.lang.String r0 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ed }
            android.util.Log.e(r6, r0, r7)     // Catch:{ all -> 0x02ed }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02ed }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x02ed }
            goto L_0x02ec
        L_0x02de:
            r1 = move-exception
            java.lang.String r0 = "Unexpected SQLite exception during migrations"
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ed }
            android.util.Log.e(r6, r0)     // Catch:{ all -> 0x02ed }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02ed }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x02ed }
        L_0x02ec:
            throw r2     // Catch:{ all -> 0x02ed }
        L_0x02ed:
            r1 = move-exception
            X.6VR r0 = r15.A02
            r0.A05()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass756.run():void");
    }

    public AnonymousClass756(Context context, AnonymousClass6VR r3) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
        this.A03 = r3.A05;
    }

    public static final File A00(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AnonymousClass00C.A08(noBackupFilesDir);
        return noBackupFilesDir;
    }
}
