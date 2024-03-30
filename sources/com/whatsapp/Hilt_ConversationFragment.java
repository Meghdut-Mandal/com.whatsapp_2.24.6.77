package com.whatsapp;

import X.AnonymousClass02E;
import X.C32531dl;
import X.C32541dn;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_ConversationFragment extends WaFragment {
    public boolean A00 = false;
    public ContextWrapper A01;
    public boolean A02;

    private void A00() {
        if (this.A01 == null) {
            this.A01 = new C32531dl(super.A1D(), (AnonymousClass02E) this);
            this.A02 = C32541dn.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A02) {
            return null;
        }
        A00();
        return this.A01;
    }

    public LayoutInflater A1E(Bundle bundle) {
        LayoutInflater A1E = super.A1E(bundle);
        return A1E.cloneInContext(new C32531dl(A1E, (AnonymousClass02E) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C32551do.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r4) {
        /*
            r3 = this;
            super.A1F(r4)
            android.content.ContextWrapper r0 = r3.A01
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
            r3.A00()
            r3.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Hilt_ConversationFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
