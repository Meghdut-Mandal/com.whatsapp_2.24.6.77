package X;

import com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor", f = "OutgoingMessageProcessor.kt", i = {0, 0, 0}, l = {38}, m = "sendMessage", n = {"this", "message", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.AdI  reason: case insensitive filesystem */
public final class C21939AdI extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OutgoingMessageProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21939AdI(OutgoingMessageProcessor outgoingMessageProcessor, C023509x r2) {
        super(r2);
        this.this$0 = outgoingMessageProcessor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((ByteBuffer) null, this);
    }
}
