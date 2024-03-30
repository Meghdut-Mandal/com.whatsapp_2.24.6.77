package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1F9  reason: invalid class name */
public class AnonymousClass1F9 {
    public final AnonymousClass12P A00;

    public static void A00(AnonymousClass1F9 r5, AnonymousClass2bR r6, String str, String str2) {
        Cursor A09;
        AnonymousClass1M0 A04 = r5.A00.get();
        try {
            A09 = A04.A02.A09(str, str2, new String[]{Long.toString(r6.A1N)});
            if (A09.moveToLast()) {
                r6.A00 = A09.getInt(A09.getColumnIndexOrThrow("service"));
                r6.A01 = A09.getLong(A09.getColumnIndexOrThrow("expiration_timestamp"));
            }
            A09.close();
            A04.close();
            return;
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

    public static void A01(AnonymousClass1F9 r3, String str, String str2, int i, long j, long j2) {
        AnonymousClass1M0 A05 = r3.A00.A05();
        try {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("service", Integer.valueOf(i));
            contentValues.put("expiration_timestamp", Long.valueOf(j2));
            A05.A02.A08(str, str2, contentValues, 5);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1F9(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
