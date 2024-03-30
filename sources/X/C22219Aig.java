package X;

/* renamed from: X.Aig  reason: case insensitive filesystem */
public final class C22219Aig extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C199069ee $device;
    public final /* synthetic */ AnonymousClass8AC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22219Aig(AnonymousClass8AC r2, C199069ee r3) {
        super(0);
        this.this$0 = r2;
        this.$device = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C199069ee r4 = this.$device;
        C200159gk r3 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[LINKED_APP_MANAGER]: onDisconnected for ");
        r3.A01("sup:LinkedAppManagerStateDelegate", AnonymousClass000.A0o(r4.A07, A0u));
        return AnonymousClass0AJ.A00;
    }
}
