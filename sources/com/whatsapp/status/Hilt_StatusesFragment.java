package com.whatsapp.status;

import X.AnonymousClass16F;
import X.AnonymousClass18S;
import X.AnonymousClass1HT;
import X.AnonymousClass1Q1;
import X.AnonymousClass1Q4;
import X.AnonymousClass1UL;
import X.AnonymousClass2ZJ;
import X.AnonymousClass37S;
import X.AnonymousClass3CA;
import X.AnonymousClass3EG;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19470v6;
import X.C19760wT;
import X.C19980wp;
import X.C20060wx;
import X.C24371Ce;
import X.C32221dB;
import X.C32321dL;
import X.C32341dO;
import X.C32371dR;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C32601dt;
import X.C34901hp;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C58432zr;
import X.C62213Ff;
import X.C65553Sn;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaListFragment;

public abstract class Hilt_StatusesFragment extends WaListFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Z() {
        if (!this.A02) {
            this.A02 = true;
            StatusesFragment statusesFragment = (StatusesFragment) this;
            C18800tq r3 = ((C32581dr) ((C32571dq) generatedComponent())).A1K;
            C18830tt r4 = r3.A00;
            statusesFragment.A00 = C18830tt.A85(r4);
            statusesFragment.A0V = C36351kA.A0V(r3);
            statusesFragment.A0g = C36341k9.A0V(r3);
            statusesFragment.A0D = C36351kA.A0M(r3);
            statusesFragment.A0W = C36351kA.A0W(r3);
            statusesFragment.A0E = C36351kA.A0N(r3);
            statusesFragment.A17 = C36341k9.A0Z(r3);
            statusesFragment.A0U = (C19760wT) r3.A70.get();
            C19470v6 r1 = C19470v6.A00;
            statusesFragment.A08 = r1;
            statusesFragment.A0h = C36351kA.A0g(r3);
            statusesFragment.A0F = C36431kI.A0W(r3);
            statusesFragment.A0f = C36391kE.A0e(r3);
            statusesFragment.A0G = (C32601dt) r4.A46.get();
            statusesFragment.A0H = C36361kB.A0T(r3);
            statusesFragment.A0a = (C20060wx) r3.A8B.get();
            statusesFragment.A0A = C36351kA.A0J(r3);
            statusesFragment.A0P = C36351kA.A0T(r3);
            statusesFragment.A07 = r1;
            statusesFragment.A05 = C36391kE.A0S(r3);
            statusesFragment.A1A = C36391kE.A0p(r3);
            statusesFragment.A0L = C36341k9.A0R(r3);
            statusesFragment.A16 = C36351kA.A0q(r3);
            statusesFragment.A0T = C36351kA.A0U(r3);
            statusesFragment.A0N = C36341k9.A0S(r3);
            statusesFragment.A0Z = C36341k9.A0T(r3);
            statusesFragment.A0b = C36371kC.A0Z(r3);
            statusesFragment.A0M = C36351kA.A0S(r3);
            statusesFragment.A0c = C36361kB.A0Z(r3);
            statusesFragment.A0Q = C18830tt.A4I(r4);
            statusesFragment.A0k = C36371kC.A0j(r3);
            statusesFragment.A0S = C36431kI.A0a(r3);
            statusesFragment.A13 = (C34901hp) r4.A42.get();
            statusesFragment.A0I = C36431kI.A0Y(r3);
            statusesFragment.A0d = (AnonymousClass1HT) r3.A7x.get();
            statusesFragment.A0m = (AnonymousClass1Q1) r3.A9I.get();
            statusesFragment.A0K = C36381kD.A0X(r3);
            statusesFragment.A0v = (C32371dR) r3.A7H.get();
            statusesFragment.A0X = C36351kA.A0X(r3);
            statusesFragment.A0Y = C36351kA.A0Y(r3);
            statusesFragment.A0n = (C24371Ce) r3.A7y.get();
            statusesFragment.A0z = (C32221dB) r4.A43.get();
            statusesFragment.A0w = (C32341dO) r3.A7z.get();
            statusesFragment.A10 = C36381kD.A0i(r3);
            statusesFragment.A11 = (C65553Sn) r4.A3w.get();
            statusesFragment.A0e = (AnonymousClass16F) r3.AbN.get();
            statusesFragment.A0i = (C62213Ff) r3.AAg.get();
            statusesFragment.A0y = C18800tq.AKs(r3);
            statusesFragment.A0J = (AnonymousClass1Q4) r4.A0w.get();
            statusesFragment.A09 = (AnonymousClass18S) r4.A05.get();
            statusesFragment.A1C = C18840tu.A00(r4.A4Q);
            statusesFragment.A0B = (AnonymousClass3CA) r4.A7f.get();
            statusesFragment.A19 = (AnonymousClass1UL) r3.Aet.get();
            statusesFragment.A18 = (AnonymousClass2ZJ) r3.AA9.get();
            statusesFragment.A0R = (C19980wp) r3.A1x.get();
            statusesFragment.A12 = (AnonymousClass3EG) r4.A41.get();
            statusesFragment.A1B = C18840tu.A00(r3.AbA);
            statusesFragment.A1D = C18840tu.A00(r3.AfA);
            statusesFragment.A0j = C36361kB.A0a(r3);
            statusesFragment.A0q = (AnonymousClass37S) r4.A07.get();
            statusesFragment.A06 = r1;
            statusesFragment.A0s = C18800tq.AKo(r3);
            statusesFragment.A0r = C18830tt.ACa(r4);
            statusesFragment.A0C = (C58432zr) r4.A7g.get();
            statusesFragment.A0t = (C32321dL) r4.A3v.get();
            statusesFragment.A04 = r1;
            statusesFragment.A15 = C36361kB.A0e(r3);
            statusesFragment.A03 = r1;
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
            r2.A1Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.Hilt_StatusesFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1Z();
    }
}
