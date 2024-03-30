package X;

import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher", f = "DelayedStanzasFetcher.kt", i = {0}, l = {133}, m = "sendPullIqAndWaitForResult", n = {"this"}, s = {"L$0"})
/* renamed from: X.7AN  reason: invalid class name */
public final class AnonymousClass7AN extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DelayedStanzasFetcher$StanzaFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AN(DelayedStanzasFetcher$StanzaFetcher delayedStanzasFetcher$StanzaFetcher, C023509x r2) {
        super(r2);
        this.this$0 = delayedStanzasFetcher$StanzaFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
