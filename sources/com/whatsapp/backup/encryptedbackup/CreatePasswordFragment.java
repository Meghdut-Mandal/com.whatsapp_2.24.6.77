package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00C;
import X.C90484aE;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class CreatePasswordFragment extends Hilt_CreatePasswordFragment {
    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = this.A00;
        TextView textView = this.A09;
        int i2 = R.string.f12nameremoved;
        if (i == 1) {
            i2 = R.string.f12nameremoved;
        }
        C90484aE.A18(textView, this, i2);
        this.A08.setVisibility(4);
        this.A02.setHint(A0a().getResources().getText(R.string.f12nameremoved));
        C90484aE.A18(this.A0C, this, R.string.f12nameremoved);
        A1d(true);
        A1a();
    }
}
