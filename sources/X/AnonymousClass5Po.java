package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.5Po  reason: invalid class name */
public final class AnonymousClass5Po extends AnonymousClass5PS {
    public final String A00;
    public final List A01;
    public final Jid A02;
    public final C203399nx A03;

    public AnonymousClass5Po(C203399nx r27, AnonymousClass2lL r28) {
        C203399nx r7 = r27;
        C203399nx A0e = C90514aH.A0e(r7, r28);
        Class<String> cls = String.class;
        C203379ns.A03(r7, cls, -9007199254740991L, 9007199254740991L, "result", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false);
        C203379ns.A03(r7, cls, -9007199254740991L, 9007199254740991L, "false", new String[]{"list", "matched"}, false);
        Class<Jid> cls2 = Jid.class;
        C203399nx r19 = r7;
        Class<Jid> cls3 = cls2;
        this.A02 = (Jid) C203379ns.A03(r19, cls3, -9007199254740991, 9007199254740991, C203379ns.A03(A0e, cls2, -9007199254740991, 9007199254740991, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls4 = cls;
        C203379ns.A03(r7, cls, -9007199254740991, 9007199254740991, C203379ns.A03(A0e, cls4, -9007199254740991, 9007199254740991, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr, true);
        C203399nx r192 = r7;
        Class<String> cls5 = cls;
        C203539oF.A07(r192, cls5, -9007199254740991, 9007199254740991, C203539oF.A07(A0e, cls4, -9007199254740991, 9007199254740991, (Object) null, new String[]{"item", "dhash"}, false), new String[]{"list", "c_dhash"}, true);
        this.A00 = (String) C203379ns.A03(r7, cls, C36411kG.A0t(), 100L, (Object) null, new String[]{"list", "dhash"}, false);
        this.A01 = C203379ns.A0C(r7, C147866xu.A00, new String[]{"list", "item"}, 0, 64000);
        this.A00 = r7;
        this.A03 = (C203399nx) C203379ns.A0C(r7, C147876xv.A00, new String[]{"list"}, 1, 1).get(0);
    }
}
