package com.whatsapp.interopui.optout;

import X.AnonymousClass00T;
import X.AnonymousClass3LW;
import X.AnonymousClass4C9;
import X.C36371kC;
import X.C36431kI;
import X.C39001qm;
import X.C66373Vs;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class InteropOptOutDialogFragment extends Hilt_InteropOptOutDialogFragment {
    public final AnonymousClass00T A00 = C36431kI.A1I(new AnonymousClass4C9(this));

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0d(R.string.f12nameremoved);
        A04.A0c(R.string.f12nameremoved);
        C39001qm.A0B(A04, this, 31, R.string.f12nameremoved);
        A04.A0f(C66373Vs.A00, R.string.f12nameremoved);
        return C36371kC.A0O(A04);
    }
}
