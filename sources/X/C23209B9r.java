package X;

/* renamed from: X.B9r  reason: case insensitive filesystem */
public class C23209B9r implements C25711Hj {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        r3.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a5, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            r8 = r15
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0038;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00e2;
                case 5: goto L_0x0107;
                case 6: goto L_0x0128;
                case 7: goto L_0x015d;
                case 8: goto L_0x0075;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r14.A00
            X.AH4 r1 = (X.AH4) r1
            java.lang.Object r4 = r14.A01
            X.16X r4 = (X.AnonymousClass16X) r4
            X.5vK r8 = (X.C122725vK) r8
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r3 = r1.A00
            X.9nh r2 = r3.A0W
            X.11F r6 = r3.A0E
            X.C18740tg.A06(r6)
            com.whatsapp.jid.UserJid r7 = r3.A0G
            long r12 = r3.A02
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0M
            java.lang.String r10 = r0.getPaymentNote()
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0M
            java.util.List r11 = r0.getMentionedJids()
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0M
            X.6c9 r5 = r0.getPaymentBackground()
            X.AGw r9 = new X.AGw
            r9.<init>(r1)
            r2.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0037:
            return
        L_0x0038:
            java.lang.Object r4 = r14.A00
            X.2IR r4 = (X.AnonymousClass2IR) r4
            java.lang.Object r3 = r14.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r8 = (java.lang.String) r8
            r0 = 2
            X.AnonymousClass00C.A0D(r8, r0)
            int r1 = r8.hashCode()
            r0 = 181990675(0xad8f513, float:2.089223E-32)
            if (r1 != r0) goto L_0x0037
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.9XI r0 = r4.A0c
            X.3ty r2 = r0.A01(r3)
            r1 = 0
            X.B9r r0 = new X.B9r
            r0.<init>(r3, r4, r1)
            r2.A0A(r0)
            return
        L_0x0067:
            java.lang.Object r1 = r14.A00
            X.8Z7 r1 = (X.AnonymousClass8Z7) r1
            java.lang.Object r0 = r14.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            X.AnonymousClass8Z7.A0F(r1, r0, r8)
            return
        L_0x0075:
            java.lang.Object r3 = r14.A01
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r3 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r3
            java.util.List r8 = (java.util.List) r8
            r0 = 2
            X.AnonymousClass00C.A0D(r8, r0)
            r3.A0K = r8
            X.9un r0 = r3.A04
            if (r0 != 0) goto L_0x0093
            boolean r0 = X.C36401kF.A1a(r8)
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = X.C36391kE.A0t(r8)
            X.9un r0 = (X.C207249un) r0
            r3.A04 = r0
        L_0x0093:
            X.7zj r2 = r3.A0A
            java.lang.String r1 = "methodListAdapter"
            if (r2 != 0) goto L_0x009e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x009e:
            java.util.List r0 = com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A00(r3)
            r2.A0L(r0)
            X.7zj r0 = r3.A0A
            if (r0 != 0) goto L_0x00ae
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00ae:
            r0.A06()
            return
        L_0x00b2:
            java.lang.Object r2 = r14.A00
            X.9jA r2 = (X.AnonymousClass9jA) r2
            boolean r0 = X.AnonymousClass000.A1X(r15)
            java.lang.String r1 = "BrazilPaymentMerchantHelper"
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "triggerMerchantOnboarding -> merchant onboarding failed. Something went wrong"
            java.lang.String r0 = X.C24611Dc.A01(r1, r0)
            goto L_0x01a5
        L_0x00c6:
            X.0v5 r0 = r2.A00
            r0.A02()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00d2:
            java.lang.Object r1 = r14.A00
            X.8gh r1 = (X.C178538gh) r1
            java.lang.Object r0 = r14.A01
            X.1XD r0 = (X.AnonymousClass1XD) r0
            java.util.List r8 = (java.util.List) r8
            r1.A00 = r8
            r0.Bf1(r1)
            return
        L_0x00e2:
            java.lang.Object r2 = r14.A00
            X.8gs r2 = (X.C178648gs) r2
            java.lang.Object r4 = r14.A01
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = "PAY: BrazilPaymentService/onAcceptPayment: Can't launch the 'ConfirmReceiveFragment'."
            goto L_0x01a5
        L_0x00f4:
            int r0 = X.C203449o2.A01(r8)
            java.lang.Object r1 = r8.get(r0)
            X.17Y r3 = r2.A02
            r0 = 24
            X.AVb r2 = new X.AVb
            r2.<init>(r1, r4, r0)
            goto L_0x019f
        L_0x0107:
            java.lang.Object r4 = r14.A00
            X.02E r4 = (X.AnonymousClass02E) r4
            java.lang.Object r3 = r14.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            java.util.List r8 = (java.util.List) r8
            X.C18740tg.A06(r8)
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r2 = com.whatsapp.payments.ui.PaymentMethodsListPickerFragment.A00(r8)
            r0 = 0
            r2.A0y(r4, r0)
            r1 = 0
            X.9mZ r0 = new X.9mZ
            r0.<init>(r4, r1)
            r2.A07 = r0
            r3.A1n(r2)
            return
        L_0x0128:
            java.lang.Object r4 = r14.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            java.lang.Object r1 = r14.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.util.List r8 = (java.util.List) r8
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A0R
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "payment_method_credential_id"
            java.lang.String r3 = r1.getStringExtra(r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x0140:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0157
            X.9un r1 = X.C165607th.A0S(r2)
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0140
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A0R
            r0.BcR(r1)
        L_0x0157:
            X.3ty r0 = r4.A03
            r0.A0E()
            return
        L_0x015d:
            java.lang.Object r4 = r14.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            java.lang.Object r3 = r14.A01
            X.16X r3 = (X.AnonymousClass16X) r3
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r2 = r8.iterator()
        L_0x016b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0188
            X.9un r1 = X.C165607th.A0S(r2)
            boolean r0 = X.C203449o2.A08(r1)
            if (r0 == 0) goto L_0x016b
            X.8bF r0 = r1.A08
            if (r0 == 0) goto L_0x016b
            int r1 = r1.A00
            r0 = 2
            if (r1 != r0) goto L_0x016b
            r4.A3x(r3)
            return
        L_0x0188:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x01a3
            int r0 = X.C203449o2.A01(r8)
            java.lang.Object r1 = r8.get(r0)
            X.17Y r3 = r4.A05
            r0 = 27
            X.AVb r2 = new X.AVb
            r2.<init>(r4, r1, r0)
        L_0x019f:
            r3.A0H(r2)
            return
        L_0x01a3:
            java.lang.String r0 = "PAY: BrazilPaymentActivity/onRequestPayment: Can't launch ConfirmReceiveFragment"
        L_0x01a5:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23209B9r.accept(java.lang.Object):void");
    }

    public C23209B9r(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
