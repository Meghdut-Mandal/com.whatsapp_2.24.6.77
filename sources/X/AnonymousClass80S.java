package X;

import com.whatsapp.WaViewPager;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;

/* renamed from: X.80S  reason: invalid class name */
public final class AnonymousClass80S extends AnonymousClass02H {
    public final /* synthetic */ WaViewPager A00;
    public final /* synthetic */ NewsletterReactionsSheet A01;

    public AnonymousClass80S(WaViewPager waViewPager, NewsletterReactionsSheet newsletterReactionsSheet) {
        this.A00 = waViewPager;
        this.A01 = newsletterReactionsSheet;
    }

    public void BcC(int i) {
        int A0O = this.A00.A0O(i);
        C167707yf r0 = this.A01.A0B;
        if (r0 == null) {
            throw C36331k8.A0a();
        }
        r0.A0S(A0O);
    }
}
