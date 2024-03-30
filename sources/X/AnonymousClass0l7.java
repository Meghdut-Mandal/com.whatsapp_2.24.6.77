package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l7  reason: invalid class name */
public final class AnonymousClass0l7 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05G $downstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0l7(C023509x r2, AnonymousClass05G r3) {
        super(2, r2);
        this.$downstream = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AnonymousClass0l7 r0 = new AnonymousClass0l7(r4, this.$downstream);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            Object obj2 = this.L$0;
            AnonymousClass05G r0 = this.$downstream;
            this.label = 1;
            if (r0.B6N(obj2, this) == r3) {
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
        return ((AnonymousClass0l7) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
