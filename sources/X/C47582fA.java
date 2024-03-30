package X;

/* renamed from: X.2fA  reason: invalid class name and case insensitive filesystem */
public abstract class C47582fA extends C47592fB {
    public C133136Wx A00;
    public AnonymousClass3LJ A01;
    public final AnonymousClass1X4 A02;
    public final AnonymousClass1RY A03;
    public final AnonymousClass1Y4 A04;
    public final AnonymousClass3T1 A05;
    public final C65553Sn A06;
    public final AnonymousClass3BQ A07;
    public final AnonymousClass1DW A08;
    public final AnonymousClass1AW A09;
    public final AnonymousClass1EO A0A;
    public final C33541fX A0B;
    public final C33541fX A0C = new C48772i1(this, 11);
    public final C33541fX A0D;
    public final C29731Xt A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47582fA(X.C24791Du r27, X.C24801Dv r28, X.AnonymousClass17Y r29, X.AnonymousClass1XY r30, X.AnonymousClass1X4 r31, X.AnonymousClass1RY r32, X.C21060yb r33, X.C19970wo r34, X.C18820ts r35, X.C20310xM r36, X.C32731e6 r37, X.AnonymousClass1QO r38, X.AnonymousClass16E r39, X.AnonymousClass1DW r40, X.C20810yC r41, X.AnonymousClass2XH r42, X.AnonymousClass1Y4 r43, X.AnonymousClass1SU r44, X.AnonymousClass3T1 r45, X.AnonymousClass1AW r46, X.AnonymousClass1EO r47, X.AnonymousClass1CR r48, X.C29731Xt r49, X.C65553Sn r50, X.AnonymousClass3BQ r51, X.AnonymousClass3JQ r52, X.AnonymousClass1A1 r53, X.AnonymousClass1X7 r54, X.C19770wU r55, X.C65813To r56) {
        /*
            r26 = this;
            r2 = r26
            r24 = r55
            r4 = r28
            r5 = r29
            r7 = r31
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r6 = r30
            r25 = r56
            r3 = r27
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r44
            r19 = r48
            r0 = r49
            r21 = r52
            r22 = r53
            r23 = r54
            r20 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.A02 = r7
            r2.A08 = r15
            r2.A0E = r0
            r0 = r50
            r2.A06 = r0
            r0 = r43
            r2.A04 = r0
            r0 = r51
            r2.A07 = r0
            r0 = r32
            r2.A03 = r0
            r0 = r45
            r2.A05 = r0
            r0 = r46
            r2.A09 = r0
            r0 = r47
            r2.A0A = r0
            r1 = 30
            X.2iF r0 = new X.2iF
            r0.<init>(r5, r2, r1)
            r2.A0B = r0
            r1 = 31
            X.2iF r0 = new X.2iF
            r0.<init>(r6, r2, r1)
            r2.A0D = r0
            r1 = 11
            X.2i1 r0 = new X.2i1
            r0.<init>(r2, r1)
            r2.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47582fA.<init>(X.1Du, X.1Dv, X.17Y, X.1XY, X.1X4, X.1RY, X.0yb, X.0wo, X.0ts, X.0xM, X.1e6, X.1QO, X.16E, X.1DW, X.0yC, X.2XH, X.1Y4, X.1SU, X.3T1, X.1AW, X.1EO, X.1CR, X.1Xt, X.3Sn, X.3BQ, X.3JQ, X.1A1, X.1X7, X.0wU, X.3To):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if (java.lang.Integer.valueOf(r21) != null) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(int r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r4 = r27
            r11 = r28
            super.A0M(r4, r11)
            X.1Xt r3 = r0.A0E
            X.3T1 r6 = r0.A05
            X.1DW r2 = r0.A08
            X.1AW r1 = r0.A09
            X.1EO r0 = r0.A0A
            int r14 = X.C55802vD.A00(r2, r6, r1, r0)
            r20 = 5
            switch(r27) {
                case 1: goto L_0x015a;
                case 2: goto L_0x015e;
                case 3: goto L_0x0162;
                case 4: goto L_0x0166;
                case 5: goto L_0x001c;
                case 6: goto L_0x016a;
                default: goto L_0x001c;
            }
        L_0x001c:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.3Rn r2 = r3.A01
            if (r2 == 0) goto L_0x003c
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass3MO.A00(r6)
            if (r15 == 0) goto L_0x003c
            int r7 = r2.A01
            if (r7 >= 0) goto L_0x0047
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unexpected status: "
            r1.append(r0)
            X.3Qa r0 = r6.A1J
            X.C36351kA.A1L(r0, r1)
        L_0x003c:
            X.3Ao r1 = r3.A00
            if (r1 == 0) goto L_0x0046
            int r0 = r1.A03
            int r0 = r0 + 1
            r1.A03 = r0
        L_0x0046:
            return
        L_0x0047:
            java.util.Map r9 = r2.A0B
            java.lang.Object r8 = r9.get(r15)
            X.3An r8 = (X.C61093An) r8
            if (r8 != 0) goto L_0x014b
            long r4 = r2.A02
            long r0 = r2.A03
            java.lang.Integer r8 = r2.A05
            if (r8 == 0) goto L_0x0145
            int r18 = r8.intValue()
        L_0x005d:
            java.util.List r8 = r2.A09
            java.util.Iterator r12 = r8.iterator()
        L_0x0063:
            boolean r8 = r12.hasNext()
            r13 = 0
            if (r8 == 0) goto L_0x0142
            java.lang.Object r10 = r12.next()
            r8 = r10
            X.3Sz r8 = (X.C65663Sz) r8
            com.whatsapp.jid.UserJid r8 = r8.A09
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x0063
        L_0x0079:
            X.3Sz r10 = (X.C65663Sz) r10
            if (r10 != 0) goto L_0x013d
            java.util.List r8 = r2.A08
            java.util.Iterator r12 = r8.iterator()
        L_0x0083:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x013a
            java.lang.Object r10 = r12.next()
            r8 = r10
            X.3Sz r8 = (X.C65663Sz) r8
            com.whatsapp.jid.UserJid r8 = r8.A09
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x0083
        L_0x0098:
            X.3Sz r10 = (X.C65663Sz) r10
            if (r10 != 0) goto L_0x013d
            java.util.List r8 = r2.A07
            java.util.Iterator r12 = r8.iterator()
        L_0x00a2:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x0137
            java.lang.Object r10 = r12.next()
            r8 = r10
            X.3Sz r8 = (X.C65663Sz) r8
            com.whatsapp.jid.UserJid r8 = r8.A09
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x00a2
        L_0x00b7:
            X.3Sz r10 = (X.C65663Sz) r10
            if (r10 == 0) goto L_0x0134
            int r21 = r10.A03()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            if (r8 == 0) goto L_0x0134
        L_0x00c5:
            java.util.Map r8 = r2.A0A
            java.lang.String r17 = X.AnonymousClass3MO.A01(r8)
            X.3An r8 = new X.3An
            r22 = r4
            r24 = r0
            r19 = r7
            r16 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            r9.put(r15, r8)
        L_0x00db:
            java.util.Map r10 = r8.A08
            X.3Qa r9 = r6.A1J
            java.lang.Object r8 = r10.get(r9)
            X.3OI r8 = (X.AnonymousClass3OI) r8
            if (r8 != 0) goto L_0x0123
            java.lang.String r8 = r9.A01
            long r4 = r2.A03
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x011e
            int r18 = r0.intValue()
        L_0x00f3:
            boolean r0 = X.C65303Rn.A01(r6, r2)
            long r0 = (long) r0
            r12 = 262144(0x40000, float:3.67342E-40)
            int r6 = r6.A0A
            r6 = r6 & r12
            boolean r25 = X.AnonymousClass000.A1S(r6, r12)
            X.AnonymousClass00C.A0B(r8)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            X.3OI r14 = new X.3OI
            r22 = r0
            r24 = r11
            r17 = r8
            r19 = r7
            r20 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r24, r25)
            r10.put(r9, r14)
        L_0x011a:
            r2.A00 = r15
            goto L_0x003c
        L_0x011e:
            int r18 = X.C65303Rn.A00(r15, r2)
            goto L_0x00f3
        L_0x0123:
            int r0 = r8.A03
            int r0 = r0 + 1
            r8.A03 = r0
            long r4 = r8.A05
            boolean r0 = X.C65303Rn.A01(r6, r2)
            long r0 = (long) r0
            long r4 = r4 + r0
            r8.A05 = r4
            goto L_0x011a
        L_0x0134:
            r21 = 0
            goto L_0x00c5
        L_0x0137:
            r10 = r13
            goto L_0x00b7
        L_0x013a:
            r10 = r13
            goto L_0x0098
        L_0x013d:
            int r21 = r10.A03()
            goto L_0x00c5
        L_0x0142:
            r10 = r13
            goto L_0x0079
        L_0x0145:
            int r18 = X.C65303Rn.A00(r15, r2)
            goto L_0x005d
        L_0x014b:
            com.whatsapp.jid.UserJid r0 = r2.A00
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00db
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            goto L_0x00db
        L_0x015a:
            r20 = 1
            goto L_0x001c
        L_0x015e:
            r20 = 2
            goto L_0x001c
        L_0x0162:
            r20 = 3
            goto L_0x001c
        L_0x0166:
            r20 = 4
            goto L_0x001c
        L_0x016a:
            r20 = 6
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47582fA.A0M(int, boolean):void");
    }

    public void A06() {
        super.A06();
        C65553Sn r2 = this.A06;
        AnonymousClass3T1 r1 = this.A05;
        AnonymousClass00C.A0D(r1, 0);
        if (r1 instanceof AnonymousClass2bU) {
            r2.A05.remove(r1);
        }
    }

    public void A0I() {
        super.A0I();
        AnonymousClass3T1 r1 = this.A05;
        if (r1 instanceof AnonymousClass2bU) {
            C81203wd.A02(this.A0N, AnonymousClass2bU.A00((AnonymousClass2bU) r1), this, 13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r6 == 0) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r11 = this;
            X.3BK r3 = r11.A0E()
            X.AnonymousClass00C.A08(r3)
            X.1SU r1 = r11.A0a
            X.AnonymousClass00C.A07(r1)
            X.3T1 r6 = r11.A05
            X.0yC r0 = r11.A0G
            boolean r0 = X.AnonymousClass3MP.A01(r0, r1, r6)
            r2 = 8
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r6.A1P
            if (r0 != 0) goto L_0x00bc
            X.2bU r6 = (X.AnonymousClass2bU) r6
            X.3Qj r9 = X.AnonymousClass2bU.A00(r6)
            boolean r0 = r9.A0f
            r5 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0064
            android.view.View r0 = r3.A02
            r0.setVisibility(r4)
            android.view.View r0 = r3.A02
            r0.setBackground(r5)
            com.whatsapp.CircularProgressBar r10 = r3.A07
            long r0 = r9.A0E
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0043
            r7 = 100
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            r10.setIndeterminate(r0)
            com.whatsapp.CircularProgressBar r7 = r3.A07
            long r0 = r9.A0E
            int r6 = (int) r0
            r7.setProgress(r6)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setOnClickListener(r5)
            android.widget.TextView r0 = r3.A05
            r0.setVisibility(r2)
        L_0x005e:
            android.view.View r0 = r3.A00
        L_0x0060:
            r0.setVisibility(r2)
            return
        L_0x0064:
            int r1 = r9.A09
            r0 = 1
            if (r1 != r0) goto L_0x0084
            android.view.View r0 = r3.A02
            r0.setVisibility(r2)
            int r5 = r6.A1I
            android.widget.TextView r2 = r3.A06
            r1 = 2
            r0 = 2131889808(0x7f120e90, float:1.941429E38)
            if (r5 != r1) goto L_0x007b
            r0 = 2131889807(0x7f120e8f, float:1.9414288E38)
        L_0x007b:
            r2.setText(r0)
            android.widget.TextView r0 = r3.A06
            r0.setVisibility(r4)
            return
        L_0x0084:
            boolean r0 = r9.A0V
            if (r0 != 0) goto L_0x00bc
            android.view.View r1 = r3.A02
            r0 = 2131231453(0x7f0802dd, float:1.8078987E38)
            r1.setBackgroundResource(r0)
            android.view.View r0 = r3.A02
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setVisibility(r2)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setOnClickListener(r5)
            android.widget.TextView r0 = r3.A05
            r0.setVisibility(r4)
            android.widget.TextView r1 = r3.A05
            r0 = 2131887288(0x7f1204b8, float:1.9409179E38)
            r1.setText(r0)
            android.widget.TextView r1 = r3.A05
            r0 = 2131231152(0x7f0801b0, float:1.8078377E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            android.widget.TextView r1 = r3.A05
            X.1fX r0 = r11.A0B
            r1.setOnClickListener(r0)
            goto L_0x005e
        L_0x00bc:
            android.view.View r0 = r3.A02
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47582fA.A0J():void");
    }

    public void A0L(int i) {
        C61093An r0;
        AnonymousClass3OI r2;
        C47532ev r6;
        C61093An r02;
        AnonymousClass3OI r4;
        C61093An r03;
        AnonymousClass3OI r42;
        C65013Qj r04;
        super.A0L(i);
        AnonymousClass3T1 r3 = this.A05;
        C64933Qa r22 = r3.A1J;
        int i2 = 1;
        if (!r22.A02 && (!A0D().A0J() || !this.A04)) {
            if (!(r3 instanceof AnonymousClass2bU) || (r04 = ((AnonymousClass2bU) r3).A01) == null || !r04.A0f) {
                if (!this.A0G.A0E(2086)) {
                    i2 = 3;
                } else {
                    C133136Wx r05 = this.A00;
                    if (r05 != null) {
                        i2 = 3;
                        switch (r05.A01) {
                            case -1:
                                i2 = 23;
                                break;
                            case 0:
                            case 14:
                            case 34:
                                i2 = 1;
                                break;
                            case 1:
                                break;
                            case 2:
                                i2 = 5;
                                break;
                            case 3:
                                i2 = 6;
                                break;
                            case 4:
                                i2 = 7;
                                break;
                            case 5:
                                i2 = 8;
                                break;
                            case 6:
                                i2 = 9;
                                break;
                            case 7:
                            case 32:
                                i2 = 10;
                                break;
                            case 8:
                                i2 = 11;
                                break;
                            case 9:
                                i2 = 12;
                                break;
                            case 11:
                                i2 = 13;
                                break;
                            case 12:
                                i2 = 14;
                                break;
                            case 13:
                            case 24:
                                break;
                            case 15:
                                i2 = 17;
                                break;
                            case 16:
                                i2 = 18;
                                break;
                            case 17:
                                i2 = 19;
                                break;
                            case 18:
                            case 25:
                                i2 = 20;
                                break;
                            case 19:
                                i2 = 21;
                                break;
                            case 20:
                                i2 = 22;
                                break;
                            case 21:
                                i2 = 24;
                                break;
                            case 22:
                                i2 = 25;
                                break;
                            case 23:
                                i2 = 26;
                                break;
                        }
                    }
                    i2 = 4;
                }
            }
            i2 = 2;
        }
        C224214g r8 = this.A0L;
        r8.A00();
        C224214g r7 = this.A09;
        r7.A00();
        this.A0M.A00();
        A0D().A0A();
        AnonymousClass3LJ A0D2 = A0D();
        if ((A0D2 instanceof C47532ev) && (r6 = (C47532ev) A0D2) != null) {
            Integer num = r6.A03;
            if (num != null) {
                int intValue = num.intValue();
                C65303Rn r06 = this.A0E.A01;
                if (!(r06 == null || (r03 = (C61093An) r06.A0B.get(AnonymousClass3MO.A00(r3))) == null || (r42 = (AnonymousClass3OI) r03.A08.get(r22)) == null)) {
                    r42.A0G = Integer.valueOf(intValue);
                }
            }
            Integer num2 = r6.A02;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                C65303Rn r07 = this.A0E.A01;
                if (!(r07 == null || (r02 = (C61093An) r07.A0B.get(AnonymousClass3MO.A00(r3))) == null || (r4 = (AnonymousClass3OI) r02.A08.get(r22)) == null)) {
                    r4.A0F = Integer.valueOf(intValue2);
                }
            }
        }
        C29731Xt r62 = this.A0E;
        long A0A2 = A0D().A0A();
        long A002 = r8.A00();
        long A003 = r7.A00();
        C65303Rn r08 = r62.A01;
        if (r08 != null && (r0 = (C61093An) r08.A0B.get(AnonymousClass3MO.A00(r3))) != null && (r2 = (AnonymousClass3OI) r0.A08.get(r22)) != null) {
            r2.A04 = i2;
            r2.A06 = A0A2;
            r2.A07 += A002;
            r2.A08 += A003;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r5 == 100) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r11 = this;
            X.3BK r3 = r11.A0E()
            X.AnonymousClass00C.A08(r3)
            X.3T1 r1 = r11.A05
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            r5 = 0
            if (r0 == 0) goto L_0x00a3
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r10 = r1.A01
        L_0x0012:
            r2 = 8
            r4 = 0
            if (r10 == 0) goto L_0x0090
            boolean r0 = r10.A0V
            if (r0 != 0) goto L_0x0090
            boolean r0 = r10.A0f
            if (r0 == 0) goto L_0x005d
            android.view.View r0 = r3.A02
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r9 = r3.A07
            long r5 = r10.A0E
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            r7 = 100
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r9.setIndeterminate(r0)
            com.whatsapp.CircularProgressBar r1 = r3.A07
            long r5 = r10.A0E
            int r0 = (int) r5
            r1.setProgress(r0)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setVisibility(r4)
            android.widget.TextView r0 = r3.A05
            r0.setVisibility(r2)
            android.view.View r0 = r3.A00
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r1 = r3.A07
            X.1fX r0 = r11.A0C
            r1.setOnClickListener(r0)
        L_0x0057:
            android.view.ViewGroup r0 = r3.A0D
            r0.setVisibility(r2)
        L_0x005c:
            return
        L_0x005d:
            android.view.View r1 = r3.A02
            r0 = 2131231453(0x7f0802dd, float:1.8078987E38)
            r1.setBackgroundResource(r0)
            android.view.View r0 = r3.A02
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setVisibility(r2)
            com.whatsapp.CircularProgressBar r0 = r3.A07
            r0.setOnClickListener(r5)
            android.widget.TextView r1 = r3.A05
            r1.setVisibility(r4)
            r0 = 2131893722(0x7f121dda, float:1.9422229E38)
            r1.setText(r0)
            r0 = 2131231204(0x7f0801e4, float:1.8078482E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            X.1fX r0 = r11.A0D
            r1.setOnClickListener(r0)
            android.view.View r0 = r3.A00
            r0.setVisibility(r2)
            goto L_0x0057
        L_0x0090:
            android.view.View r0 = r3.A02
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r3.A0D
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L_0x005c
            android.view.ViewGroup r0 = r3.A0D
            r0.setVisibility(r4)
            return
        L_0x00a3:
            r10 = r5
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47582fA.A0R():void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append(" for ");
        AnonymousClass3T1 r2 = this.A05;
        A0u.append(r2.A1J);
        A0u.append(' ');
        A0u.append(r2.A0J());
        A0u.append(' ');
        return C36381kD.A10(A0u, r2.A1I);
    }
}
