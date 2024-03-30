package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass01I;
import X.AnonymousClass223;
import X.AnonymousClass4XV;
import X.C19970wo;
import X.C21060yb;
import X.C21360z5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment {
    public boolean A00 = true;
    public C21360z5 A01;
    public C21060yb A02;
    public C19970wo A03;

    public Dialog A1a(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        AnonymousClass01I A0i = A0i();
        AnonymousClass223 r1 = new AnonymousClass223(A0i, this.A01, this.A02, this.A03, this.A01);
        AnonymousClass4XV.A00(r1, A0i, 1);
        return r1;
    }

    public void A1L() {
        super.A1L();
        if (!this.A01.A03()) {
            A1b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00 = false;
        A1b();
        new DisplayExceptionDialogFactory$ClockWrongDialogFragment().A1f(A0i().getSupportFragmentManager(), AnonymousClass000.A0k(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A00 && A0h() != null) {
            A0i().finish();
        }
    }
}
