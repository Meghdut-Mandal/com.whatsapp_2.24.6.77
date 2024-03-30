package com.whatsapp.conversationslist;

import X.AnonymousClass02E;
import X.AnonymousClass11e;
import X.AnonymousClass12P;
import X.AnonymousClass13J;
import X.AnonymousClass165;
import X.AnonymousClass168;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass196;
import X.AnonymousClass19J;
import X.AnonymousClass19R;
import X.AnonymousClass1A5;
import X.AnonymousClass1A6;
import X.AnonymousClass1AO;
import X.AnonymousClass1AW;
import X.AnonymousClass1C6;
import X.AnonymousClass1CF;
import X.AnonymousClass1CR;
import X.AnonymousClass1EL;
import X.AnonymousClass1EM;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FQ;
import X.AnonymousClass1FR;
import X.AnonymousClass1GC;
import X.AnonymousClass1H2;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1HP;
import X.AnonymousClass1HX;
import X.AnonymousClass1JI;
import X.AnonymousClass1JL;
import X.AnonymousClass1KI;
import X.AnonymousClass1KK;
import X.AnonymousClass1LU;
import X.AnonymousClass1LV;
import X.AnonymousClass1MP;
import X.AnonymousClass1N2;
import X.AnonymousClass1NC;
import X.AnonymousClass1NG;
import X.AnonymousClass1Pp;
import X.AnonymousClass1Q0;
import X.AnonymousClass1QW;
import X.AnonymousClass1RL;
import X.AnonymousClass1SA;
import X.AnonymousClass1T1;
import X.AnonymousClass1T4;
import X.AnonymousClass1X4;
import X.AnonymousClass1Y3;
import X.AnonymousClass1YR;
import X.C005602m;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19620wF;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C19980wp;
import X.C20350xQ;
import X.C20430xY;
import X.C20600xp;
import X.C20650xu;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C220412q;
import X.C220712t;
import X.C229216m;
import X.C230116v;
import X.C233117z;
import X.C235618y;
import X.C236419g;
import X.C24361Cd;
import X.C24381Cf;
import X.C24541Cv;
import X.C24771Ds;
import X.C24801Dv;
import X.C26171Jd;
import X.C26421Kc;
import X.C26801Lo;
import X.C27111My;
import X.C27591Ow;
import X.C27721Pm;
import X.C27731Pn;
import X.C28101Ri;
import X.C28361Si;
import X.C28371Sj;
import X.C28441Sr;
import X.C29341Wg;
import X.C29411Wn;
import X.C32251dE;
import X.C32531dl;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C32601dt;
import X.C32611du;
import X.C32621dv;
import X.C32641dx;
import X.C32661dz;
import X.C32811eE;
import X.C32821eF;
import X.C32881eL;
import X.C32931eR;
import X.C32941eS;
import X.C33041ec;
import X.C33051ed;
import X.C33061ee;
import X.C33071ef;
import X.C33081eg;
import X.C33101ei;
import X.C33161ep;
import X.C33171eq;
import X.C33181er;
import X.C33191es;
import X.C33201et;
import X.C33221ev;
import X.C33231ew;
import X.C33261ez;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaListFragment;
import com.whatsapp.suggestions.SuggestionsEngine;
import java.util.Objects;

public abstract class Hilt_ConversationsFragment extends WaListFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = new C32531dl(super.A1D(), (AnonymousClass02E) this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Z() {
        if (!this.A02) {
            this.A02 = true;
            ConversationsFragment conversationsFragment = (ConversationsFragment) this;
            C32581dr r6 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r1 = r6.A1K;
            C18830tt r3 = r1.A00;
            conversationsFragment.A00 = C18830tt.A85(r3);
            conversationsFragment.A1f = (C19970wo) r1.A8b.get();
            conversationsFragment.A21 = (C20810yC) r1.A02.get();
            conversationsFragment.A0d = (AnonymousClass17Y) r1.A3e.get();
            conversationsFragment.A2r = (AnonymousClass1N2) r1.A43.get();
            conversationsFragment.A2M = (C28371Sj) r1.A4r.get();
            conversationsFragment.A0f = (C19730wQ) r1.A4g.get();
            conversationsFragment.A1g = (C19630wG) r1.A91.get();
            conversationsFragment.A2G = (AnonymousClass190) r1.A97.get();
            conversationsFragment.A2u = (C19770wU) r1.A9Y.get();
            conversationsFragment.A0v = (AnonymousClass1HX) r1.A0y.get();
            conversationsFragment.A1l = (C220412q) r1.A1l.get();
            conversationsFragment.A23 = (C21010yW) r1.A79.get();
            conversationsFragment.A0W = (AnonymousClass1NC) r1.A0C.get();
            conversationsFragment.A1k = (C220712t) r1.A1b.get();
            conversationsFragment.A2k = (AnonymousClass1C6) r1.A7s.get();
            conversationsFragment.A12 = (AnonymousClass196) r1.A8N.get();
            conversationsFragment.A0h = (C32601dt) r3.A46.get();
            conversationsFragment.A0i = (AnonymousClass1X4) r1.A8h.get();
            conversationsFragment.A2x = (AnonymousClass1KI) r1.A0r.get();
            conversationsFragment.A22 = r1.AzV();
            conversationsFragment.A0X = (C24801Dv) r1.A0D.get();
            conversationsFragment.A1A = (C27731Pn) r1.A2E.get();
            conversationsFragment.A1s = (AnonymousClass168) r1.A4N.get();
            conversationsFragment.A2W = (AnonymousClass1FR) r1.A6O.get();
            C19470v6 r5 = C19470v6.A00;
            conversationsFragment.A0U = r5;
            conversationsFragment.A2w = (C27721Pm) r3.A0t.get();
            conversationsFragment.A2t = (AnonymousClass13J) r1.A6z.get();
            conversationsFragment.A14 = (AnonymousClass1Pp) r1.A28.get();
            conversationsFragment.A15 = (AnonymousClass16D) r1.A2A.get();
            conversationsFragment.A0Y = (C32621dv) r1.A2G.get();
            conversationsFragment.A1o = (AnonymousClass165) r1.A2R.get();
            conversationsFragment.A2Y = (AnonymousClass11e) r1.A7u.get();
            conversationsFragment.A1d = (C21060yb) r1.A8W.get();
            conversationsFragment.A17 = (AnonymousClass171) r1.A90.get();
            conversationsFragment.A2q = (AnonymousClass1EM) r1.A3l.get();
            C27111My r4 = r6.A1I;
            conversationsFragment.A29 = C27111My.A2M(r4);
            conversationsFragment.A0V = r5;
            conversationsFragment.A2U = (AnonymousClass1EU) r1.A6M.get();
            conversationsFragment.A2X = (C28441Sr) r1.A1g.get();
            conversationsFragment.A1p = (C20650xu) r1.A3Z.get();
            conversationsFragment.A2N = (C32641dx) r3.A4F.get();
            conversationsFragment.A20 = (AnonymousClass1H2) r1.A2x.get();
            conversationsFragment.A2o = (AnonymousClass1Q0) r1.A0L.get();
            conversationsFragment.A0t = (AnonymousClass1NG) r1.A0v.get();
            conversationsFragment.A2v = (AnonymousClass1HP) r1.A1G.get();
            conversationsFragment.A0y = (AnonymousClass1AO) r1.A1W.get();
            conversationsFragment.A16 = (AnonymousClass16I) r1.A2B.get();
            conversationsFragment.A24 = (C20350xQ) r1.A3k.get();
            conversationsFragment.A1B = (C32611du) r3.A2N.get();
            conversationsFragment.A1t = (C24541Cv) r1.A4O.get();
            conversationsFragment.A2F = (C27591Ow) r1.A5M.get();
            conversationsFragment.A2l = C18800tq.ALZ(r1);
            conversationsFragment.A0l = (AnonymousClass19J) r1.A9p.get();
            conversationsFragment.A18 = (C235618y) r1.A15.get();
            conversationsFragment.A0R = r5;
            conversationsFragment.A28 = (AnonymousClass1EL) r1.A8L.get();
            conversationsFragment.A2A = (C28101Ri) r3.A2C.get();
            conversationsFragment.A2m = (C32661dz) r1.A0E.get();
            conversationsFragment.A1Z = C18830tt.A4I(r3);
            conversationsFragment.A2f = (AnonymousClass1CR) r1.A1i.get();
            conversationsFragment.A2R = (C20600xp) r1.A5q.get();
            conversationsFragment.A1e = (AnonymousClass1MP) r1.A8X.get();
            conversationsFragment.A2d = (C29341Wg) r1.A8q.get();
            conversationsFragment.A0j = (C29411Wn) r1.A9H.get();
            conversationsFragment.A2n = (C32811eE) r1.A0F.get();
            conversationsFragment.A0s = (C32821eF) r3.A33.get();
            conversationsFragment.A2y = C18840tu.A00(r1.A0x);
            conversationsFragment.A1j = (AnonymousClass1HJ) r1.A1O.get();
            conversationsFragment.A2I = r1.AzZ();
            conversationsFragment.A0P = (C19460v5) r1.A5v.get();
            conversationsFragment.A0x = (C24361Cd) r1.A1j.get();
            C005602m r0 = AnonymousClass19R.A01;
            C19620wF.A00(r0);
            conversationsFragment.A38 = r0;
            conversationsFragment.A19 = (AnonymousClass16K) r1.A2C.get();
            conversationsFragment.A1C = (C20430xY) r1.A2H.get();
            conversationsFragment.A1w = (AnonymousClass1YR) r1.A8e.get();
            conversationsFragment.A2C = (AnonymousClass1JL) r3.A3t.get();
            conversationsFragment.A31 = C18840tu.A00(r1.A1Y);
            conversationsFragment.A2D = (AnonymousClass1CF) r1.A8K.get();
            conversationsFragment.A1i = (C18820ts) r1.A9X.get();
            conversationsFragment.A26 = C27111My.A2I(r4);
            conversationsFragment.A13 = (C229216m) r1.A27.get();
            conversationsFragment.A2O = (AnonymousClass1QW) r3.A0Z.get();
            conversationsFragment.A2Q = (C28361Si) r1.A56.get();
            conversationsFragment.A1u = (AnonymousClass12P) r1.A5G.get();
            conversationsFragment.A1z = (AnonymousClass1LU) r1.A7p.get();
            conversationsFragment.A1x = (C26171Jd) r1.A4s.get();
            conversationsFragment.A1v = (AnonymousClass1SA) r3.A2z.get();
            conversationsFragment.A0e = C32581dr.A01(r6);
            conversationsFragment.A32 = C18840tu.A00(r1.A1Z);
            conversationsFragment.A0L = r5;
            conversationsFragment.A10 = (AnonymousClass1LV) r1.A1q.get();
            conversationsFragment.A1F = (AnonymousClass1A6) r1.A2P.get();
            conversationsFragment.A1r = (AnonymousClass1HO) r1.A4M.get();
            conversationsFragment.A27 = (C26801Lo) r1.A60.get();
            conversationsFragment.A0T = r5;
            conversationsFragment.A11 = C18800tq.A4u(r1);
            conversationsFragment.A2H = (C32931eR) r1.A4K.get();
            conversationsFragment.A2J = (C32881eL) r1.A4L.get();
            conversationsFragment.A1n = (C24381Cf) r1.A2M.get();
            conversationsFragment.A2S = (AnonymousClass1FQ) r1.A6E.get();
            conversationsFragment.A1D = (C32941eS) r1.A2I.get();
            conversationsFragment.A2T = (AnonymousClass1EV) r1.A6K.get();
            conversationsFragment.A0p = C27111My.A09(r4);
            conversationsFragment.A0q = (AnonymousClass1KK) r1.A19.get();
            conversationsFragment.A1y = (C236419g) r1.A1v.get();
            conversationsFragment.A2s = (C230116v) r1.A4P.get();
            conversationsFragment.A0z = (AnonymousClass1T4) r1.A1p.get();
            conversationsFragment.A1E = (AnonymousClass1Y3) r1.A2N.get();
            conversationsFragment.A2Z = (AnonymousClass1JI) r3.A3j.get();
            conversationsFragment.A0w = C18800tq.A48(r1);
            conversationsFragment.A2c = (C33041ec) r3.A4G.get();
            conversationsFragment.A30 = C18840tu.A00(r1.A1M);
            conversationsFragment.A1h = (C19420v0) r1.A9G.get();
            conversationsFragment.A0r = (C26421Kc) r1.A1A.get();
            conversationsFragment.A2p = (C33051ed) r3.A1L.get();
            conversationsFragment.A1q = (AnonymousClass17X) r1.A3v.get();
            conversationsFragment.A1K = (C33061ee) r3.A2g.get();
            conversationsFragment.A0S = r5;
            conversationsFragment.A2b = (C24771Ds) r1.A6h.get();
            conversationsFragment.A0g = (AnonymousClass1T1) r1.A8V.get();
            conversationsFragment.A1m = (AnonymousClass1A5) r1.A2K.get();
            conversationsFragment.A25 = (C233117z) r1.A3w.get();
            conversationsFragment.A1V = (C33071ef) r3.A1A.get();
            conversationsFragment.A1Y = (C33081eg) r4.A0S.get();
            conversationsFragment.A2h = (C32251dE) r3.A0E.get();
            conversationsFragment.A0M = r5;
            conversationsFragment.A0m = (C33101ei) r1.A3f.get();
            conversationsFragment.A2j = (SuggestionsEngine) r6.A0x.get();
            conversationsFragment.A0o = (C33161ep) r1.A3j.get();
            conversationsFragment.A2V = (C33181er) r4.A3H.get();
            conversationsFragment.A1c = (C19980wp) r1.A1x.get();
            conversationsFragment.A0H = r5;
            conversationsFragment.A33 = C18840tu.A00(r3.A35);
            conversationsFragment.A0I = r5;
            conversationsFragment.A0n = (C33171eq) r1.A3i.get();
            conversationsFragment.A2z = C18840tu.A00(r1.A16);
            conversationsFragment.A0Q = r5;
            conversationsFragment.A0J = r5;
            conversationsFragment.A2P = (C33191es) r3.A1P.get();
            conversationsFragment.A0u = (C33201et) r4.A2K.get();
            conversationsFragment.A0O = r5;
            conversationsFragment.A2e = (AnonymousClass1AW) r1.A4H.get();
            conversationsFragment.A1O = (C33221ev) r3.A18.get();
            conversationsFragment.A0N = r5;
            conversationsFragment.A0a = (C33231ew) r4.A0i.get();
            Object obj = r1.A4A.get();
            Objects.requireNonNull(obj);
            conversationsFragment.A0K = new AnonymousClass1GC(obj);
            conversationsFragment.A0Z = (C33261ez) r4.A0f.get();
            conversationsFragment.A2E = (AnonymousClass1RL) r3.A4K.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_ConversationsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1Z();
    }
}
