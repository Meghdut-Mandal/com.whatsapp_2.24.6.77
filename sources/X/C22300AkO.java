package X;

import android.os.CancellationSignal;

/* renamed from: X.AkO  reason: case insensitive filesystem */
public final class C22300AkO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CancellationSignal $canceller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22300AkO(CancellationSignal cancellationSignal) {
        super(1);
        this.$canceller = cancellationSignal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$canceller.cancel();
        return AnonymousClass0AJ.A00;
    }
}
