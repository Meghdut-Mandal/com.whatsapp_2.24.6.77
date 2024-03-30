package X;

import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.mediastream.client.processor.OutgoingMessageProcessor;
import java.io.BufferedInputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Ag7  reason: case insensitive filesystem */
public final class C22060Ag7 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22060Ag7(AnonymousClass8AH r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22060Ag7.super.A07();
        AnonymousClass8AH r5 = this.this$0;
        AnonymousClass9Y3 r4 = r5.A00.A01;
        B2N b2n = r4.A04;
        if (b2n != null) {
            AnonymousClass00S r3 = r4.A0F;
            if (r3 == null) {
                r3 = C22267AjU.A00;
            }
            r4.A0F = r3;
            OutgoingMessageProcessor outgoingMessageProcessor = new OutgoingMessageProcessor(b2n);
            AnonymousClass951 r0 = Connection.Companion;
            r4.A01 = new Connection((C009003v) new C22550Aoa(outgoingMessageProcessor, r5));
            r4.A05 = new AnonymousClass9SV(new BufferedInputStream(b2n.BCl()), (ExecutorService) r3.invoke(), new C22063AgA(r5), new C22463An2(r4, r5));
            Connection connection = r4.A01;
            if (connection != null) {
                C23090B4a b4a = r5.A00.A0H;
                if (b4a != null) {
                    b4a.BPK("media_stream_service_connection_request");
                }
                LocalChannel localChannel = new LocalChannel(connection, 51349);
                localChannel.onReceived = new C22319Akh(r5);
                localChannel.onClosed = new C22064AgB(r5);
                localChannel.onError = new C22320Aki(r5);
                r4.A03 = localChannel;
            }
        }
        C23090B4a b4a2 = this.this$0.A00.A0H;
        if (b4a2 != null) {
            b4a2.BPK("media_stream_service_connected");
        }
        AnonymousClass84B r32 = this.this$0.A00;
        AnonymousClass81Q.A01(r32.A0A, r32, AnonymousClass84B.A0S, 5);
        return AnonymousClass0AJ.A00;
    }
}
