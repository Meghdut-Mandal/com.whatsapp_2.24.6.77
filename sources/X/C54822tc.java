package X;

import android.os.Bundle;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment;
import java.util.List;

/* renamed from: X.2tc  reason: invalid class name and case insensitive filesystem */
public abstract class C54822tc {
    public static final InviteNewsletterAdminMessageFragment A00(C28981Uw r4, List list, boolean z) {
        InviteNewsletterAdminMessageFragment inviteNewsletterAdminMessageFragment = new InviteNewsletterAdminMessageFragment();
        Bundle A07 = AnonymousClass001.A07();
        C36401kF.A14(A07, r4, "newsletter_jid");
        A07.putStringArrayList("invitee_jids", AnonymousClass143.A07(list));
        A07.putBoolean("arg_from_contacts_picker", z);
        inviteNewsletterAdminMessageFragment.A17(A07);
        return inviteNewsletterAdminMessageFragment;
    }
}
