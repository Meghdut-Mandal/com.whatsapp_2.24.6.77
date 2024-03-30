package X;

import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

/* renamed from: X.75B  reason: invalid class name */
public class AnonymousClass75B implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass75B(AnonymousClass6VN r1, int i, boolean z) {
        this.A02 = i;
        if (13 - i != 0) {
            this.A00 = r1;
            this.A01 = z;
            return;
        }
        this.A00 = r1;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x032a, code lost:
        if (r24 != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x043e, code lost:
        if (X.C64153Mv.A04.contains(r2) != false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0501, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0504, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08b4, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r1.A00(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0989, code lost:
        r0 = X.C36351kA.A00(r1 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x098d, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0990, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if ("pending_buyer_confirmation".equals(r5.A05) == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0a9c, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a9f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0b25, code lost:
        r2.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0b28, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        if (r8 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ff, code lost:
        if (r8.length() == 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r7 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        r1 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        if (r4.A09.A0f(r7, r1.A05().BE1(), r1.A05().BAJ(), 1) == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014d, code lost:
        if (r1 == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015f, code lost:
        r18 = X.C188008yt.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r48 = this;
            r3 = r48
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x066a;
                case 1: goto L_0x0aef;
                case 2: goto L_0x0652;
                case 3: goto L_0x063a;
                case 4: goto L_0x0630;
                case 5: goto L_0x0ae5;
                case 6: goto L_0x060f;
                case 7: goto L_0x0aca;
                case 8: goto L_0x0511;
                case 9: goto L_0x0aa0;
                case 10: goto L_0x0a73;
                case 11: goto L_0x0a32;
                case 12: goto L_0x0a04;
                case 13: goto L_0x09fa;
                case 14: goto L_0x09dd;
                case 15: goto L_0x09d0;
                case 16: goto L_0x09c3;
                case 17: goto L_0x09ad;
                case 18: goto L_0x099b;
                case 19: goto L_0x0991;
                case 20: goto L_0x0505;
                case 21: goto L_0x04e5;
                case 22: goto L_0x0981;
                case 23: goto L_0x0978;
                case 24: goto L_0x094e;
                case 25: goto L_0x0945;
                case 26: goto L_0x04d6;
                case 27: goto L_0x092e;
                case 28: goto L_0x090d;
                case 29: goto L_0x08e2;
                case 30: goto L_0x08d9;
                case 31: goto L_0x0408;
                case 32: goto L_0x08cb;
                case 33: goto L_0x0891;
                case 34: goto L_0x0877;
                case 35: goto L_0x086f;
                case 36: goto L_0x085a;
                case 37: goto L_0x0849;
                case 38: goto L_0x07d0;
                case 39: goto L_0x07c6;
                case 40: goto L_0x0283;
                case 41: goto L_0x07b8;
                case 42: goto L_0x07ae;
                case 43: goto L_0x01fe;
                case 44: goto L_0x06ba;
                case 45: goto L_0x0018;
                case 46: goto L_0x01bc;
                case 47: goto L_0x0177;
                case 48: goto L_0x068d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.4X4 r0 = (X.AnonymousClass4X4) r0
            boolean r2 = r3.A01
            java.lang.Object r0 = r0.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            X.64G r1 = r0.A05
        L_0x0013:
            r0 = 0
            r1.A00(r2, r0)
        L_0x0017:
            return
        L_0x0018:
            r15 = 0
            java.lang.Object r4 = r3.A00
            X.7yk r4 = (X.C167747yk) r4
            boolean r6 = r3.A01
            r14 = r15
            X.3Qa r1 = r4.A0A
            if (r1 == 0) goto L_0x0159
            X.9UZ r0 = r4.A07
            X.1A1 r0 = r0.A02
            X.3T1 r12 = r0.A03(r1)
            X.2bZ r12 = (X.AnonymousClass2bZ) r12
        L_0x002e:
            r11 = 0
            if (r12 == 0) goto L_0x0155
            X.9uk r0 = r12.A00
            if (r0 == 0) goto L_0x0155
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0155
            java.lang.String r2 = r0.A06
            if (r2 == 0) goto L_0x0156
            X.9UZ r0 = r4.A07
            X.1Ed r0 = r0.A01
            X.9lY r7 = r0.A0K(r2)
            if (r7 != 0) goto L_0x004c
            java.lang.String r0 = "Pay: PaymentCheckoutOrderViewModel/loadData the paymentTransactionInfo fetched from PaymentTransactionStore is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004c:
            r0 = 0
            r4.A0W(r7, r12, r0)
            if (r12 == 0) goto L_0x0150
            X.9uk r0 = r12.A00
            if (r0 == 0) goto L_0x0150
            X.9ui r5 = r0.A01
            if (r5 == 0) goto L_0x0151
            X.9uM r0 = r5.A0B
            X.AnonymousClass00C.A0B(r0)
            X.9ua r3 = r5.A03(r0)
            X.16X r0 = r3.A02
        L_0x0065:
            X.AnonymousClass00C.A0B(r0)
            java.math.BigDecimal r8 = r0.A00
            X.AnonymousClass00C.A08(r8)
            X.0yC r10 = r4.A05
            r0 = 1826(0x722, float:2.559E-42)
            long r0 = X.C36441kJ.A0B(r10, r0)
            X.9uk r9 = r12.A00
            if (r9 == 0) goto L_0x007f
            X.9ui r9 = r9.A01
            if (r9 == 0) goto L_0x007f
            X.16U r14 = r9.A08
        L_0x007f:
            X.9fK r13 = new X.9fK
            r13.<init>()
            r9 = 1000(0x3e8, float:1.401E-42)
            r13.A00 = r9
            r13.A01 = r0
            r13.A02 = r14
            X.9ua r13 = r13.A01()
            r0 = 1712(0x6b0, float:2.399E-42)
            long r0 = X.C36441kJ.A0B(r10, r0)
            X.9uk r12 = r12.A00
            if (r12 == 0) goto L_0x00a0
            X.9ui r12 = r12.A01
            if (r12 == 0) goto L_0x00a0
            X.16U r11 = r12.A08
        L_0x00a0:
            X.9fK r12 = new X.9fK
            r12.<init>()
            r12.A00 = r9
            r12.A01 = r0
            r12.A02 = r11
            X.9ua r11 = r12.A01()
            java.lang.String r9 = r5.A05()
            float r1 = r8.floatValue()
            X.16X r0 = r13.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x015c
            float r1 = r8.floatValue()
            X.16X r0 = r11.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x015c
            java.lang.String r8 = r5.A04
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x00f0
            if (r8 == 0) goto L_0x00f0
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "pending_buyer_confirmation"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            if (r2 == 0) goto L_0x0145
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0145
            if (r8 == 0) goto L_0x0101
        L_0x00fb:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x015c
        L_0x0101:
            if (r7 == 0) goto L_0x015f
            X.1EU r1 = r4.A06
            X.B66 r0 = r1.A05()
            X.B3q r8 = r0.BAJ()
            X.B66 r0 = r1.A05()
            X.9jA r2 = r0.BE1()
            X.1FR r1 = r4.A09
            r0 = 1
            boolean r0 = r1.A0f(r7, r2, r8, r0)
            if (r0 == 0) goto L_0x015f
        L_0x011e:
            X.9u5 r2 = r5.A04()
            boolean r0 = r4.A0a()
            r1 = 1
            if (r0 == 0) goto L_0x0143
            if (r9 == 0) goto L_0x0131
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0143
        L_0x0131:
            if (r6 == 0) goto L_0x015c
            if (r1 != 0) goto L_0x015c
            if (r2 == 0) goto L_0x0141
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x013d:
            r4.A0V(r3, r0, r9)
            return
        L_0x0141:
            r0 = 0
            goto L_0x013d
        L_0x0143:
            r1 = 0
            goto L_0x0131
        L_0x0145:
            if (r8 == 0) goto L_0x011e
            int r0 = r8.length()
            if (r0 == 0) goto L_0x011e
            if (r1 == 0) goto L_0x00fb
            goto L_0x011e
        L_0x0150:
            r5 = r15
        L_0x0151:
            r3 = r15
            r0 = r15
            goto L_0x0065
        L_0x0155:
            r2 = r15
        L_0x0156:
            r7 = r15
            goto L_0x004c
        L_0x0159:
            r12 = 0
            goto L_0x002e
        L_0x015c:
            X.8yt r18 = X.C188008yt.INACTIVE
            goto L_0x0161
        L_0x015f:
            X.8yt r18 = X.C188008yt.ACTIVE
        L_0x0161:
            X.00s r1 = r4.A03
            X.9de r14 = r4.A08
            r22 = 0
            r17 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r16 = r15
            X.5tn r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0501
        L_0x0177:
            java.lang.Object r4 = r3.A00
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r4 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r4
            boolean r2 = r3.A01
            X.00T r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            X.00r r1 = (X.C001600r) r1
            X.1eV r6 = r4.A03
            X.54i r0 = r6.A00()
            r1.A0C(r0)
            if (r2 == 0) goto L_0x0017
            r5 = 0
            X.1Vv r0 = r6.A00
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0017
            X.1Db r1 = r6.A01
            X.0wo r0 = r1.A01
            long r3 = X.C19970wo.A00(r0)
            android.content.SharedPreferences r1 = r1.A03()
            java.lang.String r0 = "payments_methods_last_sync_time"
            long r0 = X.C36341k9.A0B(r1, r0)
            long r3 = r3 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r1 = X.C90484aE.A0K(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            X.1Vk r0 = r6.A02
            r0.A09(r5)
            return
        L_0x01bc:
            java.lang.Object r5 = r3.A00
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r5 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r5
            boolean r6 = r3.A01
            r7 = 0
            X.1EU r0 = r5.A05
            X.B66 r0 = r0.A05()
            X.9Yc r4 = r0.BFZ()
            if (r4 == 0) goto L_0x0017
            X.0yC r1 = r4.A07
            r0 = 842(0x34a, float:1.18E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0017
            X.1YQ r3 = r5.A06
            X.6O3 r2 = r3.A01()
            if (r6 == 0) goto L_0x01e7
            X.00s r1 = r5.A01
            r0 = 2
            X.C121835tn.A00(r1, r2, r7, r0)
        L_0x01e7:
            X.9dE r1 = r2.A01
            X.9cl r0 = r2.A02
            boolean r2 = r4.A04(r1, r0)
            X.6wp r0 = new X.6wp
            r0.<init>(r5, r6)
            X.9RV r1 = new X.9RV
            r1.<init>(r0, r3, r2)
            r0 = 0
            r3.A06(r1, r0)
            return
        L_0x01fe:
            java.lang.Object r2 = r3.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r2 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r2
            boolean r1 = r3.A01
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0239
            X.6NX r6 = r2.A0U
            boolean r2 = r2.A09
            r6.A01()
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            X.0xJ r1 = r6.A0A
            r0 = 1
            r1.A04(r0)
            java.lang.String r0 = "fpm/ExportHelper/reconnectToServer()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x0017
            r0 = 25
            X.72n r5 = new X.72n
            r5.<init>(r6, r0)
            r0 = 0
            r4 = 0
            X.0wU r3 = r6.A0L
            X.5qa r2 = r6.A0J
            X.6wV r1 = new X.6wV
            r1.<init>(r6, r5, r0, r4)
            X.6wW r0 = new X.6wW
            r0.<init>(r1, r2, r3, r4)
            r0.A00()
            return
        L_0x0239:
            X.5zF r5 = r2.A0V
            X.68w r0 = r5.A0B
            r0.A02()
            if (r1 == 0) goto L_0x0017
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            X.1QN r0 = r5.A04
            r0.A00()
            X.12s r4 = r5.A03
            r4.A02()
            X.0y0 r0 = r5.A01
            java.io.File r1 = r0.A0H()
            r0 = 0
            X.AnonymousClass6YY.A0H(r1, r0)
            java.lang.String[] r0 = r1.list()
            if (r0 == 0) goto L_0x0270
            int r0 = r0.length
            if (r0 == 0) goto L_0x0270
            X.0wN r3 = r5.A00
            r2 = 0
            java.lang.String r1 = "fpm/ImportHelper/"
            java.lang.String r0 = "cancelImport/could not delete media folder"
            r3.A0E(r1, r0, r2)
            java.lang.String r0 = "fpm/ImportHelper/cleanUpAfterCancellation()/could not delete media folder"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0270:
            X.6Ni r0 = r4.A00()
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0017
            X.3HJ r0 = r5.A0G
            r0.A00()
            r0.A01()
            return
        L_0x0283:
            java.lang.Object r0 = r3.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            boolean r12 = r3.A01
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A02
            java.util.List r1 = X.C36401kF.A0w(r1)
            boolean r3 = X.AnonymousClass143.A0L(r1)
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A02
            java.util.List r5 = X.C36401kF.A0w(r1)
            boolean r1 = r5.isEmpty()
            r4 = 0
            if (r1 != 0) goto L_0x0405
            int r2 = r5.size()
            r1 = 1
            if (r2 != r1) goto L_0x0405
            java.lang.Object r1 = r5.get(r4)
            boolean r10 = r1 instanceof X.C177528dw
        L_0x02b1:
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A02
            java.util.List r2 = X.C36401kF.A0w(r1)
            X.6VT r1 = r0.A0s
            X.00s r1 = r1.A02
            java.util.List r1 = X.C36401kF.A0w(r1)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0401
            X.8dw r1 = X.C177528dw.A00
            boolean r24 = r2.contains(r1)
        L_0x02cd:
            X.1GJ r1 = r0.A0q
            X.6BV r26 = r1.A0E(r10, r4, r3)
            X.1GJ r1 = r0.A0q
            X.6BV r36 = r1.A0D()
            if (r3 == 0) goto L_0x03fd
            X.1Gl r9 = X.C25471Gl.A0X
        L_0x02dd:
            X.6Tg r8 = r0.A1r
            java.util.Map r1 = r8.A00
            java.util.ArrayList r1 = X.C90494aF.A0g(r1)
            java.util.Iterator r23 = r1.iterator()
            r22 = 0
        L_0x02eb:
            boolean r1 = r23.hasNext()
            if (r1 == 0) goto L_0x0017
            java.lang.Object r7 = r23.next()
            X.6QO r7 = (X.AnonymousClass6QO) r7
            X.1Gn r1 = r0.A0m
            int r2 = r1.A01(r7)
            r1 = 3
            if (r2 != r1) goto L_0x02eb
            android.net.Uri r11 = r7.A0J
            X.6QO r1 = r8.A03(r11)
            java.io.File r1 = r1.A08()
            X.6QO r2 = r8.A03(r11)
            X.67y r2 = r2.A05()
            if (r2 != 0) goto L_0x0323
            if (r1 == 0) goto L_0x02eb
            X.67y r2 = new X.67y     // Catch:{ 1GL -> 0x031c }
            r2.<init>(r1)     // Catch:{ 1GL -> 0x031c }
            goto L_0x0326
        L_0x031c:
            r2 = move-exception
            java.lang.String r1 = "MediaComposerActivity/estimateMaxOutputVideoSize"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x02eb
        L_0x0323:
            if (r1 != 0) goto L_0x0326
            goto L_0x02eb
        L_0x0326:
            if (r10 != 0) goto L_0x032c
            r46 = 0
            if (r24 == 0) goto L_0x032e
        L_0x032c:
            r46 = 1
        L_0x032e:
            r21 = r22
            X.1GJ r3 = r0.A0q
            long r13 = r2.A03
            boolean r35 = r3.A0I(r9, r1)
            r31 = 0
            r33 = 0
            r34 = 0
            r25 = r3
            r27 = r2
            r28 = r1
            r29 = r13
            long r44 = r25.A0B(r26, r27, r28, r29, r31, r33, r34, r35)
            r47 = r22 ^ 1
            r41 = r0
            r43 = r2
            r42 = r26
            android.util.Pair r3 = r41.A3i(r42, r43, r44, r46, r47)
            java.lang.Object r4 = r3.first
            long r19 = X.C36431kI.A09(r4)
            if (r22 != 0) goto L_0x0364
            java.lang.Object r3 = r3.second
            boolean r21 = X.AnonymousClass000.A1X(r3)
        L_0x0364:
            X.1E2 r3 = r0.A0r
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x03fa
            X.1GJ r3 = r0.A0q
            boolean r45 = r3.A0I(r9, r1)
            r41 = 0
            r43 = 0
            r44 = 0
            r35 = r3
            r37 = r2
            r38 = r1
            r39 = r13
            long r3 = r35.A0B(r36, r37, r38, r39, r41, r43, r44, r45)
            r6 = 0
            r1 = r36
            r5 = r46
            android.util.Pair r1 = r0.A3i(r1, r2, r3, r5, r6)
            java.lang.Object r1 = r1.first
            long r17 = X.C36431kI.A09(r1)
        L_0x0393:
            if (r12 == 0) goto L_0x03f7
            r3 = r17
        L_0x0397:
            r5 = 0
            android.graphics.Point r1 = r7.A03()
            if (r1 == 0) goto L_0x03ca
            android.graphics.Point r1 = r7.A03()
            int r1 = r1.y
            long r1 = (long) r1
            android.graphics.Point r5 = r7.A03()
            int r5 = r5.x
            long r5 = (long) r5
            long r15 = r1 - r5
            if (r12 != 0) goto L_0x03b3
            r19 = r17
        L_0x03b3:
            int r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x03bf
            int r7 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x03f5
            int r7 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r7 <= 0) goto L_0x03f5
        L_0x03bf:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = java.lang.Math.max(r3, r1)
            long r1 = r1 + r5
            long r3 = java.lang.Math.min(r1, r13)
        L_0x03ca:
            int r7 = (int) r5
            int r1 = (int) r3
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r7, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            android.util.Pair r2 = X.C36441kJ.A0Q(r2, r1)
            if (r22 != 0) goto L_0x03e1
            java.lang.Object r1 = r2.second
            boolean r22 = X.AnonymousClass000.A1X(r1)
        L_0x03e1:
            java.lang.Object r2 = r2.first
            android.graphics.Point r2 = (android.graphics.Point) r2
            int r1 = r2.x
            long r3 = (long) r1
            int r1 = r2.y
            long r1 = (long) r1
            r13 = r0
            r14 = r11
            r15 = r3
            r17 = r1
            r13.Bsc(r14, r15, r17)
            goto L_0x02eb
        L_0x03f5:
            r3 = r1
            goto L_0x03ca
        L_0x03f7:
            r3 = r19
            goto L_0x0397
        L_0x03fa:
            r17 = r19
            goto L_0x0393
        L_0x03fd:
            X.1Gl r9 = X.C25471Gl.A0i
            goto L_0x02dd
        L_0x0401:
            r24 = 0
            goto L_0x02cd
        L_0x0405:
            r10 = 0
            goto L_0x02b1
        L_0x0408:
            java.lang.Object r6 = r3.A00
            X.1uh r6 = (X.C40061uh) r6
            boolean r0 = r3.A01
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r9 = 0
            r7 = 1
            if (r0 == 0) goto L_0x04d3
            X.0xM r1 = r6.A0k
            X.11F r2 = r6.A0t
            boolean r0 = r2 instanceof X.C223313w
            if (r0 == 0) goto L_0x04d3
            X.1FV r1 = r1.A0u
            r0 = r2
            X.13w r0 = (X.C223313w) r0
            r1.A07(r0)
            java.lang.Boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0432
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04d3
        L_0x0432:
            r10 = 1
            X.3Mv r0 = X.C64153Mv.A01
            X.AnonymousClass00C.A0D(r2, r9)
            java.util.Set r0 = X.C64153Mv.A04
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0441
        L_0x0440:
            r9 = 1
        L_0x0441:
            X.0xM r4 = r6.A0k
            X.11F r8 = r6.A0t
            X.16D r0 = r4.A0A
            X.141 r1 = r0.A08(r8)
            if (r1 == 0) goto L_0x047a
            X.1G7 r0 = r4.A0E
            X.4QC r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x047a
            boolean r0 = r0.BMk()
            if (r0 == 0) goto L_0x047a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Creating initial biz info system message for chat: "
            X.C36321k7.A1K(r8, r0, r1)
            X.19x r2 = r4.A1A
            X.0wo r0 = r4.A0C
            long r0 = X.C19970wo.A00(r0)
            X.19w r2 = r2.A01
            X.3Qa r3 = r2.A02(r8, r7)
            X.5JB r2 = new X.5JB
            r2.<init>(r3, r0)
            r5.add(r2)
        L_0x047a:
            if (r10 == 0) goto L_0x0492
            X.19x r1 = r4.A1A
            X.0wo r0 = r4.A0C
            long r2 = X.C19970wo.A00(r0)
            X.19w r0 = r1.A01
            X.3Qa r1 = r0.A02(r8, r7)
            X.5JC r0 = new X.5JC
            r0.<init>(r1, r2)
            r5.add(r0)
        L_0x0492:
            if (r9 == 0) goto L_0x04c3
            X.18x r0 = r6.A0r
            X.8n1 r1 = r0.A03(r8)
            if (r1 == 0) goto L_0x04a4
            X.1Rs r0 = r6.A17
            X.C36341k9.A19(r0, r7)
            r5.add(r1)
        L_0x04a4:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0017
            java.util.Iterator r3 = r5.iterator()
        L_0x04ae:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0017
            X.3T1 r2 = X.C36391kE.A0l(r3)
            boolean r1 = r2.A1Y
            r0 = -1
            if (r1 == 0) goto L_0x04bf
            r0 = 22
        L_0x04bf:
            r4.A0m(r2, r0)
            goto L_0x04ae
        L_0x04c3:
            X.3Mv r2 = X.C64153Mv.A01
            X.02t r1 = r6.A1G
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            monitor-enter(r2)
            java.util.List r0 = X.C64153Mv.A02     // Catch:{ all -> 0x0af8 }
            r0.add(r1)     // Catch:{ all -> 0x0af8 }
            monitor-exit(r2)
            goto L_0x04a4
        L_0x04d3:
            r10 = 0
            goto L_0x0440
        L_0x04d6:
            java.lang.Object r2 = r3.A00
            X.2L0 r2 = (X.AnonymousClass2L0) r2
            boolean r1 = r3.A01
            r0 = 0
            r2.A07 = r0
            if (r1 != 0) goto L_0x0017
            X.AnonymousClass2L0.A01(r2)
            return
        L_0x04e5:
            java.lang.Object r4 = r3.A00
            X.2k7 r4 = (X.C50052k7) r4
            boolean r2 = r3.A01
            java.lang.ref.WeakReference r0 = r4.A0B
            java.lang.Object r1 = r0.get()
            X.1to r1 = (X.C39801to) r1
            if (r1 == 0) goto L_0x0017
            boolean r0 = X.C36431kI.A1Y(r4)
            if (r0 != 0) goto L_0x0017
            X.00s r1 = r1.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0501:
            r1.A0C(r0)
            return
        L_0x0505:
            java.lang.Object r0 = r3.A00
            X.6rs r0 = (X.C144246rs) r0
            boolean r2 = r3.A01
            X.6YT r0 = r0.A00
            X.64G r1 = r0.A0H
            goto L_0x0013
        L_0x0511:
            java.lang.Object r5 = r3.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r5 = (com.whatsapp.avatar.home.AvatarHomeActivity) r5
            boolean r6 = r3.A01
            com.whatsapp.components.MainChildCoordinatorLayout r0 = r5.A0G
            if (r0 != 0) goto L_0x0522
            java.lang.String r0 = "coordinatorLayout"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0522:
            int r3 = r0.getHeight()
            float r1 = (float) r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r4 = (int) r1
            android.widget.LinearLayout r2 = r5.A06
            if (r2 != 0) goto L_0x0536
            java.lang.String r0 = "containerNewUser"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0536:
            r1 = 0
            int r0 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x0544
            r2.measure(r1, r1)
            int r0 = r2.getMeasuredHeight()
        L_0x0544:
            if (r6 == 0) goto L_0x0549
            if (r0 <= 0) goto L_0x0549
            r4 = r0
        L_0x0549:
            int r2 = r3 - r4
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r5.A0F
            if (r1 == 0) goto L_0x0553
            r0 = 0
            r1.A0Y(r2, r0)
        L_0x0553:
            android.widget.LinearLayout r0 = r5.A05
            if (r0 != 0) goto L_0x055e
            java.lang.String r0 = "containerAvatarSheet"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x055e:
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            android.view.View r0 = r5.A03
            java.lang.String r8 = "sheetPaddingView"
            if (r0 != 0) goto L_0x056e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x056e:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x059e
            int r7 = r0.height
        L_0x0576:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 16843499(0x10102eb, float:2.3695652E-38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r6, r0)
            if (r0 == 0) goto L_0x05b6
            int r1 = r6.data
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r5)
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            android.widget.LinearLayout r0 = r5.A05
            if (r0 != 0) goto L_0x05a0
            java.lang.String r0 = "containerAvatarSheet"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x059e:
            r7 = 0
            goto L_0x0576
        L_0x05a0:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.whatsapp.components.MainChildCoordinatorLayout r0 = r5.A0G
            if (r0 != 0) goto L_0x05af
            java.lang.String r0 = "coordinatorLayout"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05af:
            int r0 = r0.getHeight()
            int r0 = r0 - r2
            r1.height = r0
        L_0x05b6:
            if (r3 <= r7) goto L_0x05c9
            android.view.View r0 = r5.A03
            if (r0 != 0) goto L_0x05c1
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x05c1:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x05c9
            r0.height = r3
        L_0x05c9:
            com.whatsapp.CircularProgressBar r0 = r5.A09
            java.lang.String r3 = "avatarLoadingProgressBar"
            if (r0 != 0) goto L_0x05d4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05d4:
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x05e7
            com.whatsapp.CircularProgressBar r1 = r5.A09
            if (r1 != 0) goto L_0x05e3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05e3:
            r0 = 0
            r1.measure(r0, r0)
        L_0x05e7:
            com.whatsapp.CircularProgressBar r0 = r5.A09
            if (r0 != 0) goto L_0x05f0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05f0:
            int r2 = r0.getMeasuredHeight()
            com.whatsapp.CircularProgressBar r0 = r5.A09
            if (r0 != 0) goto L_0x05fd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05fd:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0017
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0017
            int r0 = r4 / 2
            int r0 = r0 - r2
            r1.topMargin = r0
            return
        L_0x060f:
            java.lang.Object r4 = r3.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            boolean r1 = r3.A01
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0017
            boolean r0 = X.AnonymousClass3SJ.A04(r0)
            if (r0 != 0) goto L_0x0017
            r2 = 1
            if (r1 == 0) goto L_0x0afb
            r0 = 2
            r4.A00 = r0
            X.1Uz r0 = r4.A06
            r0.A05(r2)
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A03(r4)
            return
        L_0x0630:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r3.A00
            X.C36411kG.A1O(r0)
            return
        L_0x063a:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r2 = X.C90494aF.A0h(r0)
        L_0x0640:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r2.next()
            X.7m6 r1 = (X.C161067m6) r1
            boolean r0 = r3.A01
            r1.BZm(r0)
            goto L_0x0640
        L_0x0652:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r2 = X.C90494aF.A0h(r0)
        L_0x0658:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r2.next()
            X.7m6 r1 = (X.C161067m6) r1
            boolean r0 = r3.A01
            r1.Bhx(r0)
            goto L_0x0658
        L_0x066a:
            java.lang.Object r0 = r3.A00
            X.9Cd r0 = (X.C191229Cd) r0
            boolean r6 = r3.A01
            X.A28 r0 = r0.A00
            X.9VB r0 = r0.A0V
            java.util.List r5 = r0.A00
            int r4 = r5.size()
            r3 = 0
        L_0x067b:
            if (r3 >= r4) goto L_0x0017
            java.lang.Object r2 = r5.get(r3)
            r1 = 0
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r2, (boolean) r6)
            X.C202399lk.A00(r0)
            int r3 = r3 + 1
            goto L_0x067b
        L_0x068d:
            java.lang.Object r4 = r3.A00
            X.3UB r4 = (X.AnonymousClass3UB) r4
            boolean r1 = r3.A01
            java.io.File r0 = r4.A0A
            if (r0 == 0) goto L_0x06b6
            X.0wU r2 = r4.A0o
            if (r1 == 0) goto L_0x06ab
            r1 = 19
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.Boy(r0)
            X.7kJ r0 = r4.A0V
            r0.BgC()
            return
        L_0x06ab:
            r1 = 20
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.Boy(r0)
            return
        L_0x06b6:
            java.lang.String r0 = "ptvcameraui/video file doesn't exist"
            goto L_0x08b4
        L_0x06ba:
            java.lang.Object r0 = r3.A00
            X.8hw r0 = (X.C178848hw) r0
            boolean r1 = r3.A01
            X.0wQ r2 = r0.A02
            r2.A0G()
            X.142 r2 = r2.A0E
            X.C18740tg.A06(r2)
            if (r1 == 0) goto L_0x0786
            r5 = 0
            X.11F r6 = r2.A0H
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.16U r3 = r0.A05
            r2 = r3
            X.16V r2 = (X.AnonymousClass16V) r2
            java.lang.String r7 = r2.A02
            X.16X r4 = r0.A09
            X.9l8 r2 = X.C202159l8.A0E
            java.lang.String r9 = "IN"
            r13 = 1
            r15 = -1
            X.9nz r2 = X.C203419nz.$redex_init_class
            int r12 = X.AnonymousClass9ZS.A00(r9)
            r10 = 10
            r11 = 11
            r14 = 0
            r8 = r5
            X.9lY r4 = X.C203419nz.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x06f1:
            java.lang.String r2 = r0.A0Q
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0700
            X.8bI r3 = r0.A0O
            java.lang.String r2 = r0.A0Q
            r3.A0Q(r2)
        L_0x0700:
            X.0wo r2 = r0.A07
            long r2 = X.C19970wo.A00(r2)
            r4.A05 = r2
            java.lang.String r2 = "UNSET"
            r4.A0F = r2
            X.8bI r7 = r0.A0O
            r4.A0A = r7
            r4.A0P = r13
            X.6c7 r2 = r0.A0I
            java.lang.Object r2 = r2.A00
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L_0x077a
            r7.A0Q = r2
            X.6c7 r1 = r0.A0G
            java.lang.Object r6 = r1.A00
            X.6vT r5 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r2 = "legalName"
            X.6c7 r1 = new X.6c7
            r1.<init>(r5, r3, r6, r2)
            r7.A0B = r1
        L_0x072f:
            java.lang.String r6 = r7.A0K
            X.C18740tg.A05(r6)
            X.1Ed r5 = r0.A07
            r3 = 0
            r1 = -1
            X.9lY r5 = r5.A0L(r6, r3, r1)
            X.1Dc r3 = r0.A0g
            if (r5 != 0) goto L_0x076a
            java.lang.String r1 = "IN- HANDLE_SEND_AGAIN Old txn is null"
        L_0x0743:
            r3.A06(r1)
            X.1Ed r1 = r0.A07
            r1.A0c(r4, r5, r6)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "getPayNonWaVpaCallback added new transaction with trans id: "
            r2.append(r1)
            java.lang.String r1 = r4.A0K
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)
            r3.A06(r1)
            X.17Y r3 = r0.A05
            r2 = 41
            X.AVb r1 = new X.AVb
            r1.<init>(r0, r4, r2)
            r3.A0H(r1)
            return
        L_0x076a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "IN- HANDLE_SEND_AGAIN Old txn is not null, interop is "
            r2.append(r1)
            boolean r1 = r5.A0P
            java.lang.String r1 = X.C36421kH.A0d(r2, r1)
            goto L_0x0743
        L_0x077a:
            r7.A0O = r2
            X.6c7 r1 = r0.A0G
            java.lang.Object r1 = r1.A00
            java.lang.String r1 = (java.lang.String) r1
            r7.A0U(r1)
            goto L_0x072f
        L_0x0786:
            X.11F r8 = r2.A0H
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            r9 = 0
            X.16U r6 = r0.A05
            r2 = r6
            X.16V r2 = (X.AnonymousClass16V) r2
            java.lang.String r10 = r2.A02
            X.16X r7 = r0.A09
            X.9l8 r2 = X.C202159l8.A0E
            java.lang.String r12 = "IN"
            r17 = 0
            X.9nz r2 = X.C203419nz.$redex_init_class
            r18 = -1
            r14 = 401(0x191, float:5.62E-43)
            int r15 = X.AnonymousClass9ZS.A00(r12)
            r13 = 1
            r16 = 1
            r11 = r9
            X.9lY r4 = X.C203419nz.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x06f1
        L_0x07ae:
            java.lang.Object r1 = r3.A00
            com.whatsapp.mentions.MentionPickerView r1 = (com.whatsapp.mentions.MentionPickerView) r1
            boolean r0 = r3.A01
            r1.A08(r0)
            return
        L_0x07b8:
            java.lang.Object r0 = r3.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            boolean r1 = r3.A01
            X.4l7 r0 = r0.A0C
            X.1hi r0 = r0.A01
            X.C36341k9.A18(r0, r1)
            return
        L_0x07c6:
            java.lang.Object r1 = r3.A00
            com.whatsapp.identity.IdentityVerificationActivity r1 = (com.whatsapp.identity.IdentityVerificationActivity) r1
            boolean r0 = r3.A01
            com.whatsapp.identity.IdentityVerificationActivity.A0M(r1, r0)
            return
        L_0x07d0:
            java.lang.Object r2 = r3.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            boolean r0 = r3.A01
            X.1RJ r1 = r2.A20
            if (r0 == 0) goto L_0x0843
            r0 = 0
            r1.A03(r0)
            X.1RJ r1 = r2.A20
            X.005 r0 = r2.A2N
            java.lang.Object r0 = r0.get()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r1.A05(r0)
            X.12q r1 = r2.A0J
            X.147 r0 = r2.A1Y
            int r1 = r1.A05(r0)
            r0 = 6
            if (r1 != r0) goto L_0x0825
            X.0yC r1 = r2.A0D
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0825
            X.1RJ r0 = r2.A20
            android.view.View r1 = r0.A01()
            X.22V r1 = (X.AnonymousClass22V) r1
            r0 = 2131234098(0x7f080d32, float:1.8084352E38)
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r2, r0)
            r1.setIcon((android.graphics.drawable.Drawable) r0)
            X.1RJ r0 = r2.A20
            android.view.View r1 = r0.A01()
            X.22V r1 = (X.AnonymousClass22V) r1
            r0 = 2131886349(0x7f12010d, float:1.9407274E38)
        L_0x081d:
            java.lang.String r0 = r2.getString(r0)
            r1.setTitle(r0)
            return
        L_0x0825:
            X.1RJ r0 = r2.A20
            android.view.View r1 = r0.A01()
            X.22V r1 = (X.AnonymousClass22V) r1
            r0 = 2131234240(0x7f080dc0, float:1.808464E38)
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r2, r0)
            r1.setIcon((android.graphics.drawable.Drawable) r0)
            X.1RJ r0 = r2.A20
            android.view.View r1 = r0.A01()
            X.22V r1 = (X.AnonymousClass22V) r1
            r0 = 2131886350(0x7f12010e, float:1.9407276E38)
            goto L_0x081d
        L_0x0843:
            r0 = 8
            r1.A03(r0)
            return
        L_0x0849:
            java.lang.Object r4 = r3.A00
            X.14u r4 = (X.C225314u) r4
            boolean r3 = r3.A01
            X.17Y r2 = r4.A05
            r0 = 36
            X.75B r1 = new X.75B
            r1.<init>((int) r0, (java.lang.Object) r4, (boolean) r3)
            goto L_0x0b25
        L_0x085a:
            java.lang.Object r4 = r3.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            boolean r3 = r3.A01
            X.147 r2 = r4.A1Y
            X.1X4 r0 = r4.A03
            X.2jq r1 = new X.2jq
            r1.<init>(r4, r0, r2, r3)
            X.0wU r0 = r4.A04
            X.C36331k8.A1F(r1, r0)
            return
        L_0x086f:
            java.lang.Object r2 = r3.A00
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r3.A01
            goto L_0x0989
        L_0x0877:
            java.lang.Object r0 = r3.A00
            X.2fN r0 = (X.C47652fN) r0
            boolean r4 = r3.A01
            X.3HE r3 = r0.A01
            X.3BO r0 = r3.A06
            X.0v0 r0 = r0.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "sticker_picker_initial_download"
            X.C36331k8.A0w(r1, r0, r2)
            r3.A00(r4)
            return
        L_0x0891:
            java.lang.Object r0 = r3.A00
            X.29Q r0 = (X.AnonymousClass29Q) r0
            boolean r1 = r3.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A04
            android.widget.ImageView r0 = r0.A09
            android.view.animation.Animation r2 = r0.getAnimation()
            boolean r0 = r2 instanceof X.C37721n6
            if (r0 != 0) goto L_0x08bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversations-gdrive-observer/set-message/unexpected-animation-class: "
            r1.append(r0)
            if (r2 != 0) goto L_0x08b8
            java.lang.String r0 = "null"
        L_0x08b0:
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
        L_0x08b4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x08b8:
            java.lang.Class r0 = r2.getClass()
            goto L_0x08b0
        L_0x08bd:
            X.1n6 r2 = (X.C37721n6) r2
            if (r1 == 0) goto L_0x08c5
            r0 = 0
        L_0x08c2:
            r2.A01 = r0
            return
        L_0x08c5:
            r0 = 0
            r2.A00 = r0
            r0 = 1
            goto L_0x08c2
        L_0x08cb:
            java.lang.Object r4 = r3.A00
            X.1sS r4 = (X.C39471sS) r4
            boolean r2 = r3.A01
            X.1D0 r1 = r4.A0X
            X.6tS r0 = r4.A01
            r1.A0B(r0, r4, r2)
            return
        L_0x08d9:
            java.lang.Object r1 = r3.A00
            X.3TQ r1 = (X.AnonymousClass3TQ) r1
            r0 = 1
            X.AnonymousClass3TQ.A03(r1, r0)
            return
        L_0x08e2:
            java.lang.Object r4 = r3.A00
            X.3fk r4 = (X.C70803fk) r4
            boolean r0 = r3.A01
            X.28e r3 = r4.A2Q
            if (r0 == 0) goto L_0x0901
            android.widget.ImageButton r1 = r4.A0c
            r0 = 3
            r3.A0F(r1, r0)
        L_0x08f2:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A1V
            r0 = 44
            X.3v4 r2 = new X.3v4
            r2.<init>(r4, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0901:
            X.22r r2 = r3.A02
            if (r2 == 0) goto L_0x08f2
            X.11F r1 = r3.A0K
            com.whatsapp.community.ConversationCommunityViewModel r0 = r3.A0D
            r2.A0F(r0, r3, r1)
            goto L_0x08f2
        L_0x090d:
            java.lang.Object r4 = r3.A00
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r4 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r4
            boolean r0 = r3.A01
            X.0xT r1 = r4.A05
            if (r0 == 0) goto L_0x092b
            java.lang.String r0 = "26000361"
        L_0x0919:
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r2 = X.C36391kE.A0G(r0)
            X.1Dv r1 = r4.A00
            android.content.Context r0 = r4.A1D()
            r1.A06(r0, r2)
            return
        L_0x092b:
            java.lang.String r0 = "28030014"
            goto L_0x0919
        L_0x092e:
            java.lang.Object r4 = r3.A00
            X.2IO r4 = (X.AnonymousClass2IO) r4
            boolean r0 = r3.A01
            android.widget.FrameLayout r2 = r4.A07
            if (r0 == 0) goto L_0x093b
            r0 = 8
            goto L_0x098d
        L_0x093b:
            r1 = 0
            r2.setVisibility(r1)
            android.widget.ImageView r0 = r4.A08
            r0.setVisibility(r1)
            return
        L_0x0945:
            java.lang.Object r0 = r3.A00
            X.2Gx r0 = (X.C43322Gx) r0
            boolean r1 = r3.A01
            android.view.ViewStub r2 = r0.A02
            goto L_0x0989
        L_0x094e:
            java.lang.Object r4 = r3.A00
            X.2iG r4 = (X.C48912iG) r4
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x096f
            java.lang.Object r1 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            X.16E r0 = r1.A1X
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x096f
            X.17Y r2 = r1.A0Q
            r1 = 44
        L_0x0966:
            X.3v2 r0 = new X.3v2
            r0.<init>(r4, r1)
            r2.A0H(r0)
            return
        L_0x096f:
            java.lang.Object r0 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.17Y r2 = r0.A0Q
            r1 = 45
            goto L_0x0966
        L_0x0978:
            java.lang.Object r0 = r3.A00
            X.3B5 r0 = (X.AnonymousClass3B5) r0
            boolean r1 = r3.A01
            android.widget.ImageView r2 = r0.A04
            goto L_0x0989
        L_0x0981:
            java.lang.Object r0 = r3.A00
            X.3B5 r0 = (X.AnonymousClass3B5) r0
            boolean r1 = r3.A01
            com.google.android.material.textfield.TextInputLayout r2 = r0.A05
        L_0x0989:
            int r0 = X.C36351kA.A00(r1)
        L_0x098d:
            r2.setVisibility(r0)
            return
        L_0x0991:
            java.lang.Object r1 = r3.A00
            X.6YT r1 = (X.AnonymousClass6YT) r1
            boolean r0 = r3.A01
            X.AnonymousClass6YT.A0K(r1, r0)
            return
        L_0x099b:
            boolean r2 = r3.A01
            java.lang.Object r1 = r3.A00
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6YM.A3X
            if (r2 == 0) goto L_0x09a9
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityDeleted(r1)
            return
        L_0x09a9:
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityChanged(r1)
            return
        L_0x09ad:
            java.lang.Object r4 = r3.A00
            X.6YM r4 = (X.AnonymousClass6YM) r4
            boolean r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService/actionCreateCallLink isVideoCallLink:"
            X.C36321k7.A1X(r0, r1, r2)
            com.whatsapp.voipcalling.Voip.createCallLink(r2)
            r4.A0L()
            return
        L_0x09c3:
            java.lang.Object r2 = r3.A00
            X.4fT r2 = (X.C93034fT) r2
            boolean r1 = r3.A01
            r0 = 0
            r2.A04 = r0
            X.C93034fT.A03(r2, r1)
            return
        L_0x09d0:
            java.lang.Object r2 = r3.A00
            X.4fU r2 = (X.C93044fU) r2
            boolean r1 = r3.A01
            r0 = 0
            r2.A04 = r0
            X.C93044fU.A06(r2, r1)
            return
        L_0x09dd:
            java.lang.Object r2 = r3.A00
            X.6VN r2 = (X.AnonymousClass6VN) r2
            android.net.ConnectivityManager$NetworkCallback r1 = r2.A00
            if (r1 != 0) goto L_0x09e9
            java.lang.String r0 = "voip/weak-wifi/onUnavailable: network callback is already unregistered"
            goto L_0x0a9c
        L_0x09e9:
            android.net.ConnectivityManager r0 = r2.A04
            r0.unregisterNetworkCallback(r1)
            r0 = 0
            r2.A00 = null
            r2.A01 = r0
            boolean r0 = r3.A01
            com.whatsapp.voipcalling.Voip.notifyFailureToCreateAlternativeSocket(r0)
            return
        L_0x09fa:
            java.lang.Object r1 = r3.A00
            X.6VN r1 = (X.AnonymousClass6VN) r1
            boolean r0 = r3.A01
            r1.A07(r0)
            return
        L_0x0a04:
            java.lang.Object r4 = r3.A00
            X.3Ad r4 = (X.C60993Ad) r4
            boolean r3 = r3.A01
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0a1b
            X.17Y r2 = r4.A01
            android.app.Activity r1 = r4.A00
            boolean r0 = r1 instanceof X.C225014r
            if (r0 == 0) goto L_0x0a30
            X.14r r1 = (X.C225014r) r1
        L_0x0a18:
            r2.A09(r1)
        L_0x0a1b:
            if (r3 == 0) goto L_0x0a2a
            X.16I r1 = r4.A05
            X.3B0 r0 = r4.A04
            com.whatsapp.jid.UserJid r0 = r0.A04
            java.util.List r0 = X.C36371kC.A11(r0)
            r1.A03(r0)
        L_0x0a2a:
            X.4PI r0 = r4.A02
            r0.BfK(r3)
            return
        L_0x0a30:
            r1 = 0
            goto L_0x0a18
        L_0x0a32:
            boolean r0 = r3.A01
            java.lang.Object r5 = r3.A00
            X.6Uh r5 = (X.C132566Uh) r5
            if (r0 == 0) goto L_0x0a6e
            X.1KP r4 = r5.A07
            X.1KK r0 = r5.A03
            com.whatsapp.jid.UserJid r3 = r5.A08
            X.9uZ r2 = r0.A07(r3)
            X.0yC r1 = r4.A01
            r0 = 5996(0x176c, float:8.402E-42)
            boolean r1 = r1.A0E(r0)
            java.lang.String r0 = "promotions"
            boolean r0 = X.AnonymousClass1KP.A00(r4, r2, r0, r1)
            if (r0 == 0) goto L_0x0a60
            X.9lS r2 = r5.A06
            r1 = 1
            X.7t8 r0 = new X.7t8
            r0.<init>(r5, r1)
            r2.A06(r0, r3)
            return
        L_0x0a60:
            X.00s r1 = r5.A02
            r0 = 0
            r1.A0C(r0)
            X.1Rs r1 = r5.A0A
            X.4zR r0 = X.C102184zR.A00
            r1.A0C(r0)
            return
        L_0x0a6e:
            r0 = 0
            X.C132566Uh.A01(r5, r0)
            return
        L_0x0a73:
            java.lang.Object r0 = r3.A00
            X.29P r0 = (X.AnonymousClass29P) r0
            boolean r3 = r3.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = r0.A01
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0n(r2)
            if (r0 != 0) goto L_0x0a9a
            android.widget.ProgressBar r1 = r2.A02
            r0 = 100
            r1.setProgress(r0)
            android.widget.ProgressBar r1 = r2.A02
            r0 = 1
            r1.setIndeterminate(r0)
            android.widget.TextView r1 = r2.A04
            r0 = 2131894155(0x7f121f8b, float:1.9423107E38)
            r1.setText(r0)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0Q(r2, r3)
            return
        L_0x0a9a:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/activity exited during finishing msgstore download"
        L_0x0a9c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0aa0:
            java.lang.Object r2 = r3.A00
            X.6xS r2 = (X.C147586xS) r2
            boolean r10 = r3.A01
            X.65M r4 = r2.A02
            if (r10 == 0) goto L_0x0ac7
            java.lang.String r5 = "avatar_creation"
        L_0x0aac:
            X.7XR r6 = X.AnonymousClass7XR.A00
            r7 = 6
            r8 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0F
            r0 = 0
            r1.set(r0)
            X.0wU r0 = r4.A0E
            X.73p r3 = new X.73p
            r9 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.Boy(r3)
            X.1Bp r0 = r2.A06
            r0.A03()
            return
        L_0x0ac7:
            java.lang.String r5 = "avatar_update"
            goto L_0x0aac
        L_0x0aca:
            java.lang.Object r2 = r3.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r3.A01
            android.view.Window r0 = r2.getWindow()
            X.AnonymousClass1RC.A09(r0, r1)
            r1 = 2130969201(0x7f040271, float:1.7547077E38)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            X.AnonymousClass1RC.A04(r2, r0)
            return
        L_0x0ae5:
            java.lang.Object r1 = r3.A00
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r1 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r1
            boolean r0 = r3.A01
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A07(r1, r0)
            return
        L_0x0aef:
            java.lang.Object r1 = r3.A00
            X.6Wy r1 = (X.C133146Wy) r1
            r0 = 0
            X.C133146Wy.A01(r1, r0)
            return
        L_0x0af8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0afb:
            X.1Uz r1 = r4.A06
            r0 = 0
            r1.A05(r0)
            android.widget.TextView r1 = r4.A02
            r0 = 2131895143(0x7f122367, float:1.942511E38)
            r1.setText(r0)
            com.whatsapp.CodeInputField r1 = r4.A03
            java.lang.String r0 = ""
            r1.setCode(r0)
            com.whatsapp.CodeInputField r0 = r4.A03
            r0.setEnabled(r2)
            android.widget.ProgressBar r1 = r4.A01
            r0 = 100
            r1.setProgress(r0)
            X.17Y r2 = r4.A04
            r0 = 36
            X.72k r1 = new X.72k
            r1.<init>(r4, r0)
        L_0x0b25:
            r2.A0H(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75B.run():void");
    }

    public AnonymousClass75B(C167747yk r2, boolean z) {
        this.A02 = 45;
        this.A00 = r2;
        this.A01 = z;
    }

    public AnonymousClass75B(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z) {
        this.A02 = 46;
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z;
    }

    public AnonymousClass75B(Runnable runnable) {
        this.A02 = 4;
        this.A00 = runnable;
    }

    public AnonymousClass75B(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public AnonymousClass75B(AnonymousClass3TQ r2) {
        this.A02 = 30;
        this.A00 = r2;
        this.A01 = true;
    }

    public AnonymousClass75B(C133146Wy r2) {
        this.A02 = 1;
        this.A00 = r2;
        this.A01 = true;
    }
}
