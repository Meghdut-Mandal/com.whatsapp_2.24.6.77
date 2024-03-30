package androidx.credentials.playservices.controllers;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C36321k7;
import java.util.concurrent.Executor;

public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ B0O $callback;
    public final /* synthetic */ Object $exception;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, B0O b0o, Object obj) {
        super(0);
        this.$executor = executor;
        this.$callback = b0o;
        this.$exception = obj;
    }

    public final void invoke() {
        this.$executor.execute(new CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0(this.$callback, this.$exception));
    }

    public static final void invoke$lambda$0(B0O b0o, Object obj) {
        C36321k7.A0w(b0o, obj);
        b0o.BWn(obj);
    }
}
