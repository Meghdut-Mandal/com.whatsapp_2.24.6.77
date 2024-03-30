package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.contact.contactform.ContactFormActivity;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.4Xl  reason: invalid class name and case insensitive filesystem */
public class C89674Xl implements AnonymousClass07G {
    public Object A00;
    public final int A01;

    public C89674Xl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ConversationSearchViewModel conversationSearchViewModel;
        C28201Rs r1;
        boolean z;
        switch (this.A01) {
            case 0:
                ContactFormActivity contactFormActivity = (ContactFormActivity) this.A00;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.delete_contact) {
                    String string = contactFormActivity.getString(R.string.f12nameremoved);
                    String string2 = contactFormActivity.getString(R.string.f12nameremoved);
                    int length = string.length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(string);
                    spannableStringBuilder.append(' ');
                    spannableStringBuilder.append(string2);
                    spannableStringBuilder.setSpan(new StyleSpan(1), length, length + string2.length(), 33);
                    String string3 = contactFormActivity.getString(R.string.f12nameremoved);
                    C66223Vd r4 = C66223Vd.A00;
                    AnonymousClass4XM r3 = new AnonymousClass4XM(contactFormActivity, 10);
                    C39001qm A002 = AnonymousClass3LW.A00(contactFormActivity);
                    A002.setTitle(string3);
                    A002.A0Z(spannableStringBuilder);
                    A002.A0Q(r4, contactFormActivity.getString(R.string.f12nameremoved));
                    A002.A0S(r3, contactFormActivity.getString(R.string.f12nameremoved));
                    if (contactFormActivity.isFinishing()) {
                        return true;
                    }
                    C36341k9.A11(A002);
                    return true;
                } else if (itemId != R.id.save_to_phone) {
                    return true;
                } else {
                    contactFormActivity.A0A.A02();
                    return true;
                }
            case 1:
                ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) this.A00;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == R.id.action_search_up) {
                    ConversationSearchViewModel conversationSearchViewModel2 = conversationSearchFragment.A02;
                    if (conversationSearchViewModel2 == null) {
                        return true;
                    }
                    r1 = conversationSearchViewModel2.A04;
                    z = true;
                } else if (itemId2 != R.id.action_search_down || (conversationSearchViewModel = conversationSearchFragment.A02) == null) {
                    return true;
                } else {
                    r1 = conversationSearchViewModel.A04;
                    z = false;
                }
                r1.A0D(z);
                return true;
            default:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A00;
                if (menuItem.getItemId() != R.id.multi_select) {
                    return false;
                }
                C1270866x r32 = galleryTabHostFragment.A0F;
                if (r32 != null) {
                    r32.A02(33, 1, 16);
                    if (!galleryTabHostFragment.A1a()) {
                        return true;
                    }
                    GalleryTabHostFragment.A0B(galleryTabHostFragment, true);
                    menuItem.setVisible(false);
                    Toolbar toolbar = galleryTabHostFragment.A03;
                    if (toolbar == null) {
                        return true;
                    }
                    C19630wG r0 = galleryTabHostFragment.A0A;
                    if (r0 != null) {
                        toolbar.setTitle((CharSequence) C36421kH.A0B(r0).getString(R.string.f12nameremoved));
                        return true;
                    }
                    throw C36331k8.A0d("waContext");
                }
                throw C36331k8.A0d("mediaSharingUserJourneyLogger");
        }
    }
}
