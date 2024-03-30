package com.whatsapp.payments.ui;

import X.AnonymousClass2ZN;
import X.AnonymousClass646;
import X.AnonymousClass6VM;
import X.C165587tf;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C201219j5;
import X.C201269jE;
import X.C201649k3;
import X.C27111My;
import X.C29221Vu;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BrazilConfirmReceivePaymentFragment extends ConfirmReceivePaymentFragment {
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
            BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r3.A1K;
            C18830tt A0Q = C36371kC.A0Q(r2, brazilConfirmReceivePaymentFragment);
            brazilConfirmReceivePaymentFragment.A03 = C36381kD.A0f(r2);
            brazilConfirmReceivePaymentFragment.A02 = (AnonymousClass2ZN) r2.AVK.get();
            brazilConfirmReceivePaymentFragment.A02 = C36351kA.A0V(r2);
            brazilConfirmReceivePaymentFragment.A05 = C36341k9.A0V(r2);
            brazilConfirmReceivePaymentFragment.A00 = C36351kA.A0M(r2);
            brazilConfirmReceivePaymentFragment.A01 = C36351kA.A0N(r2);
            brazilConfirmReceivePaymentFragment.A06 = C36361kB.A0c(r2);
            brazilConfirmReceivePaymentFragment.A03 = C36341k9.A0T(r2);
            brazilConfirmReceivePaymentFragment.A0I = C165587tf.A0Z(r2);
            brazilConfirmReceivePaymentFragment.A07 = (C201269jE) A0Q.A5H.get();
            brazilConfirmReceivePaymentFragment.A0F = (C201219j5) A0Q.A5I.get();
            brazilConfirmReceivePaymentFragment.A0B = C165587tf.A0T(r2);
            brazilConfirmReceivePaymentFragment.A0C = C36371kC.A0h(r2);
            brazilConfirmReceivePaymentFragment.A0E = (AnonymousClass646) r2.ATw.get();
            brazilConfirmReceivePaymentFragment.A04 = C165587tf.A0Q(r2);
            brazilConfirmReceivePaymentFragment.A0H = C165607th.A0e(r2);
            brazilConfirmReceivePaymentFragment.A0D = C165607th.A0Z(r2);
            brazilConfirmReceivePaymentFragment.A08 = C27111My.A2m(r3.A1I);
            brazilConfirmReceivePaymentFragment.A09 = (AnonymousClass6VM) r2.ACd.get();
            brazilConfirmReceivePaymentFragment.A0A = (C29221Vu) r2.A6A.get();
            brazilConfirmReceivePaymentFragment.A0G = (C201649k3) A0Q.A5T.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_BrazilConfirmReceivePaymentFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
