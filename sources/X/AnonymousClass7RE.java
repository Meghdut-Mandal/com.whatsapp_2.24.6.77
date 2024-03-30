package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.7RE  reason: invalid class name */
public final class AnonymousClass7RE extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RE(C006302t r2) {
        super(1);
        this.$block = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Snapshot snapshot = (Snapshot) this.$block.invoke(obj);
        synchronized (AnonymousClass6YQ.A07) {
            Snapshot.A03(snapshot);
        }
        return snapshot;
    }
}
