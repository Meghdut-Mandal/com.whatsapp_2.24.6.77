package com.whatsapp;

import X.AnonymousClass3LW;
import X.C36341k9;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment {
    public Dialog A1a(Bundle bundle) {
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0d(R.string.f12nameremoved);
        A05.A0c(R.string.device_unsupported);
        A05.A0r(false);
        A05.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        return A05.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C36341k9.A15(this);
    }
}
