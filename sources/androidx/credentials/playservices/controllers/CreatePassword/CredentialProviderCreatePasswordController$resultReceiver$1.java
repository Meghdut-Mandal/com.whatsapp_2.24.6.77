package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass00C;
import X.B0O;
import X.C36331k8;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass00C.A0D(bundle, 1);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            throw C36331k8.A0d("executor");
        }
        B0O b0o = credentialProviderCreatePasswordController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        } else if (!credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, b0o, credentialProviderCreatePasswordController.cancellationSignal)) {
            this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$resultReceiver$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePasswordController;
    }
}
