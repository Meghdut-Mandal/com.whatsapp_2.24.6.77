package com.whatsapp.dialogs;

import X.C32541dn;
import X.C36331k8;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_HFMLearnMoreDialogFragment extends FAQLearnMoreDialogFragment {
    public boolean A00 = false;
    public ContextWrapper A01;
    public boolean A02;

    private void A03() {
        if (this.A01 == null) {
            this.A01 = C36431kI.A11(super.A1D(), this);
            this.A02 = C32541dn.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A02) {
            return null;
        }
        A03();
        return this.A01;
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
            android.content.ContextWrapper r0 = r2.A01
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.Hilt_HFMLearnMoreDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
