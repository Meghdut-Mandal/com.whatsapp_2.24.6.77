package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C166997x9;
import X.C36321k7;
import android.util.Log;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ B0O $callback;
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, B0O b0o) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = b0o;
    }

    public static final void invoke$lambda$0(B0O b0o, Exception exc) {
        C36321k7.A0w(b0o, exc);
        b0o.BWn(new C166997x9(exc.getMessage()));
    }

    public final void invoke() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("During clear credential sign out failed with ");
        Log.w(CredentialProviderPlayServicesImpl.TAG, AnonymousClass000.A0o(this.$e, A0u));
        this.$executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0(this.$callback, this.$e));
    }
}
