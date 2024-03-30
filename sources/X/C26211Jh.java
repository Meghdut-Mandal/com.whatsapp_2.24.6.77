package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1Jh  reason: invalid class name and case insensitive filesystem */
public class C26211Jh {
    public final C19730wQ A00;
    public final AnonymousClass1C7 A01;
    public final AnonymousClass163 A02;
    public final C219712j A03;
    public final AnonymousClass12P A04;
    public final C19970wo A05;

    public AnonymousClass3KV A02(AnonymousClass11F r6, String str) {
        Cursor A09;
        AnonymousClass3KV r0;
        String[] strArr = {str, String.valueOf(this.A02.A08(r6))};
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            A09 = A042.A02.A09("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_id = ?  AND key_chat_row_id = ? ", "ScheduledCallsStore/GET_SCHEDULED_CALL_BY_KEY_ID_AND_CHAT", strArr);
            if (!A09.moveToLast()) {
                r0 = null;
            } else {
                r0 = A00(A09, this);
            }
            A09.close();
            A042.close();
            return r0;
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

    public static AnonymousClass3KV A00(Cursor cursor, C26211Jh r26) {
        long j;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("creation_message_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("key_from_me");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("key_chat_row_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("call_type");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("scheduled_timestamp");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("call_title");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("creator_jid_row_id");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("is_upcoming");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("call_log_row_id");
        long j2 = cursor2.getLong(columnIndexOrThrow);
        String string = cursor2.getString(columnIndexOrThrow2);
        boolean z = false;
        if (cursor2.getLong(columnIndexOrThrow3) == 1) {
            z = true;
        }
        C26211Jh r5 = r26;
        AnonymousClass11F A0A = r5.A02.A0A(cursor2.getLong(columnIndexOrThrow4));
        int i = cursor2.getInt(columnIndexOrThrow5);
        long j3 = cursor2.getLong(columnIndexOrThrow6);
        String string2 = cursor2.getString(columnIndexOrThrow7);
        UserJid userJid = (UserJid) r5.A03.A09(cursor2.getLong(columnIndexOrThrow8));
        boolean z2 = false;
        if (cursor2.getInt(columnIndexOrThrow9) == 1) {
            z2 = true;
        }
        if (cursor2.isNull(columnIndexOrThrow10)) {
            j = -1;
        } else {
            j = cursor2.getLong(columnIndexOrThrow10);
        }
        if (A0A == null || userJid == null) {
            return null;
        }
        return new AnonymousClass3KV(A0A, userJid, string, string2, i, j2, j3, j, z2, z);
    }

    public AnonymousClass3KV A01(long j) {
        Cursor A09;
        AnonymousClass3KV r0;
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            A09 = A042.A02.A09("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE creation_message_row_id = ? ", "ScheduledCallsStore/GET_SCHEDULED_CALL_BY_ROW_ID", new String[]{Long.toString(j)});
            if (!A09.moveToFirst()) {
                r0 = null;
            } else {
                r0 = A00(A09, this);
            }
            A09.close();
            A042.close();
            return r0;
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

    public String A03(C107265Nh r4) {
        AnonymousClass3KV A022;
        if (r4.A0G == null || r4.A0D == null || (A022 = A02(r4.A0D, r4.A0G.A00)) == null) {
            return null;
        }
        return A022.A00();
    }

    public ArrayList A04() {
        Cursor A09;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            A09 = A042.A02.A09("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ?  ORDER BY scheduled_timestamp ASC ", "SELECT_ALL_UPCOMING_CALLS", new String[]{Long.toString(System.currentTimeMillis() - 900000)});
            while (A09.moveToNext()) {
                AnonymousClass3KV A002 = A00(A09, this);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A09.close();
            A042.close();
            return arrayList;
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

    public C26211Jh(C19730wQ r1, C19970wo r2, AnonymousClass1C7 r3, AnonymousClass163 r4, C219712j r5, AnonymousClass12P r6) {
        this.A05 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = r3;
        this.A04 = r6;
    }
}
