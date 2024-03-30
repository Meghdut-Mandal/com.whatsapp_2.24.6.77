package X;

/* renamed from: X.4Hx  reason: invalid class name and case insensitive filesystem */
public final class C85654Hx extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass4RD $callback;
    public final /* synthetic */ int $messageType;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ long $serverMessageId;
    public final /* synthetic */ Long $similarNewslettersSessionId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85654Hx(C28981Uw r2, AnonymousClass4RD r3, Long l, int i, long j) {
        super(0);
        this.$callback = r3;
        this.$newsletterJid = r2;
        this.$serverMessageId = j;
        this.$messageType = i;
        this.$similarNewslettersSessionId = l;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass4RD r0 = this.$callback;
        C28981Uw r1 = this.$newsletterJid;
        long j = this.$serverMessageId;
        r0.BiR(r1, this.$similarNewslettersSessionId, this.$messageType, j);
        return AnonymousClass0AJ.A00;
    }
}
