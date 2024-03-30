package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.AnonymousClass9BY;
import X.C023509x;
import X.C23202B9k;
import X.C36321k7;

public final class CredentialProviderBeginSignInController$handleResponse$3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9BY $response;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AnonymousClass9BY r3) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$3$$ExternalSyntheticLambda0(this.this$0, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AnonymousClass9BY r1) {
        C36321k7.A0w(credentialProviderBeginSignInController, r1);
        ((C023509x) ((C23202B9k) credentialProviderBeginSignInController.getCallback()).A00).resumeWith(r1);
    }
}
