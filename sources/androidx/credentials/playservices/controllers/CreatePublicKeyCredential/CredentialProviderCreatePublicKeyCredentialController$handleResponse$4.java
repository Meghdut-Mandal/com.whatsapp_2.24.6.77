package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C1889591l;
import X.C36331k8;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C1889591l $exception;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C1889591l r3) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = r3;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, C1889591l r2) {
        AnonymousClass00C.A0D(credentialProviderCreatePublicKeyCredentialController, 0);
        B0O b0o = credentialProviderCreatePublicKeyCredentialController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(r2);
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$exception));
    }
}
