package com.whatsapp.textstatuscomposer;

import X.AnonymousClass3LW;
import X.AnonymousClass3V9;
import X.AnonymousClass4XQ;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class DiscardWarningDialogFragment extends Hilt_DiscardWarningDialogFragment {
    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        boolean z = A0b.getBoolean("back_button_pressed", false);
        int i = A0b.getInt("content", 1);
        int i2 = R.string.f12nameremoved;
        if (i == 1) {
            i2 = R.string.f12nameremoved;
        }
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0K(i2);
        A04.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XQ(this, 10));
        A04.setPositiveButton(R.string.f12nameremoved, new AnonymousClass3V9(this, i, z));
        return C36371kC.A0O(A04);
    }
}
