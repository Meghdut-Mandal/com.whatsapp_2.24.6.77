package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass7dW;
import X.C009003v;
import X.C023509x;
import X.C122015uA;
import X.C132336Td;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {})
public final class StateLayer$handleInteraction$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass7dW $outgoingAnimationSpec;
    public int label;
    public final /* synthetic */ C122015uA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$2(AnonymousClass7dW r2, C122015uA r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$outgoingAnimationSpec = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StateLayer$handleInteraction$2(this.$outgoingAnimationSpec, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C132336Td r3 = this.this$0.A01;
            Float f = new Float(0.0f);
            AnonymousClass7dW r1 = this.$outgoingAnimationSpec;
            this.label = 1;
            if (r3.A03(r1, f, r3.A02(), this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StateLayer$handleInteraction$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
