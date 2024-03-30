package X;

import android.database.Cursor;

/* renamed from: X.1FT  reason: invalid class name */
public class AnonymousClass1FT {
    public final AnonymousClass12P A00;

    public static void A00(AnonymousClass3T1 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A1N > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SendCountMessageStore/validateMessage/message must have row_id set; key=");
        C64933Qa r2 = r8.A1J;
        sb.append(r2);
        C18740tg.A0D(z2, sb.toString());
        if (r8.A0H() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SendCountMessageStore/validateMessage/message in main storage; key=");
        sb2.append(r2);
        C18740tg.A0D(z, sb2.toString());
    }

    public int A01(AnonymousClass3T1 r7) {
        Cursor A09;
        int i = 0;
        if (r7.A1N <= 0) {
            return 0;
        }
        A00(r7);
        String[] strArr = {Long.toString(r7.A1N)};
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT send_count FROM message_send_count WHERE message_row_id = ?", "GET_SEND_COUNT_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("send_count"));
            }
            A09.close();
            A04.close();
            return i;
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

    public AnonymousClass1FT(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
