package X;

/* renamed from: X.1ic  reason: invalid class name and case insensitive filesystem */
public class C35391ic implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C35391ic(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ae, code lost:
        if (r1.A1G() == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r0 = r29
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x03c4;
                case 1: goto L_0x0086;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x0369;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A01
            X.1cI r6 = (X.C31731cI) r6
            java.lang.Object r8 = r0.A02
            X.9uj r8 = (X.C207209uj) r8
            java.lang.Object r5 = r0.A03
            X.630 r5 = (X.AnonymousClass630) r5
            int r9 = r0.A00
            java.lang.Object r2 = r0.A04
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "axolotl received a location notification; jid="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6EZ r3 = X.C133256Xm.A02(r2)
            X.AAB r1 = new X.AAB
            r1.<init>(r3, r6, r8)
            int r2 = r5.A00
            if (r2 != 0) goto L_0x007a
            X.189 r4 = r6.A03
            byte[] r0 = r5.A02
            X.6Nt r3 = r4.A06(r1, r3, r0)
        L_0x004a:
            int r2 = r3.A00
            if (r2 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "axolotl error; status="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0062:
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x0079
            X.18l r0 = r4.A07
            int r7 = r0.A03()
            X.17Y r0 = r6.A00
            r10 = 7
            X.1iQ r5 = new X.1iQ
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A0H(r5)
        L_0x0079:
            return
        L_0x007a:
            r0 = 1
            if (r2 != r0) goto L_0x03a7
            X.189 r4 = r6.A03
            byte[] r0 = r5.A02
            X.6Nt r3 = r4.A07(r1, r3, r0)
            goto L_0x004a
        L_0x0086:
            java.lang.Object r2 = r0.A01
            X.1NM r2 = (X.AnonymousClass1NM) r2
            java.lang.Object r7 = r0.A02
            X.3Qa r7 = (X.C64933Qa) r7
            java.lang.Object r6 = r0.A03
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.Object r5 = r0.A04
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            int r4 = r0.A00
            r2.A07()
            X.1A1 r0 = r2.A0P
            X.3T1 r1 = r0.A03(r7)
            boolean r3 = r7.A02
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            if (r1 == 0) goto L_0x00b0
            boolean r0 = r1.A1G()
            r14 = 1
            if (r0 != 0) goto L_0x00b1
        L_0x00b0:
            r14 = 0
        L_0x00b1:
            boolean r15 = X.AnonymousClass1NM.A06(r2, r1, r7)
            r8 = r2
            r9 = r6
            r10 = r5
            r11 = r7
            r13 = r3
            X.AnonymousClass1NM.A04(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x02e0
            X.1Hr r8 = r2.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.16D r0 = r8.A04
            X.141 r0 = r0.A08(r6)
            X.1Hs r7 = r8.A01
            int r3 = r1.A1I
            java.lang.String r11 = X.C25801Hs.A01(r3)
            if (r0 == 0) goto L_0x02e0
            X.3Qa r4 = r1.A1J
            boolean r3 = r4.A02
            if (r3 != 0) goto L_0x02e0
            r3 = 0
            X.AnonymousClass00C.A0D(r11, r3)
            X.0wQ r3 = r7.A00
            boolean r3 = r3.A0L()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x02e0
            r9 = 0
            X.0yC r5 = r7.A03
            r3 = 7224(0x1c38, float:1.0123E-41)
            java.lang.String r5 = r5.A09(r3)
            X.AnonymousClass00C.A08(r5)
            boolean r3 = X.AnonymousClass14B.A0F(r5)
            if (r3 != 0) goto L_0x0101
            boolean r3 = X.AnonymousClass099.A0O(r5, r11, r9)
            if (r3 != 0) goto L_0x02e0
        L_0x0101:
            int r25 = X.C25801Hs.A00(r0)
            r5 = 1
            r3 = r25
            if (r3 == r5) goto L_0x02e0
            java.lang.Integer r24 = r7.A05(r1)
            boolean r3 = r1 instanceof X.C88854Uh
            if (r3 == 0) goto L_0x0366
            r3 = r1
            X.4Uh r3 = (X.C88854Uh) r3
            X.3F4 r3 = r3.BIE()
            X.AnonymousClass00C.A08(r3)
            java.lang.String r13 = r3.A01
        L_0x011e:
            r3 = 4194304(0x400000, float:5.877472E-39)
            boolean r3 = r1.A1T(r3)
            if (r3 == 0) goto L_0x0128
            java.lang.String r13 = "MARKETING_MESSAGE_SMB"
        L_0x0128:
            java.lang.String r23 = X.C25801Hs.A02(r1)
            X.1CR r5 = r8.A0C
            java.lang.String r3 = r6.getRawString()
            X.3LI r3 = X.AnonymousClass1CR.A02(r5, r3)
            boolean r22 = r3.A0A()
            X.12q r3 = r7.A01
            boolean r3 = r3.A0N(r6)
            r17 = 1
            if (r3 == 0) goto L_0x0146
            r17 = 2
        L_0x0146:
            X.0v0 r3 = r8.A06
            boolean r3 = r3.A2G()
            r21 = r3 ^ 1
            X.1Fq r3 = r8.A05
            X.03c r3 = r3.A00
            boolean r20 = r3.A01()
            X.3T1 r9 = r7.A04(r6)
            X.3L0 r3 = r0.A0E
            r19 = 1
            if (r3 == 0) goto L_0x0362
            int r5 = r3.A01
            r3 = 2
            if (r5 != r3) goto L_0x0362
        L_0x0165:
            X.3Hb r3 = r1.A0Q()
            r5 = 0
            if (r3 == 0) goto L_0x035e
            boolean r3 = r3.A00
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r3)
        L_0x0172:
            X.1C5 r3 = r8.A0B
            boolean r16 = r3.A04(r6)
            X.0yC r12 = r8.A09
            r3 = 6735(0x1a4f, float:9.438E-42)
            X.0yV r10 = X.C21000yV.A02
            boolean r3 = X.C20800yB.A01(r10, r12, r3)
            if (r3 == 0) goto L_0x0195
            X.1Ht r5 = r8.A0A
            java.lang.String r4 = r4.A01
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            byte[] r3 = r5.A05(r3)
            java.lang.String r5 = X.AnonymousClass17V.A00(r3, r4)
        L_0x0195:
            r3 = 7799(0x1e77, float:1.0929E-41)
            boolean r3 = X.C20800yB.A01(r10, r12, r3)
            if (r3 == 0) goto L_0x01da
            X.30W r3 = r8.A00
            java.lang.String r10 = "biz_messaging_counters"
            X.0wg r15 = r3.A00
            java.lang.String r14 = "biz_integrity_logger"
            android.content.SharedPreferences r4 = r15.A00(r14)
            X.AnonymousClass00C.A08(r4)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r4.getString(r10, r3)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r3)
            java.lang.String r4 = "key"
            r3 = 1
            r12.put(r4, r3)
            android.content.SharedPreferences r3 = r15.A00(r14)
            X.AnonymousClass00C.A08(r3)
            android.content.SharedPreferences$Editor r4 = r3.edit()
            java.lang.String r3 = r12.toString()
            android.content.SharedPreferences$Editor r3 = r4.putString(r10, r3)
            r3.apply()
        L_0x01da:
            X.1IP r3 = r8.A03
            r28 = r3
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            java.lang.Long r9 = r7.A06(r9)
            X.17i r3 = r8.A08
            X.0y7 r3 = r3.A02()
            int r3 = r3.size()
            long r3 = (long) r3
            r26 = r3
            java.lang.String r10 = r7.A07(r0)
            X.2Sz r3 = new X.2Sz
            r3.<init>()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r22)
            r3.A03 = r15
            r4 = r24
            r3.A08 = r4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r25)
            r3.A07 = r12
            r3.A0D = r11
            r4 = r17
            r3.A06 = r4
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r21)
            r3.A02 = r14
            r3.A0F = r10
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r16)
            r3.A05 = r11
            java.lang.Long r4 = java.lang.Long.valueOf(r26)
            r3.A09 = r4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r20)
            r3.A04 = r10
            r3.A0A = r9
            r3.A0E = r13
            r4 = r23
            r3.A0B = r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r19)
            r3.A01 = r9
            r4 = r18
            r3.A00 = r4
            r3.A0C = r5
            r4 = r28
            X.1Hs r4 = r4.A00
            X.0yW r4 = r4.A04
            r4.Bly(r3)
            X.1IQ r5 = r8.A02
            java.lang.String r16 = r7.A08(r1)
            java.lang.Long r0 = X.C65143Qx.A02(r0)
            X.3T1 r3 = r7.A04(r6)
            if (r3 == 0) goto L_0x035b
            long r3 = r3.A0I
            r19 = r3
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
        L_0x0261:
            X.1Hs r7 = r5.A00
            r3 = r25
            boolean r3 = r7.A0B(r1, r3)
            if (r3 == 0) goto L_0x02b3
            X.2St r5 = new X.2St
            r5.<init>()
            r3 = r17
            r5.A06 = r3
            r5.A0B = r4
            r5.A02 = r14
            r5.A03 = r15
            r5.A0A = r0
            r0 = r16
            r5.A0F = r0
            r5.A04 = r10
            r0 = r24
            r5.A08 = r0
            r5.A05 = r11
            r5.A0E = r13
            r0 = r23
            r5.A0D = r0
            r5.A07 = r12
            r5.A01 = r9
            r0 = r18
            r5.A00 = r0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r1.A0I
            long r3 = r9.toSeconds(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A09 = r0
            long r3 = r1.A0G
            long r3 = r9.toSeconds(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A0C = r0
            r7.A09(r5, r1)
        L_0x02b3:
            r5 = 0
            if (r24 == 0) goto L_0x02c7
            int r3 = r24.intValue()
            if (r3 == 0) goto L_0x0357
            r0 = 1
            if (r3 == r0) goto L_0x0353
            r0 = 2
            if (r3 == r0) goto L_0x034f
            r0 = 3
            if (r3 != r0) goto L_0x02c7
            java.lang.String r5 = "otp_qbm"
        L_0x02c7:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C222813r.A00(r6)
            if (r5 == 0) goto L_0x02e0
            if (r4 == 0) goto L_0x02e0
            X.1Hx r3 = r8.A07
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "whatsapp"
            r3.A02(r4, r5, r6, r7, r9)
        L_0x02e0:
            X.1NU r0 = r2.A06
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0079
            X.1NP r2 = r2.A04
            if (r1 == 0) goto L_0x034d
            com.whatsapp.jid.UserJid r3 = r1.A0L()
        L_0x02f0:
            boolean r0 = r1 instanceof X.C88854Uh
            if (r0 == 0) goto L_0x0079
            X.4Uh r1 = (X.C88854Uh) r1
            X.3F4 r0 = r1.BIE()
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "MARKETING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0079
            X.1NS r2 = r2.A01
            X.0wg r1 = r2.A00
            java.lang.String r0 = "marketing_opt_out"
            android.content.SharedPreferences r4 = r1.A00(r0)
            X.AnonymousClass00C.A08(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "jids_receiving_marketing_message"
            r1.append(r0)
            java.lang.String r0 = r3.getRawString()
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.AnonymousClass00C.A08(r3)
            org.json.JSONObject r2 = r2.A00(r3)
            java.lang.String r1 = "marketing_msg_received"
            boolean r0 = r2.optBoolean(r1)
            if (r0 != 0) goto L_0x0079
            r0 = 1
            r2.put(r1, r0)
            android.content.SharedPreferences$Editor r1 = r4.edit()
            java.lang.String r0 = r2.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)
            r0.apply()
            return
        L_0x034d:
            r3 = 0
            goto L_0x02f0
        L_0x034f:
            java.lang.String r5 = "promotional_qbm"
            goto L_0x02c7
        L_0x0353:
            java.lang.String r5 = "transactional_qbm"
            goto L_0x02c7
        L_0x0357:
            java.lang.String r5 = "other_qbm"
            goto L_0x02c7
        L_0x035b:
            r4 = 0
            goto L_0x0261
        L_0x035e:
            r18 = r5
            goto L_0x0172
        L_0x0362:
            r19 = 0
            goto L_0x0165
        L_0x0366:
            r13 = 0
            goto L_0x011e
        L_0x0369:
            java.lang.Object r4 = r0.A01
            X.1a4 r4 = (X.C30351a4) r4
            java.lang.Object r6 = r0.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            java.lang.Object r2 = r0.A04
            X.11F r2 = (X.AnonymousClass11F) r2
            int r7 = r0.A00
            X.12P r0 = r4.A07
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0079
            boolean r0 = X.AnonymousClass143.A0I(r6)
            if (r0 == 0) goto L_0x0394
            if (r3 == 0) goto L_0x0394
            X.12O r1 = r4.A08
            r0 = r6
            X.13w r0 = (X.C223313w) r0
            r1.A0H(r0, r3)
        L_0x0394:
            X.17e r0 = r4.A0D
            X.11F r5 = r0.BQG(r2)
            X.17Y r0 = r4.A01
            r8 = 12
            X.1iX r3 = new X.1iX
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0H(r3)
            return
        L_0x03a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "axolotl unrecognized ciphertext type; stanzaKey="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x03c4:
            java.lang.Object r7 = r0.A01
            X.1XX r7 = (X.AnonymousClass1XX) r7
            java.lang.Object r6 = r0.A02
            X.2bU r6 = (X.AnonymousClass2bU) r6
            int r5 = r0.A00
            java.lang.Object r4 = r0.A03
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r0.A04
            X.3Qj r3 = (X.C65013Qj) r3
            r2 = 0
            r1 = 1
            if (r5 == r1) goto L_0x03e9
            r0 = 2
            if (r5 == r0) goto L_0x03e9
            boolean r0 = r6 instanceof X.C46882bp
            if (r0 != 0) goto L_0x03e9
            boolean r0 = r6 instanceof X.C46812bi
            if (r0 == 0) goto L_0x03ea
            int r0 = r6.A09
            if (r0 != r1) goto L_0x03ea
        L_0x03e9:
            r2 = 1
        L_0x03ea:
            r1 = 0
            if (r3 == 0) goto L_0x03ef
            r3.A0V = r1
        L_0x03ef:
            r6.A0g()
            if (r2 == 0) goto L_0x03fa
            X.1XY r0 = r7.A01
            r0.A06(r6, r1, r1)
            return
        L_0x03fa:
            X.0xM r1 = r7.A06
            r0 = -1
            r1.A0n(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35391ic.run():void");
    }
}
