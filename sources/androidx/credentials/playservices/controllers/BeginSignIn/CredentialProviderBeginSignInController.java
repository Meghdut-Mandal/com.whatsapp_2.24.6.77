package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass0JL;
import X.AnonymousClass9BV;
import X.AnonymousClass9BX;
import X.AnonymousClass9BY;
import X.AnonymousClass9SP;
import X.B0O;
import X.C04400Km;
import X.C04410Kn;
import X.C05250Oz;
import X.C10060dd;
import X.C10810fG;
import X.C165567td;
import X.C166947x4;
import X.C166957x5;
import X.C166987x8;
import X.C167107xK;
import X.C167117xL;
import X.C167137xN;
import X.C1889691m;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import java.util.concurrent.Executor;

public final class CredentialProviderBeginSignInController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "BeginSignIn";
    public static CredentialProviderBeginSignInController controller;
    public B0O callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver = new CredentialProviderBeginSignInController$resultReceiver$1(this, C36341k9.A0H());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController(Context context2) {
        super(context2);
        AnonymousClass00C.A0D(context2, 1);
        this.context = context2;
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    public static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public C04400Km convertRequestToPlayServices(AnonymousClass9BX r3) {
        AnonymousClass00C.A0D(r3, 0);
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(r3, this.context);
    }

    public AnonymousClass9BY convertResponseToCredentialManager(C04410Kn r6) {
        AnonymousClass9BV r3;
        AnonymousClass00C.A0D(r6, 0);
        String str = r6.A06;
        if (str != null) {
            String str2 = r6.A02;
            AnonymousClass00C.A08(str2);
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            A07.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            r3 = new C166947x4(str, A07);
        } else if (r6.A07 != null) {
            r3 = createGoogleIdCredential(r6);
        } else if (r6.A01 != null) {
            String assertPasskeyResponse = PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(r6);
            Bundle A072 = AnonymousClass001.A07();
            A072.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", assertPasskeyResponse);
            r3 = new C166957x5(assertPasskeyResponse, A072);
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            throw new C167137xN("When attempting to convert get response, null credential found");
        }
        return new AnonymousClass9BY(r3);
    }

    public final void setCallback(B0O b0o) {
        AnonymousClass00C.A0D(b0o, 0);
        this.callback = b0o;
    }

    public final void setExecutor(Executor executor2) {
        AnonymousClass00C.A0D(executor2, 0);
        this.executor = executor2;
    }

    private final C166987x8 createGoogleIdCredential(C04410Kn r10) {
        AnonymousClass9SP r1 = new AnonymousClass9SP();
        String str = r10.A02;
        AnonymousClass00C.A08(str);
        r1.A01 = str;
        String str2 = r10.A07;
        C36361kB.A1I(str2);
        r1.A02 = str2;
        String str3 = r10.A03;
        if (str3 != null) {
            r1.A03 = str3;
        }
        String str4 = r10.A04;
        if (str4 != null) {
            r1.A05 = str4;
        }
        String str5 = r10.A05;
        if (str5 != null) {
            r1.A04 = str5;
        }
        String str6 = r10.A08;
        if (str6 != null) {
            r1.A06 = str6;
        }
        Uri uri = r10.A00;
        if (uri != null) {
            r1.A00 = uri;
        }
        return new C166987x8(r1.A00, r1.A01, str2, r1.A03, r1.A04, r1.A05, r1.A06);
    }

    public final B0O getCallback() {
        B0O b0o = this.callback;
        if (b0o != null) {
            return b0o;
        }
        throw C36331k8.A0d("callback");
    }

    public final Executor getExecutor() {
        Executor executor2 = this.executor;
        if (executor2 != null) {
            return executor2;
        }
        throw C36331k8.A0d("executor");
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        Object r1;
        CancellationSignal cancellationSignal2;
        AnonymousClass00S r12;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Returned request code ");
            A0u.append(i3);
            Log.w(TAG, AnonymousClass000.A0r(" which  does not match what was given ", A0u, i));
            return;
        }
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            try {
                Context context2 = this.context;
                AnonymousClass006.A01(context2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(new AnonymousClass0JL(context2, new C10060dd()).A04(intent))));
            } catch (ApiException e) {
                C10810fG r2 = new C10810fG();
                r2.element = new C167137xN(e.getMessage());
                int i4 = e.mStatus.A01;
                if (i4 == 16) {
                    r1 = new C167107xK(e.getMessage());
                } else {
                    if (AnonymousClass000.A1Z(CredentialProviderBaseController.retryables, i4)) {
                        r1 = new C167117xL(e.getMessage());
                    }
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, r2));
                }
                r2.element = r1;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, r2));
            } catch (C1889691m e2) {
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderBeginSignInController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
            } catch (Throwable th) {
                C167137xN r0 = new C167137xN(th.getMessage());
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderBeginSignInController$handleResponse$6(this, r0);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
            }
        }
    }

    public void invokePlayServices(AnonymousClass9BX r5, B0O b0o, Executor executor2, CancellationSignal cancellationSignal2) {
        C165567td.A1K(r5, b0o, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = b0o;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            C04400Km convertRequestToPlayServices = convertRequestToPlayServices(r5);
            Intent A0H = C36441kJ.A0H(this.context, HiddenActivity.class);
            A0H.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, A0H, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
            try {
                this.context.startActivity(A0H);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderBeginSignInController$invokePlayServices$1(this));
            }
        }
    }

    public final class Companion {
        public final CredentialProviderBeginSignInController getInstance(Context context) {
            AnonymousClass00C.A0D(context, 0);
            CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.controller;
            if (credentialProviderBeginSignInController == null) {
                credentialProviderBeginSignInController = new CredentialProviderBeginSignInController(context);
                CredentialProviderBeginSignInController.controller = credentialProviderBeginSignInController;
            }
            AnonymousClass00C.A0B(credentialProviderBeginSignInController);
            return credentialProviderBeginSignInController;
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }
}
