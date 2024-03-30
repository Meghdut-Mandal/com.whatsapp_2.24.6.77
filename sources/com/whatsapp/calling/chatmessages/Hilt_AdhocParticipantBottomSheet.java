package com.whatsapp.calling.chatmessages;

import X.C18800tq;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C58132zN;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.calling.callconfirmationsheet.ui.Hilt_AdhocCallConfirmationSheet;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_AdhocParticipantBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A06() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (this instanceof Hilt_AdhocCallConfirmationSheet) {
            Hilt_AdhocCallConfirmationSheet hilt_AdhocCallConfirmationSheet = (Hilt_AdhocCallConfirmationSheet) this;
            if (!hilt_AdhocCallConfirmationSheet.A00) {
                hilt_AdhocCallConfirmationSheet.A00 = true;
                C32581dr r2 = (C32581dr) C36391kE.A0U(hilt_AdhocCallConfirmationSheet);
                C18800tq r1 = r2.A1K;
                hilt_AdhocCallConfirmationSheet.A07 = C36331k8.A0E(r1, r1.A00, hilt_AdhocCallConfirmationSheet);
                hilt_AdhocCallConfirmationSheet.A08 = C36351kA.A0q(r1);
                hilt_AdhocCallConfirmationSheet.A04 = (C58132zN) r2.A0C.get();
                hilt_AdhocCallConfirmationSheet.A03 = C36351kA.A0J(r1);
            }
        } else if (!this.A02) {
            this.A02 = true;
            AdhocParticipantBottomSheet adhocParticipantBottomSheet = (AdhocParticipantBottomSheet) this;
            C32581dr r3 = (C32581dr) C36391kE.A0U(this);
            C18800tq r12 = r3.A1K;
            adhocParticipantBottomSheet.A07 = C36331k8.A0E(r12, r12.A00, adhocParticipantBottomSheet);
            adhocParticipantBottomSheet.A08 = C36351kA.A0q(r12);
            adhocParticipantBottomSheet.A04 = (C58132zN) r3.A0C.get();
            adhocParticipantBottomSheet.A03 = C36351kA.A0J(r12);
        }
    }

    public Hilt_AdhocParticipantBottomSheet() {
        super(R.layout.f9nameremoved);
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A06();
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
            r2.A06()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.Hilt_AdhocParticipantBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A06();
        A1h();
    }
}
