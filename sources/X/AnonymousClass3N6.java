package X;

import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3N6  reason: invalid class name */
public final class AnonymousClass3N6 {
    public final /* synthetic */ NewsletterViewModel A00;

    public AnonymousClass3N6(NewsletterViewModel newsletterViewModel) {
        this.A00 = newsletterViewModel;
    }

    public static final void A00(AnonymousClass3N6 r4, List list) {
        NewsletterViewModel newsletterViewModel = r4.A00;
        newsletterViewModel.A03.A0C(list);
        C001700s r42 = newsletterViewModel.A02;
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (((AnonymousClass3JI) next).A02.A0N()) {
                A0I.add(next);
            }
        }
        r42.A0C(A0I);
    }
}
