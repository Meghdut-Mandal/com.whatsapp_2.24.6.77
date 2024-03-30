package com.whatsapp.product.integrityappeals;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass011;
import X.AnonymousClass155;
import X.AnonymousClass3YH;
import X.AnonymousClass4D0;
import X.AnonymousClass4L1;
import X.C000400e;
import X.C10810fG;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C65993Ug;
import X.C67353Zm;
import X.C84364Cy;
import X.C84374Cz;
import X.C85374Gv;
import X.C89354Wf;
import X.C89654Xj;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class NewsletterRequestReviewSelectReasonActivity extends AnonymousClass155 {
    public boolean A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public NewsletterRequestReviewSelectReasonActivity(int i) {
        this.A00 = false;
        C89354Wf.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A2u();
        boolean A1W = C36381kD.A1W(this);
        setContentView((int) R.layout.f9nameremoved);
        C65993Ug.A00(this, ((NewsletterRequestReviewViewModel) this.A02.getValue()).A00, new AnonymousClass4L1(this), 36);
        View findViewById = this.A00.findViewById(R.id.request_review_submit_button);
        RadioGroup radioGroup = (RadioGroup) this.A00.findViewById(R.id.request_review_reason_group);
        AnonymousClass011[] r3 = new AnonymousClass011[4];
        C36341k9.A1J(Integer.valueOf(R.string.f12nameremoved), "UNJUSTIFIED_SUSPENSION", r3, 0);
        C36341k9.A1J(Integer.valueOf(R.string.f12nameremoved), "MISUNDERSTOOD_UPDATES", r3, A1W ? 1 : 0);
        C36341k9.A1J(Integer.valueOf(R.string.f12nameremoved), "FOLLOWED_GUIDELINES", r3, 2);
        C36341k9.A1J(Integer.valueOf(R.string.f12nameremoved), "ALLOWED_UPDATES", r3, 3);
        LinkedHashMap A07 = C000400e.A07(r3);
        C10810fG r5 = new C10810fG();
        r5.element = "UNKNOWN";
        Iterator A0y = AnonymousClass000.A0y(A07);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            int A0I = AnonymousClass000.A0I(A11.getKey());
            RadioButton radioButton = new RadioButton(new ContextThemeWrapper(this, R.style.f13nameremoved));
            radioButton.setText(A0I);
            radioButton.setOnCheckedChangeListener(new C67353Zm((String) A11.getValue(), r5));
            radioGroup.addView(radioButton);
        }
        radioGroup.setOnCheckedChangeListener(new C89654Xj(findViewById, 5));
        AnonymousClass3YH.A00(findViewById, this, r5, 16);
    }

    public NewsletterRequestReviewSelectReasonActivity() {
        this(0);
        this.A02 = C36441kJ.A0a(new AnonymousClass4D0(this), new C84374Cz(this), new C85374Gv(this), C36441kJ.A1A(NewsletterRequestReviewViewModel.class));
        this.A01 = C36431kI.A1I(new C84364Cy(this));
    }
}
