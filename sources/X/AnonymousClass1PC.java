package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1PC  reason: invalid class name */
public class AnonymousClass1PC {
    public final C219712j A00;
    public final C229716r A01;

    public Integer A00(GroupJid groupJid) {
        Cursor A09;
        Integer num;
        AnonymousClass1M0 A03 = this.A01.get();
        try {
            A09 = A03.A02.A09("SELECT member_count FROM group_membership_count WHERE jid_row_id = ?", "GET_GROUP_MEMBER_COUNT", new String[]{Long.toString(this.A00.A07(groupJid))});
            if (A09.moveToNext()) {
                num = Integer.valueOf(A09.getInt(A09.getColumnIndexOrThrow("member_count")));
            } else {
                num = null;
            }
            A09.close();
            A03.close();
            return num;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1PC(C219712j r1, C229716r r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
