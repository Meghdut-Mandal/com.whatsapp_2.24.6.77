package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass01M;
import X.AnonymousClass01P;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C33331f7;
import X.C36401kF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScope$launchWhenStarted$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public int label;
    public final /* synthetic */ C33331f7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenStarted$1(C33331f7 r2, C023509x r3, C009003v r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$block = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.this$0, r5, this.$block);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass01M r5 = ((LifecycleCoroutineScopeImpl) this.this$0).A00;
            C009003v r4 = this.$block;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, C36401kF.A0y(), new PausingDispatcherKt$whenStateAtLeast$2(AnonymousClass01P.STARTED, r5, (C023509x) null, r4)) == r6) {
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
        return ((LifecycleCoroutineScope$launchWhenStarted$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
