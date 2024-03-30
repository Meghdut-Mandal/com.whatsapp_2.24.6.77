package com.whatsapp.payments.ui;

import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C202699mR;
import X.C24631De;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_IndiaUpiQrCodeScannedDialogFragment extends WDSBottomSheetDialogFragment {
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
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = (IndiaUpiQrCodeScannedDialogFragment) this;
            C18800tq r2 = ((C32581dr) ((C32571dq) generatedComponent())).A1K;
            C18830tt r1 = r2.A00;
            C36361kB.A1E(r1, indiaUpiQrCodeScannedDialogFragment);
            indiaUpiQrCodeScannedDialogFragment.A0C = C36351kA.A0V(r2);
            indiaUpiQrCodeScannedDialogFragment.A0D = C36351kA.A0W(r2);
            indiaUpiQrCodeScannedDialogFragment.A0B = C36431kI.A0W(r2);
            indiaUpiQrCodeScannedDialogFragment.A0E = C36341k9.A0T(r2);
            indiaUpiQrCodeScannedDialogFragment.A0N = (C202699mR) r1.A2F.get();
            indiaUpiQrCodeScannedDialogFragment.A0J = C165607th.A0Y(r2);
            indiaUpiQrCodeScannedDialogFragment.A0L = C36371kC.A0h(r2);
            indiaUpiQrCodeScannedDialogFragment.A0K = (C24631De) C165577te.A0f(r2);
            indiaUpiQrCodeScannedDialogFragment.A0M = C165587tf.A0V(r2);
            indiaUpiQrCodeScannedDialogFragment.A0I = C165607th.A0X(r2);
            indiaUpiQrCodeScannedDialogFragment.A0F = C36341k9.A0V(r2);
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiQrCodeScannedDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A06();
        A1h();
    }
}
