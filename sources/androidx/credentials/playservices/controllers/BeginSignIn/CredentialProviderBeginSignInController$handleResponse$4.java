package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C10810fG;
import X.C36321k7;

public final class CredentialProviderBeginSignInController$handleResponse$4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C10810fG $exception;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C10810fG r3) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$4$$ExternalSyntheticLambda0(this.this$0, this.$exception));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C10810fG r2) {
        C36321k7.A0w(credentialProviderBeginSignInController, r2);
        credentialProviderBeginSignInController.getCallback().BWn(r2.element);
    }
}
