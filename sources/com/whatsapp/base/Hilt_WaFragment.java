package com.whatsapp.base;

import X.AnonymousClass02E;
import X.AnonymousClass04G;
import X.AnonymousClass11e;
import X.AnonymousClass13J;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass18S;
import X.AnonymousClass1C6;
import X.AnonymousClass1CR;
import X.AnonymousClass1GQ;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1JL;
import X.AnonymousClass1LV;
import X.AnonymousClass1MK;
import X.AnonymousClass1N6;
import X.AnonymousClass1ND;
import X.AnonymousClass1PZ;
import X.AnonymousClass30C;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20350xQ;
import X.C20810yC;
import X.C20830yE;
import X.C21060yb;
import X.C220712t;
import X.C229216m;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C24801Dv;
import X.C26211Jh;
import X.C26421Kc;
import X.C27111My;
import X.C27731Pn;
import X.C28331Sf;
import X.C28431Sq;
import X.C28721Tt;
import X.C28781Ua;
import X.C29411Wn;
import X.C30131Zi;
import X.C32221dB;
import X.C32241dD;
import X.C32251dE;
import X.C32261dF;
import X.C32291dI;
import X.C32321dL;
import X.C32371dR;
import X.C32381dS;
import X.C32531dl;
import X.C32541dn;
import X.C32551do;
import X.C32571dq;
import X.C32581dr;
import X.C32601dt;
import X.C32681e1;
import X.C33771fu;
import X.C34361gu;
import X.C34371gv;
import X.C34381gw;
import X.C34481h7;
import X.C34491h8;
import X.C34501h9;
import X.C34511hA;
import X.C34521hB;
import X.C34531hC;
import X.C34541hD;
import X.C34551hE;
import X.C34561hF;
import X.C34571hG;
import X.C34581hH;
import X.C34591hI;
import X.C58472zv;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.Hilt_ConversationFragment;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.calling.callhistory.view.Hilt_CallsHistoryFragmentV2;
import com.whatsapp.community.CommunityFragment;
import com.whatsapp.community.Hilt_CommunityFragment;
import com.whatsapp.updates.ui.Hilt_UpdatesFragment;
import com.whatsapp.updates.ui.UpdatesFragment;

public abstract class Hilt_WaFragment extends AnonymousClass02E implements C18700tb {
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
            r3.A00()
            r3.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.base.Hilt_WaFragment.A1F(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C32531dl(super.A1D(), (AnonymousClass02E) this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        C32571dq r0;
        Hilt_ConversationFragment hilt_ConversationFragment;
        if (this instanceof Hilt_UpdatesFragment) {
            Hilt_UpdatesFragment hilt_UpdatesFragment = (Hilt_UpdatesFragment) this;
            if (!hilt_UpdatesFragment.A00) {
                hilt_UpdatesFragment.A00 = true;
                UpdatesFragment updatesFragment = (UpdatesFragment) hilt_UpdatesFragment;
                C32581dr r5 = (C32581dr) ((C32571dq) hilt_UpdatesFragment.generatedComponent());
                C18800tq r2 = r5.A1K;
                C18830tt r3 = r2.A00;
                updatesFragment.A00 = C18830tt.A85(r3);
                updatesFragment.A0G = (C19970wo) r2.A8b.get();
                updatesFragment.A0K = (C20810yC) r2.A02.get();
                updatesFragment.A0A = (AnonymousClass17Y) r2.A3e.get();
                updatesFragment.A0H = (C19630wG) r2.A91.get();
                updatesFragment.A0B = (C19730wQ) r2.A4g.get();
                updatesFragment.A0e = (C19770wU) r2.A9Y.get();
                C19470v6 r4 = C19470v6.A00;
                updatesFragment.A04 = r4;
                updatesFragment.A0u = C18840tu.A00(r2.A8B);
                updatesFragment.A0h = C18840tu.A00(r2.A0D);
                updatesFragment.A03 = r4;
                updatesFragment.A01 = (C19460v5) r2.A5v.get();
                updatesFragment.A0d = (AnonymousClass13J) r2.A6z.get();
                updatesFragment.A0F = (C21060yb) r2.A8W.get();
                updatesFragment.A0M = (AnonymousClass1GQ) r2.A5a.get();
                updatesFragment.A0r = C18840tu.A00(r3.A3t);
                updatesFragment.A0Y = (C32221dB) r3.A43.get();
                updatesFragment.A0t = C18840tu.A00(r3.A42);
                updatesFragment.A0O = (C32241dD) r2.A5g.get();
                updatesFragment.A0N = (C30131Zi) r2.A5h.get();
                updatesFragment.A0v = C18840tu.A00(r2.A9I);
                updatesFragment.A0n = C18840tu.A00(r2.A5e);
                updatesFragment.A0o = C18840tu.A00(r2.A5f);
                updatesFragment.A0I = (C20830yE) r2.A9E.get();
                updatesFragment.A0J = (C19420v0) r2.A9G.get();
                updatesFragment.A0P = (AnonymousClass1CR) r2.A1i.get();
                updatesFragment.A0s = C18840tu.A00(r2.A7z);
                updatesFragment.A0i = C18840tu.A00(r3.A07);
                updatesFragment.A0j = C18840tu.A00(r3.A0w);
                updatesFragment.A0k = C18840tu.A00(r3.A12);
                updatesFragment.A05 = (AnonymousClass18S) r3.A05.get();
                updatesFragment.A0a = (AnonymousClass1N6) r2.A5V.get();
                updatesFragment.A0Z = (C32251dE) r3.A0E.get();
                updatesFragment.A0l = C18840tu.A00(r2.A1x);
                updatesFragment.A0q = C18840tu.A00(r3.A2s);
                updatesFragment.A06 = (C32261dF) r3.A0F.get();
                updatesFragment.A0m = C18840tu.A00(r2.A3k);
                updatesFragment.A07 = (C58472zv) r3.A4C.get();
                updatesFragment.A08 = (AnonymousClass30C) r3.A47.get();
                updatesFragment.A09 = (C32291dI) r3.A3x.get();
                updatesFragment.A0V = (C32321dL) r3.A3v.get();
                updatesFragment.A02 = r4;
                updatesFragment.A0X = (C32371dR) r2.A7H.get();
                updatesFragment.A00 = r4;
                updatesFragment.A0L = C27111My.A2M(r5.A1I);
                updatesFragment.A0g = (C28781Ua) r2.A9d.get();
                updatesFragment.A0D = (WfalManager) r2.A9U.get();
                updatesFragment.A0f = (C32381dS) r3.A1F.get();
                updatesFragment.A0w = C18840tu.A00(r3.A4Q);
                updatesFragment.A0p = C18840tu.A00(r2.A5h);
                updatesFragment.A0R = (C28331Sf) r2.A7w.get();
            }
        } else if (this instanceof Hilt_CommunityFragment) {
            Hilt_CommunityFragment hilt_CommunityFragment = (Hilt_CommunityFragment) this;
            if (!hilt_CommunityFragment.A00) {
                hilt_CommunityFragment.A00 = true;
                CommunityFragment communityFragment = (CommunityFragment) hilt_CommunityFragment;
                C32581dr r32 = (C32581dr) ((C32571dq) hilt_CommunityFragment.generatedComponent());
                C18800tq r42 = r32.A1K;
                C18830tt r22 = r42.A00;
                communityFragment.A00 = C18830tt.A85(r22);
                communityFragment.A0C = (C19970wo) r42.A8b.get();
                communityFragment.A0H = (C20810yC) r42.A02.get();
                communityFragment.A04 = (AnonymousClass17Y) r42.A3e.get();
                communityFragment.A0F = (C220712t) r42.A1b.get();
                communityFragment.A00 = (C24801Dv) r42.A0D.get();
                communityFragment.A0B = (C27731Pn) r42.A2E.get();
                communityFragment.A0E = (C18820ts) r42.A9X.get();
                communityFragment.A0A = (AnonymousClass16I) r42.A2B.get();
                communityFragment.A06 = (C24361Cd) r42.A1j.get();
                communityFragment.A08 = (C28431Sq) r42.A1r.get();
                communityFragment.A0J = (AnonymousClass1JL) r22.A3t.get();
                communityFragment.A0D = (C19420v0) r42.A9G.get();
                communityFragment.A07 = (AnonymousClass1LV) r42.A1q.get();
                communityFragment.A0G = (C24381Cf) r42.A2M.get();
                C27111My r23 = r32.A1I;
                communityFragment.A01 = (C34361gu) r23.A0g.get();
                communityFragment.A05 = (C26421Kc) r42.A1A.get();
                communityFragment.A0I = (C233117z) r42.A3w.get();
                communityFragment.A0K = (AnonymousClass1N6) r42.A5V.get();
                communityFragment.A03 = (C34371gv) r32.A0U.get();
                communityFragment.A02 = (C34381gw) r23.A0h.get();
            }
        } else if (this instanceof Hilt_CallsHistoryFragmentV2) {
            Hilt_CallsHistoryFragmentV2 hilt_CallsHistoryFragmentV2 = (Hilt_CallsHistoryFragmentV2) this;
            if (!hilt_CallsHistoryFragmentV2.A00) {
                hilt_CallsHistoryFragmentV2.A00 = true;
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) hilt_CallsHistoryFragmentV2;
                C32581dr r52 = (C32581dr) ((C32571dq) hilt_CallsHistoryFragmentV2.generatedComponent());
                C18800tq r24 = r52.A1K;
                C18830tt r33 = r24.A00;
                callsHistoryFragmentV2.A00 = C18830tt.A85(r33);
                callsHistoryFragmentV2.A0Q = (C19970wo) r24.A8b.get();
                callsHistoryFragmentV2.A0W = (C20810yC) r24.A02.get();
                callsHistoryFragmentV2.A0C = (C33771fu) r24.A8f.get();
                callsHistoryFragmentV2.A09 = (AnonymousClass17Y) r24.A3e.get();
                callsHistoryFragmentV2.A0c = (C32681e1) r33.A2Y.get();
                callsHistoryFragmentV2.A0A = (C19730wQ) r24.A4g.get();
                callsHistoryFragmentV2.A0k = (C19770wU) r24.A9Y.get();
                C19470v6 r43 = C19470v6.A00;
                callsHistoryFragmentV2.A07 = r43;
                callsHistoryFragmentV2.A0a = (AnonymousClass1C6) r24.A7s.get();
                callsHistoryFragmentV2.A0B = (C32601dt) r33.A46.get();
                callsHistoryFragmentV2.A0G = (AnonymousClass1ND) r24.A1N.get();
                callsHistoryFragmentV2.A08 = (C24801Dv) r24.A0D.get();
                callsHistoryFragmentV2.A0N = (C27731Pn) r24.A2E.get();
                callsHistoryFragmentV2.A06 = r43;
                callsHistoryFragmentV2.A0Z = (AnonymousClass11e) r24.A7u.get();
                callsHistoryFragmentV2.A0d = (AnonymousClass13J) r24.A6z.get();
                callsHistoryFragmentV2.A05 = (C19460v5) r24.A5v.get();
                callsHistoryFragmentV2.A0I = (AnonymousClass1MK) r24.A75.get();
                callsHistoryFragmentV2.A0K = (AnonymousClass16D) r24.A2A.get();
                callsHistoryFragmentV2.A0O = C18830tt.A4I(r33);
                callsHistoryFragmentV2.A0P = (C21060yb) r24.A8W.get();
                callsHistoryFragmentV2.A0R = (C18820ts) r24.A9X.get();
                callsHistoryFragmentV2.A0X = (C20350xQ) r24.A3k.get();
                callsHistoryFragmentV2.A0S = (AnonymousClass1HJ) r24.A1O.get();
                callsHistoryFragmentV2.A0D = (C29411Wn) r24.A9H.get();
                callsHistoryFragmentV2.A0Y = (AnonymousClass1JL) r33.A3t.get();
                callsHistoryFragmentV2.A0E = new C34591hI((C34481h7) r52.A0E.get(), (C34491h8) r52.A0F.get(), (C34501h9) r52.A0G.get(), (C34511hA) r52.A0H.get(), (C34521hB) r52.A0I.get(), (C34531hC) r52.A0J.get(), (C34541hD) r52.A0K.get(), (C34551hE) r52.A0L.get(), (C34561hF) r52.A0M.get(), (C34571hG) r52.A0N.get(), (C34581hH) r52.A0P.get(), (C20810yC) r24.A02.get());
                callsHistoryFragmentV2.A0J = (C229216m) r24.A27.get();
                callsHistoryFragmentV2.A0V = (C26211Jh) r24.A7X.get();
                callsHistoryFragmentV2.A0U = (AnonymousClass1HO) r24.A4M.get();
                callsHistoryFragmentV2.A0H = (AnonymousClass1PZ) r24.A1L.get();
                callsHistoryFragmentV2.A0b = (AnonymousClass1N6) r24.A5V.get();
                callsHistoryFragmentV2.A0m = C18840tu.A00(r33.A3n);
                callsHistoryFragmentV2.A0l = C18840tu.A00(r24.A2i);
                callsHistoryFragmentV2.A0T = (AnonymousClass17X) r24.A3v.get();
            }
        } else {
            if (this instanceof Hilt_ConversationFragment) {
                Hilt_ConversationFragment hilt_ConversationFragment2 = (Hilt_ConversationFragment) this;
                if (!hilt_ConversationFragment2.A00) {
                    hilt_ConversationFragment2.A00 = true;
                    r0 = (C32571dq) hilt_ConversationFragment2.generatedComponent();
                    hilt_ConversationFragment = hilt_ConversationFragment2;
                } else {
                    return;
                }
            } else if (!this.A02) {
                this.A02 = true;
                r0 = (C32571dq) generatedComponent();
                hilt_ConversationFragment = (WaFragment) this;
            } else {
                return;
            }
            hilt_ConversationFragment.A00 = C18830tt.A85(((C32581dr) r0).A1K.A00);
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
        LayoutInflater A1E = super.A1E(bundle);
        return A1E.cloneInContext(new C32531dl(A1E, (AnonymousClass02E) this));
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
