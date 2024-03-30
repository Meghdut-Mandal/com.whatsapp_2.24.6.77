package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.8tA  reason: invalid class name and case insensitive filesystem */
public final class C184888tA extends C118095nK {
    public static final ArrayList A02 = C165567td.A0f("ACTIVE", "ELIGIBLE", "INELIGIBLE");
    public final UserJid A00;
    public final String A01;

    public C184888tA(C203399nx r5) {
        C203399nx.A0A(r5, "contact");
        this.A00 = (UserJid) C203379ns.A05(r5, UserJid.class, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_USER}, -9007199254740991L);
        this.A01 = C203379ns.A08(r5, "payment-status", A02);
        this.A00 = r5;
    }
}
