package X;

import android.content.ContentValues;
import android.database.SQLException;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Eg  reason: invalid class name and case insensitive filesystem */
public class C24911Eg {
    public final AnonymousClass176 A00;
    public final AnonymousClass12P A01;
    public final AnonymousClass163 A02;

    public void A00(C26911Lz r8, GroupJid groupJid, boolean z) {
        if (!z) {
            String[] strArr = {String.valueOf(this.A02.A08(groupJid))};
            ContentValues contentValues = new ContentValues();
            contentValues.put("invalid_state", 1);
            ((AnonymousClass1M0) r8).A02.A01(contentValues, "message_poll", "message_row_id IN (SELECT _id FROM available_message_view WHERE (available_message_view.chat_row_id = ? AND available_message_view.message_type = 66))", "message_poll.INVALIDATE_POLL_MESSAGES", strArr);
            r8.B5o(new C35701j7(this, groupJid, 21));
        }
    }

    public void A01(AnonymousClass2bS r12) {
        AnonymousClass12P r7 = this.A01;
        AnonymousClass1M0 A05 = r7.A05();
        try {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("message_row_id", Long.valueOf(r12.A1N));
            contentValues.put("selectable_options_count", Integer.valueOf(r12.A01));
            contentValues.put("invalid_state", Integer.valueOf(r12.A00));
            contentValues.put("poll_logging_id", Long.valueOf(r12.A02));
            if (A05.A02.A08("message_poll", "insertOrUpdateMessagePoll/INSERT_MESSAGE_POLL", contentValues, 5) < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PollMessageStore/insertOrUpdateMessagePoll/insert error, rowId=");
                sb.append(r12.A1N);
                Log.e(sb.toString());
            }
            A05.close();
            A05 = r7.A05();
            try {
                for (AnonymousClass3PS r5 : r12.A05) {
                    ContentValues contentValues2 = new ContentValues(5);
                    contentValues2.put("message_row_id", Long.valueOf(r12.A1N));
                    contentValues2.put("option_sha256", r5.A02);
                    contentValues2.put("option_name", r5.A03);
                    contentValues2.put("vote_total", Integer.valueOf(r5.A00));
                    long j = r5.A01;
                    if (j != -1) {
                        contentValues2.put("_id", Long.valueOf(j));
                    }
                    long A08 = A05.A02.A08("message_poll_option", "PollMessageStore/insertOrUpdatePollOptionTable", contentValues2, 5);
                    if (A08 != -1) {
                        r5.A01 = A08;
                    } else {
                        throw new SQLException("PollMessageStore/insertOrUpdatePollOptionTable the row was not updated");
                    }
                }
                A05.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } finally {
            th = th;
            A05.close();
        }
    }

    public void A02(AnonymousClass2bS r15) {
        C1495671s B1k;
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            B1k = A05.B1k();
            for (AnonymousClass3PS r5 : r15.A05) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("vote_total", Integer.valueOf(r5.A00));
                if (A05.A02.A01(contentValues, "message_poll_option", "_id = ?", "PollMessageStore/MESSAGE_POLL_OPTION_UPDATE_VOTE_TOTAL", new String[]{String.valueOf(r5.A01)}) != 1) {
                    throw new SQLException("updatePollOptionVoteTotals/updatePollOptionVoteTotals the row was not updated");
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
        throw th;
    }

    public C24911Eg(AnonymousClass163 r1, AnonymousClass176 r2, AnonymousClass12P r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
