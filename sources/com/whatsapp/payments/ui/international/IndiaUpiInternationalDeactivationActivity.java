package com.whatsapp.payments.ui.international;

import X.AEA;
import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C135086c7;
import X.C146356vT;
import X.C165567td;
import X.C165577te;
import X.C165617ti;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C175898bF;
import X.C179108jC;
import X.C18800tq;
import X.C18830tt;
import X.C202059ky;
import X.C207249un;
import X.C23140B7a;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C90464aC;
import android.os.Bundle;

public final class IndiaUpiInternationalDeactivationActivity extends C179108jC {
    public C175748az A00;
    public C135086c7 A01;
    public boolean A02;

    public void BZk(C202059ky r11, String str) {
        String str2 = str;
        AnonymousClass00C.A0D(str, 0);
        if (str.length() > 0) {
            C175748az r2 = this.A00;
            if (r2 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            String str3 = r2.A0B;
            C135086c7 r0 = this.A01;
            if (r0 == null) {
                throw C36331k8.A0d("seqNumber");
            }
            String str4 = (String) r0.A00;
            C175898bF r4 = r2.A08;
            AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
            C175818b6 r42 = (C175818b6) r4;
            C175748az r02 = this.A00;
            if (r02 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            A4H(r42, str2, str3, str4, (String) C207249un.A06(r02), 3);
        } else if (r11 != null && !AEA.A02(this, "upi-list-keys", r11.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                C173858Tk.A0w(this);
            } else {
                A4D();
                throw AnonymousClass000.A0j();
            }
        }
    }

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
            C173858Tk.A0k(A0L, r2, r1, this);
        }
    }

    public IndiaUpiInternationalDeactivationActivity(int i) {
        this.A02 = false;
        C23140B7a.A00(this, 8);
    }

    public void BgO(C202059ky r2) {
        throw C90464aC.A0o();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C175748az r0 = (C175748az) C173858Tk.A07(this);
        if (r0 != null) {
            this.A00 = r0;
        }
        this.A01 = C165617ti.A0P(C146356vT.A00(), String.class, C173858Tk.A0J(this), "upiSequenceNumber");
        this.A08.A02();
    }

    public IndiaUpiInternationalDeactivationActivity() {
        this(0);
    }
}
