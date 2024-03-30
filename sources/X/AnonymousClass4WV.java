package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4WV  reason: invalid class name */
public class AnonymousClass4WV implements AnonymousClass4TP {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass4WV(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }

    public void BWt(List list) {
        String A0L;
        AnonymousClass17Y r0;
        String str;
        int i;
        AnonymousClass27v r8;
        List list2 = list;
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(list, 0);
            AnonymousClass27v r82 = (AnonymousClass27v) this.A01;
            C18820ts r6 = r82.A0I;
            long size = (long) list.size();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1M(A0L2, 0, (long) list.size());
            A0L = r6.A0L(A0L2, R.plurals.f10nameremoved, size);
            AnonymousClass00C.A08(A0L);
            r0 = r82.A05;
            str = this.A02;
            i = 2;
            r8 = r82;
        } else {
            AnonymousClass00C.A0D(list, 0);
            C225314u r83 = (C225314u) this.A01;
            C18820ts r4 = r83.A00;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 1, 0);
            A0L = r4.A0L(objArr, R.plurals.f10nameremoved, 1);
            AnonymousClass00C.A08(A0L);
            r0 = r83.A05;
            str = this.A02;
            i = 1;
            r8 = r83;
        }
        r0.A0H(new C80503vV(r8, list2, A0L, str, i));
    }

    public void BiG(List list) {
        List list2 = list;
        if (this.A03 != 0) {
            ArrayList<AnonymousClass2YR> A0l = C36341k9.A0l(list2);
            for (Object next : list2) {
                if (next instanceof AnonymousClass2YR) {
                    A0l.add(next);
                }
            }
            HashMap A0J = AnonymousClass001.A0J();
            for (AnonymousClass2YR r0 : A0l) {
                C36421kH.A1K(r0.A01, A0J, r0.A00);
            }
            InviteNewsletterAdminSelector inviteNewsletterAdminSelector = (InviteNewsletterAdminSelector) this.A01;
            C61823Do r10 = inviteNewsletterAdminSelector.A03;
            if (r10 != null) {
                String A1E = C36431kI.A1E(inviteNewsletterAdminSelector.A0A);
                String str = this.A02;
                r10.A00(inviteNewsletterAdminSelector, (C28981Uw) this.A00, A1E, str, A0J);
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C36381kD.A1Q(A0I, it);
                }
                if (C36401kF.A1a(A0I)) {
                    inviteNewsletterAdminSelector.A05.A0H(new C1502774q(inviteNewsletterAdminSelector, A0J, A0I, A0l, str, 6));
                    return;
                }
                inviteNewsletterAdminSelector.setResult(-1, C36431kI.A0D().putExtra("extra_invitees_count", (long) A0l.size()));
                inviteNewsletterAdminSelector.finish();
                return;
            }
            throw C36331k8.A0d("newsletterAdminInvitationsUtils");
        }
        AnonymousClass00C.A0D(list2, 0);
        HashMap A0J2 = AnonymousClass001.A0J();
        ArrayList<AnonymousClass2YR> A0I2 = AnonymousClass001.A0I();
        for (Object next2 : list2) {
            if (next2 instanceof AnonymousClass2YR) {
                A0I2.add(next2);
            }
        }
        for (AnonymousClass2YR r02 : A0I2) {
            C36421kH.A1K(r02.A01, A0J2, r02.A00);
        }
        NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
        C61823Do r4 = newsletterInfoActivity.A0q;
        if (r4 != null) {
            r4.A00(newsletterInfoActivity, (C28981Uw) this.A00, newsletterInfoActivity.A3t().A0K, this.A02, A0J2);
            newsletterInfoActivity.A05.A0H(new C1497272n(newsletterInfoActivity, 45));
            return;
        }
        throw C36331k8.A0d("newsletterAdminInvitationsUtils");
    }
}
