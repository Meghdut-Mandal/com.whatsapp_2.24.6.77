package com.whatsapp.companiondevice;

import X.C18800tq;
import X.C25701Hi;
import X.C32541dn;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_LinkedDevicesDetailDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = (LinkedDevicesDetailDialogFragment) this;
            C18800tq r1 = ((C32581dr) C36391kE.A0T(this)).A1K;
            C36321k7.A0g(r1, linkedDevicesDetailDialogFragment);
            linkedDevicesDetailDialogFragment.A06 = C36351kA.A0V(r1);
            linkedDevicesDetailDialogFragment.A03 = C36351kA.A0M(r1);
            linkedDevicesDetailDialogFragment.A02 = C36351kA.A0J(r1);
            linkedDevicesDetailDialogFragment.A0B = C36331k8.A0I(r1);
            linkedDevicesDetailDialogFragment.A05 = C36351kA.A0U(r1);
            linkedDevicesDetailDialogFragment.A08 = C36381kD.A0a(r1);
            linkedDevicesDetailDialogFragment.A09 = (C25701Hi) r1.A54.get();
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
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.Hilt_LinkedDevicesDetailDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
