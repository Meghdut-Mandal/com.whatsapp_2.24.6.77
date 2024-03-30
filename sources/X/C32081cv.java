package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1cv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C32081cv implements C32061ct {
    public final /* synthetic */ ConversationsFragment A00;

    public /* synthetic */ C32081cv(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public final void Bf7(C63093Is r9) {
        ConversationsFragment conversationsFragment = this.A00;
        C51832oS r1 = r9.A02;
        if (r1 == C51832oS.SUCCESS) {
            LinkedHashSet linkedHashSet = conversationsFragment.A35;
            ((C235718z) conversationsFragment.A32.get()).A0G(linkedHashSet, false);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3L5) conversationsFragment.A31.get()).A04((AnonymousClass11F) it.next(), 1, (Integer) null, 6);
                C25731Hl.A00(((AnonymousClass3L5) conversationsFragment.A31.get()).A00, "new_remove_chat_count");
            }
        } else if (r1 == C51832oS.ERROR_AUTH_NOT_SETUP) {
            ((C235718z) conversationsFragment.A32.get()).A0E((AnonymousClass155) conversationsFragment.A0h(), ConversationsFragment.A06(conversationsFragment));
        }
        ((C235718z) conversationsFragment.A32.get()).A00 = false;
        ConversationsFragment.A0L(conversationsFragment, 2);
    }
}
