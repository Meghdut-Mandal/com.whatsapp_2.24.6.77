package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass1D1;
import X.C122595v6;
import X.C158427gu;
import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ImageQualitySettingsBottomSheetFragment extends MediaQualitySettingsBottomSheetFragment {
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
            ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment = (ImageQualitySettingsBottomSheetFragment) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0U(this)).A1K;
            C18830tt r1 = r2.A00;
            C90504aG.A18(r1, imageQualitySettingsBottomSheetFragment);
            imageQualitySettingsBottomSheetFragment.A03 = C36341k9.A0T(r2);
            imageQualitySettingsBottomSheetFragment.A05 = (AnonymousClass1D1) r2.APG.get();
            imageQualitySettingsBottomSheetFragment.A06 = C36341k9.A0Z(r2);
            imageQualitySettingsBottomSheetFragment.A02 = C36351kA.A0M(r2);
            imageQualitySettingsBottomSheetFragment.A04 = C36341k9.A0V(r2);
            imageQualitySettingsBottomSheetFragment.A01 = (C122595v6) r1.A91.get();
            imageQualitySettingsBottomSheetFragment.A00 = C36391kE.A0V(r2);
        }
    }

    public Hilt_ImageQualitySettingsBottomSheetFragment(C158427gu r2, int i) {
        super(r2, i);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.bottomsheet.Hilt_ImageQualitySettingsBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}