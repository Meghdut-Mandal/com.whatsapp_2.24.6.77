package X;

import android.database.Cursor;

/* renamed from: X.60t  reason: invalid class name and case insensitive filesystem */
public class C1256560t {
    public final AnonymousClass12P A00;

    public C1256560t(AnonymousClass12P r1) {
        this.A00 = r1;
    }

    public Integer A00(long j) {
        Cursor A09;
        String[] A1R = C36441kJ.A1R();
        A1R[0] = Long.toString(j);
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT rating FROM message_rating WHERE message_row_id = ?", "GET_MESSAGE_RATING_BY_ROW_ID_SQL", A1R);
            if (A09.moveToFirst()) {
                Integer valueOf = Integer.valueOf(C36351kA.A03(A09, "rating"));
                A09.close();
                A04.close();
                return valueOf;
            }
            A09.close();
            A04.close();
            return null;
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
}
