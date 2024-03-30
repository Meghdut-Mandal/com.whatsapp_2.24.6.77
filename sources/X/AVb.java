package X;

public class AVb implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AVb(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new AVb(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c8, code lost:
        r6.A0H(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0704, code lost:
        r2.A02 = r4.A4L(r1, (X.AnonymousClass16X) null, r2);
        r4.Btm(r2);
        r4.A4U(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0711, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x072f, code lost:
        r9 = r8.A04;
        r5 = r8.A0B;
        r0 = r9.A04;
        X.AnonymousClass00C.A0D(r0, 0);
        r0 = X.C36391kE.A0v(r9, r5.A02(r0, true), new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved);
        r3 = X.AnonymousClass3LW.A00(r9);
        r3.A0q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x074e, code lost:
        if (r10 == null) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0750, code lost:
        r3.A0Z(X.C36391kE.A0v(r9, r5.A02(r10, true), new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0760, code lost:
        r3.setPositiveButton(com.whatsapp.R.string.f12nameremoved, new X.B8E(0, r7, r8));
        r3.setNegativeButton(com.whatsapp.R.string.f12nameremoved, X.C204079pQ.A00);
        X.C36341k9.A11(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0776, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r5 = r23
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0324;
                case 2: goto L_0x0345;
                case 3: goto L_0x0356;
                case 4: goto L_0x0377;
                case 5: goto L_0x039a;
                case 6: goto L_0x03a6;
                case 7: goto L_0x03b2;
                case 8: goto L_0x03be;
                case 9: goto L_0x03cf;
                case 10: goto L_0x03e2;
                case 11: goto L_0x0070;
                case 12: goto L_0x043a;
                case 13: goto L_0x0446;
                case 14: goto L_0x0454;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x0463;
                case 21: goto L_0x0486;
                case 22: goto L_0x049a;
                case 23: goto L_0x0086;
                case 24: goto L_0x04ae;
                case 25: goto L_0x0196;
                case 26: goto L_0x01be;
                case 27: goto L_0x04d2;
                case 28: goto L_0x04f6;
                case 29: goto L_0x050a;
                case 30: goto L_0x003c;
                case 31: goto L_0x01e3;
                case 32: goto L_0x0525;
                case 33: goto L_0x0556;
                case 34: goto L_0x056d;
                case 35: goto L_0x057d;
                case 36: goto L_0x02a3;
                case 37: goto L_0x02cc;
                case 38: goto L_0x05b4;
                case 39: goto L_0x02f3;
                case 40: goto L_0x05c4;
                case 41: goto L_0x05c4;
                case 42: goto L_0x05d6;
                case 43: goto L_0x0300;
                case 44: goto L_0x05e7;
                case 45: goto L_0x0605;
                case 46: goto L_0x0617;
                case 47: goto L_0x06f2;
                case 48: goto L_0x0712;
                case 49: goto L_0x0721;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r5.A00
            java.lang.Object r0 = r5.A01
            X.7fl r0 = (X.C158077fl) r0
            X.7ku r2 = r0.B7y()
            X.4vP r1 = X.C142326oh.A03(r1)
            X.6MO r0 = X.AnonymousClass6MO.A01
            X.AnonymousClass6JI.A00(r1, r0, r2)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r3 = r5.A00
            X.3ef r3 = (X.C70143ef) r3
            java.lang.Object r2 = r5.A01
            X.0wG r0 = r3.A01
            android.content.Context r1 = r0.A00
            int r0 = r3.A00
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r1, r0)
            X.005 r0 = r3.A02
            java.lang.Object r6 = r0.get()
            X.17Y r6 = (X.AnonymousClass17Y) r6
            r0 = 21
            X.736 r5 = new X.736
            r5.<init>(r3, r2, r1, r0)
            goto L_0x02c8
        L_0x003c:
            java.lang.Object r4 = r5.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r4 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r4
            java.lang.Object r3 = r5.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.1A1 r2 = r4.A0H
            if (r2 == 0) goto L_0x051e
            X.3Qa r1 = r4.A0G
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.FMessageKey"
            X.AnonymousClass00C.A0E(r1, r0)
            X.3T1 r0 = r2.A03(r1)
            X.2bZ r0 = (X.AnonymousClass2bZ) r0
            if (r0 == 0) goto L_0x0063
            X.9uk r0 = r0.A00
            if (r0 == 0) goto L_0x0063
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0063
            r4.A0F = r0
        L_0x0063:
            X.17Y r6 = r4.A00
            if (r6 == 0) goto L_0x0517
            r0 = 31
            X.AVb r5 = new X.AVb
            r5.<init>(r4, r3, r0)
            goto L_0x02c8
        L_0x0070:
            java.lang.Object r0 = r5.A00
            X.6tY r0 = (X.C145226tY) r0
            X.1Yo r0 = r0.A02
            X.1Yp r0 = r0.A0B
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            r1.next()
            goto L_0x007c
        L_0x0086:
            java.lang.Object r8 = r5.A00
            X.2bZ r8 = (X.AnonymousClass2bZ) r8
            java.lang.Object r7 = r5.A01
            X.9d4 r7 = (X.C198199d4) r7
            X.9uk r1 = r8.A00
            if (r1 == 0) goto L_0x001a
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x001a
            X.9ui r10 = r1.A01
            X.C18740tg.A06(r10)
            X.1EV r1 = r7.A02
            java.lang.String r0 = r10.A0E
            java.util.List r4 = r10.A0L
            boolean r0 = r1.A0J(r0, r4)
            if (r0 == 0) goto L_0x0143
            X.1FR r3 = r7.A06
            X.8z2 r1 = r3.A0I(r10)
            X.8z2 r0 = X.C188098z2.TOS_NONE
            if (r1 != r0) goto L_0x0143
            X.1Dc r2 = r7.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Fetching checkout session for "
            r1.append(r0)
            X.3Qa r11 = r8.A1J
            java.lang.String r6 = r11.A01
            java.lang.String r0 = X.AnonymousClass000.A0q(r6, r1)
            r2.A07(r0)
            X.AHk r9 = X.AnonymousClass97Q.A00(r4)
            X.9uP r0 = r10.A09
            X.9uB r0 = r0.A02
            r13 = 0
            if (r0 == 0) goto L_0x0192
            long r1 = r0.A00
        L_0x00d7:
            java.lang.String r5 = r10.A0F
            X.AnonymousClass00C.A07(r5)
            X.AnonymousClass00C.A07(r6)
            java.lang.String r19 = "UPI"
            X.8qf r12 = r7.A05
            X.0yC r4 = r12.A02
            r0 = 7302(0x1c86, float:1.0232E-41)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x00f7
            android.util.LruCache r4 = r12.A01
            X.9fq r0 = new X.9fq
            r0.<init>()
            r4.put(r6, r0)
        L_0x00f7:
            X.8gF r4 = r7.A03
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.11F r0 = r11.A00
            com.whatsapp.jid.UserJid r12 = X.C222813r.A00(r0)
            X.C18740tg.A06(r12)
            X.AnonymousClass00C.A08(r12)
            X.9uM r0 = r10.A0B
            X.C18740tg.A06(r0)
            X.9ua r11 = r10.A03(r0)
            java.lang.String r18 = r3.A0Y(r10)
            X.AnonymousClass00C.A08(r18)
            r3 = 0
            r0 = 0
            int r10 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x0190
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
        L_0x0121:
            java.lang.String r20 = X.C90464aC.A0V()
            if (r9 == 0) goto L_0x012b
            java.lang.String r3 = r9.A01
            org.json.JSONObject r0 = r9.A02
        L_0x012b:
            X.AEZ r13 = new X.AEZ
            r13.<init>(r7, r8, r6)
            X.0wU r1 = r4.A07
            X.AW8 r10 = new X.AW8
            r14 = r4
            r16 = r5
            r17 = r6
            r21 = r3
            r22 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1.Boy(r10)
        L_0x0143:
            X.1Dc r1 = r7.A04
            java.lang.String r0 = "Checking for expired checkout sessions"
            r1.A04(r0)
            X.8qf r6 = r7.A05
            android.util.LruCache r0 = r6.A01
            java.util.Map r0 = r0.snapshot()
            if (r0 == 0) goto L_0x001a
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r0)
        L_0x0158:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x001a
            java.util.Map$Entry r5 = X.AnonymousClass000.A11(r7)
            java.lang.Object r1 = r5.getValue()
            X.9fq r1 = (X.C199719fq) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0158
            X.8vd r0 = r1.A00
            if (r0 == 0) goto L_0x0188
            X.8sO r0 = r0.A01
            if (r0 == 0) goto L_0x0158
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L_0x0158
            long r3 = r0.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r1 = X.C36391kE.A0B(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0158
        L_0x0188:
            java.lang.String r0 = X.C90494aF.A0f(r5)
            r6.A0A(r0)
            goto L_0x0158
        L_0x0190:
            r15 = r3
            goto L_0x0121
        L_0x0192:
            r1 = 0
            goto L_0x00d7
        L_0x0196:
            java.lang.Object r3 = r5.A00
            X.9Rw r3 = (X.C194949Rw) r3
            java.lang.Object r1 = r5.A01
            X.AzS r1 = (X.C22976AzS) r1
            X.9cf r0 = r3.A00
            if (r0 == 0) goto L_0x01a8
            if (r1 == 0) goto L_0x001a
            r1.BTY(r0)
            return
        L_0x01a8:
            if (r1 == 0) goto L_0x01af
            X.8fq r0 = X.C178378fq.A00
            r0.registerObserver(r1)
        L_0x01af:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r3.A01 = r0
            X.0wG r1 = r3.A03
            X.9cf r0 = r3.A00
            if (r0 != 0) goto L_0x079f
            goto L_0x0777
        L_0x01be:
            java.lang.Object r0 = r5.A00
            X.9Rw r0 = (X.C194949Rw) r0
            java.lang.Object r3 = r5.A01
            X.9cf r3 = (X.C197959cf) r3
            r0.A00 = r3
            X.8fq r2 = X.C178378fq.A00
            java.util.Iterator r1 = X.C36361kB.A0s(r2)
        L_0x01ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.AzS r0 = (X.C22976AzS) r0
            if (r0 == 0) goto L_0x01ce
            r0.BTY(r3)
            r2.unregisterObserver(r0)
            goto L_0x01ce
        L_0x01e3:
            java.lang.Object r11 = r5.A00
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r11 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r11
            java.lang.Object r1 = r5.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.1FR r0 = r11.A0E
            if (r0 == 0) goto L_0x07cf
            X.0yC r2 = r11.A05
            if (r2 == 0) goto L_0x07ca
            X.9ui r0 = r11.A0F
            boolean r0 = X.AnonymousClass1FR.A0B(r2, r0)
            if (r0 == 0) goto L_0x001a
            X.1FR r2 = r11.A0E
            if (r2 == 0) goto L_0x07c3
            X.9ui r0 = r11.A0F
            X.8z2 r5 = r2.A0I(r0)
            X.8z2 r0 = X.C188098z2.TOS_V1
            java.lang.String r6 = "https://www.whatsapp.com/legal/privacy-policy"
            r3 = 1
            r2 = 0
            if (r5 != r0) goto L_0x023b
            X.1e1 r7 = r11.A0I
            if (r7 == 0) goto L_0x07ae
            android.content.Context r8 = r11.A1D()
            android.content.res.Resources r4 = X.C36341k9.A0G(r11)
            r0 = 2131892042(0x7f12174a, float:1.9418821E38)
            java.lang.String r9 = r4.getString(r0)
            java.lang.String r0 = "p2m-hybrid-wa-policies"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.String[] r12 = new java.lang.String[]{r6}
            java.lang.Runnable[] r10 = new java.lang.Runnable[r3]
            X.AWY r0 = X.AWY.A00
            r10[r2] = r0
            android.text.SpannableString r0 = r7.A01(r8, r9, r10, r11, r12)
        L_0x0234:
            r1.setText(r0)
            r1.setVisibility(r2)
            return
        L_0x023b:
            X.8z2 r0 = X.C188098z2.TOS_V2
            r4 = 2
            java.lang.String r9 = "https://www.whatsapp.com/legal/payments/india/psp"
            java.lang.String r8 = "https://www.whatsapp.com/legal/payments/india/terms"
            java.lang.String r10 = "payment-provider-terms"
            java.lang.String r7 = "terms"
            if (r5 != r0) goto L_0x0272
            X.1e1 r12 = r11.A0I
            if (r12 == 0) goto L_0x07b3
            android.content.Context r13 = r11.A1D()
            android.content.res.Resources r5 = X.C36341k9.A0G(r11)
            r0 = 2131892043(0x7f12174b, float:1.9418823E38)
            java.lang.String r14 = r5.getString(r0)
            java.lang.String[] r16 = new java.lang.String[]{r7, r10}
            java.lang.String[] r17 = new java.lang.String[]{r8, r9}
            java.lang.Runnable[] r15 = new java.lang.Runnable[r4]
            X.AWW r0 = X.AWW.A00
            r15[r2] = r0
            X.AWZ r0 = X.AWZ.A00
            r15[r3] = r0
        L_0x026d:
            android.text.SpannableString r0 = r12.A01(r13, r14, r15, r16, r17)
            goto L_0x0234
        L_0x0272:
            X.8z2 r0 = X.C188098z2.TOS_ALL
            if (r5 != r0) goto L_0x07bd
            X.1e1 r12 = r11.A0I
            if (r12 == 0) goto L_0x07b8
            android.content.Context r13 = r11.A1D()
            android.content.res.Resources r5 = X.C36341k9.A0G(r11)
            r0 = 2131892041(0x7f121749, float:1.941882E38)
            java.lang.String r14 = r5.getString(r0)
            java.lang.String r0 = "privacy-policy"
            java.lang.String[] r16 = new java.lang.String[]{r7, r0, r10}
            java.lang.String[] r17 = new java.lang.String[]{r8, r6, r9}
            r0 = 3
            java.lang.Runnable[] r15 = new java.lang.Runnable[r0]
            X.AWX r0 = X.AWX.A00
            r15[r2] = r0
            X.AWU r0 = X.AWU.A00
            r15[r3] = r0
            X.AWV r0 = X.AWV.A00
            r15[r4] = r0
            goto L_0x026d
        L_0x02a3:
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r3
            java.lang.Object r2 = r5.A01
            X.1A1 r1 = r3.A0e
            X.AGg r0 = r3.A06
            X.3Qa r0 = r0.A07
            X.3T1 r1 = r1.A03(r0)
            X.2bZ r1 = (X.AnonymousClass2bZ) r1
            if (r1 == 0) goto L_0x001a
            X.9uk r0 = r1.A00
            if (r0 == 0) goto L_0x001a
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x001a
            X.17Y r6 = r3.A05
            r0 = 34
            X.AVb r5 = new X.AVb
            r5.<init>(r2, r1, r0)
        L_0x02c8:
            r6.A0H(r5)
            return
        L_0x02cc:
            java.lang.Object r3 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r3
            java.lang.Object r2 = r5.A01
            X.AzW r2 = (X.C22980AzW) r2
            X.1A1 r1 = r3.A0e
            X.AGg r0 = r3.A06
            X.3Qa r0 = r0.A07
            X.3T1 r1 = r1.A03(r0)
            X.2bZ r1 = (X.AnonymousClass2bZ) r1
            if (r1 == 0) goto L_0x001a
            X.9uk r0 = r1.A00
            if (r0 == 0) goto L_0x001a
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x001a
            r2.Bby(r0, r1)
            X.0xM r0 = r3.A07
            r0.A0k(r1)
            return
        L_0x02f3:
            java.lang.Object r1 = r5.A00
            X.8j0 r1 = (X.C179068j0) r1
            java.lang.Object r0 = r5.A01
            if (r0 != 0) goto L_0x001a
            r0 = 0
            r1.A4p(r0)
            return
        L_0x0300:
            java.lang.Object r1 = r5.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.Object r0 = r5.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.01I r4 = r1.A0h()
            if (r4 == 0) goto L_0x001a
            r3 = -1
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "extra_invitee_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r4.setResult(r3, r0)
            r4.finish()
            return
        L_0x0324:
            java.lang.Object r2 = r5.A00
            com.whatsapp.notification.AndroidWear r2 = (com.whatsapp.notification.AndroidWear) r2
            java.lang.Object r0 = r5.A01
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r4 = X.C36351kA.A0j(r0)
            X.1NM r1 = r2.A04
            r0 = 7
            r1.A0B(r4, r0)
            X.1Y3 r3 = r2.A03
            r5 = 3
            r6 = 1
            r7 = 1
            r8 = 1
            r3.A02(r4, r5, r6, r7, r8)
            boolean r0 = r4 instanceof X.C28981Uw
            com.whatsapp.notification.AndroidWear.A03(r2, r0)
            return
        L_0x0345:
            java.lang.Object r0 = r5.A00
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r0 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r0
            java.lang.Object r2 = r5.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.1TF r1 = r0.A02
            X.2cW r2 = (X.AnonymousClass2cW) r2
            r0 = 0
            r1.A05(r2, r0)
            return
        L_0x0356:
            java.lang.Object r0 = r5.A00
            com.whatsapp.notification.OtpOneTapNotificationHandlerActivity r0 = (com.whatsapp.notification.OtpOneTapNotificationHandlerActivity) r0
            java.lang.Object r3 = r5.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            r2 = 0
            X.1TF r1 = r0.A02
            if (r1 == 0) goto L_0x0370
            X.2cW r3 = (X.AnonymousClass2cW) r3
            android.content.Context r0 = r0.getApplicationContext()
            X.AnonymousClass00C.A08(r0)
            r1.A04(r0, r3, r2)
            return
        L_0x0370:
            java.lang.String r0 = "otpMessageService"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0377:
            java.lang.Object r3 = r5.A00
            com.whatsapp.passkey.PasskeyCreateEducationScreen r3 = (com.whatsapp.passkey.PasskeyCreateEducationScreen) r3
            java.lang.Object r2 = r5.A01
            X.97X r2 = (X.AnonymousClass97X) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.3Dp r1 = r3.A00
            if (r1 == 0) goto L_0x0393
            X.8ob r2 = (X.C182138ob) r2
            java.lang.Object r0 = r2.A00
            X.9Vu r0 = (X.C195749Vu) r0
            X.8zD r0 = r0.A00
            r1.A00(r3, r0)
            return
        L_0x0393:
            java.lang.String r0 = "passkeyRemedyPresenter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x039a:
            java.lang.Object r1 = r5.A00
            X.AIB r1 = (X.AIB) r1
            java.lang.Object r0 = r5.A01
            X.9ky r0 = (X.C202059ky) r0
            r1.A05(r0)
            return
        L_0x03a6:
            java.lang.Object r1 = r5.A00
            X.AIB r1 = (X.AIB) r1
            java.lang.Object r0 = r5.A01
            X.9ky r0 = (X.C202059ky) r0
            r1.A06(r0)
            return
        L_0x03b2:
            java.lang.Object r1 = r5.A00
            X.AIB r1 = (X.AIB) r1
            java.lang.Object r0 = r5.A01
            X.9nx r0 = (X.C203399nx) r0
            r1.A07(r0)
            return
        L_0x03be:
            java.lang.Object r1 = r5.A00
            X.9mK r1 = (X.C202629mK) r1
            java.lang.Object r0 = r5.A01
            X.Az8 r0 = (X.C22956Az8) r0
            r0.BcW()
            X.17Y r0 = r1.A00
            r0.A02()
            return
        L_0x03cf:
            java.lang.Object r0 = r5.A00
            X.B8j r0 = (X.C23175B8j) r0
            java.lang.Object r2 = r5.A01
            X.9nx r2 = (X.C203399nx) r2
            java.lang.Object r0 = r0.A00
            X.1YH r0 = (X.AnonymousClass1YH) r0
            X.1YN r1 = r0.A06
            r0 = 0
            r1.A00(r0, r2)
            return
        L_0x03e2:
            java.lang.Object r0 = r5.A00
            X.B7J r0 = (X.B7J) r0
            java.lang.Object r5 = r5.A01
            X.1XD r5 = (X.AnonymousClass1XD) r5
            java.lang.Object r4 = r0.A00
            X.9Sd r4 = (X.C195019Sd) r4
            X.1EU r3 = r4.A01
            X.16S r0 = X.C165617ti.A0O(r3)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = r0.A08()
            java.util.Iterator r1 = r0.iterator()
        L_0x0400:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0410
            X.9un r0 = X.C165607th.A0S(r1)
            java.lang.String r0 = r0.A0A
            r2.add(r0)
            goto L_0x0400
        L_0x0410:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x042c
            java.util.Iterator r1 = r2.iterator()
        L_0x041a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x042c
            r1.next()
            X.AnonymousClass1EU.A00(r3)
            java.lang.String r0 = "PAY: removeMerchantPaymentMethod for nonSmbApp!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x041a
        L_0x042c:
            X.1Vv r0 = r4.A00
            r0.A07()
            X.8gg r0 = new X.8gg
            r0.<init>()
            r5.Bf1(r0)
            return
        L_0x043a:
            java.lang.Object r0 = r5.A00
            X.6tY r0 = (X.C145226tY) r0
            X.1Yo r0 = r0.A02
            X.1Yp r0 = r0.A0B
            r0.A01()
            return
        L_0x0446:
            java.lang.Object r0 = r5.A00
            X.6tX r0 = (X.C145216tX) r0
            java.lang.Object r1 = r5.A01
            X.0s2 r1 = (X.C17790s2) r1
            X.1Yo r0 = r0.A01
            X.C29931Yo.A01(r1, r0)
            return
        L_0x0454:
            java.lang.Object r0 = r5.A00
            X.64o r0 = (X.C1265764o) r0
            java.lang.Object r2 = r5.A01
            X.6vi r2 = (X.C146506vi) r2
            X.1D0 r1 = r0.A03
            r0 = 0
            r1.A0E(r2, r0)
            return
        L_0x0463:
            java.lang.Object r4 = r5.A00
            X.9ed r4 = (X.C199059ed) r4
            java.lang.Object r2 = r5.A01
            X.9Mf r2 = (X.C193629Mf) r2
            X.1Dc r3 = r4.A09
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onPayRequestFromNonWa; request is expired; transaction id: "
            r1.append(r0)
            java.lang.String r2 = r2.A03
            X.C165567td.A18(r3, r2, r1)
            X.1Ed r1 = r4.A03
            r0 = 0
            X.9lY r0 = X.C165587tf.A0R(r1, r0, r2)
            r1.A0W(r0)
            return
        L_0x0486:
            java.lang.Object r2 = r5.A00
            X.7jf r2 = (X.C159627jf) r2
            java.lang.Object r1 = r5.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = "client"
            java.util.Map r0 = X.C36391kE.A11(r0, r1)
            r2.BiH(r0)
            return
        L_0x049a:
            java.lang.Object r1 = r5.A00
            X.B1M r1 = (X.B1M) r1
            java.lang.Object r0 = r5.A01
            X.9fq r0 = (X.C199719fq) r0
            X.8vd r0 = r0.A00
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            r1.BfF(r0)
            return
        L_0x04ae:
            java.lang.Object r6 = r5.A00
            X.9un r6 = (X.C207249un) r6
            java.lang.Object r4 = r5.A01
            X.14r r4 = (X.C225014r) r4
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r3.<init>()
            com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment r2 = new com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "args_payment_method"
            r1.putParcelable(r0, r6)
            r2.A17(r1)
            r3.A02 = r2
            r4.Btm(r3)
            return
        L_0x04d2:
            java.lang.Object r6 = r5.A00
            X.14u r6 = (X.C225314u) r6
            java.lang.Object r4 = r5.A01
            X.9un r4 = (X.C207249un) r4
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r3.<init>()
            com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment r2 = new com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "args_payment_method"
            r1.putParcelable(r0, r4)
            r2.A17(r1)
            r3.A02 = r2
            r6.Btm(r3)
            return
        L_0x04f6:
            java.lang.Object r0 = r5.A00
            X.AGW r0 = (X.AGW) r0
            java.lang.Object r1 = r5.A01
            X.8ax r1 = (X.C175728ax) r1
            com.whatsapp.payments.ui.BrazilPaymentActivity r0 = r0.A07
            X.1EU r0 = r0.A0P
            X.16S r0 = X.C165617ti.A0O(r0)
            r0.A0H(r1)
            return
        L_0x050a:
            java.lang.Object r2 = r5.A00
            X.8i4 r2 = (X.C178888i4) r2
            java.lang.Object r1 = r5.A01
            X.9un r1 = (X.C207249un) r1
            r0 = 0
            r2.A3j(r1, r0)
            return
        L_0x0517:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x051e:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0525:
            java.lang.Object r2 = r5.A00
            X.8jA r2 = (X.C179098jA) r2
            java.lang.Object r1 = r5.A01
            X.9lY r1 = (X.C202319lY) r1
            X.9un r0 = r2.A03
            if (r0 != 0) goto L_0x053d
            r2.Bnv()
            android.content.Intent r1 = r2.A4K()
            r0 = 1
            r2.A33(r1, r0)
            return
        L_0x053d:
            X.8bF r0 = r0.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x0552
            boolean r0 = X.C175818b6.A00(r0)
            if (r0 != 0) goto L_0x0552
            r2.Bnv()
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r2.A09
            r2.A4O(r0)
            return
        L_0x0552:
            X.C179098jA.A12(r1, r2)
            return
        L_0x0556:
            java.lang.Object r6 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r6 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r6
            java.lang.Object r4 = r5.A01
            X.2bZ r4 = (X.AnonymousClass2bZ) r4
            X.AGg r3 = r6.A06
            X.9gv r2 = r3.A06
            X.8yt r1 = X.C188008yt.NONE
            r0 = 0
            X.9Oo r0 = r2.A02(r6, r0, r4, r0)
            r3.A01(r1, r0)
            return
        L_0x056d:
            java.lang.Object r2 = r5.A00
            X.AzW r2 = (X.C22980AzW) r2
            java.lang.Object r1 = r5.A01
            X.2bZ r1 = (X.AnonymousClass2bZ) r1
            X.9uk r0 = r1.A00
            X.9ui r0 = r0.A01
            r2.Bby(r0, r1)
            return
        L_0x057d:
            java.lang.Object r4 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r4 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r4
            java.lang.Object r3 = r5.A01
            X.9ua r3 = (X.C207119ua) r3
            r0 = 0
            r4.A4p(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0E
            if (r0 == 0) goto L_0x05ab
            X.0yC r1 = r4.A0D
            r0 = 1916(0x77c, float:2.685E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x05ab
            boolean r0 = X.C179148jG.A1P(r4)
            if (r0 != 0) goto L_0x05ab
            X.16X r1 = r3.A02
            r4.A09 = r1
            X.6c7 r0 = r4.A0I
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity.A0z(r1, r4, r0)
            return
        L_0x05ab:
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r2.<init>()
            X.16X r1 = r3.A02
            goto L_0x0704
        L_0x05b4:
            java.lang.Object r0 = r5.A00
            X.9ok r0 = (X.C203749ok) r0
            java.lang.Object r1 = r5.A01
            X.16X r1 = (X.AnonymousClass16X) r1
            java.lang.Object r0 = r0.A00
            X.8hw r0 = (X.C178848hw) r0
            r0.A4V(r1)
            return
        L_0x05c4:
            java.lang.Object r2 = r5.A00
            X.8hw r2 = (X.C178848hw) r2
            java.lang.Object r1 = r5.A01
            X.9lY r1 = (X.C202319lY) r1
            X.1DR r0 = r2.A0Q
            r0.A00(r1)
            r0 = 0
            X.C178848hw.A1H(r1, r2, r0)
            return
        L_0x05d6:
            java.lang.Object r2 = r5.A00
            X.8hl r2 = (X.C178838hl) r2
            java.lang.Object r1 = r5.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            X.9lR r0 = r2.A0L
            r0.A05 = r1
            r0 = 0
            r2.A47(r1, r0)
            return
        L_0x05e7:
            java.lang.Object r3 = r5.A00
            X.8jE r3 = (X.C179128jE) r3
            java.lang.Object r2 = r5.A01
            X.8az r2 = (X.C175748az) r2
            r0 = 11
            X.AnonymousClass3SJ.A00(r3, r0)
            java.lang.String r1 = r3.A0a
            r0 = 1
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r3, r2, r1, r0)
            r3.startActivity(r0)
            r3.A3v()
            r3.finish()
            return
        L_0x0605:
            java.lang.Object r1 = r5.A00
            X.B7W r1 = (X.B7W) r1
            java.lang.Object r0 = r5.A01
            X.9Oo r0 = (X.C194219Oo) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r1 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r1
            X.9ua r0 = r0.A06
            r1.BgH(r0)
            return
        L_0x0617:
            java.lang.Object r2 = r5.A00
            X.8jC r2 = (X.C179108jC) r2
            java.lang.Object r4 = r5.A01
            X.16X r4 = (X.AnonymousClass16X) r4
            X.1Ed r3 = r2.A07
            java.lang.String r0 = r2.A0o
            r1 = 0
            X.9lY r3 = X.C165587tf.A0R(r3, r1, r0)
            java.lang.String r0 = "upi_p2p_accept_collect"
            X.6Be r7 = new X.6Be
            r7.<init>(r0, r1, r1)
            java.util.HashMap r9 = X.AnonymousClass001.A0J()
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            X.9un r0 = r2.A0B
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            r5.put(r0, r1)
            java.lang.String r0 = "selected_account"
            r9.put(r0, r5)
            X.16U r6 = X.AnonymousClass16W.A05
            X.0ts r0 = r2.A00
            java.lang.String r1 = r6.B7d(r0, r4)
            java.lang.String r0 = "display_amount"
            r9.put(r0, r1)
            X.AE0 r0 = r2.A0M
            X.6c7 r0 = r0.A08()
            java.lang.Object r1 = r0.A00
            X.C18740tg.A06(r1)
            java.lang.String r0 = "sender_vpa"
            r9.put(r0, r1)
            X.AE0 r0 = r2.A0M
            java.lang.String r1 = r0.A0E()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x066d
            r1 = r0
        L_0x066d:
            java.lang.String r0 = "sender_vpa_id"
            r9.put(r0, r1)
            X.6c7 r0 = r2.A0I
            java.lang.Object r1 = r0.A00
            java.lang.String r0 = "receiver_vpa"
            r9.put(r0, r1)
            X.6c7 r0 = r2.A0G
            java.lang.Object r1 = r0.A00
            java.lang.String r0 = "receiver_name"
            r9.put(r0, r1)
            java.math.BigDecimal r0 = r4.A00
            double r4 = r0.doubleValue()
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r0
            long r0 = (long) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_value"
            r9.put(r0, r1)
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "amount_offset"
            r9.put(r0, r1)
            X.16V r6 = (X.AnonymousClass16V) r6
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "amount_currency"
            r9.put(r0, r1)
            boolean r0 = r2.A0t
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_merchant_payment"
            r9.put(r0, r1)
            java.lang.String r1 = r3.A0K
            java.lang.String r0 = "transaction_id"
            r9.put(r0, r1)
            java.lang.String r1 = r2.A0X
            java.lang.String r0 = "cl_transaction_id"
            r9.put(r0, r1)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131231033(0x7f080139, float:1.8078136E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            java.lang.String r1 = X.AnonymousClass6Y8.A0B(r0)
            java.lang.String r0 = "receiver_icon"
            r9.put(r0, r1)
            X.004 r0 = r2.A0j
            java.lang.Object r4 = r0.get()
            X.627 r4 = (X.AnonymousClass627) r4
            r0 = 7
            X.BAa r5 = new X.BAa
            r5.<init>(r2, r0)
            r0 = 3
            X.9oK r6 = new X.9oK
            r6.<init>(r2, r0)
            java.lang.String r8 = "new_payment"
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x06f2:
            java.lang.Object r4 = r5.A00
            X.8hw r4 = (X.C178848hw) r4
            java.lang.Object r0 = r5.A01
            X.9ua r0 = (X.C207119ua) r0
            r4.Bnv()
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r2.<init>()
            X.16X r1 = r0.A02
        L_0x0704:
            r0 = 0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A4L(r1, r0, r2)
            r2.A02 = r0
            r4.Btm(r2)
            r4.A4U(r2)
            return
        L_0x0712:
            java.lang.Object r0 = r5.A00
            X.2i0 r0 = (X.C48762i0) r0
            java.lang.Object r10 = r5.A01
            X.9un r10 = (X.C207249un) r10
            java.lang.Object r8 = r0.A00
            X.8hM r8 = (X.C178788hM) r8
            java.lang.String r7 = "p2p"
            goto L_0x072f
        L_0x0721:
            java.lang.Object r0 = r5.A00
            X.2i0 r0 = (X.C48762i0) r0
            java.lang.Object r10 = r5.A01
            X.9un r10 = (X.C207249un) r10
            java.lang.Object r8 = r0.A00
            X.8hM r8 = (X.C178788hM) r8
            java.lang.String r7 = "p2m"
        L_0x072f:
            X.8i4 r9 = r8.A04
            r2 = 2131887563(0x7f1205cb, float:1.9409737E38)
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.9g7 r5 = r8.A0B
            X.9un r0 = r9.A04
            r4 = 0
            X.AnonymousClass00C.A0D(r0, r4)
            java.lang.String r0 = r5.A02(r0, r6)
            java.lang.String r0 = X.C36391kE.A0v(r9, r0, r1, r4, r2)
            X.1qm r3 = X.AnonymousClass3LW.A00(r9)
            r3.A0q(r0)
            if (r10 == 0) goto L_0x0760
            r2 = 2131887562(0x7f1205ca, float:1.9409735E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r5.A02(r10, r6)
            java.lang.String r0 = X.C36391kE.A0v(r9, r0, r1, r4, r2)
            r3.A0Z(r0)
        L_0x0760:
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            X.B8E r0 = new X.B8E
            r0.<init>(r4, r7, r8)
            r3.setPositiveButton(r1, r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.9pQ r0 = X.C204079pQ.A00
            r3.setNegativeButton(r1, r0)
            X.C36341k9.A11(r3)
            return
        L_0x0777:
            android.content.Context r2 = r1.A00     // Catch:{ RuntimeException -> 0x0791 }
            X.9FB r1 = new X.9FB     // Catch:{ RuntimeException -> 0x0791 }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0791 }
            X.9cf r0 = X.C197959cf.A04     // Catch:{ RuntimeException -> 0x0791 }
            if (r0 != 0) goto L_0x078a
            X.9cf r0 = new X.9cf     // Catch:{ RuntimeException -> 0x0791 }
            r0.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x0791 }
            X.C197959cf.A04 = r0     // Catch:{ RuntimeException -> 0x0791 }
            return
        L_0x078a:
            java.lang.String r0 = "Service already initiated"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)     // Catch:{ RuntimeException -> 0x0791 }
            throw r0     // Catch:{ RuntimeException -> 0x0791 }
        L_0x0791:
            X.0wN r3 = r3.A02
            r2 = 1
            java.lang.String r1 = "payments/indiaupi"
            java.lang.String r0 = "CLServices already initialized"
            r3.A0E(r1, r0, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x079f:
            android.os.Handler r2 = X.C36341k9.A0H()
            r1 = 13
            X.AVX r0 = new X.AVX
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        L_0x07ae:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x07b3:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x07b8:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x07bd:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x07c3:
            java.lang.String r0 = "paymentsUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07ca:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x07cf:
            java.lang.String r0 = "paymentsUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVb.run():void");
    }
}
