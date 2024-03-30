package X;

public class BA8 implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public BA8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new BA8(r1, i));
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new BA8(obj, i));
    }

    public static void A02(AnonymousClass012 r1, C39001qm r2, int i, int i2) {
        r2.A0m(r1, new BA8(r1, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.8Ta} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0383, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0386, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0400, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0403, code lost:
        com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A11(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0406, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0560, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0563, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02bd, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02d4, code lost:
        r1 = new android.content.Intent(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e1, code lost:
        if (r1.resolveActivity(r5.getPackageManager()) == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e3, code lost:
        r5.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02e6, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = r20
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x036f;
                case 1: goto L_0x0471;
                case 2: goto L_0x0447;
                case 3: goto L_0x0361;
                case 4: goto L_0x0432;
                case 5: goto L_0x041d;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x0009;
                case 12: goto L_0x0009;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x0009;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0009;
                case 19: goto L_0x0009;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x0414;
                case 24: goto L_0x034f;
                case 25: goto L_0x036f;
                case 26: goto L_0x0407;
                case 27: goto L_0x0009;
                case 28: goto L_0x0009;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x0009;
                case 34: goto L_0x03fa;
                case 35: goto L_0x03f0;
                case 36: goto L_0x03c3;
                case 37: goto L_0x03bc;
                case 38: goto L_0x000f;
                case 39: goto L_0x03ae;
                case 40: goto L_0x03a6;
                case 41: goto L_0x039e;
                case 42: goto L_0x0397;
                case 43: goto L_0x038d;
                case 44: goto L_0x0009;
                case 45: goto L_0x030f;
                case 46: goto L_0x02e7;
                case 47: goto L_0x02a1;
                case 48: goto L_0x0387;
                case 49: goto L_0x0053;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A00
            X.C36331k8.A1J(r0, r1)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r2 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r2
            r0 = 10
            X.AnonymousClass3SJ.A00(r2, r0)
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "retry"
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A13(r2, r0)
            return
        L_0x0022:
            java.lang.String r1 = "upi_p2p_check_balance"
            r0 = 0
            X.6Be r6 = new X.6Be
            r6.<init>(r1, r0, r0)
            X.8az r0 = r2.A02
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "paymentBankAccount"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0035:
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            java.util.Map r8 = X.C36391kE.A11(r0, r1)
            X.005 r0 = r2.A05
            if (r0 == 0) goto L_0x03b5
            java.lang.Object r3 = r0.get()
            X.627 r3 = (X.AnonymousClass627) r3
            r4 = 0
            java.lang.String r7 = "payment_bank_account_details"
            r5 = r4
            r3.A00(r4, r5, r6, r7, r8)
            r2.A3v()
            goto L_0x0383
        L_0x0053:
            java.lang.Object r13 = r2.A00
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r13 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r13
            X.5tn r1 = (X.C121835tn) r1
            if (r1 == 0) goto L_0x000e
            java.lang.Object r3 = r1.A01
            if (r3 == 0) goto L_0x000e
            r13.A0F = r1
            X.9gJ r3 = (X.C199949gJ) r3
            java.lang.Boolean r0 = r3.A06
            boolean r2 = X.C90494aF.A1Y(r0)
            int r1 = r1.A00
            if (r1 == 0) goto L_0x013d
            r0 = 1
            if (r1 == r0) goto L_0x00e7
            if (r2 == 0) goto L_0x04c5
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r3 = r13.A0A
            X.0wQ r7 = r13.A02
            X.0wG r12 = r3.A0Q
            X.0yC r14 = r3.A0S
            X.1e1 r4 = r3.A0X
            X.1Pn r10 = r3.A0O
            X.1FR r2 = r3.A0W
            X.0yb r11 = r3.A0P
            X.9Xp r9 = r3.A0M
            X.1EV r15 = r3.A0V
            X.0ts r13 = r3.A0R
            X.1SV r1 = r3.A0Y
            X.1LB r8 = r3.A0H
            X.0wU r0 = r3.A0Z
            X.7zf r6 = new X.7zf
            r16 = r2
            r17 = r4
            r18 = r1
            r19 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List r5 = r6.A0D
            r5.clear()
            r1 = 2131167765(0x7f070a15, float:1.7949813E38)
            r4 = 0
            X.8k5 r0 = new X.8k5
            r0.<init>(r4, r1, r4)
            r5.add(r0)
            r1 = 8
            X.9FT r0 = new X.9FT
            r0.<init>(r1)
            r5.add(r0)
            r1 = 9
            X.9FT r0 = new X.9FT
            r0.<init>(r1)
            r5.add(r0)
            r1 = 10
            X.9FT r0 = new X.9FT
            r0.<init>(r1)
            r5.add(r0)
            r1 = 11
            X.9FT r0 = new X.9FT
            r0.<init>(r1)
            r5.add(r0)
            r2 = 2131167766(0x7f070a16, float:1.7949815E38)
            r1 = 180(0xb4, float:2.52E-43)
            X.8k5 r0 = new X.8k5
            r0.<init>(r1, r4, r2)
            r5.add(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A06
            r0.setAdapter(r6)
            return
        L_0x00e7:
            if (r2 != 0) goto L_0x00ec
            r13.Bnv()
        L_0x00ec:
            X.9uU r7 = r3.A03
            X.C18740tg.A06(r7)
            int r0 = r7.A01
            java.lang.String r5 = r13.getString(r0)
            java.lang.String r6 = r13.A0L
            X.171 r2 = r13.A04
            X.1A5 r1 = r13.A06
            com.whatsapp.jid.UserJid r0 = r13.A0G
            X.141 r0 = r1.A01(r0)
            java.lang.String r4 = r2.A0H(r0)
            r3 = 0
            X.8ys r0 = r7.A02
            int r0 = r0.ordinal()
            r2 = 1
            if (r0 != r2) goto L_0x0133
            int r1 = r7.A00
            java.lang.Object[] r0 = X.C36411kG.A1b(r4)
            java.lang.String r2 = X.C36351kA.A0x(r13, r6, r0, r2, r1)
        L_0x011b:
            X.B8u r1 = new X.B8u
            r1.<init>(r13, r3)
            X.1qm r0 = X.AnonymousClass3LW.A00(r13)
            r0.A0q(r5)
            X.C39001qm.A0A(r0, r2)
            X.0FM r0 = r0.create()
            r0.setOnDismissListener(r1)
            goto L_0x02bd
        L_0x0133:
            int r0 = r7.A00
            java.lang.String r2 = r13.getString(r0)
            X.AnonymousClass00C.A0B(r2)
            goto L_0x011b
        L_0x013d:
            if (r2 != 0) goto L_0x0142
            r13.Bnv()
        L_0x0142:
            X.2bZ r1 = r3.A05
            X.C18740tg.A06(r1)
            X.9uk r0 = r1.A00
            X.C18740tg.A06(r0)
            X.9ui r2 = r0.A01
            int r0 = r3.A00
            X.C18740tg.A06(r2)
            r2.A05()
            X.9lY r5 = r3.A01
            X.8yt r8 = r3.A04
            if (r8 != 0) goto L_0x015e
            X.8yt r8 = X.C188008yt.NONE
        L_0x015e:
            java.util.List r4 = r3.A07
            r13.Bnv()
            X.9SA r2 = r13.A09
            r2.A00 = r1
            X.1EU r3 = r13.A0P
            java.lang.String r2 = "FBPAY"
            X.AF8 r2 = r3.A04(r2)
            X.C18740tg.A06(r2)
            X.9jA r2 = r2.BE1()
            if (r2 == 0) goto L_0x017c
            long r2 = r1.A1N
            r13.A02 = r2
        L_0x017c:
            X.8lm r2 = r13.A08
            X.9Oo r9 = r2.A02(r13, r5, r1, r4)
            r13.A0I = r1
            r13.A0D = r9
            X.1EV r2 = r13.A0O
            X.0yC r3 = r2.A02
            r2 = 7102(0x1bbe, float:9.952E-42)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x01a3
            X.8yt r2 = X.C188008yt.ACTIVE
            if (r8 != r2) goto L_0x01a3
            r5 = 1
            X.0wU r4 = r13.A04
            r3 = 27
            X.752 r2 = new X.752
            r2.<init>(r13, r1, r3, r5)
            r4.Boy(r2)
        L_0x01a3:
            boolean r2 = r13.A0P
            if (r2 != 0) goto L_0x01bb
            java.util.Set r3 = r13.A0R
            java.lang.String r2 = r13.A0N
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x01bb
            java.util.Set r3 = r13.A0S
            int r2 = r13.A00
            boolean r2 = X.AnonymousClass000.A1Z(r3, r2)
            if (r2 == 0) goto L_0x01c7
        L_0x01bb:
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r7 = r13.A0A
            r12 = 3
            r11 = 0
            java.lang.String r10 = "WhatsappPay"
            X.9SC r2 = r7.A00(r8, r9, r10, r11, r12)
            r13.A0C = r2
        L_0x01c7:
            boolean r2 = r13.A0P
            if (r2 == 0) goto L_0x0221
            X.1EV r0 = r13.A0O
            X.0yC r2 = r0.A02
            r0 = 7102(0x1bbe, float:9.952E-42)
            boolean r0 = r2.A0E(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0212
            X.8yt r0 = X.C188008yt.ACTIVE
            if (r8 == r0) goto L_0x0212
            X.0wU r3 = r13.A04
            r2 = 27
            X.752 r0 = new X.752
            r0.<init>(r13, r1, r2, r5)
            r3.Boy(r0)
            X.1qm r2 = X.AnonymousClass3LW.A00(r13)
            r0 = 2131891862(0x7f121696, float:1.9418456E38)
            r2.A0d(r0)
            r0 = 2131891861(0x7f121695, float:1.9418454E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 48
            A02(r13, r2, r0, r1)
            X.C36341k9.A11(r2)
        L_0x0203:
            X.2bZ r0 = r13.A0I
            X.9uk r0 = r0.A00
            if (r0 == 0) goto L_0x000e
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.A0I
            r13.A0O = r0
            return
        L_0x0212:
            X.9ua r4 = r9.A06
            X.B1o r3 = r9.A0B
            X.9tD r2 = r9.A09
            java.lang.String r0 = r13.A0b
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A11(r4, r13, r2, r3, r0)
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A13(r13, r1, r5)
            goto L_0x0203
        L_0x0221:
            java.util.Set r3 = r13.A0S
            int r2 = r13.A00
            boolean r2 = X.AnonymousClass000.A1Z(r3, r2)
            if (r2 == 0) goto L_0x028b
            java.util.Set r2 = r13.A0R
            java.lang.String r0 = r13.A0N
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0250
            java.lang.String r1 = r13.A0N
            java.lang.String r0 = "canceled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0248
            int r0 = r13.A00
            r13.Bew(r0)
        L_0x0244:
            X.C36351kA.A11(r13)
            goto L_0x0203
        L_0x0248:
            X.11F r1 = r9.A08
            int r0 = r13.A00
            r13.BUI(r1, r0)
            goto L_0x0244
        L_0x0250:
            int r0 = r13.A00
            r2 = 6
            if (r0 != r2) goto L_0x0274
            java.util.HashMap r0 = r9.A0M
            java.lang.Object r0 = X.C90484aE.A0j(r0, r2)
            X.9SC r0 = (X.AnonymousClass9SC) r0
            X.11F r12 = r9.A08
            java.lang.String r15 = r9.A0D
            X.9ua r11 = r9.A06
            X.9uC r0 = r0.A03
            X.B5M r14 = r0.A00
            X.AHn r14 = (X.C21335AHn) r14
            java.lang.String r0 = r13.A0b
            r16 = r0
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A10(r11, r12, r13, r14, r15, r16)
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A13(r13, r1, r2)
            goto L_0x0203
        L_0x0274:
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r2 = r13.A0A
            int r1 = r9.A00
            X.9SC r0 = r13.A0C
            boolean r0 = r2.A03(r0, r9, r1)
            if (r0 == 0) goto L_0x0203
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r2 = r13.A0A
            X.9SC r1 = r13.A0C
            java.lang.String r0 = r13.A0b
            r2.A01(r13, r1, r9, r0)
            goto L_0x0203
        L_0x028b:
            X.0wU r7 = r13.A04
            X.0xM r2 = r13.A07
            X.1XC r5 = r13.A07
            X.1Ed r3 = r13.A05
            X.B1o r6 = r9.A0B
            X.17Y r1 = r13.A05
            X.AAp r4 = new X.AAp
            r4.<init>(r13, r8, r9, r0)
            X.C202449lr.A02(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0203
        L_0x02a1:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity r5 = (com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity) r5
            X.9O9 r1 = (X.AnonymousClass9O9) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0542;
                case 1: goto L_0x050b;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02c1;
                case 4: goto L_0x04e4;
                case 5: goto L_0x04d2;
                case 6: goto L_0x04cc;
                default: goto L_0x02ac;
            }
        L_0x02ac:
            X.AE9 r4 = r5.A03
            X.0yC r6 = r5.A0D
            X.9ky r0 = r1.A04
            int r8 = r0.A00
            r9 = 2131892408(0x7f1218b8, float:1.9419563E38)
            X.6PS r7 = r5.A05
            X.0FM r0 = r4.A01(r5, r6, r7, r8, r9)
        L_0x02bd:
            r0.show()
            return
        L_0x02c1:
            java.lang.String r2 = r1.A05
            r1 = 0
            java.lang.String r0 = "tel"
            android.net.Uri r2 = android.net.Uri.fromParts(r0, r2, r1)
            java.lang.String r0 = "android.intent.action.DIAL"
            goto L_0x02d4
        L_0x02cd:
            android.net.Uri r2 = r1.A03
            X.C18740tg.A06(r2)
            java.lang.String r0 = "android.intent.action.VIEW"
        L_0x02d4:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x000e
            r5.startActivity(r1)
            return
        L_0x02e7:
            java.lang.Object r3 = r2.A00
            X.8jG r3 = (X.C179148jG) r3
            X.5tn r1 = (X.C121835tn) r1
            boolean r0 = r3 instanceof X.C178848hw
            if (r0 == 0) goto L_0x000e
            X.8hw r3 = (X.C178848hw) r3
            int r0 = r1.A00
            r2 = 1
            if (r0 == 0) goto L_0x02ff
            if (r0 != r2) goto L_0x000e
            r0 = 0
        L_0x02fb:
            r3.A4c(r0, r2)
            return
        L_0x02ff:
            java.lang.Object r0 = r1.A01
            X.6O3 r0 = (X.AnonymousClass6O3) r0
            r3.A4b(r0)
            int r1 = r3.A01
            X.16X r0 = r3.A09
            X.9fB r0 = r3.A4K(r0, r1)
            goto L_0x02fb
        L_0x030f:
            java.lang.Object r2 = r2.A00
            X.8jG r2 = (X.C179148jG) r2
            X.5tn r1 = (X.C121835tn) r1
            java.lang.Object r1 = r1.A01
            X.6O3 r1 = (X.AnonymousClass6O3) r1
            boolean r0 = r2 instanceof X.C178848hw
            if (r0 == 0) goto L_0x0326
            X.8hw r2 = (X.C178848hw) r2
            r2.A4O()
            r2.A4b(r1)
            return
        L_0x0326:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.BrazilPaymentActivity
            if (r0 == 0) goto L_0x000e
            com.whatsapp.payments.ui.BrazilPaymentActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r2
            if (r1 == 0) goto L_0x034b
            int r0 = r1.A00
            r2.A01 = r0
            r2.A0U = r1
        L_0x0334:
            int r0 = r2.A01
            r0 = r0 ^ 1
            r2.A01 = r0
            com.whatsapp.payments.ui.BrazilPaymentActivity.A18(r2)
            if (r1 == 0) goto L_0x0349
            X.9dE r0 = r1.A01
            if (r0 == 0) goto L_0x0349
            java.lang.String r0 = r0.A0F
        L_0x0345:
            r2.A3s(r0)
            return
        L_0x0349:
            r0 = 0
            goto L_0x0345
        L_0x034b:
            r0 = 6
            r2.A01 = r0
            goto L_0x0334
        L_0x034f:
            java.lang.Object r3 = r2.A00
            X.8Ta r3 = (X.C173788Ta) r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x0557
            r3.A3l()
            return
        L_0x0361:
            java.lang.Object r0 = r2.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r0 = r0.A0h()
            if (r0 == 0) goto L_0x000e
            r0.invalidateOptionsMenu()
            return
        L_0x036f:
            java.lang.Object r2 = r2.A00
            X.14u r2 = (X.C225314u) r2
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x000e
            X.17Y r0 = r2.A05
            r0.A02()
            boolean r0 = r1.booleanValue()
            X.C165597tg.A1B(r2, r0)
        L_0x0383:
            r2.finish()
            return
        L_0x0387:
            java.lang.Object r0 = r2.A00
            X.C36411kG.A1N(r0)
            return
        L_0x038d:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 0
            r1.A0F = r0
            r0 = 19
            goto L_0x0400
        L_0x0397:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 12
            goto L_0x0400
        L_0x039e:
            java.lang.Object r0 = r2.A00
            X.8jC r0 = (X.C179108jC) r0
            r0.A4C()
            return
        L_0x03a6:
            java.lang.Object r0 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r0
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A11(r0)
            return
        L_0x03ae:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 10
            goto L_0x0400
        L_0x03b5:
            java.lang.String r0 = "paymentsPhoenixManagerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03bc:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 27
            goto L_0x0400
        L_0x03c3:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r3 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r3
            r0 = 11
            X.AnonymousClass3SJ.A00(r3, r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x03d6
            java.lang.String r0 = "forgot_pin"
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A13(r3, r0)
            return
        L_0x03d6:
            X.8az r2 = r3.A02
            if (r2 != 0) goto L_0x03e1
            java.lang.String r0 = "paymentBankAccount"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03e1:
            r1 = 1
            java.lang.String r0 = r3.A0a
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r3, r2, r0, r1)
            r3.startActivity(r0)
            r3.A3v()
            goto L_0x0560
        L_0x03f0:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 12
            X.C165577te.A13(r1, r0)
            goto L_0x0403
        L_0x03fa:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r1
            r0 = 11
        L_0x0400:
            X.AnonymousClass3SJ.A00(r1, r0)
        L_0x0403:
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A11(r1)
            return
        L_0x0407:
            java.lang.Object r0 = r2.A00
            X.8fc r0 = (X.C178248fc) r0
            android.content.DialogInterface r1 = (android.content.DialogInterface) r1
            r0.A3o()
            r1.dismiss()
            return
        L_0x0414:
            java.lang.Object r1 = r2.A00
            X.9j8 r1 = (X.C201239j8) r1
            r0 = 0
            X.C201239j8.A01(r1, r0)
            return
        L_0x041d:
            java.lang.Object r0 = r2.A00
            com.whatsapp.group.GroupMembershipApprovalRequestsFragment r0 = (com.whatsapp.group.GroupMembershipApprovalRequestsFragment) r0
            java.lang.Number r1 = (java.lang.Number) r1
            X.7zh r2 = r0.A1Y()
            X.AnonymousClass00C.A0B(r1)
            int r0 = r1.intValue()
            r2.A09(r0)
            return
        L_0x0432:
            java.lang.Object r0 = r2.A00
            com.whatsapp.group.GroupMembershipApprovalRequestsFragment r0 = (com.whatsapp.group.GroupMembershipApprovalRequestsFragment) r0
            java.lang.Number r1 = (java.lang.Number) r1
            X.7zh r2 = r0.A1Y()
            X.AnonymousClass00C.A0B(r1)
            int r0 = r1.intValue()
            r2.A07(r0)
            return
        L_0x0447:
            java.lang.Object r2 = r2.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            X.9KC r1 = (X.AnonymousClass9KC) r1
            X.AnonymousClass00C.A0B(r1)
            X.01I r3 = r2.A0i()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r3, r0)
            X.14u r3 = (X.C225314u) r3
            int r7 = r1.A00
            r8 = 2131891806(0x7f12165e, float:1.9418342E38)
            r6 = 0
            X.B8N r4 = new X.B8N
            r4.<init>(r2, r1, r6)
            java.lang.Object[] r1 = r1.A02
            int r0 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r0)
            r3.BO8(r4, r5, r6, r7, r8)
            return
        L_0x0471:
            java.lang.Object r7 = r2.A00
            com.whatsapp.group.GroupMembershipApprovalRequestsFragment r7 = (com.whatsapp.group.GroupMembershipApprovalRequestsFragment) r7
            X.ACW r1 = (X.ACW) r1
            java.lang.String r6 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            if (r1 == 0) goto L_0x04b8
            X.8zh r5 = r1.A04
            r2 = 0
            if (r5 == 0) goto L_0x049b
            X.141 r4 = r1.A07
            X.8zh r0 = X.C188508zh.A02
            r3 = 0
            r1 = 1
            if (r5 != r0) goto L_0x04a9
            r2 = 2131890312(0x7f121088, float:1.9415312E38)
        L_0x048b:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.171 r0 = r7.A02
            if (r0 == 0) goto L_0x04b1
            java.lang.String r0 = r0.A0J(r4)
            r1[r3] = r0
            java.lang.String r2 = r7.A0o(r2, r1)
        L_0x049b:
            X.01I r1 = r7.A0h()
            X.AnonymousClass00C.A0E(r1, r6)
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            r1.A3H(r0, r2)
            return
        L_0x04a9:
            X.8zh r0 = X.C188508zh.A03
            if (r5 != r0) goto L_0x049b
            r2 = 2131890314(0x7f12108a, float:1.9415316E38)
            goto L_0x048b
        L_0x04b1:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04b8:
            X.01I r0 = r7.A0h()
            X.AnonymousClass00C.A0E(r0, r6)
            X.14u r0 = (X.C225314u) r0
            r0.Bnv()
            return
        L_0x04c5:
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r13.Bu1(r0)
            return
        L_0x04cc:
            int r0 = r1.A00
            r5.BO5(r0)
            return
        L_0x04d2:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x04e0
            int r0 = r1.A02
            java.lang.String r0 = r5.getString(r0)
            r5.A3G(r0)
            return
        L_0x04e0:
            r5.Bnv()
            return
        L_0x04e4:
            r5.Bnv()
            android.content.Context r0 = r5.getApplicationContext()
            java.util.HashMap r4 = r1.A07
            java.lang.String r3 = r1.A06
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.BrazilPayBloksActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "screen_params"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r3)
            r0 = 1
            r5.BuO(r2, r0)
            return
        L_0x050b:
            X.0wU r2 = r5.A04
            X.2kV r0 = r5.A06
            if (r0 == 0) goto L_0x051e
            int r1 = r0.A06()
            r0 = 1
            if (r1 != r0) goto L_0x051e
            X.2kV r1 = r5.A06
            r0 = 0
            r1.A0D(r0)
        L_0x051e:
            android.os.Bundle r4 = X.AnonymousClass001.A07()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            java.lang.String r14 = "payments:settings"
            r4.putString(r0, r14)
            X.0ww r8 = r5.A01
            X.0yf r7 = r5.A06
            X.3DY r6 = r5.A00
            X.0ts r9 = r5.A00
            X.13E r12 = r5.A02
            X.1De r13 = r5.A04
            r10 = 0
            X.2kV r3 = new X.2kV
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5.A06 = r3
            X.C36331k8.A1F(r3, r2)
            return
        L_0x0542:
            android.content.Context r0 = r5.getApplicationContext()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity"
            r2.setClassName(r1, r0)
            r5.startActivity(r2)
            return
        L_0x0557:
            X.17Y r2 = r3.A05
            r1 = 2131889558(0x7f120d96, float:1.9413783E38)
            r0 = 1
            r2.A06(r1, r0)
        L_0x0560:
            r3.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BA8.BTH(java.lang.Object):void");
    }
}
