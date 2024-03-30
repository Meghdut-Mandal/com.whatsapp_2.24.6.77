package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01M;
import X.AnonymousClass01P;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4NY;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C61893Dx;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {162}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
public final class PausingDispatcherKt$whenStateAtLeast$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public final /* synthetic */ AnonymousClass01P $minState;
    public final /* synthetic */ AnonymousClass01M $this_whenStateAtLeast;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(AnonymousClass01P r2, AnonymousClass01M r3, C023509x r4, C009003v r5) {
        super(2, r4);
        this.$this_whenStateAtLeast = r3;
        this.$minState = r2;
        this.$block = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$minState, this.$this_whenStateAtLeast, r6, this.$block);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invokeSuspend(Object obj) {
        C61893Dx r5;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C007403e r4 = (C007403e) ((AnonymousClass040) this.L$0).BAE().get(C007403e.A00);
            if (r4 != null) {
                AnonymousClass4NY r3 = new AnonymousClass4NY();
                AnonymousClass01M r2 = this.$this_whenStateAtLeast;
                r5 = new C61893Dx(r3.A00, this.$minState, r2, r4);
                C009003v r0 = this.$block;
                this.L$0 = r5;
                this.label = 1;
                obj = AnonymousClass0A2.A00(this, r3, r0);
                if (obj == r7) {
                    return r7;
                }
            } else {
                throw AnonymousClass001.A09("when[State] methods should have a parent job");
            }
        } else if (i == 1) {
            r5 = (C61893Dx) this.L$0;
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Throwable th) {
                r5.A00();
                throw th;
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        r5.A00();
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
