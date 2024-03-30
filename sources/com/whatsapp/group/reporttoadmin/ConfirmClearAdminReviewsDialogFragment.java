package com.whatsapp.group.reporttoadmin;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.B83;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class ConfirmClearAdminReviewsDialogFragment extends Hilt_ConfirmClearAdminReviewsDialogFragment {
    public static final void A03(ConfirmClearAdminReviewsDialogFragment confirmClearAdminReviewsDialogFragment, boolean z) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("clear_all_admin_reviews", z);
        confirmClearAdminReviewsDialogFragment.A0l().A0o("confirm_clear_admin_reviews_dialog_result", A07);
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A00 = AnonymousClass3LW.A00(A0i());
        A00.A0L(R.string.f12nameremoved);
        A00.A0K(R.string.f12nameremoved);
        A00.setPositiveButton(R.string.f12nameremoved, new B83(this, 12));
        A00.setNegativeButton(R.string.f12nameremoved, new B83(this, 11));
        AnonymousClass0FM create = A00.create();
        AnonymousClass00C.A08(create);
        return create;
    }
}
