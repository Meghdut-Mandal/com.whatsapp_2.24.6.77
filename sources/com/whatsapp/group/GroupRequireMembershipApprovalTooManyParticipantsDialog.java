package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.B8F;
import X.C36341k9;
import X.C39001qm;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class GroupRequireMembershipApprovalTooManyParticipantsDialog extends WaDialogFragment {
    public static final void A03(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean("is_approve_all_pending_requests", true);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0l().A0o("group_join_request_group_too_full", bundle);
    }

    public static final void A05(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean("is_approve_all_pending_requests", false);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0l().A0o("group_join_request_group_too_full", bundle);
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        int i2;
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0L(R.string.f12nameremoved);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("remaining_capacity");
        } else {
            i = 0;
        }
        Bundle bundle3 = this.A0A;
        if (bundle3 != null) {
            i2 = bundle3.getInt("pending_request_count");
        } else {
            i2 = 0;
        }
        Resources A0G = C36341k9.A0G(this);
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1L(A0M, i, 0);
        AnonymousClass000.A1L(A0M, i2, 1);
        A04.A0Z(A0G.getQuantityString(R.plurals.f10nameremoved, i2, A0M));
        Bundle A07 = AnonymousClass001.A07();
        A04.setPositiveButton(R.string.f12nameremoved, new B8F(this, A07, 5));
        A04.setNegativeButton(R.string.f12nameremoved, new B8F(this, A07, 6));
        AnonymousClass0FM create = A04.create();
        AnonymousClass00C.A08(create);
        return create;
    }
}
