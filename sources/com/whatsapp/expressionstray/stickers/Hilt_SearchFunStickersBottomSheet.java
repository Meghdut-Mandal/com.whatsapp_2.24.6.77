package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass1BB;
import X.C115885jb;
import X.C18800tq;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C63563Kn;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_SearchFunStickersBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0G() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this;
            C32581dr r3 = (C32581dr) C36391kE.A0U(this);
            C18800tq r1 = r3.A1K;
            C90504aG.A18(r1.A00, searchFunStickersBottomSheet);
            searchFunStickersBottomSheet.A0J = C36351kA.A0V(r1);
            searchFunStickersBottomSheet.A0L = C36341k9.A0V(r1);
            searchFunStickersBottomSheet.A0M = (C63563Kn) r3.A1I.A2l.get();
            searchFunStickersBottomSheet.A0I = C36351kA.A0U(r1);
            searchFunStickersBottomSheet.A0O = (AnonymousClass1BB) r1.A85.get();
            searchFunStickersBottomSheet.A08 = (C115885jb) r3.A0w.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A0G();
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
            r2.A0G()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.Hilt_SearchFunStickersBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A0G();
        A1h();
    }
}
