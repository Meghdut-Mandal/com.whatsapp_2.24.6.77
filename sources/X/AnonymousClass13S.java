package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.13S  reason: invalid class name */
public class AnonymousClass13S {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass13T A02;
    public final C19970wo A03;
    public final C19420v0 A04;
    public final AnonymousClass12P A05;
    public final AnonymousClass13R A06;
    public final C20810yC A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final C219712j A09;
    public final C21380z9 A0A;

    public static void A00(C19700wN r3, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("migration-failed-");
        sb.append(str2);
        sb.append("-");
        sb.append(str);
        String obj = sb.toString();
        Log.e(obj, th);
        r3.A0E(obj, th.toString(), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04dc, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("DatabaseMigration/doMigration/conditions check requires to stop migration process; name = ");
        r1.append(r4);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r1 = r56.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04fc, code lost:
        if (r1.hasNext() == false) goto L_0x0a04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0508, code lost:
        if (((X.C33281f2) r1.next()).isValid() != false) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x050c, code lost:
        r20 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x050d, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x053f, code lost:
        if (r1 == 0) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0a04, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005d, code lost:
        r55.removeAll(r30);
        r30.clear();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:384:0x091a */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04d6 A[Catch:{ Exception -> 0x0a08 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0876 A[Catch:{ all -> 0x088a }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x08bc A[Catch:{ all -> 0x0959 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x08e6 A[Catch:{ all -> 0x0959 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0a35  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0a04 A[EDGE_INSN: B:450:0x0a04->B:416:0x0a04 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C1256360r r58, java.util.List r59) {
        /*
            r57 = this;
            X.9K7 r31 = new X.9K7
            r31.<init>()
            java.util.ArrayList r30 = new java.util.ArrayList
            r30.<init>()
            java.util.HashSet r29 = new java.util.HashSet
            r29.<init>()
        L_0x000f:
            r19 = 0
            r55 = r59
            java.util.Iterator r28 = r55.iterator()
        L_0x0017:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r5 = r28.next()
            X.15p r5 = (X.C227415p) r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DatabaseMigrationManager/handleMigrationPhase; name="
            r1.append(r2)
            java.lang.String r4 = r5.A05
            r1.append(r4)
            java.lang.String r0 = "; start processing."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r56 = r58
            boolean r0 = r56.A00()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r0 != 0) goto L_0x0078
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = "; conditions check requires to stop migration process."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x005d:
            r1 = r30
            r0 = r55
            r0.removeAll(r1)
            r30.clear()
            if (r19 != 0) goto L_0x000f
            r0 = r31
            long r2 = r0.A01
            int r0 = r55.size()
            long r0 = (long) r0
            long r2 = r2 + r0
            r0 = r31
            r0.A01 = r2
            return
        L_0x0078:
            r1.<init>()
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A06()
            r18 = 3
            r3 = 2
            java.lang.String r2 = "DatabaseMigrationManager/processMigrations; name="
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = "; already migrated, skipping."
        L_0x00a5:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00af:
            r0 = 2
            r6 = 1
            if (r3 == r0) goto L_0x0a35
            r0 = 3
            if (r3 == r0) goto L_0x0a25
            r0 = r30
            r0.add(r5)
            r0 = r31
            long r0 = r0.A00
            long r0 = r0 + r6
            r2 = r31
            r2.A00 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigrationManager/handleMigrationPhase/migration failed; migration.name="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x0017
            r0 = r29
            r0.add(r4)
            goto L_0x0017
        L_0x00e6:
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x0118
            X.15s r1 = r5.A04
            java.util.Set r0 = r1.A02
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0118
            X.0yC r1 = r1.A00
            r0 = 242(0xf2, float:3.39E-43)
            java.lang.String r0 = r1.A09(r0)
            boolean r0 = X.C227715s.A00(r0, r4)
            if (r0 != 0) goto L_0x0118
            boolean r0 = r5.A0B()
            if (r0 != 0) goto L_0x0118
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = "; migration exceeds retry count; mark it as stuck and skip."
            goto L_0x00a5
        L_0x0118:
            boolean r0 = r5.A08()
            if (r0 != 0) goto L_0x012d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = "; not enough storage to migrate, skipping."
            goto L_0x00a5
        L_0x012d:
            r5.A09()
            boolean r0 = r5.A0D()
            if (r0 != 0) goto L_0x0196
            java.util.HashSet r0 = r5.A05()
            java.util.Iterator r5 = r0.iterator()
        L_0x013e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            r0 = r57
            X.13R r0 = r0.A06
            X.0wy r0 = r0.A00()
            java.lang.Object r0 = r0.get(r3)
            X.15p r0 = (X.C227415p) r0
            if (r0 != 0) goto L_0x017a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = ";  has a dependency '"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "' - not found, skipping."
        L_0x016f:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x013e
        L_0x017a:
            boolean r1 = r0.A0A()
            java.lang.String r0 = "; has a dependency '"
            if (r1 != 0) goto L_0x013e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "' - not migrated, not ready."
            goto L_0x016f
        L_0x0196:
            java.lang.String r27 = "; time spent="
            java.lang.String r25 = "; current_index="
            java.lang.String r2 = "DatabaseMigration/doMigration/begin; name="
            X.12i r11 = r5.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "migration_stats_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.String r6 = r11.A01(r0)
            java.lang.String r8 = "retry_count"
            java.lang.String r9 = "migration_time_spent"
            java.lang.String r10 = "db_size_change"
            java.lang.String r12 = "row_skipped"
            java.lang.String r0 = "row_processed"
            if (r6 != 0) goto L_0x0238
            X.9MV r3 = new X.9MV
            r3.<init>()
        L_0x01c4:
            long r0 = r3.A02
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01d2
            long r0 = r5.A02()
            r3.A02 = r0
        L_0x01d2:
            X.12P r0 = r5.A02
            r54 = r0
            r54.A06()
            java.io.File r0 = r0.A03
            r53 = r0
            long r16 = r53.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r4)
            java.lang.String r0 = "; before_size="
            r6.append(r0)
            r0 = r16
            r6.append(r0)
            java.lang.String r0 = "; start_index="
            r6.append(r0)
            java.lang.String r23 = r5.A04()
            r0 = -1
            r2 = r23
            long r0 = r11.A00(r2, r0)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r22 = 0
            X.14g r21 = new X.14g
            r1 = r21
            r0 = r22
            r1.<init>((boolean) r0)
            r21.A03()
            r20 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "/before_migrate"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.14g r2 = new X.14g
            r2.<init>((java.lang.String) r0)
            goto L_0x029c
        L_0x0238:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0280 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x0280 }
            X.9MV r3 = new X.9MV     // Catch:{ JSONException -> 0x0280 }
            r3.<init>()     // Catch:{ JSONException -> 0x0280 }
            boolean r1 = r7.has(r0)     // Catch:{ JSONException -> 0x0280 }
            if (r1 == 0) goto L_0x024e
            long r0 = r7.getLong(r0)     // Catch:{ JSONException -> 0x0280 }
            r3.A03 = r0     // Catch:{ JSONException -> 0x0280 }
        L_0x024e:
            boolean r0 = r7.has(r12)     // Catch:{ JSONException -> 0x0280 }
            if (r0 == 0) goto L_0x025a
            long r0 = r7.getLong(r12)     // Catch:{ JSONException -> 0x0280 }
            r3.A04 = r0     // Catch:{ JSONException -> 0x0280 }
        L_0x025a:
            boolean r0 = r7.has(r10)     // Catch:{ JSONException -> 0x0280 }
            if (r0 == 0) goto L_0x0266
            long r0 = r7.getLong(r10)     // Catch:{ JSONException -> 0x0280 }
            r3.A00 = r0     // Catch:{ JSONException -> 0x0280 }
        L_0x0266:
            boolean r0 = r7.has(r9)     // Catch:{ JSONException -> 0x0280 }
            if (r0 == 0) goto L_0x0272
            long r0 = r7.getLong(r9)     // Catch:{ JSONException -> 0x0280 }
            r3.A01 = r0     // Catch:{ JSONException -> 0x0280 }
        L_0x0272:
            boolean r0 = r7.has(r8)     // Catch:{ JSONException -> 0x0280 }
            if (r0 == 0) goto L_0x01c4
            long r0 = r7.getLong(r8)     // Catch:{ JSONException -> 0x0280 }
            r3.A02 = r0     // Catch:{ JSONException -> 0x0280 }
            goto L_0x01c4
        L_0x0280:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Failed to read migration statistics from stored data; reset to default values. Data: "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e(r0, r1)
            X.9MV r3 = new X.9MV
            r3.<init>()
            goto L_0x01c4
        L_0x029c:
            boolean r0 = r5.A08()     // Catch:{ Exception -> 0x0383 }
            if (r0 == 0) goto L_0x0380
            boolean r0 = r56.A00()     // Catch:{ Exception -> 0x0383 }
            if (r0 != 0) goto L_0x02dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0383 }
            r1.<init>()     // Catch:{ Exception -> 0x0383 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name="
            r1.append(r0)     // Catch:{ Exception -> 0x0383 }
            r1.append(r4)     // Catch:{ Exception -> 0x0383 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0383 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0383 }
            r0 = r56
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x02d8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x02d8 }
        L_0x02c4:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x02d8 }
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x02d8 }
            X.1f2 r0 = (X.C33281f2) r0     // Catch:{ Exception -> 0x02d8 }
            boolean r0 = r0.isValid()     // Catch:{ Exception -> 0x02d8 }
            if (r0 != 0) goto L_0x02c4
            goto L_0x0380
        L_0x02d8:
            r20 = move-exception
            r24 = 1
            goto L_0x0386
        L_0x02dd:
            int r6 = r5.A00     // Catch:{ Exception -> 0x0383 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r6) goto L_0x02fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0383 }
            r1.<init>()     // Catch:{ Exception -> 0x0383 }
            r1.append(r4)     // Catch:{ Exception -> 0x0383 }
            java.lang.String r0 = "_in_progress"
            r1.append(r0)     // Catch:{ Exception -> 0x0383 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0383 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0383 }
            r11.A04(r0, r1)     // Catch:{ Exception -> 0x0383 }
        L_0x02fb:
            r0 = -1
            r6 = r23
            long r7 = r11.A00(r6, r0)     // Catch:{ Exception -> 0x0383 }
            r0 = 0
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x030e
            r6 = r23
            r11.A03(r6, r0)     // Catch:{ Exception -> 0x0383 }
        L_0x030e:
            boolean r0 = r5 instanceof X.C23911Ai     // Catch:{ Exception -> 0x0383 }
            if (r0 == 0) goto L_0x03a6
            r0 = r5
            X.1Ai r0 = (X.C23911Ai) r0     // Catch:{ Exception -> 0x0383 }
            X.0xu r0 = r0.A00     // Catch:{ Exception -> 0x0383 }
            X.12P r1 = r0.A0C     // Catch:{ Exception -> 0x0383 }
            X.1M0 r8 = r1.A05()     // Catch:{ Exception -> 0x0383 }
            r1.A06()     // Catch:{ all -> 0x0376 }
            X.12f r10 = r1.A02     // Catch:{ all -> 0x0376 }
            java.lang.String r1 = "databasehelper/createFtsTable"
            X.14g r9 = new X.14g     // Catch:{ all -> 0x0376 }
            r9.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0376 }
            X.71s r12 = r8.B1k()     // Catch:{ all -> 0x0376 }
            X.38G r1 = X.AnonymousClass12f.A00(r10)     // Catch:{ all -> 0x036c }
            X.38H r7 = new X.38H     // Catch:{ all -> 0x036c }
            r7.<init>(r1)     // Catch:{ all -> 0x036c }
            X.3Qo r6 = new X.3Qo     // Catch:{ all -> 0x036c }
            r6.<init>()     // Catch:{ all -> 0x036c }
            X.161 r1 = r0.A0D     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "message_ftsv2"
            r6.A06(r1, r0)     // Catch:{ all -> 0x036c }
            X.14e r0 = r8.A02     // Catch:{ all -> 0x036c }
            r6.A02(r0, r7)     // Catch:{ all -> 0x036c }
            r10.A07(r0, r7)     // Catch:{ all -> 0x036c }
            r12.A00()     // Catch:{ all -> 0x036c }
            r12.close()     // Catch:{ all -> 0x0376 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0376 }
            r6.<init>()     // Catch:{ all -> 0x0376 }
            java.lang.String r0 = "databasehelper/createFtsDeprecatedTable time spent:"
            r6.append(r0)     // Catch:{ all -> 0x0376 }
            long r0 = r9.A01()     // Catch:{ all -> 0x0376 }
            r6.append(r0)     // Catch:{ all -> 0x0376 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0376 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0376 }
            r8.close()     // Catch:{ Exception -> 0x0383 }
            goto L_0x03a6
        L_0x036c:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0371 }
            goto L_0x0375
        L_0x0371:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0376 }
        L_0x0375:
            throw r1     // Catch:{ all -> 0x0376 }
        L_0x0376:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x037b }
            goto L_0x037f
        L_0x037b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ Exception -> 0x0383 }
        L_0x037f:
            throw r0     // Catch:{ Exception -> 0x0383 }
        L_0x0380:
            r24 = 1
            goto L_0x03a8
        L_0x0383:
            r20 = move-exception
            r24 = 0
        L_0x0386:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigration/beforeMigration/error; name="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r1 = r20
            com.whatsapp.util.Log.e(r0, r1)
            X.0wN r1 = r5.A01
            java.lang.String r0 = "before-migration"
            r6 = r20
            A00(r1, r4, r0, r6)
            goto L_0x03a8
        L_0x03a6:
            r24 = 0
        L_0x03a8:
            r2.A01()
            if (r20 != 0) goto L_0x0402
            if (r24 != 0) goto L_0x0402
            goto L_0x04d0
        L_0x03b1:
            r24 = 0
            if (r10 != 0) goto L_0x04d0
        L_0x03b5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "DatabaseMigration/doMigration/migrated; name="
            r2.append(r0)
            r2.append(r4)
            r0 = r25
            r2.append(r0)
            r0 = -1
            r6 = r23
            long r0 = r11.A00(r6, r0)
            r2.append(r0)
            r0 = r27
            r2.append(r0)
            long r0 = r21.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r20 != 0) goto L_0x0402
            if (r24 != 0) goto L_0x0402
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "/after_migrate"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.14g r0 = new X.14g
            r0.<init>((java.lang.String) r1)
            r0.A01()
        L_0x0402:
            r54.A06()
            long r0 = r53.length()
            long r8 = r0 - r16
            long r6 = r3.A00
            long r6 = r6 + r8
            r3.A00 = r6
            X.C227415p.A00(r5, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "DatabaseMigration/doMigration; name="
            r2.append(r6)
            r2.append(r4)
            java.lang.String r6 = "; db size:"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = " increase:"
            r2.append(r6)
            double r6 = (double) r0
            r0 = r16
            double r8 = (double) r0
            double r6 = r6 / r8
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r20 != 0) goto L_0x0467
            if (r24 != 0) goto L_0x04b8
            long r0 = r3.A04
            double r6 = (double) r0
            long r2 = r3.A03
            double r0 = (double) r2
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 * r2
            double r1 = java.lang.Math.floor(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0460
            X.0wN r2 = r5.A01
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "skipped"
            A00(r2, r4, r0, r1)
        L_0x0460:
            r5.A07()
        L_0x0463:
            r3 = r18
            goto L_0x00af
        L_0x0467:
            long r0 = r3.A02
            r6 = 1
            long r0 = r0 + r6
            r3.A02 = r0
            X.C227415p.A00(r5, r3)
            boolean r0 = r5 instanceof X.C227515q
            if (r0 == 0) goto L_0x04c6
            java.lang.String r2 = "rename_deprecated_tables_retry_count"
        L_0x0477:
            long r0 = r5.A02()
            long r0 = r0 + r6
            r11.A03(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "_retry_revision"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r0 = 0
            r11.A03(r2, r0)
            java.lang.String r0 = "receipt_device"
            boolean r0 = r0.equals(r4)
            java.lang.String r3 = "stuck"
            if (r0 != 0) goto L_0x04a7
            java.lang.String r0 = "receipt_user"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04bb
        L_0x04a7:
            long r6 = r5.A02()
            r1 = 20
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04bb
        L_0x04b1:
            X.0wN r1 = r5.A01
            r0 = r20
            A00(r1, r4, r3, r0)
        L_0x04b8:
            r18 = 4
            goto L_0x0463
        L_0x04bb:
            long r6 = r5.A02()
            r1 = 100
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b8
            goto L_0x04b1
        L_0x04c6:
            boolean r0 = r5 instanceof X.AnonymousClass15y
            if (r0 == 0) goto L_0x04cd
            java.lang.String r2 = "drop_deprecated_tables_retry_count"
            goto L_0x0477
        L_0x04cd:
            java.lang.String r2 = "migration_fts_retry"
            goto L_0x0477
        L_0x04d0:
            boolean r0 = r5.A08()     // Catch:{ Exception -> 0x0a08 }
            if (r0 == 0) goto L_0x0a04
            boolean r0 = r56.A00()     // Catch:{ Exception -> 0x0a08 }
            if (r0 != 0) goto L_0x0511
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a08 }
            r1.<init>()     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name = "
            r1.append(r0)     // Catch:{ Exception -> 0x0a08 }
            r1.append(r4)     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0a08 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0a08 }
            r0 = r56
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x050c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x050c }
        L_0x04f8:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x050c }
            if (r0 == 0) goto L_0x0a04
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x050c }
            X.1f2 r0 = (X.C33281f2) r0     // Catch:{ Exception -> 0x050c }
            boolean r0 = r0.isValid()     // Catch:{ Exception -> 0x050c }
            if (r0 != 0) goto L_0x04f8
            goto L_0x0a04
        L_0x050c:
            r20 = move-exception
            r24 = 1
            goto L_0x0a0d
        L_0x0511:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a08 }
            r1.<init>()     // Catch:{ Exception -> 0x0a08 }
            r1.append(r4)     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = "/doMigrationInSmallBatch/processBatch"
            r1.append(r0)     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0a08 }
            X.14g r26 = new X.14g     // Catch:{ Exception -> 0x0a08 }
            r1 = r26
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0a08 }
            r26.A03()     // Catch:{ Exception -> 0x0a08 }
            boolean r0 = r5 instanceof X.C227515q     // Catch:{ Exception -> 0x0a08 }
            if (r0 == 0) goto L_0x059c
            r0 = r54
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A05     // Catch:{ Exception -> 0x0a08 }
            int r1 = r0.getWriteHoldCount()     // Catch:{ Exception -> 0x0a08 }
            if (r1 > 0) goto L_0x0541
            int r1 = r0.getReadHoldCount()     // Catch:{ Exception -> 0x0a08 }
            r0 = 0
            if (r1 != 0) goto L_0x0542
        L_0x0541:
            r0 = 1
        L_0x0542:
            X.C18740tg.A0C(r0)     // Catch:{ Exception -> 0x0a08 }
            r54.A06()     // Catch:{ Exception -> 0x0a08 }
            r0 = r54
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r0.A04     // Catch:{ Exception -> 0x0a08 }
            r9.lock()     // Catch:{ Exception -> 0x0a08 }
            X.1M0 r8 = r54.A05()     // Catch:{ all -> 0x0596 }
            java.lang.String r7 = "RenameDeprecatedTablesMigration"
            X.14e r6 = r8.A02     // Catch:{ all -> 0x058c }
            java.lang.String r1 = "message_view_old_schema"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x058c }
            r2.<init>()     // Catch:{ all -> 0x058c }
            java.lang.String r0 = "DROP VIEW IF EXISTS "
            r2.append(r0)     // Catch:{ all -> 0x058c }
            r2.append(r1)     // Catch:{ all -> 0x058c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x058c }
            java.lang.String r1 = X.C63853Lr.A00(r1)     // Catch:{ all -> 0x058c }
            java.lang.String r0 = "dropViewIfExistsWithoutStatement"
            java.lang.String r0 = X.C63853Lr.A01(r7, r0, r1)     // Catch:{ all -> 0x058c }
            r6.A0D(r2, r0)     // Catch:{ all -> 0x058c }
            r8.close()     // Catch:{ all -> 0x0596 }
            r9.unlock()     // Catch:{ Exception -> 0x0a08 }
            X.6L4 r2 = new X.6L4     // Catch:{ Exception -> 0x0a08 }
            r2.<init>()     // Catch:{ Exception -> 0x0a08 }
            r0 = 0
            r2.A04 = r0     // Catch:{ Exception -> 0x0a08 }
            r0 = r22
            r2.A01 = r0     // Catch:{ Exception -> 0x0a08 }
            goto L_0x0966
        L_0x058c:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0591 }
            goto L_0x0595
        L_0x0591:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x0596 }
        L_0x0595:
            throw r0     // Catch:{ all -> 0x0596 }
        L_0x0596:
            r0 = move-exception
            r9.unlock()     // Catch:{ Exception -> 0x0a08 }
            goto L_0x0962
        L_0x059c:
            boolean r0 = r5 instanceof X.AnonymousClass15y     // Catch:{ Exception -> 0x0a08 }
            if (r0 == 0) goto L_0x05fb
            X.6L4 r2 = new X.6L4     // Catch:{ Exception -> 0x0a08 }
            r2.<init>()     // Catch:{ Exception -> 0x0a08 }
            r0 = 0
            r2.A04 = r0     // Catch:{ Exception -> 0x0a08 }
            r0 = r22
            r2.A01 = r0     // Catch:{ Exception -> 0x0a08 }
            X.1M0 r10 = r54.A05()     // Catch:{ Exception -> 0x0a08 }
            java.lang.String[] r15 = X.AnonymousClass12f.A0D     // Catch:{ all -> 0x05f5 }
            r9 = 18
            r8 = 0
        L_0x05b6:
            r0 = r15[r8]     // Catch:{ all -> 0x05f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05f5 }
            r1.<init>()     // Catch:{ all -> 0x05f5 }
            r1.append(r0)     // Catch:{ all -> 0x05f5 }
            java.lang.String r0 = "_old"
            r1.append(r0)     // Catch:{ all -> 0x05f5 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x05f5 }
            X.14e r6 = r10.A02     // Catch:{ all -> 0x05f5 }
            java.lang.String r0 = "table"
            java.lang.String r14 = X.C224614k.A00(r6, r0, r7)     // Catch:{ all -> 0x05f5 }
            long r0 = r2.A04     // Catch:{ all -> 0x05f5 }
            r12 = 1
            long r0 = r0 + r12
            r2.A04 = r0     // Catch:{ all -> 0x05f5 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x05e3
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x0963
            goto L_0x05b6
        L_0x05e3:
            java.lang.String r7 = X.C54162sV.A00(r7)     // Catch:{ all -> 0x05f5 }
            r0 = r22
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x05f5 }
            java.lang.String r0 = "DropDeprecatedTablesMigration/DROP_TABLE"
            r6.A0E(r7, r0, r1)     // Catch:{ all -> 0x05f5 }
            r0 = 1
            r2.A01 = r0     // Catch:{ all -> 0x05f5 }
            goto L_0x0963
        L_0x05f5:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x095e }
            goto L_0x0962
        L_0x05fb:
            java.lang.String r40 = "; batchSize="
            java.lang.String r39 = "DatabaseMigration/doMigrationInSmallBatch/error; name="
            X.6L4 r2 = new X.6L4     // Catch:{ Exception -> 0x0a08 }
            r2.<init>()     // Catch:{ Exception -> 0x0a08 }
            X.15s r0 = r5.A04     // Catch:{ Exception -> 0x0a08 }
            X.0yC r7 = r0.A00     // Catch:{ Exception -> 0x0a08 }
            r0 = 607(0x25f, float:8.5E-43)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ Exception -> 0x0a08 }
            int r6 = X.C20800yB.A00(r1, r7, r0)     // Catch:{ Exception -> 0x0a08 }
            r54.A06()     // Catch:{ Exception -> 0x0a08 }
            long r8 = r53.length()     // Catch:{ Exception -> 0x0a08 }
            r0 = 780(0x30c, float:1.093E-42)
            int r0 = X.C20800yB.A00(r1, r7, r0)     // Catch:{ Exception -> 0x0a08 }
            int r0 = r0 * 1024
            int r0 = r0 * 1024
            long r0 = (long) r0     // Catch:{ Exception -> 0x0a08 }
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x062b
            if (r6 <= 0) goto L_0x062b
            r0 = 32
            goto L_0x062e
        L_0x062b:
            r6 = 32
            goto L_0x0632
        L_0x062e:
            int r6 = java.lang.Math.min(r0, r6)     // Catch:{ Exception -> 0x0a08 }
        L_0x0632:
            r2.A02 = r6     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r38 = r5.A04()     // Catch:{ Exception -> 0x0a08 }
            r0 = -1
            r7 = r38
            long r0 = r11.A00(r7, r0)     // Catch:{ Exception -> 0x0a08 }
            r2.A04 = r0     // Catch:{ Exception -> 0x0a08 }
            r7 = 0
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0654
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch/start index was not set to 0."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0a08 }
            r2.A04 = r7     // Catch:{ Exception -> 0x0a08 }
            r0 = r38
            r11.A03(r0, r7)     // Catch:{ Exception -> 0x0a08 }
        L_0x0654:
            int r1 = r2.A01     // Catch:{ Exception -> 0x0a08 }
            int r0 = r2.A03     // Catch:{ Exception -> 0x0a08 }
            int r1 = r1 + r0
            int r0 = r2.A00     // Catch:{ Exception -> 0x0a08 }
            int r1 = r1 + r0
            int r0 = r2.A02     // Catch:{ Exception -> 0x0a08 }
            if (r1 >= r0) goto L_0x0966
            boolean r0 = r56.A00()     // Catch:{ Exception -> 0x0a08 }
            if (r0 != 0) goto L_0x067c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a08 }
            r1.<init>()     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch/conditions check requires to stop migration process; name="
            r1.append(r0)     // Catch:{ Exception -> 0x0a08 }
            r1.append(r4)     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0a08 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0a08 }
            goto L_0x0966
        L_0x067c:
            r54.A06()     // Catch:{ Exception -> 0x0a08 }
            r0 = r54
            X.12f r0 = r0.A02     // Catch:{ Exception -> 0x0a08 }
            X.14e r0 = r0.BJK()     // Catch:{ Exception -> 0x0a08 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ Exception -> 0x0a08 }
            boolean r0 = r0.inTransaction()     // Catch:{ Exception -> 0x0a08 }
            r15 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Database migration shouldn't be wrapped to a transaction."
            X.C18740tg.A0D(r1, r0)     // Catch:{ Exception -> 0x0a08 }
            X.1M0 r34 = r54.get()     // Catch:{ Exception -> 0x0748 }
            long r0 = r2.A04     // Catch:{ all -> 0x073e }
            boolean r9 = r5 instanceof X.C23911Ai     // Catch:{ all -> 0x073e }
            if (r9 == 0) goto L_0x073a
            r10 = r5
            X.1Ai r10 = (X.C23911Ai) r10     // Catch:{ all -> 0x073e }
            java.util.Map r9 = r10.A01     // Catch:{ all -> 0x073e }
            r35 = r9
            r35.clear()     // Catch:{ all -> 0x073e }
            r9 = r34
            X.14e r13 = r9.A02     // Catch:{ Exception -> 0x072d }
            java.lang.String r12 = X.C56202vu.A00     // Catch:{ Exception -> 0x072d }
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ Exception -> 0x072d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x072d }
            r9[r22] = r0     // Catch:{ Exception -> 0x072d }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x072d }
            r9[r15] = r0     // Catch:{ Exception -> 0x072d }
            java.lang.String r0 = "MIGRATION_GET_PRE_BATCH_QUERY_FOR_message_fts"
            android.database.Cursor r12 = r13.A09(r12, r0, r9)     // Catch:{ Exception -> 0x072d }
            java.lang.String r0 = "chat_row_id"
            int r33 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0721 }
            java.lang.String r0 = "_id"
            int r32 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0721 }
        L_0x06d0:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0721 }
            if (r0 == 0) goto L_0x071d
            X.0xu r9 = r10.A00     // Catch:{ Exception -> 0x0716 }
            r1 = r33
            r0 = r32
            X.3T1 r13 = r9.A0C(r12, r1, r0)     // Catch:{ Exception -> 0x0716 }
            if (r13 == 0) goto L_0x06d0
            r0 = r22
            boolean r0 = X.C20650xu.A08(r13, r0)     // Catch:{ Exception -> 0x0716 }
            if (r0 != 0) goto L_0x06d0
            java.lang.String r1 = r9.A0G(r13)     // Catch:{ Exception -> 0x0716 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x0716 }
            r14 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r14) goto L_0x06d0
            java.util.regex.Pattern r0 = X.C1906699v.A00     // Catch:{ Exception -> 0x0716 }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x0716 }
            boolean r0 = r0.find()     // Catch:{ Exception -> 0x0716 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x06d0
            X.0ts r0 = r9.A04     // Catch:{ Exception -> 0x0716 }
            java.lang.String r9 = X.C202859mm.A01(r0, r1)     // Catch:{ Exception -> 0x0716 }
            long r0 = r13.A1O     // Catch:{ Exception -> 0x0716 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0716 }
            r0 = r35
            r0.put(r1, r9)     // Catch:{ Exception -> 0x0716 }
            goto L_0x06d0
        L_0x0716:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/single fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0721 }
            goto L_0x06d0
        L_0x071d:
            r12.close()     // Catch:{ Exception -> 0x072d }
            goto L_0x073a
        L_0x0721:
            r1 = move-exception
            if (r12 == 0) goto L_0x072c
            r12.close()     // Catch:{ all -> 0x0728 }
            goto L_0x072c
        L_0x0728:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x072d }
        L_0x072c:
            throw r1     // Catch:{ Exception -> 0x072d }
        L_0x072d:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/inner fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0734 }
            goto L_0x073a
        L_0x0734:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/failed to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x073e }
        L_0x073a:
            r34.close()     // Catch:{ Exception -> 0x0748 }
            goto L_0x076f
        L_0x073e:
            r1 = move-exception
            r34.close()     // Catch:{ all -> 0x0743 }
            goto L_0x0747
        L_0x0743:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0748 }
        L_0x0747:
            throw r1     // Catch:{ Exception -> 0x0748 }
        L_0x0748:
            r10 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a08 }
            r9.<init>()     // Catch:{ Exception -> 0x0a08 }
            r0 = r39
            r9.append(r0)     // Catch:{ Exception -> 0x0a08 }
            r9.append(r4)     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = "; failed preBatchWork; startIndex="
            r9.append(r0)     // Catch:{ Exception -> 0x0a08 }
            long r0 = r2.A04     // Catch:{ Exception -> 0x0a08 }
            r9.append(r0)     // Catch:{ Exception -> 0x0a08 }
            r0 = r40
            r9.append(r0)     // Catch:{ Exception -> 0x0a08 }
            r9.append(r6)     // Catch:{ Exception -> 0x0a08 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x0a08 }
            com.whatsapp.util.Log.e(r0, r10)     // Catch:{ Exception -> 0x0a08 }
        L_0x076f:
            X.1M0 r37 = r54.A05()     // Catch:{ Exception -> 0x0a08 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0959 }
            r9.<init>()     // Catch:{ all -> 0x0959 }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch; name="
            r9.append(r0)     // Catch:{ all -> 0x0959 }
            r9.append(r4)     // Catch:{ all -> 0x0959 }
            java.lang.String r0 = "; startIndex="
            r9.append(r0)     // Catch:{ all -> 0x0959 }
            long r0 = r2.A04     // Catch:{ all -> 0x0959 }
            r9.append(r0)     // Catch:{ all -> 0x0959 }
            r0 = r40
            r9.append(r0)     // Catch:{ all -> 0x0959 }
            r9.append(r6)     // Catch:{ all -> 0x0959 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0959 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0959 }
            java.util.concurrent.atomic.AtomicBoolean r36 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0959 }
            r1 = r36
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x0959 }
            X.6L4 r14 = new X.6L4     // Catch:{ all -> 0x0959 }
            r14.<init>()     // Catch:{ all -> 0x0959 }
            r9 = 2
            X.6UJ r1 = new X.6UJ     // Catch:{ all -> 0x08a2 }
            r0 = r36
            r1.<init>(r5, r0, r9)     // Catch:{ all -> 0x08a2 }
            r0 = r37
            X.14e r9 = r0.A02     // Catch:{ all -> 0x08a2 }
            X.12b r10 = r0.A01     // Catch:{ all -> 0x08a2 }
            X.71s r35 = new X.71s     // Catch:{ all -> 0x08a2 }
            r0 = r35
            r0.<init>(r1, r10, r9)     // Catch:{ all -> 0x08a2 }
            long r0 = r2.A04     // Catch:{ all -> 0x0898 }
            r9 = r37
            android.database.Cursor r12 = r5.A03(r9, r6, r0)     // Catch:{ all -> 0x0898 }
            int r0 = r12.getCount()     // Catch:{ all -> 0x088c }
            int r6 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x088c }
            if (r6 != 0) goto L_0x07d9
            r35.A00()     // Catch:{ all -> 0x088c }
            r12.close()     // Catch:{ all -> 0x0898 }
            r35.close()     // Catch:{ all -> 0x08a2 }
            goto L_0x0954
        L_0x07d9:
            r1 = r5
            X.1Ai r1 = (X.C23911Ai) r1     // Catch:{ all -> 0x088c }
            int r0 = r12.getCount()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0866 }
            r34 = 1
            if (r0 == r15) goto L_0x07e6
            r34 = 0
        L_0x07e6:
            X.0xu r0 = r1.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r52 = r0
            java.util.Map r0 = r1.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r43 = r0
            r44 = 5
            r0 = -5
            X.3Nb r0 = X.C64203Nb.A00(r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            java.lang.String r1 = "_id"
            int r33 = r12.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            java.lang.String r1 = "chat_row_id"
            int r32 = r12.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r9 = 0
        L_0x0802:
            boolean r1 = r12.moveToNext()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            if (r1 == 0) goto L_0x0857
            r10 = r32
            r1 = r52
            r0 = r33
            X.3T1 r10 = r1.A0C(r12, r10, r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            if (r10 != 0) goto L_0x0826
            int r9 = r9 + 1
            long r50 = r12.getLong(r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r48 = -9223372036854775808
            r47 = -6
            X.3Nb r0 = new X.3Nb     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r46 = r0
            r46.<init>(r47, r48, r50)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            goto L_0x0802
        L_0x0826:
            r41 = r1
            r42 = r10
            r46 = r15
            X.3Nb r0 = r41.A0B(r42, r43, r44, r46)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            int r1 = r0.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r13 = r1
            r1 = -6
            if (r13 != r1) goto L_0x084b
            long r0 = r10.A1O     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r50 = r0
            long r0 = r10.A1N     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r41 = r0
            X.3Nb r0 = new X.3Nb     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r46 = r0
            r47 = r15
            r48 = r50
            r50 = r41
            r46.<init>(r47, r48, r50)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
        L_0x084b:
            r1 = r52
            X.1A3 r1 = r1.A05     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            X.3Qa r10 = r10.A1J     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r1.A01(r10)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            int r9 = r9 + 1
            goto L_0x0802
        L_0x0857:
            long r0 = r0.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            X.6L4 r10 = new X.6L4     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            r10.<init>(r0, r9)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x085f }
            goto L_0x086f
        L_0x085f:
            if (r34 == 0) goto L_0x0866
            java.lang.String r0 = "FtsDatabaseMigration/skipping single row"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x088c }
        L_0x0866:
            r0 = -1
            X.6L4 r10 = new X.6L4     // Catch:{ all -> 0x088c }
            r9 = r22
            r10.<init>(r0, r9)     // Catch:{ all -> 0x088c }
        L_0x086f:
            r14 = r10
            long r0 = r10.A04     // Catch:{ all -> 0x088a }
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0883
            r7 = r38
            r11.A03(r7, r0)     // Catch:{ all -> 0x088a }
            r35.A00()     // Catch:{ all -> 0x088a }
            r0 = r36
            r0.set(r15)     // Catch:{ all -> 0x088a }
        L_0x0883:
            r12.close()     // Catch:{ all -> 0x0898 }
            r35.close()     // Catch:{ all -> 0x08a2 }
            goto L_0x08b6
        L_0x088a:
            r1 = move-exception
            goto L_0x088f
        L_0x088c:
            r1 = move-exception
            if (r12 == 0) goto L_0x0897
        L_0x088f:
            r12.close()     // Catch:{ all -> 0x0893 }
            goto L_0x0897
        L_0x0893:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0898 }
        L_0x0897:
            throw r1     // Catch:{ all -> 0x0898 }
        L_0x0898:
            r1 = move-exception
            r35.close()     // Catch:{ all -> 0x089d }
            goto L_0x08a1
        L_0x089d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08a2 }
        L_0x08a1:
            throw r1     // Catch:{ all -> 0x08a2 }
        L_0x08a2:
            r7 = move-exception
            boolean r8 = r5.A0E(r7, r6)     // Catch:{ all -> 0x0959 }
            r0 = -1
            if (r8 == 0) goto L_0x0958
            r8 = r36
            r7 = r22
            r8.set(r7)     // Catch:{ all -> 0x0959 }
            r14.A04 = r0     // Catch:{ all -> 0x0959 }
            r14.A01 = r7     // Catch:{ all -> 0x0959 }
        L_0x08b6:
            boolean r0 = r36.get()     // Catch:{ all -> 0x0959 }
            if (r0 == 0) goto L_0x08e6
            long r0 = r14.A04     // Catch:{ all -> 0x0959 }
            r2.A04 = r0     // Catch:{ all -> 0x0959 }
            r7 = r38
            r11.A03(r7, r0)     // Catch:{ all -> 0x0959 }
            int r8 = r2.A01     // Catch:{ all -> 0x0959 }
            int r0 = r14.A01     // Catch:{ all -> 0x0959 }
            int r8 = r8 + r0
            r2.A01 = r8     // Catch:{ all -> 0x0959 }
            int r7 = r2.A03     // Catch:{ all -> 0x0959 }
            int r0 = r14.A03     // Catch:{ all -> 0x0959 }
            int r7 = r7 + r0
            r2.A03 = r7     // Catch:{ all -> 0x0959 }
            int r1 = r2.A00     // Catch:{ all -> 0x0959 }
            int r0 = r14.A00     // Catch:{ all -> 0x0959 }
            int r1 = r1 + r0
            r2.A00 = r1     // Catch:{ all -> 0x0959 }
            int r0 = r2.A02     // Catch:{ all -> 0x0959 }
            int r0 = r0 - r8
            int r0 = r0 - r7
            int r0 = r0 - r1
            int r1 = r6 * 2
            int r6 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0959 }
            goto L_0x094d
        L_0x08e6:
            if (r6 != r15) goto L_0x094b
            long r0 = r2.A04     // Catch:{ SQLException -> 0x091a }
            r7 = r37
            android.database.Cursor r9 = r5.A03(r7, r15, r0)     // Catch:{ SQLException -> 0x091a }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x090e }
            if (r0 == 0) goto L_0x090a
            long r7 = r2.A04     // Catch:{ all -> 0x090e }
            java.lang.String r0 = "_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x090e }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x090e }
            int r0 = r0 - r15
            long r0 = (long) r0     // Catch:{ all -> 0x090e }
            long r0 = java.lang.Math.max(r7, r0)     // Catch:{ all -> 0x090e }
            r2.A04 = r0     // Catch:{ all -> 0x090e }
        L_0x090a:
            r9.close()     // Catch:{ SQLException -> 0x091a }
            goto L_0x091a
        L_0x090e:
            r0 = move-exception
            if (r9 == 0) goto L_0x0919
            r9.close()     // Catch:{ all -> 0x0915 }
            goto L_0x0919
        L_0x0915:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ SQLException -> 0x091a }
        L_0x0919:
            throw r0     // Catch:{ SQLException -> 0x091a }
        L_0x091a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0959 }
            r7.<init>()     // Catch:{ all -> 0x0959 }
            r0 = r39
            r7.append(r0)     // Catch:{ all -> 0x0959 }
            r7.append(r4)     // Catch:{ all -> 0x0959 }
            java.lang.String r0 = "; failed record - skipping row; index="
            r7.append(r0)     // Catch:{ all -> 0x0959 }
            long r0 = r2.A04     // Catch:{ all -> 0x0959 }
            r7.append(r0)     // Catch:{ all -> 0x0959 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0959 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0959 }
            long r0 = r2.A04     // Catch:{ all -> 0x0959 }
            r7 = 1
            long r0 = r0 + r7
            r2.A04 = r0     // Catch:{ all -> 0x0959 }
            int r7 = r2.A03     // Catch:{ all -> 0x0959 }
            int r7 = r7 + 1
            r2.A03 = r7     // Catch:{ all -> 0x0959 }
            r7 = r38
            r11.A03(r7, r0)     // Catch:{ all -> 0x0959 }
            goto L_0x094d
        L_0x094b:
            int r6 = r6 / 2
        L_0x094d:
            r37.close()     // Catch:{ Exception -> 0x0a08 }
            r7 = 0
            goto L_0x0654
        L_0x0954:
            r37.close()     // Catch:{ Exception -> 0x0a08 }
            goto L_0x0966
        L_0x0958:
            throw r7     // Catch:{ all -> 0x0959 }
        L_0x0959:
            r0 = move-exception
            r37.close()     // Catch:{ all -> 0x095e }
            goto L_0x0962
        L_0x095e:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ Exception -> 0x0a08 }
        L_0x0962:
            throw r0     // Catch:{ Exception -> 0x0a08 }
        L_0x0963:
            r10.close()     // Catch:{ Exception -> 0x0a08 }
        L_0x0966:
            int r0 = r2.A01     // Catch:{ Exception -> 0x0a08 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0a08 }
            long r0 = r3.A03     // Catch:{ Exception -> 0x0a08 }
            long r0 = r0 + r6
            r3.A03 = r0     // Catch:{ Exception -> 0x0a08 }
            int r0 = r2.A03     // Catch:{ Exception -> 0x0a08 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0a08 }
            long r0 = r3.A04     // Catch:{ Exception -> 0x0a08 }
            long r0 = r0 + r6
            r3.A04 = r0     // Catch:{ Exception -> 0x0a08 }
            X.C227415p.A00(r5, r3)     // Catch:{ Exception -> 0x0a08 }
            int r1 = r2.A01     // Catch:{ Exception -> 0x0a08 }
            int r0 = r2.A03     // Catch:{ Exception -> 0x0a08 }
            int r1 = r1 + r0
            int r0 = r2.A00     // Catch:{ Exception -> 0x0a08 }
            int r1 = r1 + r0
            r10 = 0
            if (r1 <= 0) goto L_0x0985
            r10 = 1
        L_0x0985:
            r26.A01()     // Catch:{ Exception -> 0x0a08 }
            r0 = -1
            r2 = r23
            r11.A00(r2, r0)     // Catch:{ Exception -> 0x0a0a }
            r21.A00()     // Catch:{ Exception -> 0x0a0a }
            if (r10 == 0) goto L_0x03b1
            long r0 = r26.A00()     // Catch:{ Exception -> 0x0a0a }
            X.15s r2 = r5.A04     // Catch:{ Exception -> 0x0a0a }
            X.0yC r9 = r2.A00     // Catch:{ Exception -> 0x0a0a }
            r2 = 608(0x260, float:8.52E-43)
            X.0yV r8 = X.C21000yV.A02     // Catch:{ Exception -> 0x0a0a }
            int r2 = X.C20800yB.A00(r8, r9, r2)     // Catch:{ Exception -> 0x0a0a }
            int r2 = r2 * 1000
            if (r2 <= 0) goto L_0x03b1
            long r6 = (long) r2     // Catch:{ Exception -> 0x0a0a }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x03b1
            r54.A06()     // Catch:{ Exception -> 0x0a0a }
            long r12 = r53.length()     // Catch:{ Exception -> 0x0a0a }
            r2 = 780(0x30c, float:1.093E-42)
            int r2 = X.C20800yB.A00(r8, r9, r2)     // Catch:{ Exception -> 0x0a0a }
            int r2 = r2 * 1024
            int r2 = r2 * 1024
            long r6 = (long) r2     // Catch:{ Exception -> 0x0a0a }
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x09d1
            r0 = 779(0x30b, float:1.092E-42)
            int r0 = X.C20800yB.A00(r8, r9, r0)     // Catch:{ Exception -> 0x0a0a }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Exception -> 0x0a0a }
            android.os.SystemClock.sleep(r0)     // Catch:{ Exception -> 0x0a0a }
            goto L_0x03b1
        L_0x09d1:
            X.0wN r8 = r5.A01     // Catch:{ Exception -> 0x0a0a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a0a }
            r6.<init>()     // Catch:{ Exception -> 0x0a0a }
            java.lang.String r2 = "db-long-running-process-batch/"
            r6.append(r2)     // Catch:{ Exception -> 0x0a0a }
            r6.append(r4)     // Catch:{ Exception -> 0x0a0a }
            java.lang.String r7 = r6.toString()     // Catch:{ Exception -> 0x0a0a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a0a }
            r6.<init>()     // Catch:{ Exception -> 0x0a0a }
            java.lang.String r2 = "name="
            r6.append(r2)     // Catch:{ Exception -> 0x0a0a }
            r6.append(r4)     // Catch:{ Exception -> 0x0a0a }
            java.lang.String r2 = ", duration="
            r6.append(r2)     // Catch:{ Exception -> 0x0a0a }
            r6.append(r0)     // Catch:{ Exception -> 0x0a0a }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0a0a }
            r1 = r22
            r8.A0E(r7, r0, r1)     // Catch:{ Exception -> 0x0a0a }
            goto L_0x03b1
        L_0x0a04:
            r24 = 1
            goto L_0x03b5
        L_0x0a08:
            r20 = move-exception
            goto L_0x0a0d
        L_0x0a0a:
            r20 = move-exception
            r24 = 0
        L_0x0a0d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigration/doMigration/error; name="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r1 = r20
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x03b5
        L_0x0a25:
            r0 = r30
            r0.add(r5)
            r0 = r31
            long r1 = r0.A02
            long r1 = r1 + r6
            r0.A02 = r1
            r19 = 1
            goto L_0x0017
        L_0x0a35:
            r0 = r30
            r0.add(r5)
            r0 = r31
            long r0 = r0.A01
            long r0 = r0 + r6
            r2 = r31
            r2.A01 = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13S.A01(X.60r, java.util.List):void");
    }

    public void A02() {
        Log.i("DatabaseMigrationManager/processAllConsistencyChecks");
        A03(new C1256360r(new C33281f2[0]), this.A06.A00().keySet(), 8);
    }

    public boolean A03(C1256360r r22, Set set, int i) {
        Cursor A092;
        Cursor A093;
        Set set2 = set;
        if (set2.isEmpty()) {
            Log.i("DatabaseMigrationManager/processMigrations/no migrations requested, skipping.");
            return true;
        }
        AtomicBoolean atomicBoolean = this.A08;
        if (atomicBoolean.getAndSet(true)) {
            Log.w("DatabaseMigrationManager/processMigrations/migrations already in progress");
            return false;
        }
        new C224214g("DatabaseMigrationManager/processMigrations");
        C21380z9 r3 = this.A0A;
        r3.A01("db_migration", true);
        try {
            C219712j r1 = this.A09;
            C224214g r12 = new C224214g(false);
            r12.A03();
            try {
                AnonymousClass1M0 A042 = r1.A01.get();
                try {
                    A093 = A042.A02.A09("SELECT _id, user, server, agent, device, type, raw_string FROM jid", "GET_ALL_JID_SQL", (String[]) null);
                    int columnIndexOrThrow = A093.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = A093.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    int columnIndexOrThrow3 = A093.getColumnIndexOrThrow("server");
                    int columnIndexOrThrow4 = A093.getColumnIndexOrThrow("agent");
                    int columnIndexOrThrow5 = A093.getColumnIndexOrThrow("device");
                    int columnIndexOrThrow6 = A093.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    int columnIndexOrThrow7 = A093.getColumnIndexOrThrow("raw_string");
                    while (A093.moveToNext()) {
                        long j = A093.getLong(columnIndexOrThrow);
                        Jid A022 = C219712j.A02(A093, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow7);
                        if (A022 != null) {
                            C219712j.A05(r1, A022, j);
                        }
                    }
                    A093.close();
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (SQLiteBlobTooBigException unused) {
                int i2 = -1;
                try {
                    AnonymousClass1M0 A043 = r1.A01.get();
                    try {
                        A092 = A043.A02.A09("SELECT COUNT(*) as count FROM jid", "GET_ALL_ROW_COUNT_SQL", (String[]) null);
                        if (A092.moveToLast()) {
                            i2 = A092.getInt(A092.getColumnIndexOrThrow("count"));
                        }
                        A092.close();
                        A043.close();
                        StringBuilder sb = new StringBuilder();
                        sb.append("JidStore/populateJidRowIdCache(); failing to load the window for ");
                        sb.append(i2);
                        Log.i(sb.toString());
                        C19700wN r9 = r1.A00;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("failing to load the window for ");
                        sb2.append(i2);
                        r9.A0E("JidStore/populateJidRowIdCache/blobTooBig", sb2.toString(), false);
                    } catch (Throwable th2) {
                        if (A092 != null) {
                            A092.close();
                        }
                    }
                } catch (Exception e) {
                    Log.w("JidStore/populateJidRowIdCache/failed to get count", e);
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
            r1.A03.size();
            r12.A01();
            C20070wy A002 = this.A06.A00();
            HashSet hashSet = new HashSet();
            LinkedList linkedList = new LinkedList(set2);
            while (true) {
                Object poll = linkedList.poll();
                if (poll == null) {
                    break;
                } else if (!hashSet.contains(poll)) {
                    hashSet.add(poll);
                    C227415p r0 = (C227415p) A002.get(poll);
                    if (r0 != null) {
                        linkedList.addAll(r0.A05());
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            HashMap hashMap = new HashMap();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj = A002.get(next);
                if (obj != null) {
                    hashMap.put(next, obj);
                } else {
                    hashSet2.add(next);
                }
            }
            if (!hashSet2.isEmpty()) {
                this.A00.A0E("db-missing-migration-name", hashSet2.toString(), false);
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                entry.getValue();
                hashMap2.put(key, 1L);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            Iterator it2 = new HashSet(hashMap2.keySet()).iterator();
            while (it2.hasNext()) {
                arrayDeque.add(it2.next());
                while (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    C227415p r02 = (C227415p) hashMap.get(str);
                    if (r02 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("DatabaseMigrationManager/sortedMigrations; can't get migration with name ");
                        sb3.append(str);
                        sb3.append("from a map of migrations");
                        Log.e(sb3.toString());
                        C19700wN r8 = this.A00;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("DatabaseMigrationManager/sortedMigrations/missing dependent migration; name=");
                        sb4.append(str);
                        r8.A0E(sb4.toString(), (String) null, false);
                    } else {
                        HashSet A052 = r02.A05();
                        C18740tg.A06(A052);
                        for (Object next2 : A052) {
                            Long l = (Long) hashMap2.get(next2);
                            if (l == null) {
                                l = 1L;
                                hashMap2.put(next2, l);
                            }
                            Long l2 = (Long) hashMap2.get(str);
                            if (l2 == null) {
                                l2 = 1L;
                                hashMap2.put(str, l2);
                            }
                            long longValue = l.longValue();
                            long longValue2 = l2.longValue();
                            if (longValue <= longValue2) {
                                hashMap2.put(next2, Long.valueOf(longValue2 + 1));
                                arrayDeque.add(next2);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList(hashMap.values());
            Collections.sort(arrayList, new AnonymousClass75X(hashMap2));
            ArrayList arrayList2 = new ArrayList(arrayList);
            ArrayList arrayList3 = new ArrayList(arrayList);
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList4.add((C227415p) it3.next());
            }
            if ((i & 1) != 0) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C227415p r13 = (C227415p) it4.next();
                    if (r13.A09() || r13.A0A()) {
                        r13.A06();
                    }
                }
            }
            C1256360r r14 = r22;
            if ((i & 2) != 0) {
                A01(r14, arrayList4);
            }
            if ((i & 4) != 0) {
                A01(r14, arrayList5);
            }
            if ((i & 8) != 0) {
                Log.i("DatabaseMigrationManager/handleConsistencyPhase");
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    it5.next();
                }
            }
            return true;
        } catch (Exception e2) {
            Log.e("DatabaseMigrationManager/processMigrations/error while processing scheduled migrations.", e2);
            this.A00.A0E("db-process-migration-failure", e2.toString(), false);
            return false;
        } finally {
            r3.A01("db_migration", false);
            atomicBoolean.set(false);
        }
        throw th2;
        throw th;
    }

    public AnonymousClass13S(C19700wN r3, C19730wQ r4, AnonymousClass13T r5, C19970wo r6, C19420v0 r7, C219712j r8, AnonymousClass12P r9, AnonymousClass13R r10, C20810yC r11, C21380z9 r12) {
        this.A03 = r6;
        this.A07 = r11;
        this.A09 = r8;
        this.A00 = r3;
        this.A01 = r4;
        this.A06 = r10;
        this.A04 = r7;
        this.A05 = r9;
        this.A0A = r12;
        this.A02 = r5;
    }
}
