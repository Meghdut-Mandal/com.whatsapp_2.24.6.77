package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.7VM  reason: invalid class name */
public final class AnonymousClass7VM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160687lQ $animation;
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ C10810fG $lateInitScope;
    public final /* synthetic */ C137126fd $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VM(C160687lQ r2, C137126fd r3, C006302t r4, C10810fG r5, float f) {
        super(1);
        this.$lateInitScope = r5;
        this.$durationScale = f;
        this.$animation = r2;
        this.$this_animate = r3;
        this.$block = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A09 = C36431kI.A09(obj);
        Object obj2 = this.$lateInitScope.element;
        AnonymousClass00C.A0B(obj2);
        float f = this.$durationScale;
        SuspendAnimationKt.A02(this.$animation, (C124485yG) obj2, this.$this_animate, this.$block, f, A09);
        return AnonymousClass0AJ.A00;
    }
}
