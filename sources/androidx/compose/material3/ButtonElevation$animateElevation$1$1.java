package androidx.compose.material3;

import X.AYG;
import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C136726et;
import X.C156897b8;
import X.C164237rU;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", i = {}, l = {815}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C156897b8 $interactionSource;
    public final /* synthetic */ AYG $interactions;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$1$1(C156897b8 r2, AYG ayg, C023509x r4) {
        super(2, r4);
        this.$interactionSource = r2;
        this.$interactions = ayg;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ButtonElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05J r3 = ((C136726et) this.$interactionSource).A00;
            C164237rU r0 = new C164237rU(this.$interactions, 0);
            this.label = 1;
            if (r3.B36(this, r0) == r5) {
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
        return ((ButtonElevation$animateElevation$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
