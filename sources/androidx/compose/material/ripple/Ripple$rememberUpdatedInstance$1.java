package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C136496eU;
import X.C136726et;
import X.C156897b8;
import X.C164247rV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
public final class Ripple$rememberUpdatedInstance$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C136496eU $instance;
    public final /* synthetic */ C156897b8 $interactionSource;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(C156897b8 r2, C136496eU r3, C023509x r4) {
        super(2, r4);
        this.$interactionSource = r2;
        this.$instance = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, r5);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            AnonymousClass05J r3 = ((C136726et) this.$interactionSource).A00;
            C164247rV r0 = new C164247rV(obj2, (Object) this.$instance, 3);
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
        return ((Ripple$rememberUpdatedInstance$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
