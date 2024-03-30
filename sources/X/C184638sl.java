package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8sl  reason: invalid class name and case insensitive filesystem */
public final class C184638sl extends C118095nK {
    public static final ArrayList A01 = C36351kA.A10(new String[]{"admin", "guest", "owner", "subscriber"});
    public final String A00;

    public C184638sl(C203399nx r4) {
        C203399nx.A0A(r4, "metadata");
        this.A00 = C203379ns.A07(r4, "membership", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01);
        this.A00 = r4;
    }
}
