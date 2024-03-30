package X;

import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.multiadmin.RevokeNewsletterAdminInviteDialogFragment;

/* renamed from: X.4XF  reason: invalid class name */
public class AnonymousClass4XF implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass4XF(UserJid userJid, C62023Ek r2, String str, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = userJid;
        this.A02 = str;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        NewsletterInfoActivity newsletterInfoActivity;
        int i = this.A03;
        C62023Ek r1 = (C62023Ek) this.A00;
        if (i != 0) {
            UserJid userJid = (UserJid) this.A01;
            String str = this.A02;
            AnonymousClass00C.A0D(userJid, 1);
            AnonymousClass155 r12 = r1.A00;
            if (!(r12 instanceof NewsletterInfoActivity) || (newsletterInfoActivity = (NewsletterInfoActivity) r12) == null) {
                return true;
            }
            newsletterInfoActivity.A3z(userJid, str);
            return true;
        }
        Jid jid = (Jid) this.A01;
        String str2 = this.A02;
        AnonymousClass00C.A0D(jid, 1);
        AnonymousClass01z supportFragmentManager = r1.A00.getSupportFragmentManager();
        RevokeNewsletterAdminInviteDialogFragment revokeNewsletterAdminInviteDialogFragment = new RevokeNewsletterAdminInviteDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        C36401kF.A14(A07, jid, "arg_contact_jid");
        A07.putString("arg_contact_name", str2);
        revokeNewsletterAdminInviteDialogFragment.A17(A07);
        C65443Sb.A02(revokeNewsletterAdminInviteDialogFragment, supportFragmentManager);
        return true;
    }
}
