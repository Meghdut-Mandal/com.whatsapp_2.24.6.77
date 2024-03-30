package X;

/* renamed from: X.7Om  reason: invalid class name and case insensitive filesystem */
public final class C153477Om extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C160057kO $fbUserEntityOperationCallback;
    public final /* synthetic */ AnonymousClass5V6 $iqResponseErrorException;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Runnable $retryRunnable;
    public final /* synthetic */ C123155w2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153477Om(C123155w2 r2, C160057kO r3, C128936Ee r4, AnonymousClass5V6 r5, Runnable runnable) {
        super(0);
        this.this$0 = r2;
        this.$retryRunnable = runnable;
        this.$iqResponseErrorException = r5;
        this.$fbUserEntityOperationCallback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Runnable runnable = this.$retryRunnable;
        AnonymousClass5V6 r2 = this.$iqResponseErrorException;
        C160057kO r1 = this.$fbUserEntityOperationCallback;
        if (this.$operationRetryState.A04()) {
            runnable.run();
        } else {
            r1.BWk(r2);
        }
        return AnonymousClass0AJ.A00;
    }
}
