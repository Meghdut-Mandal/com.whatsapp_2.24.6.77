package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1Je  reason: invalid class name and case insensitive filesystem */
public class C26181Je {
    public final AnonymousClass12P A00;

    public void A00(long j, byte[] bArr) {
        AnonymousClass1M0 A05 = this.A00.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("message_secret", bArr);
            A05.A02.A08("message_secret", "MessageSecretStore/insertMessageSecret", contentValues, 5);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public byte[] A01(long j) {
        Cursor A09;
        byte[] bArr;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            A09 = A04.A02.A09("SELECT message_secret FROM message_secret WHERE message_row_id = ?", "GET_MESSAGE_SECRET_SQL", new String[]{Long.toString(j)});
            if (A09.moveToLast()) {
                bArr = A09.getBlob(A09.getColumnIndexOrThrow("message_secret"));
            } else {
                bArr = null;
            }
            A09.close();
            A04.close();
            return bArr;
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

    public C26181Je(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
