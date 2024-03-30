package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.7Tf  reason: invalid class name and case insensitive filesystem */
public final class C154707Tf extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $beforeFrame;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154707Tf(UpdatableAnimationState updatableAnimationState, C006302t r3) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$beforeFrame = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).longValue();
        UpdatableAnimationState updatableAnimationState = this.this$0;
        float f = updatableAnimationState.A00;
        updatableAnimationState.A00 = 0.0f;
        this.$beforeFrame.invoke(Float.valueOf(f));
        return AnonymousClass0AJ.A00;
    }
}
