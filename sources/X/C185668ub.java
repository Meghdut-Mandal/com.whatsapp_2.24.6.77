package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.8ub  reason: invalid class name and case insensitive filesystem */
public final class C185668ub extends C50492l0 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"futureproof", "invite", "request", "request-cancel", "request-decline", "send"});

    public C185668ub(UserJid userJid, UserJid userJid2, String str, String str2) {
        AnonymousClass6QB A0q = C36441kJ.A0q("pay");
        if (str != null && C203539oF.A0S(str, 0, true)) {
            C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (userJid != null) {
            C36351kA.A1I(userJid, A0q, "sender");
        }
        if (userJid2 != null) {
            C36351kA.A1I(userJid2, A0q, "receiver");
        }
        A0q.A09(str2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C592133b.A00(A0q, this);
    }
}
