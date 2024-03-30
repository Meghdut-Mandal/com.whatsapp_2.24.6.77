package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.4W0  reason: invalid class name */
public class AnonymousClass4W0 extends C32001cn {
    public Object A00;
    public final int A01;

    public AnonymousClass4W0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(AnonymousClass11F r4) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                CallLogActivity.A07((CallLogActivity) this.A00);
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A0h.A0U();
                contactInfoActivity.A1o();
                return;
            case 2:
                ListChatInfoActivity.A0w((ListChatInfoActivity) this.A00);
                return;
            case 3:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (!ContactPickerFragment.A3r) {
                    ContactPickerFragment.A0G(contactPickerFragment);
                    return;
                }
                return;
            case 4:
                ((AnonymousClass27v) this.A00).A3q();
                return;
            case 5:
                ((AnonymousClass28d) this.A00).A0H();
                return;
            case 6:
                AnonymousClass28f.A02((AnonymousClass28f) this.A00);
                return;
            case 7:
                baseAdapter = ((MediaAlbumActivity) this.A00).A0B;
                break;
            case 8:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 9:
                ((AnonymousClass2JG) this.A00).A05.notifyDataSetChanged();
                return;
            case 10:
                C39951uL r0 = (C39951uL) this.A00;
                r0.A0T();
                C36341k9.A18(r0.A0H, true);
                return;
            case 11:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                GroupAdminPickerActivity.A0G(groupAdminPickerActivity, groupAdminPickerActivity.A0I);
                return;
            case 12:
                GroupChatInfoActivity.A14((GroupChatInfoActivity) this.A00);
                return;
            case 13:
                AnonymousClass00C.A0D(r4, 0);
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (r4.equals(C28981Uw.A03.A01(C36341k9.A0d(newsletterInfoActivity)))) {
                    AnonymousClass2EJ r1 = newsletterInfoActivity.A0j;
                    if (r1 == null) {
                        throw C36331k8.A0d("newsletterInfoViewModel");
                    }
                    r1.A0W(true);
                    newsletterInfoActivity.A1o();
                    return;
                }
                return;
            case 14:
                PopupNotification.A0F((PopupNotification) this.A00);
                return;
            case 15:
                SearchFragment.A05(r4, (SearchFragment) this.A00);
                return;
            case 16:
                StatusPlaybackContactFragment.A0B((StatusPlaybackContactFragment) this.A00);
                return;
            default:
                C40771w5 r02 = ((AnonymousClass3PF) this.A00).A01;
                if (r02 == null) {
                    throw C36331k8.A0Y();
                }
                r02.A06();
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public void A01(AnonymousClass11F r2) {
        if (15 - this.A01 != 0) {
            super.A01(r2);
        } else {
            C36421kH.A1E((SearchFragment) this.A00);
        }
    }

    public void A02(AnonymousClass11F r8) {
        C64773Pj r1;
        switch (this.A01) {
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r8.equals(C36431kI.A0l(C36341k9.A0d(contactInfoActivity)))) {
                    if (!contactInfoActivity.A3z() && (r1 = contactInfoActivity.A0g) != null) {
                        r1.A01(contactInfoActivity.A0z);
                    }
                    ContactInfoActivity.A11(contactInfoActivity);
                    contactInfoActivity.A0c.A01();
                    return;
                }
                return;
            case 5:
                AnonymousClass00C.A0D(r8, 0);
                AnonymousClass28d r12 = (AnonymousClass28d) this.A00;
                if (r8.equals(r12.A0e)) {
                    r12.A0B();
                    return;
                }
                return;
            case 13:
                AnonymousClass00C.A0D(r8, 0);
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A00;
                if (r8.equals(C28981Uw.A03.A01(C36341k9.A0d(newsletterInfoActivity)))) {
                    AnonymousClass3QQ r4 = newsletterInfoActivity.A0P;
                    if (r4 != null) {
                        C44072La A3t = newsletterInfoActivity.A3t();
                        AnonymousClass00C.A0D(A3t, 0);
                        String str = A3t.A0I;
                        int i = 0;
                        if (str == null || str.length() == 0) {
                            i = 8;
                        }
                        NewsletterDetailsCard newsletterDetailsCard = r4.A02;
                        newsletterDetailsCard.setContactChatStatusVisibility(i);
                        if (i == 0) {
                            newsletterDetailsCard.setContactChatStatus(AnonymousClass3QQ.A00(r4, A3t));
                        }
                        r4.A01(newsletterInfoActivity.A3t());
                    }
                    NewsletterInfoActivity.A1B(newsletterInfoActivity, false, false);
                    return;
                }
                return;
            case 14:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                AnonymousClass141 r0 = popupNotification.A0l;
                if (r0 != null && r8 != null && r8.equals(r0.A0H) && !AnonymousClass143.A0G(r8)) {
                    String A002 = popupNotification.A0A.A00(popupNotification.A0l);
                    boolean isEmpty = TextUtils.isEmpty(A002);
                    TextView textView = popupNotification.A08;
                    if (isEmpty) {
                        textView.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(0);
                    popupNotification.A08.setText(A002);
                    return;
                }
                return;
            case 15:
                SearchFragment.A05(r8, (SearchFragment) this.A00);
                return;
            default:
                super.A02(r8);
                return;
        }
    }

    public void A03(UserJid userJid) {
        if (1 - this.A01 != 0) {
            super.A03(userJid);
            return;
        }
        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
        ContactInfoActivity.A13(contactInfoActivity);
        contactInfoActivity.A0c.A01();
    }
}
