package X;

import android.os.Parcelable;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment;

/* renamed from: X.4DP  reason: invalid class name */
public final class AnonymousClass4DP extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ NewsletterGuidelinesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4DP(NewsletterGuidelinesFragment newsletterGuidelinesFragment) {
        super(0);
        this.this$0 = newsletterGuidelinesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable = this.this$0.A0b().getParcelable("newsletter-enforcement");
        if (parcelable != null) {
            return parcelable;
        }
        throw C36381kD.A0k();
    }
}
