package com.whatsapp.payments.ui;

import X.AF6;
import X.AnonymousClass1XA;
import X.C165567td;
import X.C165587tf;
import X.C18800tq;
import X.C18830tt;
import X.C194209On;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_P2mLitePaymentSettingsFragment extends PaymentSettingsFragment {
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
            P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) this;
            C18800tq r2 = ((C32581dr) ((C32571dq) generatedComponent())).A1K;
            C36321k7.A0f(r2, p2mLitePaymentSettingsFragment);
            C18830tt r1 = r2.A00;
            C90484aE.A1E(r1, p2mLitePaymentSettingsFragment);
            p2mLitePaymentSettingsFragment.A0E = C36351kA.A0N(r2);
            C165567td.A0z(r2, r1, p2mLitePaymentSettingsFragment);
            C165567td.A10(r2, r1, p2mLitePaymentSettingsFragment, r2.A9Y.get());
            C165567td.A13(r2, p2mLitePaymentSettingsFragment);
            p2mLitePaymentSettingsFragment.A09 = (C194209On) r1.AAV.get();
            p2mLitePaymentSettingsFragment.A0A = C165587tf.A0Z(r2);
            p2mLitePaymentSettingsFragment.A04 = C36371kC.A0Z(r2);
            p2mLitePaymentSettingsFragment.A06 = (AF6) r1.AAT.get();
            p2mLitePaymentSettingsFragment.A05 = (AnonymousClass1XA) r2.A6L.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_P2mLitePaymentSettingsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
