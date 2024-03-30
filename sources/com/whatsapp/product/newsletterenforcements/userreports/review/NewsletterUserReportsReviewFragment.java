package com.whatsapp.product.newsletterenforcements.userreports.review;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3TE;
import X.AnonymousClass3Y5;
import X.C1497372o;
import X.C20810yC;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C55132u7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;

public final class NewsletterUserReportsReviewFragment extends Hilt_NewsletterUserReportsReviewFragment {
    public C33751fs A00;
    public C20810yC A01;
    public NewsletterUserReportsViewModel A02;
    public C32681e1 A03;
    public final AnonymousClass00T A04 = AnonymousClass3TE.A01(this, "arg-report-id");

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        this.A02 = (NewsletterUserReportsViewModel) C36381kD.A0P(this).A00(NewsletterUserReportsViewModel.class);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        TextView A0P = C36391kE.A0P(inflate, R.id.request_review_description);
        View findViewById = inflate.findViewById(R.id.request_review_next_screen);
        AnonymousClass00C.A0B(A0P);
        C32681e1 r3 = this.A03;
        if (r3 != null) {
            C20810yC r2 = this.A01;
            if (r2 != null) {
                C55132u7.A00(A0P, r2, r3, new C1497372o(this, 45), R.string.f12nameremoved);
                AnonymousClass3Y5.A00(findViewById, this, 27);
                return inflate;
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0b();
    }

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        A0i().setTitle(R.string.f12nameremoved);
    }
}
