package com.whatsapp.biz.catalog.view;

import X.C115895jc;
import X.C18800tq;
import X.C32541dn;
import X.C32581dr;
import X.C32691e2;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C90464aC;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_PostcodeChangeBottomSheet extends RoundedBottomSheetDialogFragment {
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
            PostcodeChangeBottomSheet postcodeChangeBottomSheet = (PostcodeChangeBottomSheet) this;
            C32581dr r3 = (C32581dr) C36391kE.A0U(this);
            C18800tq r1 = r3.A1K;
            C90464aC.A12(r1.A00, postcodeChangeBottomSheet);
            postcodeChangeBottomSheet.A0A = C36341k9.A0V(r1);
            postcodeChangeBottomSheet.A01 = C36351kA.A0M(r1);
            postcodeChangeBottomSheet.A0C = C90504aG.A0W(r1);
            postcodeChangeBottomSheet.A02 = (C32691e2) r1.A4R.get();
            postcodeChangeBottomSheet.A09 = C36351kA.A0U(r1);
            postcodeChangeBottomSheet.A00 = (C115895jc) r3.A0Z.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.Hilt_PostcodeChangeBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
