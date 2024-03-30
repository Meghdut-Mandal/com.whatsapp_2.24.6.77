package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass00R;
import X.AnonymousClass00S;
import X.AnonymousClass9BY;
import X.C023509x;
import X.C23202B9k;
import X.C36321k7;

public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9BY $response;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, AnonymousClass9BY r3) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0(this.this$0, this.$response));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, AnonymousClass9BY r1) {
        C36321k7.A0w(credentialProviderGetSignInIntentController, r1);
        ((C023509x) ((C23202B9k) credentialProviderGetSignInIntentController.getCallback()).A00).resumeWith(r1);
    }
}
