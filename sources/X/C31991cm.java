package X;

import android.view.View;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;

/* renamed from: X.1cm  reason: invalid class name and case insensitive filesystem */
public class C31991cm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ConversationsFragment A00;

    public void onViewDetachedFromWindow(View view) {
    }

    public C31991cm(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onViewAttachedToWindow(View view) {
        ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel;
        ConversationsFragment conversationsFragment = this.A00;
        C92934fA r0 = conversationsFragment.A1X;
        if (r0 != null && (conversationsSuggestedContactsViewModel = r0.A04) != null) {
            conversationsSuggestedContactsViewModel.A09.A07(conversationsFragment.A0m());
            conversationsSuggestedContactsViewModel.A09.A08(conversationsFragment.A0m(), new C55892vM(conversationsFragment, 5));
            C28201Rs r3 = conversationsSuggestedContactsViewModel.A0B;
            r3.A07(conversationsFragment.A0m());
            r3.A08(conversationsFragment.A0m(), new C55892vM(conversationsFragment, 6));
        }
    }
}
