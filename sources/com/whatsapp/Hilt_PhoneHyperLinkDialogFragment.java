package com.whatsapp;

import X.C18800tq;
import X.C18830tt;
import X.C194529Qc;
import X.C32541dn;
import X.C32581dr;
import X.C32691e2;
import X.C32811eE;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_PhoneHyperLinkDialogFragment extends WaDialogFragment {
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
            PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment = (PhoneHyperLinkDialogFragment) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0T(this)).A1K;
            C36321k7.A0f(r2, phoneHyperLinkDialogFragment);
            C18830tt r1 = r2.A00;
            C90484aE.A1E(r1, phoneHyperLinkDialogFragment);
            phoneHyperLinkDialogFragment.A01 = C36351kA.A0M(r2);
            phoneHyperLinkDialogFragment.A03 = C36351kA.A0N(r2);
            phoneHyperLinkDialogFragment.A04 = C36391kE.A0Y(r2);
            phoneHyperLinkDialogFragment.A02 = (C32691e2) r2.A4R.get();
            phoneHyperLinkDialogFragment.A00 = C36351kA.A0J(r2);
            phoneHyperLinkDialogFragment.A05 = C36341k9.A0R(r2);
            phoneHyperLinkDialogFragment.A09 = (C32811eE) r2.A0F.get();
            phoneHyperLinkDialogFragment.A06 = C36421kH.A0K(r2);
            phoneHyperLinkDialogFragment.A07 = (C194529Qc) r1.AAr.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Hilt_PhoneHyperLinkDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
