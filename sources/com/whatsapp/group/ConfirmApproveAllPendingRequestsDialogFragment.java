package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass3LW;
import X.B8F;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConfirmApproveAllPendingRequestsDialogFragment extends Hilt_ConfirmApproveAllPendingRequestsDialogFragment {
    public /* synthetic */ void A1k(Bundle bundle) {
        bundle.putBoolean("is_approve_all_pending_requests", true);
        A0l().A0o("group_join_request_approve_all_pending_requests", bundle);
    }

    public /* synthetic */ void A1l(Bundle bundle) {
        bundle.putBoolean("is_approve_all_pending_requests", false);
        A0l().A0o("group_join_request_approve_all_pending_requests", bundle);
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A00 = AnonymousClass3LW.A00(A0h());
        A00.A0L(R.string.f12nameremoved);
        A00.A0K(R.string.f12nameremoved);
        Bundle A07 = AnonymousClass001.A07();
        A00.setPositiveButton(R.string.f12nameremoved, new B8F(A07, this, 3));
        A00.setNegativeButton(R.string.f12nameremoved, new B8F(A07, this, 4));
        return A00.create();
    }
}
