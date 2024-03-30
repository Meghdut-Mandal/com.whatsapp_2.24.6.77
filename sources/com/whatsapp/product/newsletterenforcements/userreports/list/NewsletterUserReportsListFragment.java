package com.whatsapp.product.newsletterenforcements.userreports.list;

import X.AnonymousClass00C;
import X.AnonymousClass1RJ;
import X.AnonymousClass4ML;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import X.C58322zg;
import X.C65993Ug;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportsListFragment extends Hilt_NewsletterUserReportsListFragment {
    public RecyclerView A00;
    public C58322zg A01;
    public NewsletterUserReportsViewModel A02;
    public AnonymousClass1RJ A03;
    public AnonymousClass1RJ A04;
    public AnonymousClass1RJ A05;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1J() {
        this.A00 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        super.A1J();
    }

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        A0i().setTitle(R.string.f12nameremoved);
        this.A02 = (NewsletterUserReportsViewModel) C36381kD.A0P(this).A00(NewsletterUserReportsViewModel.class);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A05 = C36341k9.A0Y(view, R.id.newsletter_user_reports_loading_spinner_stub);
        this.A04 = C36341k9.A0Y(view, R.id.newsletter_user_reports_fail_no_reports);
        this.A03 = C36341k9.A0Y(view, R.id.newsletter_user_reports_fail_generic_error);
        this.A00 = C36441kJ.A0c(view, R.id.newsletter_user_reports_list_view);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.A02;
        if (newsletterUserReportsViewModel == null) {
            throw C36331k8.A0a();
        }
        C65993Ug.A00(A0m(), newsletterUserReportsViewModel.A00, new AnonymousClass4ML(view, this), 48);
    }
}
