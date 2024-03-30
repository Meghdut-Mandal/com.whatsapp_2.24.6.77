package X;

import android.net.Uri;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.3o8  reason: invalid class name and case insensitive filesystem */
public final class C75983o8 implements C32131d1 {
    public final /* synthetic */ NewsletterInfoActivity A00;

    public C75983o8(NewsletterInfoActivity newsletterInfoActivity) {
        this.A00 = newsletterInfoActivity;
    }

    public void BZJ(C44072La r5, AnonymousClass00S r6) {
        NewsletterInfoActivity newsletterInfoActivity = this.A00;
        AnonymousClass3UC r2 = newsletterInfoActivity.A0t;
        if (r2 != null) {
            r2.A0A(newsletterInfoActivity, C51582o3.CONSUMER, new C86744Mc(r5, newsletterInfoActivity, r6));
            return;
        }
        throw C36331k8.A0d("newsletterLauncher");
    }

    public void Bba(C44072La r13) {
        String str = r13.A0J;
        if (str != null) {
            NewsletterInfoActivity newsletterInfoActivity = this.A00;
            NewsletterLinkLauncher newsletterLinkLauncher = newsletterInfoActivity.A0k;
            if (newsletterLinkLauncher != null) {
                newsletterLinkLauncher.A01(newsletterInfoActivity, Uri.parse(AnonymousClass000.A0p("whatsapp://channel/", str, AnonymousClass000.A0u())), (C28981Uw) null, C28711Ts.SIMILAR_NEWSLETTERS_NEWSLETTER_PROFILE, Long.valueOf(C36351kA.A08(newsletterInfoActivity.A1B)), str, 0, -1);
                return;
            }
            throw C36331k8.A0d("newsletterLinkLauncher");
        }
    }
}
