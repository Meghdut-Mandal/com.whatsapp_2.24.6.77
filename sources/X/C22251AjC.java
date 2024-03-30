package X;

import com.facebook.wearable.datax.Connection;
import java.nio.ByteBuffer;

/* renamed from: X.AjC  reason: case insensitive filesystem */
public final class C22251AjC extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ByteBuffer $byteBuffer;
    public final /* synthetic */ AnonymousClass9Y3 $lifecycleState;
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22251AjC(AnonymousClass9Y3 r2, AnonymousClass8AH r3, ByteBuffer byteBuffer) {
        super(0);
        this.this$0 = r3;
        this.$lifecycleState = r2;
        this.$byteBuffer = byteBuffer;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9AO.A01.A03("sup:MediaStreamServiceTcpStateDelegate", "[MEDIA_STREAM_SERVICE]: on Received");
        Connection connection = this.$lifecycleState.A01;
        if (connection != null) {
            connection.onReceivedWithInterrupt(this.$byteBuffer);
        }
        return AnonymousClass0AJ.A00;
    }
}
