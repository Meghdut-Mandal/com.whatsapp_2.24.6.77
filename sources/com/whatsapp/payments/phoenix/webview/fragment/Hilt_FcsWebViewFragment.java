package com.whatsapp.payments.phoenix.webview.fragment;

import X.AnonymousClass02E;
import X.AnonymousClass04G;
import X.AnonymousClass61B;
import X.AnonymousClass6NP;
import X.AnonymousClass6PZ;
import X.C18700tb;
import X.C18800tq;
import X.C18830tt;
import X.C236419g;
import X.C28721Tt;
import X.C32541dn;
import X.C32551do;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C90484aE;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.extensions.phoenix.webview.Hilt_FcsExtensionsWebViewFragment;

public abstract class Hilt_FcsWebViewFragment extends AnonymousClass02E implements C18700tb {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C36441kJ.A11();
    public volatile C32551do A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0Y = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A00()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.Hilt_FcsWebViewFragment.A1F(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (this instanceof Hilt_FcsExtensionsWebViewFragment) {
            Hilt_FcsExtensionsWebViewFragment hilt_FcsExtensionsWebViewFragment = (Hilt_FcsExtensionsWebViewFragment) this;
            if (!hilt_FcsExtensionsWebViewFragment.A00) {
                hilt_FcsExtensionsWebViewFragment.A00 = true;
                FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = (FcsExtensionsWebViewFragment) hilt_FcsExtensionsWebViewFragment;
                C18800tq r2 = ((C32581dr) ((C32571dq) hilt_FcsExtensionsWebViewFragment.generatedComponent())).A1K;
                fcsExtensionsWebViewFragment.A02 = (AnonymousClass61B) r2.ANg.get();
                fcsExtensionsWebViewFragment.A04 = C90484aE.A0a(r2);
                fcsExtensionsWebViewFragment.A01 = C36341k9.A0V(r2);
                fcsExtensionsWebViewFragment.A03 = C18830tt.ACx(r2.A00);
                fcsExtensionsWebViewFragment.A03 = r2.A6p();
                fcsExtensionsWebViewFragment.A04 = C36371kC.A0Z(r2);
                fcsExtensionsWebViewFragment.A08 = C36351kA.A0n(r2);
                fcsExtensionsWebViewFragment.A02 = C36371kC.A0U(r2);
                fcsExtensionsWebViewFragment.A05 = (C236419g) r2.A1v.get();
                fcsExtensionsWebViewFragment.A00 = C36351kA.A0J(r2);
                fcsExtensionsWebViewFragment.A09 = C36341k9.A0Z(r2);
                fcsExtensionsWebViewFragment.A01 = C36351kA.A0M(r2);
                fcsExtensionsWebViewFragment.A07 = (AnonymousClass6NP) r2.AeU.get();
                fcsExtensionsWebViewFragment.A06 = (AnonymousClass6PZ) r2.AeT.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            FcsWebViewFragment fcsWebViewFragment = (FcsWebViewFragment) this;
            C18800tq r1 = ((C32581dr) ((C32571dq) generatedComponent())).A1K;
            fcsWebViewFragment.A02 = (AnonymousClass61B) r1.ANg.get();
            fcsWebViewFragment.A04 = C90484aE.A0a(r1);
            fcsWebViewFragment.A01 = C36341k9.A0V(r1);
            fcsWebViewFragment.A03 = C18830tt.ACx(r1.A00);
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
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A01(this, super.BAw());
    }
}
