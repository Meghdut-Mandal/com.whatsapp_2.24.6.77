package X;

import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity;

/* renamed from: X.4MI  reason: invalid class name */
public final class AnonymousClass4MI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WaImageView $channelIconView;
    public final /* synthetic */ NewsletterGeosuspensionInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MI(WaImageView waImageView, NewsletterGeosuspensionInfoActivity newsletterGeosuspensionInfoActivity) {
        super(1);
        this.this$0 = newsletterGeosuspensionInfoActivity;
        this.$channelIconView = waImageView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r5 = (AnonymousClass141) obj;
        int dimensionPixelSize = this.this$0.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        NewsletterGeosuspensionInfoActivity newsletterGeosuspensionInfoActivity = this.this$0;
        C27731Pn r1 = newsletterGeosuspensionInfoActivity.A01;
        if (r1 != null) {
            r1.A05(newsletterGeosuspensionInfoActivity, "newsletter-geosuspension-info-activity").A09(this.$channelIconView, r5, dimensionPixelSize);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("contactPhotos");
    }
}
