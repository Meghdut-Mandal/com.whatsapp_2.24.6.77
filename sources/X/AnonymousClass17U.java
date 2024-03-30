package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.17U  reason: invalid class name */
public class AnonymousClass17U {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final AnonymousClass12P A02;
    public final C19970wo A03;
    public final AnonymousClass12g A04;
    public final C20810yC A05;

    public int A03(AnonymousClass11F r7, long j, long j2) {
        Cursor A09;
        int i = 0;
        String[] strArr = {String.valueOf(this.A00.A08(r7)), Long.toString(j), Long.toString(j2)};
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            A09 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND sort_id <= ?", "GET_CHAT_MESSAGE_COUNT_RANGE_BY_SORT_ID_SQL", strArr);
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
            }
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

    public long A04(long j) {
        Cursor A09;
        long j2;
        String[] strArr = {String.valueOf(j)};
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            A09 = A042.A02.A09("SELECT sort_id FROM message_view WHERE _id = ?", "GET_SORT_ID_OF_MESSAGE_SQL", strArr);
            if (A09.moveToNext()) {
                j2 = A09.getLong(A09.getColumnIndexOrThrow("sort_id"));
            } else {
                j2 = Long.MIN_VALUE;
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

    public long A05(AnonymousClass11F r6) {
        Cursor A09;
        String[] strArr = {String.valueOf(this.A00.A08(r6))};
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            A09 = A042.A02.A09("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1", "GET_FIRST_SORT_REF_SQL", strArr);
            if (A09.moveToFirst()) {
                long j = A09.getLong(A09.getColumnIndexOrThrow("sort_id"));
                A09.close();
                A042.close();
                return j;
            }
            A09.close();
            A042.close();
            StringBuilder sb = new StringBuilder();
            sb.append("SortIdStore/ getFirstSortId can't get value for ");
            sb.append(r6);
            Log.w(sb.toString());
            return Long.MIN_VALUE;
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

    public long A06(AnonymousClass11F r6) {
        Cursor A09;
        long j;
        String[] strArr = {String.valueOf(this.A00.A08(r6)), String.valueOf(C19970wo.A00(this.A03))};
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            A09 = A042.A02.A09("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT 1", "LAST_CHAT_MESSAGE_SORT_ID_SQL_SKIP_EXPIRED_DM", strArr);
            if (A09.moveToNext()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("sort_id"));
            } else {
                j = Long.MIN_VALUE;
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

    public int A01(AnonymousClass11F r8, long j) {
        Cursor A09;
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            int i = 0;
            A09 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND (message_type != '7') AND from_me = 0", "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_REF_EXCLUDE_SYSTEM_MESSAGES_SQL", new String[]{String.valueOf(this.A00.A08(r8)), String.valueOf(j)});
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(r8);
                Log.i(sb.toString());
            }
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

    public int A02(AnonymousClass11F r8, long j) {
        Cursor A09;
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            int i = 0;
            A09 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND (message_type = '10') AND sort_id > ?", "GET_CHAT_MISSED_CALLS_COUNT_NEWER_THAN_REF_SQL", new String[]{String.valueOf(this.A00.A08(r8)), String.valueOf(j)});
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(r8);
                Log.i(sb.toString());
            }
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

    public AnonymousClass17U(C19970wo r1, AnonymousClass163 r2, C220412q r3, AnonymousClass12g r4, AnonymousClass12P r5, C20810yC r6) {
        this.A03 = r1;
        this.A05 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public int A00(AnonymousClass11F r10, long j) {
        Cursor A09;
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            int i = 0;
            A09 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ?", "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_SORT_REF_SQL", new String[]{String.valueOf(this.A00.A08(r10)), String.valueOf(j)});
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/getnewercount/db no message for ");
                sb.append(r10);
                Log.i(sb.toString());
            }
            A09.close();
            A042.close();
            this.A04.A01("SortIdStore/getMessagesNewerThanCount", SystemClock.uptimeMillis() - uptimeMillis);
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 >= r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.AnonymousClass11F r6, long r7) {
        /*
            r5 = this;
            X.C18740tg.A06(r6)
            long r3 = r5.A05(r6)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r0 = r6 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0030
            if (r1 != 0) goto L_0x002c
            X.12q r1 = r5.A01
            r0 = 0
            X.3Qp r1 = r1.A09(r6, r0)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x002e
            X.2La r1 = (X.C44072La) r1
            boolean r0 = r1.A0P
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002e
        L_0x002c:
            r0 = 1
            return r0
        L_0x002e:
            r0 = 0
            return r0
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17U.A07(X.11F, long):boolean");
    }
}
