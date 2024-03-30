package com.whatsapp.privacy.checkup;

import X.AnonymousClass00C;
import X.AnonymousClass3PJ;
import X.C165737u4;
import X.C203529oE;
import X.C222013h;
import X.C36331k8;
import X.C36341k9;
import X.C48792i4;
import X.C90184Zk;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

public final class PrivacyCheckupHomeFragment extends PrivacyCheckupBaseFragment {
    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = A0b().getInt("extra_entry_point");
        AnonymousClass3PJ r1 = this.A03;
        if (r1 != null) {
            r1.A02(i, 0);
            A1b(view2, new C48792i4(this, i, 9), R.string.f12nameremoved, 0, R.drawable.privacy_checkup_lock_person);
            A1b(view2, new C48792i4(this, i, 10), R.string.f12nameremoved, 0, R.drawable.ic_action_compose_dark);
            A1b(view2, new C48792i4(this, i, 11), R.string.f12nameremoved, 0, R.drawable.privacy_checkup_settings_name);
            A1b(view2, new C48792i4(this, i, 12), R.string.f12nameremoved, 0, R.drawable.privacy_checkup_perm_phone_msg);
            if (C222013h.A05) {
                ImageView A0L = C36341k9.A0L(view, R.id.header_image);
                C165737u4 r3 = new C165737u4();
                C203529oE.A06(A0a(), R.raw.wds_anim_privacy_checkup).A02(new C90184Zk(r3, 1));
                A0L.setImageDrawable(r3);
                r3.A07();
                return;
            }
            return;
        }
        throw C36331k8.A0d("privacyCheckupWamEventHelper");
    }
}
