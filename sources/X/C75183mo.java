package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3mo  reason: invalid class name and case insensitive filesystem */
public class C75183mo implements C87864Ql {
    public final /* synthetic */ C40051uf A00;

    public C75183mo(C40051uf r1) {
        this.A00 = r1;
    }

    public void onError(Throwable th) {
        if (th instanceof C52862qI) {
            C40051uf r4 = this.A00;
            int i = ((C52862qI) th).errorCode;
            if (i == 403) {
                ArrayList A0I = AnonymousClass001.A0I();
                AnonymousClass1LV r6 = r4.A0M;
                AnonymousClass147 r5 = r4.A0h;
                Iterator it = r6.A04(r5).iterator();
                while (it.hasNext()) {
                    GroupJid groupJid = ((AnonymousClass3QK) it.next()).A02;
                    if (groupJid instanceof AnonymousClass147) {
                        A0I.add(groupJid);
                    }
                }
                r6.A0D(r5);
                r4.A0c.A0k(A0I, false);
            } else if (i == 404 && !r4.A0g.A00(r4.A04)) {
                r4.A0M.A0C(r4.A0h);
            } else {
                return;
            }
            C36341k9.A17(r4.A0v, i);
        }
    }
}
