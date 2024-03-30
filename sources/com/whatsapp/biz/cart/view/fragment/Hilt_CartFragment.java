package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass164;
import X.AnonymousClass1GX;
import X.AnonymousClass1XN;
import X.AnonymousClass5ZR;
import X.AnonymousClass60S;
import X.AnonymousClass6O1;
import X.AnonymousClass6VE;
import X.AnonymousClass960;
import X.AnonymousClass9R0;
import X.AnonymousClass9R1;
import X.AnonymousClass9ZJ;
import X.C120485ra;
import X.C1261362r;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C178358fo;
import X.C18800tq;
import X.C18830tt;
import X.C191569Dm;
import X.C191579Dn;
import X.C191589Do;
import X.C195119So;
import X.C199349fA;
import X.C20690y0;
import X.C27111My;
import X.C29461Ws;
import X.C31771cM;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C63273Jk;
import X.C90504aG;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;

public abstract class Hilt_CartFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            CartFragment cartFragment = (CartFragment) this;
            C32581dr r2 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r3 = r2.A1K;
            C18830tt r4 = r3.A00;
            C36361kB.A1E(r4, cartFragment);
            AnonymousClass5ZR.A00(cartFragment, (C120485ra) r4.A7n.get());
            cartFragment.A0e = C36351kA.A0V(r3);
            cartFragment.A0n = C36341k9.A0V(r3);
            cartFragment.A0y = C90504aG.A0W(r3);
            cartFragment.A0B = C36351kA.A0M(r3);
            cartFragment.A05 = C36391kE.A0V(r3);
            cartFragment.A10 = C36341k9.A0Z(r3);
            cartFragment.A0D = C36351kA.A0N(r3);
            cartFragment.A0A = (C20690y0) r3.A6r.get();
            cartFragment.A06 = (C191569Dm) r2.A03.get();
            cartFragment.A0l = C36351kA.A0e(r3);
            cartFragment.A0E = C36361kB.A0T(r3);
            cartFragment.A0k = (AnonymousClass1XN) r3.A7G.get();
            cartFragment.A0F = (AnonymousClass164) r3.A99.get();
            cartFragment.A0s = C165597tg.A0U(r3);
            cartFragment.A0K = (AnonymousClass6VE) r3.A1Q.get();
            cartFragment.A0J = (C178358fo) r3.ADJ.get();
            cartFragment.A0r = C36361kB.A0c(r3);
            cartFragment.A0z = (AnonymousClass1GX) r3.A4k.get();
            cartFragment.A0d = C36351kA.A0U(r3);
            cartFragment.A0c = C36341k9.A0S(r3);
            cartFragment.A0g = C36341k9.A0T(r3);
            cartFragment.A0i = (C1261362r) r4.A7C.get();
            cartFragment.A0Y = C36381kD.A0V(r3);
            cartFragment.A0a = C165587tf.A0M(r3);
            cartFragment.A0S = (C31771cM) r3.A6p.get();
            cartFragment.A0V = (C195119So) r4.A0y.get();
            cartFragment.A0T = (C29461Ws) r3.A1S.get();
            cartFragment.A0m = (EmojiSearchProvider) r4.A7B.get();
            cartFragment.A0b = C36371kC.A0U(r3);
            cartFragment.A0f = C36351kA.A0Y(r3);
            cartFragment.A0I = C165587tf.A0L(r3);
            cartFragment.A0U = C165607th.A0P(r3);
            cartFragment.A0t = C36351kA.A0m(r3);
            cartFragment.A0q = (C199349fA) r3.A3c.get();
            cartFragment.A0j = (AnonymousClass6O1) r4.A7K.get();
            cartFragment.A07 = (C191579Dn) r2.A07.get();
            cartFragment.A0N = C27111My.A0E(r2.A1I);
            cartFragment.A0w = (C63273Jk) r3.ADQ.get();
            cartFragment.A0u = (AnonymousClass9R0) r3.A1U.get();
            cartFragment.A0v = (AnonymousClass9R1) r4.A0z.get();
            cartFragment.A0Z = C18800tq.A4W(r3);
            cartFragment.A0M = new AnonymousClass9ZJ();
            cartFragment.A0L = new AnonymousClass960();
            cartFragment.A08 = (C191589Do) r2.A0D.get();
            cartFragment.A0x = C90504aG.A0V(r3);
            cartFragment.A0X = C32581dr.A0C(r2);
            cartFragment.A09 = (AnonymousClass60S) r2.A0O.get();
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
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.Hilt_CartFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
