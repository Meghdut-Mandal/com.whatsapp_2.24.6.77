package X;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Aio  reason: case insensitive filesystem */
public final class C22227Aio extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C197549bt $buffer;
    public final /* synthetic */ AnonymousClass8AF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22227Aio(C197549bt r2, AnonymousClass8AF r3) {
        super(0);
        this.this$0 = r3;
        this.$buffer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        byte[] bArr;
        String str;
        C200159gk r6 = AnonymousClass9AO.A01;
        r6.A01("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER]: snAppManagerChannel.onReceived");
        ByteBuffer byteBuffer = this.$buffer.A00;
        if (byteBuffer != null) {
            AnonymousClass8AF r2 = this.this$0;
            AnonymousClass8NN A0p = AnonymousClass8SI.DEFAULT_INSTANCE.A0p();
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                AnonymousClass00C.A08(bArr);
            } else {
                int position = byteBuffer.position();
                bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(position);
            }
            A0p.A0P(bArr);
            AnonymousClass8SI r4 = (AnonymousClass8SI) A0p.A0R();
            if (r2.A02.get()) {
                r6.A01("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER]: snAppManagerChannel, handle stop requested");
                CompletableFuture A01 = r2.A01.A01.A01();
                if (A01 != null) {
                    A01.complete(r4.A0u().name());
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("[SN_APP_MANAGER] response: ");
            r6.A01("sup:LiveStreamAppStateDelegate", AnonymousClass000.A0q(r4.A0u().name(), A0u));
            switch (r4.A0u().ordinal()) {
                case 0:
                    str = "SNAPP_UNKNOWN_ERROR";
                    break;
                case 1:
                case 12:
                    AnonymousClass8AF.A02(r2);
                    break;
                case 2:
                    str = "SNAPP_UNKNOWN_MESSAGE";
                    break;
                case 3:
                    str = "SNAPP_UNHANDLED_MESSAGE";
                    break;
                case 4:
                    str = "SNAPP_PAYLOAD_CORRUPTED";
                    break;
                case 5:
                    str = "SNAPP_UNSUPPORTED_APP";
                    break;
                case 6:
                    str = "SNAPP_NOT_ENOUGH_BATTERY";
                    break;
                case 7:
                    str = "SNAPP_THERMAL_THROTTLING";
                    break;
                case 8:
                    str = "SNAPP_NOT_ENOUGH_STORAGE";
                    break;
                case 9:
                    str = "SNAPP_START_APP_FAILED";
                    break;
                case 10:
                    str = "SNAPP_STOP_APP_FAILED";
                    break;
                case 11:
                    str = "SNAPP_APP_NOT_RUNNING";
                    break;
                case 13:
                    str = "SNAPP_NOT_ENOUGH_PRIORITY";
                    break;
                case 14:
                    str = "SNAPP_CHARGING_NOT_CONNECTED";
                    break;
                case 15:
                    str = "SNAPP_DENIED_BY_PEAK_POWER";
                    break;
                default:
                    str = "SNAPP_UNRECOGNIZED";
                    break;
            }
            r6.A04("sup:LiveStreamAppStateDelegate", AnonymousClass000.A0p("[SN_APP_MANAGER]: SNAPP ERROR: ", str, AnonymousClass000.A0u()), (Throwable) null);
            AnonymousClass84B r3 = r2.A01;
            C23090B4a b4a = r3.A0H;
            if (b4a != null) {
                b4a.BPE("failure_reason", "media_stream_service_start_request_failure");
                b4a.BPF(3);
            }
            r3.A08(new C1695289r(str), (Throwable) null, true);
        }
        return AnonymousClass0AJ.A00;
    }
}
