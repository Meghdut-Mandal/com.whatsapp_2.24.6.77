package com.whatsapp.payments.ui.invites;

import X.A8P;
import X.AnonymousClass1YQ;
import X.AnonymousClass3EU;
import X.C165577te;
import X.C165587tf;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C30021Yx;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiPaymentInviteFragment extends PaymentInviteFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
            C32581dr r4 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r4.A1K;
            C18830tt A0Q = C36371kC.A0Q(r2, indiaUpiPaymentInviteFragment);
            indiaUpiPaymentInviteFragment.A00 = (C30021Yx) r2.AVk.get();
            indiaUpiPaymentInviteFragment.A04 = C36351kA.A0V(r2);
            indiaUpiPaymentInviteFragment.A05 = C36341k9.A0V(r2);
            indiaUpiPaymentInviteFragment.A07 = C165587tf.A0S(r2);
            indiaUpiPaymentInviteFragment.A03 = C165577te.A0Q(r2);
            indiaUpiPaymentInviteFragment.A00 = C36341k9.A0R(r2);
            indiaUpiPaymentInviteFragment.A02 = C36341k9.A0S(r2);
            indiaUpiPaymentInviteFragment.A01 = C36371kC.A0U(r2);
            indiaUpiPaymentInviteFragment.A08 = (AnonymousClass3EU) A0Q.AAg.get();
            indiaUpiPaymentInviteFragment.A0A = C27111My.A2p(r4.A1I);
            indiaUpiPaymentInviteFragment.A06 = (A8P) A0Q.AAX.get();
            indiaUpiPaymentInviteFragment.A0C = (AnonymousClass1YQ) r2.A69.get();
            indiaUpiPaymentInviteFragment.A0B = C165587tf.A0V(r2);
            indiaUpiPaymentInviteFragment.A09 = A0Q.A7n();
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
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.invites.Hilt_IndiaUpiPaymentInviteFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1Y();
    }
}
