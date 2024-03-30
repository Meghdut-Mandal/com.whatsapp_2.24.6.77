package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass00C;
import X.AnonymousClass0KV;
import X.AnonymousClass0U9;
import X.AnonymousClass9BX;
import X.C04290Kb;
import X.C04390Kl;
import X.C04400Km;
import X.C05250Oz;
import X.C166967x6;
import X.C166977x7;
import X.C192789Io;
import X.C36331k8;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class BeginSignInControllerUtility {
    public static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final Companion Companion = new Companion();
    public static final String TAG = "BeginSignInUtility";

    public final class Companion {
        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final C04400Km constructBeginSignInRequest$credentials_play_services_auth_release(AnonymousClass9BX r7, Context context) {
            C36331k8.A1I(r7, context);
            AnonymousClass0U9 r4 = new AnonymousClass0U9();
            boolean z = false;
            for (C192789Io r2 : r7.A00) {
                if ((r2 instanceof C166977x7) && !z) {
                    boolean needsBackwardsCompatibleRequest = needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context));
                    PublicKeyCredentialControllerUtility.Companion companion = PublicKeyCredentialControllerUtility.Companion;
                    C166977x7 r22 = (C166977x7) r2;
                    if (needsBackwardsCompatibleRequest) {
                        C04290Kb convertToPlayAuthPasskeyRequest = companion.convertToPlayAuthPasskeyRequest(r22);
                        AnonymousClass006.A01(convertToPlayAuthPasskeyRequest);
                        r4.A03 = convertToPlayAuthPasskeyRequest;
                    } else {
                        AnonymousClass0KV convertToPlayAuthPasskeyJsonRequest = companion.convertToPlayAuthPasskeyJsonRequest(r22);
                        AnonymousClass006.A01(convertToPlayAuthPasskeyJsonRequest);
                        r4.A02 = convertToPlayAuthPasskeyJsonRequest;
                    }
                    z = true;
                }
            }
            r4.A06 = false;
            return r4.A00();
        }

        private final C04390Kl convertToGoogleIdTokenOption(C166967x6 r2) {
            throw AnonymousClass001.A0A("getFilterByAuthorizedAccounts");
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            AnonymousClass00C.A08(packageManager);
            return (long) packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        public /* synthetic */ Companion(C05250Oz r1) {
        }

        public Companion() {
        }
    }
}
