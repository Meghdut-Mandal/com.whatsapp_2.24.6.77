package com.whatsapp.privacy.checkup;

import X.AnonymousClass00C;
import X.AnonymousClass3PJ;
import X.C36331k8;
import X.C48792i4;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupAudienceFragment extends PrivacyCheckupBaseFragment {
    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = A0b().getInt("extra_entry_point");
        AnonymousClass3PJ r2 = this.A03;
        if (r2 != null) {
            r2.A02(i, 2);
            A1b(view2, new C48792i4(this, i, 3), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.ic_notif_mark_read);
            A1b(view2, new C48792i4(this, i, 4), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.privacy_checkup_visibility_on);
            A1b(view2, new C48792i4(this, i, 5), R.string.f12nameremoved, R.string.f12nameremoved, R.drawable.privacy_checkup_profile_photo);
            return;
        }
        throw C36331k8.A0d("privacyCheckupWamEventHelper");
    }
}
