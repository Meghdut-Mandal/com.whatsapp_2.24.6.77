package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4CR  reason: invalid class name */
public final class AnonymousClass4CR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4CR(NewsletterInfoActivity newsletterInfoActivity) {
        super(0);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C61413Bt r0 = newsletterInfoActivity.A0D;
        if (r0 != null) {
            return r0.A00(newsletterInfoActivity, newsletterInfoActivity);
        }
        throw C36331k8.A0d("myStatusMessageObserverFactory");
    }
}
