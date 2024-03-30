package com.whatsapp.privacy.checkup;

import X.AnonymousClass00C;
import X.AnonymousClass18U;
import X.AnonymousClass3PJ;
import X.C19730wQ;
import X.C36331k8;
import X.C36421kH;
import X.C48792i4;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupMoreSecurityFragment extends Hilt_PrivacyCheckupMoreSecurityFragment {
    public C19730wQ A00;
    public AnonymousClass18U A01;

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = A0b().getInt("extra_entry_point");
        AnonymousClass3PJ r2 = this.A03;
        if (r2 != null) {
            r2.A02(i, 4);
            C19730wQ r0 = this.A00;
            if (r0 != null) {
                if (!r0.A0L()) {
                    A1b(view2, new C48792i4(this, i, 15), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.privacy_checkup_settings_pin);
                }
                AnonymousClass18U r02 = this.A01;
                if (r02 == null) {
                    throw C36331k8.A0d("appAuthManager");
                } else if (r02.A05()) {
                    AnonymousClass18U r03 = this.A01;
                    if (r03 != null) {
                        boolean A1W = C36421kH.A1W(r03);
                        int i2 = R.string.f12nameremoved;
                        if (A1W) {
                            i2 = R.string.f12nameremoved;
                        }
                        A1b(view2, new C48792i4(this, i, 16), i2, R.string.f12nameremoved, R.drawable.privacy_checkup_fingerprint);
                        return;
                    }
                    throw C36331k8.A0d("appAuthManager");
                }
            } else {
                throw C36331k8.A0d("meManager");
            }
        } else {
            throw C36331k8.A0d("privacyCheckupWamEventHelper");
        }
    }
}
