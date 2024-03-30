package com.whatsapp.payments.ui;

import X.AF6;
import X.AnonymousClass00C;
import X.B7Z;
import X.C165567td;
import X.C173878Tm;
import X.C18800tq;
import X.C18830tt;
import X.C194209On;
import X.C19630wG;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import android.os.Bundle;
import android.view.MenuItem;

public final class P2mLitePaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public C19630wG A00;
    public AF6 A01;
    public C194209On A02;
    public boolean A03;

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        if (C36371kC.A0H(this) != null) {
            bundle.putAll(C36371kC.A0H(this));
        }
        super.onSaveInstanceState(bundle);
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173878Tm.A0H(r2, r1, this);
            C173878Tm.A0G(r2, r1, this);
            C173878Tm.A0F(A0L, r2, r1, this, C173878Tm.A01(r2, this));
            C173878Tm.A07(A0L, r2, r1, this);
            this.A00 = C36351kA.A0W(r2);
            this.A01 = (AF6) r1.AAT.get();
            this.A02 = (C194209On) r1.AAV.get();
        }
    }

    public P2mLitePaymentTransactionDetailActivity(int i) {
        this.A03 = false;
        B7Z.A00(this, 46);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0i = C36361kB.A0i();
        A3m(A0i, A0i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (X.C200899iR.A01(r0) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            X.7yq r0 = r11.A0O
            X.9Ml r0 = r0.A06
            r8 = 0
            if (r0 == 0) goto L_0x004d
            X.2bZ r1 = r0.A03
            X.9lY r0 = r0.A01
        L_0x000e:
            X.AF6 r2 = r11.A01
            if (r2 == 0) goto L_0x0050
            r9 = 0
            r3 = 0
            java.lang.String r6 = r11.A0a
            if (r0 == 0) goto L_0x001f
            boolean r0 = X.C200899iR.A01(r0)
            r10 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r10 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x004b
            X.9uk r0 = r1.A00
            if (r0 == 0) goto L_0x004b
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x004b
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            java.lang.String r7 = X.AnonymousClass9ZG.A01(r0)
            if (r1 == 0) goto L_0x0044
            X.9uk r0 = r1.A00
            if (r0 == 0) goto L_0x0044
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0044
            java.lang.String r8 = r0.A05()
        L_0x0044:
            java.lang.String r5 = "payment_transaction_details"
            r4 = r3
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x004b:
            r0 = r8
            goto L_0x0032
        L_0x004d:
            r1 = r8
            r0 = r8
            goto L_0x000e
        L_0x0050:
            java.lang.String r0 = "paymentFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            Integer A0i = C36361kB.A0i();
            A3m(A0i, A0i);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public P2mLitePaymentTransactionDetailActivity() {
        this(0);
    }
}
