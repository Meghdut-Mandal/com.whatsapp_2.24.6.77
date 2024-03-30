package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass1LU;
import X.AnonymousClass3LW;
import X.AnonymousClass4RX;
import X.AnonymousClass4XO;
import X.C19460v5;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class WebCodeDialogFragment extends Hilt_WebCodeDialogFragment {
    public C19460v5 A00;
    public AnonymousClass1LU A01;
    public AnonymousClass4RX A02;

    public void A19() {
        this.A02 = null;
        super.A19();
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass4RX) {
            this.A02 = (AnonymousClass4RX) context;
        }
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0L(R.string.f12nameremoved);
        A04.A0K(R.string.f12nameremoved);
        C36371kC.A15(new AnonymousClass4XO(this, 9), A04, R.string.f12nameremoved);
        return A04.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass4RX r0 = this.A02;
        if (r0 != null) {
            r0.Bdw();
        }
    }
}
