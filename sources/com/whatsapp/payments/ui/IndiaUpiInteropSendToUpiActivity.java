package com.whatsapp.payments.ui;

import X.A8P;
import X.AnonymousClass07B;
import X.AnonymousClass3EU;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C207359uy;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C63713Lc;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class IndiaUpiInteropSendToUpiActivity extends C179128jE {
    public A8P A00;
    public AnonymousClass3EU A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A01 = (AnonymousClass3EU) r1.AAg.get();
            this.A00 = (A8P) r1.AAX.get();
        }
    }

    public IndiaUpiInteropSendToUpiActivity(int i) {
        this.A02 = false;
        B7Z.A00(this, 16);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C165577te.A10(supportActionBar, R.string.f12nameremoved);
        }
        View findViewById = findViewById(R.id.send_to_upi_container);
        C63713Lc.A01(findViewById, R.drawable.ic_send_to_upi, 0, R.drawable.grey_circle_stroke, R.string.f12nameremoved);
        C207359uy.A00(findViewById, this, 22);
    }

    public IndiaUpiInteropSendToUpiActivity() {
        this(0);
    }
}
