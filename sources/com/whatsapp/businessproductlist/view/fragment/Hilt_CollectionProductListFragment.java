package com.whatsapp.businessproductlist.view.fragment;

import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C198849eI;
import X.C22909AyL;
import X.C27111My;
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

public abstract class Hilt_CollectionProductListFragment extends BusinessProductListBaseFragment {
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
            CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) this;
            C32581dr r0 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r0.A1K;
            C18830tt A0Q = C36371kC.A0Q(r2, collectionProductListFragment);
            C27111My A0K = C165587tf.A0K(r0, r2, collectionProductListFragment);
            collectionProductListFragment.A0F = C36341k9.A0Z(r2);
            collectionProductListFragment.A0C = C36341k9.A0T(r2);
            collectionProductListFragment.A0E = C165607th.A0V(A0Q);
            collectionProductListFragment.A01 = (C22909AyL) A0K.A1Z.get();
            collectionProductListFragment.A02 = C36351kA.A0M(r2);
            collectionProductListFragment.A03 = C36351kA.A0N(r2);
            collectionProductListFragment.A01 = C36351kA.A0J(r2);
            collectionProductListFragment.A0C = C165597tg.A0U(r2);
            collectionProductListFragment.A08 = C36341k9.A0R(r2);
            collectionProductListFragment.A06 = C165607th.A0Q(r2);
            collectionProductListFragment.A0A = C36341k9.A0S(r2);
            collectionProductListFragment.A09 = C36371kC.A0U(r2);
            collectionProductListFragment.A0B = C36341k9.A0V(r2);
            collectionProductListFragment.A05 = (C198849eI) A0Q.A0x.get();
            collectionProductListFragment.A04 = C165587tf.A0L(r2);
            collectionProductListFragment.A07 = C18800tq.A2v(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.Hilt_CollectionProductListFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}