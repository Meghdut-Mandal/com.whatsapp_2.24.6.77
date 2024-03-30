package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9Cq  reason: invalid class name and case insensitive filesystem */
public final class C191359Cq {
    public final Bundle A00;

    public C191359Cq(Bundle bundle) {
        C201719kE.A02(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, bundle);
        Class<Bundle> cls = Bundle.class;
        C201719kE.A01(cls, bundle.get("auxArguments"), "auxArguments");
        C201719kE.A01(cls, bundle.get("additionalKeyMaterial"), "additionalKeyMaterial");
        Class<Boolean> cls2 = Boolean.class;
        C201719kE.A01(cls2, bundle.get("refreshVerifier"), "refreshVerifier");
        C201719kE.A01(cls2, bundle.get("useDebugKey"), "useDebugKey");
        this.A00 = bundle;
    }
}
