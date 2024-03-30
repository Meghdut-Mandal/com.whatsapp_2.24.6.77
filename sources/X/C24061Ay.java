package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;

/* renamed from: X.1Ay  reason: invalid class name and case insensitive filesystem */
public class C24061Ay {
    public final AnonymousClass12P A00;
    public final AnonymousClass12T A01;

    public int A00(String str) {
        Cursor A09;
        try {
            AnonymousClass1M0 A04 = this.A00.get();
            try {
                int i = 0;
                A09 = A04.A02.A09("SELECT ref_count FROM media_refs WHERE path = ?", "GET_MEDIA_REF_COUNT_SQL", new String[]{str});
                if (A09.moveToNext()) {
                    i = A09.getInt(A09.getColumnIndexOrThrow("ref_count"));
                }
                A09.close();
                A04.close();
                return i;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDiskIOException e) {
            this.A01.A00(1);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public C24061Ay(AnonymousClass12T r1, AnonymousClass12P r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
