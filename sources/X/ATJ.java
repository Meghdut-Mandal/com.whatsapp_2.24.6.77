package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

public final /* synthetic */ class ATJ implements C25711Hj {
    public final /* synthetic */ AnonymousClass16X A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ C206349tD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ ATJ(AnonymousClass16X r1, BrazilPaymentActivity brazilPaymentActivity, C206349tD r3, String str, String str2, boolean z) {
        this.A01 = brazilPaymentActivity;
        this.A05 = z;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r6 != null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r25) {
        /*
            r24 = this;
            r6 = r25
            r0 = r24
            com.whatsapp.payments.ui.BrazilPaymentActivity r14 = r0.A01
            boolean r1 = r0.A05
            X.16X r12 = r0.A00
            java.lang.String r3 = r0.A03
            X.9tD r5 = r0.A02
            java.lang.String r4 = r0.A04
            java.util.List r6 = (java.util.List) r6
            X.1EV r0 = r14.A0O
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0020
            X.9uo r0 = r14.A3t()
            if (r0 != 0) goto L_0x002a
        L_0x0020:
            X.1EV r0 = r14.A0O
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
        L_0x002a:
            r2 = 0
        L_0x002b:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x004e
            java.lang.Object r0 = r6.get(r2)
            X.9un r0 = (X.C207249un) r0
            int r1 = r0.A03
            r0 = 2
            if (r1 == r0) goto L_0x004f
            int r2 = r2 + 1
            goto L_0x002b
        L_0x003f:
            int r2 = X.C203449o2.A01(r6)
            if (r6 == 0) goto L_0x0046
            goto L_0x004f
        L_0x0046:
            r1 = 0
            java.lang.String r0 = "brpay_p_add_card"
            com.whatsapp.payments.ui.BrazilPaymentActivity.A1A(r14, r0, r3, r4, r1)
            goto L_0x0108
        L_0x004e:
            r2 = 0
        L_0x004f:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0046
            java.lang.Object r2 = r6.get(r2)
            X.9un r2 = (X.C207249un) r2
            X.C18740tg.A06(r2)
            com.whatsapp.payments.ui.widget.PaymentView r0 = r14.A0U
            if (r0 == 0) goto L_0x015d
            X.6c4 r20 = r0.getStickerIfSelected()
        L_0x0066:
            r22 = 0
            if (r0 == 0) goto L_0x0159
            X.6c9 r16 = r0.getPaymentBackground()
        L_0x006e:
            if (r20 != 0) goto L_0x0129
            if (r16 != 0) goto L_0x0129
            r11 = r22
        L_0x0074:
            X.16T r1 = r14.A06
            java.lang.String r0 = "BRL"
            X.16U r7 = r1.A01(r0)
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r1.<init>()
            com.whatsapp.jid.UserJid r0 = r14.A0G
            if (r0 == 0) goto L_0x0125
            X.1EU r0 = r14.A0P
            X.16S r6 = X.C165617ti.A0O(r0)
            com.whatsapp.jid.UserJid r0 = r14.A0G
            X.8ax r6 = r6.A05(r0)
        L_0x0091:
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r14.A0Y
            if (r0 == 0) goto L_0x0122
            X.00s r0 = r0.A02
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x0122
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r14.A0Y
            X.00s r0 = r0.A02
            java.lang.Object r0 = r0.A04()
            X.5tn r0 = (X.C121835tn) r0
            java.lang.Object r13 = r0.A01
            X.6O3 r13 = (X.AnonymousClass6O3) r13
        L_0x00ab:
            X.1EV r0 = r14.A0O
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x00b9
            X.9uo r0 = r14.A3t()
            if (r0 != 0) goto L_0x00c5
        L_0x00b9:
            X.1EV r0 = r14.A0O
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x010e
            boolean r0 = r14.A0e
            if (r0 == 0) goto L_0x010e
        L_0x00c5:
            r23 = 0
        L_0x00c7:
            com.whatsapp.jid.UserJid r6 = r14.A0G
            X.C18740tg.A06(r6)
            java.lang.String r0 = r14.A0p
            r18 = r2
            r19 = r6
            r20 = r5
            r21 = r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r15 = com.whatsapp.payments.ui.ConfirmPaymentFragment.A00(r18, r19, r20, r21, r22, r23)
            r1.A02 = r15
            X.6ZA r0 = r1.A03
            r0.A00 = r14
            X.AGW r10 = new X.AGW
            r18 = r3
            r17 = r4
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r15.A0J = r10
            X.AGQ r6 = new X.AGQ
            r8 = r12
            r10 = r13
            r11 = r14
            r12 = r15
            r13 = r4
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.A0I = r6
            r14.A0R = r15
            X.5GL r3 = r14.A0M
            int r2 = r14.A00
            java.lang.String r0 = "confirm_payment"
            r3.A05(r0, r2)
            r14.Btm(r1)
        L_0x0108:
            X.3ty r0 = r14.A03
            r0.A0E()
            return
        L_0x010e:
            if (r6 == 0) goto L_0x011f
            com.whatsapp.jid.UserJid r0 = r6.A04
            if (r0 == 0) goto L_0x011f
            boolean r0 = r6.A0C()
            if (r0 == 0) goto L_0x011f
            int r23 = r6.A07()
            goto L_0x00c7
        L_0x011f:
            r23 = 1
            goto L_0x00c7
        L_0x0122:
            r13 = r22
            goto L_0x00ab
        L_0x0125:
            r6 = r22
            goto L_0x0091
        L_0x0129:
            X.1Yq r8 = r14.A0S
            X.11F r7 = r14.A0E
            X.C18740tg.A06(r7)
            com.whatsapp.jid.UserJid r6 = r14.A0G
            long r0 = r14.A02
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0156
            X.1A1 r9 = r14.A0e
            X.3T1 r19 = X.C36421kH.A0R(r9, r0)
        L_0x0140:
            com.whatsapp.payments.ui.widget.PaymentView r0 = r14.A0U
            if (r0 == 0) goto L_0x0153
            java.lang.Integer r21 = r0.getStickerSendOrigin()
        L_0x0148:
            r17 = r7
            r18 = r6
            r15 = r8
            X.3ty r11 = r15.A01(r16, r17, r18, r19, r20, r21)
            goto L_0x0074
        L_0x0153:
            r21 = 0
            goto L_0x0148
        L_0x0156:
            r19 = r22
            goto L_0x0140
        L_0x0159:
            r16 = r22
            goto L_0x006e
        L_0x015d:
            r20 = 0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATJ.accept(java.lang.Object):void");
    }
}
