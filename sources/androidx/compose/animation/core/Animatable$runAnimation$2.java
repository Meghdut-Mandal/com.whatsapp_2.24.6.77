package androidx.compose.animation.core;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass61P;
import X.C006302t;
import X.C023109s;
import X.C023509x;
import X.C10770fC;
import X.C108975Vs;
import X.C129076Ev;
import X.C132336Td;
import X.C136386eJ;
import X.C137126fd;
import X.C155117Uv;
import X.C160687lQ;
import X.C90474aD;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {312}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
public final class Animatable$runAnimation$2 extends AnonymousClass0A1 implements C006302t {
    public final /* synthetic */ C160687lQ $animation;
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ Object $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C132336Td this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(C132336Td r2, C160687lQ r3, Object obj, C023509x r5, C006302t r6, long j) {
        super(1, r5);
        this.this$0 = r2;
        this.$initialVelocity = obj;
        this.$animation = r3;
        this.$startTime = j;
        this.$block = r6;
    }

    public final C023509x create(C023509x r9) {
        C132336Td r1 = this.this$0;
        Object obj = this.$initialVelocity;
        return new Animatable$runAnimation$2(r1, this.$animation, obj, r9, this.$block, this.$startTime);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C137126fd r9;
        C10770fC r8;
        Integer num;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C132336Td r0 = this.this$0;
                r0.A02.A02 = (C129076Ev) ((C136386eJ) r0.A04).A01.invoke(this.$initialVelocity);
                C132336Td r3 = this.this$0;
                r3.A06.setValue(this.$animation.BID());
                C90474aD.A11(this.this$0.A05, true);
                C137126fd r1 = this.this$0.A02;
                Object value = r1.A05.getValue();
                r9 = new C137126fd(C108975Vs.A00(r1.A02), r1.A04, value, r1.A01, Long.MIN_VALUE, r1.A03);
                r8 = new C10770fC();
                C160687lQ r10 = this.$animation;
                long j = this.$startTime;
                C155117Uv r02 = new C155117Uv(this.this$0, r9, this.$block, r8);
                this.L$0 = r9;
                this.L$1 = r8;
                this.label = 1;
                if (SuspendAnimationKt.A01(r10, r9, this, r02, j) == r5) {
                    return r5;
                }
            } catch (CancellationException e) {
                C132336Td.A01(this.this$0);
                throw e;
            }
        } else if (i == 1) {
            r8 = (C10770fC) this.L$1;
            r9 = (C137126fd) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (r8.element) {
            num = C023109s.A00;
        } else {
            num = C023109s.A01;
        }
        C132336Td.A01(this.this$0);
        return new AnonymousClass61P(r9, num);
    }
}
