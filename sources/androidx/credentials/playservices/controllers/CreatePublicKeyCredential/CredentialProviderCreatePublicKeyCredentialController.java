package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass0LV;
import X.AnonymousClass9BU;
import X.B0O;
import X.C04450Kr;
import X.C05250Oz;
import X.C165567td;
import X.C166897wz;
import X.C166917x1;
import X.C167067xG;
import X.C167207xU;
import X.C167427xq;
import X.C167457xt;
import X.C1889591l;
import X.C36331k8;
import X.C36341k9;
import X.C36441kJ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.Executor;
import org.json.JSONException;

public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Companion();
    public static final String TAG = "CreatePublicKey";
    public static CredentialProviderCreatePublicKeyCredentialController controller;
    public B0O callback;
    public CancellationSignal cancellationSignal;
    public final Context context;
    public Executor executor;
    public final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(this, C36341k9.A0H());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController(Context context2) {
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

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context2) {
        return Companion.getInstance(context2);
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        AnonymousClass00C.A0D(credentialProviderCreatePublicKeyCredentialController, 0);
        B0O b0o = credentialProviderCreatePublicKeyCredentialController.callback;
        if (b0o == null) {
            throw C36331k8.A0d("callback");
        }
        b0o.BWn(C167457xt.A00(new C167427xq(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    public AnonymousClass0LV convertRequestToPlayServices(C166897wz r2) {
        AnonymousClass00C.A0D(r2, 0);
        return PublicKeyCredentialControllerUtility.Companion.convert(r2);
    }

    public AnonymousClass9BU convertResponseToCredentialManager(C04450Kr r4) {
        AnonymousClass00C.A0D(r4, 0);
        try {
            String A02 = r4.A02();
            AnonymousClass00C.A08(A02);
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", A02);
            return new C166917x1(A02, A07);
        } catch (Throwable th) {
            throw new C167067xG(C36331k8.A0i("The PublicKeyCredential response json had an unexpected exception when parsing: ", AnonymousClass000.A0u(), th));
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        CancellationSignal cancellationSignal2;
        AnonymousClass00S r1;
        int i3 = CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        if (i != i3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Returned request code ");
            A0u.append(i3);
            Log.w(TAG, AnonymousClass000.A0r(" does not match what was given ", A0u, i));
            return;
        }
        if (CredentialProviderController.Companion.maybeReportErrorResultCodeCreate(i2, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA")) != null) {
            Parcelable.Creator creator = C04450Kr.CREATOR;
            AnonymousClass006.A01(creator);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            obtain.recycle();
            C04450Kr r12 = (C04450Kr) ((SafeParcelable) creator.createFromParcel(obtain));
            AnonymousClass00C.A08(r12);
            C1889591l publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(r12);
            if (publicKeyCredentialResponseContainsError != null) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, publicKeyCredentialResponseContainsError));
                return;
            }
            try {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(r12)));
            } catch (JSONException e) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            } catch (Throwable th) {
                cancellationSignal2 = this.cancellationSignal;
                r1 = new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th);
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
            }
        } else if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
            Executor executor2 = this.executor;
            if (executor2 == null) {
                throw C36331k8.A0d("executor");
            }
            executor2.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0(this));
        }
    }

    /* access modifiers changed from: private */
    public final C167457xt JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message == null || message.length() <= 0) {
            return C167457xt.A00(new C167207xU(), "Unknown error");
        }
        return C167457xt.A00(new C167207xU(), message);
    }

    public void invokePlayServices(C166897wz r5, B0O b0o, Executor executor2, CancellationSignal cancellationSignal2) {
        AnonymousClass00S r1;
        C165567td.A1K(r5, b0o, executor2);
        this.cancellationSignal = cancellationSignal2;
        this.callback = b0o;
        this.executor = executor2;
        try {
            AnonymousClass0LV convert = PublicKeyCredentialControllerUtility.Companion.convert(r5);
            if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal2)) {
                Intent A0H = C36441kJ.A0H(this.context, HiddenActivity.class);
                A0H.putExtra(CredentialProviderBaseController.REQUEST_TAG, convert);
                generateHiddenActivityIntent(this.resultReceiver, A0H, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
                try {
                    this.context.startActivity(A0H);
                } catch (Exception unused) {
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(this));
                }
            }
        } catch (JSONException e) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(this, e);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        } catch (Throwable th) {
            r1 = new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(this, th);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal2, r1);
        }
    }

    public final class Companion {
        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            AnonymousClass00C.A0D(context, 0);
            CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.controller;
            if (credentialProviderCreatePublicKeyCredentialController == null) {
                credentialProviderCreatePublicKeyCredentialController = new CredentialProviderCreatePublicKeyCredentialController(context);
                CredentialProviderCreatePublicKeyCredentialController.controller = credentialProviderCreatePublicKeyCredentialController;
            }
            AnonymousClass00C.A0B(credentialProviderCreatePublicKeyCredentialController);
            return credentialProviderCreatePublicKeyCredentialController;
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }
}
