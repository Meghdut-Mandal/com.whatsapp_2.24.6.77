package androidx.compose.foundation.interaction;

import X.AnonymousClass000;
import X.AnonymousClass001;
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
import X.C161547n5;
import X.C164247rV;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class PressInteractionKt$collectIsPressedAsState$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C161547n5 $isPressed;
    public final /* synthetic */ C156897b8 $this_collectIsPressedAsState;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(C156897b8 r2, C161547n5 r3, C023509x r4) {
        super(2, r4);
        this.$this_collectIsPressedAsState = r2;
        this.$isPressed = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.$this_collectIsPressedAsState, this.$isPressed, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass05J r3 = ((C136726et) this.$this_collectIsPressedAsState).A00;
            C164247rV r0 = new C164247rV(this.$isPressed, (List) A0I, 2);
            this.label = 1;
            if (r3.B36(this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
