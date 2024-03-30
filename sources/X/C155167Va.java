package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.7Va  reason: invalid class name and case insensitive filesystem */
public final class C155167Va extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160687lQ $animation;
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ float $durationScale;
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ C129076Ev $initialVelocityVector;
    public final /* synthetic */ C10810fG $lateInitScope;
    public final /* synthetic */ C137126fd $this_animate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155167Va(C160687lQ r2, C137126fd r3, C129076Ev r4, Object obj, C006302t r6, C10810fG r7, float f) {
        super(1);
        this.$lateInitScope = r7;
        this.$initialValue = obj;
        this.$animation = r2;
        this.$initialVelocityVector = r4;
        this.$this_animate = r3;
        this.$durationScale = f;
        this.$block = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A09 = C36431kI.A09(obj);
        C10810fG r1 = this.$lateInitScope;
        Object obj2 = this.$initialValue;
        C160687lQ r0 = this.$animation;
        C124485yG r3 = new C124485yG(this.$initialVelocityVector, r0.BIe(), obj2, r0.BID(), new AnonymousClass7IX(this.$this_animate), A09, A09);
        C124485yG r12 = r3;
        SuspendAnimationKt.A02(this.$animation, r12, this.$this_animate, this.$block, this.$durationScale, A09);
        r1.element = r3;
        return AnonymousClass0AJ.A00;
    }
}
