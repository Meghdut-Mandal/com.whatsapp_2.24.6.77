package com.whatsapp.payments.ui;

import X.A8P;
import X.AE0;
import X.AnonymousClass3EU;
import X.C18800tq;
import X.C18830tt;
import X.C24601Db;
import X.C24881Ed;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiContactPickerFragment extends PaymentContactPickerFragment {
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
            IndiaUpiContactPickerFragment indiaUpiContactPickerFragment = (IndiaUpiContactPickerFragment) this;
            C32581dr r5 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r5.A1K;
            C18830tt r4 = r2.A00;
            C27111My A022 = C36321k7.A02(r5, r2, r4, r4, indiaUpiContactPickerFragment);
            C36321k7.A0Y(r2, r4, indiaUpiContactPickerFragment);
            C36321k7.A0j(r2, indiaUpiContactPickerFragment, C18800tq.ALh(r2));
            C36321k7.A0a(r2, r4, indiaUpiContactPickerFragment, r2.A9d);
            C36321k7.A0h(r2, indiaUpiContactPickerFragment);
            C36321k7.A0S(C36351kA.A0J(r2), A022, r2, r4, indiaUpiContactPickerFragment);
            C36321k7.A0i(r2, indiaUpiContactPickerFragment);
            C36321k7.A0U(A022, r5, r2, r4, indiaUpiContactPickerFragment);
            C36321k7.A0Z(r2, r4, indiaUpiContactPickerFragment);
            C36321k7.A0V(r5, r2, r4, indiaUpiContactPickerFragment, C36351kA.A0b(r2));
            C36331k8.A14(A022, r2, indiaUpiContactPickerFragment);
            C36321k7.A0T(A022, r5, r2, r4, indiaUpiContactPickerFragment);
            indiaUpiContactPickerFragment.A02 = C36371kC.A0h(r2);
            indiaUpiContactPickerFragment.A01 = (A8P) r4.AAX.get();
            indiaUpiContactPickerFragment.A00 = (C24881Ed) r2.A6H.get();
            indiaUpiContactPickerFragment.A01 = (C24601Db) r2.A6D.get();
            indiaUpiContactPickerFragment.A02 = (AnonymousClass3EU) r4.AAg.get();
            indiaUpiContactPickerFragment.A03 = C27111My.A2p(A022);
            indiaUpiContactPickerFragment.A04 = C36371kC.A0i(r2);
            indiaUpiContactPickerFragment.A00 = (AE0) r2.A49.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiContactPickerFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1Y();
    }
}
