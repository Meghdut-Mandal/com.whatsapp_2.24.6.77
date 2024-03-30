package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass00C;
import X.B0O;
import X.C36331k8;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass00C.A0D(bundle, 1);
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        B0O b0o = credentialProviderCreatePublicKeyCredentialController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        } else if (!credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, b0o, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
            this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }
}
