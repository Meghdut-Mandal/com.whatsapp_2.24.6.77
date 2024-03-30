package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1F8  reason: invalid class name */
public class AnonymousClass1F8 {
    public final C219712j A00;
    public final AnonymousClass12P A01;
    public final AnonymousClass163 A02;

    public static ContentValues A00(AnonymousClass1F8 r4, AnonymousClass2bQ r5, long j) {
        String l;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.toString(j));
        AnonymousClass147 r1 = r5.A02;
        String str = null;
        if (r1 == null) {
            l = null;
        } else {
            l = Long.toString(r4.A00.A07(r1));
        }
        contentValues.put("group_jid_row_id", l);
        UserJid userJid = r5.A03;
        if (userJid != null) {
            str = Long.toString(r4.A00.A07(userJid));
        }
        contentValues.put("admin_jid_row_id", str);
        contentValues.put("group_name", r5.A05);
        contentValues.put("invite_code", r5.A06);
        contentValues.put("expiration", Long.valueOf(r5.A01));
        contentValues.put("invite_time", Long.valueOf(r5.A0I));
        contentValues.put("expired", Integer.valueOf(r5.A07 ? 1 : 0));
        contentValues.put("group_type", Integer.valueOf(r5.A00));
        return contentValues;
    }

    public long A01(AnonymousClass147 r8, UserJid userJid) {
        Cursor A09;
        long j = -1;
        if (r8 == null || userJid == null) {
            return -1;
        }
        C219712j r3 = this.A00;
        String[] strArr = {Long.toString(r3.A07(r8)), Long.toString(r3.A07(userJid))};
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT message_row_id FROM message_group_invite WHERE group_jid_row_id = ? AND admin_jid_row_id = ? AND expired = 0 ORDER BY invite_time DESC", "GET_LAST_GROUP_INVITE_MESSAGE_BY_GROUP_AND_ADMIN_SQL", strArr);
            if (A09.moveToNext()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("message_row_id"));
            }
            A09.close();
            A04.close();
            return j;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A02(AnonymousClass147 r8, UserJid userJid) {
        Cursor A09;
        long j = -1;
        if (r8 == null || userJid == null) {
            return -1;
        }
        String[] strArr = {Long.toString(this.A00.A07(r8)), Long.toString(this.A02.A08(userJid))};
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT invite.message_row_id AS message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND message.chat_row_id = ? AND invite.expired = 0 ORDER BY invite.invite_time DESC", "GET_LAST_SENT_GROUP_INVITE_MESSAGE_BY_GROUP_AND_REMOTE_SQL", strArr);
            if (A09.moveToNext()) {
                j = A09.getLong(A09.getColumnIndexOrThrow("message_row_id"));
            }
            A09.close();
            A04.close();
            return j;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(AnonymousClass2bQ r7) {
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            A05.A02.A08("message_group_invite", "INSERT_GROUP_INVITE_MESSAGE_SQL", A00(this, r7, r7.A1N), 5);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1F8(AnonymousClass163 r1, C219712j r2, AnonymousClass12P r3) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
