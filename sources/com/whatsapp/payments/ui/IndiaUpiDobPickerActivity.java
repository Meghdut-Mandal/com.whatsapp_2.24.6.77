package com.whatsapp.payments.ui;

import X.AnonymousClass09Y;
import X.AnonymousClass7hI;
import X.B7Z;
import X.C111235bx;
import X.C135086c7;
import X.C165567td;
import X.C165577te;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36431kI;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

public final class IndiaUpiDobPickerActivity extends C179128jE implements AnonymousClass7hI {
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
        }
    }

    public IndiaUpiDobPickerActivity(int i) {
        this.A00 = false;
        B7Z.A00(this, 13);
    }

    public void BVB(long j, String str) {
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("dob_timestamp_ms", j);
        C36331k8.A0o(this, A0D);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IndiaUpiDobPickerBottomSheet A002 = C111235bx.A00((C135086c7) C36431kI.A0F(this, R.layout.f9nameremoved).getParcelableExtra("bank_account"), (String) null, true, false);
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0A(A002, R.id.fragment_container);
        A0O.A01();
    }

    public IndiaUpiDobPickerActivity() {
        this(0);
    }
}
