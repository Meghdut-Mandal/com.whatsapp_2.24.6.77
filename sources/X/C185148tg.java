package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.8tg  reason: invalid class name and case insensitive filesystem */
public final class C185148tg extends C118095nK implements C22836Awl {
    public final C183998rj A00;
    public final C184348sI A01;
    public final String A02;

    public C185148tg(C203399nx r10) {
        C203399nx r2 = r10;
        String[] A0O = C203399nx.A0O(r10, "state");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r2, cls, A0P, A0Q, "version_check", A0O, false);
        this.A02 = (String) C203379ns.A00.A0Z(r2, cls, A0P, A0Q, (Object) null, new String[]{CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, false);
        this.A00 = (C183998rj) C203539oF.A03(r10, ALN.A00, "choice");
        this.A01 = (C184348sI) C203539oF.A02(r10, ALO.A00, 0);
        this.A00 = r10;
    }
}
