package X;

import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;

/* renamed from: X.4LC  reason: invalid class name */
public final class AnonymousClass4LC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterUserReportsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4LC(NewsletterUserReportsListFragment newsletterUserReportsListFragment) {
        super(1);
        this.this$0 = newsletterUserReportsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0.A02;
        if (newsletterUserReportsViewModel == null) {
            throw C36331k8.A0a();
        }
        C36321k7.A1Q("onReportDetailItemClicked reportId:", str, AnonymousClass000.A0u());
        newsletterUserReportsViewModel.A05.A0C(new C76343oi(str));
        return AnonymousClass0AJ.A00;
    }
}
