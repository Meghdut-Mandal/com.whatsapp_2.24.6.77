package androidx.credentials.playservices.controllers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.B0O;
import X.C006302t;
import X.C009003v;
import X.C05250Oz;
import X.C10810fG;
import X.C167027xC;
import X.C167067xG;
import X.C167107xK;
import X.C167137xN;
import X.C36321k7;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

public abstract class CredentialProviderController extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion();
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    public final Context context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context2) {
        super(context2);
        AnonymousClass00C.A0D(context2, 1);
        this.context = context2;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, AnonymousClass00S r2) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, r2);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, C009003v r2, C006302t r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, r2, r3, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, C009003v r2, C006302t r3, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, r2, r3, cancellationSignal);
    }

    public abstract Object convertRequestToPlayServices(Object obj);

    public abstract Object convertResponseToCredentialManager(Object obj);

    public abstract void invokePlayServices(Object obj, B0O b0o, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, C009003v r5, Executor executor, B0O b0o, CancellationSignal cancellationSignal) {
        AnonymousClass00C.A0D(bundle, 0);
        C36321k7.A16(r5, executor, b0o, 1);
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, b0o, r5.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }

    public final class Companion {
        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, AnonymousClass00S r3) {
            AnonymousClass00C.A0D(r3, 1);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final boolean maybeReportErrorResultCodeCreate(int i, C009003v r6, C006302t r7, CancellationSignal cancellationSignal) {
            C36321k7.A0v(r6, 1, r7);
            if (i == -1) {
                return false;
            }
            C10810fG r2 = new C10810fG();
            r2.element = new C167067xG(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                r2.element = new C167027xC("activity is cancelled by the user.");
            }
            r6.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(r7, r2));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int i, C009003v r6, C006302t r7, CancellationSignal cancellationSignal) {
            C36321k7.A0v(r6, 1, r7);
            if (i == -1) {
                return false;
            }
            C10810fG r2 = new C10810fG();
            r2.element = new C167137xN(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                r2.element = new C167107xK("activity is cancelled by the user.");
            }
            r6.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(r7, r2));
            return true;
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("activity with result code: ");
            A0u.append(i);
            return AnonymousClass000.A0q(" indicating not RESULT_OK", A0u);
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }
}
