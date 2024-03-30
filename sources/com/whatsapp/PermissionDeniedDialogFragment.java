package com.whatsapp;

import X.AnonymousClass3LW;
import X.AnonymousClass3VT;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;

public final class PermissionDeniedDialogFragment extends Hilt_PermissionDeniedDialogFragment {
    public Dialog A1a(Bundle bundle) {
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0L(R.string.f12nameremoved);
        A05.A0K(R.string.f12nameremoved);
        A05.setPositiveButton(R.string.f12nameremoved, AnonymousClass3VT.A00);
        return C36371kC.A0O(A05);
    }
}
