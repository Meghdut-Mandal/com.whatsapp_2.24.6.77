package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1QP  reason: invalid class name */
public class AnonymousClass1QP {
    public final C002000v A00 = new C002000v(250);
    public final C219712j A01;
    public final AnonymousClass12P A02;

    /* JADX INFO: finally extract failed */
    public AnonymousClass3CY A00(long j) {
        Long valueOf;
        AnonymousClass3CY r0;
        AnonymousClass3CY r5;
        Cursor A09;
        C002000v r7 = this.A00;
        synchronized (r7) {
            valueOf = Long.valueOf(j);
            r0 = (AnonymousClass3CY) r7.A04(valueOf);
        }
        if (r0 != null) {
            return r0;
        }
        AnonymousClass12P r02 = this.A02;
        AnonymousClass1M0 A04 = r02.get();
        try {
            synchronized (r7) {
                r5 = new AnonymousClass3CY();
                AnonymousClass1M0 A042 = r02.get();
                try {
                    A09 = A042.A02.A09("SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?", "GET_MESSAGE_RECEIPTS_SQL", new String[]{String.valueOf(j)});
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("receipt_user_jid_row_id");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("receipt_timestamp");
                    int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("read_timestamp");
                    int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("played_timestamp");
                    while (A09.moveToNext()) {
                        UserJid userJid = (UserJid) this.A01.A0C(UserJid.class, A09.getLong(columnIndexOrThrow));
                        if (userJid != null) {
                            r5.A00.put(userJid, new AnonymousClass3Q6(A09.getLong(columnIndexOrThrow2), A09.getLong(columnIndexOrThrow3), A09.getLong(columnIndexOrThrow4)));
                        }
                    }
                    A09.close();
                    A042.close();
                    r7.A08(valueOf, r5);
                } catch (Throwable th) {
                    try {
                        A042.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            A04.close();
            return r5;
        } catch (Throwable th3) {
            try {
                A04.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
        throw th;
    }

    public void A01(UserJid userJid, int i, long j, long j2) {
        String str;
        C1495671s B1k;
        long j3 = j;
        UserJid userJid2 = userJid;
        int i2 = i;
        long j4 = j2;
        if (A00(j3).A00(userJid2, i2, j4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("receiptuserstore/insertOrUpdateUserReceiptForMessage/rowId=");
            sb.append(j3);
            sb.append("; status=");
            sb.append(i2);
            sb.append(" timestamp=");
            sb.append(j4);
            Log.i(sb.toString());
            ContentValues contentValues = new ContentValues(1);
            if (i2 == 5) {
                str = "receipt_timestamp";
            } else if (i2 == 8) {
                str = "played_timestamp";
            } else if (i2 == 13) {
                str = "read_timestamp";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected message status ");
                sb2.append(i2);
                sb2.append(" for user receipt");
                throw new IllegalArgumentException(sb2.toString());
            }
            contentValues.put(str, Long.valueOf(j4));
            AnonymousClass1M0 A05 = this.A02.A05();
            try {
                B1k = A05.B1k();
                long A07 = this.A01.A07(userJid2);
                boolean z = false;
                if (A07 != -1) {
                    z = true;
                }
                C18740tg.A0F(z, "invalid jid");
                C224114e r13 = A05.A02;
                if (((long) r13.A01(contentValues, "receipt_user", "message_row_id=? AND receipt_user_jid_row_id=?", "insertOrUpdateUserReceiptForMessage/UPDATE_RECEIPT_USER", new String[]{String.valueOf(j3), String.valueOf(A07)})) == 0) {
                    contentValues.put("message_row_id", Long.valueOf(j3));
                    contentValues.put("receipt_user_jid_row_id", Long.valueOf(A07));
                    if (r13.A04("receipt_user", "insertOrUpdateUserReceiptForMessage/INSERT_RECEIPT_USER", contentValues) == -1) {
                        Log.e("ReceiptUserStore/insertOrUpdateUserReceiptForMessage/insert failed");
                    }
                }
                B1k.A00();
                B1k.close();
                A05.close();
                return;
            } catch (Throwable th) {
                try {
                    A05.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public AnonymousClass1QP(C219712j r3, AnonymousClass12P r4) {
        this.A01 = r3;
        this.A02 = r4;
    }
}
