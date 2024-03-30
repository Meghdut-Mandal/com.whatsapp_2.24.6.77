package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.B0O;
import X.C167207xU;
import X.C167457xt;
import X.C36321k7;
import X.C36331k8;
import java.util.concurrent.Executor;
import org.json.JSONException;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$6 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ JSONException $e;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        C36321k7.A0w(credentialProviderCreatePublicKeyCredentialController, jSONException);
        B0O b0o = credentialProviderCreatePublicKeyCredentialController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(C167457xt.A00(new C167207xU(), jSONException.getMessage()));
    }
}
