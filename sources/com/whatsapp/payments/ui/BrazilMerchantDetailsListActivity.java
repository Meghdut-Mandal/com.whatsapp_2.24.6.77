package com.whatsapp.payments.ui;

import X.AE9;
import X.AnonymousClass0D3;
import X.AnonymousClass13E;
import X.AnonymousClass3DY;
import X.AnonymousClass5Go;
import X.AnonymousClass6PS;
import X.AnonymousClass9Op;
import X.B7Y;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C167737yi;
import X.C178858hy;
import X.C18800tq;
import X.C18830tt;
import X.C20050ww;
import X.C24631De;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C50282kV;
import android.content.Intent;
import android.view.ViewGroup;
import com.whatsapp.R;

public class BrazilMerchantDetailsListActivity extends C178858hy {
    public AnonymousClass3DY A00;
    public C20050ww A01;
    public AnonymousClass13E A02;
    public AE9 A03;
    public C24631De A04;
    public AnonymousClass6PS A05;
    public C50282kV A06;
    public C167737yi A07;
    public AnonymousClass9Op A08;
    public boolean A09;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C167737yi r2 = this.A07;
            C165597tg.A1E(r2.A0Q, r2, 7);
        }
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = C36381kD.A0f(r2);
            this.A01 = (C20050ww) r2.A7v.get();
            this.A00 = (AnonymousClass3DY) r2.A7b.get();
            this.A02 = (AnonymousClass13E) r2.A96.get();
            this.A03 = C27111My.A2m(A0L);
            this.A04 = (C24631De) C165577te.A0f(r2);
            this.A05 = C165607th.A0Z(r2);
            this.A08 = (AnonymousClass9Op) r1.A5X.get();
        }
    }

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        if (i != 302) {
            return super.A3i(viewGroup, i);
        }
        return new AnonymousClass5Go(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
    }

    public BrazilMerchantDetailsListActivity(int i) {
        this.A09 = false;
        B7Y.A00(this, 35);
    }

    public void A2x(int i) {
        if (i == R.string.f12nameremoved) {
            finish();
        }
    }

    public BrazilMerchantDetailsListActivity() {
        this(0);
    }
}
