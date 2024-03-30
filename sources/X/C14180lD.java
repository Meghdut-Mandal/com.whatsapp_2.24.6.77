package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lD  reason: invalid class name and case insensitive filesystem */
public final class C14180lD extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C019408g $block;
    public final /* synthetic */ AnonymousClass05G $this_unsafeFlow;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14180lD(C023509x r2, C019408g r3, AnonymousClass05G r4) {
        super(2, r2);
        this.$block = r3;
        this.$this_unsafeFlow = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        C14180lD r0 = new C14180lD(r5, this.$block, this.$this_unsafeFlow);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            C019408g r1 = this.$block;
            AnonymousClass05G r0 = this.$this_unsafeFlow;
            this.label = 1;
            if (r1.BKt(obj2, r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14180lD) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
