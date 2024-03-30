package com.whatsapp.product.integrityappeals;

import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass3Y5;
import X.C1497372o;
import X.C18800tq;
import X.C18830tt;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C84354Cx;
import X.C89354Wf;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class NewsletterRequestReviewActivity extends AnonymousClass155 {
    public C33751fs A00;
    public C32681e1 A01;
    public boolean A02;
    public final AnonymousClass00T A03;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A2u();
        int A1W = C36381kD.A1W(this);
        setContentView((int) R.layout.f9nameremoved);
        TextView A0P = C36391kE.A0P(this.A00, R.id.request_review_description);
        View findViewById = this.A00.findViewById(R.id.request_review_next_screen);
        C32681e1 r6 = this.A01;
        if (r6 != null) {
            A0P.setText(r6.A03(this, new C1497372o(this, 31), C36391kE.A0v(this, "clickable-span", new Object[A1W], 0, R.string.f12nameremoved), "clickable-span", C36341k9.A05(this)));
            C36331k8.A10(A0P, this.A0D);
            AnonymousClass3Y5.A00(findViewById, this, 18);
            return;
        }
        throw C36331k8.A0b();
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36351kA.A0p(r1);
            this.A00 = C36361kB.A0X(r1);
        }
    }

    public NewsletterRequestReviewActivity(int i) {
        this.A02 = false;
        C89354Wf.A00(this, 14);
    }

    public NewsletterRequestReviewActivity() {
        this(0);
        this.A03 = C36431kI.A1I(new C84354Cx(this));
    }
}
