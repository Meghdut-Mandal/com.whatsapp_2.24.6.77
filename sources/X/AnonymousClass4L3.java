package X;

import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.4L3  reason: invalid class name */
public final class AnonymousClass4L3 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L3(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(1);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3T1 r6 = (AnonymousClass3T1) obj;
        NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity = this.this$0;
        AnonymousClass3HC r0 = newsletterAppealsOutcomeActivity.A04;
        if (r0 != null) {
            C70513fH r3 = new C70513fH(newsletterAppealsOutcomeActivity, r0);
            C61333Bl r2 = newsletterAppealsOutcomeActivity.A00;
            if (r2 != null) {
                AnonymousClass2IR A03 = r2.A00(newsletterAppealsOutcomeActivity.getSupportFragmentManager(), AnonymousClass2XJ.A01(newsletterAppealsOutcomeActivity.A04)).A03(this.this$0, r3, r6);
                A03.setRecipientNameVisibility(false);
                A03.setHeaderChevronVisibility(false);
                C36411kG.A0P(this.this$0.A00, R.id.newsletter_appeal_outcome_additional_section).addView(A03);
                return AnonymousClass0AJ.A00;
            }
            throw C36331k8.A0d("conversationRowInflaterFactory");
        }
        throw C36331k8.A0d("conversationRowCustomizers");
    }
}
