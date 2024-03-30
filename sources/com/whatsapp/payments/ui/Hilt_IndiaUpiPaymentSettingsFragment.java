package com.whatsapp.payments.ui;

import X.A8P;
import X.AnonymousClass1XA;
import X.AnonymousClass1YM;
import X.AnonymousClass3EU;
import X.AnonymousClass6VG;
import X.AnonymousClass9SJ;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C196039Xk;
import X.C19900wh;
import X.C200049gU;
import X.C201659k4;
import X.C202179lC;
import X.C21159AAt;
import X.C27111My;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiPaymentSettingsFragment extends PaymentSettingsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0A() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C32581dr r4 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r3 = r4.A1K;
            C36321k7.A0f(r3, indiaUpiPaymentSettingsFragment);
            C18830tt r2 = r3.A00;
            C90484aE.A1E(r2, indiaUpiPaymentSettingsFragment);
            indiaUpiPaymentSettingsFragment.A0E = C36351kA.A0N(r3);
            C165567td.A0z(r3, r2, indiaUpiPaymentSettingsFragment);
            C165567td.A10(r3, r2, indiaUpiPaymentSettingsFragment, r3.A9Y.get());
            C165567td.A13(r3, indiaUpiPaymentSettingsFragment);
            indiaUpiPaymentSettingsFragment.A0J = (AnonymousClass9SJ) r2.AAu.get();
            indiaUpiPaymentSettingsFragment.A0B = C36361kB.A0c(r3);
            indiaUpiPaymentSettingsFragment.A04 = C36351kA.A0J(r3);
            indiaUpiPaymentSettingsFragment.A08 = C36351kA.A0U(r3);
            indiaUpiPaymentSettingsFragment.A0V = C165587tf.A0Z(r3);
            indiaUpiPaymentSettingsFragment.A0A = C36371kC.A0Z(r3);
            indiaUpiPaymentSettingsFragment.A07 = (C21159AAt) r3.A2F.get();
            indiaUpiPaymentSettingsFragment.A0D = (C201659k4) r3.APO.get();
            indiaUpiPaymentSettingsFragment.A0G = (AnonymousClass3EU) r2.AAg.get();
            C27111My r42 = r4.A1I;
            indiaUpiPaymentSettingsFragment.A0U = C27111My.A30(r42);
            indiaUpiPaymentSettingsFragment.A0P = (C196039Xk) r2.AAd.get();
            indiaUpiPaymentSettingsFragment.A0K = C27111My.A2p(r42);
            indiaUpiPaymentSettingsFragment.A0F = (A8P) r2.AAX.get();
            indiaUpiPaymentSettingsFragment.A0I = (AnonymousClass1XA) r3.A6L.get();
            indiaUpiPaymentSettingsFragment.A0M = C165587tf.A0V(r3);
            indiaUpiPaymentSettingsFragment.A05 = C36391kE.A0c(r3);
            indiaUpiPaymentSettingsFragment.A0H = r2.A7n();
            indiaUpiPaymentSettingsFragment.A0C = C165607th.A0X(r3);
            indiaUpiPaymentSettingsFragment.A0O = (AnonymousClass6VG) r2.AAa.get();
            indiaUpiPaymentSettingsFragment.A0L = (C200049gU) r3.AW3.get();
            indiaUpiPaymentSettingsFragment.A09 = (C19900wh) r3.A9J.get();
            indiaUpiPaymentSettingsFragment.A0E = (AnonymousClass1YM) r3.AVM.get();
            indiaUpiPaymentSettingsFragment.A0N = (C202179lC) r2.A39.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A0A();
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
            r2.A0A()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentSettingsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A0A();
        A1h();
    }
}
