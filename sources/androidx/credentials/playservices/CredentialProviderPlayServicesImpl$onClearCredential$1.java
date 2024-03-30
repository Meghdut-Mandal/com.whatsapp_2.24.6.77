package androidx.credentials.playservices;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.AnonymousClass0AJ;
import X.B0O;
import X.C006302t;
import X.C023509x;
import X.C23202B9k;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ B0O $callback;
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ Executor $executor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = b0o;
    }

    public final void invoke(Void voidR) {
        CredentialProviderPlayServicesImpl.Companion companion = CredentialProviderPlayServicesImpl.Companion;
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        final Executor executor = this.$executor;
        final B0O b0o = this.$callback;
        companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass00S() {
            public static final void invoke$lambda$0(B0O b0o) {
                AnonymousClass00C.A0D(b0o, 0);
                AnonymousClass00C.A0D((Object) null, 0);
                ((C023509x) ((C23202B9k) b0o).A00).resumeWith((Object) null);
            }

            public final void invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                executor.execute(new CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0(b0o));
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) null);
        return AnonymousClass0AJ.A00;
    }
}
