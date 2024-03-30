package com.whatsapp.payments.ui.international;

import X.A8P;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass19A;
import X.AnonymousClass8g8;
import X.BAA;
import X.C000800j;
import X.C001400p;
import X.C001700s;
import X.C131606Ps;
import X.C135086c7;
import X.C146356vT;
import X.C165567td;
import X.C165577te;
import X.C165617ti;
import X.C173858Tk;
import X.C179128jE;
import X.C186008vG;
import X.C18800tq;
import X.C18830tt;
import X.C193179Kd;
import X.C199739fs;
import X.C203049nB;
import X.C203399nx;
import X.C22197AiK;
import X.C22436Amb;
import X.C22437Amc;
import X.C23140B7a;
import X.C23220BAc;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class IndiaUpiInternationalValidateQrActivity extends C179128jE {
    public A8P A00;
    public boolean A01;
    public final AnonymousClass00T A02;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = (A8P) r1.AAX.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C165567td.A0j(this);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C165577te.A10(supportActionBar, R.string.f12nameremoved);
        }
        AnonymousClass00T r3 = this.A02;
        BAA.A00(this, ((IndiaUpiInternationalValidateQrViewModel) r3.getValue()).A00, new C22437Amc(this), 13);
        BAA.A00(this, ((IndiaUpiInternationalValidateQrViewModel) r3.getValue()).A04, new C22436Amb(this), 12);
        IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = (IndiaUpiInternationalValidateQrViewModel) r3.getValue();
        Class<String> cls = String.class;
        C135086c7 A0P = C165617ti.A0P(C146356vT.A00(), cls, C173858Tk.A0J(this), "upiSequenceNumber");
        C135086c7 A0P2 = C165617ti.A0P(C146356vT.A00(), cls, getIntent().getStringExtra("INTERNATIONAL_QR_PAYLOAD"), "invoiceUrl");
        C135086c7 A08 = this.A0M.A08();
        String stringExtra = getIntent().getStringExtra("INTERNATIONAL_QR_SOURCE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = this.A0e;
        C001700s r6 = indiaUpiInternationalValidateQrViewModel.A00;
        C199739fs r0 = (C199739fs) r6.A04();
        C199739fs r4 = null;
        if (r0 != null) {
            r4 = new C199739fs(r0.A00, true);
        }
        r6.A0D(r4);
        C131606Ps r9 = new C131606Ps((String) null, new C131606Ps[0]);
        r9.A03("payments_request_name", "validate_international_qr");
        C203049nB.A03(r9, indiaUpiInternationalValidateQrViewModel.A03, (Integer) null, "international_payment_prompt", str, 3);
        AnonymousClass8g8 r1 = indiaUpiInternationalValidateQrViewModel.A02;
        C193179Kd r42 = new C193179Kd(A0P2, indiaUpiInternationalValidateQrViewModel, stringExtra);
        Log.i("PAY: validateInternationalQrCode called");
        AnonymousClass19A r32 = r1.A00;
        String A09 = r32.A09();
        C186008vG r8 = new C186008vG(A09, r1.A02.A01(), C165577te.A0k(A0P), C165577te.A0k(A0P2), C165577te.A0k(A08));
        C203399nx r2 = r8.A00;
        AnonymousClass00C.A08(r2);
        C165577te.A1A(r32, new C23220BAc(r42, r8, 8), r2, A09);
    }

    public IndiaUpiInternationalValidateQrActivity(int i) {
        this.A01 = false;
        C23140B7a.A00(this, 9);
    }

    public IndiaUpiInternationalValidateQrActivity() {
        this(0);
        this.A02 = C001400p.A00(C000800j.NONE, new C22197AiK(this));
    }
}
