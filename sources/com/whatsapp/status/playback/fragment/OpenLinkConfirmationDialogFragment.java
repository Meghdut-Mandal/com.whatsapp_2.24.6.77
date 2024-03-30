package com.whatsapp.status.playback.fragment;

import X.AnonymousClass3LW;
import X.AnonymousClass4XP;
import X.C36371kC;
import X.C39001qm;
import X.C89614Xf;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class OpenLinkConfirmationDialogFragment extends Hilt_OpenLinkConfirmationDialogFragment {
    public boolean A1j() {
        return true;
    }

    public Dialog A1a(Bundle bundle) {
        String string = A0b().getString("url");
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0L(R.string.f12nameremoved);
        A04.A0Z(string);
        A04.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XP(this, 47));
        A04.setPositiveButton(R.string.f12nameremoved, new C89614Xf(5, string, this));
        return C36371kC.A0O(A04);
    }
}
