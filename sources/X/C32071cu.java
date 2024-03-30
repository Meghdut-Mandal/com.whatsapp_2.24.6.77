package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C32071cu implements AnonymousClass7fY {
    public final /* synthetic */ ConversationsFragment A00;

    public /* synthetic */ C32071cu(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public final void BSQ(C207109uZ r5) {
        C19420v0 r0;
        boolean z;
        ConversationsFragment conversationsFragment = this.A00;
        if (r5 != null) {
            List list = r5.A0O;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r0 = conversationsFragment.A1h;
                        z = false;
                        break;
                    }
                    C134986bw r02 = (C134986bw) it.next();
                    if (r02 != null && r02.A00.equals("644728732639272")) {
                        r0 = conversationsFragment.A1h;
                        z = true;
                        break;
                    }
                }
                C19420v0.A00(r0).putBoolean("not_a_business", z).apply();
            }
        }
    }
}
