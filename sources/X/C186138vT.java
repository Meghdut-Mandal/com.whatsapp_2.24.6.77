package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.8vT  reason: invalid class name and case insensitive filesystem */
public final class C186138vT extends AnonymousClass5PS {
    public final C184898tB A00;
    public final String A01;
    public final Jid A02;
    public final C203399nx A03;

    public C186138vT(C203399nx r27, AnonymousClass2lL r28) {
        C203399nx r11 = r27;
        C203399nx A0e = C90514aH.A0e(r11, r28);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r11, cls2, l, l2, "result", strArr, false);
        C203379ns.A03(r11, cls2, l, l2, "true", new String[]{"list", "matched"}, false);
        String[] A0l = C165617ti.A0l();
        Class<Jid> cls3 = Jid.class;
        C203539oF r3 = C203379ns.A00;
        this.A02 = (Jid) r3.A0Z(r11, cls3, l, l2, r3.A0Z(A0e, cls3, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
        C203539oF r18 = r3;
        Class<String> cls4 = cls;
        C203379ns.A03(r11, cls4, l, l2, r18.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        C203399nx r19 = r11;
        this.A01 = (String) r18.A0Z(r19, cls, C36411kG.A0t(), C165577te.A0Z(), (Object) null, new String[]{"list", "dhash"}, false);
        this.A00 = (C184898tB) C203539oF.A06(r11, C21349AIb.A00, new String[]{"list", "item"});
        this.A03 = (C203399nx) C203539oF.A05(r11, C21350AIc.A00, C165607th.A1b(r11, this, "list"));
    }
}
