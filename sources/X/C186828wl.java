package X;

/* renamed from: X.8wl  reason: invalid class name and case insensitive filesystem */
public class C186828wl extends C180898mb {
    public final AnonymousClass1FQ A00;
    public final AnonymousClass2bI A01;

    public static void A08(AnonymousClass8NG r1, C195469Uk r2) {
        AnonymousClass11F r0 = r2.A05;
        C18740tg.A06(r0);
        r1.A0X(r0.getRawString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        r13.A0X(r0);
        r0 = r6.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        r0 = r0.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0186, code lost:
        r1.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a8, code lost:
        r13.A0Y(r6[r5]);
        r0 = r6[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01af, code lost:
        r13.A0Y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass8NG r12, X.AnonymousClass8NK r13) {
        /*
            r11 = this;
            X.2bI r6 = r11.A01
            X.C18740tg.A06(r6)
            A08(r12, r11)
            int r0 = r6.A00
            switch(r0) {
                case 37: goto L_0x0013;
                case 38: goto L_0x000d;
                case 39: goto L_0x010d;
                case 40: goto L_0x00c4;
                case 41: goto L_0x00c7;
                case 42: goto L_0x00ca;
                case 43: goto L_0x000d;
                case 44: goto L_0x014e;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "PaymentWebQuery/onCreateWebInfoBuilder malformed sys message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0012:
            return
        L_0x0013:
            X.1FQ r7 = r11.A00
            X.8nh r6 = (X.C181578nh) r6
            java.lang.String r3 = r6.A03
            X.3Qa r2 = r6.A02
            X.C18740tg.A06(r2)
            X.1EU r0 = r7.A09
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r1 = r0.A05
            java.lang.String r0 = r2.A01
            X.9lY r5 = X.C165587tf.A0R(r1, r0, r3)
            if (r5 != 0) goto L_0x003f
            X.1Dc r2 = r7.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "buildWebTransactionStatusUpdate: null transaction id="
            r1.append(r0)
            r1.append(r3)
        L_0x003b:
            X.C165607th.A1E(r2, r1)
            return
        L_0x003f:
            java.lang.String r1 = r6.A01
            X.C18740tg.A06(r1)
            java.lang.String r0 = ";"
            java.lang.String[] r8 = r1.split(r0)
            java.lang.String r0 = r6.A02
            r3 = 0
            long r1 = X.AnonymousClass6R8.A01(r0, r3)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r9
            java.lang.String r0 = r6.A04
            long r3 = X.AnonymousClass6R8.A01(r0, r3)
            long r3 = r3 / r9
            int r6 = r8.length
            r0 = 5
            if (r6 < r0) goto L_0x0093
            r0 = 2
            r0 = r8[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = r0.intValue()
        L_0x006b:
            r0 = 102(0x66, float:1.43E-43)
            if (r6 == r0) goto L_0x0096
            r0 = 106(0x6a, float:1.49E-43)
            if (r6 == r0) goto L_0x00f7
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x00de
            r0 = 411(0x19b, float:5.76E-43)
            if (r6 == r0) goto L_0x00de
            r0 = 412(0x19c, float:5.77E-43)
            if (r6 == r0) goto L_0x00e1
            switch(r6) {
                case 406: goto L_0x00e1;
                case 407: goto L_0x00e1;
                case 408: goto L_0x00de;
                case 409: goto L_0x00db;
                default: goto L_0x0082;
            }
        L_0x0082:
            X.1Dc r2 = r7.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "buildWebTransactionStatusUpdate: unhandled transaction status "
            r1.append(r0)
            int r0 = r5.A02
            r1.append(r0)
            goto L_0x003b
        L_0x0093:
            int r6 = r5.A02
            goto L_0x006b
        L_0x0096:
            X.16X r0 = r5.A08
            if (r0 == 0) goto L_0x0012
            X.91I r0 = X.AnonymousClass91I.A2d
            r13.A0X(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0E
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = ""
        L_0x00a9:
            r13.A0Y(r0)
            java.lang.String r0 = r5.A0I
            r13.A0Y(r0)
            X.16X r0 = r5.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x01af
        L_0x00c4:
            X.91I r0 = X.AnonymousClass91I.A2S
            goto L_0x00cc
        L_0x00c7:
            X.91I r0 = X.AnonymousClass91I.A2X
            goto L_0x00cc
        L_0x00ca:
            X.91I r0 = X.AnonymousClass91I.A2W
        L_0x00cc:
            r13.A0X(r0)
            X.11F r0 = r6.A0J()
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.getRawString()
            goto L_0x01af
        L_0x00db:
            X.91I r0 = X.AnonymousClass91I.A2h
            goto L_0x00e3
        L_0x00de:
            X.91I r0 = X.AnonymousClass91I.A2g
            goto L_0x00e3
        L_0x00e1:
            X.91I r0 = X.AnonymousClass91I.A2f
        L_0x00e3:
            r13.A0X(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = ""
        L_0x00f0:
            r13.A0Y(r0)
            r13.A0V(r3)
            return
        L_0x00f7:
            X.91I r0 = X.AnonymousClass91I.A2e
            r13.A0X(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0E
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = ""
        L_0x0106:
            r13.A0Y(r0)
            r13.A0V(r1)
            return
        L_0x010d:
            X.1FQ r2 = r11.A00
            X.8ng r6 = (X.C181568ng) r6
            java.lang.String r1 = r6.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x011e
            X.1Dc r1 = r2.A0A
            java.lang.String r0 = "buildWebTransactionReminder: failed to retrieve web stub string"
            goto L_0x0186
        L_0x011e:
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r1.split(r0)
            r5 = 1
            r0 = r6[r5]
            r1 = -1
            int r0 = X.AnonymousClass6R8.A00(r0, r1)
            if (r0 == r1) goto L_0x0133
            X.1Dc r1 = r2.A0A
            java.lang.String r0 = "buildWebTransactionReminder: outdated currency format"
            goto L_0x0186
        L_0x0133:
            r1 = 2
            r0 = r6[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0141
            X.1Dc r1 = r2.A0A
            java.lang.String r0 = "buildWebTransactionReminder: missing amount"
            goto L_0x0186
        L_0x0141:
            X.91I r0 = X.AnonymousClass91I.A2d
            r13.A0X(r0)
            java.lang.String r0 = X.C165617ti.A0a(r6)
            r13.A0Y(r0)
            goto L_0x01a8
        L_0x014e:
            X.1FQ r4 = r11.A00
            X.2cP r6 = (X.AnonymousClass2cP) r6
            com.whatsapp.jid.UserJid r0 = r6.A01
            java.lang.String r3 = X.AnonymousClass143.A03(r0)
            com.whatsapp.jid.UserJid r0 = r6.A00
            java.lang.String r2 = X.AnonymousClass143.A03(r0)
            java.lang.String r1 = r6.A03
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0198
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0198
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r1.split(r0)
            r5 = 0
            r0 = r6[r5]
            r1 = -1
            int r0 = X.AnonymousClass6R8.A00(r0, r1)
            if (r0 == r1) goto L_0x018a
            X.1Dc r1 = r4.A0A
            java.lang.String r0 = "buildWebRequestExpiration: outdated currency format"
        L_0x0186:
            r1.A05(r0)
            return
        L_0x018a:
            r1 = 1
            r0 = r6[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x019d
            X.1Dc r1 = r4.A0A
            java.lang.String r0 = "buildWebRequestExpiration: missing amount"
            goto L_0x0186
        L_0x0198:
            X.1Dc r1 = r4.A0A
            java.lang.String r0 = "buildWebRequestExpiration: failed to retrieve request sender jid or receiver jid or web stub string"
            goto L_0x0186
        L_0x019d:
            X.91I r0 = X.AnonymousClass91I.A2V
            r13.A0X(r0)
            r13.A0Y(r3)
            r13.A0Y(r2)
        L_0x01a8:
            r0 = r6[r5]
            r13.A0Y(r0)
            r0 = r6[r1]
        L_0x01af:
            r13.A0Y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186828wl.A0D(X.8NG, X.8NK):void");
    }

    public C186828wl(C19700wN r1, AnonymousClass1FQ r2, AnonymousClass2bI r3) {
        super(r1);
        this.A01 = r3;
        this.A00 = r2;
    }
}
