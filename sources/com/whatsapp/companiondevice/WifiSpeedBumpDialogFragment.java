package com.whatsapp.companiondevice;

import X.AnonymousClass3LW;
import X.C39001qm;
import X.C587430w;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class WifiSpeedBumpDialogFragment extends Hilt_WifiSpeedBumpDialogFragment {
    public C587430w A00;

    public Dialog A1a(Bundle bundle) {
        C39001qm A02 = AnonymousClass3LW.A02(this);
        A02.A0d(R.string.f12nameremoved);
        A02.A0c(R.string.f12nameremoved);
        C39001qm.A0H(A02, this, 4, R.string.f12nameremoved);
        A02.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        return A02.create();
    }
}
