package com.whatsapp.community.suspend;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.C33751fs;
import X.C36371kC;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class CommunitySuspendDialogFragment extends Hilt_CommunitySuspendDialogFragment {
    public C33751fs A00;

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        C89714Xp r1 = new C89714Xp(A0i, this, 5);
        A002.A0K(R.string.f12nameremoved);
        A002.setNegativeButton(R.string.f12nameremoved, r1);
        A002.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        return C36371kC.A0O(A002);
    }
}
