package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8uG  reason: invalid class name and case insensitive filesystem */
public final class C185458uG extends C118095nK implements C22840Awp {
    public static final ArrayList A02 = C165567td.A0e("image", "preview");
    public final String A00;
    public final String A01;

    public C185458uG(C203399nx r5) {
        this.A00 = (String) C203379ns.A04(r5, String.class, C90474aD.A0Y(), C165597tg.A0e(), C203399nx.A0M(r5, "picture"));
        this.A01 = C203379ns.A08(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A02);
        this.A00 = r5;
    }
}
