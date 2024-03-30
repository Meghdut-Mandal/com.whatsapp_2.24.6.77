package com.whatsapp.mediacomposer;

import X.C1032954s;
import X.C132106Se;
import X.C18800tq;
import X.C18830tt;
import X.C20690y0;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36401kF;
import X.C36431kI;
import X.C90464aC;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ImageComposerFragment extends MediaComposerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0B() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (this instanceof Hilt_StickerComposerFragment) {
            Hilt_StickerComposerFragment hilt_StickerComposerFragment = (Hilt_StickerComposerFragment) this;
            if (!hilt_StickerComposerFragment.A00) {
                hilt_StickerComposerFragment.A00 = true;
                C32571dq A0K = C36401kF.A0K(hilt_StickerComposerFragment);
                StickerComposerFragment stickerComposerFragment = (StickerComposerFragment) hilt_StickerComposerFragment;
                C32581dr r3 = (C32581dr) A0K;
                C18800tq r2 = r3.A1K;
                C18830tt r1 = r2.A00;
                C90464aC.A10(r2, r1, C36331k8.A0D(r2, r1, stickerComposerFragment), stickerComposerFragment);
                C90464aC.A0w(r3, r2, r1, C36341k9.A0T(r2), stickerComposerFragment);
                C90464aC.A0x(r3, r2, r1, stickerComposerFragment);
                stickerComposerFragment.A02 = C90504aG.A0L(r2);
                stickerComposerFragment.A01 = (C20690y0) r2.A6r.get();
                stickerComposerFragment.A03 = (C1032954s) r1.A8H.get();
                stickerComposerFragment.A01 = C32581dr.A0d(r3);
                stickerComposerFragment.A02 = (C132106Se) r1.ACc.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            C32581dr r4 = (C32581dr) C36401kF.A0K(this);
            C18800tq r22 = r4.A1K;
            C18830tt r12 = r22.A00;
            C90464aC.A10(r22, r12, C36331k8.A0D(r22, r12, imageComposerFragment), imageComposerFragment);
            C90464aC.A0w(r4, r22, r12, C36341k9.A0T(r22), imageComposerFragment);
            C90464aC.A0x(r4, r22, r12, imageComposerFragment);
            imageComposerFragment.A02 = C90504aG.A0L(r22);
            imageComposerFragment.A01 = (C20690y0) r22.A6r.get();
            imageComposerFragment.A03 = (C1032954s) r12.A8H.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A0B();
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
            r2.A0B()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.Hilt_ImageComposerFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A0B();
        A1Y();
    }
}
