package com.whatsapp.biz.catalog;

import X.AnonymousClass9Y1;
import X.C18800tq;
import X.C196089Xp;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public abstract class Hilt_CatalogMediaViewFragment extends MediaViewBaseFragment {
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
            CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r1 = r3.A1K;
            catalogMediaViewFragment.A07 = C36331k8.A0D(r1, r1.A00, catalogMediaViewFragment);
            catalogMediaViewFragment.A01 = C36351kA.A0J(r1);
            catalogMediaViewFragment.A02 = C36351kA.A0M(r1);
            catalogMediaViewFragment.A06 = C36351kA.A0X(r1);
            catalogMediaViewFragment.A04 = (AnonymousClass9Y1) r1.A1R.get();
            catalogMediaViewFragment.A05 = (C196089Xp) r3.A1I.A0L.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.Hilt_CatalogMediaViewFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}