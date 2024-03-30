package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C167067xG;
import X.C36331k8;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$invokePlayServices$1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$invokePlayServices$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        AnonymousClass00C.A0D(credentialProviderCreatePasswordController, 0);
        B0O b0o = credentialProviderCreatePasswordController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(new C167067xG(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePasswordController$invokePlayServices$1$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController));
    }
}
