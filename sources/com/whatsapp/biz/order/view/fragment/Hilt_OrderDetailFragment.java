package com.whatsapp.biz.order.view.fragment;

import X.AnonymousClass1NM;
import X.AnonymousClass5ZR;
import X.AnonymousClass9Dj;
import X.AnonymousClass9R1;
import X.C120485ra;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C191549Dk;
import X.C191559Dl;
import X.C19470v6;
import X.C195119So;
import X.C199969gL;
import X.C24631De;
import X.C27111My;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_OrderDetailFragment extends RoundedBottomSheetDialogFragment {
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
            OrderDetailFragment orderDetailFragment = (OrderDetailFragment) this;
            C32581dr r2 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r3 = r2.A1K;
            C18830tt r4 = r3.A00;
            C36361kB.A1E(r4, orderDetailFragment);
            AnonymousClass5ZR.A00(orderDetailFragment, (C120485ra) r4.A7n.get());
            orderDetailFragment.A0G = C36351kA.A0V(r3);
            orderDetailFragment.A0I = C36341k9.A0V(r3);
            orderDetailFragment.A06 = C36351kA.A0N(r3);
            orderDetailFragment.A0N = C165597tg.A0U(r3);
            orderDetailFragment.A0H = C36371kC.A0Z(r3);
            orderDetailFragment.A0R = C36351kA.A0n(r3);
            orderDetailFragment.A01 = C36391kE.A0S(r3);
            orderDetailFragment.A0M = C36431kI.A0p(r3);
            orderDetailFragment.A0F = (AnonymousClass1NM) r3.A1c.get();
            orderDetailFragment.A02 = C19470v6.A00;
            orderDetailFragment.A0A = (C195119So) r4.A0y.get();
            orderDetailFragment.A0L = (C24631De) C165577te.A0f(r3);
            orderDetailFragment.A09 = C165607th.A0P(r3);
            orderDetailFragment.A0Q = (C199969gL) r3.AUu.get();
            orderDetailFragment.A03 = (AnonymousClass9Dj) r2.A04.get();
            orderDetailFragment.A04 = (C191549Dk) r2.A05.get();
            orderDetailFragment.A0O = (AnonymousClass9R1) r4.A0z.get();
            orderDetailFragment.A0E = C36371kC.A0U(r3);
            orderDetailFragment.A05 = (C191559Dl) r2.A06.get();
            orderDetailFragment.A08 = C27111My.A0E(r2.A1I);
            orderDetailFragment.A0T = C36341k9.A0Z(r3);
            orderDetailFragment.A0D = C32581dr.A0C(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.order.view.fragment.Hilt_OrderDetailFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
