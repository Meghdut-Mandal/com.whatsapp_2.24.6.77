package com.whatsapp.gallery;

import X.AnonymousClass12P;
import X.AnonymousClass12T;
import X.AnonymousClass163;
import X.AnonymousClass1TA;
import X.AnonymousClass1X7;
import X.AnonymousClass3D9;
import X.C18800tq;
import X.C18830tt;
import X.C20650xu;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C77553qg;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_DocumentsGalleryFragment extends GalleryFragmentBase {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public Hilt_DocumentsGalleryFragment() {
        super("documentsgalleryfragment");
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
            DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
            C18800tq r5 = ((C32581dr) C36401kF.A0K(this)).A1K;
            C18830tt A0Q = C36371kC.A0Q(r5, documentsGalleryFragment);
            documentsGalleryFragment.A03 = C36351kA.A0V(r5);
            documentsGalleryFragment.A09 = C36341k9.A0V(r5);
            documentsGalleryFragment.A0G = C36341k9.A0Z(r5);
            documentsGalleryFragment.A05 = C36341k9.A0T(r5);
            documentsGalleryFragment.A0F = C36351kA.A0n(r5);
            documentsGalleryFragment.A06 = C36371kC.A0Z(r5);
            documentsGalleryFragment.A07 = C36361kB.A0Z(r5);
            documentsGalleryFragment.A08 = (AnonymousClass12T) r5.AT2.get();
            documentsGalleryFragment.A04 = C36351kA.A0X(r5);
            documentsGalleryFragment.A07 = (AnonymousClass1X7) r5.A4o.get();
            documentsGalleryFragment.A02 = C36351kA.A0M(r5);
            documentsGalleryFragment.A01 = C36391kE.A0V(r5);
            documentsGalleryFragment.A00 = C36351kA.A0J(r5);
            documentsGalleryFragment.A05 = A0Q.A4o();
            documentsGalleryFragment.A06 = (AnonymousClass1TA) r5.A7h.get();
            documentsGalleryFragment.A03 = (AnonymousClass3D9) A0Q.A1U.get();
            documentsGalleryFragment.A04 = new C77553qg((AnonymousClass163) r5.A1k.get(), (C20650xu) r5.A3Z.get(), (AnonymousClass12P) r5.A5G.get());
            documentsGalleryFragment.A08 = C36351kA.A0q(r5);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.Hilt_DocumentsGalleryFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
