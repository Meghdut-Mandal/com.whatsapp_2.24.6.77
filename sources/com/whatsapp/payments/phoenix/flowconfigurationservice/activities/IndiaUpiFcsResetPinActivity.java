package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass16S;
import X.AnonymousClass61B;
import X.AnonymousClass9DT;
import X.AnonymousClass9Pr;
import X.B7Y;
import X.C009504a;
import X.C165397tM;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C175748az;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C207249un;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;

public final class IndiaUpiFcsResetPinActivity extends C179128jE {
    public AnonymousClass9DT A00;
    public AnonymousClass61B A01;
    public String A02;
    public AnonymousClass9Pr A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A01 = C165587tf.A0Y(r2);
            this.A00 = (AnonymousClass9DT) A0L.A1d.get();
        }
    }

    public IndiaUpiFcsResetPinActivity(int i) {
        this.A04 = false;
        B7Y.A00(this, 28);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass9Pr r0 = new AnonymousClass9Pr(this);
            this.A03 = r0;
            if (!r0.A00(bundle)) {
                C36321k7.A1Z(C165567td.A0b(this), ": Activity cannot be launch because it is no longer safe to create this activity");
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
            if (stringExtra != null) {
                this.A02 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_credential_id");
                if (stringExtra2 != null) {
                    C207249un A012 = AnonymousClass16S.A01(stringExtra2, C165577te.A0o(this.A0P));
                    if (A012 != null) {
                        boolean booleanExtra = getIntent().getBooleanExtra("extra_is_forget_pin", false);
                        BnD(new C165397tM(this, 12), new C009504a()).A02(IndiaUpiPinPrimerFullSheetActivity.A0z(this, (C175748az) A012, this.A0a, booleanExtra));
                        return;
                    }
                    throw C165577te.A0c(": Payment method does not exist with credential ID", C165567td.A0b(this));
                }
                throw C165577te.A0c(": Credential ID is null", C165567td.A0b(this));
            }
            throw C165577te.A0c(": FDS Manager ID is null", C165567td.A0b(this));
        }
        throw C36331k8.A0d("fcsActivityLifecycleManagerFactory");
    }

    public IndiaUpiFcsResetPinActivity() {
        this(0);
    }
}
