package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass00C;
import X.AnonymousClass61B;
import X.AnonymousClass9DT;
import X.AnonymousClass9Pr;
import X.B7Y;
import X.C009504a;
import X.C009904e;
import X.C165397tM;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36431kI;
import android.content.Intent;
import android.os.Bundle;

public final class IndiaUpiFcsAddPaymentMethodActivity extends C179128jE {
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

    public IndiaUpiFcsAddPaymentMethodActivity(int i) {
        this.A04 = false;
        B7Y.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass9Pr r0 = new AnonymousClass9Pr(this);
            this.A03 = r0;
            if (r0.A00(bundle)) {
                String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
                AnonymousClass00C.A0B(stringExtra);
                this.A02 = stringExtra;
                C009904e BnD = BnD(new C165397tM(this, 10), new C009504a());
                boolean A0x = C173858Tk.A0x(this);
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(getPackageName(), "com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity");
                C165607th.A18(A0D, "extra_payments_entry_type", 6, !C173858Tk.A0x(this), A0x);
                BnD.A02(A0D);
                return;
            }
            return;
        }
        throw C36331k8.A0d("fcsActivityLifecycleManagerFactory");
    }

    public IndiaUpiFcsAddPaymentMethodActivity() {
        this(0);
    }
}
