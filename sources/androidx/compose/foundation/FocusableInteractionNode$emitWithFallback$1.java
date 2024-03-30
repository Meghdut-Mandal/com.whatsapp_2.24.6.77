package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C136726et;
import X.C15680no;
import X.C161437mu;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
public final class FocusableInteractionNode$emitWithFallback$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C15680no $interaction;
    public final /* synthetic */ C161437mu $this_emitWithFallback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableInteractionNode$emitWithFallback$1(C15680no r2, C161437mu r3, C023509x r4) {
        super(2, r4);
        this.$this_emitWithFallback = r3;
        this.$interaction = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FocusableInteractionNode$emitWithFallback$1(this.$interaction, this.$this_emitWithFallback, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C161437mu r0 = this.$this_emitWithFallback;
            C15680no r1 = this.$interaction;
            this.label = 1;
            if (AnonymousClass0AO.A00(((C136726et) r0).A00.B6N(r1, this)) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FocusableInteractionNode$emitWithFallback$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
