package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C167427xq;
import X.C167457xt;
import X.C36321k7;
import X.C36331k8;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$7 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Throwable $t;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$t));
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        C36321k7.A0w(credentialProviderCreatePublicKeyCredentialController, th);
        B0O b0o = credentialProviderCreatePublicKeyCredentialController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(C167457xt.A00(new C167427xq(), th.getMessage()));
    }
}
