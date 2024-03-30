package com.whatsapp.payments.ui;

import X.AE7;
import X.AnonymousClass1YM;
import X.AnonymousClass6VG;
import X.AnonymousClass9I4;
import X.AnonymousClass9Op;
import X.AnonymousClass9SJ;
import X.C1033154u;
import X.C1033354w;
import X.C1262363c;
import X.C147166wm;
import X.C165567td;
import X.C165587tf;
import X.C18800tq;
import X.C18830tt;
import X.C196039Xk;
import X.C200049gU;
import X.C201649k3;
import X.C23075B3f;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C589131n;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BrazilPaymentSettingsFragment extends PaymentSettingsFragment {
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
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C18800tq r3 = ((C32581dr) ((C32571dq) generatedComponent())).A1K;
            C36321k7.A0f(r3, brazilPaymentSettingsFragment);
            C18830tt r2 = r3.A00;
            C90484aE.A1E(r2, brazilPaymentSettingsFragment);
            brazilPaymentSettingsFragment.A0E = C36351kA.A0N(r3);
            C165567td.A0z(r3, r2, brazilPaymentSettingsFragment);
            C165567td.A10(r3, r2, brazilPaymentSettingsFragment, r3.A9Y.get());
            C165567td.A13(r3, brazilPaymentSettingsFragment);
            brazilPaymentSettingsFragment.A08 = (AnonymousClass9SJ) r2.AAu.get();
            brazilPaymentSettingsFragment.A01 = C36351kA.A0J(r3);
            brazilPaymentSettingsFragment.A02 = (C1033354w) r2.A5C.get();
            brazilPaymentSettingsFragment.A00 = C36391kE.A0S(r3);
            brazilPaymentSettingsFragment.A05 = (C147166wm) r2.A5F.get();
            brazilPaymentSettingsFragment.A0G = (AE7) r2.A5K.get();
            brazilPaymentSettingsFragment.A0F = (C196039Xk) r2.AAd.get();
            brazilPaymentSettingsFragment.A03 = C165587tf.A0Q(r3);
            brazilPaymentSettingsFragment.A0C = (C23075B3f) r2.A0R.get();
            brazilPaymentSettingsFragment.A07 = r2.A7n();
            brazilPaymentSettingsFragment.A04 = (C589131n) r2.A4k.get();
            brazilPaymentSettingsFragment.A0E = (AnonymousClass6VG) r2.AAa.get();
            brazilPaymentSettingsFragment.A0A = (C200049gU) r3.AW3.get();
            brazilPaymentSettingsFragment.A0B = (C1033154u) r3.AVf.get();
            brazilPaymentSettingsFragment.A0H = (C201649k3) r2.A5T.get();
            brazilPaymentSettingsFragment.A06 = (AnonymousClass1YM) r3.AVM.get();
            brazilPaymentSettingsFragment.A09 = (C1262363c) r2.A5M.get();
            brazilPaymentSettingsFragment.A0J = (AnonymousClass9Op) r2.A5X.get();
            brazilPaymentSettingsFragment.A0D = (AnonymousClass9I4) r2.A5Q.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_BrazilPaymentSettingsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
