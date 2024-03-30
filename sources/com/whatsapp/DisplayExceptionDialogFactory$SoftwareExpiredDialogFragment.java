package com.whatsapp;

import X.AnonymousClass01I;
import X.AnonymousClass225;
import X.AnonymousClass4XV;
import X.C19970wo;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C21360z5;
import X.C24801Dv;
import X.C33751fs;
import X.C33771fu;
import X.C36341k9;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment {
    public C24801Dv A00;
    public C21360z5 A01;
    public C33771fu A02;
    public C33751fs A03;
    public C21060yb A04;
    public C19970wo A05;
    public C21010yW A06;

    public Dialog A1a(Bundle bundle) {
        Log.w("home/dialog software-expired");
        AnonymousClass01I A0i = A0i();
        C19970wo r8 = this.A05;
        C20810yC r10 = this.A02;
        C33771fu r5 = this.A02;
        C21010yW r11 = this.A06;
        C21360z5 r4 = this.A01;
        AnonymousClass225 r1 = new AnonymousClass225(A0i, this.A00, r4, r5, this.A03, this.A04, r8, this.A01, r10, r11);
        AnonymousClass4XV.A00(r1, A0i, 2);
        return r1;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C36341k9.A15(this);
    }
}
