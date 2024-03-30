package X;

import java.util.Map;

/* renamed from: X.8oZ  reason: invalid class name and case insensitive filesystem */
public class C182118oZ extends C195969Wz {
    public final C19700wN A00;
    public final AnonymousClass19L A01;
    public final AnonymousClass1W5 A02;
    public final Map A03;
    public final C193399Lh A04;

    public C182118oZ(C19700wN r7, C193399Lh r8, C20810yC r9, C21010yW r10, C199709fp r11, AnonymousClass19L r12, AnonymousClass1W5 r13, Map map, Map map2) {
        super(r7, r9, r10, r11, map);
        this.A00 = r7;
        this.A01 = r12;
        this.A02 = r13;
        this.A04 = r8;
        this.A03 = map2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0293, code lost:
        if (r8.intValue() != 2) goto L_0x0295;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C203399nx r25) {
        /*
            r24 = this;
            java.lang.String r0 = "stream:error"
            r4 = r25
            boolean r0 = X.C203399nx.A0I(r4, r0)
            r2 = r24
            if (r0 == 0) goto L_0x0032
            X.9Lh r6 = r2.A04
            X.13g r0 = r6.A02
            boolean r0 = r0.A02()
            r8 = 0
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "code"
            int r1 = r4.A0S(r0, r3)     // Catch:{ 19b -> 0x0086 }
            r0 = 515(0x203, float:7.22E-43)
            if (r1 == r0) goto L_0x002a
            r0 = 516(0x204, float:7.23E-43)
            if (r1 != r0) goto L_0x005d
            r1 = 245(0xf5, float:3.43E-43)
            goto L_0x002c
        L_0x002a:
            r1 = 244(0xf4, float:3.42E-43)
        L_0x002c:
            X.9fp r0 = r6.A03     // Catch:{ 19b -> 0x0086 }
            r0.A01(r4, r8, r1)     // Catch:{ 19b -> 0x0086 }
            return
        L_0x0032:
            java.lang.String r0 = "error"
            boolean r0 = X.C203399nx.A0I(r4, r0)
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "code"
            r3 = 0
            java.lang.String r1 = r4.A0i(r0, r3)
            java.lang.String r0 = "479"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0085
            X.9fp r1 = r2.A04
            java.lang.String r0 = "ConnectionThreadRequestsImpl/smax/invalid"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.Ayz r2 = r1.A00
            r1 = 0
            r0 = 237(0xed, float:3.32E-43)
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r0, r1)
            r2.Bkm(r0)
            return
        L_0x005d:
            X.0wQ r0 = r6.A00
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "conflict"
            X.9nx r1 = r4.A0c(r0)
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = "type"
            java.lang.String r1 = r1.A0i(r0, r8)
            java.lang.String r0 = "device_removed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "CompanionXmppReadInterceptorImpl/handleStreamError deregister"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Ih r0 = r6.A01
            r0.A01(r8, r3, r5)
        L_0x0085:
            return
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = "CompanionConnectionInterceptor/handleStreamError"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008c:
            java.lang.String r0 = "ack"
            X.9nx r1 = r4.A0c(r0)
            if (r1 == 0) goto L_0x0255
            java.lang.String r0 = "id"
            java.lang.String r9 = r4.A0i(r0, r8)
            java.lang.String r0 = r1.A0i(r0, r8)
            if (r9 != 0) goto L_0x00a1
            r9 = r0
        L_0x00a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ErrorStanzaHandler/received ack-kick id="
            X.C36321k7.A1R(r0, r9, r1)
            X.8cG r7 = new X.8cG
            r7.<init>()
            X.19L r3 = r2.A01
            monitor-enter(r3)
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int[] r12 = r3.A05     // Catch:{ all -> 0x023a }
            r11 = 4
            r10 = 0
            r20 = 0
            r18 = 0
            r16 = 0
        L_0x00c1:
            r0 = r12[r10]     // Catch:{ all -> 0x023a }
            java.util.Map r1 = r3.A02(r0)     // Catch:{ all -> 0x023a }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r0.<init>(r1)     // Catch:{ all -> 0x023a }
            java.util.Iterator r15 = X.C36371kC.A10(r0)     // Catch:{ all -> 0x023a }
        L_0x00d0:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x0110
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r15)     // Catch:{ all -> 0x023a }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x023a }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x023a }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x023a }
            X.9ju r1 = (X.C201579ju) r1     // Catch:{ all -> 0x023a }
            if (r1 == 0) goto L_0x00d0
            r13 = 1
            long r20 = r20 + r13
            java.lang.Integer r0 = r1.A07     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x00f8
            int r0 = r0.intValue()     // Catch:{ all -> 0x023a }
            if (r0 <= 0) goto L_0x00f8
            long r18 = r18 + r13
        L_0x00f8:
            if (r9 == 0) goto L_0x00d0
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x023a }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x00d0
            long r16 = r16 + r13
            long r5 = r5.longValue()     // Catch:{ all -> 0x023a }
            int r0 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d0
            r22 = r5
            r8 = r1
            goto L_0x00d0
        L_0x0110:
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x00c1
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x023a }
            r7.A05 = r0     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x023a }
            r7.A04 = r0     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x023a }
            r7.A07 = r0     // Catch:{ all -> 0x023a }
            if (r8 == 0) goto L_0x01b7
            int r0 = r8.A02     // Catch:{ all -> 0x023a }
            java.util.Map r0 = r3.A02(r0)     // Catch:{ all -> 0x023a }
            int r0 = r0.size()     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x023a }
            r7.A06 = r0     // Catch:{ all -> 0x023a }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x023a }
            long r0 = r8.A04     // Catch:{ all -> 0x023a }
            java.lang.Long r0 = X.C90504aG.A0h(r5, r0)     // Catch:{ all -> 0x023a }
            r7.A09 = r0     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = r8.A07     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x014e
            java.lang.Long r0 = X.C90484aE.A0h(r0)     // Catch:{ all -> 0x023a }
            r7.A08 = r0     // Catch:{ all -> 0x023a }
        L_0x014e:
            boolean r0 = r8 instanceof X.C177818eQ     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x0167
            X.8eQ r8 = (X.C177818eQ) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x023a }
            r7.A03 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A06     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r7.A02 = r0     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r8.A08     // Catch:{ all -> 0x023a }
            r7.A0B = r0     // Catch:{ all -> 0x023a }
            goto L_0x01b7
        L_0x0167:
            boolean r0 = r8 instanceof X.C177798eO     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x018a
            X.8eO r8 = (X.C177798eO) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C36371kC.A0o()     // Catch:{ all -> 0x023a }
            r7.A03 = r0     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x023a }
            r1.append(r0)     // Catch:{ all -> 0x023a }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r8.A00     // Catch:{ all -> 0x023a }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x023a }
            r7.A0A = r0     // Catch:{ all -> 0x023a }
            goto L_0x01b7
        L_0x018a:
            boolean r0 = r8 instanceof X.C177808eP     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x01a7
            X.8eP r8 = (X.C177808eP) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C36361kB.A0i()     // Catch:{ all -> 0x023a }
            r7.A03 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A00     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r7.A01 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A03     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r7.A02 = r0     // Catch:{ all -> 0x023a }
            goto L_0x01b7
        L_0x01a7:
            X.8eR r8 = (X.C177828eR) r8     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ all -> 0x023a }
            r7.A03 = r0     // Catch:{ all -> 0x023a }
            int r0 = r8.A00     // Catch:{ all -> 0x023a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023a }
            r7.A00 = r0     // Catch:{ all -> 0x023a }
        L_0x01b7:
            monitor-exit(r3)
            X.0yW r0 = r2.A03
            r0.Blw(r7)
            X.1W5 r5 = r2.A02
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A01 = r0
            if (r9 == 0) goto L_0x0255
            java.lang.Integer r8 = r7.A03
            if (r8 == 0) goto L_0x023d
            int r1 = r8.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x023d
            r12 = 0
            java.util.HashSet r6 = X.C36441kJ.A16()
            monitor-enter(r3)
            java.util.Map r7 = r3.A04     // Catch:{ all -> 0x023a }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r0.<init>(r7)     // Catch:{ all -> 0x023a }
            monitor-exit(r3)
            java.util.Iterator r5 = X.C36391kE.A10(r0)
        L_0x01e4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0200
            java.lang.Object r1 = r5.next()
            X.8eQ r1 = (X.C177818eQ) r1
            java.lang.String r0 = r1.A09
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01e4
            java.util.Set r0 = r1.A04
            if (r0 == 0) goto L_0x01e4
            r6.addAll(r0)
            goto L_0x01e4
        L_0x0200:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0207
            r6 = r12
        L_0x0207:
            monitor-enter(r3)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r0.<init>(r7)     // Catch:{ all -> 0x023a }
            monitor-exit(r3)
            java.util.Iterator r13 = X.C36391kE.A10(r0)
            r5 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0218:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0235
            java.lang.Object r7 = r13.next()
            X.8eQ r7 = (X.C177818eQ) r7
            long r0 = r7.A03
            java.lang.String r3 = r7.A09
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0218
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0218
            r12 = r7
            r10 = r0
            goto L_0x0218
        L_0x0235:
            if (r12 == 0) goto L_0x023f
            java.lang.String r5 = r12.A03
            goto L_0x023f
        L_0x023a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x023d:
            r5 = 0
            r6 = r5
        L_0x023f:
            java.util.Map r10 = r2.A03
            boolean r0 = r10.containsKey(r9)
            if (r0 != 0) goto L_0x0282
            boolean r0 = r10.containsKey(r5)
            if (r0 != 0) goto L_0x0282
            r10.put(r9, r6)
            if (r5 == 0) goto L_0x0255
            r10.put(r5, r6)
        L_0x0255:
            X.9fp r3 = r2.A04
            X.9nx[] r1 = r4.A02
            r5 = 0
            if (r1 == 0) goto L_0x027f
            int r0 = r1.length
            if (r0 <= 0) goto L_0x027f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/stream/error "
            r2.append(r0)
            r1 = r1[r5]
            java.lang.String r0 = r1.A00
            r2.append(r0)
            X.C36421kH.A1N(r2)
            byte[] r0 = r1.A01
            X.C90474aD.A1O(r2, r0)
            java.lang.String r0 = r2.toString()
        L_0x027b:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02e6
        L_0x027f:
            java.lang.String r0 = "ConnectionThreadRequestsImpl/stream/error"
            goto L_0x027b
        L_0x0282:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ErrorStanzaHandler/received multiple ack-kick for id="
            X.C36321k7.A1R(r0, r9, r1)
            if (r8 == 0) goto L_0x0295
            int r3 = r8.intValue()
            r1 = 2
            r0 = 1
            if (r3 == r1) goto L_0x0296
        L_0x0295:
            r0 = 0
        L_0x0296:
            r7 = 0
            if (r0 == 0) goto L_0x02a6
            if (r5 == 0) goto L_0x029c
            r9 = r5
        L_0x029c:
            java.lang.Object r0 = r10.put(r9, r6)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r6 != 0) goto L_0x02d7
            if (r0 != 0) goto L_0x02e3
        L_0x02a6:
            java.lang.String r0 = "multi-kick-"
        L_0x02a8:
            X.0wN r6 = r2.A00
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r0)
            java.lang.String r3 = "unknown"
            if (r8 == 0) goto L_0x02bb
            int r1 = r8.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x02c5
            java.lang.String r3 = "message"
        L_0x02bb:
            java.lang.String r1 = X.AnonymousClass000.A0q(r3, r5)
            java.lang.String r0 = "unacked-stanza"
            r6.A0E(r0, r1, r7)
            goto L_0x0255
        L_0x02c5:
            r0 = 2
            if (r1 != r0) goto L_0x02cb
            java.lang.String r3 = "receipt"
            goto L_0x02bb
        L_0x02cb:
            r0 = 4
            if (r1 != r0) goto L_0x02d1
            java.lang.String r3 = "notification"
            goto L_0x02bb
        L_0x02d1:
            r0 = 3
            if (r1 != r0) goto L_0x02bb
            java.lang.String r3 = "call"
            goto L_0x02bb
        L_0x02d7:
            if (r0 == 0) goto L_0x02e3
            boolean r0 = java.util.Collections.disjoint(r6, r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02a6
        L_0x02e3:
            java.lang.String r0 = "multi-kick-fp-"
            goto L_0x02a8
        L_0x02e6:
            java.lang.String r0 = "code"
            int r4 = r4.A0S(r0, r5)     // Catch:{ 19b -> 0x0302 }
            X.Ayz r3 = r3.A00     // Catch:{ 19b -> 0x0302 }
            r1 = 0
            r0 = 158(0x9e, float:2.21E-43)
            android.os.Message r2 = android.os.Message.obtain(r1, r5, r0, r5)     // Catch:{ 19b -> 0x0302 }
            android.os.Bundle r1 = r2.getData()     // Catch:{ 19b -> 0x0302 }
            java.lang.String r0 = "errorCode"
            r1.putInt(r0, r4)     // Catch:{ 19b -> 0x0302 }
            r3.Bkm(r2)     // Catch:{ 19b -> 0x0302 }
            return
        L_0x0302:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182118oZ.A01(X.9nx):void");
    }
}
