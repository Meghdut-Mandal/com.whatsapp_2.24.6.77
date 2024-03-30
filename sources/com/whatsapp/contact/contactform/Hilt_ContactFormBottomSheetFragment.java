package com.whatsapp.contact.contactform;

import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C61313Bj;
import X.C61323Bk;
import X.C65383Rv;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_ContactFormBottomSheetFragment extends WDSBottomSheetDialogFragment {
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
            ContactFormBottomSheetFragment contactFormBottomSheetFragment = (ContactFormBottomSheetFragment) this;
            C32581dr r1 = (C32581dr) C36391kE.A0U(this);
            C18800tq r3 = r1.A1K;
            C18830tt r4 = r3.A00;
            C36361kB.A1E(r4, contactFormBottomSheetFragment);
            contactFormBottomSheetFragment.A01 = C36391kE.A0V(r3);
            contactFormBottomSheetFragment.A0L = C36361kB.A0c(r3);
            contactFormBottomSheetFragment.A08 = C36341k9.A0R(r3);
            contactFormBottomSheetFragment.A0F = C36411kG.A0b(r3);
            contactFormBottomSheetFragment.A05 = C36381kD.A0V(r3);
            contactFormBottomSheetFragment.A0E = (C65383Rv) r4.A2M.get();
            contactFormBottomSheetFragment.A07 = C36381kD.A0X(r3);
            contactFormBottomSheetFragment.A0H = C36351kA.A0X(r3);
            contactFormBottomSheetFragment.A0N = C36361kB.A0f(r3);
            contactFormBottomSheetFragment.A00 = C36351kA.A0K(r3);
            contactFormBottomSheetFragment.A0O = C36341k9.A0Z(r3);
            contactFormBottomSheetFragment.A0G = C36351kA.A0U(r3);
            contactFormBottomSheetFragment.A0I = C36341k9.A0T(r3);
            contactFormBottomSheetFragment.A04 = C36351kA.A0M(r3);
            contactFormBottomSheetFragment.A0M = C36371kC.A0k(r3);
            contactFormBottomSheetFragment.A0K = C36341k9.A0V(r3);
            contactFormBottomSheetFragment.A06 = C36391kE.A0c(r3);
            contactFormBottomSheetFragment.A0J = C36351kA.A0e(r3);
            contactFormBottomSheetFragment.A09 = r3.A5o();
            C27111My r12 = r1.A1I;
            contactFormBottomSheetFragment.A02 = (C61313Bj) r12.A0O.get();
            contactFormBottomSheetFragment.A03 = (C61323Bk) r12.A0P.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.Hilt_ContactFormBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
