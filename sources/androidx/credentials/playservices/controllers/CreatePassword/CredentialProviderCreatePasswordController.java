package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0AJ;
import X.AnonymousClass9BU;
import X.B0O;
import X.C04300Kc;
import X.C05250Oz;
import X.C165567td;
import X.C166887wy;
import X.C166927x2;
import X.C36341k9;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "CreatePassword";
    public static CredentialProviderCreatePasswordController controller;
    public B0O callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePasswordController$resultReceiver$1(this, C36341k9.A0H());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController(Context context2) {
        super(context2);
        AnonymousClass00C.A0D(context2, 1);
        this.context = context2;
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((C166887wy) null);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass9BU convertResponseToCredentialManager(AnonymousClass0AJ r2) {
        return new C166927x2();
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2) {
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Returned request code ");
            A0u.append(i3);
            Log.w(TAG, AnonymousClass000.A0r(" which does not match what was given ", A0u, i));
            return;
        }
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, new C166927x2()));
        }
    }

    public void invokePlayServices(C166887wy r3, B0O b0o, Executor executor2, CancellationSignal cancellationSignal2) {
        C165567td.A1K(r3, b0o, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = b0o;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            convertRequestToPlayServices(r3);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            AnonymousClass00C.A0D(context, 0);
            CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.controller;
            if (credentialProviderCreatePasswordController == null) {
                credentialProviderCreatePasswordController = new CredentialProviderCreatePasswordController(context);
                CredentialProviderCreatePasswordController.controller = credentialProviderCreatePasswordController;
            }
            AnonymousClass00C.A0B(credentialProviderCreatePasswordController);
            return credentialProviderCreatePasswordController;
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }

    public C04300Kc convertRequestToPlayServices(C166887wy r2) {
        throw AnonymousClass001.A0A("getId");
    }

    public /* bridge */ /* synthetic */ Object convertResponseToCredentialManager(Object obj) {
        return new C166927x2();
    }

    public /* bridge */ /* synthetic */ void invokePlayServices(Object obj, B0O b0o, Executor executor2, CancellationSignal cancellationSignal2) {
        invokePlayServices((C166887wy) null, b0o, executor2, cancellationSignal2);
    }
}
