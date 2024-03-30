package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0l6  reason: invalid class name */
public final class AnonymousClass0l6 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C13030j3 $collector;
    public final /* synthetic */ AnonymousClass05H $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0l6(C023509x r2, AnonymousClass05H r3, C13030j3 r4) {
        super(2, r2);
        this.$flow = r3;
        this.$collector = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AnonymousClass0l6(r5, this.$flow, this.$collector);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H r1 = this.$flow;
            C13030j3 r0 = this.$collector;
            this.label = 1;
            if (r1.B36(this, r0) == r3) {
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
        return ((AnonymousClass0l6) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
