package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.2l8  reason: invalid class name and case insensitive filesystem */
public final class C50572l8 extends C50492l0 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"account_sync", "groups", "newsletter_metadata"});

    public C50572l8(String str, Long l) {
        AnonymousClass6QB A0q = C36441kJ.A0q("clean");
        Long l2 = l;
        if (l != null && C203539oF.A0L(l2, 0, 9007199254740991L, true)) {
            C36411kG.A1K(A0q, "timestamp", l.longValue());
        }
        A0q.A09(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C592133b.A00(A0q, this);
    }
}
