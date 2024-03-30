package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass0JL;
import X.AnonymousClass9BX;
import X.AnonymousClass9BY;
import X.AnonymousClass9SP;
import X.B0O;
import X.C04380Kk;
import X.C04410Kn;
import X.C05250Oz;
import X.C10060dd;
import X.C10810fG;
import X.C165567td;
import X.C166987x8;
import X.C167107xK;
import X.C167117xL;
import X.C167137xN;
import X.C167147xO;
import X.C1889691m;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import java.util.List;
import java.util.concurrent.Executor;

public final class CredentialProviderGetSignInIntentController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "GetSignInIntent";
    public static CredentialProviderGetSignInIntentController controller;
    public B0O callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver = new CredentialProviderGetSignInIntentController$resultReceiver$1(this, C36341k9.A0H());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController(Context context2) {
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

    public static final CredentialProviderGetSignInIntentController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public C04380Kk convertRequestToPlayServices(AnonymousClass9BX r5) {
        AnonymousClass00C.A0D(r5, 0);
        List list = r5.A00;
        if (list.size() == 1) {
            AnonymousClass00C.A0E(list.get(0), "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
            throw AnonymousClass001.A0A("getServerClientId");
        }
        throw new C167147xO("GetSignInWithGoogleOption cannot be combined with other options.");
    }

    public AnonymousClass9BY convertResponseToCredentialManager(C04410Kn r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3.A07 != null) {
            return new AnonymousClass9BY(createGoogleIdCredential(r3));
        }
        Log.w(TAG, "Credential returned but no google Id found");
        throw new C167137xN("When attempting to convert get response, null credential found");
    }

    public final C166987x8 createGoogleIdCredential(C04410Kn r10) {
        AnonymousClass00C.A0D(r10, 0);
        AnonymousClass9SP r1 = new AnonymousClass9SP();
        String str = r10.A02;
        AnonymousClass00C.A08(str);
        r1.A01 = str;
        try {
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
        } catch (Exception unused) {
            throw new C167137xN("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final void setCallback(B0O b0o) {
        AnonymousClass00C.A0D(b0o, 0);
        this.callback = b0o;
    }

    public final void setExecutor(Executor executor2) {
        AnonymousClass00C.A0D(executor2, 0);
        this.executor = executor2;
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
        if (!CredentialProviderController.Companion.maybeReportErrorResultCodeGet(i2, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            try {
                Context context2 = this.context;
                AnonymousClass006.A01(context2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(new AnonymousClass0JL(context2, new C10060dd()).A04(intent))));
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
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, r2));
                }
                r2.element = r1;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, r2));
            } catch (C1889691m e2) {
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderGetSignInIntentController$handleResponse$5(this, e2);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
            } catch (Throwable th) {
                C167137xN r0 = new C167137xN(th.getMessage());
                cancellationSignal2 = this.cancellationSignal;
                r12 = new CredentialProviderGetSignInIntentController$handleResponse$6(this, r0);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r12);
            }
        }
    }

    public void invokePlayServices(AnonymousClass9BX r3, B0O b0o, Executor executor2, CancellationSignal cancellationSignal2) {
        AnonymousClass00S credentialProviderGetSignInIntentController$invokePlayServices$2;
        C165567td.A1K(r3, b0o, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = b0o;
        this.executor = executor2;
        if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
            try {
                convertRequestToPlayServices(r3);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } catch (Exception e) {
                if (e instanceof C167147xO) {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$1(this, e);
                } else {
                    credentialProviderGetSignInIntentController$invokePlayServices$2 = new CredentialProviderGetSignInIntentController$invokePlayServices$2(this);
                }
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, credentialProviderGetSignInIntentController$invokePlayServices$2);
            }
        }
    }

    public final class Companion {
        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            AnonymousClass00C.A0D(context, 0);
            CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.controller;
            if (credentialProviderGetSignInIntentController == null) {
                credentialProviderGetSignInIntentController = new CredentialProviderGetSignInIntentController(context);
                CredentialProviderGetSignInIntentController.controller = credentialProviderGetSignInIntentController;
            }
            AnonymousClass00C.A0B(credentialProviderGetSignInIntentController);
            return credentialProviderGetSignInIntentController;
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }

    public /* bridge */ /* synthetic */ Object convertRequestToPlayServices(Object obj) {
        convertRequestToPlayServices((AnonymousClass9BX) obj);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
