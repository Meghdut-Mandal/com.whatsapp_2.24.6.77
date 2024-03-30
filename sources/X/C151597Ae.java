package X;

import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository", f = "FlowsWebViewDataRepository.kt", i = {0, 0}, l = {323}, m = "addPublicKeyAfterVersionCheck", n = {"this", "flowDataResponse"}, s = {"L$0", "L$1"})
/* renamed from: X.7Ae  reason: invalid class name and case insensitive filesystem */
public final class C151597Ae extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151597Ae(FlowsWebViewDataRepository flowsWebViewDataRepository, C023509x r2) {
        super(r2);
        this.this$0 = flowsWebViewDataRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowsWebViewDataRepository.A01((C128716Di) null, (C121585tN) null, this.this$0, (UserJid) null, (String) null, this, (JSONObject) null);
    }
}
