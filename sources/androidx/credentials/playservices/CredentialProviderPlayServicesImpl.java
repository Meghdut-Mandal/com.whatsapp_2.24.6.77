package androidx.credentials.playservices;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass0JL;
import X.AnonymousClass0L0;
import X.AnonymousClass0OR;
import X.AnonymousClass0S9;
import X.AnonymousClass0XK;
import X.AnonymousClass92X;
import X.AnonymousClass92Y;
import X.AnonymousClass9BX;
import X.B0O;
import X.B24;
import X.C006302t;
import X.C02610Bd;
import X.C04520Ky;
import X.C05250Oz;
import X.C07180Wq;
import X.C07590Yl;
import X.C07720Za;
import X.C10060dd;
import X.C10200dr;
import X.C166897wz;
import X.C192779In;
import X.C36321k7;
import X.C36331k8;
import X.C90484aE;
import X.C90504aG;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.tasks.zzw;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public final class CredentialProviderPlayServicesImpl implements B24 {
    public static final Companion Companion = new Companion();
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public C02610Bd googleApiAvailability;

    public final class Companion {
        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, AnonymousClass00S r3) {
            AnonymousClass00C.A0D(r3, 1);
            if (!cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                r3.invoke();
            }
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(AnonymousClass9BX r4) {
            AnonymousClass00C.A0D(r4, 0);
            Iterator it = r4.A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return false;
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            } else if (!cancellationSignal.isCanceled()) {
                return false;
            } else {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
                return true;
            }
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context2) {
        AnonymousClass00C.A0D(context2, 1);
        this.context = context2;
        C02610Bd r0 = C02610Bd.A00;
        AnonymousClass00C.A08(r0);
        this.googleApiAvailability = r0;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public /* synthetic */ void onGetCredential(Context context2, AnonymousClass92Y r2, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
    }

    public /* synthetic */ void onPrepareCredential(AnonymousClass9BX r1, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
    }

    public final void setGoogleApiAvailability(C02610Bd r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.googleApiAvailability = r2;
    }

    private final int isGooglePlayServicesAvailable(Context context2) {
        return this.googleApiAvailability.A02(context2, 12451000);
    }

    public boolean isAvailableOnDevice() {
        int A02 = this.googleApiAvailability.A02(this.context, 12451000);
        if (A02 == 0) {
            return true;
        }
        Log.w(TAG, AnonymousClass000.A0l(new AnonymousClass0L0(A02), "Connection with Google Play Services was not successful. Connection result is: ", AnonymousClass000.A0u()));
        return false;
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, B0O b0o, Exception exc) {
        C36321k7.A0z(executor, b0o);
        AnonymousClass00C.A0D(exc, 4);
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, b0o));
    }

    public final C02610Bd getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public void onClearCredential(AnonymousClass92X r6, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
        C36321k7.A0z(executor, b0o);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            Context context2 = this.context;
            AnonymousClass006.A01(context2);
            AnonymousClass0JL r3 = new AnonymousClass0JL(context2, new C10060dd());
            C90504aG.A12(r3.A01.getSharedPreferences("com.google.android.gms.signin", 0));
            Set<AnonymousClass0XK> set = AnonymousClass0XK.A00;
            synchronized (set) {
            }
            for (AnonymousClass0XK A07 : set) {
                A07.A07();
            }
            C07720Za.A03();
            C07180Wq r2 = new C07180Wq((AnonymousClass0OR) null);
            r2.A03 = new C04520Ky[]{AnonymousClass0S9.A01};
            r2.A01 = new C10200dr(r3);
            r2.A02 = false;
            r2.A00 = 1554;
            zzw A01 = C07590Yl.A01(r3, r2.A00(), 1);
            A01.addOnSuccessListener(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1(new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, b0o)));
            A01.addOnFailureListener(new CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(this, cancellationSignal, executor, b0o));
        }
    }

    public void onCreateCredential(Context context2, C192779In r3, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
        C36321k7.A0w(context2, r3);
        C36331k8.A1G(executor, 3, b0o);
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (r3 instanceof C166897wz) {
            CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context2).invokePlayServices((C166897wz) r3, b0o, executor, cancellationSignal);
            return;
        }
        throw AnonymousClass001.A0E("Create Credential request is unsupported, not password or publickeycredential");
    }

    public void onGetCredential(Context context2, AnonymousClass9BX r4, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
        C36321k7.A0w(context2, r4);
        C36331k8.A1G(executor, 3, b0o);
        Companion companion = Companion;
        if (!companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            companion.isGetSignInIntentRequest$credentials_play_services_auth_release(r4);
            new CredentialProviderBeginSignInController(context2).invokePlayServices(r4, b0o, executor, cancellationSignal);
        }
    }

    public static final void onClearCredential$lambda$0(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }
}
