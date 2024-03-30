package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass7TZ;
import X.AnonymousClass7YB;
import X.AnonymousClass7dW;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C10780fD;
import X.C114135gh;
import X.C129076Ev;
import X.C136286e8;
import X.C136386eJ;
import X.C137126fd;
import X.C156857b4;
import X.C157507de;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollExtensionsKt$animateScrollBy$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass7dW $animationSpec;
    public final /* synthetic */ C10780fD $previousValue;
    public final /* synthetic */ float $value;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(AnonymousClass7dW r2, C023509x r3, C10780fD r4, float f) {
        super(2, r3);
        this.$value = f;
        this.$animationSpec = r2;
        this.$previousValue = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$animationSpec, r6, this.$previousValue, this.$value);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r1 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            float f = this.$value;
            AnonymousClass7dW r15 = this.$animationSpec;
            AnonymousClass7YB r3 = new AnonymousClass7YB((C157507de) this.L$0, this.$previousValue);
            this.label = 1;
            C156857b4 r7 = C114135gh.A02;
            Float f2 = new Float(0.0f);
            Float f3 = new Float(f);
            Float f4 = new Float(0.0f);
            C006302t r0 = ((C136386eJ) r7).A01;
            C129076Ev r6 = (C129076Ev) r0.invoke(f4);
            if (r6 == null) {
                r6 = C129076Ev.A00((C129076Ev) r0.invoke(f2));
            }
            C136286e8 r14 = new C136286e8(r15, r6, r7, f2, f3);
            C137126fd r5 = new C137126fd(r6, r7, f2, Long.MIN_VALUE, Long.MIN_VALUE, false);
            AnonymousClass7TZ r02 = new AnonymousClass7TZ(r7, r3);
            if (SuspendAnimationKt.A01(r14, r5, this, r02, Long.MIN_VALUE) == r1) {
                return r1;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollExtensionsKt$animateScrollBy$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
