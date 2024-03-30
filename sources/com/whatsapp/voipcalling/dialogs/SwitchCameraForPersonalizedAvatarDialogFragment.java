package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass3TE;
import X.C158687hu;
import X.C163297py;
import X.C36331k8;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class SwitchCameraForPersonalizedAvatarDialogFragment extends Hilt_SwitchCameraForPersonalizedAvatarDialogFragment {
    public C158687hu A00;
    public final AnonymousClass00T A01 = AnonymousClass3TE.A02(this, "use_case", -1);

    public Dialog A1a(Bundle bundle) {
        AnonymousClass00T r3 = this.A01;
        if (C36331k8.A02(r3) != -1) {
            C39001qm A04 = AnonymousClass3LW.A04(this);
            int A02 = C36331k8.A02(r3);
            int i = R.string.f12nameremoved;
            if (A02 == 0) {
                i = R.string.f12nameremoved;
            }
            A04.A0d(i);
            int A022 = C36331k8.A02(r3);
            int i2 = R.string.f12nameremoved;
            if (A022 == 0) {
                i2 = R.string.f12nameremoved;
            }
            A04.A0c(i2);
            C163297py.A00(A04, this, 43, R.string.f12nameremoved);
            C163297py.A01(A04, this, 44, R.string.f12nameremoved);
            AnonymousClass0FM create = A04.create();
            AnonymousClass00C.A08(create);
            return create;
        }
        throw AnonymousClass001.A09("Use case must be switch to front camera(0) or switch to back camera(1).");
    }
}
