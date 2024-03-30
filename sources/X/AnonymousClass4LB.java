package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity;
import com.whatsapp.product.newsletterenforcements.userreports.detail.NewsletterUserReportDetailFragment;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;
import com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewFragment;
import com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment;

/* renamed from: X.4LB  reason: invalid class name */
public final class AnonymousClass4LB extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterUserReportsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LB(NewsletterUserReportsActivity newsletterUserReportsActivity) {
        super(1);
        this.this$0 = newsletterUserReportsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass17Y r1;
        int i;
        AnonymousClass0p3 r8 = (AnonymousClass0p3) obj;
        NewsletterUserReportsActivity newsletterUserReportsActivity = this.this$0;
        AnonymousClass00C.A0B(r8);
        AnonymousClass09Y A0O = C36341k9.A0O(newsletterUserReportsActivity);
        A0O.A06(R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved);
        if (r8 instanceof C76343oi) {
            String str = ((C76343oi) r8).A00;
            NewsletterUserReportDetailFragment newsletterUserReportDetailFragment = new NewsletterUserReportDetailFragment();
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("arg-report-id", str);
            newsletterUserReportDetailFragment.A17(A07);
            A0O.A0B(newsletterUserReportDetailFragment, R.id.container);
            A0O.A0J("NewsletterUserReportDetailFragment");
        } else {
            if (r8 instanceof C76373ol) {
                A0O.A0B(new NewsletterUserReportsListFragment(), R.id.container);
            } else if (r8 instanceof C76353oj) {
                String str2 = ((C76353oj) r8).A00;
                NewsletterUserReportsReviewFragment newsletterUserReportsReviewFragment = new NewsletterUserReportsReviewFragment();
                Bundle A072 = AnonymousClass001.A07();
                A072.putString("arg-report-id", str2);
                newsletterUserReportsReviewFragment.A17(A072);
                A0O.A0B(newsletterUserReportsReviewFragment, R.id.container);
                A0O.A0J("NewsletterUserReportsReviewFragment");
            } else if (r8 instanceof C76363ok) {
                newsletterUserReportsActivity.getSupportFragmentManager().A0n("NewsletterUserReportDetailFragment", 0);
                String str3 = ((C76363ok) r8).A00;
                NewsletterUserReportsReviewSelectReasonFragment newsletterUserReportsReviewSelectReasonFragment = new NewsletterUserReportsReviewSelectReasonFragment();
                Bundle A073 = AnonymousClass001.A07();
                A073.putString("arg-report-id", str3);
                newsletterUserReportsReviewSelectReasonFragment.A17(A073);
                A0O.A0B(newsletterUserReportsReviewSelectReasonFragment, R.id.container);
                A0O.A0J("NewsletterUserReportsReviewSelectReasonFragment");
            } else if (r8 instanceof C76393on) {
                newsletterUserReportsActivity.A05.A02();
                newsletterUserReportsActivity.A05.A05(0, R.string.f12nameremoved);
            } else {
                if (r8 instanceof C76403oo) {
                    newsletterUserReportsActivity.A05.A02();
                    r1 = newsletterUserReportsActivity.A05;
                    i = R.string.f12nameremoved;
                } else if (r8 instanceof C76383om) {
                    newsletterUserReportsActivity.A05.A02();
                    r1 = newsletterUserReportsActivity.A05;
                    i = R.string.f12nameremoved;
                }
                r1.A06(i, 0);
                newsletterUserReportsActivity.getSupportFragmentManager().A0n("NewsletterUserReportDetailFragment", 0);
            }
            A0O.A01();
            return AnonymousClass0AJ.A00;
        }
        A0O.A0G = true;
        A0O.A01();
        return AnonymousClass0AJ.A00;
    }
}
