package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C136706er;
import X.C93514gg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class CommonRippleIndicationInstance$addRipple$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C136706er $interaction;
    public final /* synthetic */ RippleAnimation $rippleAnimation;
    public int label;
    public final /* synthetic */ C93514gg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(C136706er r2, C93514gg r3, RippleAnimation rippleAnimation, C023509x r5) {
        super(2, r5);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = r3;
        this.$interaction = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        RippleAnimation rippleAnimation = this.$rippleAnimation;
        return new CommonRippleIndicationInstance$addRipple$2(this.$interaction, this.this$0, rippleAnimation, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            RippleAnimation rippleAnimation = this.$rippleAnimation;
            this.label = 1;
            if (rippleAnimation.A00(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Throwable th) {
                this.this$0.A01.remove(this.$interaction);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        this.this$0.A01.remove(this.$interaction);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonRippleIndicationInstance$addRipple$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
