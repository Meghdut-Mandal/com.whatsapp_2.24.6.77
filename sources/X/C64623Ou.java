package X;

import android.os.Bundle;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment;

/* renamed from: X.3Ou  reason: invalid class name and case insensitive filesystem */
public final class C64623Ou {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C206229sv A03;

    public final NewsletterGuidelinesFragment A00() {
        C206229sv r6 = this.A03;
        boolean z = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        NewsletterGuidelinesFragment newsletterGuidelinesFragment = new NewsletterGuidelinesFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("newsletter-enforcement", r6);
        A07.putBoolean("show-what-this-means-section", z);
        A07.putBoolean("show-what-you-can-do-section", z2);
        A07.putBoolean("show-what-you-need-to-know-section", z3);
        newsletterGuidelinesFragment.A17(A07);
        return newsletterGuidelinesFragment;
    }

    public C64623Ou(C206229sv r1) {
        this.A03 = r1;
    }
}
