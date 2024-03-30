package X;

/* renamed from: X.AjB  reason: case insensitive filesystem */
public final class C22250AjB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C199069ee $device;
    public final /* synthetic */ Throwable $error;
    public final /* synthetic */ AnonymousClass8AC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22250AjB(AnonymousClass8AC r2, C199069ee r3, Throwable th) {
        super(0);
        this.this$0 = r2;
        this.$device = r3;
        this.$error = th;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass8AC r6 = this.this$0;
        C199069ee r5 = this.$device;
        Throwable th = this.$error;
        C200159gk r3 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[LINKED_APP_MANAGER]: onError for ");
        r3.A05("sup:LinkedAppManagerStateDelegate", AnonymousClass000.A0o(r5.A07, A0u), th);
        AnonymousClass84B r32 = r6.A00;
        C23090B4a b4a = r32.A0H;
        if (b4a != null) {
            b4a.BPE("failure_reason", "linked_device_manager_request_failure");
            b4a.BPF(3);
        }
        r32.A08(new C1695289r("LINKED_DEVICE_START_ERROR"), th, true);
        return AnonymousClass0AJ.A00;
    }
}
