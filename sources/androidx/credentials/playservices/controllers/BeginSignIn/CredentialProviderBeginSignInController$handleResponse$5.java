package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.C1889691m;
import X.C36321k7;

public final class CredentialProviderBeginSignInController$handleResponse$5 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C1889691m $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C1889691m r3) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C1889691m r1) {
        C36321k7.A0w(credentialProviderBeginSignInController, r1);
        credentialProviderBeginSignInController.getCallback().BWn(r1);
    }
}
