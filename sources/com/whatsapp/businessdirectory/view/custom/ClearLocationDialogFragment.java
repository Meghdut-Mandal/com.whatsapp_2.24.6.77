package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass3LW;
import X.AnonymousClass66G;
import X.C012005e;
import X.C36361kB;
import X.C36421kH;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public class ClearLocationDialogFragment extends Hilt_ClearLocationDialogFragment {
    public AnonymousClass66G A00;

    public Dialog A1a(Bundle bundle) {
        View A0D = C36421kH.A0D(A0a(), R.layout.f9nameremoved);
        View A02 = C012005e.A02(A0D, R.id.clear_btn);
        View A022 = C012005e.A02(A0D, R.id.cancel_btn);
        C36361kB.A18(A02, this, 39);
        C36361kB.A18(A022, this, 40);
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0j(A0D);
        A04.A0r(true);
        return A04.create();
    }
}
