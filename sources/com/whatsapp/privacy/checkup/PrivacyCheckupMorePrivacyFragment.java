package com.whatsapp.privacy.checkup;

import X.AnonymousClass00C;
import X.AnonymousClass3PJ;
import X.C19730wQ;
import X.C20810yC;
import X.C235618y;
import X.C24431Ck;
import X.C36321k7;
import X.C36331k8;
import X.C48792i4;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupMorePrivacyFragment extends Hilt_PrivacyCheckupMorePrivacyFragment {
    public C19730wQ A00;
    public C24431Ck A01;
    public C235618y A02;

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = A0b().getInt("extra_entry_point");
        AnonymousClass3PJ r1 = this.A03;
        if (r1 != null) {
            r1.A02(i, 3);
            C19730wQ r0 = this.A00;
            if (r0 != null) {
                if (!r0.A0L()) {
                    A1b(view2, new C48792i4(this, i, 13), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.privacy_checkup_settings_privacy);
                }
                C20810yC r12 = this.A01;
                if (r12 != null) {
                    boolean A0E = r12.A0E(3823);
                    if (this.A02 != null) {
                        int i2 = R.string.f12nameremoved;
                        int i3 = R.string.f12nameremoved;
                        if (A0E) {
                            i2 = R.string.f12nameremoved;
                            i3 = R.string.f12nameremoved;
                        }
                        A1b(view2, new C48792i4(this, i, 14), i2, i3, R.drawable.ic_group_ephemeral_v2);
                        return;
                    }
                    throw C36331k8.A0d("businessCoexUtils");
                }
                throw C36321k7.A07();
            }
            throw C36331k8.A0d("meManager");
        }
        throw C36331k8.A0d("privacyCheckupWamEventHelper");
    }
}
