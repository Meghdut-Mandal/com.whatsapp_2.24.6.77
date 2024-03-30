package com.whatsapp.voipcalling.dialogs;

import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass3LW;
import X.AnonymousClass3TE;
import X.AnonymousClass3UW;
import X.C36371kC;
import X.C36431kI;
import X.C39001qm;
import X.C65943Ub;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public final class EndCallConfirmationDialogFragment extends Hilt_EndCallConfirmationDialogFragment {
    public final AnonymousClass012 A00;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass00T A01 = AnonymousClass3TE.A01(this, "message");
        Context A0a = A0a();
        C39001qm A002 = AnonymousClass3LW.A00(A0a);
        C39001qm.A09(A002, C36431kI.A1E(A01));
        AnonymousClass012 r3 = this.A00;
        A002.A0m(r3, new C65943Ub(this, 6), R.string.f12nameremoved);
        A002.A0l(r3, new AnonymousClass3UW(A0a, this, 35), R.string.f12nameremoved);
        return C36371kC.A0O(A002);
    }

    public EndCallConfirmationDialogFragment(AnonymousClass012 r1) {
        this.A00 = r1;
    }
}
