package com.whatsapp.product.newsletterenforcements.userreports.review;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass011;
import X.AnonymousClass3TE;
import X.C000400e;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import X.C67363Zn;
import X.C89654Xj;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.Map;

public final class NewsletterUserReportsReviewSelectReasonFragment extends WaFragment {
    public NewsletterUserReportsViewModel A00;
    public final AnonymousClass00T A01 = AnonymousClass3TE.A01(this, "arg-report-id");

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        this.A00 = (NewsletterUserReportsViewModel) C36381kD.A0P(this).A00(NewsletterUserReportsViewModel.class);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        WDSButton A0u = C36441kJ.A0u(inflate, R.id.request_review_submit_button);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.request_review_reason_group);
        AnonymousClass011[] r2 = new AnonymousClass011[4];
        C36341k9.A1J(Integer.valueOf(R.string.f12nameremoved), "CLOSE_CHANNEL", r2, 0);
        r2[1] = C36441kJ.A19(Integer.valueOf(R.string.f12nameremoved), "REMOVE_UPDATE");
        r2[2] = C36441kJ.A19(Integer.valueOf(R.string.f12nameremoved), "VIOLATES_GUIDELINES");
        r2[3] = C36441kJ.A19(Integer.valueOf(R.string.f12nameremoved), "FORBIDDEN_UPDATES");
        Iterator A0y = AnonymousClass000.A0y(C000400e.A07(r2));
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            int A0I = AnonymousClass000.A0I(A11.getKey());
            RadioButton radioButton = new RadioButton(new ContextThemeWrapper(A1D(), R.style.f13nameremoved));
            radioButton.setText(A0I);
            radioButton.setOnCheckedChangeListener(new C67363Zn(this, A0u, (String) A11.getValue()));
            radioGroup.addView(radioButton);
        }
        radioGroup.setOnCheckedChangeListener(new C89654Xj(A0u, 6));
        return inflate;
    }

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        A0i().setTitle(R.string.f12nameremoved);
    }
}
