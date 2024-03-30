package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass1HA;
import X.AnonymousClass63W;
import X.C121575tM;
import X.C123795x6;
import X.C130686Ma;
import X.C18800tq;
import X.C18830tt;
import X.C20690y0;
import X.C24041Av;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C63563Kn;
import X.C64473Oc;
import X.C64813Pn;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_StickerExpressionsFragment extends WaDialogFragment {
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
            StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) this;
            C32581dr r4 = (C32581dr) C36391kE.A0T(this);
            C18800tq r2 = r4.A1K;
            C36321k7.A0f(r2, stickerExpressionsFragment);
            C18830tt r3 = r2.A00;
            C90484aE.A1E(r3, stickerExpressionsFragment);
            stickerExpressionsFragment.A0H = (C123795x6) r3.ACE.get();
            stickerExpressionsFragment.A0O = (AnonymousClass1HA) r2.A84.get();
            stickerExpressionsFragment.A09 = (C24041Av) r2.A7I.get();
            C27111My r5 = r4.A1I;
            stickerExpressionsFragment.A0G = (C130686Ma) r5.A5H.get();
            stickerExpressionsFragment.A0J = (AnonymousClass63W) r3.ACd.get();
            stickerExpressionsFragment.A08 = C36351kA.A0M(r2);
            stickerExpressionsFragment.A07 = (C20690y0) r2.A6r.get();
            stickerExpressionsFragment.A0P = (C64813Pn) r3.A9Z.get();
            stickerExpressionsFragment.A0N = (C64473Oc) r3.ACb.get();
            stickerExpressionsFragment.A0K = (C63563Kn) r5.A2l.get();
            stickerExpressionsFragment.A0M = C32581dr.A0d(r4);
            stickerExpressionsFragment.A0F = C32581dr.A0Q(r4);
            stickerExpressionsFragment.A0A = C36351kA.A0c(r3);
            stickerExpressionsFragment.A0B = (C121575tM) r3.ACG.get();
            stickerExpressionsFragment.A0L = C36351kA.A0h(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.Hilt_StickerExpressionsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
