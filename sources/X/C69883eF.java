package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.3eF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69883eF implements C32061ct {
    public final /* synthetic */ ConversationsFragment A00;

    public /* synthetic */ C69883eF(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public final void Bf7(C63093Is r10) {
        ConversationsFragment conversationsFragment = this.A00;
        C51832oS r1 = r10.A02;
        if (r1 == C51832oS.SUCCESS) {
            boolean z = !C36411kG.A1a(conversationsFragment.A1l.A01);
            LinkedHashSet linkedHashSet = conversationsFragment.A35;
            C36411kG.A0a(conversationsFragment.A32).A0G(linkedHashSet, true);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass3L5) conversationsFragment.A31.get()).A04(C36401kF.A0a(it), 1, (Integer) null, 5);
                C25731Hl.A00(((AnonymousClass3L5) conversationsFragment.A31.get()).A00, "new_add_chat_count");
            }
            if (z) {
                C235718z A0a = C36411kG.A0a(conversationsFragment.A32);
                C36371kC.A1Q(A0a.A09, A0a, conversationsFragment.A0a(), conversationsFragment.A0D, 13);
            }
        } else if (r1 == C51832oS.ERROR_AUTH_NOT_SETUP) {
            C36411kG.A0a(conversationsFragment.A32).A0E((AnonymousClass155) conversationsFragment.A0h(), ConversationsFragment.A06(conversationsFragment));
        }
        if (!conversationsFragment.A3E) {
            conversationsFragment.A1s(false, true);
        }
        C36411kG.A0a(conversationsFragment.A32).A00 = false;
        ConversationsFragment.A0L(conversationsFragment, 2);
    }
}
