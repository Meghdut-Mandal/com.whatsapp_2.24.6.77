package X;

/* renamed from: X.Aip  reason: case insensitive filesystem */
public final class C22228Aip extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Throwable $throwable;
    public final /* synthetic */ AnonymousClass8AF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22228Aip(AnonymousClass8AF r2, Throwable th) {
        super(0);
        this.this$0 = r2;
        this.$throwable = th;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9AO.A01.A06("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER] SNAM shutdown with exception", this.$throwable);
        this.this$0.A01.A08(new C1695289r("SNAM_SHUTDOWN_ERROR"), this.$throwable, false);
        return AnonymousClass0AJ.A00;
    }
}
