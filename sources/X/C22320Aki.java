package X;

/* renamed from: X.Aki  reason: case insensitive filesystem */
public final class C22320Aki extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass8AH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22320Aki(AnonymousClass8AH r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass00C.A0D(th, 0);
        AnonymousClass9AO.A01.A05("sup:MediaStreamServiceTcpStateDelegate", "[MEDIA_STREAM_SERVICE]: handleChannelError", th);
        AnonymousClass81Q.A02(this.this$0.A00, "MEDIA_STREAM_SERVICE_CONNECTION_FAIL");
        return AnonymousClass0AJ.A00;
    }
}
