package com.whatsapp.invites;

import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C65383Rv;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_SMSPreviewInviteBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = (SMSPreviewInviteBottomSheetFragment) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0U(this)).A1K;
            C18830tt r1 = r2.A00;
            C36361kB.A1E(r1, sMSPreviewInviteBottomSheetFragment);
            sMSPreviewInviteBottomSheetFragment.A00 = C36351kA.A0M(r2);
            sMSPreviewInviteBottomSheetFragment.A0A = C36341k9.A0Z(r2);
            sMSPreviewInviteBottomSheetFragment.A01 = C36351kA.A0N(r2);
            sMSPreviewInviteBottomSheetFragment.A07 = C36351kA.A0a(r2);
            sMSPreviewInviteBottomSheetFragment.A09 = C36361kB.A0c(r2);
            sMSPreviewInviteBottomSheetFragment.A04 = C36351kA.A0T(r2);
            sMSPreviewInviteBottomSheetFragment.A03 = C36341k9.A0S(r2);
            sMSPreviewInviteBottomSheetFragment.A02 = C36341k9.A0R(r2);
            sMSPreviewInviteBottomSheetFragment.A06 = C36341k9.A0T(r2);
            sMSPreviewInviteBottomSheetFragment.A05 = (C65383Rv) r1.A2M.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A05();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A05()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.invites.Hilt_SMSPreviewInviteBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
