package X;

import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.detail.NewsletterUserReportDetailFragment;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.4MK  reason: invalid class name */
public final class AnonymousClass4MK extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WDSProfilePhoto $channelIconView;
    public final /* synthetic */ NewsletterUserReportDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MK(NewsletterUserReportDetailFragment newsletterUserReportDetailFragment, WDSProfilePhoto wDSProfilePhoto) {
        super(1);
        this.this$0 = newsletterUserReportDetailFragment;
        this.$channelIconView = wDSProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r6 = (AnonymousClass141) obj;
        int dimensionPixelSize = C36341k9.A0G(this.this$0).getDimensionPixelSize(R.dimen.f7nameremoved);
        if (r6 != null) {
            NewsletterUserReportDetailFragment newsletterUserReportDetailFragment = this.this$0;
            WDSProfilePhoto wDSProfilePhoto = this.$channelIconView;
            C27731Pn r2 = newsletterUserReportDetailFragment.A00;
            if (r2 != null) {
                r2.A05(newsletterUserReportDetailFragment.A0a(), "newsletter-user-reports-detail-fragment").A09(wDSProfilePhoto, r6, dimensionPixelSize);
            } else {
                throw C36331k8.A0d("contactPhotos");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
