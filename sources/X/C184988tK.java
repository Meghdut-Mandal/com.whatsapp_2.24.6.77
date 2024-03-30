package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8tK  reason: invalid class name and case insensitive filesystem */
public class C184988tK extends C118095nK {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;

    public C184988tK(C203399nx r28, C203399nx r29, int i) {
        C22993Azj azj;
        C203399nx r12 = r28;
        String[] A0O = C203399nx.A0O(r12, "iq");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r12, cls, l, l2, "error", A0O, false);
        String[] A0l = C165617ti.A0l();
        Class<Jid> cls2 = Jid.class;
        C203539oF r3 = C203379ns.A00;
        C203399nx r4 = r29;
        Long l3 = A0P;
        Long l4 = A0Q;
        this.A02 = r3.A0Z(r12, cls2, l3, l4, r3.A0Z(r4, cls2, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
        C203539oF r19 = r3;
        Class<String> cls3 = cls;
        C203379ns.A03(r12, cls3, l3, l4, r19.A0Z(r4, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        C203399nx r20 = r12;
        this.A03 = (String) r19.A0Z(r20, cls, 1L, l2, (Object) null, new String[]{"error", "text"}, false);
        this.A00 = r19.A0Z(r20, Long.class, 1L, l2, (Object) null, new String[]{"error", "code"}, false);
        String[] A1b = C165607th.A1b(r12, this, "error");
        if (i != 0) {
            azj = C21600ARs.A00;
        } else {
            azj = AJL.A00;
        }
        AnonymousClass00C.A0D(r12, 0);
        this.A01 = C203539oF.A09(r12, azj, A1b, 1, 1).get(0);
    }

    public C184988tK(C203399nx r21) {
        C203399nx r4 = r21;
        String[] A0M = C203399nx.A0M(r4, "description");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        C203379ns.A03(r4, cls, A0Y, 256L, (Object) null, A0M, false);
        Class<UserJid> cls2 = UserJid.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        this.A00 = C203539oF.A07(r4, cls2, A0P, A0Q, (Object) null, new String[]{"participant"}, false);
        this.A01 = C203539oF.A07(r4, cls2, A0P, A0Q, (Object) null, new String[]{"participant_pn"}, false);
        Long A0t = C36411kG.A0t();
        C203539oF r3 = C203379ns.A00;
        this.A02 = r3.A0Z(r4, Long.class, A0t, A0Q, (Object) null, new String[]{"t"}, false);
        this.A03 = (String) r3.A0Z(r4, cls, A0Y, 65536L, (Object) null, new String[]{"body", "#elementValue"}, false);
        this.A00 = r4;
    }
}
