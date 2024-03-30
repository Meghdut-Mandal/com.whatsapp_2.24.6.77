package com.whatsapp.mediaview;

import X.AnonymousClass16K;
import X.AnonymousClass196;
import X.AnonymousClass1AW;
import X.AnonymousClass1D1;
import X.AnonymousClass1DF;
import X.AnonymousClass1DX;
import X.AnonymousClass1EO;
import X.AnonymousClass1GX;
import X.AnonymousClass1MP;
import X.AnonymousClass1NO;
import X.AnonymousClass1QW;
import X.AnonymousClass1ST;
import X.AnonymousClass1SU;
import X.AnonymousClass1TA;
import X.AnonymousClass1V6;
import X.AnonymousClass1Y4;
import X.AnonymousClass3CU;
import X.AnonymousClass3GQ;
import X.AnonymousClass3QH;
import X.AnonymousClass3T0;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19470v6;
import X.C20060wx;
import X.C24811Dw;
import X.C25361Fz;
import X.C25851Hx;
import X.C26861Lu;
import X.C27111My;
import X.C27261Nn;
import X.C28371Sj;
import X.C29151Vn;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C603437m;
import X.C74163lA;
import X.C75853nu;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_MediaViewFragment extends MediaViewBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0T() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r4 = r3.A1K;
            C18830tt A0Q = C36371kC.A0Q(r4, mediaViewFragment);
            mediaViewFragment.A0f = C36351kA.A0V(r4);
            mediaViewFragment.A0x = C36341k9.A0V(r4);
            mediaViewFragment.A0H = C36351kA.A0M(r4);
            mediaViewFragment.A1F = (C28371Sj) r4.A4r.get();
            mediaViewFragment.A0P = C36401kF.A0S(r4);
            mediaViewFragment.A0F = C36391kE.A0V(r4);
            mediaViewFragment.A0J = C36351kA.A0N(r4);
            mediaViewFragment.A0K = C36411kG.A0Y(r4);
            mediaViewFragment.A0g = C36351kA.A0W(r4);
            mediaViewFragment.A1n = C36341k9.A0Z(r4);
            mediaViewFragment.A0C = C36401kF.A0J(r4);
            mediaViewFragment.A1i = (AnonymousClass3QH) A0Q.A0H.get();
            mediaViewFragment.A0z = C36351kA.A0g(r4);
            mediaViewFragment.A0L = C36431kI.A0W(r4);
            mediaViewFragment.A0Q = (AnonymousClass196) r4.A8N.get();
            mediaViewFragment.A0M = C36361kB.A0T(r4);
            mediaViewFragment.A0y = r4.AzV();
            mediaViewFragment.A0I = C36371kC.A0R(r4);
            mediaViewFragment.A0k = (C20060wx) r4.A8B.get();
            mediaViewFragment.A1B = (AnonymousClass1D1) r4.APG.get();
            mediaViewFragment.A1G = C36361kB.A0c(r4);
            mediaViewFragment.A0D = C36351kA.A0J(r4);
            mediaViewFragment.A15 = C36411kG.A0m(r4);
            mediaViewFragment.A0S = C36341k9.A0R(r4);
            mediaViewFragment.A0w = C36431kI.A0b(r4);
            mediaViewFragment.A1k = (AnonymousClass1GX) r4.A4k.get();
            mediaViewFragment.A1m = C36351kA.A0q(r4);
            mediaViewFragment.A0d = C36351kA.A0U(r4);
            mediaViewFragment.A0j = C36341k9.A0T(r4);
            mediaViewFragment.A0W = C36341k9.A0S(r4);
            mediaViewFragment.A1j = C36371kC.A0l(r4);
            mediaViewFragment.A0G = (C26861Lu) r4.A2c.get();
            mediaViewFragment.A1L = C36381kD.A0f(r4);
            mediaViewFragment.A19 = (AnonymousClass1SU) r4.AQu.get();
            mediaViewFragment.A1Z = A0Q.A9D();
            mediaViewFragment.A0T = C36351kA.A0S(r4);
            mediaViewFragment.A1e = C36351kA.A0n(r4);
            mediaViewFragment.A0s = C36361kB.A0Z(r4);
            mediaViewFragment.A1J = C18800tq.AG6(r4);
            mediaViewFragment.A1b = (AnonymousClass3T0) A0Q.A4L.get();
            mediaViewFragment.A1g = C18800tq.ALZ(r4);
            mediaViewFragment.A0Y = C36411kG.A0b(r4);
            mediaViewFragment.A0E = C36351kA.A0K(r4);
            mediaViewFragment.A1X = (AnonymousClass3GQ) A0Q.ABb.get();
            mediaViewFragment.A11 = C36381kD.A0d(r4);
            mediaViewFragment.A0q = A0Q.A4o();
            mediaViewFragment.A0r = (AnonymousClass1DF) r4.A4m.get();
            mediaViewFragment.A1l = C36401kF.A0g(r4);
            mediaViewFragment.A0e = (AnonymousClass1MP) r4.A8X.get();
            mediaViewFragment.A0X = (AnonymousClass16K) r4.A2C.get();
            mediaViewFragment.A18 = (C24811Dw) r4.AQt.get();
            mediaViewFragment.A16 = C27111My.A2a(r3.A1I);
            mediaViewFragment.A1P = C36391kE.A0k(r4);
            mediaViewFragment.A0v = (AnonymousClass1TA) r4.A7h.get();
            mediaViewFragment.A0t = (AnonymousClass1NO) r4.A7t.get();
            mediaViewFragment.A0i = C36351kA.A0X(r4);
            mediaViewFragment.A0m = (AnonymousClass1DX) r4.AFJ.get();
            mediaViewFragment.A0V = C36371kC.A0U(r4);
            mediaViewFragment.A1a = r4.AKA();
            mediaViewFragment.A1A = (AnonymousClass1ST) r4.A4i.get();
            mediaViewFragment.A0Z = C36401kF.A0V(r4);
            mediaViewFragment.A1K = C36371kC.A0h(r4);
            mediaViewFragment.A0u = C36381kD.A0a(r4);
            mediaViewFragment.A0c = (AnonymousClass3CU) A0Q.ACR.get();
            mediaViewFragment.A17 = (AnonymousClass1Y4) r4.AZK.get();
            mediaViewFragment.A1H = (AnonymousClass1QW) A0Q.A0Z.get();
            mediaViewFragment.A0N = C18800tq.A1I(r4);
            mediaViewFragment.A10 = (C25361Fz) r4.ASg.get();
            mediaViewFragment.A1M = (C29151Vn) r4.AVb.get();
            mediaViewFragment.A1N = C36351kA.A0m(r4);
            mediaViewFragment.A1c = C36381kD.A0h(A0Q);
            mediaViewFragment.A0p = C36351kA.A0b(r4);
            mediaViewFragment.A0R = C36391kE.A0c(r4);
            mediaViewFragment.A0U = (C27261Nn) r4.AQN.get();
            mediaViewFragment.A0o = C36371kC.A0X(r4);
            mediaViewFragment.A0b = (AnonymousClass1V6) r4.A4v.get();
            mediaViewFragment.A0l = (C25851Hx) r4.AGV.get();
            mediaViewFragment.A1I = (C75853nu) A0Q.AAH.get();
            mediaViewFragment.A0h = C36411kG.A0c(r4);
            mediaViewFragment.A0O = (C603437m) A0Q.A5d.get();
            mediaViewFragment.A1O = new C74163lA();
            mediaViewFragment.A1U = (AnonymousClass1AW) r4.A4H.get();
            mediaViewFragment.A1V = (AnonymousClass1EO) r4.A4I.get();
            mediaViewFragment.A0n = C36351kA.A0a(r4);
            mediaViewFragment.A0B = C19470v6.A00;
            mediaViewFragment.A1q = C18840tu.A00(A0Q.A1z);
            mediaViewFragment.A1r = C18840tu.A00(r4.A5f);
            mediaViewFragment.A12 = C36351kA.A0h(r4);
            mediaViewFragment.A1d = C32581dr.A0d(r3);
            mediaViewFragment.A1s = C18840tu.A00(A0Q.ACb);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A0T();
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
            r2.A0T()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.Hilt_MediaViewFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A0T();
        A1Y();
    }
}
