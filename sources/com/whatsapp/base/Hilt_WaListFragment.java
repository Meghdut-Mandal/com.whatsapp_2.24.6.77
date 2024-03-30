package com.whatsapp.base;

import X.AnonymousClass02E;
import X.AnonymousClass04G;
import X.C18700tb;
import X.C28721Tt;
import X.C32531dl;
import X.C32541dn;
import X.C32551do;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.ListFragment;

public abstract class Hilt_WaListFragment extends ListFragment implements C18700tb {
    public ContextWrapper A00;
    public boolean A01;
    public final Object A02 = new Object();
    public volatile C32551do A03;

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
            r3.A1Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.base.Hilt_WaListFragment.A1F(android.app.Activity):void");
    }

    public abstract void A1Z();

    private void A03() {
        if (this.A00 == null) {
            this.A00 = new C32531dl(super.A1D(), (AnonymousClass02E) this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C32551do(this);
                }
            }
        }
        return this.A03.generatedComponent();
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
        A1Z();
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A01(this, super.BAw());
    }
}
