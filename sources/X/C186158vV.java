package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8vV  reason: invalid class name and case insensitive filesystem */
public final class C186158vV extends AnonymousClass5PS {
    public final UserJid A00;
    public final C184958tH A01;
    public final String A02;
    public final C203399nx A03;

    public C186158vV(C203399nx r20) {
        C203399nx r5 = r20;
        C203399nx.A0A(r5, "notification");
        String[] A0l = C165617ti.A0l();
        C177588e2 r9 = C177588e2.A00;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r5, C177588e2.class, A0P, A0Q, r9, A0l, false);
        Class<String> cls = String.class;
        C203379ns.A03(r5, cls, A0P, A0Q, "contacts", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false);
        this.A02 = (String) C203539oF.A07(r5, cls, A0P, A0Q, "clicked_invite_link", new String[]{"invite", "receiver", "reason"}, false);
        String[] strArr = {"invite", "receiver", PublicKeyCredentialControllerUtility.JSON_KEY_USER};
        this.A00 = (UserJid) C203379ns.A00.A0Z(r5, UserJid.class, A0P, A0Q, (Object) null, strArr, false);
        this.A01 = (C184958tH) C203539oF.A02(r5, AOY.A00, 0);
        this.A00 = r5;
        C203399nx r12 = r5;
        this.A03 = (C203399nx) C203539oF.A09(r12, AOZ.A00, new String[]{"invite", "receiver"}, 1, 1).get(0);
    }
}
