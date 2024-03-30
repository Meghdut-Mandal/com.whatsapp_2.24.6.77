package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass4SU;
import X.AnonymousClass4XQ;
import X.C19420v0;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class SwitchConfirmationFragment extends Hilt_SwitchConfirmationFragment {
    public C19420v0 A00;
    public final AnonymousClass4SU A01;

    public SwitchConfirmationFragment(AnonymousClass4SU r1) {
        this.A01 = r1;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0K(R.string.f12nameremoved);
        C36371kC.A15(new AnonymousClass4XQ(this, 30), A04, R.string.f12nameremoved);
        AnonymousClass0FM A0O = C36371kC.A0O(A04);
        A0O.setCanceledOnTouchOutside(true);
        return A0O;
    }
}
