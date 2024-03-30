package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Ag3  reason: case insensitive filesystem */
public final class C22056Ag3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22056Ag3(AnonymousClass8AG r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C199069ee r0;
        AnonymousClass9DE r02;
        C22056Ag3.super.A07();
        AnonymousClass8AG r4 = this.this$0;
        AnonymousClass84B r03 = r4.A00;
        AnonymousClass9Y3 r3 = r03.A01;
        C23090B4a b4a = r03.A0H;
        if (b4a != null) {
            b4a.BPK("media_stream_service_connection_request");
        }
        AnonymousClass88I r04 = r3.A07;
        if (r04 == null || (r0 = r04.A00) == null || (r02 = r0.A06) == null) {
            AnonymousClass9AO.A01.A06("sup:MediaStreamServiceBtcStateDelegate", "[MEDIA_STREAM_SERVICE]: Unable to create local channel for media streaming", (Throwable) null);
            r4.A00.A08(new C1695289r("MEDIA_STREAM_SERVICE_CHANNEL_NOT_CREATED"), (Throwable) null, true);
        } else {
            LocalChannel localChannel = new LocalChannel(r02.A00.A04, 51350);
            localChannel.onReceived = new C22317Akf(r4);
            localChannel.onClosed = new C22055Ag2(r4);
            localChannel.onError = new C22318Akg(r4);
            r3.A03 = localChannel;
            AnonymousClass84B r32 = r4.A00;
            C23090B4a b4a2 = r32.A0H;
            if (b4a2 != null) {
                b4a2.BPK("media_stream_service_connected");
            }
            AnonymousClass81Q.A01(r32.A09, r32, AnonymousClass84B.A0S, 4);
        }
        return AnonymousClass0AJ.A00;
    }
}
