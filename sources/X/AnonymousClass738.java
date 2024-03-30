package X;

import android.util.SparseIntArray;

/* renamed from: X.738  reason: invalid class name */
public final /* synthetic */ class AnonymousClass738 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C133116Wv A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass738(C133116Wv r1, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void run() {
        C133116Wv r7 = this.A01;
        long j = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        C19420v0 r4 = r7.A05;
        r4.A17(5);
        C19420v0.A00(r4).putLong("ext_dir_migration_rescan_time", C90514aH.A0J(j)).commit();
        C133116Wv.A03((SparseIntArray) null, r7, 1);
        r4.A1q(z);
        if (z2) {
            r7.A06.A03("ExternalDirMigration");
        }
    }
}
