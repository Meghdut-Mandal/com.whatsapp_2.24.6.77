package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lB  reason: invalid class name and case insensitive filesystem */
public final class C14160lB extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05G $collector;
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ C15410nI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14160lB(Object obj, C023509x r3, AnonymousClass05G r4, C15410nI r5) {
        super(2, r3);
        this.this$0 = r5;
        this.$collector = r4;
        this.$value = obj;
    }

    public final C023509x create(Object obj, C023509x r6) {
        C15410nI r3 = this.this$0;
        return new C14160lB(this.$value, r6, this.$collector, r3);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C019408g r2 = this.this$0.A00;
            AnonymousClass05G r1 = this.$collector;
            Object obj2 = this.$value;
            this.label = 1;
            if (r2.BKt(r1, obj2, this) == r4) {
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
        return ((C14160lB) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
