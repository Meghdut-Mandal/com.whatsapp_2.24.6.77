package com.whatsapp.search;

import X.AnonymousClass165;
import X.AnonymousClass16K;
import X.AnonymousClass196;
import X.AnonymousClass1A4;
import X.AnonymousClass1A6;
import X.AnonymousClass1AO;
import X.AnonymousClass1AW;
import X.AnonymousClass1CF;
import X.AnonymousClass1CR;
import X.AnonymousClass1DU;
import X.AnonymousClass1EL;
import X.AnonymousClass1EM;
import X.AnonymousClass1EU;
import X.AnonymousClass1FR;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1HX;
import X.AnonymousClass1K3;
import X.AnonymousClass1KK;
import X.AnonymousClass1LU;
import X.AnonymousClass1LV;
import X.AnonymousClass1MK;
import X.AnonymousClass1NC;
import X.AnonymousClass1NG;
import X.AnonymousClass1QH;
import X.AnonymousClass1T1;
import X.AnonymousClass1T4;
import X.AnonymousClass1TA;
import X.AnonymousClass1V6;
import X.AnonymousClass1X7;
import X.AnonymousClass1Y3;
import X.AnonymousClass1YI;
import X.AnonymousClass1YR;
import X.AnonymousClass3L5;
import X.C111095bj;
import X.C115905jd;
import X.C115915je;
import X.C115925jf;
import X.C124155xg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19460v5;
import X.C19470v6;
import X.C20350xQ;
import X.C220712t;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C24541Cv;
import X.C25851Hx;
import X.C26171Jd;
import X.C26421Kc;
import X.C27111My;
import X.C28361Si;
import X.C28371Sj;
import X.C29411Wn;
import X.C32191d8;
import X.C32251dE;
import X.C32541dn;
import X.C32581dr;
import X.C32621dv;
import X.C32641dx;
import X.C32661dz;
import X.C32731e6;
import X.C32811eE;
import X.C32931eR;
import X.C33051ed;
import X.C33191es;
import X.C33231ew;
import X.C33761ft;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C61343Bm;
import X.C65383Rv;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_SearchFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            SearchFragment searchFragment = (SearchFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r5 = r3.A1K;
            C18830tt r1 = r5.A00;
            C32191d8.A00(searchFragment, C18830tt.A85(r1));
            searchFragment.A0t = C36351kA.A0V(r5);
            searchFragment.A1F = C36341k9.A0V(r5);
            searchFragment.A1j = (AnonymousClass1X7) r5.A4o.get();
            searchFragment.A0N = C36351kA.A0M(r5);
            searchFragment.A1T = (C28371Sj) r5.A4r.get();
            searchFragment.A0H = C36391kE.A0V(r5);
            searchFragment.A0O = C36351kA.A0N(r5);
            searchFragment.A0u = C36351kA.A0W(r5);
            searchFragment.A1M = C36351kA.A0h(r5);
            searchFragment.A1p = C36341k9.A0Z(r5);
            searchFragment.A0E = (AnonymousClass1NC) r5.A0C.get();
            searchFragment.A0X = (AnonymousClass1HX) r5.A0y.get();
            searchFragment.A11 = C36351kA.A0a(r5);
            searchFragment.A1Q = (AnonymousClass1DU) r5.A4T.get();
            C19470v6 r4 = C19470v6.A00;
            searchFragment.A0D = r4;
            searchFragment.A10 = (C220712t) r5.A1b.get();
            searchFragment.A0g = (AnonymousClass196) r5.A8N.get();
            searchFragment.A0R = C36361kB.A0T(r5);
            searchFragment.A1q = (AnonymousClass1YI) r5.A8s.get();
            searchFragment.A0W = (AnonymousClass1K3) r5.A0x.get();
            searchFragment.A1G = r5.AzV();
            searchFragment.A0F = C36351kA.A0J(r5);
            searchFragment.A0m = C36351kA.A0T(r5);
            searchFragment.A1S = C36411kG.A0m(r5);
            searchFragment.A1Z = (AnonymousClass1FR) r5.A6O.get();
            searchFragment.A0Z = (AnonymousClass1MK) r5.A75.get();
            searchFragment.A0C = r4;
            searchFragment.A0c = (AnonymousClass3L5) r5.A1Y.get();
            searchFragment.A0h = C36361kB.A0V(r5);
            searchFragment.A0i = C36341k9.A0R(r5);
            searchFragment.A0G = (C32621dv) r5.A2G.get();
            searchFragment.A14 = (AnonymousClass165) r5.A2R.get();
            searchFragment.A0s = C36351kA.A0U(r5);
            searchFragment.A0k = C36341k9.A0S(r5);
            searchFragment.A0x = C36341k9.A0T(r5);
            searchFragment.A1n = (AnonymousClass1EM) r5.A3l.get();
            searchFragment.A1Y = (AnonymousClass1EU) r5.A6M.get();
            searchFragment.A1A = (C32731e6) r5.A6S.get();
            searchFragment.A1U = (C32641dx) r1.A4F.get();
            searchFragment.A0V = (AnonymousClass1NG) r5.A0v.get();
            searchFragment.A0b = (AnonymousClass1AO) r5.A1W.get();
            searchFragment.A1H = (C20350xQ) r5.A3k.get();
            searchFragment.A19 = (C24541Cv) r5.A4O.get();
            searchFragment.A1J = (AnonymousClass1EL) r5.A8L.get();
            searchFragment.A1k = (C32661dz) r5.A0E.get();
            searchFragment.A1g = (AnonymousClass1CR) r5.A1i.get();
            searchFragment.A0S = (C29411Wn) r5.A9H.get();
            searchFragment.A1l = (C32811eE) r5.A0F.get();
            searchFragment.A0a = (C24361Cd) r5.A1j.get();
            searchFragment.A0l = (AnonymousClass16K) r5.A2C.get();
            searchFragment.A0o = C36421kH.A0K(r5);
            searchFragment.A1B = (AnonymousClass1YR) r5.A8e.get();
            searchFragment.A1E = (AnonymousClass1TA) r5.A7h.get();
            searchFragment.A1C = (C26171Jd) r5.A4s.get();
            searchFragment.A1D = (AnonymousClass1LU) r5.A7p.get();
            searchFragment.A1W = (C28361Si) r5.A56.get();
            searchFragment.A0w = C36351kA.A0Y(r5);
            searchFragment.A1s = C18840tu.A00(r5.A1Z);
            searchFragment.A0e = (AnonymousClass1LV) r5.A1q.get();
            searchFragment.A09 = r4;
            searchFragment.A0q = (AnonymousClass1A6) r5.A2P.get();
            searchFragment.A0z = (AnonymousClass1HJ) r5.A1O.get();
            searchFragment.A0n = (C65383Rv) r1.A2M.get();
            searchFragment.A18 = (AnonymousClass1HO) r5.A4M.get();
            searchFragment.A0B = r4;
            searchFragment.A1X = C90504aG.A0R(r5);
            searchFragment.A0T = (AnonymousClass1KK) r5.A19.get();
            searchFragment.A0p = (AnonymousClass1Y3) r5.A2N.get();
            searchFragment.A0d = (AnonymousClass1T4) r5.A1p.get();
            searchFragment.A0U = (C26421Kc) r5.A1A.get();
            searchFragment.A0f = C18800tq.A4u(r5);
            searchFragment.A1m = (C33051ed) r1.A1L.get();
            searchFragment.A17 = C36351kA.A0b(r5);
            searchFragment.A1a = C36351kA.A0m(r5);
            searchFragment.A07 = r4;
            searchFragment.A1I = (C233117z) r5.A3w.get();
            searchFragment.A0v = C36351kA.A0X(r5);
            searchFragment.A1R = C36411kG.A0l(r5);
            searchFragment.A0P = (AnonymousClass1T1) r5.A8V.get();
            searchFragment.A12 = C36371kC.A0X(r5);
            searchFragment.A15 = (AnonymousClass1A4) r5.A33.get();
            searchFragment.A16 = (AnonymousClass1QH) r5.A34.get();
            searchFragment.A0r = (AnonymousClass1V6) r5.A4v.get();
            searchFragment.A0j = C36351kA.A0S(r5);
            searchFragment.A13 = (C24381Cf) r5.A2M.get();
            searchFragment.A1V = (C33191es) r1.A1P.get();
            searchFragment.A0K = (C115905jd) r3.A0m.get();
            searchFragment.A1t = C18840tu.A00(r1.A35);
            searchFragment.A1h = (C32251dE) r1.A0E.get();
            searchFragment.A0y = (C25851Hx) r5.AGV.get();
            searchFragment.A1b = (AnonymousClass1AW) r5.A4H.get();
            searchFragment.A0Q = C36361kB.A0S(r5);
            searchFragment.A1L = (C33761ft) r5.Abq.get();
            searchFragment.A1o = C36351kA.A0q(r5);
            searchFragment.A1O = r5.AzZ();
            searchFragment.A1N = (C32931eR) r5.A4K.get();
            searchFragment.A1r = C18840tu.A00(r5.A1M);
            searchFragment.A08 = r4;
            searchFragment.A1K = (AnonymousClass1CF) r5.A8K.get();
            searchFragment.A0Y = (C124155xg) r1.A0n.get();
            searchFragment.A0L = (C115915je) r3.A0n.get();
            searchFragment.A0A = C19460v5.A01(new C111095bj());
            C27111My r12 = r3.A1I;
            searchFragment.A0J = (C61343Bm) r12.A3q.get();
            searchFragment.A0M = (C115925jf) r3.A0o.get();
            searchFragment.A0I = (C33231ew) r12.A0i.get();
        }
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
            r2.A00()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.Hilt_SearchFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
