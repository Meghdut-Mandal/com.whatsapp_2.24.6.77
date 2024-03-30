package com.whatsapp.payments;

import X.AnonymousClass00C;
import X.B7Y;
import X.C165567td;
import X.C173878Tm;
import X.C18800tq;
import X.C18830tt;
import X.C194189Ol;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

public final class GlobalPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public C194189Ol A00;
    public boolean A01;

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        Bundle A0H = C36371kC.A0H(this);
        if (A0H != null) {
            bundle.putAll(A0H);
        }
        super.onSaveInstanceState(bundle);
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173878Tm.A0H(r2, r1, this);
            C173878Tm.A0G(r2, r1, this);
            C173878Tm.A0F(A0L, r2, r1, this, C173878Tm.A01(r2, this));
            C173878Tm.A07(A0L, r2, r1, this);
            this.A00 = (C194189Ol) r1.A8e.get();
        }
    }

    public GlobalPaymentTransactionDetailActivity(int i) {
        this.A01 = false;
        B7Y.A00(this, 23);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0i = C36361kB.A0i();
        A3m(A0i, A0i);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            Integer A0i = C36361kB.A0i();
            A3m(A0i, A0i);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public GlobalPaymentTransactionDetailActivity() {
        this(0);
    }
}
