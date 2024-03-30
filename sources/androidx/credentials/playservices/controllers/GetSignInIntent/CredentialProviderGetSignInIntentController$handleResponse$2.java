package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass00C;
import X.AnonymousClass00R;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C1889691m;
import X.C36321k7;

public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public final void invoke(C1889691m r4) {
        AnonymousClass00C.A0D(r4, 0);
        this.this$0.getExecutor().execute(new CredentialProviderGetSignInIntentController$handleResponse$2$$ExternalSyntheticLambda0(this.this$0, r4));
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C1889691m r1) {
        C36321k7.A0w(credentialProviderGetSignInIntentController, r1);
        credentialProviderGetSignInIntentController.getCallback().BWn(r1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1889691m) obj);
        return AnonymousClass0AJ.A00;
    }
}
