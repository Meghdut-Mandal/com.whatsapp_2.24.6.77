package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lC  reason: invalid class name and case insensitive filesystem */
public final class C14170lC extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05G $collector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C15410nI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14170lC(C023509x r2, AnonymousClass05G r3, C15410nI r4) {
        super(2, r2);
        this.this$0 = r4;
        this.$collector = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        C14170lC r0 = new C14170lC(r5, this.$collector, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C10810fG r4 = new C10810fG();
            C15410nI r3 = this.this$0;
            AnonymousClass05H r2 = r3.A00;
            C13060j6 r0 = new C13060j6(r4, (AnonymousClass040) this.L$0, this.$collector, r3);
            this.label = 1;
            if (r2.B36(this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14170lC) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
