package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4Kf  reason: invalid class name and case insensitive filesystem */
public final class C86254Kf extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86254Kf(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2EJ r1;
        C52382pL r0;
        C62913Ia r6 = (C62913Ia) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass00C.A0B(r6);
        newsletterInfoActivity.Bnv();
        int ordinal = r6.A01.ordinal();
        if (ordinal != 3) {
            if (ordinal == 2) {
                NewsletterInfoActivity.A19(newsletterInfoActivity, true);
                r1 = newsletterInfoActivity.A0j;
                if (r1 == null) {
                    throw C36331k8.A0d("newsletterInfoViewModel");
                }
                r0 = C52382pL.SUBSCRIBED;
            }
            return AnonymousClass0AJ.A00;
        }
        NewsletterInfoActivity.A19(newsletterInfoActivity, false);
        r1 = newsletterInfoActivity.A0j;
        if (r1 == null) {
            throw C36331k8.A0d("newsletterInfoViewModel");
        }
        r0 = C52382pL.GUEST;
        r1.A0V(r0);
        return AnonymousClass0AJ.A00;
    }
}
