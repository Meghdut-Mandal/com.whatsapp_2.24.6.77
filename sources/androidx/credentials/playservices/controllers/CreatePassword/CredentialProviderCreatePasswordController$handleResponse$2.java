package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass0AJ;
import X.B0O;
import X.C006302t;
import X.C1889591l;
import X.C36321k7;
import X.C36331k8;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public final void invoke(C1889591l r4) {
        AnonymousClass00C.A0D(r4, 0);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, r4));
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, C1889591l r1) {
        C36321k7.A0w(credentialProviderCreatePasswordController, r1);
        B0O b0o = credentialProviderCreatePasswordController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(r1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1889591l) obj);
        return AnonymousClass0AJ.A00;
    }
}
