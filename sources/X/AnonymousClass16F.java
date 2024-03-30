package X;

import android.database.Cursor;

/* renamed from: X.16F  reason: invalid class name */
public class AnonymousClass16F {
    public final AnonymousClass12P A00;

    public AnonymousClass3SA A00(AnonymousClass3T1 r10) {
        Cursor A09;
        AnonymousClass3SA r6 = new AnonymousClass3SA(r10);
        if (r10.A1N == -1) {
            return r6;
        }
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT duration, campaign_id, first_seen_timestamp, action_link_url, action_link_button_title FROM message_status_psa_campaign WHERE message_row_id = ?", "GET_STATUS_PSA_INFO_FOR_ROW_ID_SQL", new String[]{Long.toString(r10.A1N)});
            if (A09 != null) {
                if (A09.moveToNext()) {
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("campaign_id");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("duration");
                    int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("first_seen_timestamp");
                    int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("action_link_url");
                    int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("action_link_button_title");
                    r6.A04 = A09.getString(columnIndexOrThrow);
                    r6.A00 = A09.getLong(columnIndexOrThrow2);
                    r6.A01 = A09.getLong(columnIndexOrThrow3);
                    r6.A03 = A09.getString(columnIndexOrThrow4);
                    r6.A02 = A09.getString(columnIndexOrThrow5);
                }
                A09.close();
            }
            A04.close();
            return r6;
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

    public AnonymousClass16F(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
