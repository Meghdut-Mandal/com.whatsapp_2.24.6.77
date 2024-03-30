package X;

import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager", f = "XmppConnectionMetricsWorkManager.kt", i = {}, l = {208}, m = "getFirstWorkInfoForUniqueWorkOrNull", n = {}, s = {})
/* renamed from: X.79s  reason: invalid class name and case insensitive filesystem */
public final class C1514879s extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1514879s(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, C023509x r2) {
        super(r2);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return XmppConnectionMetricsWorkManager.A00((AnonymousClass6VR) null, this.this$0, (String) null, this);
    }
}
