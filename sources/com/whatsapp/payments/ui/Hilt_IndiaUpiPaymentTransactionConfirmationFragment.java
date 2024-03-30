package com.whatsapp.payments.ui;

import X.AnonymousClass1Q0;
import X.C165587tf;
import X.C18800tq;
import X.C18830tt;
import X.C32191d8;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_IndiaUpiPaymentTransactionConfirmationFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment = (IndiaUpiPaymentTransactionConfirmationFragment) this;
            C18800tq r1 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C32191d8.A00(indiaUpiPaymentTransactionConfirmationFragment, C18830tt.A85(r1.A00));
            indiaUpiPaymentTransactionConfirmationFragment.A04 = C36351kA.A0V(r1);
            indiaUpiPaymentTransactionConfirmationFragment.A07 = C36341k9.A0V(r1);
            indiaUpiPaymentTransactionConfirmationFragment.A05 = C36351kA.A0W(r1);
            indiaUpiPaymentTransactionConfirmationFragment.A06 = C36341k9.A0T(r1);
            indiaUpiPaymentTransactionConfirmationFragment.A0B = (AnonymousClass1Q0) r1.A0L.get();
            indiaUpiPaymentTransactionConfirmationFragment.A09 = C165587tf.A0V(r1);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
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
            r2.A00()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentTransactionConfirmationFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
