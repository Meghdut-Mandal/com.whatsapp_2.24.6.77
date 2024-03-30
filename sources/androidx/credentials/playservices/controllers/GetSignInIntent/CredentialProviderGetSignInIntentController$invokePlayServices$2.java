package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C167137xN;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderGetSignInIntentController$invokePlayServices$2 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        AnonymousClass00C.A0D(credentialProviderGetSignInIntentController, 0);
        credentialProviderGetSignInIntentController.getCallback().BWn(new C167137xN(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0(this.this$0));
    }
}
