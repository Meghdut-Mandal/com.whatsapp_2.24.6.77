package X;

import com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor;
import com.facebook.wearable.mediastream.client.state.MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1;
import java.nio.ByteBuffer;

/* renamed from: X.Aoa  reason: case insensitive filesystem */
public final class C22550Aoa extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ OutgoingMessageProcessor $outgoingMessageProcessor;
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22550Aoa(OutgoingMessageProcessor outgoingMessageProcessor, AnonymousClass8AH r3) {
        super(2);
        this.this$0 = r3;
        this.$outgoingMessageProcessor = outgoingMessageProcessor;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ByteBuffer byteBuffer2 = (ByteBuffer) obj2;
        C36331k8.A1I(byteBuffer, byteBuffer2);
        try {
            AnonymousClass9AO.A01.A01("sup:MediaStreamServiceTcpStateDelegate", "[MEDIA_STREAM_SERVICE]: sending message to mediastream");
            C05700Qs.A00(C008903u.A00, new MediaStreamServiceTcpStateDelegate$setupMessageProcessors$1$1$1(this.$outgoingMessageProcessor, this.this$0, byteBuffer, byteBuffer2, (C023509x) null));
            return AnonymousClass6P8.A06;
        } catch (Throwable th) {
            AnonymousClass9AO.A01.A05("sup:MediaStreamServiceTcpStateDelegate", "[MEDIA_STREAM_SERVICE]: Failed to write data into connection", th);
            this.this$0.A00.A08(new C1695289r("MEDIA_STREAM_SERVICE_MSG_SEND_FAIL"), th, false);
            return AnonymousClass6P8.A05;
        }
    }
}
