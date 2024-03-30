package X;

import android.view.Choreographer;

/* renamed from: X.7Tt  reason: invalid class name and case insensitive filesystem */
public final class C154847Tt extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ C156727aR $uiDispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154847Tt(Choreographer.FrameCallback frameCallback, C156727aR r3) {
        super(1);
        this.$uiDispatcher = r3;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C156727aR r0 = this.$uiDispatcher;
        Choreographer.FrameCallback frameCallback = this.$callback;
        synchronized (r0.A08) {
            r0.A01.remove(frameCallback);
        }
        return AnonymousClass0AJ.A00;
    }
}
