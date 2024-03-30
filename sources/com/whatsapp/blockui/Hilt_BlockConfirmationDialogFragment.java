package com.whatsapp.blockui;

import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1NG;
import X.AnonymousClass1X4;
import X.AnonymousClass3O6;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C32881eL;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C63633Ku;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_BlockConfirmationDialogFragment extends WaDialogFragment {
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
            BlockConfirmationDialogFragment blockConfirmationDialogFragment = (BlockConfirmationDialogFragment) this;
            C32581dr r4 = (C32581dr) C36391kE.A0T(this);
            C18800tq r2 = r4.A1K;
            C36321k7.A0f(r2, blockConfirmationDialogFragment);
            C18830tt r3 = r2.A00;
            C36371kC.A1J(r3, blockConfirmationDialogFragment);
            blockConfirmationDialogFragment.A09 = C36351kA.A0p(r3);
            blockConfirmationDialogFragment.A02 = C36341k9.A0R(r2);
            blockConfirmationDialogFragment.A07 = (C32881eL) r2.A4L.get();
            blockConfirmationDialogFragment.A05 = C36351kA.A0U(r2);
            blockConfirmationDialogFragment.A03 = C36341k9.A0S(r2);
            blockConfirmationDialogFragment.A06 = C27111My.A2S(r4.A1I);
            blockConfirmationDialogFragment.A04 = C36361kB.A0X(r3);
            AnonymousClass17Y r32 = (AnonymousClass17Y) r2.A3e.get();
            AnonymousClass1X4 r42 = (AnonymousClass1X4) r2.A8h.get();
            AnonymousClass171 r6 = (AnonymousClass171) r2.A90.get();
            blockConfirmationDialogFragment.A01 = new AnonymousClass3O6(r32, r42, (AnonymousClass1NG) r2.A0v.get(), r6, (C63633Ku) r2.A00.ACP.get(), (C19970wo) r2.A8b.get(), (C20810yC) r2.A02.get(), (C19770wU) r2.A9Y.get());
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.blockui.Hilt_BlockConfirmationDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
