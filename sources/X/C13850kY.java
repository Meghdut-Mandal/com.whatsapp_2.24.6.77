package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {334}, m = "collectTo", n = {"scope"}, s = {"L$0"})
/* renamed from: X.0kY  reason: invalid class name and case insensitive filesystem */
public final class C13850kY extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C15390nG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13850kY(C023509x r1, C15390nG r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this, (C18000sQ) null);
    }
}
