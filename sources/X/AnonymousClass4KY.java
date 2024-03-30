package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import com.whatsapp.newsletter.NewsletterInfoViewModel$fetchPendingAdmins$1;

/* renamed from: X.4KY  reason: invalid class name */
public final class AnonymousClass4KY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KY(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass352 r6 = (AnonymousClass352) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass00C.A0B(r6);
        if (newsletterInfoActivity.A02.A0M(r6.A01)) {
            C44072La A3t = newsletterInfoActivity.A3t();
            C52382pL r1 = r6.A00;
            A3t.A09 = r1;
            AnonymousClass2EJ r0 = newsletterInfoActivity.A0j;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterInfoViewModel");
            }
            r0.A0V(r1);
            C30131Zi r12 = newsletterInfoActivity.A0n;
            if (r12 != null) {
                r12.A05(newsletterInfoActivity.A3v());
            } else {
                throw C36331k8.A0d("newsletterManager");
            }
        }
        if (newsletterInfoActivity.A3t().A09 == C52382pL.ADMIN || newsletterInfoActivity.A3t().A09 == C52382pL.OWNER) {
            NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = newsletterInfoActivity.A0i;
            if (newsletterInfoMembersListViewModel != null) {
                newsletterInfoMembersListViewModel.A0S(C52172p0.SHORT);
            }
            NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel2 = newsletterInfoActivity.A0i;
            if (newsletterInfoMembersListViewModel2 != null) {
                newsletterInfoMembersListViewModel2.A0S(C52172p0.FULL);
            }
        }
        if (newsletterInfoActivity.A3t().A0O()) {
            AnonymousClass2EJ r4 = newsletterInfoActivity.A0j;
            if (r4 == null) {
                throw C36331k8.A0d("newsletterInfoViewModel");
            }
            C28981Uw A3v = newsletterInfoActivity.A3v();
            C36331k8.A1T(new NewsletterInfoViewModel$fetchPendingAdmins$1(A3v, r4, (C023509x) null), C109325Xd.A00(r4));
        }
        return AnonymousClass0AJ.A00;
    }
}
