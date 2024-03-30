package com.whatsapp.calling.views;

import X.AnonymousClass3LW;
import X.AnonymousClass4XL;
import X.C21060yb;
import X.C34681hT;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;

public class AppSettingsWarningDialogFragment extends Hilt_AppSettingsWarningDialogFragment {
    public int A00;
    public C21060yb A01;

    public void A1L() {
        super.A1L();
        if (!C34681hT.A0F(this.A01)) {
            A1b();
        }
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        int i2;
        this.A00 = A0b().getInt("reason", 0);
        C39001qm A05 = AnonymousClass3LW.A05(this);
        int i3 = this.A00;
        int i4 = R.string.f12nameremoved;
        if (i3 == 1) {
            i4 = R.string.f12nameremoved;
        }
        A05.A0d(i4);
        int i5 = this.A00;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 == 31) {
                i = R.string.f12nameremoved;
                if (i5 == 1) {
                    i = R.string.f12nameremoved;
                }
            } else if (i6 >= 28 && i6 <= 30) {
                i = R.string.f12nameremoved;
                if (i5 == 1) {
                    i = R.string.f12nameremoved;
                }
            }
            A05.A0c(i);
            if (this.A00 == 1 || ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && (i2 = Build.VERSION.SDK_INT) >= 28 && i2 <= 31)) {
                A05.setPositiveButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 31));
            }
            return C36431kI.A0R(AnonymousClass4XL.A00(this, 30), A05, R.string.f12nameremoved);
        }
        i = R.string.f12nameremoved;
        if (i5 == 1) {
            i = R.string.f12nameremoved;
        }
        A05.A0c(i);
        A05.setPositiveButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 31));
        return C36431kI.A0R(AnonymousClass4XL.A00(this, 30), A05, R.string.f12nameremoved);
    }
}
