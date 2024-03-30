package X;

/* renamed from: X.1iz  reason: invalid class name and case insensitive filesystem */
public class C35621iz implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35621iz(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x047e, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0481, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x050e, code lost:
        r1.A04(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0511, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x054a, code lost:
        r2.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x054d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05d7, code lost:
        r5.A02(r6, r7, r8, r9, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06f7, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06f8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0107, code lost:
        if (r4.A0B() == false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r72 = this;
            r5 = r72
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x072a;
                case 1: goto L_0x071e;
                case 2: goto L_0x0711;
                case 3: goto L_0x06fc;
                case 4: goto L_0x0822;
                case 5: goto L_0x0689;
                case 6: goto L_0x066a;
                case 7: goto L_0x034a;
                case 8: goto L_0x034a;
                case 9: goto L_0x0323;
                case 10: goto L_0x065e;
                case 11: goto L_0x0650;
                case 12: goto L_0x0644;
                case 13: goto L_0x0644;
                case 14: goto L_0x0630;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x05ed;
                case 19: goto L_0x0306;
                case 20: goto L_0x05dc;
                case 21: goto L_0x059f;
                case 22: goto L_0x02cb;
                case 23: goto L_0x0566;
                case 24: goto L_0x054e;
                case 25: goto L_0x051e;
                case 26: goto L_0x0512;
                case 27: goto L_0x029f;
                case 28: goto L_0x027f;
                case 29: goto L_0x0503;
                case 30: goto L_0x04f7;
                case 31: goto L_0x025e;
                case 32: goto L_0x04eb;
                case 33: goto L_0x022f;
                case 34: goto L_0x04c6;
                case 35: goto L_0x01d2;
                case 36: goto L_0x04b1;
                case 37: goto L_0x04a7;
                case 38: goto L_0x0498;
                case 39: goto L_0x0482;
                case 40: goto L_0x0194;
                case 41: goto L_0x0474;
                case 42: goto L_0x0460;
                case 43: goto L_0x043c;
                case 44: goto L_0x0431;
                case 45: goto L_0x03b2;
                case 46: goto L_0x0184;
                case 47: goto L_0x00a0;
                case 48: goto L_0x0015;
                case 49: goto L_0x03a1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r1 = r5.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Cf r0 = r0.A0W
            r0.A02(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r5.A00
            X.3B0 r3 = (X.AnonymousClass3B0) r3
            java.lang.Object r5 = r5.A01
            X.1NG r5 = (X.AnonymousClass1NG) r5
            r11 = 0
            r10 = 1
            com.whatsapp.jid.UserJid r9 = r3.A04
            X.AnonymousClass00C.A08(r9)
            X.0yC r2 = r5.A0G
            r1 = 2522(0x9da, float:3.534E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0014
            X.16D r0 = r5.A06
            X.141 r1 = r0.A0D(r9)
            X.2RD r4 = new X.2RD
            r4.<init>()
            java.lang.String r0 = r3.A07
            int r0 = X.C53352rB.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x009b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
        L_0x004f:
            r4.A04 = r0
            X.1C6 r0 = r5.A0I
            boolean r0 = r0.A0A(r9)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            X.3IL r1 = r1.A0F
            r0 = 0
            if (r1 == 0) goto L_0x0065
            r0 = 1
        L_0x0065:
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            X.1HK r3 = r5.A0C
            X.0wo r0 = r5.A09
            long r7 = X.C19970wo.A00(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r0 = r2.toMillis(r0)
            long r7 = r7 - r0
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]
            X.12j r0 = r3.A02
            long r0 = r0.A07(r9)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6[r11] = r0
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r6[r10] = r0
            X.12P r0 = r3.A04
            X.1M0 r3 = r0.get()
            goto L_0x0736
        L_0x009b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x004f
        L_0x00a0:
            java.lang.Object r6 = r5.A00
            X.3B0 r6 = (X.AnonymousClass3B0) r6
            java.lang.Object r7 = r5.A01
            X.1NG r7 = (X.AnonymousClass1NG) r7
            r5 = 1
            X.141 r4 = r6.A03
            boolean r0 = r6.A0A
            boolean r0 = r7.A0N(r4, r0)
            if (r0 == 0) goto L_0x0014
            java.util.List r0 = r6.A01
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "BlockListManager/should record message template blocks fieldstat, but messages not set!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x00bd:
            java.util.Iterator r9 = r0.iterator()
        L_0x00c1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r9.next()
            X.AnonymousClass00C.A08(r1)
            X.3GF r1 = (X.AnonymousClass3GF) r1
            X.2SS r3 = new X.2SS
            r3.<init>()
            java.lang.String r0 = r1.A01
            r3.A0A = r0
            java.lang.String r0 = r6.A08
            r8 = 0
            if (r0 == 0) goto L_0x0181
            int r0 = X.C65143Qx.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00e6:
            r3.A05 = r0
            java.lang.String r0 = r6.A07
            int r0 = X.C53352rB.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            java.lang.Long r0 = r1.A00
            r3.A07 = r0
            if (r4 == 0) goto L_0x0109
            boolean r1 = r4.A0B()
            r0 = 0
            if (r1 != 0) goto L_0x010a
        L_0x0109:
            r0 = 1
        L_0x010a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
            com.whatsapp.jid.UserJid r0 = r6.A04
            java.lang.String r0 = r0.user
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A08 = r0
            if (r4 == 0) goto L_0x017f
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A06(r0)
        L_0x0126:
            X.2nG r1 = r6.A02
            if (r0 != 0) goto L_0x016e
            r0 = 0
        L_0x012b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A01 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.0wo r0 = r7.A09
            long r0 = X.C19970wo.A00(r0)
            long r0 = r2.toSeconds(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A09 = r0
            X.0yC r2 = r7.A0G
            r1 = 4588(0x11ec, float:6.429E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0164
            java.lang.Integer r0 = r6.A06
            if (r0 == 0) goto L_0x0162
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L_0x0162:
            r3.A06 = r8
        L_0x0164:
            X.0yW r0 = r7.A0H
            r0.Bly(r3)
            r0.Bph(r5)
            goto L_0x00c1
        L_0x016e:
            X.2nG r0 = X.C51092nG.A02
            if (r1 != r0) goto L_0x017d
            X.0yC r2 = r7.A0G
            r1 = 4588(0x11ec, float:6.429E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            goto L_0x012b
        L_0x017d:
            r0 = 1
            goto L_0x012b
        L_0x017f:
            r0 = r8
            goto L_0x0126
        L_0x0181:
            r0 = r8
            goto L_0x00e6
        L_0x0184:
            java.lang.Object r0 = r5.A00
            X.1NP r0 = (X.AnonymousClass1NP) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1Cd r0 = r0.A02
            if (r0 == 0) goto L_0x0014
            r0.A01(r1)
            return
        L_0x0194:
            java.lang.Object r3 = r5.A00
            X.18Z r3 = (X.AnonymousClass18Z) r3
            java.lang.Object r7 = r5.A01
            android.content.Context r7 = (android.content.Context) r7
            X.0yC r2 = r3.A0F
            r0 = 7051(0x1b8b, float:9.88E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            r3.A08 = r0
            r0 = 2643(0xa53, float:3.704E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            r6 = 1
            r4 = 0
            if (r0 != 0) goto L_0x079f
            r0 = 6998(0x1b56, float:9.806E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0014
            X.2SP r2 = r3.A03
            if (r2 != 0) goto L_0x01c5
            X.2SP r2 = new X.2SP
            r2.<init>()
            r3.A03 = r2
        L_0x01c5:
            X.0yW r1 = r3.A0G
            r0 = 0
            java.lang.Integer r0 = r1.B3I(r2, r0, r4)
            r3.A06 = r0
            if (r0 == 0) goto L_0x0014
            goto L_0x079f
        L_0x01d2:
            java.lang.Object r1 = r5.A00
            X.1c2 r1 = (X.C31571c2) r1
            java.lang.Object r0 = r5.A01
            X.0wy r0 = (X.C20070wy) r0
            X.19g r6 = r1.A0B
            X.0x0 r8 = new X.0x0
            r8.<init>()
            X.0x0 r7 = new X.0x0
            r7.<init>()
            X.0y7 r0 = r0.entrySet()
            X.14x r5 = r0.iterator()
        L_0x01ee:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getValue()
            X.9WJ r3 = (X.AnonymousClass9WJ) r3
            java.lang.Object r2 = r4.getKey()
            long r0 = r3.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r8.put(r2, r1)
            com.whatsapp.jid.DeviceJid r0 = r3.A01
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r0 = r4.getKey()
            r7.put(r0, r1)
            goto L_0x01ee
        L_0x0219:
            X.0wy r0 = r8.build()
            r2 = 1
            r6.A0E(r0, r2, r2)
            X.0wy r1 = r7.build()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            r6.A0E(r1, r2, r2)
            return
        L_0x022f:
            java.lang.Object r3 = r5.A00
            X.1WQ r3 = (X.AnonymousClass1WQ) r3
            java.lang.Object r0 = r5.A01
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.decrementAndGet()
            if (r0 > 0) goto L_0x0014
            X.17Y r2 = r3.A02
            r1 = 2131888672(0x7f120a20, float:1.9411986E38)
            r0 = 1
            r2.A06(r1, r0)
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x024e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07f6
            java.lang.Object r0 = r1.next()
            X.1ZW r0 = (X.AnonymousClass1ZW) r0
            r0.Ba9()
            goto L_0x024e
        L_0x025e:
            java.lang.Object r3 = r5.A00
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x026a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.1Y2 r0 = r3.A0w
            r0.A01(r1)
            r0.A03(r1)
            goto L_0x026a
        L_0x027f:
            java.lang.Object r3 = r5.A00
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            java.lang.Object r0 = r5.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 44
            java.lang.String r1 = "starred"
            if (r0 == 0) goto L_0x07fc
            X.1BF r0 = r3.A10
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0014
            X.1YD r0 = r3.A1G
            r0.A02(r1, r2)
            return
        L_0x029f:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r1 = r5.A01
            X.3SC r1 = (X.AnonymousClass3SC) r1
            X.1Av r4 = r0.A04     // Catch:{ IOException -> 0x0803 }
            X.2bU r0 = r1.A01()     // Catch:{ IOException -> 0x0803 }
            X.3Qj r0 = r0.A01     // Catch:{ IOException -> 0x0803 }
            X.C18740tg.A06(r0)     // Catch:{ IOException -> 0x0803 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IOException -> 0x0803 }
            java.io.File r3 = r0.A0I     // Catch:{ IOException -> 0x0803 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A02     // Catch:{ IOException -> 0x0803 }
            int r2 = r0.size()     // Catch:{ IOException -> 0x0803 }
            r1 = 0
            X.0y0 r0 = r4.A00     // Catch:{ IOException -> 0x0803 }
            boolean r0 = r0.A0i(r3)     // Catch:{ IOException -> 0x0803 }
            if (r0 == 0) goto L_0x0014
            X.C24041Av.A01(r4, r3, r2, r1)     // Catch:{ IOException -> 0x0803 }
            goto L_0x0802
        L_0x02cb:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r6 = r5.A01
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            X.1Hr r3 = r0.A09
            X.3Qa r0 = r6.A1J
            X.11F r4 = r0.A00
            if (r4 == 0) goto L_0x0014
            X.1Hs r1 = r3.A01
            X.0wQ r0 = r1.A00
            boolean r0 = r0.A0L()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0014
            r2 = 0
            X.1Cv r1 = r1.A02
            r0 = 1
            java.util.ArrayList r1 = X.C24541Cv.A01(r1, r4, r0, r2, r2)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0304
            java.lang.Object r5 = r1.get(r2)
            X.3T1 r5 = (X.AnonymousClass3T1) r5
        L_0x02fd:
            int r7 = r6.A1I
            r8 = 1
            X.C25791Hr.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0304:
            r5 = 0
            goto L_0x02fd
        L_0x0306:
            java.lang.Object r4 = r5.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r1 = r5.A01
            X.147 r1 = (X.AnonymousClass147) r1
            X.1LV r0 = r4.A0C
            X.147 r3 = r0.A02(r1)
            if (r3 == 0) goto L_0x0014
            X.1YC r2 = r4.A0g
            X.12q r0 = r4.A0U
            int r1 = r0.A05(r1)
            r0 = 1
            r2.A00(r3, r1, r0)
            return
        L_0x0323:
            java.lang.Object r4 = r5.A00
            X.1Nv r4 = (X.C27341Nv) r4
            java.lang.Object r3 = r5.A01
            X.17Y r3 = (X.AnonymousClass17Y) r3
            java.util.Map r1 = r4.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            r1.clear()
            X.17Y r2 = r4.A00
            r1 = 45
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.Bp3(r0)
            r1 = 2131889558(0x7f120d96, float:1.9413783E38)
            r0 = 1
            r3.A06(r1, r0)
            return
        L_0x034a:
            java.lang.Object r4 = r5.A00
            X.0xL r4 = (X.C20300xL) r4
            java.lang.Object r7 = r5.A01
            X.5tq[] r7 = (X.C121865tq[]) r7
            X.18I r0 = r4.A0C
            X.79X r6 = r0.A07()
            X.189 r5 = r4.A0A     // Catch:{ all -> 0x0816 }
            if (r7 == 0) goto L_0x037e
            int r2 = r7.length     // Catch:{ all -> 0x0816 }
            if (r2 == 0) goto L_0x037e
            int[] r3 = new int[r2]     // Catch:{ all -> 0x0816 }
            r1 = 0
        L_0x0362:
            r0 = r7[r1]     // Catch:{ all -> 0x0816 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0816 }
            int r0 = X.C203239na.A00(r0)     // Catch:{ all -> 0x0816 }
            r3[r1] = r0     // Catch:{ all -> 0x0816 }
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0362
            X.18I r0 = r5.A0K     // Catch:{ all -> 0x0816 }
            X.79X r2 = r0.A07()     // Catch:{ all -> 0x0816 }
            X.18o r0 = r5.A09     // Catch:{ all -> 0x080a }
            r0.A03(r3)     // Catch:{ all -> 0x080a }
            if (r2 == 0) goto L_0x0387
            goto L_0x0384
        L_0x037e:
            java.lang.String r0 = "tried to mark an empty list of preKeys as sent to server"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0816 }
            goto L_0x0387
        L_0x0384:
            r2.close()     // Catch:{ all -> 0x0816 }
        L_0x0387:
            X.0v0 r1 = r4.A09     // Catch:{ all -> 0x0816 }
            boolean r0 = r1.A2Q()     // Catch:{ all -> 0x0816 }
            if (r0 == 0) goto L_0x0396
            r0 = 0
            r1.A26(r0)     // Catch:{ all -> 0x0816 }
            r1.A24(r0)     // Catch:{ all -> 0x0816 }
        L_0x0396:
            r0 = 0
            X.C20300xL.A01(r4, r0)     // Catch:{ all -> 0x0816 }
            if (r6 == 0) goto L_0x0014
            r6.close()
            return
        L_0x03a1:
            java.lang.Object r1 = r5.A00
            X.1NG r1 = (X.AnonymousClass1NG) r1
            java.lang.Object r0 = r5.A01
            java.util.Set r0 = java.util.Collections.singleton(r0)
            X.AnonymousClass00C.A08(r0)
            X.AnonymousClass1NG.A06(r1, r0)
            return
        L_0x03b2:
            java.lang.Object r0 = r5.A00
            X.1cL r0 = (X.C31761cL) r0
            java.lang.Object r2 = r5.A01
            X.3XD r2 = (X.AnonymousClass3XD) r2
            X.1cY r1 = r0.A0I
            java.lang.String r0 = "business activity report/notify-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1cX r0 = r1.A03
            r0.A03(r2)
            X.32u r0 = r1.A00
            if (r0 == 0) goto L_0x03d7
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            X.00s r1 = r0.A02
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0D(r0)
            return
        L_0x03d7:
            X.1Fq r3 = r1.A02
            X.0wG r0 = r1.A01
            android.content.Context r5 = r0.A00
            r0 = 2131892011(0x7f12172b, float:1.9418758E38)
            java.lang.String r2 = r5.getString(r0)
            X.0Yy r4 = X.C20600xp.A02(r5)
            java.lang.String r0 = "other_notifications@1"
            r4.A0M = r0
            r4.A0G(r2)
            long r0 = java.lang.System.currentTimeMillis()
            r4.A09(r0)
            r0 = 3
            r4.A06(r0)
            r0 = 1
            r4.A0I(r0)
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r0 = r5.getString(r0)
            r4.A0F(r0)
            r4.A0E(r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            r2.setClassName(r1, r0)
            r0 = 0
            android.app.PendingIntent r0 = X.C65743Th.A00(r5, r0, r2, r0)
            r4.A0D = r0
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r4.A0B
            r0.icon = r1
            android.app.Notification r1 = r4.A05()
            r0 = 32
            r3.A02(r0, r1)
            return
        L_0x0431:
            java.lang.Object r0 = r5.A00
            X.1cL r0 = (X.C31761cL) r0
            java.lang.Object r1 = r5.A01
            X.9uZ r1 = (X.C207109uZ) r1
            X.1Kc r0 = r0.A08
            goto L_0x047e
        L_0x043c:
            java.lang.Object r3 = r5.A00
            X.1VA r3 = (X.AnonymousClass1VA) r3
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.005 r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.6VE r0 = (X.AnonymousClass6VE) r0
            r0.A06(r1)
            X.005 r0 = r3.A03
            java.lang.Object r2 = r0.get()
            X.17Y r2 = (X.AnonymousClass17Y) r2
            r0 = 13
            X.1j4 r1 = new X.1j4
            r1.<init>(r3, r0)
            goto L_0x054a
        L_0x0460:
            java.lang.Object r0 = r5.A00
            X.1VA r0 = (X.AnonymousClass1VA) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.6MH r0 = (X.AnonymousClass6MH) r0
            r0.A01(r1)
            return
        L_0x0474:
            java.lang.Object r0 = r5.A00
            X.1KK r0 = (X.AnonymousClass1KK) r0
            java.lang.Object r1 = r5.A01
            X.9uZ r1 = (X.C207109uZ) r1
            X.1Kc r0 = r0.A02
        L_0x047e:
            r0.A00(r1)
            return
        L_0x0482:
            java.lang.Object r0 = r5.A00
            X.1fn r0 = (X.C33701fn) r0
            java.lang.Object r3 = r5.A01
            X.4On r3 = (X.C87374On) r3
            X.1eX r0 = r0.A03
            X.1bg r2 = r0.A01
            int r1 = r0.A00()
            X.8zX r0 = X.C188408zX.IMPRESSION
            r2.A00(r0, r3, r1)
            return
        L_0x0498:
            java.lang.Object r0 = r5.A01
            X.0xA r0 = (X.C20190xA) r0
            X.1D0 r2 = r0.A02
            java.lang.Object r1 = r5.A00
            X.6vi r1 = (X.C146506vi) r1
            r0 = 0
            r2.A0E(r1, r0)
            return
        L_0x04a7:
            java.lang.Object r1 = r5.A00
            X.1Hj r1 = (X.C25711Hj) r1
            java.lang.Object r0 = r5.A01
            r1.accept(r0)
            return
        L_0x04b1:
            java.lang.Object r4 = r5.A00
            X.1c2 r4 = (X.C31571c2) r4
            java.lang.Object r3 = r5.A01
            X.1c3 r0 = r4.A0I
            X.0wk r2 = r0.A00
            r1 = 35
            X.1iz r0 = new X.1iz
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
            return
        L_0x04c6:
            java.lang.Object r1 = r5.A00
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r1 = (com.whatsapp.accountswitching.AccountSwitchingContentProvider) r1
            java.lang.Object r3 = r5.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.19J r2 = r1.A00
            if (r2 == 0) goto L_0x04de
            r1 = 0
            X.5WV r0 = new X.5WV
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x04de:
            java.lang.String r0 = "xmppStateManager"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x04eb:
            java.lang.Object r1 = r5.A00
            X.14o r1 = (X.AnonymousClass14o) r1
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            r1.A2N(r0)
            return
        L_0x04f7:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r2 = r5.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1Hr r1 = r0.A09
            r0 = 4
            goto L_0x050e
        L_0x0503:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r2 = r5.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1Hr r1 = r0.A09
            r0 = 0
        L_0x050e:
            r1.A04(r2, r0)
            return
        L_0x0512:
            java.lang.Object r1 = r5.A00
            X.1X4 r1 = (X.AnonymousClass1X4) r1
            java.lang.Object r0 = r5.A01
            X.2bL r0 = (X.AnonymousClass2bL) r0
            r1.A0a(r0)
            return
        L_0x051e:
            java.lang.Object r4 = r5.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r3 = r5.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "UserActions/userActionViewViewOnceMessage/"
            r2.append(r0)
            long r0 = r3.A1N
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QI r0 = r4.A0d
            r0.A02(r3)
            X.17Y r2 = r4.A02
            r0 = 24
            X.1iz r1 = new X.1iz
            r1.<init>(r4, r3, r0)
        L_0x054a:
            r2.A0H(r1)
            return
        L_0x054e:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r3 = r5.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.16J r2 = r0.A0a
            X.3Qa r0 = r3.A1J
            boolean r1 = r0.A02
            r0 = 25
            if (r1 == 0) goto L_0x0562
            r0 = 9
        L_0x0562:
            r2.A05(r3, r0)
            return
        L_0x0566:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r4 = r5.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.1Dw r2 = r0.A0t
            X.1DW r3 = r0.A0h
            X.1AW r1 = r0.A18
            X.1EO r0 = r0.A19
            int r7 = X.C55802vD.A00(r3, r4, r1, r0)
            int r9 = X.C203229nZ.A02(r4)
            monitor-enter(r2)
            long r10 = X.C24811Dw.A01(r2)     // Catch:{ all -> 0x06f9 }
            int r8 = X.C24811Dw.A00(r2)     // Catch:{ all -> 0x06f9 }
            X.1E0 r5 = r2.A01     // Catch:{ all -> 0x06f9 }
            r12 = 0
            r19 = 0
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            X.9iZ r6 = r13.A01(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x06f9 }
            long r0 = r6.A06     // Catch:{ all -> 0x06f9 }
            r3 = 1
            long r0 = r0 + r3
            r6.A06 = r0     // Catch:{ all -> 0x06f9 }
            goto L_0x05d7
        L_0x059f:
            java.lang.Object r0 = r5.A00
            X.1X4 r0 = (X.AnonymousClass1X4) r0
            java.lang.Object r4 = r5.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.1Dw r2 = r0.A0t
            X.1DW r3 = r0.A0h
            X.1AW r1 = r0.A18
            X.1EO r0 = r0.A19
            int r7 = X.C55802vD.A00(r3, r4, r1, r0)
            int r9 = X.C203229nZ.A02(r4)
            monitor-enter(r2)
            long r10 = X.C24811Dw.A01(r2)     // Catch:{ all -> 0x06f9 }
            int r8 = X.C24811Dw.A00(r2)     // Catch:{ all -> 0x06f9 }
            X.1E0 r5 = r2.A01     // Catch:{ all -> 0x06f9 }
            r12 = 0
            r19 = 0
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            X.9iZ r6 = r13.A01(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x06f9 }
            long r0 = r6.A03     // Catch:{ all -> 0x06f9 }
            r3 = 1
            long r0 = r0 + r3
            r6.A03 = r0     // Catch:{ all -> 0x06f9 }
        L_0x05d7:
            r5.A02(r6, r7, r8, r9, r10, r12)     // Catch:{ all -> 0x06f9 }
            goto L_0x06f7
        L_0x05dc:
            java.lang.Object r1 = r5.A00
            X.1X4 r1 = (X.AnonymousClass1X4) r1
            java.lang.Object r0 = r5.A01
            X.1Hr r2 = r1.A09
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 1
            r2.A04(r1, r0)
            return
        L_0x05ed:
            java.lang.Object r3 = r5.A00
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            java.lang.Object r6 = r5.A01
            X.13w r6 = (X.C223313w) r6
            X.196 r2 = r3.A0D
            X.1AE r1 = r2.A0T
            java.lang.String r0 = "shareOwnPn"
            X.1LZ r1 = r1.A00(r0)
            X.8Y9 r1 = (X.AnonymousClass8Y9) r1
            if (r1 == 0) goto L_0x062b
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L_0x062b
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.0wo r0 = r1.A00
            long r8 = X.C19970wo.A00(r0)
            r5 = 0
            X.8bS r4 = new X.8bS
            r7 = r5
            r4.<init>(r5, r6, r7, r8)
            java.util.Set r0 = java.util.Collections.singleton(r4)
            java.util.Set r1 = r2.A0C(r0)
        L_0x0622:
            X.1FV r0 = r3.A0e
            r0.A08(r6)
            r2.A0Q(r1)
            return
        L_0x062b:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0622
        L_0x0630:
            java.lang.Object r2 = r5.A00
            X.1Lt r2 = (X.C26851Lt) r2
            java.lang.Object r0 = r5.A01
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            X.16D r0 = r2.A02
            r0.A0m(r1)
            return
        L_0x0644:
            java.lang.Object r1 = r5.A00
            X.4UL r1 = (X.AnonymousClass4UL) r1
            java.lang.Object r0 = r5.A01
            android.net.Uri r0 = (android.net.Uri) r0
            r1.Bk1(r0)
            return
        L_0x0650:
            java.lang.Object r0 = r5.A00
            X.1XY r0 = (X.AnonymousClass1XY) r0
            java.lang.Object r1 = r5.A01
            X.1YJ r1 = (X.AnonymousClass1YJ) r1
            X.1YI r0 = r0.A0G
            r0.A02(r1)
            return
        L_0x065e:
            java.lang.Object r1 = r5.A00
            com.whatsapp.SecondaryProcessAbstractAppShellDelegate r1 = (com.whatsapp.SecondaryProcessAbstractAppShellDelegate) r1
            java.lang.Object r0 = r5.A01
            X.0tp r0 = (X.C18790tp) r0
            r1.m5lambda$onCreate$0$comwhatsappSecondaryProcessAbstractAppShellDelegate(r0)
            return
        L_0x066a:
            java.lang.Object r0 = r5.A00
            X.1DT r0 = (X.AnonymousClass1DT) r0
            java.lang.Object r1 = r5.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.1Dw r3 = r0.A0J
            X.1E3 r0 = r0.A06
            X.3KT r2 = r0.A01(r1)
            monitor-enter(r3)
            int r1 = X.C24811Dw.A00(r3)     // Catch:{ all -> 0x0686 }
            X.1Dz r0 = r3.A02     // Catch:{ all -> 0x0686 }
            r0.A01(r2, r1)     // Catch:{ all -> 0x0686 }
            monitor-exit(r3)
            return
        L_0x0686:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0689:
            java.lang.Object r0 = r5.A00
            X.1DT r0 = (X.AnonymousClass1DT) r0
            java.lang.Object r1 = r5.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.1Dw r2 = r0.A0J
            X.1E3 r0 = r0.A06
            X.3JD r4 = r0.A00(r1)
            monitor-enter(r2)
            X.1Dz r0 = r2.A02     // Catch:{ all -> 0x06f9 }
            X.1Dx r3 = r0.A01     // Catch:{ all -> 0x06f9 }
            X.3S8 r1 = r3.A01()     // Catch:{ all -> 0x06f9 }
            int r0 = r4.A00     // Catch:{ all -> 0x06f9 }
            X.3S8 r6 = X.C24841Dz.A00(r1, r4, r0)     // Catch:{ all -> 0x06f9 }
            r8 = 0
            long r0 = r6.A0P     // Catch:{ all -> 0x06f9 }
            r4 = 1
            long r0 = r0 + r4
            r7 = -4194305(0xffffffffffbfffff, float:NaN)
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r52 = r0
            X.3S8 r0 = X.AnonymousClass3S8.A00(r6, r7, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70)     // Catch:{ all -> 0x06f9 }
            r3.A03(r0)     // Catch:{ all -> 0x06f9 }
        L_0x06f7:
            monitor-exit(r2)
            return
        L_0x06f9:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x06fc:
            java.lang.Object r3 = r5.A00
            X.1R8 r3 = (X.AnonymousClass1R8) r3
            java.lang.Object r2 = r5.A01
            android.view.animation.Animation r2 = (android.view.animation.Animation) r2
            android.widget.TextView r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r0 = r3.A01
            r0.startAnimation(r2)
            return
        L_0x0711:
            java.lang.Object r2 = r5.A00
            X.14u r2 = (X.C225314u) r2
            java.lang.Object r1 = r5.A01
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 0
            r2.A33(r1, r0)
            return
        L_0x071e:
            java.lang.Object r1 = r5.A00
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r5.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.C225314u.A0W(r0, r1)
            return
        L_0x072a:
            java.lang.Object r1 = r5.A00
            X.1A2 r1 = (X.AnonymousClass1A2) r1
            java.lang.Object r0 = r5.A01
            X.0to r0 = (X.C18780to) r0
            com.whatsapp.AbstractAppShellDelegate.lambda$queueAsyncInit$6(r1, r0)
            return
        L_0x0736:
            X.14e r2 = r3.A02     // Catch:{ all -> 0x079a }
            java.lang.String r1 = "SELECT call_result FROM call_log WHERE jid_row_id = ? AND from_me = 0 AND timestamp >= ? ORDER BY timestamp DESC LIMIT 1"
            java.lang.String r0 = "GET_MOST_RECENT_CALL_RESULT_BY_JID_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r6)     // Catch:{ all -> 0x079a }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x078e }
            if (r0 == 0) goto L_0x077c
            java.lang.String r0 = "call_result"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x078e }
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x078e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x078e }
            r2.close()     // Catch:{ all -> 0x079a }
            r3.close()
            if (r0 == 0) goto L_0x0782
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r4.A02 = r0
            r0 = 0
            switch(r1) {
                case 1: goto L_0x076d;
                case 2: goto L_0x0770;
                case 3: goto L_0x0772;
                case 4: goto L_0x0775;
                case 5: goto L_0x0777;
                case 6: goto L_0x0779;
                default: goto L_0x0766;
            }
        L_0x0766:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            goto L_0x0788
        L_0x076d:
            r0 = 18
            goto L_0x0766
        L_0x0770:
            r0 = 4
            goto L_0x0766
        L_0x0772:
            r0 = 17
            goto L_0x0766
        L_0x0775:
            r0 = 2
            goto L_0x0766
        L_0x0777:
            r0 = 1
            goto L_0x0766
        L_0x0779:
            r0 = 22
            goto L_0x0766
        L_0x077c:
            r2.close()     // Catch:{ all -> 0x079a }
            r3.close()
        L_0x0782:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r4.A02 = r0
        L_0x0788:
            X.0yW r0 = r5.A0H
            r0.Bly(r4)
            return
        L_0x078e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0799
            r2.close()     // Catch:{ all -> 0x0795 }
            goto L_0x0799
        L_0x0795:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x079a }
        L_0x0799:
            throw r1     // Catch:{ all -> 0x079a }
        L_0x079a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x081d }
            throw r1
        L_0x079f:
            X.9Bq r5 = new X.9Bq     // Catch:{ Exception -> 0x07e2 }
            r5.<init>()     // Catch:{ Exception -> 0x07e2 }
            java.lang.Class<X.83M> r1 = X.AnonymousClass83M.class
            X.83Q r0 = new X.83Q     // Catch:{ Exception -> 0x07e2 }
            r0.<init>()     // Catch:{ Exception -> 0x07e2 }
            X.007 r2 = r5.A00     // Catch:{ Exception -> 0x07e2 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x07e2 }
            java.lang.Class<X.83O> r1 = X.AnonymousClass83O.class
            X.83S r0 = new X.83S     // Catch:{ Exception -> 0x07e2 }
            r0.<init>()     // Catch:{ Exception -> 0x07e2 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x07e2 }
            java.lang.Class<X.83N> r1 = X.AnonymousClass83N.class
            X.83T r0 = new X.83T     // Catch:{ Exception -> 0x07e2 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x07e2 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x07e2 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x07e2 }
            r3.A00 = r0     // Catch:{ Exception -> 0x07e2 }
            r3.A09 = r6     // Catch:{ Exception -> 0x07e2 }
            X.2Qc r0 = new X.2Qc     // Catch:{ Exception -> 0x07e2 }
            r0.<init>()     // Catch:{ Exception -> 0x07e2 }
            r3.A04 = r0     // Catch:{ Exception -> 0x07e2 }
            X.83R r1 = new X.83R     // Catch:{ Exception -> 0x07e2 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x07e2 }
            r3.A01 = r1     // Catch:{ Exception -> 0x07e2 }
            X.9MG r0 = new X.9MG     // Catch:{ Exception -> 0x07e2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x07e2 }
            r3.A02 = r0     // Catch:{ Exception -> 0x07e2 }
            return
        L_0x07e2:
            r0 = move-exception
            X.0wN r2 = r3.A0B
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "BatteryMetrics/initializeAsync/exception"
            r2.A0E(r0, r1, r4)
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A09 = r4
            return
        L_0x07f6:
            java.lang.String r0 = "deleteacctconfirm/deletion-complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x07fc:
            X.1YD r0 = r3.A1G
            r0.A03(r1, r2)
            return
        L_0x0802:
            return
        L_0x0803:
            r1 = move-exception
            java.lang.String r0 = "UserActions/userActionSendMediaMessages/addManagedFileReferencesIfExternalShared"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x080a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0815
            r2.close()     // Catch:{ all -> 0x0811 }
            goto L_0x0815
        L_0x0811:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0816 }
        L_0x0815:
            throw r1     // Catch:{ all -> 0x0816 }
        L_0x0816:
            r1 = move-exception
            if (r6 == 0) goto L_0x0832
            r6.close()     // Catch:{ all -> 0x081d }
            throw r1
        L_0x081d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0822:
            java.lang.Object r0 = r5.A00
            X.1DT r0 = (X.AnonymousClass1DT) r0
            X.0v5 r0 = r0.A01
            r0.A02()
            java.lang.String r0 = "logMessageSendSuccessAction"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
        L_0x0832:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35621iz.run():void");
    }
}
