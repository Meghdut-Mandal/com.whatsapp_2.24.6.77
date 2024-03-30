package com.whatsapp.messaging;

import X.AnonymousClass1V6;
import X.AnonymousClass3HF;
import X.AnonymousClass3MF;
import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ViewOnceAudioFragment extends BaseViewOnceMessageViewerFragment {
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
        if (!this.A02) {
            this.A02 = true;
            ViewOnceAudioFragment viewOnceAudioFragment = (ViewOnceAudioFragment) this;
            C18800tq r2 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C18830tt A0Q = C36371kC.A0Q(r2, viewOnceAudioFragment);
            viewOnceAudioFragment.A01 = C18800tq.AG6(r2);
            viewOnceAudioFragment.A03 = C36351kA.A0n(r2);
            viewOnceAudioFragment.A00 = C36401kF.A0X(A0Q);
            viewOnceAudioFragment.A01 = (AnonymousClass3HF) A0Q.A2h.get();
            viewOnceAudioFragment.A02 = (AnonymousClass1V6) r2.A4v.get();
            viewOnceAudioFragment.A03 = (AnonymousClass3MF) A0Q.A9R.get();
            viewOnceAudioFragment.A00 = C36351kA.A0T(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.Hilt_ViewOnceAudioFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
