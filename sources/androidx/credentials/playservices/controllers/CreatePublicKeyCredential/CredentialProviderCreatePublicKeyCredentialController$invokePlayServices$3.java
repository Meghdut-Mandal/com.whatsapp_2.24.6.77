package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C167067xG;
import X.C36331k8;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        AnonymousClass00C.A0D(credentialProviderCreatePublicKeyCredentialController, 0);
        B0O b0o = credentialProviderCreatePublicKeyCredentialController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(new C167067xG(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController));
    }
}
