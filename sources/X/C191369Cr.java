package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9Cr  reason: invalid class name and case insensitive filesystem */
public final class C191369Cr {
    public final Bundle A00;

    public C191369Cr(Bundle bundle) {
        if (bundle != null) {
            C201719kE.A02(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass001.A08("Bundle is null");
    }
}
