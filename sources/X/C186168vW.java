package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.List;

/* renamed from: X.8vW  reason: invalid class name and case insensitive filesystem */
public final class C186168vW extends AnonymousClass5PS {
    public final UserJid A00;
    public final String A01;
    public final List A02;
    public final C203399nx A03;
    public final C203399nx A04;
    public final C184828t4 A05;

    public C186168vW(C203399nx r23, C107535Pi r24) {
        C203399nx r7 = r23;
        C203399nx A0e = C90514aH.A0e(r7, r24);
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203399nx r15 = r7;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r15, cls, l, l2, "2", new String[]{"bot", "v"}, false);
        String[] strArr = {"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, "jid"};
        C203539oF r6 = C203379ns.A00;
        this.A00 = (UserJid) r6.A0Z(r7, UserJid.class, A0P, A0Q, (Object) null, strArr, false);
        this.A01 = (String) r6.A0Z(r15, cls, l, l2, (Object) null, new String[]{"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, "persona_id"}, false);
        this.A05 = (C184828t4) C203539oF.A02(r7, new C23212B9u(A0e, 13), 0);
        C147886xw r8 = C147886xw.A00;
        AnonymousClass00C.A0D(r7, 0);
        this.A02 = C203539oF.A09(r7, r8, new String[]{"bot", "section"}, 1, Long.MAX_VALUE);
        this.A04 = (C203399nx) C203539oF.A09(r7, C21362AIo.A00, C165607th.A1b(r7, this, "bot"), 1, 1).get(0);
        this.A03 = (C203399nx) C203539oF.A09(r7, C21363AIp.A00, new String[]{"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID}, 1, 1).get(0);
    }
}
