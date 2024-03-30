package com.whatsapp.extensions.webview.view;

import X.AnonymousClass02E;
import X.AnonymousClass04G;
import X.C18700tb;
import X.C28721Tt;
import X.C32541dn;
import X.C32551do;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_FlowsWebViewFragment extends AnonymousClass02E implements C18700tb {
    public boolean A00 = false;
    public ContextWrapper A01;
    public boolean A02;
    public final Object A03 = C36441kJ.A11();
    public volatile C32551do A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r4) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r4) {
        /*
            r3 = this;
            r2 = 1
            r3.A0Y = r2
            android.content.ContextWrapper r0 = r3.A01
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r4) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r3.A00()
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0029
            r3.A00 = r2
            java.lang.Object r1 = r3.generatedComponent()
            X.1dq r1 = (X.C32571dq) r1
            r0 = r3
            com.whatsapp.extensions.webview.view.FlowsWebViewFragment r0 = (com.whatsapp.extensions.webview.view.FlowsWebViewFragment) r0
            X.1dr r1 = (X.C32581dr) r1
            X.C32581dr.A17(r1, r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.view.Hilt_FlowsWebViewFragment.A1F(android.app.Activity):void");
    }

    private void A00() {
        if (this.A01 == null) {
            this.A01 = C36431kI.A11(super.A1D(), this);
            this.A02 = C32541dn.A00(super.A1D());
        }
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
        if (super.A1D() == null && !this.A02) {
            return null;
        }
        A00();
        return this.A01;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        if (!this.A00) {
            this.A00 = true;
            C32581dr.A17((C32581dr) ((C32571dq) generatedComponent()), (FlowsWebViewFragment) this);
        }
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A01(this, super.BAw());
    }
}
