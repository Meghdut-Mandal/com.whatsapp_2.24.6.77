package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8un  reason: invalid class name and case insensitive filesystem */
public final class C185788un extends C50492l0 implements C16470pI {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"admin", "guest", "owner", "subscriber"});

    public C185788un(C28981Uw r4, String str) {
        AnonymousClass6QB A0X = C165597tg.A0X();
        C36331k8.A1D(A0X, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "jid");
        if (C203539oF.A0N(r4, "jid")) {
            C36351kA.A1I(r4, A0X, "jid");
        }
        A0X.A08(str, "view_role", A00);
        C592133b.A00(A0X, this);
    }
}
