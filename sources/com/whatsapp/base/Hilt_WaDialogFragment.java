package com.whatsapp.base;

import X.AnonymousClass02E;
import X.AnonymousClass04G;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20810yC;
import X.C28721Tt;
import X.C32531dl;
import X.C32541dn;
import X.C32551do;
import X.C32571dq;
import X.C32581dr;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.dialogs.Hilt_ProgressDialogFragment;

public abstract class Hilt_WaDialogFragment extends DialogFragment implements C18700tb {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C32551do A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C32551do.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0Y = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C32551do.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C31111bI.A00(r0, r1, r2)
            r3.A03()
            r3.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.base.Hilt_WaDialogFragment.A1F(android.app.Activity):void");
    }

    private void A03() {
        if (this.A00 == null) {
            this.A00 = new C32531dl(super.A1D(), (AnonymousClass02E) this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        C32571dq r1;
        Hilt_ProgressDialogFragment hilt_ProgressDialogFragment;
        if (this instanceof Hilt_ProgressDialogFragment) {
            Hilt_ProgressDialogFragment hilt_ProgressDialogFragment2 = (Hilt_ProgressDialogFragment) this;
            if (!hilt_ProgressDialogFragment2.A00) {
                hilt_ProgressDialogFragment2.A00 = true;
                r1 = (C32571dq) hilt_ProgressDialogFragment2.generatedComponent();
                hilt_ProgressDialogFragment = hilt_ProgressDialogFragment2;
            } else {
                return;
            }
        } else if (!this.A02) {
            this.A02 = true;
            r1 = (C32571dq) generatedComponent();
            hilt_ProgressDialogFragment = (WaDialogFragment) this;
        } else {
            return;
        }
        C18800tq r2 = ((C32581dr) r1).A1K;
        hilt_ProgressDialogFragment.A02 = (C20810yC) r2.A02.get();
        hilt_ProgressDialogFragment.A01 = (C18820ts) r2.A9X.get();
        hilt_ProgressDialogFragment.A03 = C18830tt.A85(r2.A00);
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C32551do(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A03();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        LayoutInflater A1E = super.A1E(bundle);
        return A1E.cloneInContext(new C32531dl(A1E, (AnonymousClass02E) this));
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A01(this, super.BAw());
    }
}
