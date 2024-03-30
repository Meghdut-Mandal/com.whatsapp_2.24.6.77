package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8uO  reason: invalid class name and case insensitive filesystem */
public final class C185538uO extends C118095nK implements B0A {
    public static final ArrayList A00 = C165567td.A0e("uwp_alpha", "uwp_beta");

    public C185538uO(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "config");
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), "wns", new String[]{"platform"}, false);
        C203379ns.A03(r2, cls, C90474aD.A0Y(), 255L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        C203379ns.A0H(r10, "version", A00);
        this.A00 = r10;
    }

    public void B06(C198169d1 r1) {
    }
}
