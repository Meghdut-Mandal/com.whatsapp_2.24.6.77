package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass3NM;
import X.C18800tq;
import X.C18830tt;
import X.C196169Xz;
import X.C201549jr;
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
import com.whatsapp.mediaview.MediaViewBaseFragment;

public abstract class Hilt_LinkedAccountMediaViewFragment extends MediaViewBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A06() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            C18800tq r3 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C18830tt A0Q = C36371kC.A0Q(r3, linkedAccountMediaViewFragment);
            linkedAccountMediaViewFragment.A0A = C36351kA.A0V(r3);
            linkedAccountMediaViewFragment.A0D = C36341k9.A0V(r3);
            linkedAccountMediaViewFragment.A04 = C36351kA.A0J(r3);
            linkedAccountMediaViewFragment.A0C = C36341k9.A0T(r3);
            linkedAccountMediaViewFragment.A08 = C36341k9.A0R(r3);
            linkedAccountMediaViewFragment.A09 = C36371kC.A0U(r3);
            linkedAccountMediaViewFragment.A0B = C36351kA.A0X(r3);
            linkedAccountMediaViewFragment.A06 = (C201549jr) A0Q.A0e.get();
            linkedAccountMediaViewFragment.A0F = (C196169Xz) A0Q.A9S.get();
            linkedAccountMediaViewFragment.A05 = (AnonymousClass3NM) A0Q.A9V.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A06();
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
            r2.A06()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.linkedaccounts.Hilt_LinkedAccountMediaViewFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A06();
        A1Y();
    }
}
