package X;

import android.database.Cursor;

/* renamed from: X.1TV  reason: invalid class name */
public class AnonymousClass1TV {
    public final AnonymousClass185 A00;
    public final AnonymousClass178 A01;
    public final AnonymousClass12P A02;

    public C600436g A00(long j) {
        Cursor A09;
        C600436g r5;
        AnonymousClass1M0 A04 = this.A02.get();
        try {
            A09 = A04.A02.A09("SELECT host_storage, actual_actors, privacy_mode_ts, business_name FROM message_privacy_state WHERE message_row_id = ?", "GET_PRIVACY_STATE_INFO_SQL", new String[]{Long.toString(j)});
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("host_storage");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("actual_actors");
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("privacy_mode_ts");
            int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("business_name");
            if (A09.moveToNext()) {
                r5 = new C600436g(this);
                r5.A00 = new C80113ur(A09.getInt(columnIndexOrThrow), (long) A09.getInt(columnIndexOrThrow3), A09.getInt(columnIndexOrThrow2));
                r5.A01 = A09.getString(columnIndexOrThrow4);
            } else {
                r5 = null;
            }
            A09.close();
            A04.close();
            return r5;
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

    public void A01(long j) {
        AnonymousClass1M0 A05 = this.A02.A05();
        try {
            A05.A02.A03("message_privacy_state", "message_row_id = ?", "DELETE_MESSAGE_PRIVACY_STATE_FOR_ID_SQL", new String[]{String.valueOf(j)});
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A02(AnonymousClass3T1 r3) {
        C600436g A002 = A00(r3.A1N);
        if (A002 != null) {
            r3.A0o = A002.A01;
            r3.A0b = A002.A00;
        }
    }

    public AnonymousClass1TV(AnonymousClass185 r1, AnonymousClass178 r2, AnonymousClass12P r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
