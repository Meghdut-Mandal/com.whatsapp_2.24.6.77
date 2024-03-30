package X;

public class AVX implements Runnable {
    public Object A00;
    public final int A01;

    public AVX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C19770wU r1, Object obj, int i) {
        r1.Boy(new AVX(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x033f, code lost:
        r1.A03(com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0345, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0359, code lost:
        com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet.A03(r3, java.lang.Integer.valueOf(r0), (java.lang.String) null, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0362, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0429, code lost:
        r2.A06((X.AnonymousClass9RV) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x042e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d8, code lost:
        r2.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ff, code lost:
        r3.startActivity(com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r3, r3.A02, r3.A0a, r2));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010a, code lost:
        r3.A3v();
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0110, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0147, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e5, code lost:
        r2.A0G.setInternationalActivationView(com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity.A07(r2.A00, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0318, code lost:
        r4.A0n(r5, r0, r2);
        X.C36341k9.A11(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x042f;
                case 2: goto L_0x004b;
                case 3: goto L_0x041f;
                case 4: goto L_0x03e3;
                case 5: goto L_0x03c5;
                case 6: goto L_0x03ba;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x03b1;
                case 12: goto L_0x0032;
                case 13: goto L_0x0011;
                case 14: goto L_0x03ab;
                case 15: goto L_0x038d;
                case 16: goto L_0x0363;
                case 17: goto L_0x0353;
                case 18: goto L_0x0346;
                case 19: goto L_0x034c;
                case 20: goto L_0x0346;
                case 21: goto L_0x031f;
                case 22: goto L_0x02bb;
                case 23: goto L_0x0271;
                case 24: goto L_0x0271;
                case 25: goto L_0x0265;
                case 26: goto L_0x0256;
                case 27: goto L_0x0332;
                case 28: goto L_0x0211;
                case 29: goto L_0x01f1;
                case 30: goto L_0x01e1;
                case 31: goto L_0x01c6;
                case 32: goto L_0x01bc;
                case 33: goto L_0x01b4;
                case 34: goto L_0x0197;
                case 35: goto L_0x018b;
                case 36: goto L_0x018b;
                case 37: goto L_0x018b;
                case 38: goto L_0x017d;
                case 39: goto L_0x016f;
                case 40: goto L_0x016f;
                case 41: goto L_0x0161;
                case 42: goto L_0x014b;
                case 43: goto L_0x0111;
                case 44: goto L_0x00ef;
                case 45: goto L_0x00df;
                case 46: goto L_0x00cc;
                case 47: goto L_0x008e;
                case 48: goto L_0x0084;
                case 49: goto L_0x007b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.5xJ r0 = (X.C123925xJ) r0
            com.whatsapp.payments.ui.BrazilPayBloksActivity r1 = r0.A02
            X.6C8 r0 = r0.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0G(r0, r1)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r11.A00
            X.9Rw r0 = (X.C194949Rw) r0
            X.8fq r3 = X.C178378fq.A00
            X.9cf r2 = r0.A00
            java.util.Iterator r1 = X.C36361kB.A0s(r3)
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.next()
            X.AzS r0 = (X.C22976AzS) r0
            if (r0 == 0) goto L_0x001d
            r0.BTY(r2)
            r3.unregisterObserver(r0)
            goto L_0x001d
        L_0x0032:
            java.lang.Object r0 = r11.A00
            X.9Lv r0 = (X.C193529Lv) r0
            X.00s r1 = r0.A00
            java.lang.Object r0 = r1.A04()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0046
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0010
        L_0x0046:
            r0 = 4
            X.C36341k9.A17(r1, r0)
            return
        L_0x004b:
            java.lang.Object r1 = r11.A00
            X.9UE r1 = (X.AnonymousClass9UE) r1
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0010
            X.5FZ r1 = r1.A01
            X.09w r0 = X.C023409w.A00
            r1.A01(r0)
            r1.A00()
            return
        L_0x0060:
            java.lang.Object r5 = r11.A00
            X.AA6 r5 = (X.AA6) r5
            X.1EV r1 = r5.A01
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0010
            X.1EU r0 = r5.A02
            X.16S r1 = X.C165617ti.A0O(r0)
            X.54d r0 = r1.A00
            X.1M0 r4 = r0.A04()
            goto L_0x0437
        L_0x007b:
            java.lang.Object r1 = r11.A00
            X.8j0 r1 = (X.C179068j0) r1
            r0 = 0
            r1.A4p(r0)
            return
        L_0x0084:
            java.lang.Object r3 = r11.A00
            X.8jE r3 = (X.C179128jE) r3
            r0 = 12
            X.C165577te.A13(r3, r0)
            goto L_0x010a
        L_0x008e:
            java.lang.Object r5 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity r5 = (com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity) r5
            r0 = 10
            X.AnonymousClass3SJ.A00(r5, r0)
            X.AE0 r0 = r5.A0M
            java.lang.String r4 = r0.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00bf
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = X.C173858Tk.A0J(r5)
            java.lang.String r0 = "upiSequenceNumber"
            X.6c7 r0 = X.C165617ti.A0P(r3, r2, r1, r0)
            r5.A03 = r0
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity.A0z(r5, r4)
            X.7yG r1 = r5.A04
            X.6c7 r0 = r5.A03
            r1.A00 = r0
            return
        L_0x00bf:
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            java.lang.String r0 = r5.getString(r0)
            r5.A3G(r0)
            X.8gR r0 = r5.A08
            goto L_0x0147
        L_0x00cc:
            java.lang.Object r2 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r2 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r2
            android.widget.TextView r0 = r2.A01
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A00
            r0.setVisibility(r1)
            r2.A4A()
            return
        L_0x00df:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r3 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r3
            android.widget.TextView r0 = r3.A01
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ProgressBar r0 = r3.A00
            r0.setVisibility(r2)
            goto L_0x00ff
        L_0x00ef:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r3 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r3
            r2 = 1
            android.widget.TextView r0 = r3.A01
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.A00
            r0.setVisibility(r1)
        L_0x00ff:
            X.8az r1 = r3.A02
            java.lang.String r0 = r3.A0a
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r3, r1, r0, r2)
            r3.startActivity(r0)
        L_0x010a:
            r3.A3v()
            r3.finish()
            return
        L_0x0111:
            java.lang.Object r2 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r2 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r2
            android.widget.TextView r0 = r2.A01
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A00
            r0.setVisibility(r1)
            X.AE0 r0 = r2.A0M
            java.lang.String r4 = r0.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0145
            java.lang.String r6 = X.C173858Tk.A0J(r2)
            r2.A03 = r6
            X.8az r0 = r2.A02
            java.lang.String r5 = r0.A0B
            X.8bF r3 = r0.A08
            X.8b6 r3 = (X.C175818b6) r3
            r8 = 2
            X.6c7 r0 = r0.A09
            java.lang.String r7 = X.C165577te.A0k(r0)
            r2.A4H(r3, r4, r5, r6, r7, r8)
            return
        L_0x0145:
            X.8gR r0 = r2.A08
        L_0x0147:
            r0.A02()
            return
        L_0x014b:
            java.lang.Object r3 = r11.A00
            X.8jG r3 = (X.C179148jG) r3
            r0 = 2131892733(0x7f1219fd, float:1.9420223E38)
            r3.Bu1(r0)
            X.1Vk r2 = r3.A0M
            r1 = 3
            X.B8c r0 = new X.B8c
            r0.<init>(r3, r1)
            r2.A09(r0)
            return
        L_0x0161:
            java.lang.Object r1 = r11.A00
            X.8jC r1 = (X.C179108jC) r1
            r0 = 2131892733(0x7f1219fd, float:1.9420223E38)
            r1.Bu1(r0)
            r1.A4A()
            return
        L_0x016f:
            java.lang.Object r1 = r11.A00
            X.8it r1 = (X.C179008it) r1
            r0 = 2131892733(0x7f1219fd, float:1.9420223E38)
            r1.Bu1(r0)
            r1.A4K()
            return
        L_0x017d:
            java.lang.Object r0 = r11.A00
            X.B7G r0 = (X.B7G) r0
            java.lang.Object r1 = r0.A00
            X.8jA r1 = (X.C179098jA) r1
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r1.A09
            r1.A4N(r0)
            return
        L_0x018b:
            java.lang.Object r0 = r11.A00
            X.B8c r0 = (X.C23168B8c) r0
            java.lang.Object r0 = r0.A00
            X.8hf r0 = (X.C178828hf) r0
            r0.A47()
            return
        L_0x0197:
            java.lang.Object r2 = r11.A00
            X.0xY r2 = (X.C20430xY) r2
            X.5Tu r0 = X.C108515Tu.A03
            X.6Pz r1 = new X.6Pz
            r1.<init>(r0)
            r0 = 1
            r1.A02 = r0
            r0 = 0
            r1.A01 = r0
            X.6NS r0 = X.AnonymousClass6NS.A0L
            r1.A00 = r0
            X.6Pq r0 = r1.A01()
            r2.A02(r0)
            return
        L_0x01b4:
            java.lang.Object r0 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r0
            r0.A3l()
            return
        L_0x01bc:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 100
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x01c6:
            java.lang.Object r2 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
            X.1qm r1 = X.AnonymousClass3LW.A00(r2)
            r0 = 2131895486(0x7f1224be, float:1.9425806E38)
            r1.A0d(r0)
            r0 = 2131895493(0x7f1224c5, float:1.942582E38)
            r1.A0c(r0)
            X.C165587tf.A17(r1)
            r1.A0b()
            goto L_0x01e5
        L_0x01e1:
            java.lang.Object r2 = r11.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
        L_0x01e5:
            X.7vk r1 = r2.A0G
            X.8az r0 = r2.A00
            X.9uT r0 = com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity.A07(r0, r2)
            r1.setInternationalActivationView(r0)
            return
        L_0x01f1:
            java.lang.Object r0 = r11.A00
            com.whatsapp.payments.ui.IncentiveValuePropsActivity r0 = (com.whatsapp.payments.ui.IncentiveValuePropsActivity) r0
            X.4lG r0 = r0.A06
            java.lang.Integer r3 = X.C36401kF.A0i()
            X.6Ps r1 = X.C95484lG.A01(r0)
            X.1EU r0 = r0.A02
            X.B66 r0 = r0.A05()
            X.B3f r2 = r0.BBn()
            r6 = 1
            java.lang.String r4 = "incentive_value_prop"
            r5 = 0
            X.C203049nB.A03(r1, r2, r3, r4, r5, r6)
            return
        L_0x0211:
            java.lang.Object r2 = r11.A00
            com.whatsapp.payments.ui.GlobalPaymentOrderDetailsActivity r2 = (com.whatsapp.payments.ui.GlobalPaymentOrderDetailsActivity) r2
            r8 = 0
            X.1VZ r1 = r2.A06
            if (r1 == 0) goto L_0x024f
            X.AGg r0 = r2.A3i()
            X.3Qa r0 = r0.A07
            X.3T1 r3 = r1.A02(r0)
            X.2bZ r3 = (X.AnonymousClass2bZ) r3
            r1 = 0
            if (r3 == 0) goto L_0x0233
            X.9uk r0 = r3.A00
            if (r0 == 0) goto L_0x0233
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0233
            java.util.List r1 = r0.A0I
        L_0x0233:
            r2.A0J = r1
            X.9gL r2 = r2.A0H
            if (r2 == 0) goto L_0x0248
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive"
            X.AnonymousClass00C.A0E(r3, r0)
            r7 = 4
            r4 = 0
            r9 = 1
            r6 = r4
            r10 = 1
            r5 = r4
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0248:
            java.lang.String r0 = "orderDetailsMessageLogging"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x024f:
            java.lang.String r0 = "paymentMessageStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0256:
            java.lang.Object r1 = r11.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r1.Bu1(r0)
            return
        L_0x0265:
            java.lang.Object r1 = r11.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.Bnv()
            return
        L_0x0271:
            java.lang.Object r5 = r11.A00
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity r5 = (com.whatsapp.payments.ui.BrazilPixKeySettingActivity) r5
            java.lang.String r3 = "remove_custom_payment_method_prompt"
            java.lang.String r2 = "custom_payment_method_settings"
            r1 = 0
            r0 = 0
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity.A01(r5, r1, r3, r2, r0)
            r0 = 2132083238(0x7f150226, float:1.9806613E38)
            X.1qm r4 = X.AnonymousClass3LW.A01(r5, r0)
            r0 = 2131887117(0x7f12040d, float:1.9408832E38)
            r4.A0d(r0)
            r0 = 2131887116(0x7f12040c, float:1.940883E38)
            r4.A0c(r0)
            r0 = 2131893503(0x7f121cff, float:1.9421784E38)
            java.lang.String r0 = X.C36361kB.A0m(r5, r0)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = X.C165607th.A0v(r3, r0)
            r1 = 12
            X.BA9 r0 = new X.BA9
            r0.<init>(r5, r1)
            r4.A0o(r5, r0, r2)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r0 = X.C36361kB.A0m(r5, r0)
            java.lang.String r2 = X.C165607th.A0v(r3, r0)
            r1 = 10
            X.BA9 r0 = new X.BA9
            r0.<init>(r5, r1)
            goto L_0x0318
        L_0x02bb:
            java.lang.Object r5 = r11.A00
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity r5 = (com.whatsapp.payments.ui.BrazilPixKeySettingActivity) r5
            r0 = 2132083238(0x7f150226, float:1.9806613E38)
            X.1qm r4 = X.AnonymousClass3LW.A01(r5, r0)
            r3 = 2131887113(0x7f120409, float:1.9408824E38)
            r6 = 1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = r5.A06
            r1 = 0
            java.lang.String r0 = X.C36391kE.A0v(r5, r0, r2, r1, r3)
            r4.A0q(r0)
            r3 = 2131887112(0x7f120408, float:1.9408822E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            java.lang.String r0 = r5.A06
            r2[r1] = r0
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r0 = r5.A03
            r1 = 0
            if (r0 != 0) goto L_0x02ed
            java.lang.String r0 = "brazilPixKeySettingViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02ed:
            X.00s r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            X.9WG r0 = (X.AnonymousClass9WG) r0
            if (r0 == 0) goto L_0x02f9
            java.lang.String r1 = r0.A02
        L_0x02f9:
            r2[r6] = r1
            X.C165587tf.A0t(r5, r4, r2, r3)
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 11
            X.BA9 r0 = new X.BA9
            r0.<init>(r5, r1)
            r4.A0o(r5, r0, r2)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r2 = r5.getString(r0)
            X.9xA r0 = X.C207819xA.A00
        L_0x0318:
            r4.A0n(r5, r0, r2)
            X.C36341k9.A11(r4)
            return
        L_0x031f:
            java.lang.Object r1 = r11.A00
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r1 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.17Y r1 = r1.A01
            if (r1 != 0) goto L_0x033f
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0332:
            java.lang.Object r1 = r11.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.Bnv()
            X.17Y r1 = r1.A05
        L_0x033f:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            r1.A03(r0)
            return
        L_0x0346:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r3 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r3
            r0 = 7
            goto L_0x0359
        L_0x034c:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r3 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r3
            r0 = 154(0x9a, float:2.16E-43)
            goto L_0x0359
        L_0x0353:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r3 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r3
            r0 = 152(0x98, float:2.13E-43)
        L_0x0359:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 1
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet.A03(r3, r2, r1, r0)
            return
        L_0x0363:
            java.lang.Object r4 = r11.A00
            X.8i1 r4 = (X.C178868i1) r4
            X.1YK r1 = r4.A02
            X.9un r0 = r4.A04
            java.lang.String r0 = r0.A0A
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A03(r0)
            X.1EU r0 = r4.A09
            X.16S r1 = X.C165617ti.A0O(r0)
            X.9un r0 = r4.A04
            java.lang.String r0 = r0.A0A
            X.9un r3 = r1.A07(r0)
            X.17Y r2 = r4.A00
            r0 = 29
            X.AVb r1 = new X.AVb
            r1.<init>(r4, r3, r0)
            goto L_0x04d8
        L_0x038d:
            java.lang.Object r2 = r11.A00
            X.8jG r2 = (X.C179148jG) r2
            X.8at r1 = new X.8at
            r1.<init>()
            com.whatsapp.jid.UserJid r0 = r2.A0G
            r1.A04 = r0
            r0 = 0
            r1.A0B(r0)
            r1.A09(r0)
            X.1EU r0 = r2.A0P
            X.16S r0 = X.C165617ti.A0O(r0)
            r0.A0H(r1)
            return
        L_0x03ab:
            java.lang.Object r0 = r11.A00
            X.C36411kG.A1N(r0)
            return
        L_0x03b1:
            java.lang.Object r1 = r11.A00
            X.9oP r1 = (X.C203619oP) r1
            r0 = 0
            X.C203619oP.A06(r1, r0, r0)
            return
        L_0x03ba:
            java.lang.Object r0 = r11.A00
            X.B7K r0 = (X.B7K) r0
            java.lang.Object r0 = r0.A00
            X.9id r0 = (X.C201009id) r0
            X.1YQ r2 = r0.A0K
            goto L_0x0429
        L_0x03c5:
            java.lang.Object r3 = r11.A00
            X.9id r3 = (X.C201009id) r3
            X.1EU r0 = r3.A0E
            X.9YB r1 = r0.A01()
            java.lang.String r0 = r3.A0R
            X.3ty r2 = r1.A03(r0)
            r0 = 4
            X.B9p r1 = new X.B9p
            r1.<init>(r3, r0)
            X.17Y r0 = r3.A01
            java.util.concurrent.Executor r0 = r0.A04
            r2.A0B(r1, r0)
            return
        L_0x03e3:
            java.lang.Object r0 = r11.A00
            X.B7J r0 = (X.B7J) r0
            java.lang.Object r7 = r0.A00
            X.9XR r7 = (X.AnonymousClass9XR) r7
            X.1Db r6 = r7.A04
            r5 = 0
            java.lang.String r1 = "payments_enabled_till"
            android.content.SharedPreferences r0 = r6.A03()
            long r2 = X.C36371kC.A08(r0, r1)
            boolean r0 = r7 instanceof X.C178518gf
            if (r0 == 0) goto L_0x0419
            X.8gf r7 = (X.C178518gf) r7
            X.1XA r1 = r7.A06
            r0 = 1
            r1.A01(r0, r5)
            X.9UE r4 = r7.A00
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x0415
            X.0wU r1 = r7.A08
            java.util.Objects.requireNonNull(r4)
            r0 = 2
            A00(r1, r4, r0)
        L_0x0415:
            r6.A0E(r5, r2)
            return
        L_0x0419:
            X.1XA r0 = r7.A06
            r0.A01(r5, r5)
            goto L_0x0415
        L_0x041f:
            java.lang.Object r0 = r11.A00
            X.B7N r0 = (X.B7N) r0
            java.lang.Object r0 = r0.A00
            X.8gI r0 = (X.AnonymousClass8gI) r0
            X.1YQ r2 = r0.A0B
        L_0x0429:
            r1 = 0
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x042f:
            java.lang.Object r0 = r11.A00
            X.Az8 r0 = (X.C22956Az8) r0
            r0.BcW()
            return
        L_0x0437:
            java.lang.String r6 = "tmp_ts<?"
            X.0wo r0 = r1.A03     // Catch:{ all -> 0x04dc }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x04dc }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x04dc }
            long r0 = X.C90484aE.A0K(r0)     // Catch:{ all -> 0x04dc }
            long r2 = r2 - r0
            long r1 = X.C36391kE.A0B(r2)     // Catch:{ all -> 0x04dc }
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x04dc }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ all -> 0x04dc }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x04dc }
            X.14e r2 = r4.A02     // Catch:{ all -> 0x04dc }
            java.lang.String r1 = "tmp_transactions"
            java.lang.String r0 = "removeOldPaymentTmpTransactionInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP"
            int r2 = r2.A03(r1, r6, r0, r3)     // Catch:{ all -> 0x04dc }
            if (r2 <= 0) goto L_0x0469
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04dc }
            java.lang.String r0 = "PAY: PaymentStore removeOldPaymentTmpTransactionInfo deleted num rows: "
            X.C36321k7.A1T(r0, r1, r2)     // Catch:{ all -> 0x04dc }
        L_0x0469:
            r4.close()
            X.9lC r5 = r5.A04
            X.1EU r0 = r5.A05
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r4 = r0.A05
            r1 = 1
            java.lang.Integer[] r3 = new java.lang.Integer[r1]
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3[r2] = r0
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r0 = 1000(0x3e8, float:1.401E-42)
            X.AnonymousClass000.A1L(r1, r0, r2)
            r0 = -1
            java.util.List r0 = r4.A0U(r3, r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r0.iterator()
        L_0x0497:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x04cf
            java.lang.Object r6 = r7.next()
            X.9lY r6 = (X.C202319lY) r6
            X.0wQ r1 = r5.A04
            com.whatsapp.jid.UserJid r0 = r6.A0D
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x04cb
            com.whatsapp.jid.UserJid r0 = r6.A0E
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x04cb
            X.11F r2 = r6.A0C
            boolean r1 = r6.A0Q
            java.lang.String r0 = r6.A0L
            X.3Qa r1 = X.C165617ti.A0R(r2, r0, r1)
            X.11F r0 = r1.A00
            if (r0 == 0) goto L_0x0497
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0497
            X.C36341k9.A1H(r6, r1, r3)
            goto L_0x0497
        L_0x04cb:
            r4.add(r6)
            goto L_0x0497
        L_0x04cf:
            X.17Y r2 = r5.A03
            r0 = 25
            X.736 r1 = new X.736
            r1.<init>(r5, r4, r3, r0)
        L_0x04d8:
            r2.A0H(r1)
            return
        L_0x04dc:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x04e1 }
            throw r1
        L_0x04e1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVX.run():void");
    }
}
