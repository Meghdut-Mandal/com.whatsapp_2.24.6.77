package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass3LW;
import X.AnonymousClass4RX;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ErrorDialogFragment extends Hilt_ErrorDialogFragment {
    public AnonymousClass4RX A00;

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass4RX) {
            this.A00 = (AnonymousClass4RX) context;
        }
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        int i2 = A0b().getInt("ARG_ERROR_CODE");
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        switch (i2) {
            case 2:
                A04.A0L(R.string.f12nameremoved);
                A04.A0Z(A0n(R.string.f12nameremoved));
                break;
            case 3:
                i = R.string.f12nameremoved;
                break;
            case 4:
                i = R.string.f12nameremoved;
                break;
            case 5:
                i = R.string.f12nameremoved;
                break;
            case 6:
                i = R.string.f12nameremoved;
                break;
            case 7:
                i = R.string.f12nameremoved;
                break;
            default:
                i = R.string.f12nameremoved;
                break;
        }
        A04.A0K(i);
        return A04.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass4RX r0 = this.A00;
        if (r0 != null) {
            r0.Bdw();
        }
    }
}
