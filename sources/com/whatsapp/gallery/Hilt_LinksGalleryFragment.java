package com.whatsapp.gallery;

import X.AnonymousClass12P;
import X.AnonymousClass12T;
import X.AnonymousClass163;
import X.C18800tq;
import X.C18830tt;
import X.C20650xu;
import X.C32541dn;
import X.C32581dr;
import X.C32731e6;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C77563qh;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_LinksGalleryFragment extends GalleryFragmentBase {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public Hilt_LinksGalleryFragment() {
        super("linksgalleryfragment");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            LinksGalleryFragment linksGalleryFragment = (LinksGalleryFragment) this;
            C18800tq r1 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C18830tt A0Q = C36371kC.A0Q(r1, linksGalleryFragment);
            linksGalleryFragment.A03 = C36351kA.A0V(r1);
            linksGalleryFragment.A09 = C36341k9.A0V(r1);
            linksGalleryFragment.A0G = C36341k9.A0Z(r1);
            linksGalleryFragment.A05 = C36341k9.A0T(r1);
            linksGalleryFragment.A0F = C36351kA.A0n(r1);
            linksGalleryFragment.A06 = C36371kC.A0Z(r1);
            linksGalleryFragment.A07 = C36361kB.A0Z(r1);
            linksGalleryFragment.A08 = (AnonymousClass12T) r1.AT2.get();
            linksGalleryFragment.A04 = C36351kA.A0X(r1);
            linksGalleryFragment.A06 = C36391kE.A0j(r1);
            linksGalleryFragment.A05 = C36351kA.A0e(r1);
            linksGalleryFragment.A00 = C36351kA.A0J(r1);
            linksGalleryFragment.A02 = (C20650xu) r1.A3Z.get();
            linksGalleryFragment.A04 = (C32731e6) r1.A6S.get();
            linksGalleryFragment.A03 = A0Q.A4o();
            linksGalleryFragment.A08 = C36401kF.A0g(r1);
            r1.A4S.get();
            linksGalleryFragment.A07 = new C77563qh((AnonymousClass163) r1.A1k.get(), (C20650xu) r1.A3Z.get(), (AnonymousClass12P) r1.A5G.get());
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_LinksGalleryFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
