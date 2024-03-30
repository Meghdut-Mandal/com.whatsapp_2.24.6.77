package com.whatsapp.phonematching;

import X.AnonymousClass01z;
import X.C36331k8;
import X.C36381kD;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConnectionProgressDialogFragment extends Hilt_ConnectionProgressDialogFragment {
    public Dialog A1a(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A0h());
        C36331k8.A0p(progressDialog, A0n(R.string.f12nameremoved));
        return progressDialog;
    }

    public void A1f(AnonymousClass01z r1, String str) {
        C36381kD.A1F(this, r1, str);
    }
}
