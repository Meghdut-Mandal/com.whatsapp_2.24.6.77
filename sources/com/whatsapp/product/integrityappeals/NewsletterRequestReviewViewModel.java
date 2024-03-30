package com.whatsapp.product.integrityappeals;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AO;
import X.C001700s;
import X.C005502l;
import X.C006302t;
import X.C023509x;
import X.C36441kJ;
import X.C51892oY;
import com.whatsapp.newsletterenforcements.client.NewsletterAppealsClient;

public final class NewsletterRequestReviewViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36441kJ.A0Z(C51892oY.NOT_STARTED);
    public final NewsletterAppealsClient A01;
    public final C005502l A02;

    public NewsletterRequestReviewViewModel(NewsletterAppealsClient newsletterAppealsClient, C005502l r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = newsletterAppealsClient;
        this.A02 = r3;
    }

    public static final Object A01(NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, C023509x r4, C006302t r5) {
        Object A002 = AnonymousClass0A2.A00(r4, newsletterRequestReviewViewModel.A02, new NewsletterRequestReviewViewModel$submitReview$3(newsletterRequestReviewViewModel, (C023509x) null, r5));
        if (A002 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A002;
    }
}
