package com.whatsapp.status.playback.fragment;

import X.AnonymousClass16F;
import X.AnonymousClass1AW;
import X.AnonymousClass1HT;
import X.AnonymousClass1Q1;
import X.AnonymousClass3BT;
import X.AnonymousClass3S6;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C24291Bw;
import X.C25121Fb;
import X.C25141Fd;
import X.C28301Sc;
import X.C32541dn;
import X.C32581dr;
import X.C34911hq;
import X.C34931hs;
import X.C35011i0;
import X.C35021i1;
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
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

public abstract class Hilt_StatusPlaybackContactFragment extends StatusPlaybackBaseFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0H() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r2 = r3.A1K;
            C18830tt A0Q = C36371kC.A0Q(r2, statusPlaybackContactFragment);
            statusPlaybackContactFragment.A00 = C36351kA.A0M(r2);
            statusPlaybackContactFragment.A01 = C36351kA.A0U(r2);
            statusPlaybackContactFragment.A02 = C36341k9.A0T(r2);
            statusPlaybackContactFragment.A03 = C36341k9.A0V(r2);
            statusPlaybackContactFragment.A05 = (AnonymousClass3S6) A0Q.ACV.get();
            statusPlaybackContactFragment.A0H = C36351kA.A0V(r2);
            statusPlaybackContactFragment.A03 = C36351kA.A0N(r2);
            statusPlaybackContactFragment.A04 = C36411kG.A0Y(r2);
            statusPlaybackContactFragment.A0e = C36341k9.A0Z(r2);
            statusPlaybackContactFragment.A0N = C36351kA.A0g(r2);
            statusPlaybackContactFragment.A05 = C36431kI.A0W(r2);
            statusPlaybackContactFragment.A0M = C36391kE.A0e(r2);
            statusPlaybackContactFragment.A07 = C36361kB.A0T(r2);
            statusPlaybackContactFragment.A09 = C36391kE.A0Y(r2);
            statusPlaybackContactFragment.A02 = C36371kC.A0R(r2);
            statusPlaybackContactFragment.A0F = C36351kA.A0T(r2);
            statusPlaybackContactFragment.A0Z = (C28301Sc) r2.AbG.get();
            statusPlaybackContactFragment.A0j = C36391kE.A0p(r2);
            statusPlaybackContactFragment.A0C = C36341k9.A0R(r2);
            statusPlaybackContactFragment.A0d = C36351kA.A0q(r2);
            statusPlaybackContactFragment.A0E = C36341k9.A0S(r2);
            statusPlaybackContactFragment.A0B = C36391kE.A0Z(r2);
            statusPlaybackContactFragment.A0f = (C34911hq) A0Q.A6X.get();
            statusPlaybackContactFragment.A0S = C36371kC.A0f(r2);
            statusPlaybackContactFragment.A0D = C36351kA.A0S(r2);
            statusPlaybackContactFragment.A0I = C36371kC.A0Z(r2);
            statusPlaybackContactFragment.A0c = C36351kA.A0n(r2);
            statusPlaybackContactFragment.A0J = C36361kB.A0Z(r2);
            statusPlaybackContactFragment.A0W = C36371kC.A0j(r2);
            statusPlaybackContactFragment.A0G = C36401kF.A0W(r2);
            statusPlaybackContactFragment.A0A = C36371kC.A0T(r2);
            statusPlaybackContactFragment.A0K = (AnonymousClass1HT) r2.A7x.get();
            statusPlaybackContactFragment.A0X = (AnonymousClass1Q1) r2.A9I.get();
            statusPlaybackContactFragment.A0a = C36381kD.A0i(r2);
            statusPlaybackContactFragment.A0T = (NewsletterLinkLauncher) r2.A5f.get();
            statusPlaybackContactFragment.A0L = (AnonymousClass16F) r2.AbN.get();
            statusPlaybackContactFragment.A0g = (C34931hs) r2.AEx.get();
            statusPlaybackContactFragment.A08 = C36431kI.A0Y(r2);
            statusPlaybackContactFragment.A0h = (C35011i0) A0Q.A4Q.get();
            statusPlaybackContactFragment.A0Y = C36381kD.A0h(A0Q);
            statusPlaybackContactFragment.A0b = (AnonymousClass3BT) r3.A1I.A5V.get();
            statusPlaybackContactFragment.A0P = C36371kC.A0c(r2);
            statusPlaybackContactFragment.A0i = (C35021i1) r2.Aew.get();
            statusPlaybackContactFragment.A0k = C18840tu.A00(r2.AbA);
            statusPlaybackContactFragment.A0l = C18840tu.A00(r2.AfA);
            statusPlaybackContactFragment.A0O = (C25121Fb) r2.A3K.get();
            statusPlaybackContactFragment.A0V = (AnonymousClass1AW) r2.A4H.get();
            statusPlaybackContactFragment.A06 = C36361kB.A0S(r2);
            statusPlaybackContactFragment.A0Q = C36351kA.A0h(r2);
            statusPlaybackContactFragment.A0p = C25141Fd.A00();
            statusPlaybackContactFragment.A0q = C24291Bw.A00();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A0H();
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
            r2.A0H()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.Hilt_StatusPlaybackContactFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A0H();
        A1Y();
    }
}
