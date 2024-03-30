package com.whatsapp.biz.product.view.fragment;

import X.C18800tq;
import X.C198909eO;
import X.C27111My;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_ProductBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            ProductBottomSheet productBottomSheet = (ProductBottomSheet) this;
            C32581dr r3 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r1 = r3.A1K;
            C36361kB.A1E(r1.A00, productBottomSheet);
            productBottomSheet.A04 = C27111My.A0E(r3.A1I);
            productBottomSheet.A09 = C36341k9.A0T(r1);
            productBottomSheet.A06 = (C198909eO) r3.A1J.A03.get();
            productBottomSheet.A0B = C36341k9.A0Z(r1);
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
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.fragment.Hilt_ProductBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
