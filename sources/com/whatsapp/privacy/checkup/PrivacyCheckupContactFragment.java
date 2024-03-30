package com.whatsapp.privacy.checkup;

import X.AnonymousClass00C;
import X.AnonymousClass3PJ;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C48792i4;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupContactFragment extends PrivacyCheckupBaseFragment {
    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = A0b().getInt("extra_entry_point");
        AnonymousClass3PJ r2 = this.A03;
        if (r2 != null) {
            r2.A02(i, 1);
            A1b(view2, new C48792i4(this, i, 6), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.privacy_checkup_blocked_user);
            C20810yC r22 = this.A01;
            if (r22 != null) {
                if (r22.A0E(3897)) {
                    A1b(view2, new C48792i4(this, i, 7), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.ic_inline_mute);
                }
                A1b(view2, new C48792i4(this, i, 8), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.privacy_checkup_new_group);
                return;
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0d("privacyCheckupWamEventHelper");
    }
}
