package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass3F7;
import X.AnonymousClass3LW;
import X.AnonymousClass3W0;
import X.AnonymousClass4XO;
import X.C36431kI;
import X.C39001qm;
import X.C590432k;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class OldDeviceMoveAccountConfirmationDialogFragment extends Hilt_OldDeviceMoveAccountConfirmationDialogFragment {
    public final C590432k A00;

    public OldDeviceMoveAccountConfirmationDialogFragment(C590432k r1) {
        this.A00 = r1;
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass3F7 r1 = new AnonymousClass3F7(A1D());
        r1.A02 = 20;
        r1.A06 = A0n(R.string.f12nameremoved);
        r1.A05 = A0n(R.string.f12nameremoved);
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0j(r1.A00());
        A05.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XO(this, 45));
        return C36431kI.A0R(AnonymousClass3W0.A00, A05, R.string.f12nameremoved);
    }
}
