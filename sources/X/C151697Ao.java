package X;

import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository", f = "FlowsWebViewDataRepository.kt", i = {0, 0, 0}, l = {433}, m = "fetchFlowsBusinessPublicKeyUsingMetadataGraphQl", n = {"this", "bizJid", "instanceKey"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: X.7Ao  reason: invalid class name and case insensitive filesystem */
public final class C151697Ao extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151697Ao(FlowsWebViewDataRepository flowsWebViewDataRepository, C023509x r2) {
        super(r2);
        this.this$0 = flowsWebViewDataRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowsWebViewDataRepository.A02(this.this$0, (UserJid) null, this);
    }
}
