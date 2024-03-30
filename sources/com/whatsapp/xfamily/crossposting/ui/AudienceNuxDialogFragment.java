package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass00C;
import X.AnonymousClass3F7;
import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C36371kC;
import X.C36401kF;
import X.C39001qm;
import X.C602737e;
import X.C65103Qt;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.whatsapp.R;

public final class AudienceNuxDialogFragment extends Hilt_AudienceNuxDialogFragment {
    public final C602737e A00;

    public AudienceNuxDialogFragment(C602737e r1) {
        this.A00 = r1;
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass3F7 r4 = new AnonymousClass3F7(A0a());
        r4.A03 = Integer.valueOf(R.drawable.vec_xfamily_xp_nux_illustration);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C65103Qt.A01(A0a(), 260.0f), C65103Qt.A01(A0a(), 148.0f));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = C65103Qt.A01(A0a(), 20.0f);
        r4.A00 = layoutParams;
        r4.A06 = A0n(R.string.f12nameremoved);
        r4.A05 = A0n(R.string.f12nameremoved);
        r4.A02 = C36401kF.A0j();
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0j(r4.A00());
        AnonymousClass4XQ.A00(A05, this, 34, R.string.f12nameremoved);
        A05.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XQ(this, 33));
        A1g(false);
        AnonymousClass00C.A0D("AudienceNuxDialogFragment Opening audience nux fragment", 0);
        return C36371kC.A0O(A05);
    }
}
