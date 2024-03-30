package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.3vo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80693vo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass1Q9 A02;
    public final /* synthetic */ AnonymousClass135 A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C80693vo(AnonymousClass1Q9 r1, AnonymousClass135 r2, Runnable runnable, int i, long j, boolean z) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = j;
        this.A03 = r2;
        this.A04 = runnable;
        this.A05 = z;
    }

    public final void run() {
        AnonymousClass1Q9 r7 = this.A02;
        int i = this.A00;
        long j = this.A01;
        AnonymousClass135 r5 = this.A03;
        Runnable runnable = this.A04;
        boolean z = this.A05;
        Log.i("MessageStoreBackup/backupdb/sb unlocker");
        try {
            AnonymousClass12P r0 = r7.A0K;
            r0.A06();
            r0.A02.BJK();
            r7.A0M.A01();
            AnonymousClass1Q9.A07(r7, r5, i, j);
            if (runnable != null && !z) {
                runnable.run();
            }
        } catch (SQLiteException e) {
            Log.e("MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links", e);
        }
    }
}
