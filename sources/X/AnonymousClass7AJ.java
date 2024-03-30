package X;

import com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.factory.impl.FlowsComplete", f = "FlowsComplete.kt", i = {0}, l = {29}, m = "execute", n = {"this"}, s = {"L$0"})
/* renamed from: X.7AJ  reason: invalid class name */
public final class AnonymousClass7AJ extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsComplete this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AJ(FlowsComplete flowsComplete, C023509x r2) {
        super(r2);
        this.this$0 = flowsComplete;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
