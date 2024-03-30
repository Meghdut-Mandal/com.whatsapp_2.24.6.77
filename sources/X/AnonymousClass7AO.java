package X;

import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker", f = "XmppLifecycleWorker.kt", i = {0}, l = {57}, m = "doWork", n = {"this"}, s = {"L$0"})
/* renamed from: X.7AO  reason: invalid class name */
public final class AnonymousClass7AO extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AO(XmppLifecycleWorker xmppLifecycleWorker, C023509x r2) {
        super(r2);
        this.this$0 = xmppLifecycleWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A08(this);
    }
}
