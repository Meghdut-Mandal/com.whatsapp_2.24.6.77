package X;

import com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.factory.impl.FlowsGetPublicKey", f = "FlowsGetPublicKey.kt", i = {0, 0}, l = {19}, m = "execute", n = {"this", "data"}, s = {"L$0", "L$2"})
/* renamed from: X.7Ap  reason: invalid class name and case insensitive filesystem */
public final class C151707Ap extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsGetPublicKey this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151707Ap(FlowsGetPublicKey flowsGetPublicKey, C023509x r2) {
        super(r2);
        this.this$0 = flowsGetPublicKey;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
