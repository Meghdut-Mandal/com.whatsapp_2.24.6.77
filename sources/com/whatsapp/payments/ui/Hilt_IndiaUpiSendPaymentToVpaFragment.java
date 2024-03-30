package com.whatsapp.payments.ui;

import X.AnonymousClass5GM;
import X.C165587tf;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C196129Xv;
import X.C199499fP;
import X.C200169gl;
import X.C202269lR;
import X.C24881Ed;
import X.C29221Vu;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_IndiaUpiSendPaymentToVpaFragment extends WaFragment {
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
            IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this;
            C18800tq r3 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C18830tt A0Q = C36371kC.A0Q(r3, indiaUpiSendPaymentToVpaFragment);
            indiaUpiSendPaymentToVpaFragment.A0M = C90504aG.A0W(r3);
            indiaUpiSendPaymentToVpaFragment.A03 = C36351kA.A0M(r3);
            indiaUpiSendPaymentToVpaFragment.A07 = C36341k9.A0V(r3);
            indiaUpiSendPaymentToVpaFragment.A0N = C36341k9.A0Z(r3);
            indiaUpiSendPaymentToVpaFragment.A08 = C36361kB.A0c(r3);
            indiaUpiSendPaymentToVpaFragment.A04 = C36341k9.A0T(r3);
            indiaUpiSendPaymentToVpaFragment.A0L = C165587tf.A0Z(r3);
            indiaUpiSendPaymentToVpaFragment.A0B = C165607th.A0W(A0Q);
            indiaUpiSendPaymentToVpaFragment.A0J = (C200169gl) A0Q.A98.get();
            indiaUpiSendPaymentToVpaFragment.A0C = (C202269lR) r3.A48.get();
            indiaUpiSendPaymentToVpaFragment.A09 = (C199499fP) A0Q.A5B.get();
            indiaUpiSendPaymentToVpaFragment.A0F = C165587tf.A0T(r3);
            indiaUpiSendPaymentToVpaFragment.A06 = C165587tf.A0Q(r3);
            indiaUpiSendPaymentToVpaFragment.A05 = (C24881Ed) r3.A6H.get();
            indiaUpiSendPaymentToVpaFragment.A0H = C165587tf.A0V(r3);
            indiaUpiSendPaymentToVpaFragment.A0A = (C196129Xv) A0Q.A2G.get();
            indiaUpiSendPaymentToVpaFragment.A0E = (C29221Vu) r3.A6A.get();
            indiaUpiSendPaymentToVpaFragment.A0D = C165607th.A0X(r3);
            indiaUpiSendPaymentToVpaFragment.A0K = (AnonymousClass5GM) A0Q.A2I.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiSendPaymentToVpaFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
