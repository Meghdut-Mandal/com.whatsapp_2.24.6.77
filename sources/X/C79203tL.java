package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Set;

/* renamed from: X.3tL  reason: invalid class name and case insensitive filesystem */
public class C79203tL implements C88654Tn {
    public final /* synthetic */ AnonymousClass01z A00;
    public final /* synthetic */ C31951ci A01;

    public C79203tL(AnonymousClass01z r1, C31951ci r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void B3l() {
        AnonymousClass01z r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0N;
        conversationsFragment.A2u.Box(new C50272kU((DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A1w, (Set) conversationsFragment.A35, true), new Object[0]);
    }

    public void BJR(boolean z) {
        AnonymousClass01z r4 = this.A00;
        ConversationsFragment conversationsFragment = this.A01.A0N;
        conversationsFragment.A2u.Box(new C50272kU((DialogFragment) new ConversationsFragment.BulkDeleteConversationDialogFragment(), r4, conversationsFragment.A1w, (Set) conversationsFragment.A35, z), new Object[0]);
    }
}
