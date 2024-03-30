package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C10810fG;
import X.C36321k7;

public final class CredentialProviderGetSignInIntentController$handleResponse$4 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C10810fG $exception;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C10810fG r3) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0(this.this$0, this.$exception));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C10810fG r2) {
        C36321k7.A0w(credentialProviderGetSignInIntentController, r2);
        credentialProviderGetSignInIntentController.getCallback().BWn(r2.element);
    }
}
