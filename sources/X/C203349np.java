package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.9np  reason: invalid class name and case insensitive filesystem */
public class C203349np implements B2Z {
    public Object A00;
    public final int A01;

    public C203349np(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BcX(C202319lY r4) {
        switch (this.A01) {
            case 3:
                ((PaymentTransactionHistoryActivity) this.A00).A3i();
                return;
            case 4:
                C167747yk.A01(r4, (C167747yk) this.A00);
                return;
            case 5:
                ((C21243ADz) this.A00).A00(false);
                return;
            case 6:
            case 8:
                ((C167797yq) this.A00).A0b(r4);
                return;
            case 7:
                C167797yq r2 = (C167797yq) this.A00;
                r2.A0c.A06("IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to load the added txn");
                r2.A0b(r4);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r2 != 421) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcY(X.C202319lY r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x003f;
                case 2: goto L_0x009d;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00c6;
                case 6: goto L_0x0073;
                case 7: goto L_0x00cf;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.7yq r0 = (X.C167797yq) r0
            r0.A0b(r6)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r5.A00
            X.9Lv r4 = (X.C193529Lv) r4
            X.00s r0 = r4.A01
            r0.A0D(r6)
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x000c
            java.lang.Integer r0 = X.AnonymousClass1FR.A02(r6)
            int r3 = r0.intValue()
            r2 = 3
            r1 = 0
            r0 = 1
            if (r3 == r0) goto L_0x0038
            r2 = 2
            if (r3 == r2) goto L_0x0038
            if (r3 != r1) goto L_0x000c
            X.00s r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0034:
            r1.A0D(r0)
            return
        L_0x0038:
            X.00s r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0034
        L_0x003f:
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x000c
            boolean r0 = r6.A0L()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r3 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r3
            X.5GL r2 = r3.A0M
            r1 = 2
        L_0x0052:
            int r0 = r3.A00
            r2.A02(r0, r1)
            r0 = 0
            r3.A0f = r0
            X.1DR r1 = r3.A0D
            X.B2Z r0 = r3.A0i
            r1.unregisterObserver(r0)
            return
        L_0x0062:
            int r1 = r6.A02
            r0 = 402(0x192, float:5.63E-43)
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r3 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r3
            X.5GL r2 = r3.A0M
            if (r1 != r0) goto L_0x0071
            r1 = 49
            goto L_0x0052
        L_0x0071:
            r1 = 3
            goto L_0x0052
        L_0x0073:
            int r2 = r6.A02
            r1 = 402(0x192, float:5.63E-43)
            if (r2 == r1) goto L_0x0086
            r0 = 409(0x199, float:5.73E-43)
            if (r2 == r0) goto L_0x0093
            r0 = 411(0x19b, float:5.76E-43)
            if (r2 == r0) goto L_0x0093
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto L_0x0093
            goto L_0x0005
        L_0x0086:
            java.lang.Object r0 = r5.A00
            X.7yq r0 = (X.C167797yq) r0
            X.9Ml r0 = r0.A06
            X.9lY r0 = r0.A01
            int r0 = r0.A02
            if (r0 != r1) goto L_0x0093
            return
        L_0x0093:
            java.lang.Object r1 = r5.A00
            X.7yq r1 = (X.C167797yq) r1
            r0 = 0
            r1.A0p(r0)
            goto L_0x0005
        L_0x009d:
            java.lang.Object r2 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity r2 = (com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity) r2
            X.1Dc r1 = r2.A05
            java.lang.String r0 = "payment transaction updated"
            r1.A04(r0)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r2 = r2.A02
            X.0wU r1 = r2.A06
            r0 = 48
            X.AVY.A00(r1, r2, r0)
            return
        L_0x00b2:
            java.lang.Object r0 = r5.A00
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A3i()
            return
        L_0x00ba:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r0 = r5.A00
            X.7yk r0 = (X.C167747yk) r0
            X.C167747yk.A01(r6, r0)
            return
        L_0x00c6:
            java.lang.Object r1 = r5.A00
            X.ADz r1 = (X.C21243ADz) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x00cf:
            java.lang.Object r3 = r5.A00
            X.8lb r3 = (X.C180338lb) r3
            X.1Dc r1 = r3.A0c
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() txn update event is called"
            r1.A06(r0)
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0118
            if (r6 == 0) goto L_0x0118
            boolean r0 = r6.A0G()
            if (r0 == 0) goto L_0x0118
            r0 = 101(0x65, float:1.42E-43)
            X.8lU r2 = new X.8lU
            r2.<init>(r0)
            java.lang.String r0 = r6.A0L
            r2.A03 = r0
            java.lang.String r0 = r3.A0C
            r2.A06 = r0
            boolean r0 = r6.A0L()
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "SUCCESS"
        L_0x00fd:
            r2.A05 = r0
            java.lang.String r1 = r6.A0J
            r0 = 0
            int r0 = X.AnonymousClass6R8.A00(r1, r0)
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = "U13"
        L_0x010a:
            r2.A04 = r0
            X.1Rs r0 = r3.A08
            r0.A0D(r2)
            return
        L_0x0112:
            java.lang.String r0 = "00"
            goto L_0x010a
        L_0x0115:
            java.lang.String r0 = "FAILURE"
            goto L_0x00fd
        L_0x0118:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to reload the updated txn"
            r1.A06(r0)
            r3.A0b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203349np.BcY(X.9lY):void");
    }
}
