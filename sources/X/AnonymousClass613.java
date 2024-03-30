package X;

import android.database.Cursor;

/* renamed from: X.613  reason: invalid class name */
public class AnonymousClass613 {
    public final C1270366r A00;

    public int A00() {
        Cursor A09;
        int i;
        AnonymousClass1M0 A002 = this.A00.A00();
        try {
            A09 = A002.A02.A09("SELECT COUNT(*) as count FROM prefetched_files WHERE prefetched = 0", "XPM_FILE_PREFETCHER_PENDING_COUNT", (String[]) null);
            if (A09.moveToNext()) {
                i = C36351kA.A03(A09, "count");
            } else {
                i = 0;
            }
            A09.close();
            A002.close();
            return i;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass613(C1270366r r1) {
        this.A00 = r1;
    }
}
