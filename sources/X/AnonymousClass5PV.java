package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5PV  reason: invalid class name */
public final class AnonymousClass5PV extends C118095nK {
    public final UserJid A00;
    public final String A01;
    public final List A02;

    public AnonymousClass5PV(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "bot");
        this.A00 = (UserJid) C203379ns.A03(r2, UserJid.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"jid"}, false);
        this.A01 = (String) C203379ns.A03(r2, String.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"persona_id"}, false);
        C203539oF.A07(r2, Long.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"count"}, false);
        this.A02 = C203379ns.A0C(r2, C147906xy.A00, new String[]{"theme"}, 0, 2);
        this.A00 = r10;
    }
}
