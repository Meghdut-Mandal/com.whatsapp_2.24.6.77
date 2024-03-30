package X;

import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {35}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
/* renamed from: X.7AW  reason: invalid class name */
public final class AnonymousClass7AW extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AW(AwaitFirstLayoutModifier awaitFirstLayoutModifier, C023509x r2) {
        super(r2);
        this.this$0 = awaitFirstLayoutModifier;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
