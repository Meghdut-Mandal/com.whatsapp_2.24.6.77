package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8vX  reason: invalid class name and case insensitive filesystem */
public final class C186178vX extends AnonymousClass5PS {
    public final AnonymousClass147 A00;
    public final UserJid A01;
    public final C183998rj A02;
    public final Long A03;
    public final AnonymousClass147 A04;
    public final C203399nx A05;

    public C186178vX(C203399nx r27, C186018vH r28) {
        C203399nx r11 = r27;
        C203399nx A0e = C90514aH.A0e(r11, r28);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r11, cls, l, l2, "result", strArr, false);
        String[] A0l = C165617ti.A0l();
        Class<AnonymousClass147> cls2 = AnonymousClass147.class;
        C203539oF r3 = C203379ns.A00;
        this.A04 = (AnonymousClass147) r3.A0Z(r11, cls2, l, l2, r3.A0Z(A0e, cls2, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
        Class<String> cls3 = cls;
        C203379ns.A03(r11, cls3, l, l2, r3.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        C203399nx r4 = r11;
        this.A00 = (AnonymousClass147) r3.A0Z(r4, cls2, A0P, A0Q, (Object) null, new String[]{"sub_group_suggestion", "jid"}, false);
        this.A01 = (UserJid) r3.A0Z(r4, UserJid.class, A0P, A0Q, (Object) null, new String[]{"sub_group_suggestion", "creator"}, false);
        this.A03 = (Long) r3.A0Z(r4, Long.class, C36411kG.A0t(), A0Q, (Object) null, new String[]{"sub_group_suggestion", "creation"}, false);
        this.A02 = (C183998rj) C203379ns.A02(r11, AM9.A00, new String[]{"sub_group_suggestion", "description"});
        this.A05 = (C203399nx) C203539oF.A05(r11, AMA.A00, C165607th.A1b(r11, this, "sub_group_suggestion"));
    }
}
