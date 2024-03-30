package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5PY  reason: invalid class name */
public final class AnonymousClass5PY extends C118095nK {
    public static final ArrayList A03 = C36351kA.A10(new String[]{"all", "category", "featured"});
    public final String A00;
    public final String A01;
    public final List A02;

    public AnonymousClass5PY(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "section");
        this.A00 = (String) C203379ns.A03(r2, String.class, C36411kG.A0t(), 200L, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, false);
        this.A01 = C203379ns.A0A(r10, A03, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE});
        this.A02 = C203379ns.A0C(r2, C147896xx.A00, new String[]{"bot"}, 0, Long.MAX_VALUE);
        this.A00 = r10;
    }
}
