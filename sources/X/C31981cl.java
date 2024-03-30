package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Collection;

/* renamed from: X.1cl  reason: invalid class name and case insensitive filesystem */
public class C31981cl implements AnonymousClass16B {
    public final /* synthetic */ ConversationsFragment A00;

    public void BUY() {
    }

    public C31981cl(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void BUX(Collection collection, boolean z) {
        ConversationsFragment conversationsFragment = this.A00;
        C33341fA r1 = conversationsFragment.A1W;
        if (r1 != null && (r1 instanceof C33361fC)) {
            C33361fC r12 = (C33361fC) r1;
            r12.A02 = false;
            r12.A07(false);
            r12.A03();
        }
        C32941eS r13 = conversationsFragment.A1D;
        if (r13 != null) {
            r13.unregisterObserver(conversationsFragment.A3Z);
        }
    }
}
