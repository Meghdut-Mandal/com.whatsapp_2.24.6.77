package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8sn  reason: invalid class name and case insensitive filesystem */
public final class C184658sn extends C118095nK {
    public static final ArrayList A01 = C165567td.A0f("active", "geosuspended", "suspended");
    public final String A00;

    public C184658sn(C203399nx r4) {
        C203399nx.A0A(r4, "metadata");
        this.A00 = C203379ns.A07(r4, "state", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01);
        this.A00 = r4;
    }
}
