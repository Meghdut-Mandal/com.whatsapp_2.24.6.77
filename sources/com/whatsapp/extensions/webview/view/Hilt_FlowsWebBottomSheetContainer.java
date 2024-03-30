package com.whatsapp.extensions.webview.view;

import X.AnonymousClass6NP;
import X.C115235iY;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C20810yC;
import X.C236419g;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C90484aE;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_FlowsWebBottomSheetContainer extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A07() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this;
            C32581dr r3 = (C32581dr) C36391kE.A0U(this);
            C18800tq r4 = r3.A1K;
            C18830tt r5 = r4.A00;
            C90504aG.A18(r5, flowsWebBottomSheetContainer);
            flowsWebBottomSheetContainer.A0H = C36341k9.A0V(r4);
            flowsWebBottomSheetContainer.A03 = C36351kA.A0J(r4);
            flowsWebBottomSheetContainer.A0I = C36331k8.A0I(r4);
            flowsWebBottomSheetContainer.A0A = C36371kC.A0Z(r4);
            flowsWebBottomSheetContainer.A08 = r4.A6p();
            flowsWebBottomSheetContainer.A06 = C36371kC.A0U(r4);
            flowsWebBottomSheetContainer.A0B = (C236419g) r4.A1v.get();
            flowsWebBottomSheetContainer.A04 = new C115235iY((C20810yC) r4.A02.get());
            flowsWebBottomSheetContainer.A07 = C90504aG.A0N(r5);
            flowsWebBottomSheetContainer.A05 = C36391kE.A0c(r4);
            flowsWebBottomSheetContainer.A09 = C36341k9.A0T(r4);
            flowsWebBottomSheetContainer.A0J = C90484aE.A0a(r4);
            flowsWebBottomSheetContainer.A0E = r4.A9t();
            flowsWebBottomSheetContainer.A0K = C18840tu.A00(r4.A1R);
            flowsWebBottomSheetContainer.A0L = C18840tu.A00(r4.A1T);
            flowsWebBottomSheetContainer.A0C = (AnonymousClass6NP) r4.AeU.get();
            flowsWebBottomSheetContainer.A0F = C32581dr.A0R(r3);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A07();
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
            r2.A07()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.view.Hilt_FlowsWebBottomSheetContainer.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A07();
        A1h();
    }
}
