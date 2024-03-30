package X;

import android.view.Choreographer;

/* renamed from: X.7Tu  reason: invalid class name and case insensitive filesystem */
public final class C154857Tu extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ C136936fJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154857Tu(Choreographer.FrameCallback frameCallback, C136936fJ r3) {
        super(1);
        this.this$0 = r3;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00.removeFrameCallback(this.$callback);
        return AnonymousClass0AJ.A00;
    }
}
