package com.whatsapp.voipcalling;

import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C20380xT;
import X.C24791Du;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class WASecuredDialogFragment extends Hilt_WASecuredDialogFragment {
    public C24791Du A00;
    public C20380xT A01;

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0K(R.string.f12nameremoved);
        A04.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XQ(this, 21));
        A04.A0g(new AnonymousClass4XQ(this, 22), R.string.f12nameremoved);
        return A04.create();
    }
}
