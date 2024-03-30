package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1LW  reason: invalid class name */
public class AnonymousClass1LW {
    public final AnonymousClass1C7 A00;
    public final AnonymousClass163 A01;
    public final C220412q A02;
    public final AnonymousClass12P A03;
    public final C219712j A04;
    public final C220612s A05;

    public boolean A04(AnonymousClass11F r4, int i) {
        C65073Qp A09 = this.A02.A09(r4, false);
        if (A09 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("groupchatstore/updateGroupChatInfoGroupTypeIfExist/chat does not exist: ");
            sb.append(r4);
            Log.i(sb.toString());
            return false;
        }
        Log.i("groupchatstore/updateGroupChatInfoGroupTypeInBackgroundIfExist/update group type");
        A09.A02 = i;
        return A00(A09, this, r4, (Long) null);
    }

    public static boolean A00(C65073Qp r7, AnonymousClass1LW r8, AnonymousClass11F r9, Long l) {
        ContentValues contentValues;
        try {
            AnonymousClass1M0 A052 = r8.A03.A05();
            try {
                C1495671s B1k = A052.B1k();
                try {
                    AnonymousClass163 r4 = r8.A01;
                    synchronized (r7) {
                        contentValues = new ContentValues(3);
                        if (l != null) {
                            contentValues.put("created_timestamp", l);
                        }
                        contentValues.put("subject", r7.A0h);
                        contentValues.put("group_type", Integer.valueOf(r7.A02));
                        AnonymousClass3G4 r0 = r7.A0e;
                        if (r0 != null) {
                            contentValues.put("growth_lock_level", Integer.valueOf(r0.A00));
                            contentValues.put("growth_lock_expiration_ts", Long.valueOf(r7.A0e.A01));
                        }
                    }
                    if (!r4.A0K(contentValues, r7)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/addmsg/chatlist/insert/failed jid=");
                        sb.append(r9);
                        Log.e(sb.toString());
                    }
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    return true;
                } catch (Throwable th) {
                    B1k.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A052.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r8.A05.A03();
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public UserJid A01(AnonymousClass147 r9) {
        Cursor A09;
        UserJid userJid;
        try {
            AnonymousClass1M0 A042 = this.A03.get();
            try {
                A09 = A042.A02.A09("SELECT sender_jid_row_id, sender_jid_raw_string FROM message_system_group AS system_group JOIN message_system AS message_system JOIN available_message_view AS message WHERE message_system.message_row_id = system_group.message_row_id AND message_system.message_row_id = message._id AND message.chat_row_id = ? AND message.message_type = '7' AND message.from_me = 1 AND (message_system.action_type = 12 OR message_system.action_type = 124 OR message_system.action_type = 144 OR message_system.action_type = 127) AND system_group.is_me_joined = 1 ORDER BY _id DESC LIMIT 1", "GET_GROUP_ADDER_JID_SQL", new String[]{String.valueOf(this.A01.A08(r9))});
                if (A09 != null) {
                    if (A09.moveToNext()) {
                        int columnIndexOrThrow = A09.getColumnIndexOrThrow("sender_jid_row_id");
                        if (!A09.isNull(columnIndexOrThrow)) {
                            long j = A09.getLong(columnIndexOrThrow);
                            if (j >= 0) {
                                Jid A092 = this.A04.A09(j);
                                C222813r r0 = UserJid.Companion;
                                userJid = C222813r.A00(A092);
                                A09.close();
                                A042.close();
                                return userJid;
                            }
                        }
                        userJid = UserJid.Companion.A02(A09.getString(A09.getColumnIndexOrThrow("sender_jid_raw_string")));
                        A09.close();
                        A042.close();
                        return userJid;
                    }
                    A09.close();
                }
                A042.close();
                return null;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A05.A03();
            return null;
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A02(AnonymousClass11F r4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updategroupchatsubject/");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00.A01(new C35491im(this, r4, str, 3), 37);
    }

    public void A03(AnonymousClass147 r12, AnonymousClass3G4 r13, String str, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updategroupchat/");
        sb.append(r12);
        sb.append(" creation=");
        long j2 = j;
        sb.append(j2);
        sb.append(" groupType='");
        sb.append(i);
        sb.append("'");
        Log.i(sb.toString());
        this.A00.A01(new C35531iq(this, r12, r13, str, i, 1, j2), 38);
    }

    public AnonymousClass1LW(AnonymousClass1C7 r1, AnonymousClass163 r2, C220412q r3, C219712j r4, C220612s r5, AnonymousClass12P r6) {
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r6;
        this.A05 = r5;
    }
}
