package X;

import android.database.Cursor;
import java.util.HashSet;

/* renamed from: X.1AJ  reason: invalid class name */
public class AnonymousClass1AJ {
    public final AnonymousClass18P A00;

    public HashSet A00() {
        Cursor A09;
        HashSet hashSet = new HashSet();
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT DISTINCT collection_name FROM missing_keys", "SyncdMissingKeysTable.COLLECTIONS_WAITING_FOR_KEY", (String[]) null);
            while (A09.moveToNext()) {
                hashSet.add(A09.getString(A09.getColumnIndexOrThrow("collection_name")));
            }
            A09.close();
            A03.close();
            return hashSet;
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

    public AnonymousClass1AJ(AnonymousClass18P r1) {
        this.A00 = r1;
    }
}
