package com.whatsapp.wabloks.base;

import X.AnonymousClass04G;
import X.C120325rK;
import X.C18700tb;
import X.C18800tq;
import X.C28721Tt;
import X.C32541dn;
import X.C32551do;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BkScreenFragment extends BkFragment implements C18700tb {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C36441kJ.A11();
    public volatile C32551do A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0Y = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A07()
            r2.A1d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.base.Hilt_BkScreenFragment.A1F(android.app.Activity):void");
    }

    private void A07() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1d() {
        if (this instanceof Hilt_BkFcsPreloadingScreenFragment) {
            Hilt_BkFcsPreloadingScreenFragment hilt_BkFcsPreloadingScreenFragment = (Hilt_BkFcsPreloadingScreenFragment) this;
            if (!hilt_BkFcsPreloadingScreenFragment.A00) {
                hilt_BkFcsPreloadingScreenFragment.A00 = true;
                BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = (BkFcsPreloadingScreenFragment) hilt_BkFcsPreloadingScreenFragment;
                C32581dr r0 = (C32581dr) ((C32571dq) hilt_BkFcsPreloadingScreenFragment.generatedComponent());
                C18800tq r1 = r0.A1K;
                C90484aE.A1C(r0, r1, bkFcsPreloadingScreenFragment);
                bkFcsPreloadingScreenFragment.A04 = r1.ALl();
                bkFcsPreloadingScreenFragment.A02 = C90484aE.A0a(r1);
                bkFcsPreloadingScreenFragment.A03 = (C120325rK) r1.A00.A5A.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            C32581dr r2 = (C32581dr) ((C32571dq) generatedComponent());
            C90484aE.A1C(r2, r2.A1K, (BkScreenFragment) this);
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C32551do(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A07();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    public void A1O(Context context) {
        super.A1O(context);
        A07();
        A1d();
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A01(this, super.BAw());
    }
}
