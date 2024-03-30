package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass04R;
import X.AnonymousClass16D;
import X.AnonymousClass1M6;
import X.AnonymousClass32d;
import X.C001700s;
import X.C005502l;
import X.C28201Rs;
import X.C36321k7;
import X.C36431kI;
import X.C36441kJ;
import com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient;
import com.whatsapp.util.Log;

public final class NewsletterUserReportsViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final AnonymousClass1M6 A01;
    public final AnonymousClass16D A02;
    public final NewsletterUserReportsNetworkClient A03;
    public final AnonymousClass32d A04;
    public final C28201Rs A05 = C36441kJ.A0t();
    public final C005502l A06;

    public void A0R() {
        Log.i("onCleared");
        this.A04.A00.clear();
    }

    public NewsletterUserReportsViewModel(AnonymousClass1M6 r2, AnonymousClass16D r3, NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, AnonymousClass32d r5, C005502l r6) {
        C36321k7.A11(r3, r2, r6);
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = r6;
        this.A03 = newsletterUserReportsNetworkClient;
        this.A04 = r5;
    }
}
