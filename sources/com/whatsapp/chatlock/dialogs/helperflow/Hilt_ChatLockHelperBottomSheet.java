package com.whatsapp.chatlock.dialogs.helperflow;

import X.C18800tq;
import X.C231517j;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_ChatLockHelperBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            ChatLockHelperBottomSheet chatLockHelperBottomSheet = (ChatLockHelperBottomSheet) this;
            C32581dr r3 = (C32581dr) C36391kE.A0U(this);
            C18800tq r1 = r3.A1K;
            chatLockHelperBottomSheet.A06 = C36331k8.A0E(r1, r1.A00, chatLockHelperBottomSheet);
            chatLockHelperBottomSheet.A09 = C36341k9.A0Z(r1);
            chatLockHelperBottomSheet.A05 = (C231517j) r1.AFl.get();
            chatLockHelperBottomSheet.A03 = C27111My.A1B(r3.A1I);
            chatLockHelperBottomSheet.A08 = C36411kG.A0q(r1);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A03();
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
            r2.A03()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatlock.dialogs.helperflow.Hilt_ChatLockHelperBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
