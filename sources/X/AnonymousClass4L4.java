package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.4L4  reason: invalid class name */
public final class AnonymousClass4L4 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L4(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(1);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r5 = (AnonymousClass141) obj;
        NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity = this.this$0;
        C27731Pn r1 = newsletterAppealsOutcomeActivity.A02;
        if (r1 != null) {
            AnonymousClass1RY A05 = r1.A05(newsletterAppealsOutcomeActivity, "newsletter-appeals-outcome-activity");
            A05.A09(C36391kE.A0N(this.this$0.A00, R.id.channel_icon), r5, this.this$0.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            ImageView A0N = C36391kE.A0N(this.this$0.A00, R.id.profile_picture);
            if (A0N != null) {
                A05.A08(A0N, r5);
            }
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("contactPhotos");
    }
}
