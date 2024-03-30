package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
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

public final class NewsletterGuidelinesRequirementsBottomSheet extends Hilt_NewsletterGuidelinesRequirementsBottomSheet {
    public C33751fs A00;
    public C20810yC A01;
    public C32681e1 A02;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass01I A0i = A0i();
        View findViewById = view.findViewById(R.id.close_bottom_sheet);
        TextView A0P = C36391kE.A0P(view, R.id.bottom_sheet_description);
        C32681e1 r5 = this.A02;
        if (r5 != null) {
            A0P.setText(r5.A03(A0i, new C1498072v(this, A0i, 43), C36401kF.A0q(this, "clickable-span", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "clickable-span", C36341k9.A05(A0i)));
            C20810yC r0 = this.A01;
            if (r0 != null) {
                C36331k8.A10(A0P, r0);
                AnonymousClass3Y5.A00(findViewById, this, 23);
                return;
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0b();
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
