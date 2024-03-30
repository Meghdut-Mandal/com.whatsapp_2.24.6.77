package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.7UV  reason: invalid class name */
public final class AnonymousClass7UV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $beforeFrame;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UV(UpdatableAnimationState updatableAnimationState, C006302t r3, float f) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long round;
        long A09 = C36431kI.A09(obj);
        UpdatableAnimationState updatableAnimationState = this.this$0;
        long j = updatableAnimationState.A01;
        if (j == Long.MIN_VALUE) {
            updatableAnimationState.A01 = A09;
            j = A09;
        }
        float f = updatableAnimationState.A00;
        C93304gL r9 = new C93304gL(f);
        float f2 = this.$durationScale;
        if (f2 == 0.0f) {
            round = updatableAnimationState.A04.BBJ(new C93304gL(f), UpdatableAnimationState.A05, updatableAnimationState.A02);
        } else {
            double d = (double) (((float) (A09 - j)) / f2);
            if (!Double.isNaN(d)) {
                round = Math.round(d);
            } else {
                throw AnonymousClass001.A08("Cannot round NaN value.");
            }
        }
        UpdatableAnimationState updatableAnimationState2 = this.this$0;
        C160547lB r8 = updatableAnimationState2.A04;
        C93304gL r10 = UpdatableAnimationState.A05;
        float f3 = ((C93304gL) r8.BIr(r9, r10, updatableAnimationState2.A02, round)).A00;
        UpdatableAnimationState updatableAnimationState3 = this.this$0;
        updatableAnimationState3.A02 = (C93304gL) updatableAnimationState3.A04.BIv(r9, r10, updatableAnimationState3.A02, round);
        UpdatableAnimationState updatableAnimationState4 = this.this$0;
        updatableAnimationState4.A01 = A09;
        updatableAnimationState4.A00 = f3;
        this.$beforeFrame.invoke(Float.valueOf(updatableAnimationState4.A00 - f3));
        return AnonymousClass0AJ.A00;
    }
}
