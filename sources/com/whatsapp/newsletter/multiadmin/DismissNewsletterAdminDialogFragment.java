package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00T;
import X.AnonymousClass1GQ;
import X.AnonymousClass3LW;
import X.C000800j;
import X.C001400p;
import X.C19730wQ;
import X.C36331k8;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C39001qm;
import X.C65933Ua;
import X.C65993Ug;
import X.C85224Gg;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class DismissNewsletterAdminDialogFragment extends Hilt_DismissNewsletterAdminDialogFragment {
    public C19730wQ A00;
    public AnonymousClass1GQ A01;
    public final AnonymousClass00T A02 = C001400p.A00(C000800j.NONE, new C85224Gg(this));

    public Dialog A1a(Bundle bundle) {
        C19730wQ r1 = this.A00;
        if (r1 != null) {
            boolean A0M = r1.A0M(C36421kH.A0O(this.A02));
            View A0D = C36421kH.A0D(A0h(), R.layout.f9nameremoved);
            TextView A0P = C36391kE.A0P(A0D, R.id.unfollow_newsletter_checkbox);
            A0P.setText(R.string.f12nameremoved);
            C39001qm A04 = AnonymousClass3LW.A04(this);
            int i = R.string.f12nameremoved;
            if (A0M) {
                i = R.string.f12nameremoved;
            }
            A04.A0d(i);
            int i2 = R.string.f12nameremoved;
            if (A0M) {
                i2 = R.string.f12nameremoved;
            }
            A04.A0c(i2);
            if (A0M) {
                AnonymousClass1GQ r0 = this.A01;
                if (r0 == null) {
                    throw C36331k8.A0d("newsletterConfig");
                } else if (r0.A00.A0E(7245)) {
                    A04.A0j(A0D);
                }
            }
            A04.A0m(this, new C65933Ua(A0P, this, 2, A0M), R.string.f12nameremoved);
            A04.A0l(this, new C65993Ug(this, 8), R.string.f12nameremoved);
            return C36371kC.A0O(A04);
        }
        throw C36331k8.A0d("meManager");
    }
}
