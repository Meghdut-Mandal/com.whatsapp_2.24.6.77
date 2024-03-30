package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass1CF;
import X.AnonymousClass3DY;
import X.AnonymousClass3LW;
import X.AnonymousClass4XN;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class PaymentsUnavailableDialogFragment extends Hilt_PaymentsUnavailableDialogFragment {
    public AnonymousClass3DY A00;
    public AnonymousClass1CF A01;

    public static PaymentsUnavailableDialogFragment A03() {
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("arg_is_underage_unavailability", false);
        paymentsUnavailableDialogFragment.A17(A07);
        return paymentsUnavailableDialogFragment;
    }

    public static PaymentsUnavailableDialogFragment A05() {
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("arg_is_underage_unavailability", true);
        paymentsUnavailableDialogFragment.A17(A07);
        return paymentsUnavailableDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        boolean z;
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            z = bundle2.getBoolean("arg_is_underage_unavailability");
        } else {
            z = false;
        }
        C39001qm A03 = AnonymousClass3LW.A03(this);
        A03.A0d(R.string.f12nameremoved);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        A03.A0c(i);
        A03.A0r(false);
        int i2 = R.string.f12nameremoved;
        if (z) {
            i2 = R.string.f12nameremoved;
        }
        A03.A0h((DialogInterface.OnClickListener) null, i2);
        if (z) {
            A03.A0g(new AnonymousClass4XN(this, 46), R.string.f12nameremoved);
        }
        return A03.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            A0h.finish();
        }
    }
}
