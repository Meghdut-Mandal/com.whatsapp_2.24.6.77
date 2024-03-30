package androidx.compose.material3;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5RS;
import X.AnonymousClass72X;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C132336Td;
import androidx.compose.animation.core.Animatable$snapTo$2;
import androidx.compose.animation.core.MutatorMutex$mutate$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2", f = "Button.kt", i = {}, l = {860}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C132336Td $animatable;
    public final /* synthetic */ float $target;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2(C132336Td r2, C023509x r3, float f) {
        super(2, r3);
        this.$animatable = r2;
        this.$target = f;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ButtonElevation$animateElevation$2(this.$animatable, r5, this.$target);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C132336Td r2 = this.$animatable;
            AnonymousClass72X r1 = new AnonymousClass72X(this.$target);
            this.label = 1;
            if (C009403z.A00(this, new MutatorMutex$mutate$2(AnonymousClass5RS.Default, r2.A03, (C023509x) null, new Animatable$snapTo$2(r2, r1, (C023509x) null))) == r5) {
                return r5;
            }
            AnonymousClass0AJ r0 = AnonymousClass0AJ.A00;
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ButtonElevation$animateElevation$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
