package X;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.181  reason: invalid class name */
public class AnonymousClass181 {
    public final C219712j A00;
    public final AnonymousClass12P A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[SYNTHETIC, Splitter:B:15:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9K6 A00(X.AnonymousClass181 r10, X.AnonymousClass147 r11) {
        /*
            r6 = r10
            java.util.Map r2 = r10.A02
            monitor-enter(r2)
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x007b }
            r3 = 0
            X.12j r0 = r10.A00     // Catch:{ all -> 0x007b }
            long r0 = r0.A07(r11)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x007b }
            r5[r3] = r0     // Catch:{ all -> 0x007b }
            X.12P r0 = r10.A01     // Catch:{ all -> 0x007b }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x007b }
            X.14e r4 = r3.A02     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "SELECT subject_timestamp, announcement_version FROM group_notification_version WHERE group_jid_row_id = ?"
            java.lang.String r0 = "GET_GROUP_NOTIFICATION_VERSION_SQL"
            android.database.Cursor r4 = r4.A09(r1, r0, r5)     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0046
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "subject_timestamp"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0065 }
            long r7 = r4.getLong(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "announcement_version"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0065 }
            long r9 = r4.getLong(r0)     // Catch:{ all -> 0x0065 }
            X.9K6 r5 = new X.9K6     // Catch:{ all -> 0x0065 }
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x0065 }
            goto L_0x004f
        L_0x0046:
            r7 = 0
            X.9K6 r5 = new X.9K6     // Catch:{ all -> 0x0065 }
            r9 = 0
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x0065 }
        L_0x004f:
            r2.put(r11, r5)     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0057
            r4.close()     // Catch:{ all -> 0x0071 }
        L_0x0057:
            r3.close()     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r2.get(r11)     // Catch:{ all -> 0x007b }
            X.9K6 r0 = (X.AnonymousClass9K6) r0     // Catch:{ all -> 0x007b }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x007b }
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0065:
            r1 = move-exception
            if (r4 == 0) goto L_0x0070
            r4.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0071 }
        L_0x0070:
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x007b }
        L_0x007a:
            throw r1     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass181.A00(X.181, X.147):X.9K6");
    }

    public static void A01(AnonymousClass181 r7, AnonymousClass147 r8, long j, long j2) {
        AnonymousClass1M0 A05 = r7.A01.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("group_jid_row_id", Long.valueOf(r7.A00.A07(r8)));
            contentValues.put("subject_timestamp", Long.valueOf(j));
            contentValues.put("announcement_version", Long.valueOf(j2));
            contentValues.put("participant_version", 0L);
            A05.A02.A04("group_notification_version", "INSERT_GROUP_NOTIFICATION_VERSION", contentValues);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass181(C219712j r2, AnonymousClass12P r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
