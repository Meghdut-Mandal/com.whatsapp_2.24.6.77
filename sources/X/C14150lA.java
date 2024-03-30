package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lA  reason: invalid class name and case insensitive filesystem */
public final class C14150lA extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass05G $collector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C13130jD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14150lA(C023509x r2, AnonymousClass05G r3, C13130jD r4) {
        super(2, r2);
        this.$collector = r3;
        this.this$0 = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        C14150lA r0 = new C14150lA(r5, this.$collector, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r1 = this.$collector;
            C17330r7 A02 = this.this$0.A02((AnonymousClass040) this.L$0);
            this.label = 1;
            if (C06810Ve.A00(this, A02, r1, true) == r4) {
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
        return ((C14150lA) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
