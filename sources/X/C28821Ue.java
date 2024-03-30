package X;

import com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher;

/* renamed from: X.1Ue  reason: invalid class name and case insensitive filesystem */
public final class C28821Ue extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass19A $messageClient;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28821Ue(AnonymousClass19A r2) {
        super(0);
        this.$messageClient = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return new DelayedStanzasFetcher$StanzaFetcher(this.$messageClient, C28871Uj.A00);
    }
}
