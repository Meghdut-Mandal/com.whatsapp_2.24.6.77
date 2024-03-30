package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.xmpp.RtaXmppClient", f = "RtaXmppClient.kt", i = {0}, l = {50}, m = "reportMessageToAdmin", n = {"request"}, s = {"L$0"})
/* renamed from: X.3z2  reason: invalid class name and case insensitive filesystem */
public final class C82643z2 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RtaXmppClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82643z2(RtaXmppClient rtaXmppClient, C023509x r2) {
        super(r2);
        this.this$0 = rtaXmppClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((AnonymousClass147) null, (UserJid) null, (String) null, this);
    }
}
