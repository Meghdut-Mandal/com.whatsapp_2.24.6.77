package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C1889691m;
import X.C36321k7;

public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C1889691m $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C1889691m r3) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C1889691m r1) {
        C36321k7.A0w(credentialProviderGetSignInIntentController, r1);
        credentialProviderGetSignInIntentController.getCallback().BWn(r1);
    }
}