package com.whatsapp;

import X.AnonymousClass3LW;
import X.AnonymousClass3VV;
import X.C20060wx;
import X.C36331k8;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;

public final class SdCardUnavailableDialogFragment extends Hilt_SdCardUnavailableDialogFragment {
    public C20060wx A00;

    public Dialog A1a(Bundle bundle) {
        if (this.A00 != null) {
            boolean A002 = C20060wx.A00();
            C39001qm A05 = AnonymousClass3LW.A05(this);
            int i = R.string.f12nameremoved;
            if (A002) {
                i = R.string.f12nameremoved;
            }
            A05.A0L(i);
            int i2 = R.string.f12nameremoved;
            if (A002) {
                i2 = R.string.f12nameremoved;
            }
            A05.A0K(i2);
            A05.setPositiveButton(R.string.f12nameremoved, AnonymousClass3VV.A00);
            return C36371kC.A0O(A05);
        }
        throw C36331k8.A0d("storageUtils");
    }
}
