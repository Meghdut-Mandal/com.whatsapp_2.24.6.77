package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.1DE  reason: invalid class name */
public class AnonymousClass1DE {
    public final C002000v A00 = new C35961jX(this);
    public final C19970wo A01;
    public final AnonymousClass1DD A02;
    public final C19770wU A03;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C124935z2 A03(java.lang.String r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            X.C18740tg.A00()     // Catch:{ all -> 0x00f8 }
            X.00v r4 = r11.A00     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r0.<init>()     // Catch:{ all -> 0x00f8 }
            r0.append(r12)     // Catch:{ all -> 0x00f8 }
            r0.append(r13)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f8 }
            java.lang.Object r5 = r4.A04(r0)     // Catch:{ all -> 0x00f8 }
            X.5z2 r5 = (X.C124935z2) r5     // Catch:{ all -> 0x00f8 }
            if (r5 != 0) goto L_0x00f6
            X.1DD r0 = r11.A02     // Catch:{ all -> 0x00f8 }
            X.1M0 r2 = r0.get()     // Catch:{ all -> 0x00f8 }
            X.14e r7 = r2.A02     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = "SELECT + _id, uuid, job_type , create_time, transfer_start_time, last_update_time, user_initiated_attempt_count, overall_cumulative_time, overall_cumulative_user_visible_time, streaming_playback_count, media_key_reuse_type, doodle_id, transferred_bytes, reupload_attempt_count, last_reupload_attempt_timestamp, last_reupload_success_timestamp FROM media_job WHERE uuid=? AND job_type=?"
            r5 = 2
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x00ec }
            r0 = 0
            r3[r0] = r12     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x00ec }
            r1 = 1
            r3[r1] = r0     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "MediaJobDataStore/get"
            android.database.Cursor r3 = r7.A09(r6, r0, r3)     // Catch:{ all -> 0x00ec }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00d7
            X.65K r7 = new X.65K     // Catch:{ all -> 0x00e0 }
            r7.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x00e0 }
            r7.A0D = r0     // Catch:{ all -> 0x00e0 }
            int r0 = r3.getInt(r5)     // Catch:{ all -> 0x00e0 }
            r7.A00 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 3
            long r5 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A05 = r5     // Catch:{ all -> 0x00e0 }
            long r0 = r7.A08     // Catch:{ all -> 0x00e0 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0062
            r7.A08 = r5     // Catch:{ all -> 0x00e0 }
        L_0x0062:
            r0 = 4
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A0B = r0     // Catch:{ all -> 0x00e0 }
            r0 = 5
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A08 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 6
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00e0 }
            r7.A04 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 7
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A09 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 8
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A0A = r0     // Catch:{ all -> 0x00e0 }
            r0 = 9
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00e0 }
            r7.A03 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 10
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00e0 }
            r7.A01 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 12
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A0C = r0     // Catch:{ all -> 0x00e0 }
            r0 = 13
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00e0 }
            r7.A02 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 14
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A06 = r0     // Catch:{ all -> 0x00e0 }
            r0 = 15
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r7.A07 = r0     // Catch:{ all -> 0x00e0 }
            X.5z2 r5 = r7.A00()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            int r0 = r5.A0B     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r4.A08(r0, r5)     // Catch:{ all -> 0x00e0 }
            r3.close()     // Catch:{ all -> 0x00ec }
            r2.close()     // Catch:{ all -> 0x00f8 }
            goto L_0x00f6
        L_0x00d7:
            r0 = 0
            r3.close()     // Catch:{ all -> 0x00ec }
            r2.close()     // Catch:{ all -> 0x00f8 }
            monitor-exit(r11)
            return r0
        L_0x00e0:
            r1 = move-exception
            if (r3 == 0) goto L_0x00eb
            r3.close()     // Catch:{ all -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f8 }
        L_0x00f5:
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f6:
            monitor-exit(r11)
            return r5
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DE.A03(java.lang.String, int):X.5z2");
    }

    public synchronized void A05(C124935z2 r11) {
        C1495671s B1k;
        C18740tg.A00();
        try {
            AnonymousClass1M0 A04 = this.A02.A04();
            try {
                B1k = A04.B1k();
                C224114e r8 = A04.A02;
                String str = r11.A0D;
                int i = r11.A0B;
                r8.A03("media_job", "uuid = ? AND job_type = ? ", "MediaJobDataStore/delete", new String[]{str, Integer.toString(i)});
                B1k.A00();
                C002000v r1 = this.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                r1.A05(sb.toString());
                B1k.close();
                A04.close();
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/delete", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return;
        throw th;
    }

    public static ContentValues A00(C124935z2 r23, AnonymousClass1DE r24) {
        C124935z2 r1 = r23;
        String str = r1.A0D;
        long j = (long) r1.A0B;
        long j2 = r1.A0C;
        long j3 = r1.A09;
        long j4 = (long) r1.A03;
        long j5 = r1.A07;
        long j6 = r1.A08;
        int i = r1.A02;
        int i2 = r1.A00;
        long j7 = r1.A0A;
        int i3 = r1.A01;
        long j8 = r1.A04;
        long j9 = r1.A05;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", str);
        contentValues.put("job_type", Long.valueOf(j));
        contentValues.put("create_time", Long.valueOf(j2));
        contentValues.put("transfer_start_time", Long.valueOf(j3));
        contentValues.put("last_update_time", Long.valueOf(C19970wo.A00(r24.A01)));
        contentValues.put("user_initiated_attempt_count", Long.valueOf(j4));
        contentValues.put("overall_cumulative_time", Long.valueOf(j5));
        contentValues.put("overall_cumulative_user_visible_time", Long.valueOf(j6));
        contentValues.put("streaming_playback_count", Integer.valueOf(i));
        contentValues.put("media_key_reuse_type", Integer.valueOf(i2));
        contentValues.put("transferred_bytes", Long.valueOf(j7));
        contentValues.put("reupload_attempt_count", Integer.valueOf(i3));
        contentValues.put("last_reupload_attempt_timestamp", Long.valueOf(j8));
        contentValues.put("last_reupload_success_timestamp", Long.valueOf(j9));
        return contentValues;
    }

    public C124935z2 A02(String str, int i) {
        AnonymousClass65K r8 = new AnonymousClass65K();
        r8.A0D = str;
        r8.A00 = i;
        C19970wo r9 = this.A01;
        long A002 = C19970wo.A00(r9);
        r8.A05 = A002;
        if (r8.A08 < 0) {
            r8.A08 = A002;
        }
        r8.A0B = C19970wo.A00(r9);
        r8.A08 = C19970wo.A00(r9);
        r8.A04 = 0;
        r8.A03 = 0;
        r8.A02 = 0;
        r8.A06 = 0;
        r8.A07 = 0;
        C124935z2 A003 = r8.A00();
        this.A03.Boy(new C35741jB(this, A003, 0));
        return A003;
    }

    public void A04(C124935z2 r4) {
        r4.A06 = C19970wo.A00(this.A01);
        if (A01(r4, this)) {
            C002000v r2 = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(r4.A0D);
            sb.append(r4.A0B);
            r2.A08(sb.toString(), r4);
        }
    }

    public AnonymousClass1DE(C19970wo r2, AnonymousClass1DD r3, C19770wU r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static boolean A01(C124935z2 r8, AnonymousClass1DE r9) {
        AnonymousClass1M0 A04;
        C18740tg.A00();
        try {
            A04 = r9.A02.A04();
            A04.A02.A01(A00(r8, r9), "media_job", "uuid = ? AND job_type = ? ", "MediaJobDataStore/updateInternal", new String[]{r8.A0D, Integer.toString(r8.A0B)});
            A04.close();
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/update", e);
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
