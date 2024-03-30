package com.whatsapp.payments.ui;

import X.AnonymousClass07B;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C175818b6;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C207249un;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiBalanceDetailsActivity extends C179128jE {
    public boolean A00;
    public final C24611Dc A01;

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
        }
    }

    public IndiaUpiBalanceDetailsActivity(int i) {
        this.A00 = false;
        B7Z.A00(this, 0);
    }

    public void onCreate(Bundle bundle) {
        int A0B;
        super.onCreate(bundle);
        C165567td.A0j(this);
        if (C36431kI.A0F(this, R.layout.f9nameremoved) == null || C36371kC.A0H(this) == null || C36371kC.A0H(this).get("payment_bank_account") == null || C36371kC.A0H(this).get("balance") == null) {
            this.A01.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C165577te.A10(supportActionBar, R.string.f12nameremoved);
        }
        this.A01.A06("onCreate");
        TextView A0O = C36391kE.A0O(this.A00, R.id.balance_text);
        TextView A0O2 = C36391kE.A0O(this.A00, R.id.account_name_text);
        TextView A0O3 = C36391kE.A0O(this.A00, R.id.account_type_text);
        C207249un r1 = (C207249un) C36371kC.A0H(this).get("payment_bank_account");
        A0O2.setText(this.A0N.A03(r1));
        C175818b6 r12 = (C175818b6) r1.A08;
        if (r12 == null) {
            A0B = R.string.f12nameremoved;
        } else {
            A0B = r12.A0B();
        }
        A0O3.setText(A0B);
        A0O.setText(getIntent().getStringExtra("balance"));
        if (r12 != null) {
            String str = r12.A0A;
            if ("OD_UNSECURED".equals(str) || "OD_SECURED".equals(str)) {
                C36391kE.A0Q(this, R.id.balance).setText(R.string.f12nameremoved);
                findViewById(R.id.available_balance_layout).setVisibility(0);
                C36341k9.A13(this, R.id.divider_above_available_balance, 0);
                C36391kE.A0Q(this, R.id.available_balance_text).setText(getIntent().getStringExtra("usable_balance"));
            }
        }
    }

    public IndiaUpiBalanceDetailsActivity() {
        this(0);
        this.A01 = C165587tf.A0X("IndiaUpiBalanceDetailsActivity");
    }
}
