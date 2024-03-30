package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.4hH  reason: invalid class name and case insensitive filesystem */
public final class C93874hH extends Snapshot {
    public final Snapshot A00;
    public final C006302t A01;

    public void A0B() {
        if (!this.A02) {
            int A04 = A04();
            Snapshot snapshot = this.A00;
            if (A04 != snapshot.A04()) {
                A0G();
            }
            snapshot.A0D();
            super.A0B();
        }
    }

    public C93874hH(Snapshot snapshot, C1496472d r4, C006302t r5, int i) {
        super(r4, i);
        this.A00 = snapshot;
        snapshot.A0C();
        if (r5 != null) {
            C006302t A09 = snapshot.A09();
            if (A09 != null) {
                r5 = new C154787Tn(r5, A09);
            }
        } else {
            r5 = snapshot.A09();
        }
        this.A01 = r5;
    }
}
