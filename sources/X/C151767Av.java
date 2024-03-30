package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {119}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* renamed from: X.7Av  reason: invalid class name and case insensitive filesystem */
public final class C151767Av extends AnonymousClass0A0 {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151767Av(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, C023509x r2) {
        super(r2);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B1x((AnonymousClass6QC) null, this);
    }
}
