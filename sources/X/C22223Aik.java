package X;

/* renamed from: X.Aik  reason: case insensitive filesystem */
public final class C22223Aik extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C187298xc $protocolException;
    public final /* synthetic */ AnonymousClass8AG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22223Aik(C187298xc r2, AnonymousClass8AG r3) {
        super(0);
        this.this$0 = r3;
        this.$protocolException = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9AO.A01.A07("sup:MediaStreamServiceBtcStateDelegate", "[MEDIA_STREAM_SERVICE]: handleChannelError", this.$protocolException);
        C23090B4a b4a = this.this$0.A00.A0H;
        if (b4a != null) {
            b4a.BPE("failure_reason", "media_stream_service_connection_request_failure");
        }
        C23090B4a b4a2 = this.this$0.A00.A0H;
        if (b4a2 != null) {
            b4a2.BPF(3);
        }
        AnonymousClass81Q.A02(this.this$0.A00, "MEDIA_STREAM_SERVICE_CONNECTION_FAIL");
        return AnonymousClass0AJ.A00;
    }
}
