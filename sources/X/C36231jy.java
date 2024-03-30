package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1jy  reason: invalid class name and case insensitive filesystem */
public class C36231jy implements AnonymousClass16A {
    public Object A00;
    public final int A01;

    public C36231jy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSP(UserJid userJid) {
        if (this.A01 != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
            conversationsFragment.A0p.A00 = null;
            ConversationsFragment.A0M(conversationsFragment, userJid);
            return;
        }
        ((C34471h6) this.A00).A00.A0L(userJid);
    }

    public /* synthetic */ void BSM(UserJid userJid) {
    }
}
