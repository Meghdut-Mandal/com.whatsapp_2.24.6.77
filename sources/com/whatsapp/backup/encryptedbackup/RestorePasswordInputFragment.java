package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1N3;
import X.C1496972k;
import X.C24801Dv;
import X.C48732hx;
import X.C90484aE;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public class RestorePasswordInputFragment extends Hilt_RestorePasswordInputFragment {
    public C24801Dv A00;
    public AnonymousClass1N3 A01;

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C90484aE.A18(this.A09, this, R.string.f12nameremoved);
        C90484aE.A18(this.A08, this, R.string.f12nameremoved);
        A1b(new C1496972k(this, 49));
        C90484aE.A18(this.A0C, this, R.string.f12nameremoved);
        this.A0A.setVisibility(0);
        this.A0A.setText(R.string.f12nameremoved);
        C48732hx.A00(this.A0A, this, 23);
    }
}
