package com.whatsapp.storage;

import X.AnonymousClass1DF;
import X.AnonymousClass1TA;
import X.AnonymousClass1X7;
import X.C18800tq;
import X.C32541dn;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

public abstract class Hilt_StorageUsageMediaGalleryFragment extends MediaGalleryFragmentBase {
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
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            C32581dr r4 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r4.A1K;
            C36321k7.A0W(r4, r2, C36371kC.A0Q(r2, storageUsageMediaGalleryFragment), storageUsageMediaGalleryFragment, r2.A02.get());
            storageUsageMediaGalleryFragment.A09 = (AnonymousClass1X7) r2.A4o.get();
            storageUsageMediaGalleryFragment.A02 = C36391kE.A0V(r2);
            storageUsageMediaGalleryFragment.A01 = C36351kA.A0J(r2);
            storageUsageMediaGalleryFragment.A03 = C36371kC.A0Z(r2);
            storageUsageMediaGalleryFragment.A08 = C36351kA.A0n(r2);
            storageUsageMediaGalleryFragment.A04 = (AnonymousClass1DF) r2.A4m.get();
            storageUsageMediaGalleryFragment.A0A = C36401kF.A0g(r2);
            storageUsageMediaGalleryFragment.A06 = (AnonymousClass1TA) r2.A7h.get();
            storageUsageMediaGalleryFragment.A05 = C36361kB.A0Z(r2);
            storageUsageMediaGalleryFragment.A0B = C36351kA.A0q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.Hilt_StorageUsageMediaGalleryFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
