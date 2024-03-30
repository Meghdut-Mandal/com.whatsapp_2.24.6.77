package com.whatsapp.payments.ui;

import X.AnonymousClass07B;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C173858Tk;
import X.C178828hf;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36421kH;
import android.os.Bundle;
import com.whatsapp.R;

public class IndiaUpiProvideMoreInfoActivity extends C178828hf {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = C165587tf.A0Q(r2);
        }
    }

    public IndiaUpiProvideMoreInfoActivity(int i) {
        this.A00 = false;
        B7Z.A00(this, 36);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B A0F = C173858Tk.A0F(this);
        if (A0F != null) {
            C165607th.A16(this, A0F, R.string.f12nameremoved);
        }
        C36421kH.A13(findViewById(R.id.account_recovery_info_continue), this, 9);
    }

    public IndiaUpiProvideMoreInfoActivity() {
        this(0);
    }
}
