package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.4hJ  reason: invalid class name and case insensitive filesystem */
public final class C93894hJ extends Snapshot {
    public final Snapshot A00;
    public final C006302t A01;
    public final Snapshot A02;
    public final boolean A03;

    public void A0B() {
        Snapshot snapshot;
        this.A02 = true;
        if (this.A03 && (snapshot = this.A00) != null) {
            snapshot.A0B();
        }
    }

    public C93894hJ(Snapshot snapshot, C006302t r4, boolean z) {
        super(C1496472d.A04, 0);
        this.A00 = snapshot;
        this.A03 = z;
        int i = AnonymousClass6YQ.A00;
        this.A01 = r4 == null ? null : r4;
        this.A02 = this;
    }
}
