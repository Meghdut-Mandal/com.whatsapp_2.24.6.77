package com.whatsapp.backup.google;

import X.AnonymousClass4XV;
import X.C36571kW;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class BaseNewUserSetupActivity$AuthRequestDialogFragment extends Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment {
    public Dialog A1a(Bundle bundle) {
        C36571kW r2 = new C36571kW(A1D());
        r2.setTitle(R.string.f12nameremoved);
        r2.setIndeterminate(true);
        r2.setMessage(A0n(R.string.f12nameremoved));
        r2.setCancelable(true);
        AnonymousClass4XV.A00(r2, this, 6);
        return r2;
    }
}
