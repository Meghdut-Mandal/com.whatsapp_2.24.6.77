package X;

import android.widget.CompoundButton;
import com.whatsapp.product.newsletterenforcements.userreports.review.NewsletterUserReportsReviewSelectReasonFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3Zn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67363Zn implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ NewsletterUserReportsReviewSelectReasonFragment A00;
    public final /* synthetic */ WDSButton A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C67363Zn(NewsletterUserReportsReviewSelectReasonFragment newsletterUserReportsReviewSelectReasonFragment, WDSButton wDSButton, String str) {
        this.A01 = wDSButton;
        this.A00 = newsletterUserReportsReviewSelectReasonFragment;
        this.A02 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        WDSButton wDSButton = this.A01;
        NewsletterUserReportsReviewSelectReasonFragment newsletterUserReportsReviewSelectReasonFragment = this.A00;
        String str = this.A02;
        AnonymousClass00C.A0D(str, 2);
        if (z) {
            C36421kH.A14(wDSButton, newsletterUserReportsReviewSelectReasonFragment, str, 19);
        }
    }
}
