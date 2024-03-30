package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.7Uv  reason: invalid class name and case insensitive filesystem */
public final class C155117Uv extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ C10770fC $clampingNeeded;
    public final /* synthetic */ C137126fd $endState;
    public final /* synthetic */ C132336Td this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155117Uv(C132336Td r2, C137126fd r3, C006302t r4, C10770fC r5) {
        super(1);
        this.this$0 = r2;
        this.$endState = r3;
        this.$block = r4;
        this.$clampingNeeded = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C124485yG r4 = (C124485yG) obj;
        SuspendAnimationKt.A03(r4, this.this$0.A02);
        C132336Td r1 = this.this$0;
        C161547n5 r2 = r4.A06;
        Object A00 = C132336Td.A00(r1, r2.getValue());
        if (!AnonymousClass00C.A0J(A00, r2.getValue())) {
            this.this$0.A02.A05.setValue(A00);
            this.$endState.A05.setValue(A00);
            C006302t r12 = this.$block;
            if (r12 != null) {
                r12.invoke(this.this$0);
            }
            C90474aD.A11(r4.A05, false);
            r4.A07.invoke();
            this.$clampingNeeded.element = true;
        } else {
            C006302t r13 = this.$block;
            if (r13 != null) {
                r13.invoke(this.this$0);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
