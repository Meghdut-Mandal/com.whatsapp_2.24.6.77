package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import com.whatsapp.WaImageButton;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.search.home.HomeSearchFragment;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

/* renamed from: X.3Xk  reason: invalid class name and case insensitive filesystem */
public abstract class C66813Xk implements TextWatcher {
    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        AnonymousClass08S r0;
        WaImageButton waImageButton;
        AnonymousClass4WT r1 = (AnonymousClass4WT) this;
        switch (r1.A01) {
            case 0:
                C39591sn r12 = ((WDSSearchViewFragment) r1.A00).A01;
                if (r12 != null) {
                    str = String.valueOf(charSequence);
                    AnonymousClass00C.A0D(str, 0);
                    r0 = r12.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) r1.A00;
                ConversationSearchViewModel conversationSearchViewModel = conversationSearchFragment.A02;
                if (conversationSearchViewModel != null) {
                    String valueOf = String.valueOf(charSequence);
                    AnonymousClass00C.A0D(valueOf, 0);
                    conversationSearchViewModel.A00.A0D(valueOf);
                }
                if (!C36331k8.A1b(conversationSearchFragment.A09)) {
                    return;
                }
                if (!conversationSearchFragment.A06 && (charSequence == null || AnonymousClass098.A06(charSequence))) {
                    WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
                    if (wDSConversationSearchView != null) {
                        Menu menu = wDSConversationSearchView.A03.getMenu();
                        AnonymousClass00C.A08(menu);
                        int size = menu.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            menu.getItem(i4).setVisible(false);
                        }
                    }
                    WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
                    if (!(wDSConversationSearchView2 == null || (waImageButton = wDSConversationSearchView2.A04) == null)) {
                        waImageButton.setVisibility(0);
                    }
                    conversationSearchFragment.A06 = true;
                    return;
                } else if (conversationSearchFragment.A06 && charSequence != null && !AnonymousClass098.A06(charSequence)) {
                    WDSConversationSearchView wDSConversationSearchView3 = conversationSearchFragment.A05;
                    if (wDSConversationSearchView3 != null) {
                        Menu menu2 = wDSConversationSearchView3.A03.getMenu();
                        AnonymousClass00C.A08(menu2);
                        int size2 = menu2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            menu2.getItem(i5).setVisible(true);
                        }
                    }
                    WDSConversationSearchView wDSConversationSearchView4 = conversationSearchFragment.A05;
                    if (wDSConversationSearchView4 != null) {
                        C36331k8.A0y(wDSConversationSearchView4.A04);
                    }
                    conversationSearchFragment.A06 = false;
                    return;
                } else {
                    return;
                }
            default:
                C39551sd r13 = ((HomeSearchFragment) r1.A00).A02;
                if (r13 != null) {
                    str = String.valueOf(charSequence);
                    AnonymousClass00C.A0D(str, 0);
                    r0 = r13.A00;
                    break;
                } else {
                    throw C36331k8.A0a();
                }
        }
        r0.A0D(str);
    }
}
