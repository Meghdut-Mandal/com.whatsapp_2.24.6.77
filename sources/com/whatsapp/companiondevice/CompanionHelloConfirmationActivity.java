package com.whatsapp.companiondevice;

import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass1LU;
import X.AnonymousClass3OO;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C31641c9;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C66943Xx;
import X.C89324Wc;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public final class CompanionHelloConfirmationActivity extends AnonymousClass155 {
    public C19460v5 A00;
    public C31641c9 A01;
    public AnonymousClass1LU A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36391kE.A0S(A0B);
            this.A02 = C36411kG.A0e(A0B);
            this.A01 = (C31641c9) A0B.AAP.get();
        }
    }

    public CompanionHelloConfirmationActivity(int i) {
        this.A03 = false;
        C89324Wc.A00(this, 17);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        TextView A0M = C36341k9.A0M(this.A00, R.id.description);
        String stringExtra = getIntent().getStringExtra("companion_platform_display");
        if (stringExtra == null) {
            stringExtra = getString(R.string.f12nameremoved);
        }
        AnonymousClass00C.A0B(stringExtra);
        C36361kB.A1P(C36321k7.A0A(this, stringExtra, R.string.f12nameremoved), A0M);
        C66943Xx.A00(C36361kB.A0G(this.A00, R.id.confirm_button), this, 11);
        C66943Xx.A00(C36361kB.A0G(this.A00, R.id.cancel_button), this, 10);
        C31641c9 r3 = this.A01;
        if (r3 != null) {
            r3.A02(AnonymousClass3OO.A00(getIntent().getStringExtra("companion_platform_id")), getIntent().getStringExtra("pairing_ref"), 11);
            r3.A01 = true;
            return;
        }
        throw C36331k8.A0d("altPairingPrimaryStepLogger");
    }

    public CompanionHelloConfirmationActivity() {
        this(0);
    }
}
