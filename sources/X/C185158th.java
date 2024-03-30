package X;

import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.List;

/* renamed from: X.8th  reason: invalid class name and case insensitive filesystem */
public final class C185158th extends C118095nK implements C22836Awl {
    public final C184348sI A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C185158th(C203399nx r18) {
        C203399nx r3 = r18;
        String[] A0O = C203399nx.A0O(r3, "state");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r3, cls, A0P, A0Q, "choice", A0O, false);
        this.A02 = (String) C203379ns.A00.A0Z(r3, cls, A0P, A0Q, (Object) null, new String[]{CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, false);
        this.A01 = (String) C203539oF.A07(r3, cls, A0P, A0Q, (Object) null, new String[]{"catch"}, false);
        this.A00 = (C184348sI) C203539oF.A02(r3, C21417AKr.A00, 0);
        C21418AKs aKs = C21418AKs.A00;
        AnonymousClass00C.A0D(r3, 0);
        this.A03 = C203539oF.A09(r3, aKs, new String[]{"choice"}, 0, Long.MAX_VALUE);
        this.A00 = r3;
    }
}
