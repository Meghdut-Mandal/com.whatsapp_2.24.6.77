package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.AnonymousClass3TE;
import X.AnonymousClass4RH;
import X.C000800j;
import X.C001400p;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C51872oW;
import X.C65993Ug;
import X.C85214Gf;
import X.C85524Hk;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.List;

public final class AdminInviteErrorDialog extends WaDialogFragment {
    public AnonymousClass4RH A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03 = AnonymousClass3TE.A01(this, "arg_dialog_message");
    public final AnonymousClass00T A04;

    public void A1O(Context context) {
        AnonymousClass4RH r1;
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        if (this.A00 == null) {
            AnonymousClass01I A0h = A0h();
            if (A0h instanceof AnonymousClass4RH) {
                r1 = (AnonymousClass4RH) A0h;
            } else {
                r1 = null;
            }
            this.A00 = r1;
        }
    }

    public AdminInviteErrorDialog() {
        C000800j r2 = C000800j.NONE;
        this.A04 = C001400p.A00(r2, new C85214Gf(this));
        this.A01 = C001400p.A00(r2, new C85524Hk(this, C51872oW.NOT_SUPPORTED));
        this.A02 = AnonymousClass3TE.A00(this, "arg_caption");
    }

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A042 = AnonymousClass3LW.A04(this);
        A042.A0p(C36431kI.A1E(this.A03));
        if (C36401kF.A1a((List) this.A04.getValue())) {
            C39001qm.A05(this, A042, 5, R.string.f12nameremoved);
            A042.A0l(this, new C65993Ug(this, 6), R.string.f12nameremoved);
        } else {
            C39001qm.A05(this, A042, 7, R.string.f12nameremoved);
        }
        return C36371kC.A0O(A042);
    }
}
