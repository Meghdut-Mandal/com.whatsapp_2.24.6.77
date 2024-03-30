package com.whatsapp.privacy.checkup;

import X.AnonymousClass18U;
import X.AnonymousClass3PJ;
import X.C18800tq;
import X.C21010yW;
import X.C24431Ck;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_PrivacyCheckupBaseFragment extends WaFragment {
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
        if (this instanceof Hilt_PrivacyCheckupMoreSecurityFragment) {
            Hilt_PrivacyCheckupMoreSecurityFragment hilt_PrivacyCheckupMoreSecurityFragment = (Hilt_PrivacyCheckupMoreSecurityFragment) this;
            if (!hilt_PrivacyCheckupMoreSecurityFragment.A00) {
                hilt_PrivacyCheckupMoreSecurityFragment.A00 = true;
                C32571dq A0K = C36401kF.A0K(hilt_PrivacyCheckupMoreSecurityFragment);
                PrivacyCheckupMoreSecurityFragment privacyCheckupMoreSecurityFragment = (PrivacyCheckupMoreSecurityFragment) hilt_PrivacyCheckupMoreSecurityFragment;
                C32581dr r1 = (C32581dr) A0K;
                C18800tq r2 = r1.A1K;
                privacyCheckupMoreSecurityFragment.A01 = C36331k8.A0D(r2, r2.A00, privacyCheckupMoreSecurityFragment);
                privacyCheckupMoreSecurityFragment.A00 = C36401kF.A0J(r2);
                privacyCheckupMoreSecurityFragment.A02 = C36351kA.A0g(r2);
                privacyCheckupMoreSecurityFragment.A03 = new AnonymousClass3PJ((C21010yW) r1.A1I.A5g.A79.get());
                privacyCheckupMoreSecurityFragment.A00 = C36351kA.A0N(r2);
                privacyCheckupMoreSecurityFragment.A01 = (AnonymousClass18U) r2.A0I.get();
            }
        } else if (this instanceof Hilt_PrivacyCheckupMorePrivacyFragment) {
            Hilt_PrivacyCheckupMorePrivacyFragment hilt_PrivacyCheckupMorePrivacyFragment = (Hilt_PrivacyCheckupMorePrivacyFragment) this;
            if (!hilt_PrivacyCheckupMorePrivacyFragment.A00) {
                hilt_PrivacyCheckupMorePrivacyFragment.A00 = true;
                C32571dq A0K2 = C36401kF.A0K(hilt_PrivacyCheckupMorePrivacyFragment);
                PrivacyCheckupMorePrivacyFragment privacyCheckupMorePrivacyFragment = (PrivacyCheckupMorePrivacyFragment) hilt_PrivacyCheckupMorePrivacyFragment;
                C32581dr r12 = (C32581dr) A0K2;
                C18800tq r22 = r12.A1K;
                privacyCheckupMorePrivacyFragment.A01 = C36331k8.A0D(r22, r22.A00, privacyCheckupMorePrivacyFragment);
                privacyCheckupMorePrivacyFragment.A00 = C36401kF.A0J(r22);
                privacyCheckupMorePrivacyFragment.A02 = C36351kA.A0g(r22);
                privacyCheckupMorePrivacyFragment.A03 = new AnonymousClass3PJ((C21010yW) r12.A1I.A5g.A79.get());
                privacyCheckupMorePrivacyFragment.A00 = C36351kA.A0N(r22);
                privacyCheckupMorePrivacyFragment.A01 = (C24431Ck) r22.A2z.get();
                privacyCheckupMorePrivacyFragment.A02 = C36401kF.A0U(r22);
            }
        } else if (!this.A02) {
            this.A02 = true;
            PrivacyCheckupBaseFragment privacyCheckupBaseFragment = (PrivacyCheckupBaseFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r13 = r3.A1K;
            privacyCheckupBaseFragment.A01 = C36331k8.A0D(r13, r13.A00, privacyCheckupBaseFragment);
            privacyCheckupBaseFragment.A00 = C36401kF.A0J(r13);
            privacyCheckupBaseFragment.A02 = C36351kA.A0g(r13);
            privacyCheckupBaseFragment.A03 = new AnonymousClass3PJ((C21010yW) r3.A1I.A5g.A79.get());
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.checkup.Hilt_PrivacyCheckupBaseFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
