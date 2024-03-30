package com.whatsapp.contact.picker;

import X.AnonymousClass1N0;
import X.AnonymousClass1YL;
import X.C18800tq;
import X.C18830tt;
import X.C20690y0;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_BaseSharedPreviewDialogFragment extends WaDialogFragment {
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
        if (this instanceof Hilt_SharedTextPreviewDialogFragment) {
            Hilt_SharedTextPreviewDialogFragment hilt_SharedTextPreviewDialogFragment = (Hilt_SharedTextPreviewDialogFragment) this;
            if (!hilt_SharedTextPreviewDialogFragment.A00) {
                hilt_SharedTextPreviewDialogFragment.A00 = true;
                C32571dq A0T = C36391kE.A0T(hilt_SharedTextPreviewDialogFragment);
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) hilt_SharedTextPreviewDialogFragment;
                C18800tq r3 = ((C32581dr) A0T).A1K;
                C36321k7.A0f(r3, sharedTextPreviewDialogFragment);
                C18830tt r2 = r3.A00;
                C36371kC.A1J(r2, sharedTextPreviewDialogFragment);
                sharedTextPreviewDialogFragment.A05 = C36351kA.A0M(r3);
                sharedTextPreviewDialogFragment.A04 = (C20690y0) r3.A6r.get();
                sharedTextPreviewDialogFragment.A06 = C36341k9.A0R(r3);
                sharedTextPreviewDialogFragment.A08 = C36351kA.A0U(r3);
                sharedTextPreviewDialogFragment.A07 = C36341k9.A0S(r3);
                sharedTextPreviewDialogFragment.A0L = C36401kF.A0f(r3);
                sharedTextPreviewDialogFragment.A01 = C36391kE.A0V(r3);
                sharedTextPreviewDialogFragment.A0M = C36341k9.A0Z(r3);
                sharedTextPreviewDialogFragment.A0E = C36391kE.A0j(r3);
                sharedTextPreviewDialogFragment.A0D = C36351kA.A0g(r3);
                sharedTextPreviewDialogFragment.A02 = C36381kD.A0U(r3);
                sharedTextPreviewDialogFragment.A0B = C36351kA.A0e(r3);
                sharedTextPreviewDialogFragment.A08 = C36371kC.A0b(r2);
                sharedTextPreviewDialogFragment.A0F = (AnonymousClass1YL) r3.ARO.get();
                sharedTextPreviewDialogFragment.A0A = C36351kA.A0d(r3);
                sharedTextPreviewDialogFragment.A00 = C36351kA.A0J(r3);
                sharedTextPreviewDialogFragment.A0K = C36371kC.A0l(r3);
                sharedTextPreviewDialogFragment.A0C = C36351kA.A0f(r2);
                sharedTextPreviewDialogFragment.A05 = C36351kA.A0Y(r3);
                sharedTextPreviewDialogFragment.A0I = C18800tq.AKs(r3);
                sharedTextPreviewDialogFragment.A0J = C36381kD.A0i(r3);
                sharedTextPreviewDialogFragment.A0H = C36351kA.A0m(r3);
                sharedTextPreviewDialogFragment.A09 = C36351kA.A0c(r2);
                sharedTextPreviewDialogFragment.A07 = (AnonymousClass1N0) r2.A3P.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = (BaseSharedPreviewDialogFragment) this;
            C18800tq r1 = ((C32581dr) C36391kE.A0T(this)).A1K;
            C36321k7.A0g(r1, baseSharedPreviewDialogFragment);
            baseSharedPreviewDialogFragment.A05 = C36351kA.A0M(r1);
            baseSharedPreviewDialogFragment.A04 = (C20690y0) r1.A6r.get();
            baseSharedPreviewDialogFragment.A06 = C36341k9.A0R(r1);
            baseSharedPreviewDialogFragment.A08 = C36351kA.A0U(r1);
            baseSharedPreviewDialogFragment.A07 = C36341k9.A0S(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.Hilt_BaseSharedPreviewDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
