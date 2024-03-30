package X;

public class AW0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public final int A08;

    public AW0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, int i) {
        this.A08 = i;
        this.A00 = obj;
        this.A06 = str;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A07 = str2;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.9nx[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r6 = r20
            int r0 = r6.A08
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r6.A01
            X.9nx r5 = (X.C203399nx) r5
            java.lang.Object r1 = r6.A02
            X.33b r1 = (X.C592133b) r1
            java.lang.Object r9 = r6.A03
            X.9oR r9 = (X.C203639oR) r9
            java.lang.String r4 = r6.A07
            java.lang.Object r2 = r6.A04
            java.lang.Object r3 = r6.A05
            X.7jg r3 = (X.C159637jg) r3
            r7 = 0
            r0 = 3
            X.AnonymousClass00C.A0D(r1, r0)
            X.9nx r1 = X.C90514aH.A0e(r5, r1)
            X.ALD r0 = X.ALD.A00
            java.lang.Object r8 = X.C203539oF.A01(r5, r0)
            X.8s9 r8 = (X.C184258s9) r8
            r0 = 32
        L_0x002e:
            X.C203539oF.A0A(r1, r5, r0)
            X.AnonymousClass00C.A08(r8)
            java.util.Map r1 = r9.A0G
            java.util.Map r0 = r9.A0F
            java.lang.Object r0 = r0.get(r4)
            java.lang.Object r4 = r1.get(r0)
            X.5qk r4 = (X.C119965qk) r4
            if (r4 == 0) goto L_0x00a0
            java.lang.Object r0 = r8.A00
            long r0 = X.C36431kI.A09(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.AnonymousClass00C.A0D(r1, r7)
            X.6PS r0 = r4.A01
            java.lang.String r6 = r0.A03(r1)
        L_0x0057:
            java.lang.Object r0 = r8.A00
            long r0 = X.C165587tf.A0B(r0)
            r5 = 0
            X.6Bf r4 = new X.6Bf
            r4.<init>(r6, r5, r0)
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x007e
            X.A7n r5 = X.C200759iB.A01(r0)
            X.AyE[] r1 = new X.C22902AyE[r7]
            java.lang.String r0 = "$"
            java.lang.Object r6 = r5.Bmq(r0, r1)
            java.util.Map r6 = (java.util.Map) r6
            long r0 = r4.A00
            java.lang.String r5 = r4.A01
            X.6Bf r4 = new X.6Bf
            r4.<init>(r5, r6, r0)
        L_0x007e:
            int r13 = r2.hashCode()
            java.lang.String r11 = "iqResponse"
            long r0 = r4.A00
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            X.5Fp r8 = r9.A04
            java.lang.String r12 = "error_code"
            X.C203639oR.A03(r8, r9, r10, r11, r12, r13)
            int r2 = r2.hashCode()
            r1 = 467(0x1d3, float:6.54E-43)
            X.0zf r0 = r8.A01
            r0.A04(r2, r1)
            r3.BXW(r4)
            return
        L_0x00a0:
            r6 = 0
            goto L_0x0057
        L_0x00a2:
            java.lang.Object r5 = r6.A01
            X.9nx r5 = (X.C203399nx) r5
            java.lang.Object r1 = r6.A02
            X.33b r1 = (X.C592133b) r1
            java.lang.Object r9 = r6.A03
            X.9oR r9 = (X.C203639oR) r9
            java.lang.String r4 = r6.A07
            java.lang.Object r2 = r6.A04
            java.lang.Object r3 = r6.A05
            X.7jg r3 = (X.C159637jg) r3
            r7 = 0
            r0 = 3
            X.AnonymousClass00C.A0D(r1, r0)
            X.9nx r1 = X.C90514aH.A0e(r5, r1)
            X.AKu r0 = X.C21420AKu.A00
            java.lang.Object r8 = X.C203539oF.A01(r5, r0)
            X.8s9 r8 = (X.C184258s9) r8
            r0 = 30
            goto L_0x002e
        L_0x00cb:
            java.lang.Object r10 = r6.A00
            X.8gI r10 = (X.AnonymousClass8gI) r10
            java.lang.String r7 = r6.A06
            java.lang.Object r5 = r6.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r3 = r6.A02
            X.16X r3 = (X.AnonymousClass16X) r3
            java.lang.String r2 = r6.A07
            java.lang.Object r11 = r6.A03
            X.9fB r11 = (X.C199359fB) r11
            java.lang.Object r12 = r6.A04
            X.9FL r12 = (X.AnonymousClass9FL) r12
            java.lang.Object r6 = r6.A05
            java.lang.String r0 = "PAY: IndiaUpiPayPrecheckAction sendPrecheck called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "action"
            java.lang.String r4 = "pay-precheck"
            X.C36381kD.A1M(r0, r4, r8)
            X.9l8 r0 = X.C202159l8.A0E
            java.lang.String r1 = "IN"
            java.lang.String r0 = "country"
            X.C36381kD.A1M(r0, r1, r8)
            java.lang.String r0 = "credential-id"
            X.C36381kD.A1M(r0, r7, r8)
            if (r5 == 0) goto L_0x0114
            X.0yC r1 = r10.A06
            X.12O r0 = r10.A04
            com.whatsapp.jid.UserJid r1 = X.C111255bz.A00(r0, r1, r5)
            if (r1 == 0) goto L_0x0114
            java.lang.String r0 = "receiver"
            X.C165577te.A16(r1, r0, r8)
        L_0x0114:
            java.lang.String r0 = "version"
            r5 = 1
            X.C165587tf.A1N(r0, r8, r5)
            X.0wo r1 = r10.A03
            X.0wQ r0 = r10.A02
            java.lang.String r1 = X.C237919w.A00(r0, r1)
            java.lang.String r0 = "nonce"
            X.C36381kD.A1M(r0, r1, r8)
            X.1Vl r0 = r10.A0D
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C36381kD.A1M(r0, r1, r8)
            java.lang.String r0 = "transaction-type"
            X.C36381kD.A1M(r0, r2, r8)
            if (r11 == 0) goto L_0x0140
            long r0 = r11.A01
            java.lang.String r2 = "offer_id"
            X.C165597tg.A1I(r2, r8, r0)
        L_0x0140:
            r7 = 0
            if (r3 == 0) goto L_0x014d
            X.1Vk r2 = r10.A09
            X.16U r1 = X.AnonymousClass16W.A05
            java.lang.String r0 = "amount"
            X.9nx r7 = r2.A05(r1, r3, r0)
        L_0x014d:
            X.9YX r9 = X.AnonymousClass9I1.A04(r10, r4)
            r3 = 0
            X.1AL[] r2 = X.C165577te.A1a(r8, r3)
            r0 = 2
            X.9nx[] r1 = new X.C203399nx[r0]
            r1[r3] = r6
            r1[r5] = r7
            java.lang.String r0 = "account"
            X.9nx r16 = X.C203399nx.A05(r0, r2, r1)
            X.5GM r0 = r10.A0C
            X.6AT r0 = r0.A02
            java.lang.Integer r13 = r0.A00(r4)
            X.1Vk r14 = r10.A09
            android.content.Context r6 = r10.A00
            X.17Y r7 = r10.A01
            X.1Vu r8 = r10.A08
            X.B7N r5 = new X.B7N
            r5.<init>((android.content.Context) r6, (X.AnonymousClass17Y) r7, (X.C29221Vu) r8, (X.AnonymousClass9YX) r9, (X.AnonymousClass8gI) r10, (X.C199359fB) r11, (X.AnonymousClass9FL) r12, (java.lang.Integer) r13)
            java.lang.String r17 = "set"
            r18 = 30000(0x7530, double:1.4822E-319)
            r15 = r5
            r14.A0H(r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AW0.run():void");
    }
}
