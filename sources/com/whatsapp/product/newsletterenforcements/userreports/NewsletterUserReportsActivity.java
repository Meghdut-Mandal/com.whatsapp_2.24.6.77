package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass01z;
import X.AnonymousClass155;
import X.AnonymousClass4LB;
import X.C023509x;
import X.C109325Xd;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36441kJ;
import X.C65993Ug;
import X.C76323og;
import X.C76373ol;
import X.C89354Wf;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class NewsletterUserReportsActivity extends AnonymousClass155 {
    public NewsletterUserReportsViewModel A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public NewsletterUserReportsActivity(int i) {
        this.A01 = false;
        C89354Wf.A00(this, 21);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A2u();
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = (NewsletterUserReportsViewModel) C36441kJ.A0b(this).A00(NewsletterUserReportsViewModel.class);
        this.A00 = newsletterUserReportsViewModel;
        if (newsletterUserReportsViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        C65993Ug.A00(this, newsletterUserReportsViewModel.A05, new AnonymousClass4LB(this), 47);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel2 = this.A00;
        if (newsletterUserReportsViewModel2 == null) {
            throw C36331k8.A0d("viewModel");
        }
        Log.i("NewsletterUserReportsViewModel init");
        newsletterUserReportsViewModel2.A05.A0C(C76373ol.A00);
        Log.i("Fetching user reports");
        newsletterUserReportsViewModel2.A00.A0C(C76323og.A00);
        C36331k8.A1T(new NewsletterUserReportsViewModel$fetchReports$1(newsletterUserReportsViewModel2, (C023509x) null), C109325Xd.A00(newsletterUserReportsViewModel2));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.A0I() != 0) {
                supportFragmentManager.A0V();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public NewsletterUserReportsActivity() {
        this(0);
    }
}
