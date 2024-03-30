package com.whatsapp.payments.ui;

import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass185;
import X.C165617ti;
import X.C179018iv;
import X.C199449fK;
import X.C207199ui;
import X.C29151Vn;
import android.content.Intent;
import android.os.Bundle;
import java.math.BigDecimal;

public final class IndiaUpiInterOpHybridActivity extends C179018iv {
    public AnonymousClass185 A00;
    public C29151Vn A01;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1022) {
            super.onActivityResult(i, i2, intent);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BigDecimal bigDecimal = new BigDecimal(0);
        String str = this.A0k;
        if (str != null) {
            bigDecimal = C165617ti.A0b(str);
        }
        AnonymousClass16U r2 = AnonymousClass16W.A05;
        AnonymousClass16X r1 = new AnonymousClass16X(bigDecimal, ((AnonymousClass16V) r2).A01);
        C199449fK r0 = new C199449fK();
        r0.A02(r1);
        r0.A02 = r2;
        A4o(r0.A01(), (C207199ui) null);
    }
}
