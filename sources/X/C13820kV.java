package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {32, 33}, m = "emit", n = {}, s = {})
/* renamed from: X.0kV  reason: invalid class name and case insensitive filesystem */
public final class C13820kV extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C13040j4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13820kV(C023509x r1, C13040j4 r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B6N((Object) null, this);
    }
}
