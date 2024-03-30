package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.1Hi  reason: invalid class name and case insensitive filesystem */
public class C25701Hi {
    public final C25721Hk A00 = new C25721Hk();
    public final C24571Cy A01;
    public final AnonymousClass18P A02;
    public final C19930wk A03;

    public static void A00(C26901Ly r2, C25701Hi r3, DeviceJid deviceJid) {
        if (((AnonymousClass1M0) r2).A02.A00.inTransaction()) {
            r2.B5o(new C35701j7(r3, deviceJid, 46));
        } else {
            A01(r3, deviceJid);
        }
    }

    public void A05(C25711Hj r4, Executor executor) {
        this.A03.execute(new C35631j0(this, r4, executor, 16));
    }

    public C25701Hi(C24571Cy r3, AnonymousClass18P r4, C19770wU r5) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = new C19930wk(r5, false);
    }

    public static void A01(C25701Hi r7, DeviceJid deviceJid) {
        Cursor A09;
        C18740tg.A00();
        AnonymousClass1M0 A032 = r7.A02.get();
        try {
            boolean z = false;
            A09 = A032.A02.A09("SELECT device_id, status FROM msg_history_sync WHERE device_id=? AND status=? LIMIT 1", "MessageHistorySyncTable.SELECT_SYNC_STATUS_FOR_DEVICE_ID", new String[]{deviceJid.getRawString(), String.valueOf(1)});
            if (A09.getCount() > 0) {
                z = true;
            }
            A09.close();
            A032.close();
            r7.A03.execute(new C35291iS(r7, deviceJid, 10, z));
            return;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass6E9 A02() {
        Cursor A09;
        long j;
        AnonymousClass3I3 r13;
        C18740tg.A00();
        AnonymousClass1M0 A032 = this.A02.get();
        try {
            A09 = A032.A02.A09("SELECT _id, device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, oldest_message_to_sync_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id, session_id, md_reg_attempt_id, size_limit_bytes FROM msg_history_sync WHERE status=1 OR status=3 ORDER BY sync_type ASC, chunk_order ASC, last_chunk_timestamp ASC LIMIT 1", "MessageHistorySyncTable.SELECT_SYNC_TO_PROCESS", (String[]) null);
            if (!A09.moveToNext()) {
                A09.close();
                A032.close();
                return null;
            }
            DeviceJid nullable = DeviceJid.getNullable(A09.getString(A09.getColumnIndexOrThrow("device_id")));
            if (nullable == null) {
                A09.close();
                A032.close();
                return null;
            }
            int i = A09.getInt(A09.getColumnIndexOrThrow("sync_type"));
            long j2 = A09.getLong(A09.getColumnIndexOrThrow("_id"));
            long j3 = A09.getLong(A09.getColumnIndexOrThrow("last_processed_msg_row_id"));
            long j4 = A09.getLong(A09.getColumnIndexOrThrow("oldest_msg_row_id"));
            long j5 = A09.getLong(A09.getColumnIndexOrThrow("oldest_message_to_sync_row_id"));
            long j6 = A09.getLong(A09.getColumnIndexOrThrow("sent_msgs_count"));
            int i2 = A09.getInt(A09.getColumnIndexOrThrow("chunk_order"));
            long j7 = (long) A09.getInt(A09.getColumnIndexOrThrow("sent_bytes"));
            long j8 = (long) A09.getInt(A09.getColumnIndexOrThrow("last_chunk_timestamp"));
            int i3 = A09.getInt(A09.getColumnIndexOrThrow("status"));
            long j9 = A09.getLong(A09.getColumnIndexOrThrow("peer_msg_row_id"));
            String string = A09.getString(A09.getColumnIndexOrThrow("session_id"));
            String string2 = A09.getString(A09.getColumnIndexOrThrow("md_reg_attempt_id"));
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("size_limit_bytes");
            if (!A09.isNull(columnIndexOrThrow)) {
                j = A09.getLong(columnIndexOrThrow);
            } else {
                C24571Cy r3 = this.A01;
                j = -1;
                if (i == 2) {
                    r3.A01.A07(2645);
                } else if (i != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HistorySyncUtil/getSizeLimitBytes unexpected sync type ");
                    sb.append(i);
                    Log.w(sb.toString());
                } else {
                    j = ((long) r3.A00.A04(C21100yf.A1P)) * SearchActionVerificationClientService.MS_TO_NS;
                }
            }
            if (string == null || string2 == null) {
                r13 = null;
            } else {
                r13 = new AnonymousClass3I3(string, string2);
            }
            AnonymousClass6E9 r12 = new AnonymousClass6E9(r13, nullable, i, i2, i3, j2, j3, j4, j5, j6, j7, j8, j9, j);
            A09.close();
            A032.close();
            return r12;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(AnonymousClass6E9 r8) {
        C18740tg.A00();
        AnonymousClass1M0 A04 = this.A02.A04();
        try {
            ContentValues contentValues = new ContentValues();
            DeviceJid deviceJid = r8.A0D;
            contentValues.put("device_id", deviceJid.getRawString());
            contentValues.put("sync_type", Integer.valueOf(r8.A02));
            contentValues.put("last_processed_msg_row_id", Long.valueOf(r8.A04));
            contentValues.put("oldest_msg_row_id", Long.valueOf(r8.A0A));
            contentValues.put("sent_msgs_count", Long.valueOf(r8.A08));
            contentValues.put("chunk_order", Integer.valueOf(r8.A00));
            contentValues.put("sent_bytes", Long.valueOf(r8.A07));
            contentValues.put("last_chunk_timestamp", Long.valueOf(r8.A03));
            contentValues.put("status", Integer.valueOf(r8.A01));
            contentValues.put("peer_msg_row_id", Long.valueOf(r8.A05));
            contentValues.put("oldest_message_to_sync_row_id", Long.valueOf(r8.A0B));
            AnonymousClass3I3 r6 = r8.A0C;
            if (r6 != null) {
                contentValues.put("session_id", r6.A01);
                contentValues.put("md_reg_attempt_id", r6.A00);
            } else {
                contentValues.putNull("session_id");
                contentValues.putNull("md_reg_attempt_id");
            }
            contentValues.put("size_limit_bytes", Long.valueOf(r8.A09));
            A04.A02.A04("msg_history_sync", "MessageHistorySyncTable.INSERT_SYNC_STATE", contentValues);
            A00(A04, this, deviceJid);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A04(DeviceJid deviceJid, int i) {
        C18740tg.A00();
        AnonymousClass1M0 A04 = this.A02.A04();
        try {
            A04.A02.A0E("DELETE FROM msg_history_sync WHERE device_id=? AND sync_type=?", "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_DEVICE_AND_TYPE", new String[]{deviceJid.getRawString(), String.valueOf(i)});
            A04.close();
            A01(this, deviceJid);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
