package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00C;
import X.C90484aE;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class ConfirmPasswordFragment extends Hilt_ConfirmPasswordFragment {
    public String A00;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A00 = (String) this.A03.A05.A04();
        int i = this.A00;
        TextView textView = this.A09;
        int i2 = R.string.f12nameremoved;
        if (i == 1) {
            i2 = R.string.f12nameremoved;
        }
        C90484aE.A18(textView, this, i2);
        C90484aE.A18(this.A08, this, R.string.f12nameremoved);
        C90484aE.A18(this.A0C, this, R.string.f12nameremoved);
        A1d(true);
        A1a();
    }
}
