package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.3WC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WC implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ AnonymousClass351 A01;
    public final /* synthetic */ NewsletterLinkLauncher A02;

    public /* synthetic */ AnonymousClass3WC(C225314u r1, AnonymousClass351 r2, NewsletterLinkLauncher newsletterLinkLauncher) {
        this.A02 = newsletterLinkLauncher;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        NewsletterLinkLauncher newsletterLinkLauncher = this.A02;
        C225314u r3 = this.A00;
        AnonymousClass351 r2 = this.A01;
        if (i == 4) {
            newsletterLinkLauncher.A04(r3);
            dialogInterface.dismiss();
            r2.A00 = true;
        }
        return true;
    }
}
