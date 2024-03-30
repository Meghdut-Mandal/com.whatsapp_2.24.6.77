package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04S;
import X.AnonymousClass3LW;
import X.C36371kC;
import X.C39001qm;
import X.C55422ub;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class UnarchiveForQuickLockDialogFragment extends Hilt_UnarchiveForQuickLockDialogFragment {
    public boolean A00;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("UnarchiveForQuickLockDialogFragment_result_key", this.A00);
        A0l().A0o("UnarchiveForQuickLockDialogFragment_request_key", A07);
        super.onDismiss(dialogInterface);
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0c(R.string.f12nameremoved);
        A04.A0l(this, (AnonymousClass04S) null, R.string.f12nameremoved);
        A04.A0m(this, new C55422ub(this, 24), R.string.f12nameremoved);
        return C36371kC.A0O(A04);
    }
}
