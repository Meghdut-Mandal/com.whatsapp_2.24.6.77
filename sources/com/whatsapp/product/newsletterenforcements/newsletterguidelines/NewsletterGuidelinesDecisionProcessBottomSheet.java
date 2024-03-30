package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass3TE;
import X.AnonymousClass3Y5;
import X.C1498072v;
import X.C20810yC;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class NewsletterGuidelinesDecisionProcessBottomSheet extends Hilt_NewsletterGuidelinesDecisionProcessBottomSheet {
    public C33751fs A00;
    public C20810yC A01;
    public C32681e1 A02;
    public final AnonymousClass00T A03 = AnonymousClass3TE.A03(this, "user-report-content-arg", false);
    public final int A04 = R.layout.f9nameremoved;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextView A0P = C36391kE.A0P(view, R.id.bottom_sheet_description);
        View findViewById = view.findViewById(R.id.close_bottom_sheet);
        boolean A1b = C36331k8.A1b(this.A03);
        int i = R.string.f12nameremoved;
        if (A1b) {
            i = R.string.f12nameremoved;
        }
        AnonymousClass01I A0i = A0i();
        C32681e1 r5 = this.A02;
        if (r5 != null) {
            A0P.setText(r5.A03(A0i, new C1498072v(this, A0i, 42), C36401kF.A0q(this, "clickable-span", AnonymousClass001.A0L(), 0, i), "clickable-span", C36341k9.A05(A0i)));
            C20810yC r0 = this.A01;
            if (r0 != null) {
                C36331k8.A10(A0P, r0);
                AnonymousClass3Y5.A00(findViewById, this, 21);
                return;
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0b();
    }

    public int A1i() {
        return this.A04;
    }
}
