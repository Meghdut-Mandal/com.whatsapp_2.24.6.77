package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {77}, m = "emit", n = {}, s = {})
/* renamed from: X.0kN  reason: invalid class name and case insensitive filesystem */
public final class C13740kN extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C18490tF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13740kN(C18490tF r1, C023509x r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B6N((Object) null, this);
    }
}
