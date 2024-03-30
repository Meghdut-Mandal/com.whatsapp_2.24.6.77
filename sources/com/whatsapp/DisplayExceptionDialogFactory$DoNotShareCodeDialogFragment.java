package com.whatsapp;

import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.C20380xT;
import X.C24801Dv;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment extends Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment {
    public C24801Dv A00;
    public C20380xT A01;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        A002.A0d(R.string.f12nameremoved);
        C39001qm.A08(A002, R.string.f12nameremoved);
        A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        A002.A0f(new C89714Xp(A0i, this, 0), R.string.f12nameremoved);
        return A002.create();
    }
}
