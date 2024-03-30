package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C36321k7;

public final class CredentialProviderGetSignInIntentController$invokePlayServices$1 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = exc;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$invokePlayServices$1$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        C36321k7.A0w(credentialProviderGetSignInIntentController, exc);
        credentialProviderGetSignInIntentController.getCallback().BWn(exc);
    }
}
