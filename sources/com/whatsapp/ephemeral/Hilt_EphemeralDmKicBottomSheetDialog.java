package com.whatsapp.ephemeral;

import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C62383Fy;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_EphemeralDmKicBottomSheetDialog extends RoundedBottomSheetDialogFragment {
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
            EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog = (EphemeralDmKicBottomSheetDialog) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0U(this)).A1K;
            C18830tt r1 = r2.A00;
            C36321k7.A0l(r1, ephemeralDmKicBottomSheetDialog);
            ephemeralDmKicBottomSheetDialog.A0E = C36351kA.A0V(r2);
            ephemeralDmKicBottomSheetDialog.A02 = C36351kA.A0J(r2);
            ephemeralDmKicBottomSheetDialog.A0G = C18800tq.A9D(r2);
            ephemeralDmKicBottomSheetDialog.A0J = C18800tq.AG6(r2);
            ephemeralDmKicBottomSheetDialog.A0F = C36351kA.A0Y(r2);
            ephemeralDmKicBottomSheetDialog.A0D = C36401kF.A0V(r2);
            ephemeralDmKicBottomSheetDialog.A0C = C36361kB.A0X(r1);
            ephemeralDmKicBottomSheetDialog.A0H = (C62383Fy) r1.ABQ.get();
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
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.Hilt_EphemeralDmKicBottomSheetDialog.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
