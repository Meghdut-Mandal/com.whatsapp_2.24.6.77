package X;

import android.database.Cursor;

/* renamed from: X.1Hu  reason: invalid class name and case insensitive filesystem */
public class C25821Hu {
    public final AnonymousClass1C7 A00;
    public final AnonymousClass12P A01;

    public String A00(AnonymousClass3T1 r8) {
        Cursor A09;
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT message_template_id FROM messages_hydrated_four_row_template WHERE message_row_id = ?", "GET_HFRT_BY_MESSAGE_ID", new String[]{String.valueOf(r8.A1N)});
            String str = null;
            if (A09 != null) {
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("message_template_id");
                if (A09.moveToLast()) {
                    str = A09.getString(columnIndexOrThrow);
                }
            }
            if (A09 != null) {
                A09.close();
            }
            A04.close();
            return str;
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

    public C25821Hu(AnonymousClass1C7 r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
