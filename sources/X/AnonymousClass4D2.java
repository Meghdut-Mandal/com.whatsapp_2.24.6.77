package X;

import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;

/* renamed from: X.4D2  reason: invalid class name */
public final class AnonymousClass4D2 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ NewsletterAlertsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4D2(NewsletterAlertsActivity newsletterAlertsActivity) {
        super(0);
        this.this$0 = newsletterAlertsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterAlertsActivity newsletterAlertsActivity = this.this$0;
        AnonymousClass4OU r3 = newsletterAlertsActivity.A05;
        if (r3 != null) {
            C65313Ro r0 = C28981Uw.A03;
            C28981Uw A00 = C65313Ro.A00(C36341k9.A0d(newsletterAlertsActivity));
            AnonymousClass08Y r2 = new AnonymousClass08Y();
            r2.A01(new AnonymousClass4MG(A00, r3), C36441kJ.A1A(C39771tc.class));
            return r2.A00();
        }
        throw C36331k8.A0d("newsletterAlertsViewModelFactory");
    }
}
