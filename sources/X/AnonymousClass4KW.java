package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import com.whatsapp.newsletter.multiadmin.NewsletterInvitedAdminsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4KW  reason: invalid class name */
public final class AnonymousClass4KW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KW(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set set = (Set) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass00C.A0B(set);
        C40991wR r5 = newsletterInfoActivity.A0r;
        if (r5 != null) {
            ArrayList A0z = C36351kA.A0z(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0z.add(new AnonymousClass2YS(C36391kE.A0f(it)));
            }
            r5.A0L(A0z);
        }
        if (set.isEmpty()) {
            View view = newsletterInfoActivity.A04;
            if (view == null) {
                throw C36331k8.A0d("invitesCard");
            }
            view.setVisibility(8);
        } else {
            C36401kF.A0H(newsletterInfoActivity, R.id.admin_invites_info).setText(newsletterInfoActivity.A00.A0M().format(Integer.valueOf(set.size())));
            View view2 = newsletterInfoActivity.A04;
            if (view2 == null) {
                throw C36331k8.A0d("invitesCard");
            }
            view2.setVisibility(0);
            NewsletterInfoActivity.A1A(newsletterInfoActivity, false, true);
        }
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = newsletterInfoActivity.A0i;
        if (newsletterInfoMembersListViewModel != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                AnonymousClass11F A0W = C36341k9.A0W(it2);
                if (A0W != null) {
                    A0I.add(A0W);
                }
            }
            Set A0e = C007103b.A0e(A0I);
            C001700s r52 = newsletterInfoMembersListViewModel.A05;
            List A0w = C36401kF.A0w(r52);
            if (A0w != null) {
                ArrayList<AnonymousClass2Y2> A0I2 = AnonymousClass001.A0I();
                for (Object next : A0w) {
                    if (next instanceof AnonymousClass2Y2) {
                        A0I2.add(next);
                    }
                }
                for (AnonymousClass2Y2 r0 : A0I2) {
                    AnonymousClass378 r1 = r0.A00;
                    r1.A01 = C007103b.A0j(A0e, r1.A00.A0H);
                }
            }
            C001700s r3 = newsletterInfoMembersListViewModel.A04;
            List A0w2 = C36401kF.A0w(r3);
            if (A0w2 != null) {
                ArrayList<AnonymousClass2Y2> A0I3 = AnonymousClass001.A0I();
                for (Object next2 : A0w2) {
                    if (next2 instanceof AnonymousClass2Y2) {
                        A0I3.add(next2);
                    }
                }
                for (AnonymousClass2Y2 r02 : A0I3) {
                    AnonymousClass378 r12 = r02.A00;
                    r12.A01 = C007103b.A0j(A0e, r12.A00.A0H);
                }
            }
            Object A04 = r52.A04();
            if (A04 != null) {
                r52.A0C(A04);
            }
            Object A042 = r3.A04();
            if (A042 != null) {
                r3.A0C(A042);
            }
        }
        AnonymousClass02E A0N = newsletterInfoActivity.getSupportFragmentManager().A0N("NewsletterInvitedAdminsFragment");
        if (A0N != null) {
            NewsletterInvitedAdminsFragment newsletterInvitedAdminsFragment = (NewsletterInvitedAdminsFragment) A0N;
            ArrayList A0z2 = C36351kA.A0z(set);
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                A0z2.add(new AnonymousClass2YS(C36391kE.A0f(it3)));
            }
            C40991wR r03 = newsletterInvitedAdminsFragment.A07;
            if (r03 == null) {
                throw C36331k8.A0d("newsletterInvitedAdminsListAdapter");
            }
            r03.A0L(A0z2);
        }
        return AnonymousClass0AJ.A00;
    }
}
