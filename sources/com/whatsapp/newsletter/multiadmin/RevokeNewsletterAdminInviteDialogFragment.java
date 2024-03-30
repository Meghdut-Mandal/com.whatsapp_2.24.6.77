package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.AnonymousClass3TE;
import X.AnonymousClass4RK;
import X.C000800j;
import X.C001400p;
import X.C36371kC;
import X.C36401kF;
import X.C39001qm;
import X.C65993Ug;
import X.C85274Gl;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public final class RevokeNewsletterAdminInviteDialogFragment extends Hilt_RevokeNewsletterAdminInviteDialogFragment {
    public AnonymousClass4RK A00;
    public final AnonymousClass00T A01 = C001400p.A00(C000800j.NONE, new C85274Gl(this));
    public final AnonymousClass00T A02 = AnonymousClass3TE.A01(this, "arg_contact_name");

    public void A1O(Context context) {
        AnonymousClass4RK r1;
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        if (this.A00 == null) {
            AnonymousClass01I A0h = A0h();
            if (A0h instanceof AnonymousClass4RK) {
                r1 = (AnonymousClass4RK) A0h;
            } else {
                r1 = null;
            }
            this.A00 = r1;
        }
    }

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        AnonymousClass00T r4 = this.A02;
        A04.A0q(C36401kF.A0q(this, r4.getValue(), new Object[1], 0, R.string.f12nameremoved));
        A04.A0p(C36401kF.A0q(this, r4.getValue(), new Object[1], 0, R.string.f12nameremoved));
        C39001qm.A05(this, A04, 11, R.string.f12nameremoved);
        A04.A0l(this, new C65993Ug(this, 10), R.string.f12nameremoved);
        return C36371kC.A0O(A04);
    }
}
