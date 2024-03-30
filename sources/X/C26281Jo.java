package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1Jo  reason: invalid class name and case insensitive filesystem */
public class C26281Jo {
    public final AnonymousClass12P A00;

    public ArrayList A00(long j) {
        Cursor A09;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT _id, message_poll_option_id FROM message_add_on_poll_vote_selected_option WHERE message_add_on_row_id = ?", "GET_MESSAGE_ADD_ON_POLL_VOTE_SELECTED_OPTION_SQL", new String[]{Long.toString(j)});
            ArrayList arrayList = new ArrayList();
            if (A09.moveToFirst()) {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("message_poll_option_id");
                do {
                    arrayList.add(Long.valueOf(A09.getLong(columnIndexOrThrow)));
                } while (A09.moveToNext());
            }
            A09.close();
            A04.close();
            return arrayList;
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

    public C26281Jo(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
