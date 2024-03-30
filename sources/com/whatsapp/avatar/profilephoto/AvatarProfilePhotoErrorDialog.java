package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass00T;
import X.AnonymousClass3LW;
import X.AnonymousClass485;
import X.AnonymousClass486;
import X.AnonymousClass487;
import X.AnonymousClass4XV;
import X.C000800j;
import X.C001400p;
import X.C019308f;
import X.C36371kC;
import X.C36441kJ;
import X.C39001qm;
import X.C84724Ei;
import X.C84734Ej;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class AvatarProfilePhotoErrorDialog extends Hilt_AvatarProfilePhotoErrorDialog {
    public final AnonymousClass00T A00;

    public AvatarProfilePhotoErrorDialog() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass486(new AnonymousClass485(this)));
        C019308f A1A = C36441kJ.A1A(AvatarProfilePhotoViewModel.class);
        this.A00 = C36441kJ.A0a(new AnonymousClass487(A002), new C84734Ej(this, A002), new C84724Ei(A002), A1A);
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0c(R.string.f12nameremoved);
        C39001qm.A0I(A04, this, 17, R.string.f12nameremoved);
        A04.A0e(new AnonymousClass4XV(this, 5));
        return C36371kC.A0O(A04);
    }
}
