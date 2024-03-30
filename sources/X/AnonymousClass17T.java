package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.17T  reason: invalid class name */
public class AnonymousClass17T {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;
    public final C19970wo A02;
    public final C220412q A03;
    public final AnonymousClass12g A04;
    public final C220612s A05;
    public final AnonymousClass17U A06;
    public final C20810yC A07;

    @Deprecated
    public int A00(long j, long j2) {
        Cursor A09;
        String str;
        int i = 0;
        String[] strArr = {Long.toString(j), Long.toString(j2)};
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE (message_type != '8') AND _id > ? AND _id <= ?", "GET_MESSAGE_COUNT_RANGE_SQL", strArr);
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getmessagesatid/pos:");
                sb.append(i);
                str = sb.toString();
            } else {
                str = "msgstore/getmessagesatid/db no messages";
            }
            Log.i(str);
            A09.close();
            A042.close();
            return i;
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

    public long A03(AnonymousClass11F r6) {
        Cursor A09;
        long j;
        String[] strArr = {String.valueOf(this.A00.A08(r6)), String.valueOf(C19970wo.A00(this.A02))};
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09("   SELECT _id FROM available_message_view WHERE chat_row_id = ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT 1", "LAST_CHAT_MESSAGE_ID_SQL_SKIP_EXPIRED_DM", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/lastmsgid/count ");
            sb.append(A09.getCount());
            Log.i(sb.toString());
            if (A09.moveToNext()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("_id"));
            } else {
                j = 1;
            }
            A09.close();
            A042.close();
            return j;
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

    public long A04(AnonymousClass11F r6, int i) {
        Cursor A09;
        long j;
        String[] strArr = {String.valueOf(this.A00.A08(r6)), String.valueOf(i + 1)};
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09(" SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type != 7 ORDER BY sort_id DESC LIMIT ?", "CHAT_LAST_OFFSET_MESSAGE_ID_SQL", strArr);
            if (A09.moveToLast()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("_id"));
            } else {
                j = 1;
            }
            A09.close();
            A042.close();
            return j;
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

    public long A06(AnonymousClass11F r9, int[] iArr, long j) {
        Cursor A09;
        long j2;
        C224214g r6 = new C224214g(false);
        r6.A04("rowidstore/getRowIdByTimestampExcludeTypes");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT _id FROM available_message_view WHERE chat_row_id = ? AND ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AnonymousClass17W.A00(iArr));
        sb2.append(" AND ");
        sb.append(sb2.toString());
        sb.append("timestamp > 0");
        sb.append(" AND ");
        sb.append("timestamp <= ?");
        sb.append(" ORDER BY sort_id DESC LIMIT 1");
        String obj = sb.toString();
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09(obj, "GET_ROW_ID_BY_TIMESTAMP_EXCLUDE_TYPES", new String[]{String.valueOf(this.A00.A08(r9)), Long.toString(j)});
            if (A09.moveToNext()) {
                j2 = A09.getLong(A09.getColumnIndexOrThrow("_id"));
            } else {
                j2 = 0;
            }
            A09.close();
            A042.close();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rowidstore/getRowIdByTimestampExcludeTypes ");
            sb3.append(j2);
            sb3.append(" | time spent:");
            sb3.append(r6.A01());
            Log.i(sb3.toString());
            return j2;
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

    public boolean A07(AnonymousClass11F r7) {
        Cursor A09;
        boolean z = true;
        String[] strArr = {String.valueOf(this.A00.A08(r7))};
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09("SELECT  1 FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7','87') AND from_me = 1 LIMIT 1", "OUTGOING_MESSAGE_EXISTS_RAW_SQL", strArr);
            if (A09.getCount() <= 0) {
                z = false;
            }
            A09.close();
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

    public long A01() {
        Cursor A09;
        long j;
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09(" SELECT _id FROM available_message_view ORDER BY sort_id DESC LIMIT 1", "LAST_MESSAGE_ID_SQL", (String[]) null);
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/lastmsgid/count ");
            sb.append(A09.getCount());
            Log.i(sb.toString());
            if (A09.moveToNext()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("_id"));
            } else {
                j = 1;
            }
            A09.close();
            A042.close();
            return j;
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

    public long A02(long j) {
        Cursor A09;
        long j2;
        AnonymousClass1M0 A042 = this.A01.get();
        try {
            A09 = A042.A02.A09("SELECT _id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1", "GET_ROW_ID_BY_TIMESTAMP", new String[]{Long.toString(j)});
            if (A09.moveToNext()) {
                j2 = A09.getLong(A09.getColumnIndexOrThrow("_id"));
            } else {
                j2 = 0;
            }
            A09.close();
            A042.close();
            return j2;
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

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (X.AnonymousClass143.A0G(r8) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(X.AnonymousClass11F r18, int r19, long r20, long r22) {
        /*
            r17 = this;
            r4 = r20
            r3 = r17
            X.12q r1 = r3.A03
            r0 = 0
            r8 = r18
            X.3Qp r0 = r1.A09(r8, r0)
            r15 = 1
            if (r0 != 0) goto L_0x0012
            return r15
        L_0x0012:
            long r13 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r8 instanceof X.C177618e5
            r12 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0023
            boolean r0 = X.AnonymousClass143.A0G(r8)
            r6 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/startref "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            X.14g r7 = new X.14g
            r7.<init>((java.lang.String) r0)
            java.lang.String r0 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r6 == 0) goto L_0x0051
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        L_0x0051:
            X.AnonymousClass17W.A01(r2, r1)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r2.append(r0)
            java.lang.String r1 = " "
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            r2.append(r1)
            java.lang.String r0 = " AND sort_id < ?"
            r2.append(r0)
        L_0x0067:
            r2.append(r1)
            java.lang.String r0 = " ORDER BY sort_id DESC"
            r2.append(r0)
            java.lang.String r0 = " LIMIT ?"
            r2.append(r0)
            java.lang.String r9 = r2.toString()
            int r1 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x007e
            r0 = 1
        L_0x007e:
            r10 = 2
            r6 = 3
            if (r0 == 0) goto L_0x00aa
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            X.163 r0 = r3.A00
            long r0 = r0.A08(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r11] = r0
            java.lang.String r0 = java.lang.String.valueOf(r22)
            r2[r12] = r0
            X.17U r0 = r3.A06
            long r0 = r0.A04(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r10] = r0
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2[r6] = r0
            goto L_0x00c4
        L_0x00aa:
            java.lang.String[] r2 = new java.lang.String[r6]
            X.163 r0 = r3.A00
            long r0 = r0.A08(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r11] = r0
            java.lang.String r0 = java.lang.String.valueOf(r22)
            r2[r12] = r0
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2[r10] = r0
        L_0x00c4:
            X.12P r0 = r3.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
            X.1M0 r6 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
            X.14e r1 = r6.A02     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "ROW_ID_STORE_GET_START_REF"
            android.database.Cursor r2 = r1.A09(r9, r0, r2)     // Catch:{ all -> 0x010e }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0102 }
            long r4 = r2.getLong(r0)     // Catch:{ all -> 0x0102 }
        L_0x00e2:
            r7.A01()     // Catch:{ all -> 0x0102 }
            goto L_0x00fb
        L_0x00e6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r1.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "msgstore/startref can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x0102 }
            r1.append(r8)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0102 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0102 }
            goto L_0x00e2
        L_0x00fb:
            r2.close()     // Catch:{ all -> 0x010e }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
            goto L_0x0121
        L_0x0102:
            r1 = move-exception
            if (r2 == 0) goto L_0x010d
            r2.close()     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010e }
        L_0x010d:
            throw r1     // Catch:{ all -> 0x010e }
        L_0x010e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        L_0x0117:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r3.A05
            r0.A03()
        L_0x0121:
            X.12g r3 = r3.A04
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r13
            java.lang.String r0 = "RowIdStore/getStartRef"
            r3.A01(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17T.A05(X.11F, int, long, long):long");
    }

    public boolean A08(AnonymousClass11F r6) {
        boolean z;
        C65073Qp r0;
        C220412q r1 = this.A03;
        if (!r1.A0R(r6) && (r0 = (C65073Qp) C220412q.A00(r1).get(r6)) != null && r0.A0N != 1) {
            return true;
        }
        AnonymousClass163 r2 = this.A00;
        synchronized (r2) {
            z = false;
            if (r2.A05.get(r6) != null) {
                z = true;
            }
        }
        if (!z || A03(r6) == 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass17T(C19970wo r1, AnonymousClass163 r2, C220412q r3, AnonymousClass12g r4, C220612s r5, AnonymousClass12P r6, AnonymousClass17U r7, C20810yC r8) {
        this.A02 = r1;
        this.A07 = r8;
        this.A04 = r4;
        this.A00 = r2;
        this.A06 = r7;
        this.A03 = r3;
        this.A01 = r6;
        this.A05 = r5;
    }
}
