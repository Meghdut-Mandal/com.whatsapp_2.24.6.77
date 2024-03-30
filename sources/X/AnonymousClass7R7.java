package X;

import android.view.Choreographer;

/* renamed from: X.7R7  reason: invalid class name */
public final class AnonymousClass7R7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Choreographer.FrameCallback $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7R7(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C136956fL.A00.removeFrameCallback(this.$callback);
        return AnonymousClass0AJ.A00;
    }
}
