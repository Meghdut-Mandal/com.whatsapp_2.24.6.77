package com.whatsapp.payments.ui;

import X.AnonymousClass16U;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.C165607th;
import X.C179028iw;
import X.C199449fK;
import X.C207119ua;
import X.C207199ui;
import X.C36331k8;
import android.os.Bundle;
import android.view.MotionEvent;

public final class IndiaWebViewUpiP2mHybridActivity extends C179028iw {
    public C207119ua A00;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        setResult(0, getIntent());
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    public void A2x(int i) {
        setResult(2, getIntent());
        super.A2x(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A4P();
        String stringExtra = getIntent().getStringExtra("extra_p2m_amount");
        AnonymousClass16U r2 = AnonymousClass16W.A05;
        AnonymousClass16X A0R = C165607th.A0R(r2, stringExtra);
        if (A0R != null) {
            C199449fK r0 = new C199449fK();
            r0.A02 = r2;
            r0.A02(A0R);
            this.A00 = r0.A01();
        }
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
        C207119ua r1 = this.A00;
        if (r1 != null) {
            A4o(r1, (C207199ui) null);
            return;
        }
        throw C36331k8.A0d("paymentMoney");
    }
}
