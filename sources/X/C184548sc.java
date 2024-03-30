package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.8sc  reason: invalid class name and case insensitive filesystem */
public final class C184548sc extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("false", "true");
    public final UserJid A00;

    public C184548sc(C203399nx r5) {
        this.A00 = (UserJid) C203379ns.A05(r5, UserJid.class, C203399nx.A0N(r5, "bot"), -9007199254740991L);
        C203379ns.A0H(r5, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, A01);
        this.A00 = r5;
    }
}
