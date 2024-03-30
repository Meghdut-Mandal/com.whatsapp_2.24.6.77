package com.whatsapp.payments.ui;

import X.AF7;
import X.C18800tq;
import X.C207359uy;
import X.C224914p;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C89344We;
import android.os.Bundle;
import com.whatsapp.R;

public class IndiaUpiPaymentsBlockScreenShareActivity extends C224914p {
    public AF7 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B);
            this.A00 = C36371kC.A0i(A0B);
        }
    }

    public IndiaUpiPaymentsBlockScreenShareActivity(int i) {
        this.A01 = false;
        C89344We.A00(this, 48);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2);
        C36371kC.A1G(getWindow(), 0);
        getWindow().setDimAmount(0.8f);
        int A012 = C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        C36331k8.A0l(this);
        C36431kI.A1J(this, A012);
        setContentView((int) R.layout.f9nameremoved);
        findViewById(R.id.close).setOnClickListener(new C207359uy(this, 46));
        this.A00.BOm(0, (Integer) null, "block_screen_share", (String) null);
    }

    public IndiaUpiPaymentsBlockScreenShareActivity() {
        this(0);
    }
}
