package X;

import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker", f = "XmppLifecycleWorker.kt", i = {0, 0, 0, 0, 0}, l = {103}, m = "waitUntilProcessingIsDone", n = {"this", "wasProcessingAtTheStart", "checkProgressSeconds", "startTime", "counter"}, s = {"L$0", "Z$0", "J$0", "J$1", "I$0"})
/* renamed from: X.7B6  reason: invalid class name */
public final class AnonymousClass7B6 extends AnonymousClass0A0 {
    public int I$0;
    public long J$0;
    public long J$1;
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7B6(XmppLifecycleWorker xmppLifecycleWorker, C023509x r2) {
        super(r2);
        this.this$0 = xmppLifecycleWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return XmppLifecycleWorker.A00(this.this$0, this);
    }
}
