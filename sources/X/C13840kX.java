package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
/* renamed from: X.0kX  reason: invalid class name and case insensitive filesystem */
public final class C13840kX extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C12970ix this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13840kX(C023509x r1, C12970ix r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B36(this, (AnonymousClass05G) null);
    }
}
