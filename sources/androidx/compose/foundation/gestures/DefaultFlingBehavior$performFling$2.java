package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C10780fD;
import X.C114135gh;
import X.C136276e7;
import X.C136386eJ;
import X.C136566ec;
import X.C137126fd;
import X.C155137Ux;
import X.C156837b2;
import X.C157507de;
import X.C36441kJ;
import X.C93304gL;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {965}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
public final class DefaultFlingBehavior$performFling$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ float $initialVelocity;
    public final /* synthetic */ C157507de $this_performFling;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C136566ec this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(C136566ec r2, C157507de r3, C023509x r4, float f) {
        super(2, r4);
        this.$initialVelocity = f;
        this.this$0 = r2;
        this.$this_performFling = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new DefaultFlingBehavior$performFling$2(this.this$0, this.$this_performFling, r6, this.$initialVelocity);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        C10780fD r1;
        C137126fd r9;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            f = this.$initialVelocity;
            if (Math.abs(f) > 1.0f) {
                r1 = new C10780fD();
                r1.element = f;
                C10780fD r4 = new C10780fD();
                r9 = new C137126fd(new C93304gL(f), C114135gh.A02, Float.valueOf(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                C136566ec r8 = this.this$0;
                C156837b2 r7 = r8.A01;
                C155137Ux r6 = new C155137Ux(r8, this.$this_performFling, r4, r1);
                this.L$0 = r1;
                this.L$1 = r9;
                this.label = 1;
                Object A01 = SuspendAnimationKt.A01(new C136276e7(r9.A02, r7, r9.A04, r9.A05.getValue()), r9, this, r6, Long.MIN_VALUE);
                if (A01 != r2) {
                    A01 = AnonymousClass0AJ.A00;
                }
                if (A01 == r2) {
                    return r2;
                }
            }
            return new Float(f);
        } else if (i == 1) {
            r9 = (C137126fd) this.L$1;
            r1 = (C10780fD) this.L$0;
            try {
                AnonymousClass0AN.A00(obj);
            } catch (CancellationException unused) {
                r1.element = C36441kJ.A03(((C136386eJ) r9.A04).A00.invoke(r9.A02));
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        f = r1.element;
        return new Float(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
