package com.whatsapp.mediacomposer;

import X.AnonymousClass1E2;
import X.AnonymousClass1GJ;
import X.AnonymousClass1V6;
import X.AnonymousClass1X7;
import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import X.C90464aC;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_VideoComposerFragment extends MediaComposerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0D() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            C32581dr r4 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r4.A1K;
            C18830tt r1 = r2.A00;
            C90464aC.A10(r2, r1, C36331k8.A0D(r2, r1, videoComposerFragment), videoComposerFragment);
            C90464aC.A0w(r4, r2, r1, C36341k9.A0T(r2), videoComposerFragment);
            C90464aC.A0x(r4, r2, r1, videoComposerFragment);
            videoComposerFragment.A0C = C36351kA.A0V(r2);
            videoComposerFragment.A0I = (AnonymousClass1X7) r2.A4o.get();
            videoComposerFragment.A0D = C36351kA.A0g(r2);
            videoComposerFragment.A0F = (AnonymousClass1E2) r2.Adc.get();
            videoComposerFragment.A0E = (AnonymousClass1GJ) r2.Ad3.get();
            videoComposerFragment.A0B = (AnonymousClass1V6) r2.A4v.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A0D();
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
            r2.A0D()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.Hilt_VideoComposerFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A0D();
        A1Y();
    }
}
