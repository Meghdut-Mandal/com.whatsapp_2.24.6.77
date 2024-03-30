package X;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ConditionVariable;
import android.os.Environment;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Q9  reason: invalid class name */
public class AnonymousClass1Q9 {
    public int A00 = 3;
    public File A01;
    public File A02;
    public final C001700s A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final C24431Ck A06;
    public final AnonymousClass1QQ A07;
    public final C227815t A08;
    public final AnonymousClass179 A09;
    public final C24341Cb A0A;
    public final C19970wo A0B;
    public final C19630wG A0C;
    public final C20830yE A0D;
    public final C19420v0 A0E;
    public final C20060wx A0F;
    public final AnonymousClass1CY A0G;
    public final AnonymousClass15x A0H;
    public final AnonymousClass12T A0I;
    public final C220612s A0J;
    public final AnonymousClass12P A0K;
    public final AnonymousClass1QN A0L;
    public final C24941Ej A0M;
    public final AnonymousClass13S A0N;
    public final AnonymousClass13R A0O;
    public final AnonymousClass11g A0P;
    public final AnonymousClass12S A0Q;
    public final C21520zN A0R;
    public final C20810yC A0S;
    public final C21010yW A0T;
    public final C20840yF A0U;
    public final C24401Ch A0V;
    public final C24391Cg A0W;
    public final AnonymousClass1CS A0X;
    public final AnonymousClass1QA A0Y;
    public final C19770wU A0Z;
    public final AnonymousClass199 A0a;
    public final AnonymousClass005 A0b;
    public final AnonymousClass005 A0c;
    public final AnonymousClass005 A0d;
    public final Set A0e = new HashSet();
    public final C21390zA A0f;
    public final C19700wN A0g;
    public final AnonymousClass1QH A0h;
    public final C20650xu A0i;
    public final AnonymousClass1DF A0j;
    public final AnonymousClass1QB A0k;
    public final AnonymousClass1QC A0l;
    public final Object A0m = new Object();

    public static int A00(File file) {
        Cursor rawQuery;
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 536870928);
            try {
                rawQuery = openDatabase.rawQuery("SELECT COUNT(*) as count FROM message", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.moveToNext()) {
                        int i = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("count")) - 1;
                        rawQuery.close();
                        openDatabase.close();
                        return i;
                    }
                    rawQuery.close();
                }
                openDatabase.close();
                return -1;
            } catch (Throwable th) {
                if (openDatabase != null) {
                    openDatabase.close();
                }
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/getMessageCountInDb error while trying to retrieve messages count in ");
            sb.append(file.getAbsolutePath());
            Log.e(sb.toString(), e);
            return -1;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public ArrayList A0M() {
        AnonymousClass5U6[] A052 = AnonymousClass5U6.A05(AnonymousClass5U6.A01(), AnonymousClass5U6.A00());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = A052.length;
            if (i < length) {
                arrayList.addAll(A0N(A052[(length - i) - 1], 3, false));
                i++;
            } else {
                Collections.sort(arrayList, new C81573xE());
                return arrayList;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        com.whatsapp.util.Log.i("MessageStoreBackup/lastbackupfileencrypted", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Q() {
        /*
            r5 = this;
            r4 = 0
            X.0zN r2 = r5.A0R     // Catch:{ IOException -> 0x0050 }
            X.AnonymousClass00C.A0D(r2, r4)     // Catch:{ IOException -> 0x0050 }
            r1 = 5284(0x14a4, float:7.404E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ IOException -> 0x0050 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ IOException -> 0x0050 }
            r2 = 1
            if (r0 == 0) goto L_0x0027
            java.util.ArrayList r1 = r5.A0M()     // Catch:{ IOException -> 0x0050 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0050 }
            if (r0 != 0) goto L_0x004f
            int r0 = r1.size()     // Catch:{ IOException -> 0x0050 }
            int r0 = r0 - r2
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException -> 0x0050 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IOException -> 0x0050 }
            goto L_0x002b
        L_0x0027:
            java.io.File r3 = r5.A0I()     // Catch:{ IOException -> 0x0050 }
        L_0x002b:
            if (r3 == 0) goto L_0x004f
            java.lang.Class<X.5U6> r2 = X.AnonymousClass5U6.class
            monitor-enter(r2)     // Catch:{ IOException -> 0x0050 }
            r0 = 1
            X.5U6[] r1 = new X.AnonymousClass5U6[r0]     // Catch:{ all -> 0x004b }
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT15     // Catch:{ all -> 0x004b }
            r1[r4] = r0     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ IOException -> 0x0050 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ IOException -> 0x0050 }
            java.lang.String r0 = r3.getName()     // Catch:{ IOException -> 0x0050 }
            X.5U6 r0 = X.C110565as.A00(r0)     // Catch:{ IOException -> 0x0050 }
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x0050 }
            if (r0 == 0) goto L_0x004f
            goto L_0x004e
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x0050 }
            throw r0     // Catch:{ IOException -> 0x0050 }
        L_0x004e:
            r4 = 1
        L_0x004f:
            return r4
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/lastbackupfileencrypted"
            com.whatsapp.util.Log.i(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q9.A0Q():boolean");
    }

    private File A02() {
        File file;
        synchronized (this.A0m) {
            file = this.A01;
            if (file == null) {
                file = this.A0C.A00.getDatabasePath("msgstore.db-backup");
                this.A01 = file;
            }
        }
        return file;
    }

    public static File A03(AnonymousClass1Q9 r6, File file, long j) {
        C20060wx r5 = r6.A0F;
        if (r5.A02() < 3 * j) {
            Log.i("MessageStoreBackup/backup/prepare/db/not enough internal storage to make db copy");
            return file;
        }
        try {
            C20840yF r2 = r6.A0U;
            File A012 = r2.A00.A01("");
            if (!AnonymousClass6YY.A0O(r2, file, A012)) {
                Log.i("MessageStoreBackup/backup/prepare/db/failed to copy");
                return file;
            } else if (r5.A01() < j * 2) {
                Log.i("MessageStoreBackup/backup/prepare/db/not enough external storage to use db copy");
                A012.delete();
                return file;
            } else {
                Log.i("MessageStoreBackup/backup/prepare/db/let's use db copy");
                return A012;
            }
        } catch (IOException e) {
            Log.w("MessageStoreBackup/backup/prepare/db/source failed", e);
            return file;
        }
    }

    private String A04(AnonymousClass5U6 r3, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore-increment-(\\d+)");
        sb.append(A05(r3, z));
        return sb.toString();
    }

    public static String A05(AnonymousClass5U6 r4, boolean z) {
        String obj;
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (z) {
            obj = str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(-(\\d{4})-(\\d{2})-(\\d{2})");
            sb2.append(Pattern.quote("."));
            sb2.append("(\\d+)");
            sb2.append(")?");
            obj = sb2.toString();
        }
        sb.append(obj);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(".db");
        if (r4 != AnonymousClass5U6.UNENCRYPTED) {
            str = AnonymousClass6YO.A05(r4);
        }
        sb3.append(str);
        sb.append(Pattern.quote(sb3.toString()));
        return sb.toString();
    }

    private void A06() {
        AnonymousClass12P r3 = this.A0K;
        r3.A06();
        File file = r3.A03;
        if (file.exists()) {
            r3.A06();
            if (!file.delete()) {
                Log.w("MessageStoreBackup/copybackuptodb/failed to delete db before copying from backup up.");
            }
        }
        File A022 = A02();
        if (A022.exists()) {
            C20840yF r0 = this.A0U;
            r3.A06();
            AnonymousClass6YY.A0O(r0, A022, file);
            return;
        }
        Log.w("MessageStoreBackup/copybackuptodb/no backup db to copy.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6 != 2) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass1Q9 r4, X.AnonymousClass135 r5, int r6, long r7) {
        /*
            X.0yC r2 = r4.A0S
            r1 = 7155(0x1bf3, float:1.0026E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            r0 = 2
            r1 = 1
            if (r6 == r0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            X.005 r0 = r4.A0d
            java.lang.Object r0 = r0.get()
            X.0xJ r0 = (X.C20280xJ) r0
            r0.A04(r3)
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = "MessageStoreBackup/lock never held for incremental backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0026:
            java.lang.String r0 = "MessageStoreBackup/unlocking DB after executing a full backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00s r1 = r4.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0C(r0)
            X.12P r0 = r4.A0K
            r0.A06()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            r0.unlock()
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A00 = r0
            X.0yW r0 = r4.A0T
            r0.Bly(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q9.A07(X.1Q9, X.135, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4) {
        /*
            java.lang.String r2 = "table"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r2
            r0 = 1
            r1[r0] = r4
            java.lang.String r0 = "SELECT sql FROM sqlite_master WHERE type = ? AND name = ?"
            android.database.Cursor r2 = r3.rawQuery(r0, r1)
            if (r2 == 0) goto L_0x002e
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "sql"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0032
        L_0x0024:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
            throw r1
        L_0x0029:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x002e:
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0035
        L_0x0032:
            r2.close()
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q9.A08(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    public static boolean A09(File file) {
        SQLiteDatabase openDatabase;
        C224214g r4 = new C224214g("MessageStoreIntegrityChecker/isDatabaseIntegrityOk");
        try {
            if (file.exists()) {
                openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 536870928);
                String stringForQuery = DatabaseUtils.stringForQuery(openDatabase, "PRAGMA integrity_check", (String[]) null);
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/fieldstat/isdatabaseintegrityok ");
                sb.append(stringForQuery);
                Log.i(sb.toString());
                boolean equalsIgnoreCase = "ok".equalsIgnoreCase(stringForQuery);
                if (openDatabase != null) {
                    openDatabase.close();
                }
                r4.A01();
                return equalsIgnoreCase;
            }
        } catch (Exception e) {
            try {
                Log.e("msgstore/fieldstat/isdatabaseintegrityok/error ", e);
            } catch (Throwable th) {
                r4.A01();
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        r4.A01();
        return false;
        throw th;
    }

    public int A0B() {
        AnonymousClass12P r0 = this.A0K;
        r0.A06();
        long length = r0.A03.length();
        long A012 = this.A0F.A01();
        if (A012 > 7 * length) {
            return 7;
        }
        int max = Math.max((int) (A012 / length), 2);
        StringBuilder sb = new StringBuilder();
        sb.append("MessageStoreBackup/backup/backupexpirationInDays not enough space to store full backup history, saving backups only for ");
        sb.append(max);
        sb.append(" days");
        Log.i(sb.toString());
        return max;
    }

    public long A0E() {
        File file;
        try {
            C21520zN r2 = this.A0R;
            AnonymousClass00C.A0D(r2, 0);
            if (C20800yB.A01(C21000yV.A02, r2, 5284)) {
                ArrayList A0M2 = A0M();
                if (A0M2.isEmpty()) {
                    return 0;
                }
                file = (File) A0M2.get(A0M2.size() - 1);
            } else {
                file = A0I();
            }
            if (file != null) {
                return file.lastModified();
            }
            return 0;
        } catch (IOException e) {
            Log.i("MessageStoreBackup/lastbackupfiletime", e);
            return 0;
        }
    }

    public long A0F() {
        long j = 0;
        try {
            C21520zN r2 = this.A0R;
            AnonymousClass00C.A0D(r2, 0);
            if (C20800yB.A01(C21000yV.A02, r2, 5284)) {
                Iterator it = A0L().iterator();
                while (it.hasNext()) {
                    j += ((File) it.next()).length();
                }
            } else {
                File A0I2 = A0I();
                if (A0I2 != null) {
                    return A0I2.length();
                }
            }
        } catch (IOException e) {
            Log.e("MessageStoreBackup/getLastBackupSize failed to get size of the last backups", e);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r4 == 21) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r1 = (X.AnonymousClass2bU) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b8, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        r3.A06();
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C131006Ni A0G(X.AnonymousClass7gU r11, boolean r12) {
        /*
            r10 = this;
            X.12P r3 = r10.A0K
            r3.A06()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r3.A04
            r2.lock()
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ea }
            monitor-enter(r10)     // Catch:{ all -> 0x00ea }
            r3.A06()     // Catch:{ all -> 0x00e7 }
            boolean r0 = r3.A08     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00b9
            X.6Ni r6 = r11.Boj()     // Catch:{ all -> 0x00e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
            r1.<init>()     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup-or-direct-transfer/"
            r1.append(r0)     // Catch:{ all -> 0x00e7 }
            r1.append(r6)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
            int r4 = r6.A00     // Catch:{ all -> 0x00e7 }
            r7 = 1
            if (r4 == r7) goto L_0x0039
            r0 = 21
            r1 = 0
            if (r4 != r0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            r3.A06()     // Catch:{ SQLiteException -> 0x00a6 }
            X.12f r0 = r3.A02     // Catch:{ SQLiteException -> 0x00a6 }
            r0.BJK()     // Catch:{ SQLiteException -> 0x00a6 }
            if (r1 == 0) goto L_0x00a6
            r3.A06()     // Catch:{ all -> 0x00e7 }
            r3.A08 = r7     // Catch:{ all -> 0x00e7 }
            X.1DF r8 = r10.A0j     // Catch:{ all -> 0x00e7 }
            X.12P r0 = r8.A08     // Catch:{ all -> 0x00e7 }
            X.1M0 r5 = r0.A05()     // Catch:{ all -> 0x00e7 }
            X.0yC r4 = r8.A0A     // Catch:{ all -> 0x009c }
            X.14e r9 = r5.A02     // Catch:{ all -> 0x009c }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x009c }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x006b
            java.lang.String r4 = X.AnonymousClass2x3.A03     // Catch:{ all -> 0x009c }
        L_0x0061:
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "GET_UNOPENED_VIEW_ONCE_MESSAGES_SQL"
            android.database.Cursor r4 = r9.A09(r4, r0, r1)     // Catch:{ all -> 0x009c }
            goto L_0x006e
        L_0x006b:
            java.lang.String r4 = X.AnonymousClass2x3.A02     // Catch:{ all -> 0x009c }
            goto L_0x0061
        L_0x006e:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008c
            X.1A1 r0 = r8.A0D     // Catch:{ all -> 0x0090 }
            X.3T1 r1 = r0.A00(r4)     // Catch:{ all -> 0x0090 }
            boolean r0 = r1 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x006e
            X.2bU r1 = (X.AnonymousClass2bU) r1     // Catch:{ all -> 0x0090 }
            X.3Qj r0 = r1.A01     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x006e
            r0.A0c = r7     // Catch:{ all -> 0x0090 }
            X.1DG r0 = r8.A04     // Catch:{ all -> 0x0090 }
            r0.A02(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x006e
        L_0x008c:
            r4.close()     // Catch:{ all -> 0x009c }
            goto L_0x00a9
        L_0x0090:
            r1 = move-exception
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ all -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x009c }
        L_0x009b:
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e7 }
        L_0x00a5:
            throw r1     // Catch:{ all -> 0x00e7 }
        L_0x00a6:
            if (r12 == 0) goto L_0x00b1
            goto L_0x00c5
        L_0x00a9:
            r5.close()     // Catch:{ all -> 0x00e7 }
            X.1QC r0 = r10.A0l     // Catch:{ all -> 0x00e7 }
            r0.A02()     // Catch:{ all -> 0x00e7 }
        L_0x00b1:
            monitor-exit(r10)     // Catch:{ all -> 0x00e7 }
            r3.A06()
            r2.unlock()
            return r6
        L_0x00b9:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup/6"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
            r0 = 6
            X.6Ni r1 = new X.6Ni     // Catch:{ all -> 0x00e7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00df
        L_0x00c5:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/re-creating db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
            X.12s r0 = r10.A0J     // Catch:{ all -> 0x00e7 }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x00e7 }
            r0.A06()     // Catch:{ all -> 0x00e7 }
            X.AnonymousClass12P.A01(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/db recreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e7 }
            r0 = 2
            X.6Ni r1 = new X.6Ni     // Catch:{ all -> 0x00e7 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e7 }
        L_0x00df:
            monitor-exit(r10)     // Catch:{ all -> 0x00e7 }
            r3.A06()
            r2.unlock()
            return r1
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            r3.A06()
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q9.A0G(X.7gU, boolean):X.6Ni");
    }

    public File A0H() {
        File file;
        synchronized (this.A0m) {
            file = this.A02;
            if (file == null) {
                file = new File(this.A09.A03(), "msgstore.db");
                this.A02 = file;
            }
        }
        return file;
    }

    public File A0K(AnonymousClass5U6 r5) {
        if (r5 == AnonymousClass5U6.UNENCRYPTED) {
            return A0H();
        }
        File A032 = this.A09.A03();
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore.db");
        sb.append(AnonymousClass6YO.A05(r5));
        return new File(A032, sb.toString());
    }

    public ArrayList A0N(AnonymousClass5U6 r8, int i, boolean z) {
        String obj;
        ArrayList arrayList = new ArrayList();
        File A032 = this.A09.A03();
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore");
            sb.append(A05(r8, z));
            obj = sb.toString();
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("msgstore");
            sb3.append(A05(r8, z));
            sb2.append(sb3.toString());
            sb2.append("|");
            sb2.append(A04(r8, z));
            obj = sb2.toString();
        } else {
            obj = A04(r8, z);
        }
        Pattern compile = Pattern.compile(obj);
        File[] listFiles = A032.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (compile.matcher(file.getName()).matches()) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public AnonymousClass1Q9(C21390zA r5, C19700wN r6, AnonymousClass17Y r7, C19730wQ r8, C24431Ck r9, AnonymousClass1QQ r10, C227815t r11, AnonymousClass179 r12, C24341Cb r13, C19970wo r14, C19630wG r15, C20830yE r16, C19420v0 r17, C20060wx r18, AnonymousClass1CY r19, AnonymousClass1QH r20, C20650xu r21, AnonymousClass1DF r22, AnonymousClass15x r23, AnonymousClass12T r24, C220612s r25, AnonymousClass12P r26, AnonymousClass1QN r27, C24941Ej r28, AnonymousClass13S r29, AnonymousClass13R r30, AnonymousClass11g r31, AnonymousClass12S r32, C21520zN r33, C20810yC r34, C21010yW r35, C20840yF r36, AnonymousClass1QB r37, AnonymousClass1QC r38, C24401Ch r39, C24391Cg r40, AnonymousClass1CS r41, AnonymousClass1QA r42, C19770wU r43, AnonymousClass199 r44, AnonymousClass005 r45, AnonymousClass005 r46) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0C = r15;
        this.A0B = r14;
        C20810yC r1 = r34;
        this.A0S = r1;
        this.A04 = r7;
        this.A0g = r6;
        this.A0X = r41;
        this.A05 = r8;
        this.A0Z = r43;
        this.A0T = r35;
        this.A09 = r12;
        this.A0F = r18;
        this.A0Q = r32;
        this.A0Y = r42;
        this.A0a = r44;
        this.A0R = r33;
        this.A0i = r21;
        this.A0k = r37;
        this.A0G = r19;
        this.A06 = r9;
        this.A0j = r22;
        this.A0A = r13;
        AnonymousClass13R r3 = r30;
        this.A0O = r3;
        this.A0M = r28;
        this.A0l = r38;
        this.A0I = r24;
        this.A0d = r45;
        this.A0K = r26;
        this.A0D = r16;
        this.A0E = r17;
        this.A08 = r11;
        this.A0P = r31;
        this.A0h = r20;
        this.A0c = r46;
        this.A0W = r40;
        this.A0N = r29;
        this.A0f = r5;
        this.A0L = r27;
        this.A0V = r39;
        this.A0H = r23;
        this.A0J = r25;
        this.A07 = r10;
        this.A0U = r36;
        this.A03 = new C001700s();
        this.A0b = new C18910u1((Object) null, new C36271k2(r1, r3, 1));
    }

    public static boolean A0A(File file, String str) {
        File parentFile = file.getParentFile();
        C18740tg.A06(parentFile);
        if (parentFile.exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MessageStoreBackup/");
        sb.append(str);
        sb.append("/createdir");
        Log.i(sb.toString());
        if (parentFile.mkdirs()) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageStoreBackup/");
        sb2.append(str);
        sb2.append("/createdir failed");
        Log.w(sb2.toString());
        return false;
    }

    public int A0C() {
        for (AnonymousClass5U6 A0K2 : AnonymousClass5U6.values()) {
            A0K(A0K2);
        }
        ArrayList A082 = AnonymousClass6YO.A08(A0H(), AnonymousClass6YO.A06(AnonymousClass5U6.A01()));
        AnonymousClass6YO.A0E(A0H(), A082);
        return A082.size();
    }

    public File A0I() {
        String externalStorageState = Environment.getExternalStorageState();
        C20830yE r1 = this.A0D;
        if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && (r1.A07() || r1.A03(AnonymousClass3TA.A04()) == 0)) {
            ArrayList A082 = AnonymousClass6YO.A08(A0H(), AnonymousClass6YO.A06(AnonymousClass5U6.A01()));
            AnonymousClass6YO.A0E(A0H(), A082);
            int size = A082.size();
            while (true) {
                size--;
                if (size < 0) {
                    return null;
                }
                File file = (File) A082.get(size);
                if (file.length() > 0 && !file.getName().contains("-increment-")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageStoreBackup/lastbackupfile/file ");
                    sb.append(file.getName());
                    sb.append(" size=");
                    sb.append(file.length());
                    Log.i(sb.toString());
                    return file;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MessageStoreBackup/verifyExternalMediaReadable/media_unavailable ");
            sb2.append(externalStorageState);
            Log.e(sb2.toString());
            throw new IOException("External media is not readable");
        }
    }

    public File A0J() {
        File[] A0R2 = A0R();
        int length = A0R2.length;
        if (length != 0) {
            int i = 0;
            do {
                File file = A0R2[i];
                if (file.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageStoreBackup/get-latest-db-backup-for-gdrive ");
                    sb.append(file.getAbsolutePath());
                    Log.i(sb.toString());
                    return file;
                }
                i++;
            } while (i < length);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MessageStoreBackup/get-latest-db-backup-for-gdrive/no-file-exists ");
            sb2.append(A0R2[0].getAbsolutePath());
            Log.i(sb2.toString());
            return A0R2[0];
        }
        throw new IllegalStateException("MessageStoreBackup/backup/list-of-backup-files-is-null");
    }

    public ArrayList A0L() {
        int indexOf;
        ArrayList A0M2 = A0M();
        if (A0M2.size() <= 1) {
            return A0M2;
        }
        String name = ((File) A0M2.get(A0M2.size() - 1)).getName();
        Pattern compile = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher matcher = compile.matcher(name);
        boolean find = matcher.find();
        if (find) {
            indexOf = matcher.start();
        } else {
            indexOf = name.indexOf(".");
        }
        String substring = name.substring(indexOf);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0M2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.getName().endsWith(substring) && find == compile.matcher(file.getName()).find()) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public List A0O(int i) {
        AnonymousClass5U6[] A052 = AnonymousClass5U6.A05(AnonymousClass5U6.A01(), AnonymousClass5U6.A00());
        int i2 = 0;
        while (true) {
            int length = A052.length;
            if (i2 >= length) {
                return Collections.emptyList();
            }
            ArrayList A0N2 = A0N(A052[(length - i2) - 1], i, true);
            if (!A0N2.isEmpty()) {
                return A0N2;
            }
            i2++;
        }
    }

    public void A0P(boolean z) {
        for (AnonymousClass5U6 r6 : AnonymousClass5U6.values()) {
            ArrayList A0N2 = A0N(r6, 1, true);
            A0N2.addAll(A0N(r6, 2, true));
            Iterator it = A0N2.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists()) {
                    if (z && System.currentTimeMillis() - file.lastModified() >= ((long) A0B()) * 86400000) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MessageStoreBackup/backup/too_old ");
                        sb.append(new Date(file.lastModified()));
                        Log.i(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MessageStoreBackup/backup/delete ");
                        sb2.append(file.getName());
                        sb2.append(" ");
                        sb2.append(file.delete());
                        Log.i(sb2.toString());
                    } else if (file.exists()) {
                        try {
                            file.renameTo(new File(file.getParentFile(), AnonymousClass6UF.A00(file, "", new Date())));
                        } catch (SecurityException unused) {
                        }
                    }
                }
            }
        }
    }

    public File[] A0R() {
        AnonymousClass5U6[] A052 = AnonymousClass5U6.A05(AnonymousClass5U6.A01(), AnonymousClass5U6.A00());
        int length = A052.length;
        File[] fileArr = new File[length];
        for (int i = 0; i < length; i++) {
            fileArr[i] = A0K(A052[(length - i) - 1]);
        }
        TextUtils.join(", ", fileArr);
        return fileArr;
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0630 A[Catch:{ all -> 0x0d23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x087b A[Catch:{ all -> 0x0d23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x08f9 A[Catch:{ all -> 0x0d23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0956 A[Catch:{ all -> 0x0d23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0a50 A[Catch:{ all -> 0x0d23 }] */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0e30 A[Catch:{ Exception -> 0x1835 }] */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0f71  */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0f87  */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0fb8  */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x0fbf  */
    /* JADX WARNING: Removed duplicated region for block: B:688:0x1103  */
    /* JADX WARNING: Removed duplicated region for block: B:691:0x1133  */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x114a  */
    /* JADX WARNING: Removed duplicated region for block: B:935:0x185c  */
    /* JADX WARNING: Removed duplicated region for block: B:938:0x186d  */
    /* JADX WARNING: Removed duplicated region for block: B:941:0x1903  */
    /* JADX WARNING: Removed duplicated region for block: B:942:0x190e  */
    /* JADX WARNING: Removed duplicated region for block: B:943:0x1911  */
    /* JADX WARNING: Removed duplicated region for block: B:944:0x1914  */
    /* JADX WARNING: Removed duplicated region for block: B:945:0x1917  */
    /* JADX WARNING: Removed duplicated region for block: B:946:0x191a  */
    /* JADX WARNING: Removed duplicated region for block: B:947:0x191d  */
    /* JADX WARNING: Removed duplicated region for block: B:948:0x193b  */
    /* JADX WARNING: Removed duplicated region for block: B:949:0x1946  */
    /* JADX WARNING: Removed duplicated region for block: B:950:0x1951  */
    public static X.C131006Ni A01(X.AnonymousClass1Q9 r80, X.C158587hk r81, java.util.List r82, int r83) {
        /*
            r34 = 2
            r0 = 2
            boolean[] r0 = new boolean[r0]
            r46 = r0
            r0 = {1, 0} // fill-array
            r18 = 0
            r37 = 0
            r33 = 0
            r32 = 0
            r31 = 0
            r30 = 0
        L_0x0016:
            java.lang.String r51 = "MessageStoreBackup/restore/"
            r2 = 2
            r1 = r80
            r0 = r30
            if (r0 >= r2) goto L_0x1996
            boolean r36 = r46[r30]
            int r0 = r82.size()
            int r29 = r0 + -1
        L_0x0027:
            if (r29 < 0) goto L_0x1971
            if (r18 != 0) goto L_0x1971
            if (r32 != 0) goto L_0x1971
            r2 = r82
            r0 = r29
            java.lang.Object r43 = r2.get(r0)
            r0 = r43
            java.io.File r0 = (java.io.File) r0
            r43 = r0
            java.lang.String r2 = r43.getName()
            java.lang.String r0 = "-increment-"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.String r3 = r43.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = ".crypt"
            r2.append(r0)
            X.5U6 r8 = X.AnonymousClass5U6.UNENCRYPTED
            int r0 = r8.version
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L_0x007e
            X.005 r0 = r1.A0b
            java.lang.Object r2 = r0.get()
            X.6Uy r2 = (X.C132716Uy) r2
            r0 = r43
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "MessageStoreBackup/restore/backup-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x007b:
            int r29 = r29 + -1
            goto L_0x0027
        L_0x007e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = r51
            r2.append(r0)
            if (r36 == 0) goto L_0x196d
            java.lang.String r0 = "repair-enabled"
        L_0x008c:
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r43.getAbsolutePath()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.14g r50 = new X.14g
            r2 = r50
            r2.<init>((java.lang.String) r0)
            int r0 = r82.size()
            long r2 = (long) r0
            r78 = r2
            r0 = r29
            long r2 = (long) r0
            r76 = r2
            r6 = 0
            boolean r0 = r43.exists()
            r28 = 3
            if (r0 != 0) goto L_0x00ef
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore-db-backup-file/does-not-exist "
            r2.append(r0)
            java.lang.String r0 = r43.getAbsolutePath()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure "
        L_0x00da:
            r2.append(r0)
            java.lang.String r0 = r43.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00eb:
            r50.A01()
            goto L_0x007b
        L_0x00ef:
            java.lang.String r2 = "MessageStoreBackup/restore/chatdb"
            X.14g r49 = new X.14g
            r0 = r49
            r0.<init>((java.lang.String) r2)
            java.lang.String r9 = r43.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/copy "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r2 = " size: "
            r0.append(r2)
            long r2 = r43.length()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r24 = 0
            X.0zN r7 = r1.A0R
            r19 = 0
            X.AnonymousClass00C.A0D(r7, r6)
            r5 = 5284(0x14a4, float:7.404E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r4, r7, r5)
            if (r0 == 0) goto L_0x019e
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            java.lang.String r2 = r43.getName()
            X.5U6 r12 = X.C110565as.A00(r2)
            if (r12 == 0) goto L_0x019e
            java.lang.String r0 = "(\\d{4})-(\\d{2})-(\\d{2})"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r11.matcher(r2)
            boolean r10 = r0.find()
            if (r10 == 0) goto L_0x0189
            int r0 = r0.start()
        L_0x0152:
            java.lang.String r3 = r2.substring(r0)
            r0 = 2
            java.util.ArrayList r0 = r1.A0N(r12, r0, r6)
            java.util.Iterator r13 = r0.iterator()
        L_0x015f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r2 = r13.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r0 = r2.getName()
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = r2.getName()
            java.util.regex.Matcher r0 = r11.matcher(r0)
            boolean r0 = r0.find()
            if (r10 != r0) goto L_0x015f
            r0 = r24
            r0.add(r2)
            goto L_0x015f
        L_0x0189:
            java.lang.String r0 = "."
            int r0 = r2.indexOf(r0)
            goto L_0x0152
        L_0x0190:
            java.lang.String r2 = r1.A04(r12, r6)
            X.4YX r0 = new X.4YX
            r0.<init>(r2, r6)
            r2 = r24
            java.util.Collections.sort(r2, r0)
        L_0x019e:
            r23 = 1
            r11 = r83
            if (r24 == 0) goto L_0x01ec
            int r0 = r24.size()
            int r0 = r0 + 1
            int r20 = r83 / r0
        L_0x01ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup allotment for msgstore.db is "
            r2.append(r0)
            r0 = r20
            r2.append(r0)
            java.lang.String r41 = ", base is "
            r0 = r41
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5U6 r27 = X.C110565as.A00(r9)
            X.2T5 r0 = new X.2T5
            r0.<init>()
            if (r27 == 0) goto L_0x01e9
            r2 = r27
            int r2 = r2.version
            long r2 = (long) r2
        L_0x01dc:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.A0E = r2
            r25 = 1000(0x3e8, double:4.94E-321)
            r63 = r81
            if (r27 == 0) goto L_0x0e7e
            goto L_0x01ef
        L_0x01e9:
            r2 = 0
            goto L_0x01dc
        L_0x01ec:
            r20 = r11
            goto L_0x01ac
        L_0x01ef:
            X.1CS r2 = r1.A0X     // Catch:{ Exception -> 0x1835 }
            r75 = r2
            X.0wQ r2 = r1.A05     // Catch:{ Exception -> 0x1835 }
            r74 = r2
            X.1CY r2 = r1.A0G     // Catch:{ Exception -> 0x1835 }
            r73 = r2
            X.1Ck r2 = r1.A06     // Catch:{ Exception -> 0x1835 }
            r72 = r2
            X.1Cb r2 = r1.A0A     // Catch:{ Exception -> 0x1835 }
            r71 = r2
            X.1Cg r2 = r1.A0W     // Catch:{ Exception -> 0x1835 }
            r70 = r2
            X.0yF r2 = r1.A0U     // Catch:{ Exception -> 0x1835 }
            r69 = r2
            X.005 r2 = r1.A0b     // Catch:{ Exception -> 0x1835 }
            r68 = r2
            java.lang.Object r2 = r68.get()     // Catch:{ Exception -> 0x1835 }
            X.6Uy r2 = (X.C132716Uy) r2     // Catch:{ Exception -> 0x1835 }
            r62 = 0
            r52 = r74
            r53 = r2
            r54 = r72
            r55 = r71
            r56 = r73
            r57 = r69
            r58 = r70
            r59 = r27
            r60 = r75
            r61 = r43
            X.6QE r9 = X.C109765Za.A00(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ Exception -> 0x1835 }
            r8 = 5
            X.0wG r3 = r1.A0C     // Catch:{ IOException -> 0x02e6 }
            X.12P r2 = r1.A0K     // Catch:{ IOException -> 0x02e6 }
            r2.A06()     // Catch:{ IOException -> 0x02e6 }
            java.io.File r2 = r2.A03     // Catch:{ IOException -> 0x02e6 }
            r65 = 0
            r67 = 1
            r61 = r9
            r62 = r3
            r64 = r2
            r66 = r20
            X.61g r10 = r61.A05(r62, r63, r64, r65, r66, r67)     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r3 = r10.A01     // Catch:{ IOException -> 0x02e6 }
            if (r3 == 0) goto L_0x0252
            java.util.Set r2 = r1.A0e     // Catch:{ IOException -> 0x02e6 }
            r2.add(r3)     // Catch:{ IOException -> 0x02e6 }
        L_0x0252:
            int r3 = r10.A00     // Catch:{ IOException -> 0x02e6 }
            r2 = r23
            if (r3 != r2) goto L_0x0298
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)     // Catch:{ IOException -> 0x02e6 }
            r0.A03 = r2     // Catch:{ IOException -> 0x02e6 }
            r0.A02 = r2     // Catch:{ IOException -> 0x02e6 }
            boolean r2 = r9 instanceof X.C101484xd     // Catch:{ IOException -> 0x02e6 }
            if (r2 == 0) goto L_0x028a
            X.4xd r9 = (X.C101484xd) r9     // Catch:{ IOException -> 0x02e6 }
            X.6FN r3 = r9.A00     // Catch:{ IOException -> 0x02e6 }
            if (r3 == 0) goto L_0x0283
            X.4uS r2 = r3.A00()     // Catch:{ IOException -> 0x02e6 }
            if (r2 == 0) goto L_0x0283
            X.4uS r2 = r3.A00()     // Catch:{ IOException -> 0x02e6 }
            int r2 = r2.bitField1_     // Catch:{ IOException -> 0x02e6 }
            r2 = r2 & 64
            if (r2 == 0) goto L_0x0283
            X.4uS r2 = r3.A00()     // Catch:{ IOException -> 0x02e6 }
            boolean r2 = r2.cleanedDb_     // Catch:{ IOException -> 0x02e6 }
            r3 = 1
            if (r2 != 0) goto L_0x0284
        L_0x0283:
            r3 = 0
        L_0x0284:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ IOException -> 0x02e6 }
            r0.A00 = r2     // Catch:{ IOException -> 0x02e6 }
        L_0x028a:
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException -> 0x02e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            r9 = 1
            goto L_0x0356
        L_0x0298:
            r9 = 2
            if (r3 != r9) goto L_0x02ae
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x02e6 }
            r0.A03 = r2     // Catch:{ IOException -> 0x02e6 }
            r0.A02 = r2     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r2 = "Integrity Check failed"
            r0.A0M = r2     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x02e6 }
            goto L_0x0350
        L_0x02ae:
            r9 = 4
            if (r3 != r9) goto L_0x02c8
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)     // Catch:{ IOException -> 0x02e6 }
            r0.A03 = r2     // Catch:{ IOException -> 0x02e6 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x02e6 }
            r0.A02 = r2     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r2 = "JID mismatch"
            r0.A0M = r2     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x02e6 }
            goto L_0x0350
        L_0x02c8:
            if (r3 != r8) goto L_0x02cf
            java.lang.String r2 = "Backup prefix is null"
            r0.A0M = r2     // Catch:{ IOException -> 0x02e6 }
            goto L_0x0329
        L_0x02cf:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02e6 }
            r8.<init>()     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r2 = "Unexpected integrity check result "
            r8.append(r2)     // Catch:{ IOException -> 0x02e6 }
            r8.append(r3)     // Catch:{ IOException -> 0x02e6 }
            java.lang.String r3 = r8.toString()     // Catch:{ IOException -> 0x02e6 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x02e6 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x02e6 }
            throw r2     // Catch:{ IOException -> 0x02e6 }
        L_0x02e6:
            r8 = move-exception
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x0e76 }
            r0.A0M = r2     // Catch:{ all -> 0x0e76 }
            java.lang.String r2 = r8.getMessage()     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x030b
            java.lang.String r3 = r8.getMessage()     // Catch:{ all -> 0x0e76 }
            java.lang.String r2 = "unknown format"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x030b
        L_0x02ff:
            java.lang.String r2 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r2, r8)     // Catch:{ all -> 0x0e76 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0e76 }
            r0.A02 = r2     // Catch:{ all -> 0x0e76 }
            goto L_0x0329
        L_0x030b:
            java.lang.Throwable r2 = r8.getCause()     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x031a
            java.lang.Throwable r2 = r8.getCause()     // Catch:{ all -> 0x0e76 }
            boolean r2 = r2 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x031a
            goto L_0x02ff
        L_0x031a:
            java.lang.Throwable r2 = r8.getCause()     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x0331
            java.lang.Throwable r2 = r8.getCause()     // Catch:{ all -> 0x0e76 }
            boolean r2 = r2 instanceof javax.crypto.AEADBadTagException     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x0331
            goto L_0x02ff
        L_0x0329:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            r9 = 3
            goto L_0x0356
        L_0x0331:
            java.lang.String r2 = r8.getMessage()     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x0e75
            java.lang.String r3 = r8.getMessage()     // Catch:{ all -> 0x0e76 }
            java.lang.String r2 = "ENOSPC"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0e76 }
            if (r2 == 0) goto L_0x0e75
            java.lang.String r2 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r2, r8)     // Catch:{ all -> 0x0e76 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            r9 = 5
            goto L_0x0356
        L_0x0350:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
        L_0x0356:
            boolean r2 = X.C20800yB.A01(r4, r7, r5)     // Catch:{ Exception -> 0x1835 }
            if (r2 == 0) goto L_0x0eca
            r2 = r23
            if (r9 != r2) goto L_0x1844
            if (r24 == 0) goto L_0x0e6f
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            if (r2 <= 0) goto L_0x0e6f
            java.lang.String r3 = "MessageStoreBackup/restore/increments"
            X.14g r48 = new X.14g     // Catch:{ Exception -> 0x1835 }
            r2 = r48
            r2.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x1835 }
            int r22 = r83 - r20
            java.lang.String r47 = "MessageStoreBackup/failed to restore increment number: "
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            java.lang.Boolean r42 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x1835 }
            if (r2 <= 0) goto L_0x0386
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            int r22 = r22 / r2
            goto L_0x0388
        L_0x0386:
            r22 = 0
        L_0x0388:
            java.util.Iterator r39 = r24.iterator()     // Catch:{ all -> 0x0e35 }
            r16 = 1
        L_0x038e:
            boolean r2 = r39.hasNext()     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0de6
            java.lang.Object r2 = r39.next()     // Catch:{ all -> 0x0e33 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0e33 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e33 }
            r4.<init>()     // Catch:{ all -> 0x0e33 }
            java.lang.String r3 = "MessageStoreBackup allotment for increment: "
            r4.append(r3)     // Catch:{ all -> 0x0e33 }
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0e33 }
            r4.append(r3)     // Catch:{ all -> 0x0e33 }
            java.lang.String r3 = " is "
            r4.append(r3)     // Catch:{ all -> 0x0e33 }
            r3 = r22
            r4.append(r3)     // Catch:{ all -> 0x0e33 }
            r3 = r41
            r4.append(r3)     // Catch:{ all -> 0x0e33 }
            r3 = r20
            r4.append(r3)     // Catch:{ all -> 0x0e33 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0e33 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0e33 }
            java.lang.Object r3 = r68.get()     // Catch:{ all -> 0x0e33 }
            X.6Uy r3 = (X.C132716Uy) r3     // Catch:{ all -> 0x0e33 }
            r14 = 0
            r4 = r74
            r5 = r3
            r6 = r72
            r7 = r71
            r8 = r73
            r9 = r69
            r10 = r70
            r11 = r27
            r12 = r75
            r13 = r2
            X.6QE r4 = X.C109765Za.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0e33 }
            r21 = 5
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x0d41 }
            java.io.File r3 = r9.A00(r3)     // Catch:{ IOException -> 0x0d41 }
            X.0wG r2 = r1.A0C     // Catch:{ IOException -> 0x0d41 }
            r10 = 1
            r5 = r2
            r6 = r63
            r7 = r3
            r8 = r20
            r9 = r22
            X.61g r5 = r4.A05(r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0d41 }
            java.lang.String r2 = r5.A01     // Catch:{ IOException -> 0x0d41 }
            if (r2 == 0) goto L_0x0407
            java.util.Set r4 = r1.A0e     // Catch:{ IOException -> 0x0d41 }
            java.lang.String r2 = r5.A01     // Catch:{ IOException -> 0x0d41 }
            r4.add(r2)     // Catch:{ IOException -> 0x0d41 }
        L_0x0407:
            int r2 = r5.A00     // Catch:{ IOException -> 0x0d41 }
            r40 = r2
            if (r2 == r10) goto L_0x040f
            goto L_0x0b42
        L_0x040f:
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException -> 0x0d3f }
            X.1QQ r2 = r1.A07     // Catch:{ IOException -> 0x0d3f }
            r67 = r2
            android.os.CancellationSignal r38 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x0d3f }
            r38.<init>()     // Catch:{ IOException -> 0x0d3f }
            boolean r2 = r3.exists()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0ccc
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0cb8 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0cb8 }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0cae }
            r5.<init>(r6)     // Catch:{ all -> 0x0cae }
            r2 = 131072(0x20000, float:1.83671E-40)
            byte[] r4 = new byte[r2]     // Catch:{ all -> 0x0ca4 }
            java.util.zip.ZipEntry r7 = r5.getNextEntry()     // Catch:{ all -> 0x0ca4 }
        L_0x0435:
            if (r7 == 0) goto L_0x0465
            r38.throwIfCanceled()     // Catch:{ all -> 0x0ca4 }
            r2 = r67
            X.005 r2 = r2.A03     // Catch:{ all -> 0x0ca4 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x0ca4 }
            X.68w r3 = (X.C1275868w) r3     // Catch:{ all -> 0x0ca4 }
            java.lang.String r2 = r7.getName()     // Catch:{ all -> 0x0ca4 }
            java.io.File r2 = r3.A00(r2)     // Catch:{ all -> 0x0ca4 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0ca4 }
            r3.<init>(r2)     // Catch:{ all -> 0x0ca4 }
            r2 = r67
            X.005 r2 = r2.A05     // Catch:{ all -> 0x0c04 }
            r2.get()     // Catch:{ all -> 0x0c04 }
            r2 = r38
            X.AnonymousClass6T9.A01(r2, r5, r3, r4)     // Catch:{ all -> 0x0c04 }
            r3.close()     // Catch:{ all -> 0x0ca4 }
            java.util.zip.ZipEntry r7 = r5.getNextEntry()     // Catch:{ all -> 0x0ca4 }
            goto L_0x0435
        L_0x0465:
            r5.close()     // Catch:{ all -> 0x0cae }
            r6.close()     // Catch:{ IOException -> 0x0cb8 }
            r2 = r67
            X.005 r2 = r2.A03     // Catch:{ all -> 0x0d23 }
            r66 = r2
            java.lang.Object r3 = r66.get()     // Catch:{ all -> 0x0d23 }
            X.68w r3 = (X.C1275868w) r3     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "header.json"
            java.io.File r2 = r3.A01(r2)     // Catch:{ all -> 0x0d23 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0c9b, JSONException -> 0x0c91 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x0c9b, JSONException -> 0x0c91 }
            org.json.JSONObject r5 = X.AnonymousClass14X.A01(r7)     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "header"
            org.json.JSONObject r4 = r5.getJSONObject(r2)     // Catch:{ all -> 0x0c87 }
            X.5yZ r6 = new X.5yZ     // Catch:{ all -> 0x0c87 }
            r6.<init>()     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "creation_date"
            long r2 = r4.getLong(r2)     // Catch:{ all -> 0x0c87 }
            r6.A00 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "os"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x0c87 }
            r6.A06 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "os_version"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x0c87 }
            r6.A07 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "app_name"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x0c87 }
            r6.A03 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "app_version"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x0c87 }
            r6.A04 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "format_version"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x0c87 }
            r6.A05 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "added_messages"
            boolean r3 = r5.has(r2)     // Catch:{ all -> 0x0c87 }
            if (r3 == 0) goto L_0x053a
            org.json.JSONObject r8 = r5.getJSONObject(r2)     // Catch:{ all -> 0x0c87 }
            X.5wy r4 = new X.5wy     // Catch:{ all -> 0x0c87 }
            r4.<init>()     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "filename"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0c87 }
            r4.A03 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "format"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x0c87 }
            r4.A04 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r9 = "messages_count_on_backup"
            r2 = 0
            long r2 = r8.optLong(r9, r2)     // Catch:{ all -> 0x0c87 }
            r4.A00 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r3 = "messages_updated"
            r9 = 0
            int r2 = r8.optInt(r3, r9)     // Catch:{ all -> 0x0c87 }
            long r2 = (long) r2     // Catch:{ all -> 0x0c87 }
            r4.A02 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r3 = "messages_deleted"
            int r2 = r8.optInt(r3, r9)     // Catch:{ all -> 0x0c87 }
            long r2 = (long) r2     // Catch:{ all -> 0x0c87 }
            r4.A01 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "chunks"
            boolean r3 = r8.has(r2)     // Catch:{ all -> 0x0c87 }
            if (r3 == 0) goto L_0x0538
            org.json.JSONArray r11 = r8.getJSONArray(r2)     // Catch:{ all -> 0x0c87 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0c87 }
            r10.<init>()     // Catch:{ all -> 0x0c87 }
        L_0x0510:
            int r2 = r11.length()     // Catch:{ all -> 0x0c87 }
            if (r9 >= r2) goto L_0x0536
            org.json.JSONObject r3 = r11.getJSONObject(r9)     // Catch:{ all -> 0x0c87 }
            X.5p7 r8 = new X.5p7     // Catch:{ all -> 0x0c87 }
            r8.<init>()     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "chunk_number"
            int r2 = r3.getInt(r2)     // Catch:{ all -> 0x0c87 }
            r8.A00 = r2     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "messages_count"
            int r2 = r3.getInt(r2)     // Catch:{ all -> 0x0c87 }
            long r2 = (long) r2     // Catch:{ all -> 0x0c87 }
            r8.A01 = r2     // Catch:{ all -> 0x0c87 }
            r10.add(r8)     // Catch:{ all -> 0x0c87 }
            int r9 = r9 + 1
            goto L_0x0510
        L_0x0536:
            r4.A05 = r10     // Catch:{ all -> 0x0c87 }
        L_0x0538:
            r6.A02 = r4     // Catch:{ all -> 0x0c87 }
        L_0x053a:
            java.lang.String r2 = "deleted_messages"
            boolean r3 = r5.has(r2)     // Catch:{ all -> 0x0c87 }
            if (r3 == 0) goto L_0x0579
            org.json.JSONObject r3 = r5.getJSONObject(r2)     // Catch:{ all -> 0x0c87 }
            X.5kn r10 = new X.5kn     // Catch:{ all -> 0x0c87 }
            r10.<init>()     // Catch:{ all -> 0x0c87 }
            java.lang.String r2 = "deleted_message_ids_files"
            boolean r4 = r3.has(r2)     // Catch:{ all -> 0x0c87 }
            if (r4 == 0) goto L_0x0577
            org.json.JSONArray r9 = r3.getJSONArray(r2)     // Catch:{ all -> 0x0c87 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0c87 }
            r8.<init>()     // Catch:{ all -> 0x0c87 }
            if (r9 == 0) goto L_0x0572
            r4 = 0
            int r3 = r9.length()     // Catch:{ all -> 0x0c87 }
        L_0x0563:
            if (r4 >= r3) goto L_0x0572
            java.lang.String r2 = r9.getString(r4)     // Catch:{ all -> 0x0c87 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0c87 }
            r8.add(r2)     // Catch:{ all -> 0x0c87 }
            int r4 = r4 + 1
            goto L_0x0563
        L_0x0572:
            java.util.List r2 = r10.A00     // Catch:{ all -> 0x0c87 }
            r2.addAll(r8)     // Catch:{ all -> 0x0c87 }
        L_0x0577:
            r6.A01 = r10     // Catch:{ all -> 0x0c87 }
        L_0x0579:
            java.lang.String r2 = "entities"
            boolean r3 = r5.has(r2)     // Catch:{ all -> 0x0c87 }
            if (r3 == 0) goto L_0x05b2
            org.json.JSONObject r10 = r5.getJSONObject(r2)     // Catch:{ all -> 0x0c87 }
            org.json.JSONArray r9 = r10.names()     // Catch:{ all -> 0x0c87 }
            if (r9 == 0) goto L_0x05b2
            int r2 = r9.length()     // Catch:{ all -> 0x0c87 }
            if (r2 <= 0) goto L_0x05b2
            r8 = 0
        L_0x0592:
            int r2 = r9.length()     // Catch:{ all -> 0x0c87 }
            if (r8 >= r2) goto L_0x05b2
            java.lang.String r4 = r9.getString(r8)     // Catch:{ all -> 0x0c87 }
            X.4yf r2 = new X.4yf     // Catch:{ all -> 0x0c87 }
            r2.<init>(r4)     // Catch:{ all -> 0x0c87 }
            java.util.ArrayList r2 = r2.A00(r10)     // Catch:{ all -> 0x0c87 }
            X.9dz r3 = new X.9dz     // Catch:{ all -> 0x0c87 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0c87 }
            java.util.Map r2 = r6.A09     // Catch:{ all -> 0x0c87 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0c87 }
            int r8 = r8 + 1
            goto L_0x0592
        L_0x05b2:
            java.lang.String r35 = "sequences"
            r2 = r35
            boolean r2 = r5.has(r2)     // Catch:{ all -> 0x0c87 }
            if (r2 == 0) goto L_0x05c4
            r2 = r35
            java.lang.String r2 = r5.getString(r2)     // Catch:{ all -> 0x0c87 }
            r6.A08 = r2     // Catch:{ all -> 0x0c87 }
        L_0x05c4:
            r7.close()     // Catch:{ IOException -> 0x0c9b, JSONException -> 0x0c91 }
            r2 = r67
            X.005 r2 = r2.A04     // Catch:{ all -> 0x0d23 }
            java.lang.Object r5 = r2.get()     // Catch:{ all -> 0x0d23 }
            X.6Ln r5 = (X.C130556Ln) r5     // Catch:{ all -> 0x0d23 }
            java.lang.Object r7 = r66.get()     // Catch:{ all -> 0x0d23 }
            X.68w r7 = (X.C1275868w) r7     // Catch:{ all -> 0x0d23 }
            X.5wx r4 = r5.A02     // Catch:{ all -> 0x0d23 }
            r2 = 0
            r4.A04 = r2     // Catch:{ all -> 0x0d23 }
            r4.A02 = r2     // Catch:{ all -> 0x0d23 }
            r4.A05 = r2     // Catch:{ all -> 0x0d23 }
            r4.A03 = r2     // Catch:{ all -> 0x0d23 }
            r4.A00 = r2     // Catch:{ all -> 0x0d23 }
            r4.A01 = r2     // Catch:{ all -> 0x0d23 }
            X.4yd r8 = new X.4yd     // Catch:{ all -> 0x0d23 }
            r8.<init>(r5)     // Catch:{ all -> 0x0d23 }
            X.5kn r2 = r6.A01     // Catch:{ all -> 0x0d23 }
            java.util.List r2 = r2.A00     // Catch:{ all -> 0x0d23 }
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0d23 }
            r2 = r38
            r8.A00(r2, r7, r3)     // Catch:{ all -> 0x0d23 }
            X.3Sy r2 = r5.A01     // Catch:{ all -> 0x0d23 }
            r65 = r2
            X.12P r2 = r2.A00     // Catch:{ all -> 0x0d23 }
            r64 = r2
            X.1M0 r9 = r64.A05()     // Catch:{ all -> 0x0d23 }
            X.14e r8 = r9.A02     // Catch:{ all -> 0x0c7b }
            java.lang.String r3 = "DELETE FROM message WHERE _id IN (SELECT table_row_id FROM backup_changes WHERE ((table_name = 'message') AND (operation = 'DELETE')))"
            java.lang.String r2 = "BackupChangesStore/DELETE_MARKED_MESSAGES"
            r8.A0D(r3, r2)     // Catch:{ all -> 0x0c7b }
            r9.close()     // Catch:{ all -> 0x0d23 }
            java.lang.String r60 = "Failed to parse serialized messages file."
            java.lang.String r59 = "IncrementalBackup/MessagesImporter/Failed to parse serialized messages file."
            X.5wy r8 = r6.A02     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r8.A03     // Catch:{ all -> 0x0d23 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x063e
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/There are no message file to import."
        L_0x0621:
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
        L_0x0624:
            X.5wy r2 = r6.A02     // Catch:{ all -> 0x0d23 }
            java.util.List r2 = r2.A05     // Catch:{ all -> 0x0d23 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d23 }
            r44 = 0
            if (r2 <= 0) goto L_0x0820
            long r7 = r65.A03()     // Catch:{ all -> 0x0d23 }
            X.5wy r2 = r6.A02     // Catch:{ all -> 0x0d23 }
            long r2 = r2.A00     // Catch:{ all -> 0x0d23 }
            int r9 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r9 <= 0) goto L_0x0820
            goto L_0x07e7
        L_0x063e:
            java.lang.String r3 = r8.A04     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "protobuf"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0d23 }
            if (r2 != 0) goto L_0x064b
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Messages file is not in expected protobuf format, skip importing messages."
            goto L_0x0621
        L_0x064b:
            java.util.List r2 = r8.A05     // Catch:{ all -> 0x0d23 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d23 }
            if (r2 != 0) goto L_0x0659
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            goto L_0x0624
        L_0x0659:
            java.lang.String r2 = r8.A03     // Catch:{ all -> 0x0d23 }
            java.io.File r3 = r7.A01(r2)     // Catch:{ all -> 0x0d23 }
            java.io.FileInputStream r58 = new java.io.FileInputStream     // Catch:{ all -> 0x0d23 }
            r2 = r58
            r2.<init>(r3)     // Catch:{ all -> 0x0d23 }
            r57 = 0
        L_0x0668:
            java.util.List r2 = r8.A05     // Catch:{ all -> 0x0c75 }
            int r3 = r2.size()     // Catch:{ all -> 0x0c75 }
            r2 = r57
            if (r2 >= r3) goto L_0x07e2
            X.4uP r3 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0c5c }
            r2 = r58
            X.8Hz r7 = X.C170918Hz.A06(r3, r2)     // Catch:{ IOException -> 0x0c5c }
            X.4uP r7 = (X.C100064uP) r7     // Catch:{ IOException -> 0x0c5c }
            if (r7 == 0) goto L_0x0c6a
            r56 = 0
        L_0x0680:
            X.B6c r2 = r7.conversations_     // Catch:{ all -> 0x0c75 }
            int r3 = r2.size()     // Catch:{ all -> 0x0c75 }
            r2 = r56
            if (r2 >= r3) goto L_0x07de
            X.B6c r3 = r7.conversations_     // Catch:{ all -> 0x0c75 }
            java.lang.Object r9 = r3.get(r2)     // Catch:{ all -> 0x0c75 }
            X.4uT r9 = (X.C100104uT) r9     // Catch:{ all -> 0x0c75 }
            java.lang.String r3 = r9.id_     // Catch:{ all -> 0x0c75 }
            X.13q r2 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x0c75 }
            X.11F r2 = r2.A02(r3)     // Catch:{ all -> 0x0c75 }
            if (r2 == 0) goto L_0x07da
            X.B6c r2 = r9.messages_     // Catch:{ all -> 0x0c75 }
            java.util.Iterator r55 = r2.iterator()     // Catch:{ all -> 0x0c75 }
        L_0x06a2:
            boolean r2 = r55.hasNext()     // Catch:{ all -> 0x0c75 }
            if (r2 == 0) goto L_0x07da
            java.lang.Object r10 = r55.next()     // Catch:{ all -> 0x0c75 }
            X.8Pk r10 = (X.C172848Pk) r10     // Catch:{ all -> 0x0c75 }
            r38.throwIfCanceled()     // Catch:{ all -> 0x0c75 }
            if (r10 != 0) goto L_0x06b9
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Conversation message is null."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0c75 }
            goto L_0x06a2
        L_0x06b9:
            X.8SU r9 = r10.message_     // Catch:{ all -> 0x0c75 }
            if (r9 != 0) goto L_0x06bf
            X.8SU r9 = X.AnonymousClass8SU.DEFAULT_INSTANCE     // Catch:{ all -> 0x0c75 }
        L_0x06bf:
            X.5SH r2 = X.AnonymousClass5SH.FOR_INCREMENTAL_BACKUP     // Catch:{ Exception -> 0x07d4 }
            X.68v r3 = new X.68v     // Catch:{ Exception -> 0x07d4 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x07d4 }
            X.1aZ r2 = r5.A08     // Catch:{ Exception -> 0x07d4 }
            X.3T1 r9 = r2.A02(r3, r9)     // Catch:{ Exception -> 0x07d4 }
            int r2 = r10.bitField0_     // Catch:{ all -> 0x0c75 }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x06d6
            long r2 = r10.msgOrderId_     // Catch:{ all -> 0x0c75 }
            r9.A1N = r2     // Catch:{ all -> 0x0c75 }
        L_0x06d6:
            X.8SU r10 = r10.message_     // Catch:{ all -> 0x0c75 }
            if (r10 != 0) goto L_0x06dc
            X.8SU r10 = X.AnonymousClass8SU.DEFAULT_INSTANCE     // Catch:{ all -> 0x0c75 }
        L_0x06dc:
            java.lang.String r54 = "incremental-backup-msg-importer-insert-failed"
            boolean r2 = r9.A1G()     // Catch:{ Exception -> 0x07b4 }
            if (r2 == 0) goto L_0x06eb
            X.17S r11 = r5.A06     // Catch:{ Exception -> 0x07b4 }
            long r2 = r9.A0I     // Catch:{ Exception -> 0x07b4 }
            r11.A04(r9, r2)     // Catch:{ Exception -> 0x07b4 }
        L_0x06eb:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r2 = r9.A1T(r2)     // Catch:{ Exception -> 0x07b4 }
            if (r2 == 0) goto L_0x06f8
            X.1Yl r2 = r5.A03     // Catch:{ Exception -> 0x07b4 }
            r2.Blm(r10, r9)     // Catch:{ Exception -> 0x07b4 }
        L_0x06f8:
            X.1A1 r12 = r5.A09     // Catch:{ Exception -> 0x07b4 }
            X.3Qa r11 = r9.A1J     // Catch:{ Exception -> 0x07b4 }
            X.3T1 r10 = r12.A03(r11)     // Catch:{ Exception -> 0x07b4 }
            r45 = 1
            r52 = 1
            if (r10 == 0) goto L_0x0769
            long r2 = r10.A1N     // Catch:{ Exception -> 0x07b4 }
            r9.A1N = r2     // Catch:{ Exception -> 0x07b4 }
            long r2 = r10.A1O     // Catch:{ Exception -> 0x07b4 }
            r9.A1O = r2     // Catch:{ Exception -> 0x07b4 }
            int r3 = r10.A0H()     // Catch:{ Exception -> 0x07b4 }
            r2 = r23
            if (r3 != r2) goto L_0x0720
            X.0xM r13 = r5.A05     // Catch:{ Exception -> 0x07b4 }
            java.util.Set r3 = java.util.Collections.singleton(r10)     // Catch:{ Exception -> 0x07b4 }
            r2 = 0
            r13.A0v(r3, r2)     // Catch:{ Exception -> 0x07b4 }
        L_0x0720:
            long r2 = r9.A1N     // Catch:{ Exception -> 0x07b4 }
            r61 = r2
            X.1M0 r44 = r64.A05()     // Catch:{ Exception -> 0x07b4 }
            r2 = r44
            X.14e r14 = r2.A02     // Catch:{ all -> 0x075f }
            java.lang.String r13 = "message"
            java.lang.String r3 = "_id = ?"
            r2 = r23
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ all -> 0x075f }
            java.lang.String r2 = java.lang.String.valueOf(r61)     // Catch:{ all -> 0x075f }
            r15[r19] = r2     // Catch:{ all -> 0x075f }
            java.lang.String r2 = "BackupChangesStore/DELETE_CONFLICTING_MESSAGE"
            r14.A03(r13, r3, r2, r15)     // Catch:{ all -> 0x075f }
            r44.close()     // Catch:{ Exception -> 0x07b4 }
            X.1A3 r2 = r5.A04     // Catch:{ Exception -> 0x07b4 }
            r2.A01(r11)     // Catch:{ Exception -> 0x07b4 }
            X.3T1 r2 = r12.A03(r11)     // Catch:{ Exception -> 0x07b4 }
            if (r2 == 0) goto L_0x076b
            long r2 = r4.A03     // Catch:{ Exception -> 0x07b4 }
            long r2 = r2 + r52
            r4.A03 = r2     // Catch:{ Exception -> 0x07b4 }
            X.0wN r10 = r5.A00     // Catch:{ Exception -> 0x07b4 }
            java.lang.String r9 = "incremental-backup-msg-importer-update-failed"
            java.lang.String r3 = "Failed to delete old fMessage."
            r2 = 0
            r10.A0E(r9, r3, r2)     // Catch:{ Exception -> 0x07b4 }
            goto L_0x06a2
        L_0x075f:
            r3 = move-exception
            r44.close()     // Catch:{ all -> 0x0764 }
            goto L_0x0768
        L_0x0764:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ Exception -> 0x07b4 }
        L_0x0768:
            throw r3     // Catch:{ Exception -> 0x07b4 }
        L_0x0769:
            r45 = 0
        L_0x076b:
            r12.A04(r9)     // Catch:{ all -> 0x07a2 }
            X.1Jd r2 = r5.A07     // Catch:{ all -> 0x07a2 }
            r2.A0J(r9)     // Catch:{ all -> 0x07a2 }
            X.1A3 r2 = r5.A04     // Catch:{ Exception -> 0x07b4 }
            r2.A01(r11)     // Catch:{ Exception -> 0x07b4 }
            X.3T1 r2 = r12.A03(r11)     // Catch:{ Exception -> 0x07b4 }
            if (r2 != 0) goto L_0x0790
            long r2 = r4.A02     // Catch:{ Exception -> 0x07b4 }
            long r2 = r2 + r52
            r4.A02 = r2     // Catch:{ Exception -> 0x07b4 }
            X.0wN r10 = r5.A00     // Catch:{ Exception -> 0x07b4 }
            java.lang.String r9 = "Failed to insert new fMessage."
            r3 = 0
            r2 = r54
            r10.A0E(r2, r9, r3)     // Catch:{ Exception -> 0x07b4 }
            goto L_0x06a2
        L_0x0790:
            if (r45 == 0) goto L_0x079a
            long r2 = r4.A05     // Catch:{ Exception -> 0x07b4 }
            long r2 = r2 + r52
            r4.A05 = r2     // Catch:{ Exception -> 0x07b4 }
            goto L_0x06a2
        L_0x079a:
            long r2 = r4.A04     // Catch:{ Exception -> 0x07b4 }
            long r2 = r2 + r52
            r4.A04 = r2     // Catch:{ Exception -> 0x07b4 }
            goto L_0x06a2
        L_0x07a2:
            r9 = move-exception
            if (r10 == 0) goto L_0x07a6
            goto L_0x07ad
        L_0x07a6:
            long r2 = r4.A02     // Catch:{ Exception -> 0x07b4 }
            long r2 = r2 + r52
            r4.A02 = r2     // Catch:{ Exception -> 0x07b4 }
            goto L_0x07b3
        L_0x07ad:
            long r2 = r4.A03     // Catch:{ Exception -> 0x07b4 }
            long r2 = r2 + r52
            r4.A03 = r2     // Catch:{ Exception -> 0x07b4 }
        L_0x07b3:
            throw r9     // Catch:{ Exception -> 0x07b4 }
        L_0x07b4:
            r10 = move-exception
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Failed to insert fMessage."
            com.whatsapp.util.Log.e(r2, r10)     // Catch:{ all -> 0x0c75 }
            X.0wN r9 = r5.A00     // Catch:{ all -> 0x0c75 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c75 }
            r3.<init>()     // Catch:{ all -> 0x0c75 }
            java.lang.String r2 = "Failed to insert fMessage: "
            r3.append(r2)     // Catch:{ all -> 0x0c75 }
            r3.append(r10)     // Catch:{ all -> 0x0c75 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c75 }
            r2 = r54
            r9.A0D(r2, r3, r10)     // Catch:{ all -> 0x0c75 }
            goto L_0x06a2
        L_0x07d4:
            r2 = move-exception
            X.C130556Ln.A00(r5, r9, r2)     // Catch:{ all -> 0x0c75 }
            goto L_0x06a2
        L_0x07da:
            int r56 = r56 + 1
            goto L_0x0680
        L_0x07de:
            int r57 = r57 + 1
            goto L_0x0668
        L_0x07e2:
            r58.close()     // Catch:{ all -> 0x0d23 }
            goto L_0x0624
        L_0x07e7:
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0820
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r10.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r9 = "Expected: "
            r10.append(r9)     // Catch:{ all -> 0x0d23 }
            r10.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = " Actual: "
            r10.append(r2)     // Catch:{ all -> 0x0d23 }
            r10.append(r7)     // Catch:{ all -> 0x0d23 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0d23 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r3.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Number of messages restored doesn't match to number of messages before backup. "
            r3.append(r2)     // Catch:{ all -> 0x0d23 }
            r3.append(r8)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            X.0wN r7 = r5.A00     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = "incremental-backup-importer-count-mismatch"
            r2 = 0
            r7.A0E(r3, r8, r2)     // Catch:{ all -> 0x0d23 }
        L_0x0820:
            long r2 = r4.A02     // Catch:{ all -> 0x0d23 }
            int r7 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r7 > 0) goto L_0x0832
            long r7 = r4.A03     // Catch:{ all -> 0x0d23 }
            int r9 = (r7 > r44 ? 1 : (r7 == r44 ? 0 : -1))
            if (r9 > 0) goto L_0x0832
            long r7 = r4.A01     // Catch:{ all -> 0x0d23 }
            int r9 = (r7 > r44 ? 1 : (r7 == r44 ? 0 : -1))
            if (r9 <= 0) goto L_0x0873
        L_0x0832:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r7.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r8 = "failedToInsertMessages: "
            r7.append(r8)     // Catch:{ all -> 0x0d23 }
            r7.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = ", failedToUpdateMessages: "
            r7.append(r2)     // Catch:{ all -> 0x0d23 }
            long r2 = r4.A03     // Catch:{ all -> 0x0d23 }
            r7.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = ", failedToDeleteMessages: "
            r7.append(r2)     // Catch:{ all -> 0x0d23 }
            long r2 = r4.A01     // Catch:{ all -> 0x0d23 }
            r7.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0d23 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r3.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Total number of errors during messages restore: "
            r3.append(r2)     // Catch:{ all -> 0x0d23 }
            r3.append(r8)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            X.0wN r7 = r5.A00     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = "incremental-backup-importer-import-issues"
            r2 = 0
            r7.A0E(r3, r8, r2)     // Catch:{ all -> 0x0d23 }
        L_0x0873:
            X.5wy r2 = r6.A02     // Catch:{ all -> 0x0d23 }
            long r2 = r2.A02     // Catch:{ all -> 0x0d23 }
            int r7 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r7 <= 0) goto L_0x08f1
            long r11 = r4.A04     // Catch:{ all -> 0x0d23 }
            long r9 = r4.A05     // Catch:{ all -> 0x0d23 }
            long r7 = r11 + r9
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x08f1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r14.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r13 = "IncrementalBackup/MessagesImporter/Number of messages restored doesn't match to number of messages in backup. Archive contains "
            r14.append(r13)     // Catch:{ all -> 0x0d23 }
            r14.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = " messages, but the number of restored messages is "
            r14.append(r2)     // Catch:{ all -> 0x0d23 }
            r14.append(r7)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = ". \nDetailed stats: \nNumber of messages inserted: "
            r14.append(r2)     // Catch:{ all -> 0x0d23 }
            r14.append(r11)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "\nNumber of messages updated: "
            r14.append(r2)     // Catch:{ all -> 0x0d23 }
            r14.append(r9)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            X.0wN r12 = r5.A00     // Catch:{ all -> 0x0d23 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r11.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "Archive msg:"
            r11.append(r2)     // Catch:{ all -> 0x0d23 }
            X.5wy r2 = r6.A02     // Catch:{ all -> 0x0d23 }
            long r2 = r2.A02     // Catch:{ all -> 0x0d23 }
            r11.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = ", restored:"
            r11.append(r2)     // Catch:{ all -> 0x0d23 }
            long r7 = r4.A04     // Catch:{ all -> 0x0d23 }
            long r2 = r4.A05     // Catch:{ all -> 0x0d23 }
            long r9 = r7 + r2
            r11.append(r9)     // Catch:{ all -> 0x0d23 }
            java.lang.String r9 = "(inserted:"
            r11.append(r9)     // Catch:{ all -> 0x0d23 }
            r11.append(r7)     // Catch:{ all -> 0x0d23 }
            java.lang.String r7 = ", updated:"
            r11.append(r7)     // Catch:{ all -> 0x0d23 }
            r11.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = ")"
            r11.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = "incremental-backup-importer-import-mismatch"
            r2 = 0
            r12.A0E(r3, r7, r2)     // Catch:{ all -> 0x0d23 }
        L_0x08f1:
            X.5wy r2 = r6.A02     // Catch:{ all -> 0x0d23 }
            long r2 = r2.A01     // Catch:{ all -> 0x0d23 }
            int r7 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r7 <= 0) goto L_0x0943
            long r7 = r4.A00     // Catch:{ all -> 0x0d23 }
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0943
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r9.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r10 = "Archive contain "
            r9.append(r10)     // Catch:{ all -> 0x0d23 }
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = " messages to be deleted, but there number of deleted messages is "
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            r9.append(r7)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = ", failed to delete "
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            long r2 = r4.A01     // Catch:{ all -> 0x0d23 }
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = " messages."
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0d23 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r3.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Number of deleted messages  doesn't match to number of deleted messages in backup. "
            r3.append(r2)     // Catch:{ all -> 0x0d23 }
            r3.append(r4)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            X.0wN r5 = r5.A00     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = "incremental-backup-importer-import-delete-mismatch"
            r2 = 0
            r5.A0E(r3, r4, r2)     // Catch:{ all -> 0x0d23 }
        L_0x0943:
            r65.A07()     // Catch:{ all -> 0x0d23 }
            java.util.Map r2 = r6.A09     // Catch:{ all -> 0x0d23 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0d23 }
            java.util.Iterator r44 = r2.iterator()     // Catch:{ all -> 0x0d23 }
        L_0x0950:
            boolean r2 = r44.hasNext()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0a3c
            java.lang.Object r2 = r44.next()     // Catch:{ all -> 0x0d23 }
            X.9dz r2 = (X.C198659dz) r2     // Catch:{ all -> 0x0d23 }
            java.util.List r2 = r2.A01     // Catch:{ all -> 0x0d23 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0d23 }
            java.util.Iterator r15 = r2.iterator()     // Catch:{ all -> 0x0d23 }
        L_0x0966:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0950
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x0d23 }
            X.6LG r8 = (X.AnonymousClass6LG) r8     // Catch:{ all -> 0x0d23 }
            r2 = r67
            X.005 r2 = r2.A01     // Catch:{ all -> 0x0d23 }
            java.lang.Object r10 = r2.get()     // Catch:{ all -> 0x0d23 }
            X.5kl r10 = (X.C116545kl) r10     // Catch:{ all -> 0x0d23 }
            java.lang.Object r9 = r66.get()     // Catch:{ all -> 0x0d23 }
            X.68w r9 = (X.C1275868w) r9     // Catch:{ all -> 0x0d23 }
            java.lang.String r7 = r8.A03     // Catch:{ all -> 0x0d23 }
            java.lang.String r5 = r8.A02     // Catch:{ all -> 0x0d23 }
            java.util.List r2 = r8.A04     // Catch:{ all -> 0x0d23 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0d23 }
            int r2 = r4.size()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x099c
            X.4ye r3 = new X.4ye     // Catch:{ all -> 0x0d23 }
            r3.<init>(r10, r7, r5)     // Catch:{ all -> 0x0d23 }
            r2 = r38
            r3.A00(r2, r9, r4)     // Catch:{ all -> 0x0d23 }
        L_0x099c:
            java.lang.String r12 = r8.A01     // Catch:{ all -> 0x0d23 }
            java.util.List r2 = r8.A05     // Catch:{ all -> 0x0d23 }
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0d23 }
            int r2 = r3.size()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0a04
            X.4yi r11 = new X.4yi     // Catch:{ all -> 0x0d23 }
            r11.<init>(r7)     // Catch:{ all -> 0x0d23 }
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x0d23 }
        L_0x09b3:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0a04
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x0d23 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0d23 }
            boolean r2 = r38.isCanceled()     // Catch:{ all -> 0x0d23 }
            if (r2 != 0) goto L_0x0a04
            java.io.File r4 = r9.A01(r13)     // Catch:{ all -> 0x0d23 }
            boolean r2 = r4.exists()     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = "EntityTableProcessor/Failed to parse input file '"
            if (r2 != 0) goto L_0x09e9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r4.<init>()     // Catch:{ all -> 0x0d23 }
            r4.append(r3)     // Catch:{ all -> 0x0d23 }
            r4.append(r13)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "'. File doesn't exist."
            r4.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            goto L_0x09b3
        L_0x09e9:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x0cec }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x0cec }
            org.json.JSONObject r4 = X.AnonymousClass14X.A01(r2)     // Catch:{ all -> 0x0c0e }
            java.util.ArrayList r4 = r11.A00(r4)     // Catch:{ all -> 0x0c0e }
            r2.close()     // Catch:{ JSONException -> 0x0cec }
            X.4yn r3 = new X.4yn     // Catch:{ all -> 0x0d23 }
            r3.<init>(r10, r7, r5, r12)     // Catch:{ all -> 0x0d23 }
            r2 = r38
            r3.A00(r2, r4)     // Catch:{ all -> 0x0d23 }
            goto L_0x09b3
        L_0x0a04:
            X.3Sy r2 = r10.A00     // Catch:{ all -> 0x0d23 }
            long r4 = r2.A04(r7, r5)     // Catch:{ all -> 0x0d23 }
            long r2 = r8.A00     // Catch:{ all -> 0x0d23 }
            r9 = 0
            int r8 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0966
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0966
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r9.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r8 = "EntityTableProcessor/Number of entities ("
            r9.append(r8)     // Catch:{ all -> 0x0d23 }
            r9.append(r7)     // Catch:{ all -> 0x0d23 }
            java.lang.String r7 = ") restored doesn't match to number of entities before backup. Expected: "
            r9.append(r7)     // Catch:{ all -> 0x0d23 }
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "; Actual: "
            r9.append(r2)     // Catch:{ all -> 0x0d23 }
            r9.append(r4)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            goto L_0x0966
        L_0x0a3c:
            r2 = r67
            X.005 r2 = r2.A06     // Catch:{ all -> 0x0d23 }
            java.lang.Object r11 = r2.get()     // Catch:{ all -> 0x0d23 }
            X.3My r11 = (X.C64173My) r11     // Catch:{ all -> 0x0d23 }
            java.lang.String r4 = r6.A08     // Catch:{ all -> 0x0d23 }
            java.lang.Object r5 = r66.get()     // Catch:{ all -> 0x0d23 }
            X.68w r5 = (X.C1275868w) r5     // Catch:{ all -> 0x0d23 }
            if (r4 == 0) goto L_0x0b24
            X.4yi r3 = new X.4yi     // Catch:{ all -> 0x0d23 }
            r2 = r35
            r3.<init>(r2)     // Catch:{ all -> 0x0d23 }
            boolean r2 = r38.isCanceled()     // Catch:{ all -> 0x0d23 }
            if (r2 != 0) goto L_0x0b24
            java.io.File r2 = r5.A01(r4)     // Catch:{ all -> 0x0d23 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x0c22 }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x0c22 }
            org.json.JSONObject r2 = X.AnonymousClass14X.A01(r5)     // Catch:{ all -> 0x0c18 }
            java.util.ArrayList r2 = r3.A00(r2)     // Catch:{ all -> 0x0c18 }
            r5.close()     // Catch:{ JSONException -> 0x0c22 }
            java.util.HashMap r12 = X.C64173My.A00(r11)     // Catch:{ all -> 0x0d23 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x0d23 }
        L_0x0a79:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0b24
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x0d23 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0d23 }
            java.lang.String r10 = "name"
            java.lang.Object r8 = r3.get(r10)     // Catch:{ all -> 0x0d23 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "value"
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0d23 }
            boolean r2 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0d23 }
            r5 = 0
            if (r2 == 0) goto L_0x0aa1
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0d23 }
            int r2 = r3.intValue()     // Catch:{ all -> 0x0d23 }
            long r2 = (long) r2     // Catch:{ all -> 0x0d23 }
            goto L_0x0aae
        L_0x0aa1:
            boolean r2 = r3 instanceof java.lang.Long     // Catch:{ all -> 0x0d23 }
            if (r2 == 0) goto L_0x0aac
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0d23 }
            long r2 = r3.longValue()     // Catch:{ all -> 0x0d23 }
            goto L_0x0aae
        L_0x0aac:
            r2 = 0
        L_0x0aae:
            if (r8 == 0) goto L_0x0a79
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0a79
            java.lang.Object r4 = r12.get(r8)     // Catch:{ all -> 0x0d23 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0d23 }
            if (r4 == 0) goto L_0x0ac4
            long r5 = r4.longValue()     // Catch:{ all -> 0x0d23 }
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0a79
        L_0x0ac4:
            X.12P r4 = r11.A00     // Catch:{ all -> 0x0d23 }
            X.1M0 r9 = r4.A05()     // Catch:{ all -> 0x0d23 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0c7b }
            r7.<init>()     // Catch:{ all -> 0x0c7b }
            java.lang.String r5 = "seq"
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0c7b }
            r7.put(r5, r4)     // Catch:{ all -> 0x0c7b }
            X.14e r6 = r9.A02     // Catch:{ all -> 0x0c7b }
            java.lang.String r5 = "SQLITE_SEQUENCE"
            java.lang.String r55 = "name = ?"
            r4 = r23
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0c7b }
            r4[r19] = r8     // Catch:{ all -> 0x0c7b }
            java.lang.String r56 = "SequencesHandler/UPDATE_SEQUENCE"
            r52 = r6
            r53 = r7
            r54 = r5
            r57 = r4
            int r4 = r52.A01(r53, r54, r55, r56, r57)     // Catch:{ all -> 0x0c7b }
            if (r4 > 0) goto L_0x0b1f
            r7.put(r10, r8)     // Catch:{ all -> 0x0c7b }
            java.lang.String r4 = "SequencesHandler/INSERT_SEQUENCE"
            long r7 = r6.A04(r5, r4, r7)     // Catch:{ all -> 0x0c7b }
            r5 = 0
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0b1f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c7b }
            r5.<init>()     // Catch:{ all -> 0x0c7b }
            java.lang.String r4 = "SequencesHandler/Failed to update / insert sequence with name = '"
            r5.append(r4)     // Catch:{ all -> 0x0c7b }
            r5.append(r2)     // Catch:{ all -> 0x0c7b }
            java.lang.String r4 = "' and value = "
            r5.append(r4)     // Catch:{ all -> 0x0c7b }
            r5.append(r2)     // Catch:{ all -> 0x0c7b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0c7b }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0c7b }
        L_0x0b1f:
            r9.close()     // Catch:{ all -> 0x0d23 }
            goto L_0x0a79
        L_0x0b24:
            r2 = r67
            X.005 r2 = r2.A00     // Catch:{ IOException -> 0x0d3f }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0d3f }
            X.3Sy r2 = (X.C65653Sy) r2     // Catch:{ IOException -> 0x0d3f }
            r2.A07()     // Catch:{ IOException -> 0x0d3f }
            java.lang.Object r2 = r66.get()     // Catch:{ IOException -> 0x0d3f }
            X.68w r2 = (X.C1275868w) r2     // Catch:{ IOException -> 0x0d3f }
            r2.A02()     // Catch:{ IOException -> 0x0d3f }
            int r20 = r20 + r22
            r2 = 1
            long r16 = r16 + r2
            goto L_0x038e
        L_0x0b42:
            r3 = 2
            if (r2 == r3) goto L_0x0bbb
            r3 = 4
            if (r2 == r3) goto L_0x0b6e
            r3 = 5
            if (r2 != r3) goto L_0x0b55
            java.lang.String r2 = "Increment Backup prefix is null"
            r0.A0M = r2     // Catch:{ IOException -> 0x0d3f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x1835 }
            goto L_0x0d98
        L_0x0b55:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0d3f }
            r3.<init>()     // Catch:{ IOException -> 0x0d3f }
            java.lang.String r2 = "Unexpected integrity check result "
            r3.append(r2)     // Catch:{ IOException -> 0x0d3f }
            r2 = r40
            r3.append(r2)     // Catch:{ IOException -> 0x0d3f }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0d3f }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0d3f }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0d3f }
            throw r2     // Catch:{ IOException -> 0x0d3f }
        L_0x0b6e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)     // Catch:{ IOException -> 0x0d3f }
            r0.A03 = r2     // Catch:{ IOException -> 0x0d3f }
            r2 = r42
            r0.A02 = r2     // Catch:{ IOException -> 0x0d3f }
            java.lang.String r2 = "Increment JID mismatch"
            r0.A0M = r2     // Catch:{ IOException -> 0x0d3f }
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x0d3f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1835 }
            r0.A0I = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0bb7
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x1835 }
            r0.A0H = r2     // Catch:{ Exception -> 0x1835 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1835 }
            r4.<init>()     // Catch:{ Exception -> 0x1835 }
            r2 = r47
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            r2 = r16
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1835 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1835 }
        L_0x0bb7:
            r21 = 4
            goto L_0x0e1e
        L_0x0bbb:
            r2 = r42
            r0.A03 = r2     // Catch:{ IOException -> 0x0d3f }
            r0.A02 = r2     // Catch:{ IOException -> 0x0d3f }
            java.lang.String r2 = "Increment Integrity Check failed"
            r0.A0M = r2     // Catch:{ IOException -> 0x0d3f }
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x0d3f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1835 }
            r0.A0I = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0c00
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x1835 }
            r0.A0H = r2     // Catch:{ Exception -> 0x1835 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1835 }
            r4.<init>()     // Catch:{ Exception -> 0x1835 }
            r2 = r47
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            r2 = r16
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1835 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1835 }
        L_0x0c00:
            r21 = 2
            goto L_0x0e1e
        L_0x0c04:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x0c09 }
            goto L_0x0c0d
        L_0x0c09:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ all -> 0x0ca4 }
        L_0x0c0d:
            throw r2     // Catch:{ all -> 0x0ca4 }
        L_0x0c0e:
            r4 = move-exception
            r2.close()     // Catch:{ all -> 0x0c13 }
            goto L_0x0c17
        L_0x0c13:
            r2 = move-exception
            r4.addSuppressed(r2)     // Catch:{ JSONException -> 0x0cec }
        L_0x0c17:
            throw r4     // Catch:{ JSONException -> 0x0cec }
        L_0x0c18:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0c1d }
            goto L_0x0c21
        L_0x0c1d:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ JSONException -> 0x0c22 }
        L_0x0c21:
            throw r2     // Catch:{ JSONException -> 0x0c22 }
        L_0x0c22:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r5.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "SequencesHandler/Failed to parse input file '"
            r5.append(r2)     // Catch:{ all -> 0x0d23 }
            r5.append(r4)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "'.\n"
            r5.append(r2)     // Catch:{ all -> 0x0d23 }
            r5.append(r3)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r5.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "Failed to parse input file '"
            r5.append(r2)     // Catch:{ all -> 0x0d23 }
            r5.append(r4)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "'."
            r5.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0d23 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0d23 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0d23 }
            goto L_0x0d22
        L_0x0c5c:
            r4 = move-exception
            r2 = r59
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0c75 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0c75 }
            r2 = r60
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0c75 }
            goto L_0x0c74
        L_0x0c6a:
            com.whatsapp.util.Log.e((java.lang.String) r59)     // Catch:{ all -> 0x0c75 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0c75 }
            r2 = r60
            r3.<init>(r2)     // Catch:{ all -> 0x0c75 }
        L_0x0c74:
            throw r3     // Catch:{ all -> 0x0c75 }
        L_0x0c75:
            r2 = move-exception
            r58.close()     // Catch:{ all -> 0x0c81 }
            goto L_0x0d22
        L_0x0c7b:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x0c81 }
            goto L_0x0d22
        L_0x0c81:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ all -> 0x0d23 }
            goto L_0x0d22
        L_0x0c87:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0c8c }
            goto L_0x0c90
        L_0x0c8c:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0c9b, JSONException -> 0x0c91 }
        L_0x0c90:
            throw r2     // Catch:{ IOException -> 0x0c9b, JSONException -> 0x0c91 }
        L_0x0c91:
            r4 = move-exception
            java.lang.String r3 = "Unable to process header JSON file."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0d23 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0d23 }
            goto L_0x0d22
        L_0x0c9b:
            r4 = move-exception
            java.lang.String r3 = "Unable to locate header metadata file in messages archive."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0d23 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0d23 }
            goto L_0x0d22
        L_0x0ca4:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0ca9 }
            goto L_0x0cad
        L_0x0ca9:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ all -> 0x0cae }
        L_0x0cad:
            throw r2     // Catch:{ all -> 0x0cae }
        L_0x0cae:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0cb3 }
            goto L_0x0cb7
        L_0x0cb3:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0cb8 }
        L_0x0cb7:
            throw r2     // Catch:{ IOException -> 0x0cb8 }
        L_0x0cb8:
            r2 = move-exception
            java.lang.String r3 = "MessageStoreIncrementalBackup/Failed to unpack files from archive."
            com.whatsapp.util.Log.e(r3, r2)     // Catch:{ all -> 0x0d23 }
            r3 = r67
            X.005 r3 = r3.A03     // Catch:{ all -> 0x0d23 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0d23 }
            X.68w r3 = (X.C1275868w) r3     // Catch:{ all -> 0x0d23 }
            r3.A02()     // Catch:{ all -> 0x0d23 }
            goto L_0x0d22
        L_0x0ccc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r4.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "Unable to locate input data file '"
            r4.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x0d23 }
            r4.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "'."
            r4.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0d23 }
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0d23 }
            r2.<init>(r3)     // Catch:{ all -> 0x0d23 }
            goto L_0x0d22
        L_0x0cec:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r2.<init>()     // Catch:{ all -> 0x0d23 }
            r2.append(r3)     // Catch:{ all -> 0x0d23 }
            r2.append(r13)     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = "'.\n"
            r2.append(r3)     // Catch:{ all -> 0x0d23 }
            r2.append(r4)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0d23 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0d23 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d23 }
            r3.<init>()     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "Failed to parse input file '"
            r3.append(r2)     // Catch:{ all -> 0x0d23 }
            r3.append(r13)     // Catch:{ all -> 0x0d23 }
            java.lang.String r2 = "'."
            r3.append(r2)     // Catch:{ all -> 0x0d23 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0d23 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0d23 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0d23 }
        L_0x0d22:
            throw r2     // Catch:{ all -> 0x0d23 }
        L_0x0d23:
            r3 = move-exception
            r2 = r67
            X.005 r2 = r2.A00     // Catch:{ IOException -> 0x0d3f }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0d3f }
            X.3Sy r2 = (X.C65653Sy) r2     // Catch:{ IOException -> 0x0d3f }
            r2.A07()     // Catch:{ IOException -> 0x0d3f }
            r2 = r67
            X.005 r2 = r2.A03     // Catch:{ IOException -> 0x0d3f }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0d3f }
            X.68w r2 = (X.C1275868w) r2     // Catch:{ IOException -> 0x0d3f }
            r2.A02()     // Catch:{ IOException -> 0x0d3f }
            throw r3     // Catch:{ IOException -> 0x0d3f }
        L_0x0d3f:
            r4 = move-exception
            goto L_0x0d44
        L_0x0d41:
            r4 = move-exception
            r40 = 3
        L_0x0d44:
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0e33 }
            r0.A0M = r2     // Catch:{ all -> 0x0e33 }
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0d5d
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0e33 }
            java.lang.String r2 = "unknown format"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0d5d
            goto L_0x0d7a
        L_0x0d5d:
            java.lang.Throwable r2 = r4.getCause()     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0d6c
            java.lang.Throwable r2 = r4.getCause()     // Catch:{ all -> 0x0e33 }
            boolean r2 = r2 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0d6c
            goto L_0x0d7a
        L_0x0d6c:
            java.lang.Throwable r2 = r4.getCause()     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0d7c
            java.lang.Throwable r2 = r4.getCause()     // Catch:{ all -> 0x0e33 }
            boolean r2 = r2 instanceof javax.crypto.AEADBadTagException     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0d7c
        L_0x0d7a:
            r5 = 1
            goto L_0x0d7d
        L_0x0d7c:
            r5 = 0
        L_0x0d7d:
            r2 = r40
            r3 = r23
            if (r2 != r3) goto L_0x0dcd
            if (r5 == 0) goto L_0x0d8f
            java.lang.String r2 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0e33 }
            r2 = r42
            r0.A02 = r2     // Catch:{ all -> 0x0e33 }
            goto L_0x0d94
        L_0x0d8f:
            java.lang.String r2 = "MessageStoreBackup/restore/error/IOException-during-incremental-message-restore"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0e33 }
        L_0x0d94:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x1835 }
        L_0x0d98:
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1835 }
            r0.A0I = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0dca
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x1835 }
            r0.A0H = r2     // Catch:{ Exception -> 0x1835 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1835 }
            r4.<init>()     // Catch:{ Exception -> 0x1835 }
            r2 = r47
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            r2 = r16
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1835 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1835 }
        L_0x0dca:
            r21 = 3
            goto L_0x0e1e
        L_0x0dcd:
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0de5
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0e33 }
            java.lang.String r2 = "ENOSPC"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0e33 }
            if (r2 == 0) goto L_0x0de5
            java.lang.String r2 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0e33 }
            goto L_0x0de8
        L_0x0de5:
            throw r4     // Catch:{ all -> 0x0e33 }
        L_0x0de6:
            r21 = 1
        L_0x0de8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1835 }
            r0.A0I = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0e1e
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x1835 }
            r0.A0H = r2     // Catch:{ Exception -> 0x1835 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1835 }
            r4.<init>()     // Catch:{ Exception -> 0x1835 }
            r2 = r47
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            r2 = r16
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1835 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1835 }
        L_0x0e1e:
            long r2 = r48.A01()     // Catch:{ Exception -> 0x1835 }
            long r2 = r2 / r25
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1835 }
            r0.A0J = r2     // Catch:{ Exception -> 0x1835 }
            r2 = r21
            r3 = r23
            if (r2 == r3) goto L_0x0ece
            r9 = 6
            goto L_0x1844
        L_0x0e33:
            r5 = move-exception
            goto L_0x0e38
        L_0x0e35:
            r5 = move-exception
            r16 = 1
        L_0x0e38:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1835 }
            r0.A0I = r2     // Catch:{ Exception -> 0x1835 }
            int r2 = r24.size()     // Catch:{ Exception -> 0x1835 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1835 }
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0e6e
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x1835 }
            r0.A0H = r2     // Catch:{ Exception -> 0x1835 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1835 }
            r4.<init>()     // Catch:{ Exception -> 0x1835 }
            r2 = r47
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            r2 = r16
            r4.append(r2)     // Catch:{ Exception -> 0x1835 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1835 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1835 }
        L_0x0e6e:
            throw r5     // Catch:{ Exception -> 0x1835 }
        L_0x0e6f:
            java.lang.String r2 = "MessageStoreBackup/restore/no increments for restore"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1835 }
            goto L_0x0ece
        L_0x0e75:
            throw r8     // Catch:{ all -> 0x0e76 }
        L_0x0e76:
            r3 = move-exception
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ Exception -> 0x1835 }
            r0.A0A = r2     // Catch:{ Exception -> 0x1835 }
            throw r3     // Catch:{ Exception -> 0x1835 }
        L_0x0e7e:
            X.1CS r9 = r1.A0X     // Catch:{ Exception -> 0x1835 }
            X.0wQ r7 = r1.A05     // Catch:{ Exception -> 0x1835 }
            X.1CY r6 = r1.A0G     // Catch:{ Exception -> 0x1835 }
            X.1Ck r5 = r1.A06     // Catch:{ Exception -> 0x1835 }
            X.1Cb r4 = r1.A0A     // Catch:{ Exception -> 0x1835 }
            X.1Cg r3 = r1.A0W     // Catch:{ Exception -> 0x1835 }
            X.0yF r2 = r1.A0U     // Catch:{ Exception -> 0x1835 }
            r69 = r2
            X.005 r2 = r1.A0b     // Catch:{ Exception -> 0x1835 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x1835 }
            X.6Uy r2 = (X.C132716Uy) r2     // Catch:{ Exception -> 0x1835 }
            r62 = 0
            r52 = r7
            r53 = r2
            r54 = r5
            r55 = r4
            r56 = r6
            r57 = r69
            r58 = r3
            r59 = r8
            r60 = r9
            r61 = r43
            X.6QE r6 = X.C109765Za.A00(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ Exception -> 0x1835 }
            X.0wG r3 = r1.A0C     // Catch:{ 0tz | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x182e }
            X.12P r2 = r1.A0K     // Catch:{ 0tz | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x182e }
            r2.A06()     // Catch:{ 0tz | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x182e }
            java.io.File r2 = r2.A03     // Catch:{ 0tz | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x182e }
            r10 = 0
            r12 = 0
            r8 = r63
            r7 = r3
            r9 = r2
            X.61g r2 = r6.A05(r7, r8, r9, r10, r11, r12)     // Catch:{ 0tz | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x182e }
            int r2 = r2.A00     // Catch:{ 0tz | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x182e }
            r3 = r23
            if (r2 != r3) goto L_0x1843
            goto L_0x0ece
        L_0x0eca:
            r2 = r23
            if (r9 != r2) goto L_0x1844
        L_0x0ece:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r36)
            r0.A01 = r2
            X.12P r2 = r1.A0K
            r35 = r2
            r35.A06()
            java.io.File r13 = r2.A03
            boolean r2 = r13.exists()
            if (r2 != 0) goto L_0x0efb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/check-restored-db/missing-file "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0ef7:
            r9 = r28
            goto L_0x1844
        L_0x0efb:
            java.lang.String r5 = "MessageStoreBackup/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy"
            r6 = 0
            java.lang.String r4 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0f42 }
            r3 = 536870928(0x20000010, float:1.0842042E-19)
            X.3WI r2 = new X.3WI     // Catch:{ Exception -> 0x0f42 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x0f42 }
            android.database.sqlite.SQLiteDatabase r4 = android.database.sqlite.SQLiteDatabase.openDatabase(r4, r6, r3, r2)     // Catch:{ Exception -> 0x0f42 }
            X.6SB r3 = X.C132766Ve.A00(r4)     // Catch:{ all -> 0x0f36 }
            boolean r2 = r3.A03     // Catch:{ all -> 0x0f36 }
            if (r2 != 0) goto L_0x0f30
            if (r4 == 0) goto L_0x0f1b
            r4.close()     // Catch:{ Exception -> 0x0f42 }
        L_0x0f1b:
            boolean r2 = r13.exists()
            if (r2 != 0) goto L_0x0f28
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r1.A06()
            goto L_0x0f54
        L_0x0f28:
            java.io.File r2 = r1.A02()
            X.AnonymousClass6YY.A0P(r2)
            goto L_0x0f54
        L_0x0f30:
            if (r4 == 0) goto L_0x0f5e
            r4.close()     // Catch:{ Exception -> 0x0f42 }
            goto L_0x0f5e
        L_0x0f36:
            r3 = move-exception
            if (r4 == 0) goto L_0x0f41
            r4.close()     // Catch:{ all -> 0x0f3d }
            goto L_0x0f41
        L_0x0f3d:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ Exception -> 0x0f42 }
        L_0x0f41:
            throw r3     // Catch:{ Exception -> 0x0f42 }
        L_0x0f42:
            r3 = move-exception
            java.lang.String r2 = "MessageStoreBackup/integritycheck/error "
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x1980 }
            boolean r2 = r13.exists()
            if (r2 != 0) goto L_0x0f56
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r1.A06()
        L_0x0f54:
            r5 = -1
            goto L_0x0f6d
        L_0x0f56:
            java.io.File r2 = r1.A02()
            X.AnonymousClass6YY.A0P(r2)
            goto L_0x0f54
        L_0x0f5e:
            boolean r2 = r13.exists()
            if (r2 != 0) goto L_0x0fc2
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r1.A06()
        L_0x0f6a:
            r6 = r3
            int r5 = r3.A00
        L_0x0f6d:
            r7 = 1
            r2 = 0
            if (r5 != 0) goto L_0x0f72
            r2 = 1
        L_0x0f72:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.A06 = r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/errors/count "
            r4.append(r2)
            r4.append(r5)
            if (r6 == 0) goto L_0x0fbf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = " index="
            r3.append(r2)
            java.util.Map r2 = r6.A02
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = " other="
            r3.append(r2)
            java.util.List r2 = r6.A01
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x0fac:
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r5 == 0) goto L_0x17ba
            if (r36 != 0) goto L_0x0fca
            X.AnonymousClass6YY.A0P(r13)
            goto L_0x0ef7
        L_0x0fbf:
            java.lang.String r2 = ""
            goto L_0x0fac
        L_0x0fc2:
            java.io.File r2 = r1.A02()
            X.AnonymousClass6YY.A0P(r2)
            goto L_0x0f6a
        L_0x0fca:
            if (r6 == 0) goto L_0x10f0
            java.util.Map r2 = r6.A02
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x10f0
            java.util.List r2 = r6.A01
            int r2 = r2.size()
            if (r2 != 0) goto L_0x10f0
        L_0x0fdc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r0.A08 = r2
            if (r7 == 0) goto L_0x1136
            java.io.File r3 = r1.A02()
            boolean r2 = r3.exists()
            if (r2 == 0) goto L_0x0ff9
            boolean r2 = r3.delete()
            if (r2 != 0) goto L_0x0ff9
            java.lang.String r2 = "MessageStoreBackup/copydbtobackup/failed to delete backup file before copying from db."
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0ff9:
            r35.A06()
            boolean r2 = r13.exists()
            if (r2 == 0) goto L_0x10e9
            r35.A06()
            r2 = r69
            X.AnonymousClass6YY.A0O(r2, r13, r3)
        L_0x100a:
            java.util.Map r2 = r6.A02
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r10 = r2.iterator()
            r8 = 0
            r7 = 0
        L_0x1016:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x10f3
            java.lang.Object r6 = r10.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r4 = r6.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r2 = "MessageStoreBackup/reindex"
            X.14g r9 = new X.14g
            r9.<init>((java.lang.String) r2)
            r35.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x10ab, SQLiteConstraintException -> 0x10af, SQLiteFullException -> 0x10b6, SQLiteException -> 0x107b }
            java.lang.String r5 = r13.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x10ab, SQLiteConstraintException -> 0x10af, SQLiteFullException -> 0x10b6, SQLiteException -> 0x107b }
            r3 = 0
            r2 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r5 = android.database.sqlite.SQLiteDatabase.openDatabase(r5, r3, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x10ab, SQLiteConstraintException -> 0x10af, SQLiteFullException -> 0x10b6, SQLiteException -> 0x107b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x106f }
            r3.<init>()     // Catch:{ all -> 0x106f }
            java.lang.String r2 = "REINDEX "
            r3.append(r2)     // Catch:{ all -> 0x106f }
            r3.append(r4)     // Catch:{ all -> 0x106f }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x106f }
            r5.execSQL(r2)     // Catch:{ all -> 0x106f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x106f }
            r4.<init>()     // Catch:{ all -> 0x106f }
            java.lang.String r2 = "MessageStoreBackup/reindex | time spent:"
            r4.append(r2)     // Catch:{ all -> 0x106f }
            long r2 = r9.A01()     // Catch:{ all -> 0x106f }
            r4.append(r2)     // Catch:{ all -> 0x106f }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x106f }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x106f }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x10ab, SQLiteConstraintException -> 0x10af, SQLiteFullException -> 0x10b6, SQLiteException -> 0x107b }
            r4 = 1
            goto L_0x10bd
        L_0x106f:
            r2 = move-exception
            if (r5 == 0) goto L_0x107a
            r5.close()     // Catch:{ all -> 0x1076 }
            goto L_0x107a
        L_0x1076:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x10ab, SQLiteConstraintException -> 0x10af, SQLiteFullException -> 0x10b6, SQLiteException -> 0x107b }
        L_0x107a:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x10ab, SQLiteConstraintException -> 0x10af, SQLiteFullException -> 0x10b6, SQLiteException -> 0x107b }
        L_0x107b:
            r5 = move-exception
            X.0wG r2 = r1.A0C
            android.content.Context r4 = r2.A00
            java.lang.String r3 = r5.toString()
            java.lang.String r2 = "unable to open"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x1099
            X.1QA r3 = r1.A0Y
            r2 = 2131889335(0x7f120cb7, float:1.941333E38)
        L_0x1091:
            java.lang.String r2 = r4.getString(r2)
            r3.A00(r2)
            goto L_0x10bc
        L_0x1099:
            java.lang.String r3 = r5.toString()
            java.lang.String r2 = "attempt to write a readonly database"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x10bc
            X.1QA r3 = r1.A0Y
            r2 = 2131889336(0x7f120cb8, float:1.9413333E38)
            goto L_0x1091
        L_0x10ab:
            r3 = move-exception
            java.lang.String r2 = "MessageStoreBackup/reindex/dbcorrupt"
            goto L_0x10b2
        L_0x10af:
            r3 = move-exception
            java.lang.String r2 = "MessageStoreBackup/reindex/constraintexception "
        L_0x10b2:
            com.whatsapp.util.Log.w(r2, r3)
            goto L_0x10bc
        L_0x10b6:
            X.12T r3 = r1.A0I
            r2 = 0
            r3.A00(r2)
        L_0x10bc:
            r4 = 0
        L_0x10bd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/reindex/key: "
            r3.append(r2)
            java.lang.Object r2 = r6.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.append(r2)
            if (r4 == 0) goto L_0x10e6
            java.lang.String r2 = " ok"
        L_0x10d4:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r8 = r8 + 1
            if (r4 == 0) goto L_0x10f3
            int r7 = r7 + 1
            goto L_0x1016
        L_0x10e6:
            java.lang.String r2 = " failed"
            goto L_0x10d4
        L_0x10e9:
            java.lang.String r2 = "MessageStoreBackup/copydbtobackup/no db to backup."
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x100a
        L_0x10f0:
            r7 = 0
            goto L_0x0fdc
        L_0x10f3:
            boolean r4 = A09(r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/reindexresult/dbintegrity "
            r3.append(r2)
            if (r4 == 0) goto L_0x114a
            java.lang.String r2 = "ok"
        L_0x1105:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/reindexresult/reindexed "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = "/"
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.A05 = r2
            if (r4 != 0) goto L_0x17ba
            r1.A06()
        L_0x1136:
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.util.concurrent.atomic.AtomicReference r12 = new java.util.concurrent.atomic.AtomicReference
            r12.<init>(r2)
            X.0wG r2 = r1.A0C
            android.content.Context r2 = r2.A00
            r27 = r2
            X.0wx r6 = r1.A0F
            goto L_0x114d
        L_0x114a:
            java.lang.String r2 = "failed"
            goto L_0x1105
        L_0x114d:
            java.lang.String r2 = "sqlite"
            java.lang.System.loadLibrary(r2)     // Catch:{ UnsatisfiedLinkError -> 0x177d }
            boolean r2 = r13.exists()
            if (r2 != 0) goto L_0x116f
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r2 = r23
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r13.getAbsolutePath()
            r2[r19] = r4
            java.lang.String r4 = "sqlite-repair/recover-database original database (%s) does not exist."
            java.lang.String r2 = java.lang.String.format(r3, r4, r2)
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x1783
        L_0x116f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r13.getAbsolutePath()
            r3.append(r2)
            java.lang.String r2 = "_new"
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.io.File r17 = new java.io.File
            r2 = r17
            r2.<init>(r3)
            X.AnonymousClass6YY.A0P(r17)
            r4 = 2
            long r2 = r13.length()
            long r2 = r2 * r4
            long r7 = r6.A02()
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x11ae
            r4 = r27
            android.content.Intent r5 = X.AnonymousClass190.A0M(r4, r2)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r5 = r5.setFlags(r4)
            r4 = r27
            r4.startActivity(r5)
        L_0x11ae:
            long r7 = r6.A02()
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x11bf
            r6.A02()
            r4 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r4)
            goto L_0x11ae
        L_0x11bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r4.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/recover-database dbFile is "
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = " (Size: "
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            long r2 = r13.length()     // Catch:{ Exception -> 0x1766 }
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            java.io.File r3 = r27.getFilesDir()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "tmp_db_dump_schema"
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x1766 }
            r10.<init>(r3, r2)     // Catch:{ Exception -> 0x1766 }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x1766 }
            r2 = r23
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            r3[r19] = r2     // Catch:{ Exception -> 0x1766 }
            java.lang.String r24 = ".read %s"
            r2 = r24
            java.lang.String r9 = java.lang.String.format(r4, r2, r3)     // Catch:{ Exception -> 0x1766 }
            X.AnonymousClass6YY.A0P(r10)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r4 = r13.getAbsolutePath()     // Catch:{ all -> 0x175c }
            java.lang.String r3 = r10.getAbsolutePath()     // Catch:{ all -> 0x175c }
            java.lang.String r2 = ".schema"
            int r2 = com.whatsapp.SqliteShell.executeMetaCommand(r4, r3, r2)     // Catch:{ all -> 0x175c }
            r14 = 0
            if (r2 == 0) goto L_0x1244
            java.lang.String r2 = "sqlite-repair/copy-schema/failed \".schema\""
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x175c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x175c }
            r3.<init>()     // Catch:{ all -> 0x175c }
            java.lang.String r2 = "sqlite-repair/copy-schema/result of command \".schema\" is \""
            r3.append(r2)     // Catch:{ all -> 0x175c }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x175c }
            r2.<init>(r10)     // Catch:{ all -> 0x175c }
            java.lang.String r2 = X.AnonymousClass14X.A00(r2)     // Catch:{ all -> 0x175c }
            r3.append(r2)     // Catch:{ all -> 0x175c }
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch:{ all -> 0x175c }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x175c }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x175c }
            goto L_0x1359
        L_0x1244:
            java.lang.String r2 = "sqlite-repair/copy-schema/success \".schema\""
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x175c }
            java.lang.String r8 = "ROLLBACK;"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x175c }
            r3.<init>()     // Catch:{ all -> 0x175c }
            java.lang.String r2 = r10.getAbsolutePath()     // Catch:{ all -> 0x175c }
            r3.append(r2)     // Catch:{ all -> 0x175c }
            java.lang.String r2 = ".tmp"
            r3.append(r2)     // Catch:{ all -> 0x175c }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x175c }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x175c }
            r7.<init>(r2)     // Catch:{ all -> 0x175c }
            java.lang.String r2 = "sqlite-repair/clean-schema-dump"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x175c }
            boolean r2 = X.AnonymousClass6YY.A0P(r7)     // Catch:{ all -> 0x175c }
            if (r2 == 0) goto L_0x134c
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x175c }
            r3.<init>(r10)     // Catch:{ all -> 0x175c }
            java.lang.String r4 = "ISO-8859-1"
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x175c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x175c }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x175c }
            r6.<init>(r2)     // Catch:{ all -> 0x175c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x1309 }
            r3.<init>(r7)     // Catch:{ all -> 0x1309 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ UnsupportedEncodingException -> 0x1304 }
            r2.<init>(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x1304 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ UnsupportedEncodingException -> 0x1304 }
            r5.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x1304 }
            java.lang.String r4 = r6.readLine()     // Catch:{ all -> 0x12fa }
        L_0x1294:
            if (r4 == 0) goto L_0x12f6
            java.lang.String r11 = r6.readLine()     // Catch:{ all -> 0x12fa }
            if (r11 != 0) goto L_0x12c8
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = r4.toUpperCase(r2)     // Catch:{ all -> 0x12fa }
            boolean r2 = r2.contains(r8)     // Catch:{ all -> 0x12fa }
            if (r2 == 0) goto L_0x12c8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x12fa }
            r3.<init>()     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = "sqlite-repair/clean-schema-dump replacing following statement with 'commit transaction': "
            r3.append(r2)     // Catch:{ all -> 0x12fa }
            r3.append(r4)     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x12fa }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x12fa }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x12fa }
            java.lang.String r3 = r4.toUpperCase(r2)     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = "COMMIT TRANSACTION;"
            java.lang.String r4 = r3.replace(r8, r2)     // Catch:{ all -> 0x12fa }
        L_0x12c8:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x12fa }
            java.lang.String r3 = r4.toUpperCase(r2)     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x12fa }
            if (r2 == 0) goto L_0x12ec
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x12fa }
            r3.<init>()     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = "sqlite-repair/clean-schema-dump creation of virtual table messages_fts will take care of this, ignoring: "
            r3.append(r2)     // Catch:{ all -> 0x12fa }
            r3.append(r4)     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x12fa }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x12fa }
            java.lang.String r4 = ""
        L_0x12ec:
            r5.write(r4)     // Catch:{ all -> 0x12fa }
            java.lang.String r2 = "\n"
            r5.write(r2)     // Catch:{ all -> 0x12fa }
            r4 = r11
            goto L_0x1294
        L_0x12f6:
            r5.close()     // Catch:{ all -> 0x1309 }
            goto L_0x1313
        L_0x12fa:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x12ff }
            goto L_0x1308
        L_0x12ff:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ all -> 0x1309 }
            goto L_0x1308
        L_0x1304:
            r2 = move-exception
            X.AnonymousClass14X.A02(r3)     // Catch:{ all -> 0x1309 }
        L_0x1308:
            throw r2     // Catch:{ all -> 0x1309 }
        L_0x1309:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x130e }
            goto L_0x1312
        L_0x130e:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ all -> 0x175c }
        L_0x1312:
            throw r2     // Catch:{ all -> 0x175c }
        L_0x1313:
            r6.close()     // Catch:{ all -> 0x175c }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x175c }
            r2 = 5
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x175c }
            java.lang.String r2 = r10.getAbsolutePath()     // Catch:{ all -> 0x175c }
            r3[r19] = r2     // Catch:{ all -> 0x175c }
            long r5 = r10.length()     // Catch:{ all -> 0x175c }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x175c }
            r3[r23] = r2     // Catch:{ all -> 0x175c }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x175c }
            r3[r34] = r2     // Catch:{ all -> 0x175c }
            long r5 = r7.length()     // Catch:{ all -> 0x175c }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x175c }
            r3[r28] = r2     // Catch:{ all -> 0x175c }
            r2 = 4
            r3[r2] = r10     // Catch:{ all -> 0x175c }
            java.lang.String r2 = "sqlite-repair/clean-schema-dump deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r4, r2, r3)     // Catch:{ all -> 0x175c }
            boolean r2 = r10.delete()     // Catch:{ all -> 0x175c }
            if (r2 == 0) goto L_0x134c
            r7.renameTo(r10)     // Catch:{ all -> 0x175c }
        L_0x134c:
            java.lang.String r3 = r17.getAbsolutePath()     // Catch:{ all -> 0x175c }
            java.lang.String r2 = "/dev/null"
            int r2 = com.whatsapp.SqliteShell.executeMetaCommand(r3, r2, r9)     // Catch:{ all -> 0x175c }
            if (r2 != 0) goto L_0x1359
            r14 = 1
        L_0x1359:
            X.AnonymousClass6YY.A0P(r10)     // Catch:{ Exception -> 0x1766 }
            if (r14 == 0) goto L_0x1783
            java.io.File r2 = r27.getFilesDir()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r8 = "tmp_db_dump_table"
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x1766 }
            r4.<init>(r2, r8)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r5 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r3 = ".tables"
            int r2 = com.whatsapp.SqliteShell.executeMetaCommand(r5, r2, r3)     // Catch:{ Exception -> 0x1766 }
            if (r2 == 0) goto L_0x13a8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r4.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/get-tables/failed \""
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            r4.append(r3)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "\""
            r4.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
        L_0x1392:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r3.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/recover-database/failed-to-get-tables "
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            r3.append(r13)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            goto L_0x1783
        L_0x13a8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r5.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/get-tables/success \""
            r5.append(r2)     // Catch:{ Exception -> 0x1766 }
            r5.append(r3)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r7 = "\" dump size:"
            r5.append(r7)     // Catch:{ Exception -> 0x1766 }
            long r2 = r4.length()     // Catch:{ Exception -> 0x1766 }
            r5.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x1766 }
            r10.<init>()     // Catch:{ Exception -> 0x1766 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x1766 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r3 = X.AnonymousClass14X.A00(r6)     // Catch:{ all -> 0x1752 }
            java.lang.String r2 = "[\\t\\n\\r, ]"
            java.lang.String[] r5 = android.text.TextUtils.split(r3, r2)     // Catch:{ all -> 0x1752 }
            int r4 = r5.length     // Catch:{ all -> 0x1752 }
            r3 = 0
        L_0x13de:
            if (r3 >= r4) goto L_0x13f2
            r2 = r5[r3]     // Catch:{ all -> 0x1752 }
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x1752 }
            int r9 = r2.length()     // Catch:{ all -> 0x1752 }
            if (r9 <= 0) goto L_0x13ef
            r10.add(r2)     // Catch:{ all -> 0x1752 }
        L_0x13ef:
            int r3 = r3 + 1
            goto L_0x13de
        L_0x13f2:
            r6.close()     // Catch:{ Exception -> 0x1766 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r3.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/get-tables/ "
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = ","
            java.lang.String r2 = android.text.TextUtils.join(r2, r10)     // Catch:{ Exception -> 0x1766 }
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            int r2 = r10.size()     // Catch:{ Exception -> 0x1766 }
            if (r2 == 0) goto L_0x1392
            r4 = 0
        L_0x1416:
            int r2 = r10.size()     // Catch:{ Exception -> 0x1766 }
            if (r4 >= r2) goto L_0x166b
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x1766 }
            java.lang.String r3 = "sqlite-repair/recover-database/reading-table %d/%d: %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x1766 }
            int r22 = r4 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x1766 }
            r2[r19] = r5     // Catch:{ Exception -> 0x1766 }
            int r5 = r10.size()     // Catch:{ Exception -> 0x1766 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x1766 }
            r2[r23] = r5     // Catch:{ Exception -> 0x1766 }
            int r5 = r10.size()     // Catch:{ Exception -> 0x1766 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x1766 }
            r2[r34] = r5     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = java.lang.String.format(r9, r3, r2)     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.Object r2 = r10.get(r4)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x1766 }
            java.io.File r3 = r27.getFilesDir()     // Catch:{ Exception -> 0x1766 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x1766 }
            r6.<init>(r3, r8)     // Catch:{ Exception -> 0x1766 }
            X.AnonymousClass6YY.A0P(r6)     // Catch:{ Exception -> 0x1766 }
            r3 = r23
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x1761 }
            r3[r19] = r2     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = ".dump %s"
            java.lang.String r3 = java.lang.String.format(r9, r2, r3)     // Catch:{ all -> 0x1761 }
            java.lang.String r4 = r13.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            int r2 = com.whatsapp.SqliteShell.executeMetaCommand(r4, r2, r3)     // Catch:{ all -> 0x1761 }
            if (r2 == 0) goto L_0x162b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x1761 }
            r4.<init>()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "sqlite-repair/recover-database-table/failed \""
            r4.append(r2)     // Catch:{ all -> 0x1761 }
            r4.append(r3)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "\""
            r4.append(r2)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x1761 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1761 }
        L_0x148b:
            java.lang.String r14 = "ROLLBACK;"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1761 }
            r3.<init>()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            r3.append(r2)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = ".tmp"
            r3.append(r2)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1761 }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x1761 }
            r11.<init>(r2)     // Catch:{ all -> 0x1761 }
            boolean r2 = r11.exists()     // Catch:{ all -> 0x1761 }
            if (r2 == 0) goto L_0x14f6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1761 }
            r3.<init>()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file deleting "
            r3.append(r2)     // Catch:{ all -> 0x1761 }
            r3.append(r11)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1761 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1761 }
            boolean r2 = r11.delete()     // Catch:{ all -> 0x1761 }
            if (r2 != 0) goto L_0x14f6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1761 }
            r3.<init>()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file failed to delete "
            r3.append(r2)     // Catch:{ all -> 0x1761 }
            r3.append(r11)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1761 }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x1761 }
        L_0x14db:
            java.lang.String r5 = r17.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            java.lang.String r4 = "/dev/null"
            r2 = r23
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            r3[r19] = r2     // Catch:{ all -> 0x1761 }
            r2 = r24
            java.lang.String r2 = java.lang.String.format(r9, r2, r3)     // Catch:{ all -> 0x1761 }
            com.whatsapp.SqliteShell.executeMetaCommand(r5, r4, r2)     // Catch:{ all -> 0x1761 }
            goto L_0x164b
        L_0x14f6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1761 }
            r3.<init>()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file "
            r3.append(r2)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            r3.append(r2)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1761 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1761 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x1761 }
            r2.<init>(r6)     // Catch:{ all -> 0x1761 }
            java.lang.String r4 = "ISO-8859-1"
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x1761 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x1761 }
            java.io.BufferedReader r21 = new java.io.BufferedReader     // Catch:{ all -> 0x1761 }
            r2 = r21
            r2.<init>(r3)     // Catch:{ all -> 0x1761 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x1661 }
            r3.<init>(r11)     // Catch:{ all -> 0x1661 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ UnsupportedEncodingException -> 0x165c }
            r2.<init>(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x165c }
            java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ UnsupportedEncodingException -> 0x165c }
            r15.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x165c }
            java.lang.String r5 = r21.readLine()     // Catch:{ all -> 0x1652 }
            r20 = 1
        L_0x1536:
            if (r5 == 0) goto L_0x15ef
            java.lang.String r16 = r21.readLine()     // Catch:{ all -> 0x1652 }
            if (r16 != 0) goto L_0x156a
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch:{ all -> 0x1652 }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x1652 }
            if (r2 == 0) goto L_0x156a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1652 }
            r3.<init>()     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file replacing following statement with 'commit transaction': "
            r3.append(r2)     // Catch:{ all -> 0x1652 }
            r3.append(r5)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1652 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1652 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x1652 }
            java.lang.String r3 = r5.toUpperCase(r2)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "COMMIT TRANSACTION;"
            java.lang.String r5 = r3.replace(r14, r2)     // Catch:{ all -> 0x1652 }
        L_0x156a:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x1652 }
            java.lang.String r4 = r5.toUpperCase(r2)     // Catch:{ all -> 0x1652 }
            java.lang.String r3 = "\""
            java.lang.String r2 = "'"
            java.lang.String r3 = r4.replace(r3, r2)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x1652 }
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x1597
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1652 }
            r3.<init>()     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file creation of virtual table messages_fts will take care of this, ignoring: "
            r3.append(r2)     // Catch:{ all -> 0x1652 }
            r3.append(r5)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1652 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1652 }
            r5 = r4
        L_0x1597:
            if (r20 == 0) goto L_0x15be
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x1652 }
            java.lang.String r3 = r5.toUpperCase(r2)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "CREATE TABLE "
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x1652 }
            if (r2 == 0) goto L_0x15bc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1652 }
            r3.<init>()     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file transaction started, ignoring: "
            r3.append(r2)     // Catch:{ all -> 0x1652 }
            r3.append(r5)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1652 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1652 }
            r5 = r4
        L_0x15bc:
            r20 = 0
        L_0x15be:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x1652 }
            java.lang.String r3 = r5.toUpperCase(r2)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "INSERT INTO SQLITE_MASTER"
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x1652 }
            if (r2 == 0) goto L_0x15e9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1652 }
            r3.<init>()     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file ignoring: "
            r3.append(r2)     // Catch:{ all -> 0x1652 }
            r3.append(r5)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1652 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1652 }
        L_0x15e0:
            r15.write(r4)     // Catch:{ all -> 0x1652 }
            java.lang.String r2 = "\n"
            r15.write(r2)     // Catch:{ all -> 0x1652 }
            goto L_0x15eb
        L_0x15e9:
            r4 = r5
            goto L_0x15e0
        L_0x15eb:
            r5 = r16
            goto L_0x1536
        L_0x15ef:
            r15.close()     // Catch:{ all -> 0x1661 }
            r21.close()     // Catch:{ all -> 0x1761 }
            r2 = 5
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            r3[r19] = r2     // Catch:{ all -> 0x1761 }
            long r4 = r6.length()     // Catch:{ all -> 0x1761 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x1761 }
            r3[r23] = r2     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r11.getAbsolutePath()     // Catch:{ all -> 0x1761 }
            r3[r34] = r2     // Catch:{ all -> 0x1761 }
            long r4 = r11.length()     // Catch:{ all -> 0x1761 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x1761 }
            r3[r28] = r2     // Catch:{ all -> 0x1761 }
            r2 = 4
            r3[r2] = r6     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "sqlite-repair/cleanup-per-table-dump-file deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r9, r2, r3)     // Catch:{ all -> 0x1761 }
            boolean r2 = r6.delete()     // Catch:{ all -> 0x1761 }
            if (r2 == 0) goto L_0x14db
            r11.renameTo(r6)     // Catch:{ all -> 0x1761 }
            goto L_0x14db
        L_0x162b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x1761 }
            r4.<init>()     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = "sqlite-repair/recover-database-table/success \""
            r4.append(r2)     // Catch:{ all -> 0x1761 }
            r4.append(r3)     // Catch:{ all -> 0x1761 }
            r4.append(r7)     // Catch:{ all -> 0x1761 }
            long r2 = r6.length()     // Catch:{ all -> 0x1761 }
            r4.append(r2)     // Catch:{ all -> 0x1761 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x1761 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1761 }
            goto L_0x148b
        L_0x164b:
            X.AnonymousClass6YY.A0P(r6)     // Catch:{ Exception -> 0x1766 }
            r4 = r22
            goto L_0x1416
        L_0x1652:
            r2 = move-exception
            r15.close()     // Catch:{ all -> 0x1657 }
            goto L_0x1660
        L_0x1657:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ all -> 0x1661 }
            goto L_0x1660
        L_0x165c:
            r2 = move-exception
            X.AnonymousClass14X.A02(r3)     // Catch:{ all -> 0x1661 }
        L_0x1660:
            throw r2     // Catch:{ all -> 0x1661 }
        L_0x1661:
            r3 = move-exception
            r21.close()     // Catch:{ all -> 0x1666 }
            goto L_0x166a
        L_0x1666:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x1761 }
        L_0x166a:
            throw r3     // Catch:{ all -> 0x1761 }
        L_0x166b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r3.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/set-db-version "
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r17.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r4 = r17.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            r3 = 0
            r2 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r4, r3, r2)     // Catch:{ Exception -> 0x1766 }
            r2 = r23
            r3.setVersion(r2)     // Catch:{ all -> 0x174b }
            r3.close()     // Catch:{ Exception -> 0x1766 }
            int r2 = A00(r13)     // Catch:{ Exception -> 0x1766 }
            long r6 = (long) r2     // Catch:{ Exception -> 0x1766 }
            int r2 = A00(r17)     // Catch:{ Exception -> 0x1766 }
            long r4 = (long) r2     // Catch:{ Exception -> 0x1766 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r2.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r3 = "sqlite-repair/check-restored-db/orig number of messages \""
            r2.append(r3)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r3 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            r2.append(r3)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r8 = "\" is "
            r2.append(r8)     // Catch:{ Exception -> 0x1766 }
            r2.append(r6)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r3.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/check-restored-db/restored number of messages \""
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r17.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            r3.append(r2)     // Catch:{ Exception -> 0x1766 }
            r3.append(r8)     // Catch:{ Exception -> 0x1766 }
            r3.append(r4)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1766 }
            r14.<init>()     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = "sqlite-repair/check-restored-db/ratio "
            r14.append(r2)     // Catch:{ Exception -> 0x1766 }
            double r8 = (double) r4     // Catch:{ Exception -> 0x1766 }
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r8 * r19
            double r10 = (double) r6     // Catch:{ Exception -> 0x1766 }
            double r2 = r2 / r10
            r14.append(r2)     // Catch:{ Exception -> 0x1766 }
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x1766 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x1766 }
            A09(r13)     // Catch:{ Exception -> 0x1766 }
            r17.getAbsolutePath()     // Catch:{ Exception -> 0x1766 }
            A09(r17)     // Catch:{ Exception -> 0x1766 }
            r15 = 0
            r2 = 0
            int r14 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x1714
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ Exception -> 0x1766 }
            r12.set(r3)     // Catch:{ Exception -> 0x1766 }
            goto L_0x1784
        L_0x1714:
            int r3 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r3 > 0) goto L_0x1727
            if (r14 <= 0) goto L_0x1727
            r3 = 4636807660098813952(0x4059400000000000, double:101.0)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ Exception -> 0x1766 }
            r12.set(r3)     // Catch:{ Exception -> 0x1766 }
            goto L_0x1729
        L_0x1727:
            r6 = 0
            goto L_0x172a
        L_0x1729:
            r6 = 1
        L_0x172a:
            double r8 = r8 / r10
            r4 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x1735
            goto L_0x1738
        L_0x1735:
            if (r6 == 0) goto L_0x1784
            goto L_0x1741
        L_0x1738:
            double r8 = r8 * r19
            java.lang.Double r3 = java.lang.Double.valueOf(r8)     // Catch:{ Exception -> 0x1766 }
            r12.set(r3)     // Catch:{ Exception -> 0x1766 }
        L_0x1741:
            r3 = r17
            boolean r3 = r3.renameTo(r13)     // Catch:{ Exception -> 0x1766 }
            if (r3 == 0) goto L_0x1784
            r2 = 1
            goto L_0x1784
        L_0x174b:
            r2 = move-exception
            if (r3 == 0) goto L_0x1765
            r3.close()     // Catch:{ all -> 0x1757 }
            goto L_0x1765
        L_0x1752:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x1757 }
            goto L_0x1765
        L_0x1757:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ Exception -> 0x1766 }
            goto L_0x1765
        L_0x175c:
            r2 = move-exception
            X.AnonymousClass6YY.A0P(r10)     // Catch:{ Exception -> 0x1766 }
            goto L_0x1765
        L_0x1761:
            r2 = move-exception
            X.AnonymousClass6YY.A0P(r6)     // Catch:{ Exception -> 0x1766 }
        L_0x1765:
            throw r2     // Catch:{ Exception -> 0x1766 }
        L_0x1766:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Error while restoring dbFile "
            r3.append(r2)
            java.lang.String r2 = r13.getAbsolutePath()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x1780
        L_0x177d:
            r4 = move-exception
            java.lang.String r2 = "libsqlite is not present on device, cannot perform dump and restore."
        L_0x1780:
            com.whatsapp.util.Log.e(r2, r4)
        L_0x1783:
            r2 = 0
        L_0x1784:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "MessageStoreBackup/restore/dumpAndRestoreResult/"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = " recovery %age: "
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r0.A07 = r3
            java.lang.Object r3 = r12.get()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.A0F = r3
            if (r2 != 0) goto L_0x17ba
            goto L_0x0ef7
        L_0x17ba:
            r35.A06()
            r2 = r35
            X.12f r8 = r2.A02
            monitor-enter(r8)
            r10 = 0
            r9 = 0
            java.lang.String r2 = "DatabaseHelper/verifyBackup - initialize backup verification."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x197d }
            X.12Z r7 = r8.A06     // Catch:{ all -> 0x197d }
            monitor-enter(r7)     // Catch:{ all -> 0x197d }
            boolean r6 = r7.A00     // Catch:{ all -> 0x197a }
            monitor-exit(r7)     // Catch:{ all -> 0x197d }
            X.38G r2 = X.AnonymousClass12f.A00(r8)     // Catch:{ all -> 0x197d }
            X.38H r5 = new X.38H     // Catch:{ all -> 0x197d }
            r5.<init>(r2)     // Catch:{ all -> 0x197d }
            r2 = r23
            r7.A00(r2)     // Catch:{ SQLiteException -> 0x1811, Exception -> 0x180a }
            X.14e r4 = r8.BJK()     // Catch:{ SQLiteException -> 0x1811, Exception -> 0x180a }
            java.lang.String r2 = "DatabaseHelper/verifyBackup - force re-create missing indexes."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x1811, Exception -> 0x180a }
            java.lang.String r3 = "DatabaseHelper/verifyBackup/restoreIndexes"
            X.14g r2 = new X.14g     // Catch:{ SQLiteException -> 0x17fa, Exception -> 0x180a }
            r2.<init>((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x17fa, Exception -> 0x180a }
            X.AnonymousClass12f.A02(r8, r4, r5)     // Catch:{ SQLiteException -> 0x17fa, Exception -> 0x180a }
            long r2 = r2.A01()     // Catch:{ SQLiteException -> 0x17fa, Exception -> 0x180a }
            long r2 = r2 / r25
            r10 = r2
            r9 = 1
            goto L_0x1800
        L_0x17fa:
            r3 = move-exception
            java.lang.String r2 = "DatabaseHelper/verifyBackup/restoreIndexes - database error."
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ SQLiteException -> 0x1811, Exception -> 0x180a }
        L_0x1800:
            r8.close()     // Catch:{ SQLiteException -> 0x1811, Exception -> 0x180a }
            java.lang.String r2 = "DatabaseHelper/verifyBackup - database is valid and ready to be used."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x1811, Exception -> 0x180a }
            r3 = 1
            goto L_0x1818
        L_0x180a:
            r3 = move-exception
            java.lang.String r2 = "DatabaseHelper/verifyBackup - unknown error."
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x1975 }
            goto L_0x1817
        L_0x1811:
            r3 = move-exception
            java.lang.String r2 = "DatabaseHelper/verifyBackup - database error."
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x1975 }
        L_0x1817:
            r3 = 0
        L_0x1818:
            r7.A00(r6)     // Catch:{ all -> 0x197d }
            monitor-exit(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r0.A09 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r0.A0K = r2
            if (r3 == 0) goto L_0x0ef7
            r28 = 1
            goto L_0x0ef7
        L_0x182e:
            r3 = move-exception
            java.lang.String r2 = "MessageStoreBackup/restore/plaintext error"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x1835 }
            goto L_0x1843
        L_0x1835:
            r3 = move-exception
            java.lang.String r2 = "MessageStoreBackup/restore/error"
            com.whatsapp.util.Log.w(r2, r3)
            java.lang.String r2 = r3.toString()
            r0.A0M = r2
            r9 = 3
            goto L_0x1844
        L_0x1843:
            r9 = 3
        L_0x1844:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/result/"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = r23
            if (r9 == r2) goto L_0x185e
            r23 = 0
        L_0x185e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)
            r0.A04 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r78)
            r0.A0L = r2
            switch(r9) {
                case 1: goto L_0x1917;
                case 2: goto L_0x1914;
                case 3: goto L_0x191a;
                case 4: goto L_0x1911;
                case 5: goto L_0x190e;
                default: goto L_0x186d;
            }
        L_0x186d:
            r2 = 6
        L_0x186e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A0C = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r76)
            r0.A0D = r2
            int r2 = r1.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A0B = r2
            X.0v0 r3 = r1.A0E
            r2 = 512(0x200, float:7.175E-43)
            r3.A14(r2)
            long r2 = r49.A01()
            long r2 = r2 / r25
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.A0G = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageStoreBackup/restore/log-chat-db-restore-event overall-result: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A04
            r3.append(r2)
            java.lang.String r2 = " database-backup-version: "
            r3.append(r2)
            java.lang.Long r2 = r0.A0E
            r3.append(r2)
            java.lang.String r2 = " file-integrity-check: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A03
            r3.append(r2)
            java.lang.String r2 = " jid-correct: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A02
            r3.append(r2)
            java.lang.String r2 = " database-repair-enabled: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A01
            r3.append(r2)
            java.lang.String r2 = " sqlite-integrity-check: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A06
            r3.append(r2)
            java.lang.String r2 = " has-only-index-errors: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A08
            r3.append(r2)
            java.lang.String r2 = " dump-and-restore-result: "
            r3.append(r2)
            java.lang.Boolean r2 = r0.A07
            r3.append(r2)
            java.lang.String r2 = " dump-and-restore-recovery-percentage: "
            r3.append(r2)
            java.lang.Long r2 = r0.A0F
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0yW r2 = r1.A0T
            r2.Bly(r0)
            switch(r9) {
                case 1: goto L_0x191d;
                case 2: goto L_0x193b;
                case 3: goto L_0x00d3;
                case 4: goto L_0x1946;
                case 5: goto L_0x1951;
                default: goto L_0x1903;
            }
        L_0x1903:
            java.lang.String r0 = "MessageStoreBackup/restore/increment/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r18 = 1
            r31 = 0
            goto L_0x00eb
        L_0x190e:
            r2 = 5
            goto L_0x186e
        L_0x1911:
            r2 = 4
            goto L_0x186e
        L_0x1914:
            r2 = 2
            goto L_0x186e
        L_0x1917:
            r2 = 1
            goto L_0x186e
        L_0x191a:
            r2 = 3
            goto L_0x186e
        L_0x191d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/success "
            r2.append(r0)
            java.lang.String r0 = r43.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r18 = 1
            r31 = 1
            goto L_0x00eb
        L_0x193b:
            int r37 = r37 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/file-integrity "
            goto L_0x00da
        L_0x1946:
            int r33 = r33 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/jid-mismatch "
            goto L_0x00da
        L_0x1951:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/out-of-space "
            r2.append(r0)
            java.lang.String r0 = r43.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r32 = 1
            goto L_0x00eb
        L_0x196d:
            java.lang.String r0 = "repair-disabled"
            goto L_0x008c
        L_0x1971:
            int r30 = r30 + 1
            goto L_0x0016
        L_0x1975:
            r0 = move-exception
            r7.A00(r6)     // Catch:{ all -> 0x197d }
            goto L_0x197c
        L_0x197a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x197d }
        L_0x197c:
            throw r0     // Catch:{ all -> 0x197d }
        L_0x197d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x1980:
            r2 = move-exception
            boolean r0 = r13.exists()
            if (r0 != 0) goto L_0x198e
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r1.A06()
            throw r2
        L_0x198e:
            java.io.File r0 = r1.A02()
            X.AnonymousClass6YY.A0P(r0)
            throw r2
        L_0x1996:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = r51
            r2.append(r0)
            if (r18 == 0) goto L_0x1a00
            java.lang.String r0 = "success"
        L_0x19a4:
            r2.append(r0)
            java.lang.String r0 = " num-backup-files-attempts: "
            r2.append(r0)
            r0 = 2
            r2.append(r0)
            java.lang.String r0 = " num-integrity-failure: "
            r2.append(r0)
            r0 = r37
            r2.append(r0)
            java.lang.String r0 = " num-jid-mismatch: "
            r2.append(r0)
            r0 = r33
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r18 == 0) goto L_0x19d8
            r1 = 21
            if (r31 == 0) goto L_0x19d2
            r1 = 1
        L_0x19d2:
            X.6Ni r0 = new X.6Ni
            r0.<init>(r1)
            return r0
        L_0x19d8:
            X.1QN r0 = r1.A0L
            r0.A00()
            X.12s r0 = r1.A0J
            r0.A02()
            if (r32 == 0) goto L_0x19eb
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 5
            goto L_0x19d2
        L_0x19eb:
            if (r33 <= 0) goto L_0x19f4
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/some-failures-are-jid-mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x19f2:
            r1 = 0
            goto L_0x19d2
        L_0x19f4:
            r1 = 2
            r0 = r37
            if (r0 != r1) goto L_0x19f2
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/all-failures-are-file-integrity-issues"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 4
            goto L_0x19d2
        L_0x1a00:
            java.lang.String r0 = "failed"
            goto L_0x19a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q9.A01(X.1Q9, X.7hk, java.util.List, int):X.6Ni");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04ab, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x096d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0980, code lost:
        if (r0.booleanValue() != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x098a, code lost:
        if (r0.booleanValue() != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0994, code lost:
        if (r0.booleanValue() != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0b66, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0b6f, code lost:
        if (r8.A0F.A01() == 0) goto L_0x0b71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0b71, code lost:
        com.whatsapp.util.Log.w("MessageStoreBackup/backupDatabase/out-of-space");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        r0 = r0.A01();
        java.lang.String.format(java.util.Locale.ENGLISH, "MessageStoreBackup backupDatabase time spent: %.2f seconds", new java.lang.Object[]{java.lang.Float.valueOf(((float) r0) / 1000.0f)});
        r3 = new java.lang.StringBuilder();
        r3.append("MessageStoreBackup/backupDatabase | time spent: ");
        r3.append(r0);
        com.whatsapp.util.Log.i(r3.toString());
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0ba3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("MessageStoreBackup/backupDatabase/failed ");
        r1.append(r2);
        r12.A00(r1.toString(), 4);
        r7.A0C = r2.toString();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:167:0x037c, B:189:0x0497] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x024b A[Catch:{ SQLiteException -> 0x0c8f, all -> 0x0d40 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x024e A[Catch:{ SQLiteException -> 0x0c8f, all -> 0x0d40 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x026f A[Catch:{ Exception -> 0x0c65 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0288 A[Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516, all -> 0x0567, all -> 0x0c4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0293 A[Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516, all -> 0x0567, all -> 0x0c4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03bb A[Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516, all -> 0x0567, all -> 0x0c4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x042a A[Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516, all -> 0x0567, all -> 0x0c4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x042f A[Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516, all -> 0x0567, all -> 0x0c4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0437 A[SYNTHETIC, Splitter:B:185:0x0437] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0ba3 A[ExcHandler: UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r2v23 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:224:0x05b6] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0c7e A[Catch:{ SQLiteException -> 0x0c8f, all -> 0x0d40 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0cef A[Catch:{ SQLiteException -> 0x0c8f, all -> 0x0d40 }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0cfd  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:183:0x0432=Splitter:B:183:0x0432, B:386:0x0b27=Splitter:B:386:0x0b27, B:203:0x04fa=Splitter:B:203:0x04fa, B:401:0x0bbf=Splitter:B:401:0x0bbf} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:437:0x0d20=Splitter:B:437:0x0d20, B:109:0x022e=Splitter:B:109:0x022e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0D(X.AnonymousClass7fT r54, java.lang.Runnable r55, int r56, int r57) {
        /*
            r53 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/backupdb backupTypeToCreate="
            r1.append(r0)
            r51 = r56
            r0 = r51
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = r53
            X.0wG r0 = r8.A0C
            android.content.Context r0 = r0.A00
            r50 = r0
            X.1Cg r12 = r8.A0W
            java.lang.String r0 = "checkaccounthashvalidity"
            r11 = 0
            r12.A00(r0, r11)
            X.62c r5 = X.AnonymousClass6YO.A04(r50)     // Catch:{ Exception -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "checkaccounthashvalidity/null-check: backup key is null = "
            r1.append(r0)
            r0 = 0
            if (r5 != 0) goto L_0x003a
            r0 = 1
        L_0x003a:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4 = 2
            r12.A00(r0, r4)
            if (r5 == 0) goto L_0x0072
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "checkaccounthashvalidity/google id salt is null = "
            r3.append(r0)
            X.63x r0 = r5.A00
            byte[] r2 = r0.A02
            r3.append(r11)
            java.lang.String r0 = " hashedGoogleId is null = "
            r3.append(r0)
            byte[] r1 = r5.A02
            r3.append(r11)
            java.lang.String r0 = r3.toString()
            r12.A00(r0, r4)
            byte[] r0 = X.AnonymousClass6YO.A0G(r2)
            boolean r0 = java.util.Arrays.equals(r0, r1)
            goto L_0x008b
        L_0x0072:
            r0 = 0
            goto L_0x008b
        L_0x0074:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "checkaccounthashvalidity/error = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0 = 3
            r12.A00(r1, r0)
            r0 = 0
        L_0x008b:
            r10 = 2
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "MessageStoreBackup/backupdb/check/invalid"
            r12.A00(r0, r10)
            r0 = 3
            return r0
        L_0x0095:
            X.1QH r4 = r8.A0h
            X.1QM r3 = r4.A08
            r0 = 0
            r2 = 1
            X.AnonymousClass1QH.A00(r4, r3, r0, r2)
            X.12P r0 = r8.A0K
            r49 = r0
            X.1M0 r2 = r49.A05()
            X.71s r3 = r2.B1k()     // Catch:{ all -> 0x0d6a }
            r49.A06()     // Catch:{ all -> 0x0d60 }
            X.12f r0 = r0.A02     // Catch:{ all -> 0x0d60 }
            r18 = r0
            X.14e r0 = r0.A00     // Catch:{ all -> 0x0d60 }
            if (r0 == 0) goto L_0x0d58
            java.lang.String r0 = "databasehelper/cleanBeforeBackup"
            X.14g r1 = new X.14g     // Catch:{ all -> 0x0d60 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0d60 }
            r0 = r18
            r0.A04(r2)     // Catch:{ all -> 0x0d60 }
            r1.A01()     // Catch:{ all -> 0x0d60 }
            r3.A00()     // Catch:{ all -> 0x0d60 }
            r3.close()     // Catch:{ all -> 0x0d6a }
            r2.close()
            java.lang.String r0 = "MessageStoreBackup/backupdb/ephemeral purge is done and starting backup now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Sv r7 = new X.2Sv
            r7.<init>()
            java.lang.Boolean r0 = X.C18750th.A03
            r6 = 1
            r0 = r57
            if (r0 != r6) goto L_0x00ec
            X.0zA r0 = r8.A0f
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "MessageStoreBackup/backup/skipping message backup since app is in foreground"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            return r0
        L_0x00ec:
            X.135 r29 = new X.135
            r29.<init>()
            r0 = r51
            if (r0 != r10) goto L_0x0159
            java.lang.String r1 = "MessageStoreBackup/IncrementalBkpLockTimer"
        L_0x00f7:
            r0 = r29
            r0.A02 = r1
            long r27 = android.os.SystemClock.uptimeMillis()
            X.0yC r3 = r8.A0S
            r0 = 7155(0x1bf3, float:1.0026E-41)
            X.0yV r2 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r2, r3, r0)
            if (r0 == 0) goto L_0x0121
            r0 = r51
            if (r0 != r10) goto L_0x0121
            java.lang.String r0 = "MessageStoreBackup/skip locking DB for incremental backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0114:
            X.005 r0 = r8.A0d
            java.lang.Object r0 = r0.get()
            X.0xJ r0 = (X.C20280xJ) r0
            r0.A04(r11)
            r1 = 0
            goto L_0x015c
        L_0x0121:
            java.lang.String r0 = "MessageStoreBackup/locking DB for full backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3968(0xf80, float:5.56E-42)
            int r9 = X.C20800yB.A00(r2, r3, r0)
            r49.A06()
            r0 = r49
            if (r9 <= 0) goto L_0x014a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r0.A04
        L_0x0135:
            long r0 = (long) r9
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x013f }
            boolean r0 = r5.tryLock(r0, r4)     // Catch:{ InterruptedException -> 0x013f }
            if (r0 == 0) goto L_0x0144
            goto L_0x014f
        L_0x013f:
            java.lang.String r0 = "MessageStoreBackup/lockMessageStoreDb interrupted while waiting for lock"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0144:
            r0 = 500(0x1f4, double:2.47E-321)
            android.os.SystemClock.sleep(r0)
            goto L_0x0135
        L_0x014a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            r0.lock()
        L_0x014f:
            X.00s r1 = r8.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A0C(r0)
            goto L_0x0114
        L_0x0159:
            java.lang.String r1 = "MessageStoreBackup/FullBkpLockTimer"
            goto L_0x00f7
        L_0x015c:
            r49.A06()     // Catch:{ Exception -> 0x018b }
            X.14e r5 = r18.BGW()     // Catch:{ Exception -> 0x018b }
            java.lang.String r4 = "select sqlite_version() AS sqlite_version"
            java.lang.String r0 = "GET_SQLITE_VERSION"
            X.1lC r5 = r5.A0B(r1, r4, r0, r1)     // Catch:{ Exception -> 0x018b }
            java.lang.String r4 = ""
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "sqlite_version"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r4 = r5.getString(r0)     // Catch:{ all -> 0x0181 }
        L_0x017d:
            r5.close()     // Catch:{ Exception -> 0x018b }
            goto L_0x0192
        L_0x0181:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0186 }
            goto L_0x018a
        L_0x0186:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ Exception -> 0x018b }
        L_0x018a:
            throw r4     // Catch:{ Exception -> 0x018b }
        L_0x018b:
            r4 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backup/errors/failed to query sqlite version"
            com.whatsapp.util.Log.e(r0, r4)
            r4 = r1
        L_0x0192:
            r7.A0F = r4
            r44 = r55
            r0 = r51
            if (r0 != r10) goto L_0x01af
            r0 = 7155(0x1bf3, float:1.0026E-41)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ all -> 0x0d40 }
            if (r0 == 0) goto L_0x01af
            r10 = 1
            java.lang.String r0 = "MessageStoreBackup/skip closing DB and wal checkpoint for Incremental backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d40 }
            if (r55 == 0) goto L_0x023f
            r44.run()     // Catch:{ all -> 0x0d40 }
            goto L_0x023f
        L_0x01af:
            r10 = 0
            r49.A06()     // Catch:{ all -> 0x0d40 }
            r0 = r49
            java.io.File r11 = r0.A03     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = "MessageStoreBackup/backupdb/beforeclose/list "
            X.AnonymousClass6YY.A0G(r11, r0)     // Catch:{ all -> 0x0d40 }
            r49.A06()     // Catch:{ all -> 0x0d40 }
            monitor-enter(r18)     // Catch:{ all -> 0x0d40 }
            r0 = r18
            X.14e r0 = r0.A00     // Catch:{ all -> 0x0d3d }
            r13 = 1
            if (r0 == 0) goto L_0x022e
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0d3d }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0d3d }
            if (r0 == 0) goto L_0x022e
            r0 = r18
            X.14e r0 = r0.A00     // Catch:{ all -> 0x0d3d }
            android.database.sqlite.SQLiteDatabase r4 = r0.A00     // Catch:{ all -> 0x0d3d }
            boolean r0 = r4.isWriteAheadLoggingEnabled()     // Catch:{ all -> 0x0d3d }
            if (r0 == 0) goto L_0x022e
            java.lang.String r0 = "PRAGMA wal_checkpoint(FULL);"
            android.database.Cursor r9 = r4.rawQuery(r0, r1)     // Catch:{ all -> 0x0d3d }
            if (r9 == 0) goto L_0x0d20
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x021f
            int r5 = r9.getInt(r10)     // Catch:{ all -> 0x0224 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0224 }
            r4.<init>()     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "msgstore/wal_checkpoint: "
            r4.append(r0)     // Catch:{ all -> 0x0224 }
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = " "
            r4.append(r1)     // Catch:{ all -> 0x0224 }
            int r0 = r9.getInt(r6)     // Catch:{ all -> 0x0224 }
            r4.append(r0)     // Catch:{ all -> 0x0224 }
            r4.append(r1)     // Catch:{ all -> 0x0224 }
            r0 = 2
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0224 }
            r4.append(r0)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0224 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0224 }
            if (r5 == 0) goto L_0x021b
            r13 = 0
        L_0x021b:
            r9.close()     // Catch:{ all -> 0x0d3d }
            goto L_0x022e
        L_0x021f:
            r9.close()     // Catch:{ all -> 0x0d3d }
            goto L_0x0d20
        L_0x0224:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0229 }
            goto L_0x022d
        L_0x0229:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d3d }
        L_0x022d:
            throw r1     // Catch:{ all -> 0x0d3d }
        L_0x022e:
            monitor-exit(r18)     // Catch:{ all -> 0x0d40 }
            if (r13 == 0) goto L_0x0d21
            r49.A06()     // Catch:{ all -> 0x0d40 }
            r18.close()     // Catch:{ all -> 0x0d40 }
            r49.A06()     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = "MessageStoreBackup/backupdb/afterclose/list "
            X.AnonymousClass6YY.A0G(r11, r0)     // Catch:{ all -> 0x0d40 }
        L_0x023f:
            X.1Ck r0 = r8.A06     // Catch:{ all -> 0x0d40 }
            r39 = r0
            X.0v0 r0 = r0.A03     // Catch:{ all -> 0x0d40 }
            boolean r0 = r0.A2I()     // Catch:{ all -> 0x0d40 }
            if (r0 == 0) goto L_0x024e
            X.5U6 r5 = X.AnonymousClass5U6.CRYPT15     // Catch:{ all -> 0x0d40 }
            goto L_0x0250
        L_0x024e:
            X.5U6 r5 = X.AnonymousClass5U6.CRYPT14     // Catch:{ all -> 0x0d40 }
        L_0x0250:
            X.3vo r41 = new X.3vo     // Catch:{ Exception -> 0x0c65 }
            r42 = r8
            r43 = r29
            r45 = r51
            r46 = r27
            r48 = r10
            r41.<init>(r42, r43, r44, r45, r46, r48)     // Catch:{ Exception -> 0x0c65 }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0c65 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0c65 }
            r7.A06 = r9     // Catch:{ Exception -> 0x0c65 }
            r4 = 2
            r0 = r51
            if (r0 != r4) goto L_0x0273
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0c65 }
        L_0x0273:
            r7.A05 = r9     // Catch:{ Exception -> 0x0c65 }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0c65 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            X.1Cb r0 = r8.A0A     // Catch:{ all -> 0x0c4b }
            r40 = r0
            boolean r0 = r40.A02()     // Catch:{ all -> 0x0c4b }
            if (r0 == 0) goto L_0x0293
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/skip no media or read-only media"
            r12.A00(r1, r4)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "no/read-only media"
        L_0x028f:
            r7.A0C = r0     // Catch:{ all -> 0x0c4b }
            goto L_0x0c16
        L_0x0293:
            r49.A06()     // Catch:{ all -> 0x0c4b }
            r0 = r49
            java.io.File r11 = r0.A03     // Catch:{ all -> 0x0c4b }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x0c4b }
            if (r0 != 0) goto L_0x02bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r1.<init>()     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0c4b }
            r49.A06()     // Catch:{ all -> 0x0c4b }
            r1.append(r11)     // Catch:{ all -> 0x0c4b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c4b }
            r0 = 4
            r12.A00(r1, r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "db file not found"
            goto L_0x028f
        L_0x02bb:
            java.io.File r1 = r8.A0K(r5)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "backupDatabase"
            boolean r0 = A0A(r1, r0)     // Catch:{ all -> 0x0c4b }
            if (r0 == 0) goto L_0x0c16
            r0 = 4329(0x10e9, float:6.066E-42)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ all -> 0x0c4b }
            if (r0 == 0) goto L_0x02f9
            X.15x r0 = r8.A0H     // Catch:{ all -> 0x0c4b }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x0c4b }
            r0.A06()     // Catch:{ all -> 0x0c4b }
            java.io.File r0 = r0.A03     // Catch:{ all -> 0x0c4b }
            boolean r0 = A09(r0)     // Catch:{ all -> 0x0c4b }
            if (r0 != 0) goto L_0x02f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r1.<init>()     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/database corrupted "
            r1.append(r0)     // Catch:{ all -> 0x0c4b }
            r49.A06()     // Catch:{ all -> 0x0c4b }
            r1.append(r11)     // Catch:{ all -> 0x0c4b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c4b }
            r0 = 4
            r12.A00(r1, r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "db corrupted"
            goto L_0x028f
        L_0x02f9:
            r52 = r54
            r0 = r51
            if (r0 == r6) goto L_0x0586
            java.lang.String r23 = "MessageStoreBackup/createIncrementalBackup/failed "
            java.lang.String r15 = "MessageStoreBackup createIncrementalBackup time spent: %.2f seconds"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r1.<init>()     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/"
            r1.append(r0)     // Catch:{ all -> 0x0c4b }
            r1.append(r5)     // Catch:{ all -> 0x0c4b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c4b }
            X.14g r22 = new X.14g     // Catch:{ all -> 0x0c4b }
            r0 = r22
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0c4b }
            int r0 = r5.version     // Catch:{ all -> 0x0c4b }
            long r0 = (long) r0     // Catch:{ all -> 0x0c4b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0c4b }
            r7.A07 = r0     // Catch:{ all -> 0x0c4b }
            r21 = 1148846080(0x447a0000, float:1000.0)
            r9 = 0
            r10 = 0
            r14 = 7155(0x1bf3, float:1.0026E-41)
            boolean r0 = X.C20800yB.A01(r2, r3, r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r16 = -1
            if (r0 == 0) goto L_0x0381
            X.1QQ r0 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.005 r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.3Sy r0 = (X.C65653Sy) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.12P r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.1M0 r1 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.14e r11 = r1.A02     // Catch:{ all -> 0x037b }
            java.lang.String r4 = "SELECT _id FROM backup_changes ORDER BY _id DESC  LIMIT 1"
            java.lang.String r0 = "BackupChangesStore/FETCH_LAST_ID"
            android.database.Cursor r0 = r11.A09(r4, r0, r10)     // Catch:{ all -> 0x037b }
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x036f }
            if (r4 != 0) goto L_0x035a
            java.lang.String r4 = "BackupChangesStore//failed to fetch ID of last row"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x036f }
            r47 = -1
            goto L_0x0364
        L_0x035a:
            java.lang.String r4 = "_id"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x036f }
            long r47 = r0.getLong(r4)     // Catch:{ all -> 0x036f }
        L_0x0364:
            r0.close()     // Catch:{ all -> 0x037b }
            r1.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            int r0 = (r47 > r16 ? 1 : (r47 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0394
            goto L_0x0383
        L_0x036f:
            r2 = move-exception
            if (r0 == 0) goto L_0x037a
            r0.close()     // Catch:{ all -> 0x0376 }
            goto L_0x037a
        L_0x0376:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x037b }
        L_0x037a:
            throw r2     // Catch:{ all -> 0x037b }
        L_0x037b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x04b0 }
            goto L_0x04b4
        L_0x0381:
            r47 = -1
        L_0x0383:
            boolean r0 = X.C20800yB.A01(r2, r3, r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            if (r0 == 0) goto L_0x0394
            java.lang.String r0 = "MessageStoreBackup/null last ID. Failing incremental Backup"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = "failed to fetch lastID for incremental backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            goto L_0x0432
        L_0x0394:
            r0 = 2
            java.util.ArrayList r1 = r8.A0N(r5, r0, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r4 = r8.A04(r5, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.4YX r0 = new X.4YX     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r0.<init>(r4, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.util.Collections.sort(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            int r0 = r1.size()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            if (r0 <= 0) goto L_0x042f
            java.lang.Object r0 = r1.get(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = r0.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            boolean r0 = r0.matches(r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            if (r0 == 0) goto L_0x042f
            java.lang.Object r0 = r1.get(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r1 = r0.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = "$1"
            java.lang.String r0 = r1.replaceAll(r4, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            int r0 = r0 + 1
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
        L_0x03d5:
            java.lang.String r0 = "\\Q"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.replace(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = "\\E"
            java.lang.String r4 = r4.replace(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = "(\\d+)"
            java.lang.String r11 = r4.replace(r0, r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.179 r0 = r8.A09     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.io.File r4 = r0.A03()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.io.File r16 = new java.io.File     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r0 = r16
            r0.<init>(r4, r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.1CS r0 = r8.A0X     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r17 = r0
            X.0wQ r13 = r8.A05     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.1CY r11 = r8.A0G     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.0yF r4 = r8.A0U     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.005 r0 = r8.A0b     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.6Uy r0 = (X.C132716Uy) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r30 = r13
            r31 = r0
            r32 = r39
            r33 = r40
            r34 = r11
            r35 = r4
            r36 = r12
            r37 = r5
            r38 = r17
            r39 = r16
            r40 = r10
            X.6QE r5 = X.C109765Za.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r0 = r50
            boolean r0 = r5.A08(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            if (r0 != 0) goto L_0x0437
            java.lang.String r0 = "failed to prepare for backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            goto L_0x0432
        L_0x042f:
            java.lang.String r11 = "1"
            goto L_0x03d5
        L_0x0432:
            r41.run()     // Catch:{ all -> 0x0c4b }
            goto L_0x0551
        L_0x0437:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r11.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/to "
            r11.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = r16.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r11.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = r11.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.0yG r0 = r4.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.io.File r10 = r0.A01(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.1QQ r4 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            android.os.CancellationSignal r43 = new android.os.CancellationSignal     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r43.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r13 = 10
            r11 = 80
            X.6pQ r1 = new X.6pQ     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r0 = r52
            r1.<init>(r0, r13, r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r42 = r4
            r44 = r1
            r45 = r7
            r46 = r10
            r42.A00(r43, r44, r45, r46, r47)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r13 = 90
            r11 = 100
            X.6pQ r1 = new X.6pQ     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r1.<init>(r0, r13, r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r5.A07(r1, r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            boolean r0 = X.C20800yB.A01(r2, r3, r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            if (r0 == 0) goto L_0x04b5
            java.lang.String r0 = "MessageStoreIncrementalBackup/cleaning tracked changes V2"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.005 r0 = r4.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.3Sy r0 = (X.C65653Sy) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.12P r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.1M0 r4 = r0.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x04ab }
            java.lang.String r2 = "backup_changes"
            java.lang.String r1 = "_id <= ?"
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x04ab }
            java.lang.String r5 = java.lang.String.valueOf(r47)     // Catch:{ all -> 0x04ab }
            r0[r9] = r5     // Catch:{ all -> 0x04ab }
            java.lang.String r5 = "BackupChangesStore/DELETE_BACKUP_CHANGES_V2"
            r3.A03(r2, r1, r5, r0)     // Catch:{ all -> 0x04ab }
            goto L_0x04c6
        L_0x04ab:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x04b0 }
            goto L_0x04b4
        L_0x04b0:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
        L_0x04b4:
            throw r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
        L_0x04b5:
            java.lang.String r0 = "MessageStoreIncrementalBackup/cleaning tracked changes V1"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.005 r0 = r4.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            X.3Sy r0 = (X.C65653Sy) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r0.A07()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            goto L_0x04c9
        L_0x04c6:
            r4.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
        L_0x04c9:
            long r4 = r10.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            long r2 = r16.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/file/size: "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r1.append(r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r7.A09 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x04fa
            double r0 = (double) r4     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            double r4 = (double) r2     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            double r0 = r0 / r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
            r7.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x052d, IOException -> 0x0516 }
        L_0x04fa:
            r41.run()     // Catch:{ all -> 0x0c4b }
            X.AnonymousClass6YY.A0P(r10)     // Catch:{ all -> 0x0c4b }
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            long r0 = r22.A01()     // Catch:{ all -> 0x0c4b }
            float r4 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r4 = r4 / r21
            java.lang.Float r0 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0c4b }
            r2[r9] = r0     // Catch:{ all -> 0x0c4b }
            java.lang.String.format(r3, r15, r2)     // Catch:{ all -> 0x0c4b }
            goto L_0x0b63
        L_0x0516:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0567 }
            r2.<init>()     // Catch:{ all -> 0x0567 }
            r0 = r23
            r2.append(r0)     // Catch:{ all -> 0x0567 }
            r2.append(r1)     // Catch:{ all -> 0x0567 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0567 }
            r0 = 4
            r12.A00(r2, r0)     // Catch:{ all -> 0x0567 }
            throw r1     // Catch:{ all -> 0x0567 }
        L_0x052d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0567 }
            r2.<init>()     // Catch:{ all -> 0x0567 }
            r0 = r23
            r2.append(r0)     // Catch:{ all -> 0x0567 }
            r2.append(r1)     // Catch:{ all -> 0x0567 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0567 }
            r0 = 4
            r12.A00(r2, r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0567 }
            r7.A0C = r0     // Catch:{ all -> 0x0567 }
            r41.run()     // Catch:{ all -> 0x0c4b }
            if (r10 == 0) goto L_0x0551
            X.AnonymousClass6YY.A0P(r10)     // Catch:{ all -> 0x0c4b }
        L_0x0551:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            long r0 = r22.A01()     // Catch:{ all -> 0x0c4b }
            float r4 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r4 = r4 / r21
            java.lang.Float r0 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0c4b }
            r2[r9] = r0     // Catch:{ all -> 0x0c4b }
            java.lang.String.format(r3, r15, r2)     // Catch:{ all -> 0x0c4b }
            goto L_0x0c16
        L_0x0567:
            r5 = move-exception
            r41.run()     // Catch:{ all -> 0x0c4b }
            if (r10 == 0) goto L_0x0570
            X.AnonymousClass6YY.A0P(r10)     // Catch:{ all -> 0x0c4b }
        L_0x0570:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            long r0 = r22.A01()     // Catch:{ all -> 0x0c4b }
            float r4 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r4 = r4 / r21
            java.lang.Float r0 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0c4b }
            r2[r9] = r0     // Catch:{ all -> 0x0c4b }
            java.lang.String.format(r3, r15, r2)     // Catch:{ all -> 0x0c4b }
            goto L_0x0c15
        L_0x0586:
            java.lang.String r24 = "MessageStoreBackup/backupDatabase | time spent: "
            java.lang.String r23 = "MessageStoreBackup backupDatabase time spent: %.2f seconds"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r1.<init>()     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/full/"
            r1.append(r0)     // Catch:{ all -> 0x0c4b }
            r1.append(r5)     // Catch:{ all -> 0x0c4b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c4b }
            X.14g r30 = new X.14g     // Catch:{ all -> 0x0c4b }
            r0 = r30
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0c4b }
            r37 = 1
            r8.A0P(r6)     // Catch:{ all -> 0x0c4b }
            int r0 = r5.version     // Catch:{ all -> 0x0c4b }
            long r0 = (long) r0     // Catch:{ all -> 0x0c4b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0c4b }
            r7.A07 = r0     // Catch:{ all -> 0x0c4b }
            r9 = 0
            r26 = 1148846080(0x447a0000, float:1000.0)
            r25 = 0
            r49.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r21 = r11.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.Long r0 = java.lang.Long.valueOf(r21)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r7.A09 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/size "
            r4.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r0 = r21
            r4.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r4.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r49.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r0 = r21
            java.io.File r36 = A03(r8, r11, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r49.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r0 = r36
            boolean r0 = r11.equals(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 != 0) goto L_0x05f5
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/unlocking db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r41.run()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x05f5:
            r49.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r0 = r36
            boolean r0 = r11.equals(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 != 0) goto L_0x0972
            r0 = r36
            boolean r0 = r0.setWritable(r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x0972
            java.lang.String r35 = "newsletter_message_enforcements"
            java.lang.String r34 = " ms"
            java.lang.String r33 = "status_crossposting"
            java.lang.String r1 = r36.getAbsolutePath()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r0 = 0
            android.database.sqlite.SQLiteDatabase r4 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r14 = X.C56652wf.A01     // Catch:{ Exception -> 0x0653 }
            r15 = 0
            android.database.Cursor r13 = r4.rawQuery(r14, r0)     // Catch:{ Exception -> 0x0653 }
            int r1 = r13.getCount()     // Catch:{ all -> 0x0647 }
            r0 = 0
            if (r1 <= 0) goto L_0x0626
            r0 = 1
        L_0x0626:
            r13.close()     // Catch:{ Exception -> 0x0653 }
            if (r0 == 0) goto L_0x0657
            java.lang.String r13 = "message_thumbnail"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x0659 }
            r1.<init>()     // Catch:{ SQLException -> 0x0659 }
            java.lang.String r0 = "message_row_id IN ("
            r1.append(r0)     // Catch:{ SQLException -> 0x0659 }
            r1.append(r14)     // Catch:{ SQLException -> 0x0659 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ SQLException -> 0x0659 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLException -> 0x0659 }
            r4.delete(r13, r1, r15)     // Catch:{ SQLException -> 0x0659 }
            goto L_0x0657
        L_0x0647:
            r1 = move-exception
            if (r13 == 0) goto L_0x0652
            r13.close()     // Catch:{ all -> 0x064e }
            goto L_0x0652
        L_0x064e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0653 }
        L_0x0652:
            throw r1     // Catch:{ Exception -> 0x0653 }
        L_0x0653:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ SQLException -> 0x0659 }
        L_0x0657:
            r0 = 1
            goto L_0x0660
        L_0x0659:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailHelper/deleteMediaThumbnails failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0966 }
            r0 = 0
        L_0x0660:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0966 }
            r7.A02 = r0     // Catch:{ all -> 0x0966 }
            X.005 r0 = r8.A0c     // Catch:{ all -> 0x0966 }
            r0.get()     // Catch:{ all -> 0x0966 }
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ all -> 0x0966 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x068a }
            r14.<init>()     // Catch:{ SQLiteException -> 0x068a }
            java.lang.String r0 = "reporting_token_content"
            r13 = 0
            r14.put(r0, r13)     // Catch:{ SQLiteException -> 0x068a }
            java.lang.String r1 = "version"
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x068a }
            r14.put(r1, r0)     // Catch:{ SQLiteException -> 0x068a }
            java.lang.String r0 = "reporting_token"
            r4.update(r0, r14, r13, r13)     // Catch:{ SQLiteException -> 0x068a }
            goto L_0x0690
        L_0x068a:
            r1 = move-exception
            java.lang.String r0 = "ReportingTokenTable/deleteDataBeforeBackup failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0966 }
        L_0x0690:
            long r0 = r36.length()     // Catch:{ all -> 0x0966 }
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r13
            int r13 = (int) r0     // Catch:{ all -> 0x0966 }
            r0 = 3075(0xc03, float:4.309E-42)
            int r0 = X.C20800yB.A00(r2, r3, r0)     // Catch:{ all -> 0x0966 }
            r1 = 0
            if (r13 > r0) goto L_0x06a3
            r1 = 1
        L_0x06a3:
            r0 = 2660(0xa64, float:3.727E-42)
            boolean r0 = X.C20800yB.A01(r2, r3, r0)     // Catch:{ all -> 0x0966 }
            if (r0 == 0) goto L_0x0943
            if (r1 == 0) goto L_0x08bc
            long r16 = r36.length()     // Catch:{ all -> 0x0966 }
            java.lang.String r2 = "backup"
            X.12S r1 = r8.A0Q     // Catch:{ all -> 0x0966 }
            X.11g r0 = r8.A0P     // Catch:{ all -> 0x0966 }
            X.14e r3 = X.C224014d.A01(r4, r0, r1, r2)     // Catch:{ all -> 0x0966 }
            X.14g r2 = new X.14g     // Catch:{ all -> 0x0966 }
            r0 = 0
            r2.<init>((boolean) r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            r2.A03()     // Catch:{ all -> 0x0966 }
            java.lang.String r14 = "msgtore_db_schema_version"
            X.AnonymousClass14m.A01(r3, r14)     // Catch:{ all -> 0x0966 }
            java.lang.String r32 = "msgtore_db_schema_indexes_version"
            r0 = r32
            X.AnonymousClass14m.A01(r3, r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "migration_fts_index"
            X.AnonymousClass14m.A01(r3, r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "migration_fts_retry"
            X.AnonymousClass14m.A01(r3, r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "fts_index_start"
            X.AnonymousClass14m.A01(r3, r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r13 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0966 }
            java.lang.String r1 = "fts_ready"
            java.lang.String r0 = "FtsMessageStore"
            X.AnonymousClass14m.A03(r3, r1, r13, r0)     // Catch:{ all -> 0x0966 }
            X.AnonymousClass14m.A01(r3, r14)     // Catch:{ all -> 0x0966 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0966 }
            r14.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "messages_fts"
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String[] r0 = X.AnonymousClass161.A00     // Catch:{ all -> 0x0966 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0966 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0966 }
            r1.<init>(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "v2"
            r1.add(r0)     // Catch:{ all -> 0x0966 }
            java.util.Iterator r31 = r1.iterator()     // Catch:{ all -> 0x0966 }
        L_0x0710:
            boolean r0 = r31.hasNext()     // Catch:{ all -> 0x0966 }
            if (r0 == 0) goto L_0x07a5
            java.lang.Object r13 = r31.next()     // Catch:{ all -> 0x0966 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r0.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r1 = "message_fts"
            r0.append(r1)     // Catch:{ all -> 0x0966 }
            r0.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0966 }
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r15.<init>()     // Catch:{ all -> 0x0966 }
            r15.append(r1)     // Catch:{ all -> 0x0966 }
            r15.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "_content"
            r15.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0966 }
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r15.<init>()     // Catch:{ all -> 0x0966 }
            r15.append(r1)     // Catch:{ all -> 0x0966 }
            r15.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "_docsize"
            r15.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0966 }
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r15.<init>()     // Catch:{ all -> 0x0966 }
            r15.append(r1)     // Catch:{ all -> 0x0966 }
            r15.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "_segdir"
            r15.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0966 }
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r15.<init>()     // Catch:{ all -> 0x0966 }
            r15.append(r1)     // Catch:{ all -> 0x0966 }
            r15.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "_segments"
            r15.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0966 }
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r15.<init>()     // Catch:{ all -> 0x0966 }
            r15.append(r1)     // Catch:{ all -> 0x0966 }
            r15.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "_stat"
            r15.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0966 }
            r14.add(r0)     // Catch:{ all -> 0x0966 }
            goto L_0x0710
        L_0x07a5:
            java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x0966 }
            r1 = 1
        L_0x07aa:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0966 }
            if (r0 == 0) goto L_0x07d3
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0966 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "DatabaseUtils"
            X.C224614k.A03(r3, r0, r14)     // Catch:{ SQLException -> 0x07bc }
            goto L_0x07aa
        L_0x07bc:
            r13 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r1.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "DatabaseUtils/dropTables/failed to drop table: "
            r1.append(r0)     // Catch:{ all -> 0x0966 }
            r1.append(r14)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0966 }
            com.whatsapp.util.Log.e(r0, r13)     // Catch:{ all -> 0x0966 }
            r1 = 0
            goto L_0x07aa
        L_0x07d3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0966 }
            r7.A00 = r0     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r13.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/end. Time elapsed: "
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            long r0 = r2.A01()     // Catch:{ all -> 0x0966 }
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            r0 = r34
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0966 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            r2.A01 = r9     // Catch:{ all -> 0x0966 }
            r2.A00 = r9     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            r2.A03()     // Catch:{ all -> 0x0966 }
            r49.A06()     // Catch:{ all -> 0x0966 }
            X.38G r0 = X.AnonymousClass12f.A00(r18)     // Catch:{ SQLException -> 0x086e }
            X.38H r1 = new X.38H     // Catch:{ SQLException -> 0x086e }
            r1.<init>(r0)     // Catch:{ SQLException -> 0x086e }
            X.3Qo r13 = new X.3Qo     // Catch:{ SQLException -> 0x086e }
            r13.<init>()     // Catch:{ SQLException -> 0x086e }
            r0 = r18
            X.005 r0 = r0.A0A     // Catch:{ SQLException -> 0x086e }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLException -> 0x086e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ SQLException -> 0x086e }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ SQLException -> 0x086e }
        L_0x0821:
            boolean r0 = r14.hasNext()     // Catch:{ SQLException -> 0x086e }
            if (r0 == 0) goto L_0x0831
            java.lang.Object r0 = r14.next()     // Catch:{ SQLException -> 0x086e }
            X.15z r0 = (X.AnonymousClass15z) r0     // Catch:{ SQLException -> 0x086e }
            r0.B7n(r3, r1, r13)     // Catch:{ SQLException -> 0x086e }
            goto L_0x0821
        L_0x0831:
            java.lang.String r1 = "DatabaseHelper"
            java.util.Map r0 = r13.A01     // Catch:{ SQLException -> 0x086e }
            java.util.Set r0 = r0.keySet()     // Catch:{ SQLException -> 0x086e }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ SQLException -> 0x086e }
        L_0x083d:
            boolean r0 = r14.hasNext()     // Catch:{ SQLException -> 0x086e }
            if (r0 == 0) goto L_0x084d
            java.lang.Object r0 = r14.next()     // Catch:{ SQLException -> 0x086e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SQLException -> 0x086e }
            X.C224614k.A02(r3, r1, r0)     // Catch:{ SQLException -> 0x086e }
            goto L_0x083d
        L_0x084d:
            java.util.Map r0 = r13.A00     // Catch:{ SQLException -> 0x086e }
            java.util.Set r0 = r0.keySet()     // Catch:{ SQLException -> 0x086e }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ SQLException -> 0x086e }
        L_0x0857:
            boolean r0 = r13.hasNext()     // Catch:{ SQLException -> 0x086e }
            if (r0 == 0) goto L_0x0867
            java.lang.Object r0 = r13.next()     // Catch:{ SQLException -> 0x086e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SQLException -> 0x086e }
            X.C224614k.A02(r3, r1, r0)     // Catch:{ SQLException -> 0x086e }
            goto L_0x0857
        L_0x0867:
            r0 = r32
            X.AnonymousClass14m.A01(r3, r0)     // Catch:{ SQLException -> 0x086e }
            r0 = 1
            goto L_0x0874
        L_0x086e:
            java.lang.String r0 = "DatabaseHelperdropIndexes failed to drop all of the indexes"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            r0 = 0
        L_0x0874:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0966 }
            r7.A01 = r0     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r13.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/end. Time elapsed: "
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            long r0 = r2.A01()     // Catch:{ all -> 0x0966 }
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            r0 = r34
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0966 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            r2.A01 = r9     // Catch:{ all -> 0x0966 }
            r2.A00 = r9     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            r2.A03()     // Catch:{ all -> 0x0966 }
            java.lang.String r14 = "MessageStoreBackup"
            java.lang.String r13 = "VACUUM"
            java.lang.String r1 = "vacuumDb"
            java.lang.String r0 = "vacuum"
            java.lang.String r0 = X.C63853Lr.A01(r14, r1, r0)     // Catch:{ SQLException -> 0x08b4 }
            r3.A0D(r13, r0)     // Catch:{ SQLException -> 0x08b4 }
            r0 = 1
            goto L_0x08e4
        L_0x08b4:
            r1 = move-exception
            java.lang.String r0 = "SharedDBQueryExecutor/vacuumDb/failed to vacuum"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0966 }
            r0 = 0
            goto L_0x08e4
        L_0x08bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r1.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/skip DB cleanup as originalDBSize: "
            r1.append(r0)     // Catch:{ all -> 0x0966 }
            r1.append(r13)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MB exceeds threshold limit: "
            r1.append(r0)     // Catch:{ all -> 0x0966 }
            r0 = 3075(0xc03, float:4.309E-42)
            int r0 = X.C20800yB.A00(r2, r3, r0)     // Catch:{ all -> 0x0966 }
            r1.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MB"
            r1.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0966 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            goto L_0x0943
        L_0x08e4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0966 }
            r7.A03 = r0     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r3.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/end. Time elapsed: "
            r3.append(r0)     // Catch:{ all -> 0x0966 }
            long r0 = r2.A01()     // Catch:{ all -> 0x0966 }
            r3.append(r0)     // Catch:{ all -> 0x0966 }
            r0 = r34
            r3.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0966 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
            long r2 = r36.length()     // Catch:{ all -> 0x0966 }
            r13 = 100
            long r0 = r2 * r13
            long r0 = r0 / r16
            long r13 = r13 - r0
            java.lang.Long r14 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0966 }
            r7.A0A = r14     // Catch:{ all -> 0x0966 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0966 }
            r13.<init>()     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/original size "
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            r0 = r16
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = " cleaned size "
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            r13.append(r2)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = ", saved "
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            r13.append(r14)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = "%"
            r13.append(r0)     // Catch:{ all -> 0x0966 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0966 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0966 }
        L_0x0943:
            boolean r0 = android.text.TextUtils.isEmpty(r33)     // Catch:{ all -> 0x0966 }
            if (r0 != 0) goto L_0x0957
            r0 = r33
            boolean r0 = A08(r4, r0)     // Catch:{ all -> 0x0966 }
            if (r0 == 0) goto L_0x0957
            r1 = 0
            r0 = r33
            r4.delete(r0, r1, r1)     // Catch:{ all -> 0x0966 }
        L_0x0957:
            r0 = r35
            boolean r0 = A08(r4, r0)     // Catch:{ all -> 0x0966 }
            if (r0 == 0) goto L_0x0975
            r1 = 0
            r0 = r35
            r4.delete(r0, r1, r1)     // Catch:{ all -> 0x0966 }
            goto L_0x0975
        L_0x0966:
            r1 = move-exception
            if (r4 == 0) goto L_0x0971
            r4.close()     // Catch:{ all -> 0x096d }
            goto L_0x0971
        L_0x096d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x0971:
            throw r1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x0972:
            r37 = 0
            goto L_0x0996
        L_0x0975:
            r4.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.Boolean r0 = r7.A01     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x0982
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 != 0) goto L_0x0996
        L_0x0982:
            java.lang.Boolean r0 = r7.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x098c
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 != 0) goto L_0x0996
        L_0x098c:
            java.lang.Boolean r0 = r7.A03     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x0972
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x0972
        L_0x0996:
            java.io.File r46 = r8.A0K(r5)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.1CS r4 = r8.A0X     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.0wQ r3 = r8.A05     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.1CY r2 = r8.A0G     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.0yF r1 = r8.A0U     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.005 r0 = r8.A0b     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.6Uy r0 = (X.C132716Uy) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.Boolean r47 = java.lang.Boolean.valueOf(r37)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r37 = r3
            r38 = r0
            r41 = r2
            r42 = r1
            r43 = r12
            r44 = r5
            r45 = r4
            X.6QE r13 = X.C109765Za.A00(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r0 = r50
            boolean r0 = r13.A08(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 != 0) goto L_0x09ce
            java.lang.String r0 = "failed to prepare for backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            goto L_0x0bbf
        L_0x09ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/to "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r46.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1 = r52
            r0 = r36
            r13.A07(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r49.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            boolean r0 = r11.equals(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 != 0) goto L_0x09f9
            r36.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x09f9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/file-closed size="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r0 = r46.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = " modification time = "
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r0 = r46.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r4 = r46.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a30
            r0 = r21
            double r2 = (double) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            double r0 = (double) r4     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r7.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x0a30:
            X.61g r0 = r13.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            int r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == r6) goto L_0x0a6b
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/integrity-check/not-successful"
            r0 = 2
            r12.A00(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r0 = r30.A01()     // Catch:{ all -> 0x0c4b }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            float r2 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r2 = r2 / r26
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0c4b }
            r3[r25] = r2     // Catch:{ all -> 0x0c4b }
            r2 = r23
            java.lang.String.format(r4, r2, r3)     // Catch:{ all -> 0x0c4b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r3.<init>()     // Catch:{ all -> 0x0c4b }
            r2 = r24
            r3.append(r2)     // Catch:{ all -> 0x0c4b }
            r3.append(r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0c4b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            r2 = 3
            goto L_0x0c17
        L_0x0a6b:
            int r5 = r8.A0B()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.179 r0 = r8.A09     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.io.File r1 = r0.A03()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            X.725 r0 = X.AnonymousClass725.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.io.File[] r4 = r1.listFiles(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r4 == 0) goto L_0x0af0
            int r3 = r4.length     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r3 < r6) goto L_0x0af0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.util.Date r2 = new java.util.Date     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r2.<init>(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r13.<init>(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r11 = 0
        L_0x0a93:
            r17 = r4[r11]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r17.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r14 = "^.*((\\d{4})-(\\d{2})-(\\d{2})).*$"
            boolean r0 = r0.matches(r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x0aeb
            java.lang.String r1 = r17.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "$1"
            java.lang.String r0 = r1.replaceAll(r14, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.util.Date r0 = r13.parse(r0)     // Catch:{ ParseException -> 0x0aca, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3 }
            if (r0 == 0) goto L_0x0aeb
            long r15 = r2.getTime()     // Catch:{ ParseException -> 0x0aca, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3 }
            long r0 = r0.getTime()     // Catch:{ ParseException -> 0x0aca, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3 }
            long r15 = r15 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r15 = r15 / r0
            long r0 = (long) r5     // Catch:{ ParseException -> 0x0aca, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3 }
            int r14 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0aeb
            X.AnonymousClass6YY.A0P(r17)     // Catch:{ ParseException -> 0x0aca, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3 }
            r17.getAbsolutePath()     // Catch:{ ParseException -> 0x0aca, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3 }
            goto L_0x0aeb
        L_0x0aca:
            r14 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "CoreBackupUtils/deleteExpiredBackups/failed parsing the date from the msgstore db backup file "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r17.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = ". Exception: "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.append(r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x0aeb:
            int r11 = r11 + 1
            if (r11 >= r3) goto L_0x0af0
            goto L_0x0a93
        L_0x0af0:
            java.io.File r4 = r8.A0H()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            boolean r0 = r4.exists()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            if (r0 == 0) goto L_0x0b27
            r4.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r0 = r4.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            long r13 = r13 - r0
            long r0 = (long) r5     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0b27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = "MessageStoreBackup/backup/basefile_delete "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            boolean r0 = r4.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ba3, IOException -> 0x0b66 }
        L_0x0b27:
            long r0 = r30.A01()     // Catch:{ all -> 0x0c4b }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            float r2 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r2 = r2 / r26
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0c4b }
            r3[r25] = r2     // Catch:{ all -> 0x0c4b }
            r2 = r23
            java.lang.String.format(r4, r2, r3)     // Catch:{ all -> 0x0c4b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r3.<init>()     // Catch:{ all -> 0x0c4b }
            r2 = r24
            r3.append(r2)     // Catch:{ all -> 0x0c4b }
            r3.append(r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0c4b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            X.1QQ r1 = r8.A07     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "MessageStoreIncrementalBackup/cleaning tracked changes V1"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            X.005 r0 = r1.A00     // Catch:{ all -> 0x0c4b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0c4b }
            X.3Sy r0 = (X.C65653Sy) r0     // Catch:{ all -> 0x0c4b }
            r0.A07()     // Catch:{ all -> 0x0c4b }
        L_0x0b63:
            r2 = 0
            goto L_0x0c17
        L_0x0b66:
            r3 = move-exception
            X.0wx r0 = r8.A0F     // Catch:{ all -> 0x0bea }
            long r1 = r0.A01()     // Catch:{ all -> 0x0bea }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0ba2
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0bea }
            long r0 = r30.A01()     // Catch:{ all -> 0x0c4b }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            float r2 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r2 = r2 / r26
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0c4b }
            r3[r25] = r2     // Catch:{ all -> 0x0c4b }
            r2 = r23
            java.lang.String.format(r4, r2, r3)     // Catch:{ all -> 0x0c4b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r3.<init>()     // Catch:{ all -> 0x0c4b }
            r2 = r24
            r3.append(r2)     // Catch:{ all -> 0x0c4b }
            r3.append(r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0c4b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            r2 = 2
            goto L_0x0c17
        L_0x0ba2:
            throw r3     // Catch:{ all -> 0x0bea }
        L_0x0ba3:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bea }
            r1.<init>()     // Catch:{ all -> 0x0bea }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/failed "
            r1.append(r0)     // Catch:{ all -> 0x0bea }
            r1.append(r2)     // Catch:{ all -> 0x0bea }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0bea }
            r0 = 4
            r12.A00(r1, r0)     // Catch:{ all -> 0x0bea }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0bea }
            r7.A0C = r0     // Catch:{ all -> 0x0bea }
        L_0x0bbf:
            long r0 = r30.A01()     // Catch:{ all -> 0x0c4b }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            float r2 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r2 = r2 / r26
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0c4b }
            r3[r25] = r2     // Catch:{ all -> 0x0c4b }
            r2 = r23
            java.lang.String.format(r4, r2, r3)     // Catch:{ all -> 0x0c4b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r3.<init>()     // Catch:{ all -> 0x0c4b }
            r2 = r24
            r3.append(r2)     // Catch:{ all -> 0x0c4b }
            r3.append(r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0c4b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            goto L_0x0c16
        L_0x0bea:
            r5 = move-exception
            long r0 = r30.A01()     // Catch:{ all -> 0x0c4b }
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0c4b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c4b }
            float r2 = (float) r0     // Catch:{ all -> 0x0c4b }
            float r2 = r2 / r26
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0c4b }
            r3[r25] = r2     // Catch:{ all -> 0x0c4b }
            r2 = r23
            java.lang.String.format(r4, r2, r3)     // Catch:{ all -> 0x0c4b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r3.<init>()     // Catch:{ all -> 0x0c4b }
            r2 = r24
            r3.append(r2)     // Catch:{ all -> 0x0c4b }
            r3.append(r0)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0c4b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
        L_0x0c15:
            throw r5     // Catch:{ all -> 0x0c4b }
        L_0x0c16:
            r2 = 1
        L_0x0c17:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0c4b }
            r7.A06 = r0     // Catch:{ all -> 0x0c4b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c4b }
            r1.<init>()     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/result = "
            r1.append(r0)     // Catch:{ all -> 0x0c4b }
            r1.append(r2)     // Catch:{ all -> 0x0c4b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c4b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c4b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0c65 }
            long r0 = r0 - r19
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0c65 }
            r7.A0B = r0     // Catch:{ Exception -> 0x0c65 }
            X.0wx r0 = r8.A0F     // Catch:{ Exception -> 0x0c65 }
            long r0 = r0.A02()     // Catch:{ Exception -> 0x0c65 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0c65 }
            r7.A08 = r0     // Catch:{ Exception -> 0x0c65 }
            r6 = r2
            goto L_0x0c71
        L_0x0c4b:
            r2 = move-exception
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0c65 }
            long r0 = r0 - r19
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0c65 }
            r7.A0B = r0     // Catch:{ Exception -> 0x0c65 }
            X.0wx r0 = r8.A0F     // Catch:{ Exception -> 0x0c65 }
            long r0 = r0.A02()     // Catch:{ Exception -> 0x0c65 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0c65 }
            r7.A08 = r0     // Catch:{ Exception -> 0x0c65 }
            throw r2     // Catch:{ Exception -> 0x0c65 }
        L_0x0c65:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/backup/error "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d40 }
            r7.A0C = r0     // Catch:{ all -> 0x0d40 }
        L_0x0c71:
            r49.A06()     // Catch:{ all -> 0x0d40 }
            r0 = r49
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.A04     // Catch:{ all -> 0x0d40 }
            boolean r0 = r1.isHeldByCurrentThread()     // Catch:{ all -> 0x0d40 }
            if (r0 == 0) goto L_0x0cef
            java.lang.String r0 = "MessageStoreBackup/backupdb/callreset"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d40 }
            r49.A06()     // Catch:{ SQLiteException -> 0x0c8f }
            r18.BJK()     // Catch:{ SQLiteException -> 0x0c8f }
            X.1Ej r0 = r8.A0M     // Catch:{ SQLiteException -> 0x0c8f }
            r0.A01()     // Catch:{ SQLiteException -> 0x0c8f }
            goto L_0x0cf4
        L_0x0c8f:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0d40 }
            java.lang.Long r0 = r7.A07     // Catch:{ all -> 0x0d40 }
            if (r0 == 0) goto L_0x0ced
            int r0 = r0.intValue()     // Catch:{ all -> 0x0d40 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d40 }
        L_0x0ca1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d40 }
            r1.<init>()     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = "MessageStoreBackup/backup/log-chat-db-backup-event overall-result: "
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.Integer r0 = r7.A06     // Catch:{ all -> 0x0d40 }
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            r1.append(r2)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = " compression-ratio: "
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.Double r0 = r7.A04     // Catch:{ all -> 0x0d40 }
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = " backup-file-size: "
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.Long r0 = r7.A09     // Catch:{ all -> 0x0d40 }
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = " time: "
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.Long r0 = r7.A0B     // Catch:{ all -> 0x0d40 }
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = " free-disk-space: "
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.Long r0 = r7.A08     // Catch:{ all -> 0x0d40 }
            r1.append(r0)     // Catch:{ all -> 0x0d40 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d40 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d40 }
            X.0yW r0 = r8.A0T     // Catch:{ all -> 0x0d40 }
            r0.Bly(r7)     // Catch:{ all -> 0x0d40 }
            goto L_0x0d26
        L_0x0ced:
            r2 = 0
            goto L_0x0ca1
        L_0x0cef:
            java.lang.String r0 = "MessageStoreBackup/backupdb/db lock not held by current thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d40 }
        L_0x0cf4:
            r49.A06()
            boolean r0 = r1.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0d06
            r3 = r29
            r2 = r51
            r0 = r27
            A07(r8, r3, r2, r0)
        L_0x0d06:
            X.0yW r0 = r8.A0T
            r0.Bly(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/backupdb/result = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r6
        L_0x0d20:
            monitor-exit(r18)     // Catch:{ all -> 0x0d40 }
        L_0x0d21:
            java.lang.String r0 = "MessageStoreBackup/backup/wal checkpoint failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0d40 }
        L_0x0d26:
            r49.A06()
            r0 = r49
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0d3c
            r3 = r29
            r2 = r51
            r0 = r27
            A07(r8, r3, r2, r0)
        L_0x0d3c:
            return r6
        L_0x0d3d:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0d40 }
            throw r0     // Catch:{ all -> 0x0d40 }
        L_0x0d40:
            r4 = move-exception
            r49.A06()
            r0 = r49
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0d57
            r3 = r29
            r2 = r51
            r0 = r27
            A07(r8, r3, r2, r0)
        L_0x0d57:
            throw r4
        L_0x0d58:
            java.lang.String r1 = "databasehelper/cleanBeforeBackup/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0d60 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d60 }
            throw r0     // Catch:{ all -> 0x0d60 }
        L_0x0d60:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0d65 }
            goto L_0x0d69
        L_0x0d65:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d6a }
        L_0x0d69:
            throw r1     // Catch:{ all -> 0x0d6a }
        L_0x0d6a:
            r4 = move-exception
            r2.close()     // Catch:{ all -> 0x0d6f }
            throw r4
        L_0x0d6f:
            r0 = move-exception
            r4.addSuppressed(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q9.A0D(X.7fT, java.lang.Runnable, int, int):int");
    }
}
