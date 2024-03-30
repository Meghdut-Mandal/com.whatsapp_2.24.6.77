package X;

import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.1Lx  reason: invalid class name and case insensitive filesystem */
public class C26891Lx {
    public final C25091Ey A00;
    public final C20340xP A01;

    public int A00(AnonymousClass11F r10, long j) {
        HashSet hashSet;
        Cursor A09;
        Cursor A092;
        C20340xP r8 = this.A01;
        HashSet hashSet2 = new HashSet();
        try {
            AnonymousClass1M0 A04 = r8.A0B.get();
            try {
                A092 = A04.A02.A09("SELECT message._id as _id FROM message_quoted JOIN message_view AS message ON message_quoted.message_row_id = message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message.message_type <> 15 AND message_quoted.from_me = 1 LIMIT 100", "GET_QUOTED_ME_MESSAGES_NEWER_THAN_REF_SQL", new String[]{String.valueOf(j), String.valueOf(r8.A03.A08(r10))});
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("_id");
                while (A092.moveToNext()) {
                    hashSet2.add(Long.valueOf(A092.getLong(columnIndexOrThrow)));
                }
                A092.close();
                A04.close();
                C25091Ey r6 = this.A00;
                C19730wQ r0 = r6.A00;
                r0.A0G();
                PhoneUserJid phoneUserJid = r0.A03;
                if (phoneUserJid != null) {
                    hashSet = new HashSet();
                    String[] strArr = {String.valueOf(j), String.valueOf(r6.A01.A08(r10)), String.valueOf(r6.A02.A07(phoneUserJid))};
                    try {
                        AnonymousClass1M0 A042 = r6.A03.get();
                        try {
                            A09 = A042.A02.A09("SELECT message._id AS _id FROM message_mentions JOIN message_view AS message ON message_mentions.message_row_id == message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message_mentions.jid_row_id = ? AND message.message_type <> 15 LIMIT 100", "GET_MENTIONED_ME_MESSAGES_NEWER_THAN_REF_SQL", strArr);
                            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("_id");
                            while (A09.moveToNext()) {
                                hashSet.add(Long.valueOf(A09.getLong(columnIndexOrThrow2)));
                            }
                            A09.close();
                            A042.close();
                        } catch (Throwable th) {
                            A042.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        Log.e("MentionMessageStore/getMentionImportantMessagesNewerThanCount", e);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                hashSet2.addAll(hashSet);
                return hashSet2.size();
                throw th;
                throw th;
            } catch (Throwable th3) {
                A04.close();
                throw th3;
            }
        } catch (Exception e2) {
            Log.e("QuotedMessageStore/getQuotedImportantMessagesNewerThanCount", e2);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    public C26891Lx(C25091Ey r1, C20340xP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
