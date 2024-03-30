package com.whatsapp.stickers.store;

import X.C18800tq;
import X.C18830tt;
import X.C23871Ae;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_StickerStoreFeaturedTabFragment extends StickerStoreTabFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            C18800tq r2 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C18830tt r1 = r2.A00;
            stickerStoreFeaturedTabFragment.A08 = C36331k8.A0D(r2, r1, stickerStoreFeaturedTabFragment);
            stickerStoreFeaturedTabFragment.A04 = C36351kA.A0M(r2);
            stickerStoreFeaturedTabFragment.A05 = C36351kA.A0N(r2);
            stickerStoreFeaturedTabFragment.A0H = C36341k9.A0Z(r2);
            stickerStoreFeaturedTabFragment.A09 = C36351kA.A0h(r2);
            C90484aE.A1D(r2, C36341k9.A0T(r2), stickerStoreFeaturedTabFragment);
            stickerStoreFeaturedTabFragment.A07 = C36351kA.A0c(r1);
            stickerStoreFeaturedTabFragment.A03 = C36351kA.A0g(r2);
            stickerStoreFeaturedTabFragment.A04 = (C23871Ae) r2.A0V.get();
            stickerStoreFeaturedTabFragment.A02 = C36351kA.A0J(r2);
            stickerStoreFeaturedTabFragment.A05 = r1.ACh();
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
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.Hilt_StickerStoreFeaturedTabFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1Y();
    }
}
