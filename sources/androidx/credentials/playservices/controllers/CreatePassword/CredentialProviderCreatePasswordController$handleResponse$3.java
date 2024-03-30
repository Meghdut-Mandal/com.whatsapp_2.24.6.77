package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.AnonymousClass9BU;
import X.B0O;
import X.C023509x;
import X.C23202B9k;
import X.C36321k7;
import X.C36331k8;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9BU $response;
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AnonymousClass9BU r3) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = r3;
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AnonymousClass9BU r1) {
        C36321k7.A0w(credentialProviderCreatePasswordController, r1);
        B0O b0o = credentialProviderCreatePasswordController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        ((C023509x) ((C23202B9k) b0o).A00).resumeWith(r1);
    }
}
