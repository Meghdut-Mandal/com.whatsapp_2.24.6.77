package com.whatsapp.gallerypicker;

import X.AnonymousClass1A2;
import X.AnonymousClass1YL;
import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.gallery.Hilt_NewMediaPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

public abstract class Hilt_MediaPickerFragment extends MediaGalleryFragmentBase {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (this instanceof Hilt_NewMediaPickerFragment) {
            Hilt_NewMediaPickerFragment hilt_NewMediaPickerFragment = (Hilt_NewMediaPickerFragment) this;
            if (!hilt_NewMediaPickerFragment.A00) {
                hilt_NewMediaPickerFragment.A00 = true;
                C32581dr r3 = (C32581dr) C36401kF.A0K(hilt_NewMediaPickerFragment);
                C18800tq r2 = r3.A1K;
                C18830tt A0Q = C36371kC.A0Q(r2, hilt_NewMediaPickerFragment);
                C36321k7.A0W(r3, r2, A0Q, hilt_NewMediaPickerFragment, r2.A02.get());
                hilt_NewMediaPickerFragment.A07 = C36351kA.A0V(r2);
                hilt_NewMediaPickerFragment.A0A = (AnonymousClass1YL) r2.ARO.get();
                hilt_NewMediaPickerFragment.A0B = (AnonymousClass1A2) r2.A6R.get();
                C36421kH.A1B(A0Q, C36371kC.A0U(r2), hilt_NewMediaPickerFragment);
            }
        } else if (!this.A02) {
            this.A02 = true;
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            C32581dr r4 = (C32581dr) C36401kF.A0K(this);
            C18800tq r22 = r4.A1K;
            C18830tt A0Q2 = C36371kC.A0Q(r22, mediaPickerFragment);
            C36321k7.A0W(r4, r22, A0Q2, mediaPickerFragment, r22.A02.get());
            mediaPickerFragment.A07 = C36351kA.A0V(r22);
            mediaPickerFragment.A0A = (AnonymousClass1YL) r22.ARO.get();
            mediaPickerFragment.A0B = (AnonymousClass1A2) r22.A6R.get();
            C36421kH.A1B(A0Q2, C36371kC.A0U(r22), mediaPickerFragment);
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
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.Hilt_MediaPickerFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1Y();
    }
}
