package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1cq  reason: invalid class name and case insensitive filesystem */
public class C32031cq extends C32021cp {
    public final /* synthetic */ ConversationsFragment A00;

    public C32031cq(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void A02(GroupJid groupJid) {
        C34231gf r0 = this.A00.A1Q;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }
}
