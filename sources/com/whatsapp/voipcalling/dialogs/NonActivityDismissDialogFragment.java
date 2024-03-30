package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class NonActivityDismissDialogFragment extends WaDialogFragment {
    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        C39001qm A04 = AnonymousClass3LW.A04(this);
        C39001qm.A09(A04, A0b.getString("text"));
        if (A0b.getBoolean("dismiss", false)) {
            AnonymousClass4XQ.A00(A04, this, 26, R.string.f12nameremoved);
        }
        return C36371kC.A0O(A04);
    }
}
