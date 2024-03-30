package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;

/* renamed from: X.4Mc  reason: invalid class name and case insensitive filesystem */
public final class C86744Mc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C44072La $newsletterInfo;
    public final /* synthetic */ AnonymousClass00S $successCallback;
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86744Mc(C44072La r2, NewsletterInfoActivity newsletterInfoActivity, AnonymousClass00S r4) {
        super(1);
        this.this$0 = newsletterInfoActivity;
        this.$newsletterInfo = r2;
        this.$successCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0v;
        if (newsletterViewModel == null) {
            throw C36331k8.A0d("newsletterViewModel");
        }
        newsletterViewModel.A0V(this.$newsletterInfo, C52512pY.SIMILAR_NEWSLETTERS_NEWSLETTER_PROFILE, Long.valueOf(C36351kA.A08(newsletterInfoActivity.A1B)), this.$successCallback);
        return AnonymousClass0AJ.A00;
    }
}
